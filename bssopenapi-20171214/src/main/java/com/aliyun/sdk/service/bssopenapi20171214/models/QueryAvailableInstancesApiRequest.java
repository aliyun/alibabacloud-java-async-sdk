// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvailableInstancesApiRequest} extends {@link RequestModel}
 *
 * <p>QueryAvailableInstancesApiRequest</p>
 */
public class QueryAvailableInstancesApiRequest extends Request {
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
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
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

    private QueryAvailableInstancesApiRequest(Builder builder) {
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

    public static QueryAvailableInstancesApiRequest create() {
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

    public static final class Builder extends Request.Builder<QueryAvailableInstancesApiRequest, Builder> {
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

        private Builder(QueryAvailableInstancesApiRequest response) {
            super(response);
            this.createTimeEnd = response.createTimeEnd;
            this.createTimeStart = response.createTimeStart;
            this.endTimeEnd = response.endTimeEnd;
            this.endTimeStart = response.endTimeStart;
            this.instanceIDs = response.instanceIDs;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.productCode = response.productCode;
            this.productType = response.productType;
            this.region = response.region;
            this.renewStatus = response.renewStatus;
            this.subscriptionType = response.subscriptionType;
        } 

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putQueryParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * EndTimeEnd.
         */
        public Builder endTimeEnd(String endTimeEnd) {
            this.putQueryParameter("EndTimeEnd", endTimeEnd);
            this.endTimeEnd = endTimeEnd;
            return this;
        }

        /**
         * EndTimeStart.
         */
        public Builder endTimeStart(String endTimeStart) {
            this.putQueryParameter("EndTimeStart", endTimeStart);
            this.endTimeStart = endTimeStart;
            return this;
        }

        /**
         * InstanceIDs.
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * RenewStatus.
         */
        public Builder renewStatus(String renewStatus) {
            this.putQueryParameter("RenewStatus", renewStatus);
            this.renewStatus = renewStatus;
            return this;
        }

        /**
         * SubscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public QueryAvailableInstancesApiRequest build() {
            return new QueryAvailableInstancesApiRequest(this);
        } 

    } 

}
