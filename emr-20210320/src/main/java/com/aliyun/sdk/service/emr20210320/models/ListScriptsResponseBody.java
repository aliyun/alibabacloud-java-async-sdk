// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Scripts> scripts;

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
    public java.util.List < Scripts> getScripts() {
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
        private java.util.List < Scripts> scripts; 
        private Integer totalCount; 

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The scripts.
         */
        public Builder scripts(java.util.List < Scripts> scripts) {
            this.scripts = scripts;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScriptsResponseBody build() {
            return new ListScriptsResponseBody(this);
        } 

    } 

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
             * The name of the API operation.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The time when the system finishes the running of the script. This parameter is returned only if the ScriptType parameter is set to NORMAL.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The policy that is used to handle execution failures of the script. Valid values:
             * <p>
             * 
             * *   FAILED_CONTINUE
             * *   FAILED_BLOCK
             */
            public Builder executionFailStrategy(String executionFailStrategy) {
                this.executionFailStrategy = executionFailStrategy;
                return this;
            }

            /**
             * The time based on which the system runs the script. Valid values:
             * <p>
             * 
             * *   BEFORE_INSTALL
             * *   AFTER_STARTED
             */
            public Builder executionMoment(String executionMoment) {
                this.executionMoment = executionMoment;
                return this;
            }

            /**
             * The status of the script. This parameter is returned only if the `ScriptType` parameter is set to `NORMAL`. Valid values:
             * <p>
             * 
             * *   SCRIPT_COMPLETED
             * *   SCRIPT_SUBMISSION_FAILED
             * *   SCRIPT_RUNNING
             */
            public Builder executionState(String executionState) {
                this.executionState = executionState;
                return this;
            }

            /**
             * The time when the script was last modified.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * The node selector.
             */
            public Builder nodeSelector(NodeSelector nodeSelector) {
                this.nodeSelector = nodeSelector;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The runtime parameters of the script.
             */
            public Builder scriptArgs(String scriptArgs) {
                this.scriptArgs = scriptArgs;
                return this;
            }

            /**
             * The script ID.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * The name of the script.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * The path in which the script is stored.
             */
            public Builder scriptPath(String scriptPath) {
                this.scriptPath = scriptPath;
                return this;
            }

            /**
             * The time when the system starts to run the script. This parameter is returned only if the ScriptType parameter is set to NORMAL.
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
