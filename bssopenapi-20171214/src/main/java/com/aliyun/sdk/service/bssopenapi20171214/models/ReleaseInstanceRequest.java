// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseInstanceRequest</p>
 */
public class ReleaseInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("OwnerId")
    @Validation(required = true)
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
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
    @Validation(required = true)
    private String subscriptionType;

    private ReleaseInstanceRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.region = builder.region;
        this.renewStatus = builder.renewStatus;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<ReleaseInstanceRequest, Builder> {
        private String instanceIds; 
        private Long ownerId; 
        private String productCode; 
        private String productType; 
        private String region; 
        private String renewStatus; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseInstanceRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.ownerId = request.ownerId;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.region = request.region;
            this.renewStatus = request.renewStatus;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * instanceIds
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * ownerId
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * productCode
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * productType
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * region
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * renewStatus
         */
        public Builder renewStatus(String renewStatus) {
            this.putQueryParameter("RenewStatus", renewStatus);
            this.renewStatus = renewStatus;
            return this;
        }

        /**
         * subscriptionType
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public ReleaseInstanceRequest build() {
            return new ReleaseInstanceRequest(this);
        } 

    } 

}
