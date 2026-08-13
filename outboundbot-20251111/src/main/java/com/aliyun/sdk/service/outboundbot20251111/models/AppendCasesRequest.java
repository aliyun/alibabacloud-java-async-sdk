// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cases")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Cases> cases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private AppendCasesRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.cases = builder.cases;
        this.instanceId = builder.instanceId;
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
     * @return cases
     */
    public java.util.List<Cases> getCases() {
        return this.cases;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<AppendCasesRequest, Builder> {
        private String campaignId; 
        private java.util.List<Cases> cases; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AppendCasesRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.cases = request.cases;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>活动ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40ea7fc2-c9d4-47e3-af1e-216bf7f79a44</p>
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * <p>追加的case列表</p>
         * <p>This parameter is required.</p>
         */
        public Builder cases(java.util.List<Cases> cases) {
            String casesShrink = shrink(cases, "Cases", "json");
            this.putBodyParameter("Cases", casesShrink);
            this.cases = cases;
            return this;
        }

        /**
         * <p>外呼实例ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
    public static class Cases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomVariables")
        private String customVariables;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        private Cases(Builder builder) {
            this.customVariables = builder.customVariables;
            this.phoneNumber = builder.phoneNumber;
            this.priority = builder.priority;
            this.referenceId = builder.referenceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cases create() {
            return builder().build();
        }

        /**
         * @return customVariables
         */
        public String getCustomVariables() {
            return this.customVariables;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        public static final class Builder {
            private String customVariables; 
            private String phoneNumber; 
            private Integer priority; 
            private String referenceId; 

            private Builder() {
            } 

            private Builder(Cases model) {
                this.customVariables = model.customVariables;
                this.phoneNumber = model.phoneNumber;
                this.priority = model.priority;
                this.referenceId = model.referenceId;
            } 

            /**
             * <p>自定义变量，JSON字符串，用于话术中的变量替换</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;key1&quot;:&quot;value1&quot;]</p>
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * <p>被叫号码</p>
             * 
             * <strong>example:</strong>
             * <p>1331234****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>名单外呼优先级</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>名单的外部业务关联ID，用于回调时关联业务数据</p>
             * 
             * <strong>example:</strong>
             * <p>business3-watermark-2704-1776997551</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            public Cases build() {
                return new Cases(this);
            } 

        } 

    }
}
