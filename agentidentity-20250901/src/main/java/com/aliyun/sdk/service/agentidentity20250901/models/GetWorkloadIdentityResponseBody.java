// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetWorkloadIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkloadIdentityResponseBody</p>
 */
public class GetWorkloadIdentityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkloadIdentity")
    private WorkloadIdentity workloadIdentity;

    private GetWorkloadIdentityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workloadIdentity = builder.workloadIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadIdentityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workloadIdentity
     */
    public WorkloadIdentity getWorkloadIdentity() {
        return this.workloadIdentity;
    }

    public static final class Builder {
        private String requestId; 
        private WorkloadIdentity workloadIdentity; 

        private Builder() {
        } 

        private Builder(GetWorkloadIdentityResponseBody model) {
            this.requestId = model.requestId;
            this.workloadIdentity = model.workloadIdentity;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5EEF5C1D-E951-5C0D-B0BC-5FF1B626CFC6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workload identity.</p>
         */
        public Builder workloadIdentity(WorkloadIdentity workloadIdentity) {
            this.workloadIdentity = workloadIdentity;
            return this;
        }

        public GetWorkloadIdentityResponseBody build() {
            return new GetWorkloadIdentityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkloadIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkloadIdentityResponseBody</p>
     */
    public static class WorkloadIdentity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedConsentCallbackURLs")
        private java.util.List<String> allowedConsentCallbackURLs;

        @com.aliyun.core.annotation.NameInMap("AllowedResourceOAuth2ReturnURLs")
        private java.util.List<String> allowedResourceOAuth2ReturnURLs;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
        private String identityProviderName;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("SessionBindingEnabled")
        private Boolean sessionBindingEnabled;

        @com.aliyun.core.annotation.NameInMap("SourceAgentArn")
        private String sourceAgentArn;

        @com.aliyun.core.annotation.NameInMap("SourcePlatform")
        private String sourcePlatform;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("WorkloadIdentityArn")
        private String workloadIdentityArn;

        @com.aliyun.core.annotation.NameInMap("WorkloadIdentityName")
        private String workloadIdentityName;

        private WorkloadIdentity(Builder builder) {
            this.allowedConsentCallbackURLs = builder.allowedConsentCallbackURLs;
            this.allowedResourceOAuth2ReturnURLs = builder.allowedResourceOAuth2ReturnURLs;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.identityProviderName = builder.identityProviderName;
            this.roleArn = builder.roleArn;
            this.sessionBindingEnabled = builder.sessionBindingEnabled;
            this.sourceAgentArn = builder.sourceAgentArn;
            this.sourcePlatform = builder.sourcePlatform;
            this.updateTime = builder.updateTime;
            this.workloadIdentityArn = builder.workloadIdentityArn;
            this.workloadIdentityName = builder.workloadIdentityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkloadIdentity create() {
            return builder().build();
        }

        /**
         * @return allowedConsentCallbackURLs
         */
        public java.util.List<String> getAllowedConsentCallbackURLs() {
            return this.allowedConsentCallbackURLs;
        }

        /**
         * @return allowedResourceOAuth2ReturnURLs
         */
        public java.util.List<String> getAllowedResourceOAuth2ReturnURLs() {
            return this.allowedResourceOAuth2ReturnURLs;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return identityProviderName
         */
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return sessionBindingEnabled
         */
        public Boolean getSessionBindingEnabled() {
            return this.sessionBindingEnabled;
        }

        /**
         * @return sourceAgentArn
         */
        public String getSourceAgentArn() {
            return this.sourceAgentArn;
        }

        /**
         * @return sourcePlatform
         */
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workloadIdentityArn
         */
        public String getWorkloadIdentityArn() {
            return this.workloadIdentityArn;
        }

        /**
         * @return workloadIdentityName
         */
        public String getWorkloadIdentityName() {
            return this.workloadIdentityName;
        }

        public static final class Builder {
            private java.util.List<String> allowedConsentCallbackURLs; 
            private java.util.List<String> allowedResourceOAuth2ReturnURLs; 
            private String createTime; 
            private String description; 
            private String identityProviderName; 
            private String roleArn; 
            private Boolean sessionBindingEnabled; 
            private String sourceAgentArn; 
            private String sourcePlatform; 
            private String updateTime; 
            private String workloadIdentityArn; 
            private String workloadIdentityName; 

            private Builder() {
            } 

            private Builder(WorkloadIdentity model) {
                this.allowedConsentCallbackURLs = model.allowedConsentCallbackURLs;
                this.allowedResourceOAuth2ReturnURLs = model.allowedResourceOAuth2ReturnURLs;
                this.createTime = model.createTime;
                this.description = model.description;
                this.identityProviderName = model.identityProviderName;
                this.roleArn = model.roleArn;
                this.sessionBindingEnabled = model.sessionBindingEnabled;
                this.sourceAgentArn = model.sourceAgentArn;
                this.sourcePlatform = model.sourcePlatform;
                this.updateTime = model.updateTime;
                this.workloadIdentityArn = model.workloadIdentityArn;
                this.workloadIdentityName = model.workloadIdentityName;
            } 

            /**
             * <p>The whitelist of consent authorization callback URLs for the workload identity, which restricts the allowed callback addresses in the offline delegation (OfflineAccess) authorization flow.</p>
             */
            public Builder allowedConsentCallbackURLs(java.util.List<String> allowedConsentCallbackURLs) {
                this.allowedConsentCallbackURLs = allowedConsentCallbackURLs;
                return this;
            }

            /**
             * <p>The list of allowed OAuth2 return URLs.</p>
             */
            public Builder allowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
                this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>example agent</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The configured identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>identity-provider-okta</p>
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * <p>The ARN of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456:role/agent-101-role</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>Indicates whether session binding is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sessionBindingEnabled(Boolean sessionBindingEnabled) {
                this.sessionBindingEnabled = sessionBindingEnabled;
                return this;
            }

            /**
             * <p>The ARN of the source agent.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:agentidentity:cn-beijing:123456:workloadidentity/my-identity</p>
             */
            public Builder sourceAgentArn(String sourceAgentArn) {
                this.sourceAgentArn = sourceAgentArn;
                return this;
            }

            /**
             * <p>The creation source.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder sourcePlatform(String sourcePlatform) {
                this.sourcePlatform = sourcePlatform;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-18T06:19:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ARN of the workload identity.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:agentidentity:cn-beijing:123456:workloadidentitydirectory/default/workloadidentity/agent-101</p>
             */
            public Builder workloadIdentityArn(String workloadIdentityArn) {
                this.workloadIdentityArn = workloadIdentityArn;
                return this;
            }

            /**
             * <p>The unique name of the workload identity.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-101</p>
             */
            public Builder workloadIdentityName(String workloadIdentityName) {
                this.workloadIdentityName = workloadIdentityName;
                return this;
            }

            public WorkloadIdentity build() {
                return new WorkloadIdentity(this);
            } 

        } 

    }
}
