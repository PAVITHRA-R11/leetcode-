int largestRectangleArea(int* heights, int heightsSize) {
    
    int st[heightsSize+1], top=0;     
    int ts;                         
    int max_area = 0;                       
    int new_area;                    
    int i = 0;
    
	while (i < heightsSize)       
    {        
        if ((top == 0) || heights[st[top-1]] <= heights[i])  
            { st[top]=i++; top++;} 
 
        else   
        {
            ts = st[--top];             
             
            if(top>0) new_area = heights[ts] * (i - st[top-1] - 1);   
            else new_area = heights[ts] * i;
            
            if (max_area < new_area) max_area = new_area;               
        }      
        
    }
 
    while (top>0)
    {
        ts = st[--top];
        
        if(top>0) new_area = heights[ts] * (i - st[top-1] - 1);   
            else new_area = heights[ts] * i;
 
        if (max_area < new_area) max_area = new_area;
    }
    return max_area;   
    }
