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
 * {@link ListAuthorizationResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizationResourcesResponseBody</p>
 */
public class ListAuthorizationResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationResources")
    private java.util.List<AuthorizationResources> authorizationResources;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAuthorizationResourcesResponseBody(Builder builder) {
        this.authorizationResources = builder.authorizationResources;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizationResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationResources
     */
    public java.util.List<AuthorizationResources> getAuthorizationResources() {
        return this.authorizationResources;
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
        private java.util.List<AuthorizationResources> authorizationResources; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAuthorizationResourcesResponseBody model) {
            this.authorizationResources = model.authorizationResources;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AuthorizationResources.
         */
        public Builder authorizationResources(java.util.List<AuthorizationResources> authorizationResources) {
            this.authorizationResources = authorizationResources;
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

        public ListAuthorizationResourcesResponseBody build() {
            return new ListAuthorizationResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizationResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizationResourcesResponseBody</p>
     */
    public static class AuthorizationResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationResourceEntityId")
        private String authorizationResourceEntityId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationResourceEntityType")
        private String authorizationResourceEntityType;

        @com.aliyun.core.annotation.NameInMap("AuthorizationResourceId")
        private String authorizationResourceId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
        private String authorizationRuleId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountId")
        private String cloudAccountId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private AuthorizationResources(Builder builder) {
            this.authorizationResourceEntityId = builder.authorizationResourceEntityId;
            this.authorizationResourceEntityType = builder.authorizationResourceEntityType;
            this.authorizationResourceId = builder.authorizationResourceId;
            this.authorizationRuleId = builder.authorizationRuleId;
            this.cloudAccountId = builder.cloudAccountId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationResources create() {
            return builder().build();
        }

        /**
         * @return authorizationResourceEntityId
         */
        public String getAuthorizationResourceEntityId() {
            return this.authorizationResourceEntityId;
        }

        /**
         * @return authorizationResourceEntityType
         */
        public String getAuthorizationResourceEntityType() {
            return this.authorizationResourceEntityType;
        }

        /**
         * @return authorizationResourceId
         */
        public String getAuthorizationResourceId() {
            return this.authorizationResourceId;
        }

        /**
         * @return authorizationRuleId
         */
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        /**
         * @return cloudAccountId
         */
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String authorizationResourceEntityId; 
            private String authorizationResourceEntityType; 
            private String authorizationResourceId; 
            private String authorizationRuleId; 
            private String cloudAccountId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(AuthorizationResources model) {
                this.authorizationResourceEntityId = model.authorizationResourceEntityId;
                this.authorizationResourceEntityType = model.authorizationResourceEntityType;
                this.authorizationResourceId = model.authorizationResourceId;
                this.authorizationRuleId = model.authorizationRuleId;
                this.cloudAccountId = model.cloudAccountId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>资源实体标识</p>
             * 
             * <strong>example:</strong>
             * <p>carole_01kmek49aqxxxx</p>
             */
            public Builder authorizationResourceEntityId(String authorizationResourceEntityId) {
                this.authorizationResourceEntityId = authorizationResourceEntityId;
                return this;
            }

            /**
             * <p>资源实体类型，枚举类型：asset（资产）、credential（凭据）、cloud_identity_role（云账号角色）</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_account_role</p>
             */
            public Builder authorizationResourceEntityType(String authorizationResourceEntityType) {
                this.authorizationResourceEntityType = authorizationResourceEntityType;
                return this;
            }

            /**
             * <p>授权资源标识</p>
             * 
             * <strong>example:</strong>
             * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
             */
            public Builder authorizationResourceId(String authorizationResourceId) {
                this.authorizationResourceId = authorizationResourceId;
                return this;
            }

            /**
             * <p>授权规则标识</p>
             * 
             * <strong>example:</strong>
             * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * <p>云账号ID。</p>
             * 
             * <strong>example:</strong>
             * <p>ca_01kmegjc11qa1txxxxx</p>
             */
            public Builder cloudAccountId(String cloudAccountId) {
                this.cloudAccountId = cloudAccountId;
                return this;
            }

            /**
             * <p>实例ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public AuthorizationResources build() {
                return new AuthorizationResources(this);
            } 

        } 

    }
}
