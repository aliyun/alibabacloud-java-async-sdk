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
 * {@link ListWorkloadIdentitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkloadIdentitiesResponseBody</p>
 */
public class ListWorkloadIdentitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WorkloadIdentities")
    private java.util.List<WorkloadIdentities> workloadIdentities;

    private ListWorkloadIdentitiesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workloadIdentities = builder.workloadIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkloadIdentitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workloadIdentities
     */
    public java.util.List<WorkloadIdentities> getWorkloadIdentities() {
        return this.workloadIdentities;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<WorkloadIdentities> workloadIdentities; 

        private Builder() {
        } 

        private Builder(ListWorkloadIdentitiesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.workloadIdentities = model.workloadIdentities;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WorkloadIdentities.
         */
        public Builder workloadIdentities(java.util.List<WorkloadIdentities> workloadIdentities) {
            this.workloadIdentities = workloadIdentities;
            return this;
        }

        public ListWorkloadIdentitiesResponseBody build() {
            return new ListWorkloadIdentitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkloadIdentitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkloadIdentitiesResponseBody</p>
     */
    public static class WorkloadIdentities extends TeaModel {
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

        private WorkloadIdentities(Builder builder) {
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

        public static WorkloadIdentities create() {
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

            private Builder(WorkloadIdentities model) {
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

            public WorkloadIdentities build() {
                return new WorkloadIdentities(this);
            } 

        } 

    }
}
