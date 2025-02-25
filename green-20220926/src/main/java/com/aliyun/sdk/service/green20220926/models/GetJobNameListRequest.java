// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetJobNameListRequest} extends {@link RequestModel}
 *
 * <p>GetJobNameListRequest</p>
 */
public class GetJobNameListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private java.util.Map < String, String > sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private GetJobNameListRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.sort = builder.sort;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobNameListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
    public java.util.Map < String, String > getSort() {
        return this.sort;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetJobNameListRequest, Builder> {
        private String endDate; 
        private String query; 
        private String regionId; 
        private java.util.Map < String, String > sort; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetJobNameListRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.query = request.query;
            this.regionId = request.regionId;
            this.sort = request.sort;
            this.startDate = request.startDate;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(java.util.Map < String, String > sort) {
            String sortShrink = shrink(sort, "Sort", "json");
            this.putQueryParameter("Sort", sortShrink);
            this.sort = sort;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetJobNameListRequest build() {
            return new GetJobNameListRequest(this);
        } 

    } 

}
