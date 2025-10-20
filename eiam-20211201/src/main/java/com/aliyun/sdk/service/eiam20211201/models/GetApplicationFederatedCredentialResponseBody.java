// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationFederatedCredentialResponseBody</p>
 */
public class GetApplicationFederatedCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredential")
    private ApplicationFederatedCredential applicationFederatedCredential;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationFederatedCredentialResponseBody(Builder builder) {
        this.applicationFederatedCredential = builder.applicationFederatedCredential;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationFederatedCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationFederatedCredential
     */
    public ApplicationFederatedCredential getApplicationFederatedCredential() {
        return this.applicationFederatedCredential;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationFederatedCredential applicationFederatedCredential; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationFederatedCredentialResponseBody model) {
            this.applicationFederatedCredential = model.applicationFederatedCredential;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationFederatedCredential.
         */
        public Builder applicationFederatedCredential(ApplicationFederatedCredential applicationFederatedCredential) {
            this.applicationFederatedCredential = applicationFederatedCredential;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationFederatedCredentialResponseBody build() {
            return new GetApplicationFederatedCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class AttributeMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceValueExpression")
        private String sourceValueExpression;

        @com.aliyun.core.annotation.NameInMap("TargetField")
        private String targetField;

        private AttributeMappings(Builder builder) {
            this.sourceValueExpression = builder.sourceValueExpression;
            this.targetField = builder.targetField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeMappings create() {
            return builder().build();
        }

        /**
         * @return sourceValueExpression
         */
        public String getSourceValueExpression() {
            return this.sourceValueExpression;
        }

        /**
         * @return targetField
         */
        public String getTargetField() {
            return this.targetField;
        }

        public static final class Builder {
            private String sourceValueExpression; 
            private String targetField; 

            private Builder() {
            } 

            private Builder(AttributeMappings model) {
                this.sourceValueExpression = model.sourceValueExpression;
                this.targetField = model.targetField;
            } 

            /**
             * <p>源值表达式</p>
             * 
             * <strong>example:</strong>
             * <p>Append(client.applicationFederatedCredentialId, &quot;:&quot;, cert.subject.CN, &quot;:&quot;, cert.serialNumber)</p>
             */
            public Builder sourceValueExpression(String sourceValueExpression) {
                this.sourceValueExpression = sourceValueExpression;
                return this;
            }

            /**
             * <p>目标字段</p>
             * 
             * <strong>example:</strong>
             * <p>client.activeSubjectUrn</p>
             */
            public Builder targetField(String targetField) {
                this.targetField = targetField;
                return this;
            }

            public AttributeMappings build() {
                return new AttributeMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationFederatedCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationFederatedCredentialResponseBody</p>
     */
    public static class ApplicationFederatedCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialId")
        private String applicationFederatedCredentialId;

        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialName")
        private String applicationFederatedCredentialName;

        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialType")
        private String applicationFederatedCredentialType;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("AttributeMappings")
        private java.util.List<AttributeMappings> attributeMappings;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderId")
        private String federatedCredentialProviderId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VerificationCondition")
        private String verificationCondition;

        private ApplicationFederatedCredential(Builder builder) {
            this.applicationFederatedCredentialId = builder.applicationFederatedCredentialId;
            this.applicationFederatedCredentialName = builder.applicationFederatedCredentialName;
            this.applicationFederatedCredentialType = builder.applicationFederatedCredentialType;
            this.applicationId = builder.applicationId;
            this.attributeMappings = builder.attributeMappings;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.federatedCredentialProviderId = builder.federatedCredentialProviderId;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.verificationCondition = builder.verificationCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationFederatedCredential create() {
            return builder().build();
        }

        /**
         * @return applicationFederatedCredentialId
         */
        public String getApplicationFederatedCredentialId() {
            return this.applicationFederatedCredentialId;
        }

        /**
         * @return applicationFederatedCredentialName
         */
        public String getApplicationFederatedCredentialName() {
            return this.applicationFederatedCredentialName;
        }

        /**
         * @return applicationFederatedCredentialType
         */
        public String getApplicationFederatedCredentialType() {
            return this.applicationFederatedCredentialType;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return attributeMappings
         */
        public java.util.List<AttributeMappings> getAttributeMappings() {
            return this.attributeMappings;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return federatedCredentialProviderId
         */
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastUsedTime
         */
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return verificationCondition
         */
        public String getVerificationCondition() {
            return this.verificationCondition;
        }

        public static final class Builder {
            private String applicationFederatedCredentialId; 
            private String applicationFederatedCredentialName; 
            private String applicationFederatedCredentialType; 
            private String applicationId; 
            private java.util.List<AttributeMappings> attributeMappings; 
            private Long createTime; 
            private String description; 
            private String federatedCredentialProviderId; 
            private String instanceId; 
            private Long lastUsedTime; 
            private String status; 
            private Long updateTime; 
            private String verificationCondition; 

            private Builder() {
            } 

            private Builder(ApplicationFederatedCredential model) {
                this.applicationFederatedCredentialId = model.applicationFederatedCredentialId;
                this.applicationFederatedCredentialName = model.applicationFederatedCredentialName;
                this.applicationFederatedCredentialType = model.applicationFederatedCredentialType;
                this.applicationId = model.applicationId;
                this.attributeMappings = model.attributeMappings;
                this.createTime = model.createTime;
                this.description = model.description;
                this.federatedCredentialProviderId = model.federatedCredentialProviderId;
                this.instanceId = model.instanceId;
                this.lastUsedTime = model.lastUsedTime;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.verificationCondition = model.verificationCondition;
            } 

            /**
             * <p>应用联邦凭证ID</p>
             * 
             * <strong>example:</strong>
             * <p>afc_aaaaa1111</p>
             */
            public Builder applicationFederatedCredentialId(String applicationFederatedCredentialId) {
                this.applicationFederatedCredentialId = applicationFederatedCredentialId;
                return this;
            }

            /**
             * <p>应用联邦凭证名称</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder applicationFederatedCredentialName(String applicationFederatedCredentialName) {
                this.applicationFederatedCredentialName = applicationFederatedCredentialName;
                return this;
            }

            /**
             * <p>应用联邦凭证类型</p>
             * 
             * <strong>example:</strong>
             * <p>oidc</p>
             */
            public Builder applicationFederatedCredentialType(String applicationFederatedCredentialType) {
                this.applicationFederatedCredentialType = applicationFederatedCredentialType;
                return this;
            }

            /**
             * <p>应用ID</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>属性映射</p>
             */
            public Builder attributeMappings(java.util.List<AttributeMappings> attributeMappings) {
                this.attributeMappings = attributeMappings;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>应用联邦凭证描述</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>应用联邦凭证提供者ID</p>
             * 
             * <strong>example:</strong>
             * <p>fcp_asda1dasdxxxx</p>
             */
            public Builder federatedCredentialProviderId(String federatedCredentialProviderId) {
                this.federatedCredentialProviderId = federatedCredentialProviderId;
                return this;
            }

            /**
             * <p>EAIM 实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>最近使用时间</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>应用联邦凭证状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1758785994982</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>验证条件</p>
             * 
             * <strong>example:</strong>
             * <p>Equals(cert.subject.CN, &quot;test&quot;)</p>
             */
            public Builder verificationCondition(String verificationCondition) {
                this.verificationCondition = verificationCondition;
                return this;
            }

            public ApplicationFederatedCredential build() {
                return new ApplicationFederatedCredential(this);
            } 

        } 

    }
}
