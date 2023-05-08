// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppendCasesRequest} extends {@link RequestModel}
 *
 * <p>AppendCasesRequest</p>
 */
public class AppendCasesRequest extends Request {
    @Query
    @NameInMap("CampaignId")
    @Validation(required = true)
    private String campaignId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("body")
    private java.util.List < AppendCasesRequestBody> body;

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
    public java.util.List < AppendCasesRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AppendCasesRequest, Builder> {
        private String campaignId; 
        private String instanceId; 
        private java.util.List < AppendCasesRequestBody> body; 

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
         * CampaignId.
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
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
         * body.
         */
        public Builder body(java.util.List < AppendCasesRequestBody> body) {
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

    public static class AppendCasesRequestBody extends TeaModel {
        @NameInMap("AgentId")
        private String agentId;

        @NameInMap("Caller")
        private String caller;

        @NameInMap("CustomVariables")
        private String customVariables;

        @NameInMap("MaskedCallee")
        private String maskedCallee;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("ReferenceId")
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

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * CustomVariables.
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * MaskedCallee.
             */
            public Builder maskedCallee(String maskedCallee) {
                this.maskedCallee = maskedCallee;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * ReferenceId.
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
