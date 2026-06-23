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
 * {@link ListAuthorizationServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizationServersResponseBody</p>
 */
public class ListAuthorizationServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationServers")
    private java.util.List<AuthorizationServers> authorizationServers;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAuthorizationServersResponseBody(Builder builder) {
        this.authorizationServers = builder.authorizationServers;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizationServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationServers
     */
    public java.util.List<AuthorizationServers> getAuthorizationServers() {
        return this.authorizationServers;
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
        private java.util.List<AuthorizationServers> authorizationServers; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAuthorizationServersResponseBody model) {
            this.authorizationServers = model.authorizationServers;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>授权服务器列表。</p>
         */
        public Builder authorizationServers(java.util.List<AuthorizationServers> authorizationServers) {
            this.authorizationServers = authorizationServers;
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

        public ListAuthorizationServersResponseBody build() {
            return new ListAuthorizationServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizationServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizationServersResponseBody</p>
     */
    public static class AuthorizationServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationServerId")
        private String authorizationServerId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationServerName")
        private String authorizationServerName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreationType")
        private String creationType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("IssuerDomain")
        private String issuerDomain;

        @com.aliyun.core.annotation.NameInMap("IssuerMode")
        private String issuerMode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private AuthorizationServers(Builder builder) {
            this.authorizationServerId = builder.authorizationServerId;
            this.authorizationServerName = builder.authorizationServerName;
            this.createTime = builder.createTime;
            this.creationType = builder.creationType;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.issuer = builder.issuer;
            this.issuerDomain = builder.issuerDomain;
            this.issuerMode = builder.issuerMode;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationServers create() {
            return builder().build();
        }

        /**
         * @return authorizationServerId
         */
        public String getAuthorizationServerId() {
            return this.authorizationServerId;
        }

        /**
         * @return authorizationServerName
         */
        public String getAuthorizationServerName() {
            return this.authorizationServerName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creationType
         */
        public String getCreationType() {
            return this.creationType;
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
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return issuerDomain
         */
        public String getIssuerDomain() {
            return this.issuerDomain;
        }

        /**
         * @return issuerMode
         */
        public String getIssuerMode() {
            return this.issuerMode;
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
            private String authorizationServerId; 
            private String authorizationServerName; 
            private Long createTime; 
            private String creationType; 
            private String description; 
            private String instanceId; 
            private String issuer; 
            private String issuerDomain; 
            private String issuerMode; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(AuthorizationServers model) {
                this.authorizationServerId = model.authorizationServerId;
                this.authorizationServerName = model.authorizationServerName;
                this.createTime = model.createTime;
                this.creationType = model.creationType;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.issuer = model.issuer;
                this.issuerDomain = model.issuerDomain;
                this.issuerMode = model.issuerMode;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>授权服务器唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>iauths_system</p>
             */
            public Builder authorizationServerId(String authorizationServerId) {
                this.authorizationServerId = authorizationServerId;
                return this;
            }

            /**
             * <p>授权服务器名称</p>
             * 
             * <strong>example:</strong>
             * <p>my_authorization_server</p>
             */
            public Builder authorizationServerName(String authorizationServerName) {
                this.authorizationServerName = authorizationServerName;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>创建类型：system_init-系统默认创建，jwt_credential_provider-JWT凭据提供商创建，user_custom-用户创建</p>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder creationType(String creationType) {
                this.creationType = creationType;
                return this;
            }

            /**
             * <p>授权服务器描述</p>
             * 
             * <strong>example:</strong>
             * <p>description of authorization server</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>当前生效的Issuer地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/token">https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/token</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>Issuer使用的域名，可为初始化域名或已添加的自定义域名</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx.aliyunidaas.com</p>
             */
            public Builder issuerDomain(String issuerDomain) {
                this.issuerDomain = issuerDomain;
                return this;
            }

            /**
             * <p>Issuer模式：dynamic-动态基于请求域名，static-使用固定域名</p>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder issuerMode(String issuerMode) {
                this.issuerMode = issuerMode;
                return this;
            }

            /**
             * <p>状态：enabled / disabled</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AuthorizationServers build() {
                return new AuthorizationServers(this);
            } 

        } 

    }
}
