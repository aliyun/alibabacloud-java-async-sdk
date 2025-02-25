// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNisNetworkRankingRequest} extends {@link RequestModel}
 *
 * <p>GetNisNetworkRankingRequest</p>
 */
public class GetNisNetworkRankingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List < String > accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(maximum = 253402271999000D)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(maximum = 253402271999000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List < Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopN")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer topN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseCrossAccount")
    private Boolean useCrossAccount;

    private GetNisNetworkRankingRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.beginTime = builder.beginTime;
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.filter = builder.filter;
        this.groupBy = builder.groupBy;
        this.orderBy = builder.orderBy;
        this.regionNo = builder.regionNo;
        this.resourceType = builder.resourceType;
        this.sort = builder.sort;
        this.topN = builder.topN;
        this.useCrossAccount = builder.useCrossAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNisNetworkRankingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List < String > getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return topN
     */
    public Integer getTopN() {
        return this.topN;
    }

    /**
     * @return useCrossAccount
     */
    public Boolean getUseCrossAccount() {
        return this.useCrossAccount;
    }

    public static final class Builder extends Request.Builder<GetNisNetworkRankingRequest, Builder> {
        private java.util.List < String > accountIds; 
        private Long beginTime; 
        private String direction; 
        private Long endTime; 
        private java.util.List < Filter> filter; 
        private String groupBy; 
        private String orderBy; 
        private String regionNo; 
        private String resourceType; 
        private String sort; 
        private Integer topN; 
        private Boolean useCrossAccount; 

        private Builder() {
            super();
        } 

        private Builder(GetNisNetworkRankingRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.beginTime = request.beginTime;
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.filter = request.filter;
            this.groupBy = request.groupBy;
            this.orderBy = request.orderBy;
            this.regionNo = request.regionNo;
            this.resourceType = request.resourceType;
            this.sort = request.sort;
            this.topN = request.topN;
            this.useCrossAccount = request.useCrossAccount;
        } 

        /**
         * AccountIds.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * TopN.
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("TopN", topN);
            this.topN = topN;
            return this;
        }

        /**
         * UseCrossAccount.
         */
        public Builder useCrossAccount(Boolean useCrossAccount) {
            this.putQueryParameter("UseCrossAccount", useCrossAccount);
            this.useCrossAccount = useCrossAccount;
            return this;
        }

        @Override
        public GetNisNetworkRankingRequest build() {
            return new GetNisNetworkRankingRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filter(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
