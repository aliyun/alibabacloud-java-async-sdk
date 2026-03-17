// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowLogsResponseBody</p>
 */
public class DescribeFlowLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowLogs")
    private FlowLogs flowLogs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFlowLogsResponseBody(Builder builder) {
        this.flowLogs = builder.flowLogs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowLogs
     */
    public FlowLogs getFlowLogs() {
        return this.flowLogs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private FlowLogs flowLogs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeFlowLogsResponseBody model) {
            this.flowLogs = model.flowLogs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of flow logs.</p>
         */
        public Builder flowLogs(FlowLogs flowLogs) {
            this.flowLogs = flowLogs;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>44F4E2D0-77F7-4DEC-969B-061688946143</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of flow logs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFlowLogsResponseBody build() {
            return new DescribeFlowLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
     */
    public static class FlowLogSetType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveAging")
        private Integer activeAging;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FlowLogId")
        private String flowLogId;

        @com.aliyun.core.annotation.NameInMap("InactiveAging")
        private Integer inactiveAging;

        @com.aliyun.core.annotation.NameInMap("LogstoreName")
        private String logstoreName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetflowServerIp")
        private String netflowServerIp;

        @com.aliyun.core.annotation.NameInMap("NetflowServerPort")
        private String netflowServerPort;

        @com.aliyun.core.annotation.NameInMap("NetflowVersion")
        private String netflowVersion;

        @com.aliyun.core.annotation.NameInMap("OutputType")
        private String outputType;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SlsRegionId")
        private String slsRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalSagNum")
        private Integer totalSagNum;

        private FlowLogSetType(Builder builder) {
            this.activeAging = builder.activeAging;
            this.description = builder.description;
            this.flowLogId = builder.flowLogId;
            this.inactiveAging = builder.inactiveAging;
            this.logstoreName = builder.logstoreName;
            this.name = builder.name;
            this.netflowServerIp = builder.netflowServerIp;
            this.netflowServerPort = builder.netflowServerPort;
            this.netflowVersion = builder.netflowVersion;
            this.outputType = builder.outputType;
            this.projectName = builder.projectName;
            this.resourceGroupId = builder.resourceGroupId;
            this.slsRegionId = builder.slsRegionId;
            this.status = builder.status;
            this.totalSagNum = builder.totalSagNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLogSetType create() {
            return builder().build();
        }

        /**
         * @return activeAging
         */
        public Integer getActiveAging() {
            return this.activeAging;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return flowLogId
         */
        public String getFlowLogId() {
            return this.flowLogId;
        }

        /**
         * @return inactiveAging
         */
        public Integer getInactiveAging() {
            return this.inactiveAging;
        }

        /**
         * @return logstoreName
         */
        public String getLogstoreName() {
            return this.logstoreName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netflowServerIp
         */
        public String getNetflowServerIp() {
            return this.netflowServerIp;
        }

        /**
         * @return netflowServerPort
         */
        public String getNetflowServerPort() {
            return this.netflowServerPort;
        }

        /**
         * @return netflowVersion
         */
        public String getNetflowVersion() {
            return this.netflowVersion;
        }

        /**
         * @return outputType
         */
        public String getOutputType() {
            return this.outputType;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return slsRegionId
         */
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalSagNum
         */
        public Integer getTotalSagNum() {
            return this.totalSagNum;
        }

        public static final class Builder {
            private Integer activeAging; 
            private String description; 
            private String flowLogId; 
            private Integer inactiveAging; 
            private String logstoreName; 
            private String name; 
            private String netflowServerIp; 
            private String netflowServerPort; 
            private String netflowVersion; 
            private String outputType; 
            private String projectName; 
            private String resourceGroupId; 
            private String slsRegionId; 
            private String status; 
            private Integer totalSagNum; 

            private Builder() {
            } 

            private Builder(FlowLogSetType model) {
                this.activeAging = model.activeAging;
                this.description = model.description;
                this.flowLogId = model.flowLogId;
                this.inactiveAging = model.inactiveAging;
                this.logstoreName = model.logstoreName;
                this.name = model.name;
                this.netflowServerIp = model.netflowServerIp;
                this.netflowServerPort = model.netflowServerPort;
                this.netflowVersion = model.netflowVersion;
                this.outputType = model.outputType;
                this.projectName = model.projectName;
                this.resourceGroupId = model.resourceGroupId;
                this.slsRegionId = model.slsRegionId;
                this.status = model.status;
                this.totalSagNum = model.totalSagNum;
            } 

            /**
             * <p>The output interval under active connections. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder activeAging(Integer activeAging) {
                this.activeAging = activeAging;
                return this;
            }

            /**
             * <p>The description of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>fl-7a56mar1kfw9vj****</p>
             */
            public Builder flowLogId(String flowLogId) {
                this.flowLogId = flowLogId;
                return this;
            }

            /**
             * <p>The output interval under inactive connections. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder inactiveAging(Integer inactiveAging) {
                this.inactiveAging = inactiveAging;
                return this;
            }

            /**
             * <p>The name of the Logstore in Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>config-operation-log</p>
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * <p>The name of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>DDE</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The address of the NetFlow collector where the flow log is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder netflowServerIp(String netflowServerIp) {
                this.netflowServerIp = netflowServerIp;
                return this;
            }

            /**
             * <p>The port number of the NetFlow collector that stores the flow log. Default value: <strong>9995</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>9995</p>
             */
            public Builder netflowServerPort(String netflowServerPort) {
                this.netflowServerPort = netflowServerPort;
                return this;
            }

            /**
             * <p>The protocol version number of the NetFlow collector that stores the flow log. Default value: <strong>V9</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>V9</p>
             */
            public Builder netflowVersion(String netflowVersion) {
                this.netflowVersion = netflowVersion;
                return this;
            }

            /**
             * <p>The location where the flow log is stored. Valid values:</p>
             * <ul>
             * <li><strong>sls</strong>: The flow log is stored in Log Service.</li>
             * <li><strong>netflow</strong>: The flow log is stored on a NetFlow collector.</li>
             * <li><strong>all</strong>: The flow log is stored both in Log Service and on a NetFlow collector.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
             */
            public Builder outputType(String outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * <p>The name of the Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-flowlog-shanghai</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the flow log belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2iu4fnc****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the region that the Log Service is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder slsRegionId(String slsRegionId) {
                this.slsRegionId = slsRegionId;
                return this;
            }

            /**
             * <p>The status of the flow log. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: The flow log is enabled.</li>
             * <li><strong>Inactive</strong>: The flow log is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of Smart Access gateway (SAG) instances with which the flow log is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalSagNum(Integer totalSagNum) {
                this.totalSagNum = totalSagNum;
                return this;
            }

            public FlowLogSetType build() {
                return new FlowLogSetType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
     */
    public static class FlowLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowLogSetType")
        private java.util.List<FlowLogSetType> flowLogSetType;

        private FlowLogs(Builder builder) {
            this.flowLogSetType = builder.flowLogSetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLogs create() {
            return builder().build();
        }

        /**
         * @return flowLogSetType
         */
        public java.util.List<FlowLogSetType> getFlowLogSetType() {
            return this.flowLogSetType;
        }

        public static final class Builder {
            private java.util.List<FlowLogSetType> flowLogSetType; 

            private Builder() {
            } 

            private Builder(FlowLogs model) {
                this.flowLogSetType = model.flowLogSetType;
            } 

            /**
             * FlowLogSetType.
             */
            public Builder flowLogSetType(java.util.List<FlowLogSetType> flowLogSetType) {
                this.flowLogSetType = flowLogSetType;
                return this;
            }

            public FlowLogs build() {
                return new FlowLogs(this);
            } 

        } 

    }
}
