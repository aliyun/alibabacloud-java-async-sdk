// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorHBaseRegionServersRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorHBaseRegionServersRequest</p>
 */
public class ListDoctorHBaseRegionServersRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DateTime")
    @Validation(required = true)
    private String dateTime;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RegionServerHosts")
    private java.util.List < String > regionServerHosts;

    private ListDoctorHBaseRegionServersRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dateTime = builder.dateTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
        this.regionServerHosts = builder.regionServerHosts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorHBaseRegionServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionServerHosts
     */
    public java.util.List < String > getRegionServerHosts() {
        return this.regionServerHosts;
    }

    public static final class Builder extends Request.Builder<ListDoctorHBaseRegionServersRequest, Builder> {
        private String clusterId; 
        private String dateTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String orderType; 
        private String regionId; 
        private java.util.List < String > regionServerHosts; 

        private Builder() {
            super();
        } 

        private Builder(ListDoctorHBaseRegionServersRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dateTime = request.dateTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
            this.regionServerHosts = request.regionServerHosts;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DateTime.
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * 一次获取的最大记录数。取值范围：1~100。
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 标记当前开始读取的位置，置空表示从头开始。
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RegionServerHosts.
         */
        public Builder regionServerHosts(java.util.List < String > regionServerHosts) {
            this.putQueryParameter("RegionServerHosts", regionServerHosts);
            this.regionServerHosts = regionServerHosts;
            return this;
        }

        @Override
        public ListDoctorHBaseRegionServersRequest build() {
            return new ListDoctorHBaseRegionServersRequest(this);
        } 

    } 

}
