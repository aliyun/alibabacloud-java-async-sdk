// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListScriptsResponseBody</p>
 */
public class ListScriptsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scripts")
    private java.util.List < Scripts> scripts;

    @NameInMap("TotalCount")
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
         * Scripts.
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
        @NameInMap("Action")
        private String action;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExecutionFailStrategy")
        private String executionFailStrategy;

        @NameInMap("ExecutionMoment")
        private String executionMoment;

        @NameInMap("ExecutionState")
        private String executionState;

        @NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @NameInMap("NodeSelector")
        private NodeSelector nodeSelector;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ScriptArgs")
        private String scriptArgs;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("ScriptName")
        private String scriptName;

        @NameInMap("ScriptPath")
        private String scriptPath;

        @NameInMap("StartTime")
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
             * API名称。
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * 结束执行时间。
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 执行失败策略。
             */
            public Builder executionFailStrategy(String executionFailStrategy) {
                this.executionFailStrategy = executionFailStrategy;
                return this;
            }

            /**
             * 执行时机。
             */
            public Builder executionMoment(String executionMoment) {
                this.executionMoment = executionMoment;
                return this;
            }

            /**
             * ExecutionState.
             */
            public Builder executionState(String executionState) {
                this.executionState = executionState;
                return this;
            }

            /**
             * 最近一次编辑时间。
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * 节点选择器。
             */
            public Builder nodeSelector(NodeSelector nodeSelector) {
                this.nodeSelector = nodeSelector;
                return this;
            }

            /**
             * 区域ID。
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 集群脚本执行参数。
             */
            public Builder scriptArgs(String scriptArgs) {
                this.scriptArgs = scriptArgs;
                return this;
            }

            /**
             * 脚本ID。
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * 集群脚本名称。
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * 集群脚本路径。
             */
            public Builder scriptPath(String scriptPath) {
                this.scriptPath = scriptPath;
                return this;
            }

            /**
             * 开始执行时间。
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
