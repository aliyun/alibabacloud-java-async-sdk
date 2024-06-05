// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAScriptsResponseBody</p>
 */
public class ListAScriptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AScripts")
    private java.util.List < AScripts> aScripts;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAScriptsResponseBody(Builder builder) {
        this.aScripts = builder.aScripts;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAScriptsResponseBody create() {
        return builder().build();
    }

    /**
     * @return aScripts
     */
    public java.util.List < AScripts> getAScripts() {
        return this.aScripts;
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

    public static final class Builder {
        private java.util.List < AScripts> aScripts; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The AScript rules.
         */
        public Builder aScripts(java.util.List < AScripts> aScripts) {
            this.aScripts = aScripts;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         * <p>
         * 
         * > This parameter is optional. By default, this parameter is not returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAScriptsResponseBody build() {
            return new ListAScriptsResponseBody(this);
        } 

    } 

    public static class AScripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AScriptId")
        private String aScriptId;

        @com.aliyun.core.annotation.NameInMap("AScriptName")
        private String aScriptName;

        @com.aliyun.core.annotation.NameInMap("AScriptStatus")
        private String aScriptStatus;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("ScriptContent")
        private String scriptContent;

        private AScripts(Builder builder) {
            this.aScriptId = builder.aScriptId;
            this.aScriptName = builder.aScriptName;
            this.aScriptStatus = builder.aScriptStatus;
            this.enabled = builder.enabled;
            this.listenerId = builder.listenerId;
            this.loadBalancerId = builder.loadBalancerId;
            this.scriptContent = builder.scriptContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AScripts create() {
            return builder().build();
        }

        /**
         * @return aScriptId
         */
        public String getAScriptId() {
            return this.aScriptId;
        }

        /**
         * @return aScriptName
         */
        public String getAScriptName() {
            return this.aScriptName;
        }

        /**
         * @return aScriptStatus
         */
        public String getAScriptStatus() {
            return this.aScriptStatus;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return scriptContent
         */
        public String getScriptContent() {
            return this.scriptContent;
        }

        public static final class Builder {
            private String aScriptId; 
            private String aScriptName; 
            private String aScriptStatus; 
            private Boolean enabled; 
            private String listenerId; 
            private String loadBalancerId; 
            private String scriptContent; 

            /**
             * The AScript rule ID.
             */
            public Builder aScriptId(String aScriptId) {
                this.aScriptId = aScriptId;
                return this;
            }

            /**
             * The name of the AScript rule.
             */
            public Builder aScriptName(String aScriptName) {
                this.aScriptName = aScriptName;
                return this;
            }

            /**
             * The status of the AScript rule. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Available**
             * *   **Configuring**
             * *   **Deleting**
             */
            public Builder aScriptStatus(String aScriptStatus) {
                this.aScriptStatus = aScriptStatus;
                return this;
            }

            /**
             * Indicates whether the AScript rule is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The listener ID.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The Application Load Balancer (ALB) instance ID.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The content of the AScript rule.
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
                return this;
            }

            public AScripts build() {
                return new AScripts(this);
            } 

        } 

    }
}
