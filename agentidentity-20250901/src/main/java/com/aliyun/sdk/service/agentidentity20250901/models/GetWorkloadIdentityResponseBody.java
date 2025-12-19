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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkloadIdentity.
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

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("WorkloadIdentityArn")
        private String workloadIdentityArn;

        @com.aliyun.core.annotation.NameInMap("WorkloadIdentityName")
        private String workloadIdentityName;

        private WorkloadIdentity(Builder builder) {
            this.allowedResourceOAuth2ReturnURLs = builder.allowedResourceOAuth2ReturnURLs;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.identityProviderName = builder.identityProviderName;
            this.roleArn = builder.roleArn;
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
            private java.util.List<String> allowedResourceOAuth2ReturnURLs; 
            private String createTime; 
            private String description; 
            private String identityProviderName; 
            private String roleArn; 
            private String updateTime; 
            private String workloadIdentityArn; 
            private String workloadIdentityName; 

            private Builder() {
            } 

            private Builder(WorkloadIdentity model) {
                this.allowedResourceOAuth2ReturnURLs = model.allowedResourceOAuth2ReturnURLs;
                this.createTime = model.createTime;
                this.description = model.description;
                this.identityProviderName = model.identityProviderName;
                this.roleArn = model.roleArn;
                this.updateTime = model.updateTime;
                this.workloadIdentityArn = model.workloadIdentityArn;
                this.workloadIdentityName = model.workloadIdentityName;
            } 

            /**
             * AllowedResourceOAuth2ReturnURLs.
             */
            public Builder allowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
                this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IdentityProviderName.
             */
            public Builder identityProviderName(String identityProviderName) {
                this.identityProviderName = identityProviderName;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * WorkloadIdentityArn.
             */
            public Builder workloadIdentityArn(String workloadIdentityArn) {
                this.workloadIdentityArn = workloadIdentityArn;
                return this;
            }

            /**
             * WorkloadIdentityName.
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
