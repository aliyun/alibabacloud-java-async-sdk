// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceHealthInspectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceHealthInspectionsResponseBody</p>
 */
public class ListResourceHealthInspectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthInspections")
    private java.util.List < HealthInspections> healthInspections;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListResourceHealthInspectionsResponseBody(Builder builder) {
        this.healthInspections = builder.healthInspections;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceHealthInspectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return healthInspections
     */
    public java.util.List < HealthInspections> getHealthInspections() {
        return this.healthInspections;
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
        private java.util.List < HealthInspections> healthInspections; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * HealthInspections.
         */
        public Builder healthInspections(java.util.List < HealthInspections> healthInspections) {
            this.healthInspections = healthInspections;
            return this;
        }

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
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceHealthInspectionsResponseBody build() {
            return new ListResourceHealthInspectionsResponseBody(this);
        } 

    } 

    public static class HealthInspections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("HealthMessage")
        private String healthMessage;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("InspectionName")
        private String inspectionName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ReportTime")
        private Long reportTime;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private HealthInspections(Builder builder) {
            this.applicationName = builder.applicationName;
            this.componentName = builder.componentName;
            this.healthMessage = builder.healthMessage;
            this.healthStatus = builder.healthStatus;
            this.inspectionName = builder.inspectionName;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.reportTime = builder.reportTime;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthInspections create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return healthMessage
         */
        public String getHealthMessage() {
            return this.healthMessage;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return inspectionName
         */
        public String getInspectionName() {
            return this.inspectionName;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return reportTime
         */
        public Long getReportTime() {
            return this.reportTime;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String applicationName; 
            private String componentName; 
            private String healthMessage; 
            private String healthStatus; 
            private String inspectionName; 
            private String nodeId; 
            private String nodeName; 
            private Long reportTime; 
            private String ruleName; 

            /**
             * 应用名称。
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * 组件名称。
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * 健康详细信息。
             */
            public Builder healthMessage(String healthMessage) {
                this.healthMessage = healthMessage;
                return this;
            }

            /**
             * 健康状态。
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * 巡检项名称。
             */
            public Builder inspectionName(String inspectionName) {
                this.inspectionName = inspectionName;
                return this;
            }

            /**
             * 节点ID。
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 节点名称。
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * 最近上报时间戳。
             */
            public Builder reportTime(Long reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * 规则名称。
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public HealthInspections build() {
                return new HealthInspections(this);
            } 

        } 

    }
}
