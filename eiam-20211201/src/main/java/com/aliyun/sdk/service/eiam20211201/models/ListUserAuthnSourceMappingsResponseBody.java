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
 * {@link ListUserAuthnSourceMappingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserAuthnSourceMappingsResponseBody</p>
 */
public class ListUserAuthnSourceMappingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UserAuthnSourceMappings")
    private java.util.List<UserAuthnSourceMappings> userAuthnSourceMappings;

    private ListUserAuthnSourceMappingsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userAuthnSourceMappings = builder.userAuthnSourceMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAuthnSourceMappingsResponseBody create() {
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

    /**
     * @return userAuthnSourceMappings
     */
    public java.util.List<UserAuthnSourceMappings> getUserAuthnSourceMappings() {
        return this.userAuthnSourceMappings;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<UserAuthnSourceMappings> userAuthnSourceMappings; 

        private Builder() {
        } 

        private Builder(ListUserAuthnSourceMappingsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.userAuthnSourceMappings = model.userAuthnSourceMappings;
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

        /**
         * UserAuthnSourceMappings.
         */
        public Builder userAuthnSourceMappings(java.util.List<UserAuthnSourceMappings> userAuthnSourceMappings) {
            this.userAuthnSourceMappings = userAuthnSourceMappings;
            return this;
        }

        public ListUserAuthnSourceMappingsResponseBody build() {
            return new ListUserAuthnSourceMappingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserAuthnSourceMappingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserAuthnSourceMappingsResponseBody</p>
     */
    public static class UserAuthnSourceMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnSourceType")
        private String authnSourceType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
        private String identityProviderId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserExternalId")
        private String userExternalId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserAuthnSourceMappings(Builder builder) {
            this.authnSourceType = builder.authnSourceType;
            this.createTime = builder.createTime;
            this.identityProviderId = builder.identityProviderId;
            this.instanceId = builder.instanceId;
            this.updateTime = builder.updateTime;
            this.userExternalId = builder.userExternalId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAuthnSourceMappings create() {
            return builder().build();
        }

        /**
         * @return authnSourceType
         */
        public String getAuthnSourceType() {
            return this.authnSourceType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return identityProviderId
         */
        public String getIdentityProviderId() {
            return this.identityProviderId;
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

        /**
         * @return userExternalId
         */
        public String getUserExternalId() {
            return this.userExternalId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String authnSourceType; 
            private Long createTime; 
            private String identityProviderId; 
            private String instanceId; 
            private Long updateTime; 
            private String userExternalId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserAuthnSourceMappings model) {
                this.authnSourceType = model.authnSourceType;
                this.createTime = model.createTime;
                this.identityProviderId = model.identityProviderId;
                this.instanceId = model.instanceId;
                this.updateTime = model.updateTime;
                this.userExternalId = model.userExternalId;
                this.userId = model.userId;
            } 

            /**
             * <p>来源Idp类型</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:authntype:oidc</p>
             */
            public Builder authnSourceType(String authnSourceType) {
                this.authnSourceType = authnSourceType;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1762309642177</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>来源Idp Id</p>
             * 
             * <strong>example:</strong>
             * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>最近一次更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1762309642177</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>外部ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxx</p>
             */
            public Builder userExternalId(String userExternalId) {
                this.userExternalId = userExternalId;
                return this;
            }

            /**
             * <p>用户ID</p>
             * 
             * <strong>example:</strong>
             * <p>user_ue2jvisn35exxxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserAuthnSourceMappings build() {
                return new UserAuthnSourceMappings(this);
            } 

        } 

    }
}
