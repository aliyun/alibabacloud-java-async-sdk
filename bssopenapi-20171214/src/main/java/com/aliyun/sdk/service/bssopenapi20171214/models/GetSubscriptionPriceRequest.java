// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscriptionPriceRequest} extends {@link RequestModel}
 *
 * <p>GetSubscriptionPriceRequest</p>
 */
public class GetSubscriptionPriceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ModuleList")
    @Validation(required = true)
    private java.util.List < ModuleList> moduleList;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true)
    private String orderType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("Quantity")
    private Integer quantity;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("ServicePeriodQuantity")
    private Integer servicePeriodQuantity;

    @Query
    @NameInMap("ServicePeriodUnit")
    private String servicePeriodUnit;

    @Query
    @NameInMap("SubscriptionType")
    @Validation(required = true)
    private String subscriptionType;

    private GetSubscriptionPriceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.moduleList = builder.moduleList;
        this.orderType = builder.orderType;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.quantity = builder.quantity;
        this.region = builder.region;
        this.servicePeriodQuantity = builder.servicePeriodQuantity;
        this.servicePeriodUnit = builder.servicePeriodUnit;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return moduleList
     */
    public java.util.List < ModuleList> getModuleList() {
        return this.moduleList;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return servicePeriodQuantity
     */
    public Integer getServicePeriodQuantity() {
        return this.servicePeriodQuantity;
    }

    /**
     * @return servicePeriodUnit
     */
    public String getServicePeriodUnit() {
        return this.servicePeriodUnit;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<GetSubscriptionPriceRequest, Builder> {
        private String instanceId; 
        private java.util.List < ModuleList> moduleList; 
        private String orderType; 
        private Long ownerId; 
        private String productCode; 
        private String productType; 
        private Integer quantity; 
        private String region; 
        private Integer servicePeriodQuantity; 
        private String servicePeriodUnit; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(GetSubscriptionPriceRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.moduleList = response.moduleList;
            this.orderType = response.orderType;
            this.ownerId = response.ownerId;
            this.productCode = response.productCode;
            this.productType = response.productType;
            this.quantity = response.quantity;
            this.region = response.region;
            this.servicePeriodQuantity = response.servicePeriodQuantity;
            this.servicePeriodUnit = response.servicePeriodUnit;
            this.subscriptionType = response.subscriptionType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModuleList.
         */
        public Builder moduleList(java.util.List < ModuleList> moduleList) {
            this.putQueryParameter("ModuleList", moduleList);
            this.moduleList = moduleList;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * Quantity.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
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
         * ServicePeriodQuantity.
         */
        public Builder servicePeriodQuantity(Integer servicePeriodQuantity) {
            this.putQueryParameter("ServicePeriodQuantity", servicePeriodQuantity);
            this.servicePeriodQuantity = servicePeriodQuantity;
            return this;
        }

        /**
         * ServicePeriodUnit.
         */
        public Builder servicePeriodUnit(String servicePeriodUnit) {
            this.putQueryParameter("ServicePeriodUnit", servicePeriodUnit);
            this.servicePeriodUnit = servicePeriodUnit;
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
        public GetSubscriptionPriceRequest build() {
            return new GetSubscriptionPriceRequest(this);
        } 

    } 

    public static class ModuleList extends TeaModel {
        @NameInMap("Config")
        @Validation(required = true)
        private String config;

        @NameInMap("ModuleCode")
        @Validation(required = true)
        private String moduleCode;

        @NameInMap("ModuleStatus")
        private Integer moduleStatus;

        @NameInMap("Tag")
        private String tag;

        private ModuleList(Builder builder) {
            this.config = builder.config;
            this.moduleCode = builder.moduleCode;
            this.moduleStatus = builder.moduleStatus;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleStatus
         */
        public Integer getModuleStatus() {
            return this.moduleStatus;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String config; 
            private String moduleCode; 
            private Integer moduleStatus; 
            private String tag; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleStatus.
             */
            public Builder moduleStatus(Integer moduleStatus) {
                this.moduleStatus = moduleStatus;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public ModuleList build() {
                return new ModuleList(this);
            } 

        } 

    }
}
