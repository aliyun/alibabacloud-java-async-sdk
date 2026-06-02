// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link ListUserAuthConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserAuthConfigsResponseBody</p>
 */
public class ListUserAuthConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UserAuthConfigs")
    private java.util.List<UserAuthConfigs> userAuthConfigs;

    private ListUserAuthConfigsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userAuthConfigs = builder.userAuthConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAuthConfigsResponseBody create() {
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
     * @return userAuthConfigs
     */
    public java.util.List<UserAuthConfigs> getUserAuthConfigs() {
        return this.userAuthConfigs;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<UserAuthConfigs> userAuthConfigs; 

        private Builder() {
        } 

        private Builder(ListUserAuthConfigsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.userAuthConfigs = model.userAuthConfigs;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>35A48818-81F2-506C-891C-2296BE8DD667</p>
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
         * UserAuthConfigs.
         */
        public Builder userAuthConfigs(java.util.List<UserAuthConfigs> userAuthConfigs) {
            this.userAuthConfigs = userAuthConfigs;
            return this;
        }

        public ListUserAuthConfigsResponseBody build() {
            return new ListUserAuthConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserAuthConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserAuthConfigsResponseBody</p>
     */
    public static class UserAuthConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthConfigId")
        private String authConfigId;

        @com.aliyun.core.annotation.NameInMap("AuthConfigName")
        private String authConfigName;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("ConnectorVersion")
        private String connectorVersion;

        @com.aliyun.core.annotation.NameInMap("FlowCount")
        private Integer flowCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        private UserAuthConfigs(Builder builder) {
            this.authConfigId = builder.authConfigId;
            this.authConfigName = builder.authConfigName;
            this.authType = builder.authType;
            this.connectorId = builder.connectorId;
            this.connectorVersion = builder.connectorVersion;
            this.flowCount = builder.flowCount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAuthConfigs create() {
            return builder().build();
        }

        /**
         * @return authConfigId
         */
        public String getAuthConfigId() {
            return this.authConfigId;
        }

        /**
         * @return authConfigName
         */
        public String getAuthConfigName() {
            return this.authConfigName;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return connectorId
         */
        public String getConnectorId() {
            return this.connectorId;
        }

        /**
         * @return connectorVersion
         */
        public String getConnectorVersion() {
            return this.connectorVersion;
        }

        /**
         * @return flowCount
         */
        public Integer getFlowCount() {
            return this.flowCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        public static final class Builder {
            private String authConfigId; 
            private String authConfigName; 
            private String authType; 
            private String connectorId; 
            private String connectorVersion; 
            private Integer flowCount; 
            private String gmtCreate; 
            private String gmtModified; 

            private Builder() {
            } 

            private Builder(UserAuthConfigs model) {
                this.authConfigId = model.authConfigId;
                this.authConfigName = model.authConfigName;
                this.authType = model.authType;
                this.connectorId = model.connectorId;
                this.connectorVersion = model.connectorVersion;
                this.flowCount = model.flowCount;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
            } 

            /**
             * AuthConfigId.
             */
            public Builder authConfigId(String authConfigId) {
                this.authConfigId = authConfigId;
                return this;
            }

            /**
             * AuthConfigName.
             */
            public Builder authConfigName(String authConfigName) {
                this.authConfigName = authConfigName;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * ConnectorId.
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * ConnectorVersion.
             */
            public Builder connectorVersion(String connectorVersion) {
                this.connectorVersion = connectorVersion;
                return this;
            }

            /**
             * FlowCount.
             */
            public Builder flowCount(Integer flowCount) {
                this.flowCount = flowCount;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            public UserAuthConfigs build() {
                return new UserAuthConfigs(this);
            } 

        } 

    }
}
