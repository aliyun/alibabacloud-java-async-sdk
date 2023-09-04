// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvailableInstancesRequest} extends {@link RequestModel}
 *
 * <p>QueryAvailableInstancesRequest</p>
 */
public class QueryAvailableInstancesRequest extends Request {
    @Query
    @NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @Query
    @NameInMap("CreateTimeStart")
    private String createTimeStart;

    @Query
    @NameInMap("EndTimeEnd")
    private String endTimeEnd;

    @Query
    @NameInMap("EndTimeStart")
    private String endTimeStart;

    @Query
    @NameInMap("InstanceIDs")
    private String instanceIDs;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("RenewStatus")
    private String renewStatus;

    @Query
    @NameInMap("SubscriptionType")
    private String subscriptionType;

    private QueryAvailableInstancesRequest(Builder builder) {
        super(builder);
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.endTimeEnd = builder.endTimeEnd;
        this.endTimeStart = builder.endTimeStart;
        this.instanceIDs = builder.instanceIDs;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.region = builder.region;
        this.renewStatus = builder.renewStatus;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvailableInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return endTimeEnd
     */
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    /**
     * @return endTimeStart
     */
    public String getEndTimeStart() {
        return this.endTimeStart;
    }

    /**
     * @return instanceIDs
     */
    public String getInstanceIDs() {
        return this.instanceIDs;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return renewStatus
     */
    public String getRenewStatus() {
        return this.renewStatus;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<QueryAvailableInstancesRequest, Builder> {
        private String createTimeEnd; 
        private String createTimeStart; 
        private String endTimeEnd; 
        private String endTimeStart; 
        private String instanceIDs; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productCode; 
        private String productType; 
        private String region; 
        private String renewStatus; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(QueryAvailableInstancesRequest request) {
            super(request);
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.endTimeEnd = request.endTimeEnd;
            this.endTimeStart = request.endTimeStart;
            this.instanceIDs = request.instanceIDs;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.region = request.region;
            this.renewStatus = request.renewStatus;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * The end time when the specified instance is created. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * The start time when the specified instance is created. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2016-05-23T12:00:00Z.
         */
        public Builder endTimeEnd(String endTimeEnd) {
            this.putQueryParameter("EndTimeEnd", endTimeEnd);
            this.endTimeEnd = endTimeEnd;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2016-05-23T12:00:00Z.
         */
        public Builder endTimeStart(String endTimeStart) {
            this.putQueryParameter("EndTimeStart", endTimeStart);
            this.endTimeStart = endTimeStart;
            return this;
        }

        /**
         * The ID of the instance. Separate multiple IDs with commas (,). You can specify a maximum of 100 IDs.
         */
        public Builder instanceIDs(String instanceIDs) {
            this.putQueryParameter("InstanceIDs", instanceIDs);
            this.instanceIDs = instanceIDs;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The code of the service. You can query the service code by calling the **QueryProductList** operation or viewing **Codes of Alibaba Cloud services**.
         * <p>
         * 
         * >This parameter cannot be left empty if the region is specified.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The type of the service.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * The ID of the region in which the instance resides.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The renewal status of the specified instance. Valid values:
         * <p>
         * 
         * *   AutoRenewal: The instance is automatically renewed.
         * *   ManualRenewal: The instance is manually renewed.
         * *   NotRenewal: The instance is not renewed.
         */
        public Builder renewStatus(String renewStatus) {
            this.putQueryParameter("RenewStatus", renewStatus);
            this.renewStatus = renewStatus;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   Subscription: subscription
         * *   PayAsYouGo: pay-as-you-go
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public QueryAvailableInstancesRequest build() {
            return new QueryAvailableInstancesRequest(this);
        } 

    } 

}
