// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link AppendCasesRequest} extends {@link RequestModel}
 *
 * <p>AppendCasesRequest</p>
 */
public class AppendCasesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String campaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<AppendCasesRequestBody> body;

    private AppendCasesRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.instanceId = builder.instanceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppendCasesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return body
     */
    public java.util.List<AppendCasesRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AppendCasesRequest, Builder> {
        private String campaignId; 
        private String instanceId; 
        private java.util.List<AppendCasesRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(AppendCasesRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.instanceId = request.instanceId;
            this.body = request.body;
        } 

        /**
         * <p>The predictive campaign ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>78cf6864-9a22-4ea8-a59d-5adc2d747b0e</p>
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of cases to be added.</p>
         */
        public Builder body(java.util.List<AppendCasesRequestBody> body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public AppendCasesRequest build() {
            return new AppendCasesRequest(this);
        } 

    } 

    /**
     * 
     * {@link AppendCasesRequest} extends {@link TeaModel}
     *
     * <p>AppendCasesRequest</p>
     */
    public static class AppendCasesRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("CustomVariables")
        private String customVariables;

        @com.aliyun.core.annotation.NameInMap("MaskedCallee")
        private String maskedCallee;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        private AppendCasesRequestBody(Builder builder) {
            this.agentId = builder.agentId;
            this.caller = builder.caller;
            this.customVariables = builder.customVariables;
            this.maskedCallee = builder.maskedCallee;
            this.phoneNumber = builder.phoneNumber;
            this.referenceId = builder.referenceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppendCasesRequestBody create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return customVariables
         */
        public String getCustomVariables() {
            return this.customVariables;
        }

        /**
         * @return maskedCallee
         */
        public String getMaskedCallee() {
            return this.maskedCallee;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        public static final class Builder {
            private String agentId; 
            private String caller; 
            private String customVariables; 
            private String maskedCallee; 
            private String phoneNumber; 
            private String referenceId; 

            private Builder() {
            } 

            private Builder(AppendCasesRequestBody model) {
                this.agentId = model.agentId;
                this.caller = model.caller;
                this.customVariables = model.customVariables;
                this.maskedCallee = model.maskedCallee;
                this.phoneNumber = model.phoneNumber;
                this.referenceId = model.referenceId;
            } 

            /**
             * <p>The agent ID. If you specify this parameter, the system routes the call to the specified agent. If you leave this parameter empty, the system routes the call to an idle agent in the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The caller number. If you specify this parameter, the system preferentially uses the specified number to initiate a call. If you leave this parameter empty, the system automatically selects a number to initiate a call.</p>
             * 
             * <strong>example:</strong>
             * <p>01012345678</p>
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * <p>Custom variables in the format of a JSON object. The object can contain up to 10 properties, and the name and value of each property are custom.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;name&quot;: &quot;customer&quot;,
             *       &quot;客户标签&quot;: &quot;tag&quot;
             * }</p>
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * <p>The masked callee number. If this parameter is not empty, the callee number will be masked. You can define the masking rule and specify the masked callee number. In some cases, you can only view the masked callee number instead of the real one.</p>
             * 
             * <strong>example:</strong>
             * <p>071*****801</p>
             */
            public Builder maskedCallee(String maskedCallee) {
                this.maskedCallee = maskedCallee;
                return this;
            }

            /**
             * <p>The phone number of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>188888****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The business ID, which is a custom ID from your business system, used for integration purposes.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            public AppendCasesRequestBody build() {
                return new AppendCasesRequestBody(this);
            } 

        } 

    }
}
