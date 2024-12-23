// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListScriptsResponseBody</p>
 */
public class ListScriptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scripts")
    private java.util.List<Scripts> scripts;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListScriptsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.scripts = builder.scripts;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptsResponseBody create() {
        return builder().build();
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
     * @return scripts
     */
    public java.util.List<Scripts> getScripts() {
        return this.scripts;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Scripts> scripts; 
        private Integer totalCount; 

        /**
         * <p>The maximum number of records returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The position of the data read.</p>
         * 
         * <strong>example:</strong>
         * <p>dd6b1b2a-5837-5237-abe4-ff0c89568982</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of scripts.</p>
         */
        public Builder scripts(java.util.List<Scripts> scripts) {
            this.scripts = scripts;
            return this;
        }

        /**
         * <p>The total amount of data under the conditions of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScriptsResponseBody build() {
            return new ListScriptsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScriptsResponseBody} extends {@link TeaModel}
     *
     * <p>ListScriptsResponseBody</p>
     */
    public static class Scripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ExecutionFailStrategy")
        private String executionFailStrategy;

        @com.aliyun.core.annotation.NameInMap("ExecutionMoment")
        private String executionMoment;

        @com.aliyun.core.annotation.NameInMap("ExecutionState")
        private String executionState;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("NodeSelector")
        private NodeSelector nodeSelector;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ScriptArgs")
        private String scriptArgs;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("ScriptPath")
        private String scriptPath;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Scripts(Builder builder) {
            this.action = builder.action;
            this.endTime = builder.endTime;
            this.executionFailStrategy = builder.executionFailStrategy;
            this.executionMoment = builder.executionMoment;
            this.executionState = builder.executionState;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.nodeSelector = builder.nodeSelector;
            this.regionId = builder.regionId;
            this.scriptArgs = builder.scriptArgs;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.scriptPath = builder.scriptPath;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scripts create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return executionFailStrategy
         */
        public String getExecutionFailStrategy() {
            return this.executionFailStrategy;
        }

        /**
         * @return executionMoment
         */
        public String getExecutionMoment() {
            return this.executionMoment;
        }

        /**
         * @return executionState
         */
        public String getExecutionState() {
            return this.executionState;
        }

        /**
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return nodeSelector
         */
        public NodeSelector getNodeSelector() {
            return this.nodeSelector;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scriptArgs
         */
        public String getScriptArgs() {
            return this.scriptArgs;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return scriptPath
         */
        public String getScriptPath() {
            return this.scriptPath;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String action; 
            private Long endTime; 
            private String executionFailStrategy; 
            private String executionMoment; 
            private String executionState; 
            private Long lastUpdateTime; 
            private NodeSelector nodeSelector; 
            private String regionId; 
            private String scriptArgs; 
            private String scriptId; 
            private String scriptName; 
            private String scriptPath; 
            private Long startTime; 

            /**
             * <p>API name.</p>
             * 
             * <strong>example:</strong>
             * <p>ListScripts</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>End execution time. This value is returned only when <code>ScriptType</code> is <code>NORMAL</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1639715635819</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Execution failure strategy. Possible values:</p>
             * <ul>
             * <li>FAILED_CONTINUE: Continue after failure.</li>
             * <li>FAILED_BLOCK: Block after failure.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAILED_CONTINUE</p>
             */
            public Builder executionFailStrategy(String executionFailStrategy) {
                this.executionFailStrategy = executionFailStrategy;
                return this;
            }

            /**
             * <p>Execution timing. Possible values:</p>
             * <ul>
             * <li>BEFORE_INSTALL: Before application installation.</li>
             * <li>AFTER_STARTED: After application startup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BEFORE_INSTALL</p>
             */
            public Builder executionMoment(String executionMoment) {
                this.executionMoment = executionMoment;
                return this;
            }

            /**
             * <p>Script execution state. This value is returned only when <code>ScriptType</code> is <code>NORMAL</code>. Possible values:</p>
             * <ul>
             * <li>SCRIPT_COMPLETED: Script executed successfully.</li>
             * <li>SCRIPT_SUBMISSION_FAILED: Script execution failed.</li>
             * <li>SCRIPT_RUNNING: Script is running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SCRIPT_COMPLETED</p>
             */
            public Builder executionState(String executionState) {
                this.executionState = executionState;
                return this;
            }

            /**
             * <p>Time of the last update.</p>
             * 
             * <strong>example:</strong>
             * <p>1639714634819</p>
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * <p>Node selector.</p>
             */
            public Builder nodeSelector(NodeSelector nodeSelector) {
                this.nodeSelector = nodeSelector;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Script execution parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>--mode=client -h -p</p>
             */
            public Builder scriptArgs(String scriptArgs) {
                this.scriptArgs = scriptArgs;
                return this;
            }

            /**
             * <p>Script ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-bf25219d103043a0820613e32781****</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>Script name.</p>
             * 
             * <strong>example:</strong>
             * <p>check_env</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>Script path.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket1/check_evn.sh</p>
             */
            public Builder scriptPath(String scriptPath) {
                this.scriptPath = scriptPath;
                return this;
            }

            /**
             * <p>Start execution time. This value is returned only when <code>ScriptType</code> is <code>NORMAL</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1639714634000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Scripts build() {
                return new Scripts(this);
            } 

        } 

    }
}
