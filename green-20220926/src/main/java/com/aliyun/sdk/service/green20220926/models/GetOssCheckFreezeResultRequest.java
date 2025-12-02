// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOssCheckFreezeResultRequest} extends {@link RequestModel}
 *
 * <p>GetOssCheckFreezeResultRequest</p>
 */
public class GetOssCheckFreezeResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinishNum")
    private Long finishNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private java.util.Map<String, String> sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private GetOssCheckFreezeResultRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.finishNum = builder.finishNum;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.sort = builder.sort;
        this.startDate = builder.startDate;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssCheckFreezeResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return finishNum
     */
    public Long getFinishNum() {
        return this.finishNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sort
     */
    public java.util.Map<String, String> getSort() {
        return this.sort;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetOssCheckFreezeResultRequest, Builder> {
        private Integer currentPage; 
        private String endDate; 
        private Long finishNum; 
        private Integer pageSize; 
        private String query; 
        private String regionId; 
        private java.util.Map<String, String> sort; 
        private String startDate; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetOssCheckFreezeResultRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.finishNum = request.finishNum;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.regionId = request.regionId;
            this.sort = request.sort;
            this.startDate = request.startDate;
            this.status = request.status;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-19 10:05:11</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Number of completed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder finishNum(Long finishNum) {
            this.putQueryParameter("FinishNum", finishNum);
            this.finishNum = finishNum;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TaskId&quot;:&quot;P_O3SI0I&quot;}</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Sort field.</p>
         */
        public Builder sort(java.util.Map<String, String> sort) {
            String sortShrink = shrink(sort, "Sort", "json");
            this.putQueryParameter("Sort", sortShrink);
            this.sort = sort;
            return this;
        }

        /**
         * <p>Start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-09 10:28:54</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Task status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetOssCheckFreezeResultRequest build() {
            return new GetOssCheckFreezeResultRequest(this);
        } 

    } 

}
