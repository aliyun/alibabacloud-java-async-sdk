// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceRequest</p>
 */
public class ModifyInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ModifyType")
    @Validation(required = true)
    private String modifyType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Parameter")
    private java.util.List < Parameter> parameter;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("SubscriptionType")
    @Validation(required = true)
    private String subscriptionType;

    private ModifyInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.modifyType = builder.modifyType;
        this.ownerId = builder.ownerId;
        this.parameter = builder.parameter;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return parameter
     */
    public java.util.List < Parameter> getParameter() {
        return this.parameter;
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
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private String modifyType; 
        private Long ownerId; 
        private java.util.List < Parameter> parameter; 
        private String productCode; 
        private String productType; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.instanceId = response.instanceId;
            this.modifyType = response.modifyType;
            this.ownerId = response.ownerId;
            this.parameter = response.parameter;
            this.productCode = response.productCode;
            this.productType = response.productType;
            this.subscriptionType = response.subscriptionType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
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
         * Parameter.
         */
        public Builder parameter(java.util.List < Parameter> parameter) {
            this.putQueryParameter("Parameter", parameter);
            this.parameter = parameter;
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
         * SubscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public ModifyInstanceRequest build() {
            return new ModifyInstanceRequest(this);
        } 

    } 

    public static class Parameter extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        private String code;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private Parameter(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
