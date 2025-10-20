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
 * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
 */
public class ListApplicationFederatedCredentialsForProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentials")
    private java.util.List<ApplicationFederatedCredentials> applicationFederatedCredentials;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationFederatedCredentialsForProviderResponseBody(Builder builder) {
        this.applicationFederatedCredentials = builder.applicationFederatedCredentials;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationFederatedCredentialsForProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationFederatedCredentials
     */
    public java.util.List<ApplicationFederatedCredentials> getApplicationFederatedCredentials() {
        return this.applicationFederatedCredentials;
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
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
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

    public static final class Builder {
        private java.util.List<ApplicationFederatedCredentials> applicationFederatedCredentials; 
        private Integer maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationFederatedCredentialsForProviderResponseBody model) {
            this.applicationFederatedCredentials = model.applicationFederatedCredentials;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ApplicationFederatedCredentials.
         */
        public Builder applicationFederatedCredentials(java.util.List<ApplicationFederatedCredentials> applicationFederatedCredentials) {
            this.applicationFederatedCredentials = applicationFederatedCredentials;
            return this;
        }

        /**
         * <p>分页查询时每页行数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
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

        public ListApplicationFederatedCredentialsForProviderResponseBody build() {
            return new ListApplicationFederatedCredentialsForProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationFederatedCredentialsForProviderResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationFederatedCredentialsForProviderResponseBody</p>
     */
    public static class ApplicationFederatedCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialId")
        private String applicationFederatedCredentialId;

        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialName")
        private String applicationFederatedCredentialName;

        @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialType")
        private String applicationFederatedCredentialType;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

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

        private ApplicationFederatedCredentials(Builder builder) {
            this.applicationFederatedCredentialId = builder.applicationFederatedCredentialId;
            this.applicationFederatedCredentialName = builder.applicationFederatedCredentialName;
            this.applicationFederatedCredentialType = builder.applicationFederatedCredentialType;
            this.applicationId = builder.applicationId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.federatedCredentialProviderId = builder.federatedCredentialProviderId;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationFederatedCredentials create() {
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

        public static final class Builder {
            private String applicationFederatedCredentialId; 
            private String applicationFederatedCredentialName; 
            private String applicationFederatedCredentialType; 
            private String applicationId; 
            private Long createTime; 
            private String description; 
            private String federatedCredentialProviderId; 
            private String instanceId; 
            private Long lastUsedTime; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ApplicationFederatedCredentials model) {
                this.applicationFederatedCredentialId = model.applicationFederatedCredentialId;
                this.applicationFederatedCredentialName = model.applicationFederatedCredentialName;
                this.applicationFederatedCredentialType = model.applicationFederatedCredentialType;
                this.applicationId = model.applicationId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.federatedCredentialProviderId = model.federatedCredentialProviderId;
                this.instanceId = model.instanceId;
                this.lastUsedTime = model.lastUsedTime;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>应用联邦凭证ID</p>
             * 
             * <strong>example:</strong>
             * <p>afc_dads12sadxxxxx</p>
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
             * <p>app_asda1dsadxxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
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
             * <p>fcp_adasd12dxxxxx</p>
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

            public ApplicationFederatedCredentials build() {
                return new ApplicationFederatedCredentials(this);
            } 

        } 

    }
}
