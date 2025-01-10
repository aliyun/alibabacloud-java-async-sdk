// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link GetSubscriptionPriceRequest} extends {@link RequestModel}
 *
 * <p>GetSubscriptionPriceRequest</p>
 */
public class GetSubscriptionPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ModuleList> moduleList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicePeriodQuantity")
    private Integer servicePeriodQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicePeriodUnit")
    private String servicePeriodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<ModuleList> getModuleList() {
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
        private java.util.List<ModuleList> moduleList; 
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

        private Builder(GetSubscriptionPriceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.moduleList = request.moduleList;
            this.orderType = request.orderType;
            this.ownerId = request.ownerId;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.quantity = request.quantity;
            this.region = request.region;
            this.servicePeriodQuantity = request.servicePeriodQuantity;
            this.servicePeriodUnit = request.servicePeriodUnit;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * <p>The ID of the instance for which the price is queried. This parameter is required if you upgrade an instance. You can specify this parameter to obtain the pre-upgrade configurations of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-khkjhxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The information about the pricing module.</p>
         * <p>This parameter is required.</p>
         */
        public Builder moduleList(java.util.List<ModuleList> moduleList) {
            this.putQueryParameter("ModuleList", moduleList);
            this.moduleList = moduleList;
            return this;
        }

        /**
         * <p>The type of the order. Valid values:</p>
         * <ul>
         * <li>NewOrder: purchases an instance of an Alibaba Cloud service.</li>
         * <li>Renewal: renews an instance of an Alibaba Cloud service.</li>
         * <li>Upgrade: upgrades an instance of an Alibaba Cloud service.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NewOrder</p>
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
         * <p>The code of the service. For more information about the service code, see <strong>Codes of Alibaba Cloud Services</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The type of the service. Specify the parameter based on the pricing document of the specific service.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The service duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder servicePeriodQuantity(Integer servicePeriodQuantity) {
            this.putQueryParameter("ServicePeriodQuantity", servicePeriodQuantity);
            this.servicePeriodQuantity = servicePeriodQuantity;
            return this;
        }

        /**
         * <p>The unit of the service duration. Valid values:</p>
         * <ul>
         * <li>Year</li>
         * <li>Month</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder servicePeriodUnit(String servicePeriodUnit) {
            this.putQueryParameter("ServicePeriodUnit", servicePeriodUnit);
            this.servicePeriodUnit = servicePeriodUnit;
            return this;
        }

        /**
         * <p>The billing method. Set the value to Subscription.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
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

    /**
     * 
     * {@link GetSubscriptionPriceRequest} extends {@link TeaModel}
     *
     * <p>GetSubscriptionPriceRequest</p>
     */
    public static class ModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        @com.aliyun.core.annotation.Validation(required = true)
        private String config;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleStatus")
        private Integer moduleStatus;

        @com.aliyun.core.annotation.NameInMap("Tag")
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
             * <p>The configurations of the Nth pricing module. Valid values of N: 1 to 50. Format: AA:aa,BB:bb. The values of AA and BB are the property IDs of the pricing module. The values of aa and bb are the property values of the pricing module.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PackageCode:version_1</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The identifier of the Nth pricing module.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PackageCode</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The status of the pricing module. This parameter is required only if the order type is Upgrade. Valid values:</p>
             * <ul>
             * <li>1: adds one or more instances.</li>
             * <li>2: modifies the configurations of an instance. In the upgrade scenario, if the configurations of the pricing module change, you must specify this value for the parameter.</li>
             * </ul>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder moduleStatus(Integer moduleStatus) {
                this.moduleStatus = moduleStatus;
                return this;
            }

            /**
             * <p>The tag of the specified resource. This parameter is required only if you upgrade or modify the configurations of an Alibaba Cloud service. For example, if you want to modify the configurations of a disk, you can use a tag to identify the ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>213213123</p>
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
