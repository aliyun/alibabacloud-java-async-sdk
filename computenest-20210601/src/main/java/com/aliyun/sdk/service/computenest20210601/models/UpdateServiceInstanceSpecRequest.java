// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link UpdateServiceInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceInstanceSpecRequest</p>
 */
public class UpdateServiceInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private Commodity commodity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableUserPrometheus")
    private Boolean enableUserPrometheus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationName")
    private String operationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredefinedParametersName")
    private String predefinedParametersName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private UpdateServiceInstanceSpecRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.commodity = builder.commodity;
        this.dryRun = builder.dryRun;
        this.enableUserPrometheus = builder.enableUserPrometheus;
        this.operationName = builder.operationName;
        this.parameters = builder.parameters;
        this.predefinedParametersName = builder.predefinedParametersName;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceInstanceSpecRequest create() {
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
     * @return commodity
     */
    public Commodity getCommodity() {
        return this.commodity;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableUserPrometheus
     */
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    /**
     * @return operationName
     */
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return predefinedParametersName
     */
    public String getPredefinedParametersName() {
        return this.predefinedParametersName;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateServiceInstanceSpecRequest, Builder> {
        private String clientToken; 
        private Commodity commodity; 
        private Boolean dryRun; 
        private Boolean enableUserPrometheus; 
        private String operationName; 
        private java.util.Map<String, ?> parameters; 
        private String predefinedParametersName; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceInstanceSpecRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.commodity = request.commodity;
            this.dryRun = request.dryRun;
            this.enableUserPrometheus = request.enableUserPrometheus;
            this.operationName = request.operationName;
            this.parameters = request.parameters;
            this.predefinedParametersName = request.predefinedParametersName;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client, but you must ensure that the value is unique among different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The purchase order information for Alibaba Cloud Marketplace. This parameter is not required if the service is not listed in Alibaba Cloud Marketplace or uses the pay-as-you-go billing method.</p>
         */
        public Builder commodity(Commodity commodity) {
            this.putQueryParameter("Commodity", commodity);
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the request, including checks on permissions and instance status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: sends the request but does not create a service instance.</p>
         * </li>
         * <li><p>false: sends the request and creates the service instance if the check is passed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to enable Prometheus monitoring on the user side.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
            this.putQueryParameter("EnableUserPrometheus", enableUserPrometheus);
            this.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * <p>The name of the specification modification operation.</p>
         * <p>You can obtain the name and content of the specification modification operation configured for the service by viewing the <strong>ModifyParametersConfig</strong> property of the <strong>OperationMetadata</strong> response parameter in the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService - Get service details</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Plan configuration change</p>
         */
        public Builder operationName(String operationName) {
            this.putQueryParameter("OperationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * <p>The modification parameters of the service instance.</p>
         * <p>You can specify this parameter if the service provider set <strong>Change Type</strong> to <strong>Parameter Change</strong> when adding a specification modification operation.</p>
         * <blockquote>
         * <ul>
         * <li>You can obtain the modification parameters configured for the service by viewing the <strong>ModifyParametersConfig</strong> property of the <strong>OperationMetadata</strong> response parameter in the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService - Get service details</a> operation.</li>
         * <li>You can also view the modification parameters configured for the service on the <strong>Service Instance Modification</strong> page in the <a href="https://computenest.console.aliyun.com/service/instance/cn-hangzhou">Compute Nest console</a>.</li>
         * </ul>
         * </blockquote>
         * <p>For example, if the service is configured to upgrade the ECS instance type, you must specify an instance type that is higher than the original instance type of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;InstanceType&quot;: &quot;ecs.g8ise.2xlarge&quot;
         * }</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The plan name of the service instance.</p>
         * <p>You can specify this parameter if the service provider set <strong>Change Type</strong> to <strong>Plan Change</strong> when adding a specification modification operation.</p>
         * <p>You can obtain the plan name configured for the service by viewing the <strong>PredefinedParameters</strong> property of the <strong>DeployMetadata</strong> response parameter in the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService - Get service details</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Package 1</p>
         */
        public Builder predefinedParametersName(String predefinedParametersName) {
            this.putQueryParameter("PredefinedParametersName", predefinedParametersName);
            this.predefinedParametersName = predefinedParametersName;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances - List service instances</a> operation to obtain the service instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public UpdateServiceInstanceSpecRequest build() {
            return new UpdateServiceInstanceSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceInstanceSpecRequest</p>
     */
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPay")
        private Boolean autoPay;

        @com.aliyun.core.annotation.NameInMap("CouponId")
        private String couponId;

        private Commodity(Builder builder) {
            this.autoPay = builder.autoPay;
            this.couponId = builder.couponId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodity create() {
            return builder().build();
        }

        /**
         * @return autoPay
         */
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        /**
         * @return couponId
         */
        public String getCouponId() {
            return this.couponId;
        }

        public static final class Builder {
            private Boolean autoPay; 
            private String couponId; 

            private Builder() {
            } 

            private Builder(Commodity model) {
                this.autoPay = model.autoPay;
                this.couponId = model.couponId;
            } 

            /**
             * <p>Specifies whether to enable automatic payment.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong> (default): enables automatic payment. You must ensure that your account balance is sufficient.</p>
             * </li>
             * <li><p><strong>false</strong>: generates an order but does not deduct the fee. If the balance of your payment method is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated, and you can log on to the <a href="https://rdsnext.console.aliyun.com/dashboard/cn-beijing">ApsaraDB RDS console</a> to pay the order.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * <p>The coupon.</p>
             * 
             * <strong>example:</strong>
             * <p>sxs-xxx</p>
             */
            public Builder couponId(String couponId) {
                this.couponId = couponId;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

        } 

    }
}
