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
         * <p>The list of authorized resources.</p>
         */
        public Builder authorizationResources(java.util.List<AuthorizationResources> authorizationResources) {
            this.authorizationResources = authorizationResources;
            return this;
        }

        /**
         * <p>The number of rows per page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned in this call, which is used for the next paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
    public static class CredentialCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowSameNameIdentity")
        private Boolean allowSameNameIdentity;

        private CredentialCondition(Builder builder) {
            this.allowSameNameIdentity = builder.allowSameNameIdentity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialCondition create() {
            return builder().build();
        }

        /**
         * @return allowSameNameIdentity
         */
        public Boolean getAllowSameNameIdentity() {
            return this.allowSameNameIdentity;
        }

        public static final class Builder {
            private Boolean allowSameNameIdentity; 

            private Builder() {
            } 

            private Builder(CredentialCondition model) {
                this.allowSameNameIdentity = model.allowSameNameIdentity;
            } 

            /**
             * <p>Specifies whether same-name identity accounts are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowSameNameIdentity(Boolean allowSameNameIdentity) {
                this.allowSameNameIdentity = allowSameNameIdentity;
                return this;
            }

            public CredentialCondition build() {
                return new CredentialCondition(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthorizationResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizationResourcesResponseBody</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CredentialCondition")
        private CredentialCondition credentialCondition;

        private Condition(Builder builder) {
            this.credentialCondition = builder.credentialCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return credentialCondition
         */
        public CredentialCondition getCredentialCondition() {
            return this.credentialCondition;
        }

        public static final class Builder {
            private CredentialCondition credentialCondition; 

            private Builder() {
            } 

            private Builder(Condition model) {
                this.credentialCondition = model.credentialCondition;
            } 

            /**
             * <p>The effective condition when used as a credential.</p>
             */
            public Builder credentialCondition(CredentialCondition credentialCondition) {
                this.credentialCondition = credentialCondition;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("Condition")
        private Condition condition;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private AuthorizationResources(Builder builder) {
            this.authorizationResourceEntityId = builder.authorizationResourceEntityId;
            this.authorizationResourceEntityType = builder.authorizationResourceEntityType;
            this.authorizationResourceId = builder.authorizationResourceId;
            this.authorizationRuleId = builder.authorizationRuleId;
            this.cloudAccountId = builder.cloudAccountId;
            this.condition = builder.condition;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.updateTime = builder.updateTime;
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
         * @return condition
         */
        public Condition getCondition() {
            return this.condition;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String authorizationResourceEntityId; 
            private String authorizationResourceEntityType; 
            private String authorizationResourceId; 
            private String authorizationRuleId; 
            private String cloudAccountId; 
            private Condition condition; 
            private Long createTime; 
            private String instanceId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(AuthorizationResources model) {
                this.authorizationResourceEntityId = model.authorizationResourceEntityId;
                this.authorizationResourceEntityType = model.authorizationResourceEntityType;
                this.authorizationResourceId = model.authorizationResourceId;
                this.authorizationRuleId = model.authorizationRuleId;
                this.cloudAccountId = model.cloudAccountId;
                this.condition = model.condition;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the resource entity associated with the authorized resource.</p>
             * 
             * <strong>example:</strong>
             * <p>carole_01kmek49aqxxxx</p>
             */
            public Builder authorizationResourceEntityId(String authorizationResourceEntityId) {
                this.authorizationResourceEntityId = authorizationResourceEntityId;
                return this;
            }

            /**
             * <p>The type of the resource entity associated with the authorized resource. Valid values:</p>
             * <ul>
             * <li>cloud_account_role: cloud role.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_account_role</p>
             */
            public Builder authorizationResourceEntityType(String authorizationResourceEntityType) {
                this.authorizationResourceEntityType = authorizationResourceEntityType;
                return this;
            }

            /**
             * <p>The authorization resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>arres_01kgh3jvt7pk093rv6giu0c0qxxxx</p>
             */
            public Builder authorizationResourceId(String authorizationResourceId) {
                this.authorizationResourceId = authorizationResourceId;
                return this;
            }

            /**
             * <p>The authorization rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * <p>The ID of the cloud account to which the resource entity associated with the authorized resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ca_01kmegjc11qa1txxxxx</p>
             */
            public Builder cloudAccountId(String cloudAccountId) {
                this.cloudAccountId = cloudAccountId;
                return this;
            }

            /**
             * <p>The effective condition.</p>
             */
            public Builder condition(Condition condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The creation time, in UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1768789292000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The update time, in UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1768789292000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AuthorizationResources build() {
                return new AuthorizationResources(this);
            } 

        } 

    }
}
