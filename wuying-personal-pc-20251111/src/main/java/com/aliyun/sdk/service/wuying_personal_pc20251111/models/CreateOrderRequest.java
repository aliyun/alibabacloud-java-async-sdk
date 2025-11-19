// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link CreateOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderRequest</p>
 */
public class CreateOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicProductParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DynamicProductParams> dynamicProductParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderFrom")
    private String orderFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private CreateOrderRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.autoPay = builder.autoPay;
        this.dynamicProductParams = builder.dynamicProductParams;
        this.operationType = builder.operationType;
        this.orderFrom = builder.orderFrom;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return dynamicProductParams
     */
    public java.util.List<DynamicProductParams> getDynamicProductParams() {
        return this.dynamicProductParams;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return orderFrom
     */
    public String getOrderFrom() {
        return this.orderFrom;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<CreateOrderRequest, Builder> {
        private String apiKey; 
        private Boolean autoPay; 
        private java.util.List<DynamicProductParams> dynamicProductParams; 
        private String operationType; 
        private String orderFrom; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.autoPay = request.autoPay;
            this.dynamicProductParams = request.dynamicProductParams;
            this.operationType = request.operationType;
            this.orderFrom = request.orderFrom;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dynamicProductParams(java.util.List<DynamicProductParams> dynamicProductParams) {
            String dynamicProductParamsShrink = shrink(dynamicProductParams, "DynamicProductParams", "json");
            this.putQueryParameter("DynamicProductParams", dynamicProductParamsShrink);
            this.dynamicProductParams = dynamicProductParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * OrderFrom.
         */
        public Builder orderFrom(String orderFrom) {
            this.putQueryParameter("OrderFrom", orderFrom);
            this.orderFrom = orderFrom;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public CreateOrderRequest build() {
            return new CreateOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateOrderRequest</p>
     */
    public static class InputActivateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        private InputActivateConfig(Builder builder) {
            this.cityName = builder.cityName;
            this.desktopName = builder.desktopName;
            this.imageId = builder.imageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputActivateConfig create() {
            return builder().build();
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        public static final class Builder {
            private String cityName; 
            private String desktopName; 
            private String imageId; 

            private Builder() {
            } 

            private Builder(InputActivateConfig model) {
                this.cityName = model.cityName;
                this.desktopName = model.desktopName;
                this.imageId = model.imageId;
            } 

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            public InputActivateConfig build() {
                return new InputActivateConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateOrderRequest</p>
     */
    public static class DynamicProductParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("DeliveryAddress")
        private String deliveryAddress;

        @com.aliyun.core.annotation.NameInMap("DynamicAttributes")
        private java.util.Map<String, String> dynamicAttributes;

        @com.aliyun.core.annotation.NameInMap("InputActivateConfig")
        private InputActivateConfig inputActivateConfig;

        @com.aliyun.core.annotation.NameInMap("InstanceIdList")
        private java.util.List<String> instanceIdList;

        @com.aliyun.core.annotation.NameInMap("LinkedResourceId")
        private String linkedResourceId;

        @com.aliyun.core.annotation.NameInMap("PackageCode")
        private String packageCode;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductSkuCode")
        private String productSkuCode;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private DynamicProductParams(Builder builder) {
            this.amount = builder.amount;
            this.deliveryAddress = builder.deliveryAddress;
            this.dynamicAttributes = builder.dynamicAttributes;
            this.inputActivateConfig = builder.inputActivateConfig;
            this.instanceIdList = builder.instanceIdList;
            this.linkedResourceId = builder.linkedResourceId;
            this.packageCode = builder.packageCode;
            this.productCode = builder.productCode;
            this.productSkuCode = builder.productSkuCode;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicProductParams create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return deliveryAddress
         */
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        /**
         * @return dynamicAttributes
         */
        public java.util.Map<String, String> getDynamicAttributes() {
            return this.dynamicAttributes;
        }

        /**
         * @return inputActivateConfig
         */
        public InputActivateConfig getInputActivateConfig() {
            return this.inputActivateConfig;
        }

        /**
         * @return instanceIdList
         */
        public java.util.List<String> getInstanceIdList() {
            return this.instanceIdList;
        }

        /**
         * @return linkedResourceId
         */
        public String getLinkedResourceId() {
            return this.linkedResourceId;
        }

        /**
         * @return packageCode
         */
        public String getPackageCode() {
            return this.packageCode;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productSkuCode
         */
        public String getProductSkuCode() {
            return this.productSkuCode;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private Integer amount; 
            private String deliveryAddress; 
            private java.util.Map<String, String> dynamicAttributes; 
            private InputActivateConfig inputActivateConfig; 
            private java.util.List<String> instanceIdList; 
            private String linkedResourceId; 
            private String packageCode; 
            private String productCode; 
            private String productSkuCode; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(DynamicProductParams model) {
                this.amount = model.amount;
                this.deliveryAddress = model.deliveryAddress;
                this.dynamicAttributes = model.dynamicAttributes;
                this.inputActivateConfig = model.inputActivateConfig;
                this.instanceIdList = model.instanceIdList;
                this.linkedResourceId = model.linkedResourceId;
                this.packageCode = model.packageCode;
                this.productCode = model.productCode;
                this.productSkuCode = model.productSkuCode;
                this.resourceId = model.resourceId;
            } 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * DeliveryAddress.
             */
            public Builder deliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
                return this;
            }

            /**
             * DynamicAttributes.
             */
            public Builder dynamicAttributes(java.util.Map<String, String> dynamicAttributes) {
                this.dynamicAttributes = dynamicAttributes;
                return this;
            }

            /**
             * InputActivateConfig.
             */
            public Builder inputActivateConfig(InputActivateConfig inputActivateConfig) {
                this.inputActivateConfig = inputActivateConfig;
                return this;
            }

            /**
             * InstanceIdList.
             */
            public Builder instanceIdList(java.util.List<String> instanceIdList) {
                this.instanceIdList = instanceIdList;
                return this;
            }

            /**
             * LinkedResourceId.
             */
            public Builder linkedResourceId(String linkedResourceId) {
                this.linkedResourceId = linkedResourceId;
                return this;
            }

            /**
             * PackageCode.
             */
            public Builder packageCode(String packageCode) {
                this.packageCode = packageCode;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductSkuCode.
             */
            public Builder productSkuCode(String productSkuCode) {
                this.productSkuCode = productSkuCode;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public DynamicProductParams build() {
                return new DynamicProductParams(this);
            } 

        } 

    }
}
