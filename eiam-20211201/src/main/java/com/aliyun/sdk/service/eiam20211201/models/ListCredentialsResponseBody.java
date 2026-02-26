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
 * {@link ListCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCredentialsResponseBody</p>
 */
public class ListCredentialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Credentials")
    private java.util.List<Credentials> credentials;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCredentialsResponseBody(Builder builder) {
        this.credentials = builder.credentials;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCredentialsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentials
     */
    public java.util.List<Credentials> getCredentials() {
        return this.credentials;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Credentials> credentials; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCredentialsResponseBody model) {
            this.credentials = model.credentials;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Credentials.
         */
        public Builder credentials(java.util.List<Credentials> credentials) {
            this.credentials = credentials;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCredentialsResponseBody build() {
            return new ListCredentialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCredentialsResponseBody</p>
     */
    public static class OAuthClientContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        private OAuthClientContent(Builder builder) {
            this.clientId = builder.clientId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OAuthClientContent create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        public static final class Builder {
            private String clientId; 

            private Builder() {
            } 

            private Builder(OAuthClientContent model) {
                this.clientId = model.clientId;
            } 

            /**
             * <p>OAuth协议的client_id</p>
             * 
             * <strong>example:</strong>
             * <p>dmvncmxersdxxxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            public OAuthClientContent build() {
                return new OAuthClientContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCredentialsResponseBody</p>
     */
    public static class CredentialContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OAuthClientContent")
        private OAuthClientContent oAuthClientContent;

        private CredentialContent(Builder builder) {
            this.oAuthClientContent = builder.oAuthClientContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialContent create() {
            return builder().build();
        }

        /**
         * @return oAuthClientContent
         */
        public OAuthClientContent getOAuthClientContent() {
            return this.oAuthClientContent;
        }

        public static final class Builder {
            private OAuthClientContent oAuthClientContent; 

            private Builder() {
            } 

            private Builder(CredentialContent model) {
                this.oAuthClientContent = model.oAuthClientContent;
            } 

            /**
             * <p>OAuth客户端认证凭证类型的凭据内容。</p>
             */
            public Builder oAuthClientContent(OAuthClientContent oAuthClientContent) {
                this.oAuthClientContent = oAuthClientContent;
                return this;
            }

            public CredentialContent build() {
                return new CredentialContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCredentialsResponseBody</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CredentialContent")
        private CredentialContent credentialContent;

        @com.aliyun.core.annotation.NameInMap("CredentialCreationType")
        private String credentialCreationType;

        @com.aliyun.core.annotation.NameInMap("CredentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("CredentialIdentifier")
        private String credentialIdentifier;

        @com.aliyun.core.annotation.NameInMap("CredentialName")
        private String credentialName;

        @com.aliyun.core.annotation.NameInMap("CredentialScenarioLabel")
        private String credentialScenarioLabel;

        @com.aliyun.core.annotation.NameInMap("CredentialSubjectId")
        private String credentialSubjectId;

        @com.aliyun.core.annotation.NameInMap("CredentialSubjectType")
        private String credentialSubjectType;

        @com.aliyun.core.annotation.NameInMap("CredentialType")
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Credentials(Builder builder) {
            this.createTime = builder.createTime;
            this.credentialContent = builder.credentialContent;
            this.credentialCreationType = builder.credentialCreationType;
            this.credentialId = builder.credentialId;
            this.credentialIdentifier = builder.credentialIdentifier;
            this.credentialName = builder.credentialName;
            this.credentialScenarioLabel = builder.credentialScenarioLabel;
            this.credentialSubjectId = builder.credentialSubjectId;
            this.credentialSubjectType = builder.credentialSubjectType;
            this.credentialType = builder.credentialType;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialContent
         */
        public CredentialContent getCredentialContent() {
            return this.credentialContent;
        }

        /**
         * @return credentialCreationType
         */
        public String getCredentialCreationType() {
            return this.credentialCreationType;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return credentialIdentifier
         */
        public String getCredentialIdentifier() {
            return this.credentialIdentifier;
        }

        /**
         * @return credentialName
         */
        public String getCredentialName() {
            return this.credentialName;
        }

        /**
         * @return credentialScenarioLabel
         */
        public String getCredentialScenarioLabel() {
            return this.credentialScenarioLabel;
        }

        /**
         * @return credentialSubjectId
         */
        public String getCredentialSubjectId() {
            return this.credentialSubjectId;
        }

        /**
         * @return credentialSubjectType
         */
        public String getCredentialSubjectType() {
            return this.credentialSubjectType;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
            private Long createTime; 
            private CredentialContent credentialContent; 
            private String credentialCreationType; 
            private String credentialId; 
            private String credentialIdentifier; 
            private String credentialName; 
            private String credentialScenarioLabel; 
            private String credentialSubjectId; 
            private String credentialSubjectType; 
            private String credentialType; 
            private String description; 
            private String instanceId; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.createTime = model.createTime;
                this.credentialContent = model.credentialContent;
                this.credentialCreationType = model.credentialCreationType;
                this.credentialId = model.credentialId;
                this.credentialIdentifier = model.credentialIdentifier;
                this.credentialName = model.credentialName;
                this.credentialScenarioLabel = model.credentialScenarioLabel;
                this.credentialSubjectId = model.credentialSubjectId;
                this.credentialSubjectType = model.credentialSubjectType;
                this.credentialType = model.credentialType;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>云角色创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>凭据的内容。</p>
             */
            public Builder credentialContent(CredentialContent credentialContent) {
                this.credentialContent = credentialContent;
                return this;
            }

            /**
             * <p>凭据的创建类型。</p>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder credentialCreationType(String credentialCreationType) {
                this.credentialCreationType = credentialCreationType;
                return this;
            }

            /**
             * <p>凭据ID。</p>
             * 
             * <strong>example:</strong>
             * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <p>凭据标识</p>
             * 
             * <strong>example:</strong>
             * <p>credential_identifier_test</p>
             */
            public Builder credentialIdentifier(String credentialIdentifier) {
                this.credentialIdentifier = credentialIdentifier;
                return this;
            }

            /**
             * <p>凭据名称</p>
             * 
             * <strong>example:</strong>
             * <p>credential_name</p>
             */
            public Builder credentialName(String credentialName) {
                this.credentialName = credentialName;
                return this;
            }

            /**
             * <p>凭据的使用场景标签。</p>
             * 
             * <strong>example:</strong>
             * <p>llm</p>
             */
            public Builder credentialScenarioLabel(String credentialScenarioLabel) {
                this.credentialScenarioLabel = credentialScenarioLabel;
                return this;
            }

            /**
             * <p>凭据所属的主体ID。</p>
             * 
             * <strong>example:</strong>
             * <p>apt_werthgfdsasffxxxxx</p>
             */
            public Builder credentialSubjectId(String credentialSubjectId) {
                this.credentialSubjectId = credentialSubjectId;
                return this;
            }

            /**
             * <p>凭据所属的主体类型。</p>
             * 
             * <strong>example:</strong>
             * <p>authentication_token_provider</p>
             */
            public Builder credentialSubjectType(String credentialSubjectType) {
                this.credentialSubjectType = credentialSubjectType;
                return this;
            }

            /**
             * <p>凭据类型。</p>
             * 
             * <strong>example:</strong>
             * <p>api_key</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>描述</p>
             * 
             * <strong>example:</strong>
             * <p>credential_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>EIAM实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>凭据状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>云角色更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1649830227000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
