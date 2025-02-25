// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListAScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAScriptsResponseBody</p>
 */
public class ListAScriptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AScripts")
    private java.util.List<AScripts> aScripts;

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
    public java.util.List<AScripts> getAScripts() {
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
        private java.util.List<AScripts> aScripts; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The AScript rules.</p>
         */
        public Builder aScripts(java.util.List<AScripts> aScripts) {
            this.aScripts = aScripts;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2CA81429-F160-593A-8AB5-A2A9617845B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * <blockquote>
         * <p>This parameter is optional. By default, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAScriptsResponseBody build() {
            return new ListAScriptsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAScriptsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAScriptsResponseBody</p>
     */
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
             * <p>The AScript rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>as-aznwocxofkakf7****</p>
             */
            public Builder aScriptId(String aScriptId) {
                this.aScriptId = aScriptId;
                return this;
            }

            /**
             * <p>The name of the AScript rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder aScriptName(String aScriptName) {
                this.aScriptName = aScriptName;
                return this;
            }

            /**
             * <p>The status of the AScript rule. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Configuring</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder aScriptStatus(String aScriptStatus) {
                this.aScriptStatus = aScriptStatus;
                return this;
            }

            /**
             * <p>Indicates whether the AScript rule is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-t0w1m9r6suiwmc****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The Application Load Balancer (ALB) instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-vv9rg2ub31tyec****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The content of the AScript rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{test}</p>
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
