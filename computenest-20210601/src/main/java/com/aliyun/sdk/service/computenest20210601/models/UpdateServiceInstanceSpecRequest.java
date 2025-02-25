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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The information about the order placed in Alibaba Cloud Marketplace. You do not need to specify this parameter if the service is not published in Alibaba Cloud Marketplace or uses the pay-as-you-go billing method.</p>
         */
        public Builder commodity(Commodity commodity) {
            this.putQueryParameter("Commodity", commodity);
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. A dry run includes checks on the permissions and instance state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: performs a dry run but does not create a service instance.</li>
         * <li>false: performs a dry run and creates a service instance if the request passes the dry run.</li>
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
         * <p>true</p>
         * <p>false</p>
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
         * <p>The name of the configuration change operation.</p>
         * <p>To obtain the names and content of the configuration change operations of the service, you can call the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService</a> operation. In the response, check the value of <strong>ModifyParametersConfig</strong> in the value of <strong>OperationMetadata</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>package modify</p>
         */
        public Builder operationName(String operationName) {
            this.putQueryParameter("OperationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * <p>The configuration parameter.</p>
         * <p>This parameter is available if the service provider set <strong>Method</strong> to <strong>Change Parameter</strong> when configuring configuration change operations.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>To obtain the parameters of the service that support configuration change, you can call the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService</a> operation. In the response, check the value of <strong>ModifyParametersConfig</strong> in the value of <strong>OperationMetadata</strong>.</p>
         * </li>
         * <li><p>You can also view the parameters of the service that support configuration change in the <strong>configuration change</strong> dialog box in the <a href="https://computenest.console.aliyun.com/service/instance/cn-hangzhou">Compute Nest console</a>.</p>
         * </li>
         * </ul>
         * <p>For example, if the service supports Elastic Compute Service (ECS) instance type upgrade, you must specify an instance type that has higher specifications than the current one.</p>
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
         * <p>The name of the configuration plan.</p>
         * <p>This parameter is available if the service provider set <strong>Method</strong> to <strong>Change Plan</strong> when configuring configuration change operations.</p>
         * <p>To obtain the configuration plan names of the service, you can call the <a href="https://help.aliyun.com/document_detail/2340828.html">GetService</a> operation. In the response, check the value of <strong>PredefinedParameters</strong> in the value of <strong>DeployMetadata</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>package One</p>
         */
        public Builder predefinedParametersName(String predefinedParametersName) {
            this.putQueryParameter("PredefinedParametersName", predefinedParametersName);
            this.predefinedParametersName = predefinedParametersName;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances</a> operation to obtain the ID of the service instance.</p>
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

        private Commodity(Builder builder) {
            this.autoPay = builder.autoPay;
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

        public static final class Builder {
            private Boolean autoPay; 

            /**
             * <p>Specifies whether to enable automatic payment.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>true (default)</strong>: automatically completes the payment. You must make sure that your account balance is sufficient.</li>
             * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated. If your account balance is insufficient, you can set AutoPay to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.<a href="https://rdsnext.console.aliyun.com/dashboard/cn-beijing"></a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

        } 

    }
}
