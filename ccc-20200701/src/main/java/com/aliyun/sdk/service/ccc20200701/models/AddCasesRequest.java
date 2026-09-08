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
 * {@link AddCasesRequest} extends {@link RequestModel}
 *
 * <p>AddCasesRequest</p>
 */
public class AddCasesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String campaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseList")
    private java.util.List<CaseList> caseList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private AddCasesRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.caseList = builder.caseList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasesRequest create() {
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
     * @return caseList
     */
    public java.util.List<CaseList> getCaseList() {
        return this.caseList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<AddCasesRequest, Builder> {
        private String campaignId; 
        private java.util.List<CaseList> caseList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AddCasesRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.caseList = request.caseList;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The predictive outbound call activity ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c58b9719-3bc3-441d-a4d3-fc0309ef7066</p>
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * <p>The list of outbound call cases.</p>
         */
        public Builder caseList(java.util.List<CaseList> caseList) {
            String caseListShrink = shrink(caseList, "CaseList", "json");
            this.putQueryParameter("CaseList", caseListShrink);
            this.caseList = caseList;
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

        @Override
        public AddCasesRequest build() {
            return new AddCasesRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddCasesRequest} extends {@link TeaModel}
     *
     * <p>AddCasesRequest</p>
     */
    public static class CaseList extends TeaModel {
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

        private CaseList(Builder builder) {
            this.caller = builder.caller;
            this.customVariables = builder.customVariables;
            this.maskedCallee = builder.maskedCallee;
            this.phoneNumber = builder.phoneNumber;
            this.referenceId = builder.referenceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaseList create() {
            return builder().build();
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
            private String caller; 
            private String customVariables; 
            private String maskedCallee; 
            private String phoneNumber; 
            private String referenceId; 

            private Builder() {
            } 

            private Builder(CaseList model) {
                this.caller = model.caller;
                this.customVariables = model.customVariables;
                this.maskedCallee = model.maskedCallee;
                this.phoneNumber = model.phoneNumber;
                this.referenceId = model.referenceId;
            } 

            /**
             * <p>The caller number. If this field is specified, the corresponding contact will be called using this number instead of a randomly selected one.</p>
             * 
             * <strong>example:</strong>
             * <p>185022xxxx</p>
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * <p>Customer-defined custom variables in JSON object format. The object can contain up to 10 properties, and both the name and value of each property are defined by the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;:&quot;customer&quot;,&quot;客户标签&quot;:&quot;tag&quot;}</p>
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * <p>The desensitized callee number. If this field is not empty, it indicates that the callee number must be desensitized. The desensitization rule is defined by the customer, and only the desensitized callee number needs to be provided here. Using a desensitized callee number means that in certain scenarios, the displayed callee number will be the desensitized version, and the real callee number cannot be viewed.</p>
             * 
             * <strong>example:</strong>
             * <p>166******66</p>
             */
            public Builder maskedCallee(String maskedCallee) {
                this.maskedCallee = maskedCallee;
                return this;
            }

            /**
             * <p>The contact\&quot;s phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>188888****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The business ID, which is an identifier from the customer\&quot;s operational system used in integration scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            public CaseList build() {
                return new CaseList(this);
            } 

        } 

    }
}
