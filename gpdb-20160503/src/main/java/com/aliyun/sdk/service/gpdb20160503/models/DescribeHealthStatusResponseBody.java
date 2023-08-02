// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthStatusResponseBody</p>
 */
public class DescribeHealthStatusResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Status status;

    private DescribeHealthStatusResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Status getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String requestId; 
        private Status status; 

        /**
         * The ID of instance.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of performance metrics. Each performance metric consists of the parameter name, status, and metric value. The metric information is returned only for the performance parameters specified by **Key**. For example, if you set **Key** to **adbpg_status**, only the metric information of **adbpg_status** is returned.
         * <p>
         * 
         * For more information about performance parameters, see [Performance parameters](~~86943~~).
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        public DescribeHealthStatusResponseBody build() {
            return new DescribeHealthStatusResponseBody(this);
        } 

    } 

    public static class AdbgpSegmentDiskUsagePercentMax extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private AdbgpSegmentDiskUsagePercentMax(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbgpSegmentDiskUsagePercentMax create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The status corresponding to the maximum storage usage among all compute nodes. Valid values:
             * <p>
             * 
             * *   **critical**: The compute node storage usage is greater than or equal to 90%. In this case, the instance is locked.
             * *   **warning**: The compute node storage usage is greater than or equal to 80% and less than 90%.
             * *   **healthy**: The compute node storage usage is less than 80%.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of maximum compute node storage usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbgpSegmentDiskUsagePercentMax build() {
                return new AdbgpSegmentDiskUsagePercentMax(this);
            } 

        } 

    }
    public static class AdbpgConnectionStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private AdbpgConnectionStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgConnectionStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The connection health status of the instance. Valid values:
             * <p>
             * 
             * *   **critical**: The instance connection usage is greater than 95%. In this case, this metric is marked in red in the console.
             * *   **warning**: The instance connection usage is greater than 90% and less than or equal to 95%. In this case, this metric is marked in yellow in the console.
             * *   **healthy**: The instance connection usage is less than or equal to 90%. In this case, this metric is marked in green in the console.
             * 
             * >  The instance connection usage is the maximum connection usage among all the coordinator and compute nodes.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of instance connection usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgConnectionStatus build() {
                return new AdbpgConnectionStatus(this);
            } 

        } 

    }
    public static class AdbpgDiskStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private AdbpgDiskStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgDiskStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The storage status of the instance. Valid values:
             * <p>
             * 
             * *   **critical**: The instance storage usage is greater than or equal to 90%. In this case, this metric is marked in red in the console and the instance is locked.
             * *   **warning**: The instance storage usage is greater than or equal to 70% and less than 90%. In this case, this metric is marked in yellow in the console.
             * *   **healthy**: The instance storage usage is less than 70%. In this case, this metric is marked in green in the console.
             * 
             * >  The instance storage usage is the average storage usage of all compute nodes.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of instance storage usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgDiskStatus build() {
                return new AdbpgDiskStatus(this);
            } 

        } 

    }
    public static class AdbpgDiskUsagePercent extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private AdbpgDiskUsagePercent(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgDiskUsagePercent create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The status corresponding to the storage usage of the instance. Valid values:
             * <p>
             * 
             * *   **critical**: The instance storage usage is greater than or equal to 90%. In this case, the instance is locked.
             * *   **warning**: The instance storage usage is greater than or equal to 70% and less than 90%.
             * *   **healthy**: The instance storage usage is less than 70%.
             * 
             * >  The instance storage usage is the average storage usage of all compute nodes.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of instance storage usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgDiskUsagePercent build() {
                return new AdbpgDiskUsagePercent(this);
            } 

        } 

    }
    public static class AdbpgInstanceColdDataGb extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private AdbpgInstanceColdDataGb(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgInstanceColdDataGb create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The metric value of instance storage usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgInstanceColdDataGb build() {
                return new AdbpgInstanceColdDataGb(this);
            } 

        } 

    }
    public static class AdbpgInstanceHotDataGb extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private AdbpgInstanceHotDataGb(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgInstanceHotDataGb create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The metric value of instance storage usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgInstanceHotDataGb build() {
                return new AdbpgInstanceHotDataGb(this);
            } 

        } 

    }
    public static class AdbpgInstanceTotalDataGb extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private AdbpgInstanceTotalDataGb(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgInstanceTotalDataGb create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The metric value of instance storage usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgInstanceTotalDataGb build() {
                return new AdbpgInstanceTotalDataGb(this);
            } 

        } 

    }
    public static class AdbpgMasterDiskUsagePercentMax extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private AdbpgMasterDiskUsagePercentMax(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgMasterDiskUsagePercentMax create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The status corresponding to the maximum storage usage of the coordinator node. Valid values:
             * <p>
             * 
             * *   **critical**: The coordinator node storage usage is greater than or equal to 90%. In this case, the instance is locked.
             * *   **warning**: The coordinator node storage usage is greater than or equal to 70% and less than 90%.
             * *   **healthy**: The coordinator node storage usage is less than 70%.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of maximum coordinator node storage usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgMasterDiskUsagePercentMax build() {
                return new AdbpgMasterDiskUsagePercentMax(this);
            } 

        } 

    }
    public static class AdbpgMasterStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private AdbpgMasterStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgMasterStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The availability status of the coordinator node. Valid values:
             * <p>
             * 
             * *   **critical**: Both the primary and standby coordinator nodes are unavailable. In this case, this metric is marked in red in the console.
             * *   **warning**: The primary or standby coordinator node is unavailable. In this case, this metric is marked in yellow in the console.
             * *   **healthy**: Both the primary and standby coordinator nodes are available. In this case, this metric is marked in green in the console.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of coordinator node availability status. Valid values:
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgMasterStatus build() {
                return new AdbpgMasterStatus(this);
            } 

        } 

    }
    public static class AdbpgSegmentStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private AdbpgSegmentStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgSegmentStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The availability status of compute nodes. Valid values:
             * <p>
             * 
             * *   **critical**: All the primary and secondary compute nodes are unavailable. In this case, this metric is marked in red in the console.
             * *   **warning**: Fifty percent or more than fifty percent of compute nodes are unavailable. In this case, this metric is marked in yellow in the console.
             * *   **healthy**: All compute nodes are available. In this case, this metric is marked in green in the console.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of compute node availability status.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgSegmentStatus build() {
                return new AdbpgSegmentStatus(this);
            } 

        } 

    }
    public static class AdbpgStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private AdbpgStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbpgStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The health status of the instance. Valid values:
             * <p>
             * 
             * *   **critical**: The coordinator node or a compute node is unavailable. In this case, this metric is marked in red in the console.
             * *   **healthy**: All nodes are available. In this case, this metric is marked in green in the console.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of instance health status. Valid values:
             * <p>
             * 
             * *   **1**: healthy
             * *   **0**: critical
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public AdbpgStatus build() {
                return new AdbpgStatus(this);
            } 

        } 

    }
    public static class NodeMasterConnectionStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private NodeMasterConnectionStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeMasterConnectionStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The connection health status of the coordinator node. Valid values:
             * <p>
             * 
             * *   **critical**: The coordinator node connection usage is greater than 95%. In this case, this metric is marked in red in the console.
             * *   **warning**: The coordinator node connection usage is greater than or equal to 90% and less than 95%. In this case, this metric is marked in yellow in the console.
             * *   **healthy**: The coordinator node connection usage is less than 90%. In this case, this metric is marked in green in the console.
             * 
             * >  The coordinator node connection usage is the maximum connection usage of the coordinator node.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of coordinator node connection usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public NodeMasterConnectionStatus build() {
                return new NodeMasterConnectionStatus(this);
            } 

        } 

    }
    public static class NodeMasterStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private NodeMasterStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeMasterStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The health status of the coordinator node. Valid values:
             * <p>
             * 
             * *   **critical**: The primary or standby coordinator node is unavailable. In this case, this metric is marked in red in the console.
             * *   **healthy**: Both the primary and standby coordinator nodes are available. In this case, this metric is marked in green in the console.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of coordinator node health status. Valid values:
             * <p>
             * 
             * *   **1**: healthy
             * *   **0**: critical
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public NodeMasterStatus build() {
                return new NodeMasterStatus(this);
            } 

        } 

    }
    public static class NodeSegmentConnectionStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private NodeSegmentConnectionStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSegmentConnectionStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The connection health status of compute nodes. Valid values:
             * <p>
             * 
             * *   **critical**: The compute node connection usage is greater than or equal to 95%. In this case, this metric is marked in red in the console.
             * *   **warning**: The compute node connection usage is greater than or equal to 90% and less than 95%. In this case, this metric is marked in yellow in the console.
             * *   **healthy**: The compute node connection usage is less than 90%. In this case, this metric is marked in green in the console.
             * 
             * >  The compute node connection usage is the maximum connection usage among all compute nodes.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of maximum compute node connection usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public NodeSegmentConnectionStatus build() {
                return new NodeSegmentConnectionStatus(this);
            } 

        } 

    }
    public static class NodeSegmentDiskStatus extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private Float value;

        private NodeSegmentDiskStatus(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSegmentDiskStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private Float value; 

            /**
             * The storage status of compute nodes. Valid values:
             * <p>
             * 
             * *   **critical**: The compute node storage usage is greater than or equal to 90%. In this case, this metric is marked in red in the console and the instance is locked.
             * *   **warning**: The compute node storage usage is greater than or equal to 80% and less than 90%. In this case, this metric is marked in yellow in the console.
             * *   **healthy**: The compute node storage usage is less than 80%. In this case, this metric is marked in green in the console.
             * 
             * >  The compute node storage usage is the maximum storage usage among all compute nodes.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The metric value of maximum compute node storage usage.
             * <p>
             * 
             * Unit: %.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public NodeSegmentDiskStatus build() {
                return new NodeSegmentDiskStatus(this);
            } 

        } 

    }
    public static class Status extends TeaModel {
        @NameInMap("adbgp_segment_disk_usage_percent_max")
        private AdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax;

        @NameInMap("adbpg_connection_status")
        private AdbpgConnectionStatus adbpgConnectionStatus;

        @NameInMap("adbpg_disk_status")
        private AdbpgDiskStatus adbpgDiskStatus;

        @NameInMap("adbpg_disk_usage_percent")
        private AdbpgDiskUsagePercent adbpgDiskUsagePercent;

        @NameInMap("adbpg_instance_cold_data_gb")
        private AdbpgInstanceColdDataGb adbpgInstanceColdDataGb;

        @NameInMap("adbpg_instance_hot_data_gb")
        private AdbpgInstanceHotDataGb adbpgInstanceHotDataGb;

        @NameInMap("adbpg_instance_total_data_gb")
        private AdbpgInstanceTotalDataGb adbpgInstanceTotalDataGb;

        @NameInMap("adbpg_master_disk_usage_percent_max")
        private AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax;

        @NameInMap("adbpg_master_status")
        private AdbpgMasterStatus adbpgMasterStatus;

        @NameInMap("adbpg_segment_status")
        private AdbpgSegmentStatus adbpgSegmentStatus;

        @NameInMap("adbpg_status")
        private AdbpgStatus adbpgStatus;

        @NameInMap("node_master_connection_status")
        private NodeMasterConnectionStatus nodeMasterConnectionStatus;

        @NameInMap("node_master_status")
        private NodeMasterStatus nodeMasterStatus;

        @NameInMap("node_segment_connection_status")
        private NodeSegmentConnectionStatus nodeSegmentConnectionStatus;

        @NameInMap("node_segment_disk_status")
        private NodeSegmentDiskStatus nodeSegmentDiskStatus;

        private Status(Builder builder) {
            this.adbgpSegmentDiskUsagePercentMax = builder.adbgpSegmentDiskUsagePercentMax;
            this.adbpgConnectionStatus = builder.adbpgConnectionStatus;
            this.adbpgDiskStatus = builder.adbpgDiskStatus;
            this.adbpgDiskUsagePercent = builder.adbpgDiskUsagePercent;
            this.adbpgInstanceColdDataGb = builder.adbpgInstanceColdDataGb;
            this.adbpgInstanceHotDataGb = builder.adbpgInstanceHotDataGb;
            this.adbpgInstanceTotalDataGb = builder.adbpgInstanceTotalDataGb;
            this.adbpgMasterDiskUsagePercentMax = builder.adbpgMasterDiskUsagePercentMax;
            this.adbpgMasterStatus = builder.adbpgMasterStatus;
            this.adbpgSegmentStatus = builder.adbpgSegmentStatus;
            this.adbpgStatus = builder.adbpgStatus;
            this.nodeMasterConnectionStatus = builder.nodeMasterConnectionStatus;
            this.nodeMasterStatus = builder.nodeMasterStatus;
            this.nodeSegmentConnectionStatus = builder.nodeSegmentConnectionStatus;
            this.nodeSegmentDiskStatus = builder.nodeSegmentDiskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return adbgpSegmentDiskUsagePercentMax
         */
        public AdbgpSegmentDiskUsagePercentMax getAdbgpSegmentDiskUsagePercentMax() {
            return this.adbgpSegmentDiskUsagePercentMax;
        }

        /**
         * @return adbpgConnectionStatus
         */
        public AdbpgConnectionStatus getAdbpgConnectionStatus() {
            return this.adbpgConnectionStatus;
        }

        /**
         * @return adbpgDiskStatus
         */
        public AdbpgDiskStatus getAdbpgDiskStatus() {
            return this.adbpgDiskStatus;
        }

        /**
         * @return adbpgDiskUsagePercent
         */
        public AdbpgDiskUsagePercent getAdbpgDiskUsagePercent() {
            return this.adbpgDiskUsagePercent;
        }

        /**
         * @return adbpgInstanceColdDataGb
         */
        public AdbpgInstanceColdDataGb getAdbpgInstanceColdDataGb() {
            return this.adbpgInstanceColdDataGb;
        }

        /**
         * @return adbpgInstanceHotDataGb
         */
        public AdbpgInstanceHotDataGb getAdbpgInstanceHotDataGb() {
            return this.adbpgInstanceHotDataGb;
        }

        /**
         * @return adbpgInstanceTotalDataGb
         */
        public AdbpgInstanceTotalDataGb getAdbpgInstanceTotalDataGb() {
            return this.adbpgInstanceTotalDataGb;
        }

        /**
         * @return adbpgMasterDiskUsagePercentMax
         */
        public AdbpgMasterDiskUsagePercentMax getAdbpgMasterDiskUsagePercentMax() {
            return this.adbpgMasterDiskUsagePercentMax;
        }

        /**
         * @return adbpgMasterStatus
         */
        public AdbpgMasterStatus getAdbpgMasterStatus() {
            return this.adbpgMasterStatus;
        }

        /**
         * @return adbpgSegmentStatus
         */
        public AdbpgSegmentStatus getAdbpgSegmentStatus() {
            return this.adbpgSegmentStatus;
        }

        /**
         * @return adbpgStatus
         */
        public AdbpgStatus getAdbpgStatus() {
            return this.adbpgStatus;
        }

        /**
         * @return nodeMasterConnectionStatus
         */
        public NodeMasterConnectionStatus getNodeMasterConnectionStatus() {
            return this.nodeMasterConnectionStatus;
        }

        /**
         * @return nodeMasterStatus
         */
        public NodeMasterStatus getNodeMasterStatus() {
            return this.nodeMasterStatus;
        }

        /**
         * @return nodeSegmentConnectionStatus
         */
        public NodeSegmentConnectionStatus getNodeSegmentConnectionStatus() {
            return this.nodeSegmentConnectionStatus;
        }

        /**
         * @return nodeSegmentDiskStatus
         */
        public NodeSegmentDiskStatus getNodeSegmentDiskStatus() {
            return this.nodeSegmentDiskStatus;
        }

        public static final class Builder {
            private AdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax; 
            private AdbpgConnectionStatus adbpgConnectionStatus; 
            private AdbpgDiskStatus adbpgDiskStatus; 
            private AdbpgDiskUsagePercent adbpgDiskUsagePercent; 
            private AdbpgInstanceColdDataGb adbpgInstanceColdDataGb; 
            private AdbpgInstanceHotDataGb adbpgInstanceHotDataGb; 
            private AdbpgInstanceTotalDataGb adbpgInstanceTotalDataGb; 
            private AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax; 
            private AdbpgMasterStatus adbpgMasterStatus; 
            private AdbpgSegmentStatus adbpgSegmentStatus; 
            private AdbpgStatus adbpgStatus; 
            private NodeMasterConnectionStatus nodeMasterConnectionStatus; 
            private NodeMasterStatus nodeMasterStatus; 
            private NodeSegmentConnectionStatus nodeSegmentConnectionStatus; 
            private NodeSegmentDiskStatus nodeSegmentDiskStatus; 

            /**
             * The information of maximum compute node storage usage.
             * <p>
             * 
             * >  This parameter value is returned only for instances in elastic storage mode.
             */
            public Builder adbgpSegmentDiskUsagePercentMax(AdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax) {
                this.adbgpSegmentDiskUsagePercentMax = adbgpSegmentDiskUsagePercentMax;
                return this;
            }

            /**
             * The information of instance connection health status.
             */
            public Builder adbpgConnectionStatus(AdbpgConnectionStatus adbpgConnectionStatus) {
                this.adbpgConnectionStatus = adbpgConnectionStatus;
                return this;
            }

            /**
             * The information of instance storage status.
             * <p>
             * 
             * >  This parameter value is returned only for instances in elastic storage mode.
             */
            public Builder adbpgDiskStatus(AdbpgDiskStatus adbpgDiskStatus) {
                this.adbpgDiskStatus = adbpgDiskStatus;
                return this;
            }

            /**
             * The information of instance storage usage.
             * <p>
             * 
             * >  This parameter value is returned only for instances in elastic storage mode.
             */
            public Builder adbpgDiskUsagePercent(AdbpgDiskUsagePercent adbpgDiskUsagePercent) {
                this.adbpgDiskUsagePercent = adbpgDiskUsagePercent;
                return this;
            }

            /**
             * adbpg_instance_cold_data_gb.
             */
            public Builder adbpgInstanceColdDataGb(AdbpgInstanceColdDataGb adbpgInstanceColdDataGb) {
                this.adbpgInstanceColdDataGb = adbpgInstanceColdDataGb;
                return this;
            }

            /**
             * adbpg_instance_hot_data_gb.
             */
            public Builder adbpgInstanceHotDataGb(AdbpgInstanceHotDataGb adbpgInstanceHotDataGb) {
                this.adbpgInstanceHotDataGb = adbpgInstanceHotDataGb;
                return this;
            }

            /**
             * adbpg_instance_total_data_gb.
             */
            public Builder adbpgInstanceTotalDataGb(AdbpgInstanceTotalDataGb adbpgInstanceTotalDataGb) {
                this.adbpgInstanceTotalDataGb = adbpgInstanceTotalDataGb;
                return this;
            }

            /**
             * The information of maximum coordinator node storage usage.
             * <p>
             * 
             * >  This parameter value is returned only for instances in elastic storage mode.
             */
            public Builder adbpgMasterDiskUsagePercentMax(AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax) {
                this.adbpgMasterDiskUsagePercentMax = adbpgMasterDiskUsagePercentMax;
                return this;
            }

            /**
             * The information of coordinator node availability status.
             */
            public Builder adbpgMasterStatus(AdbpgMasterStatus adbpgMasterStatus) {
                this.adbpgMasterStatus = adbpgMasterStatus;
                return this;
            }

            /**
             * The information of compute node availability status.
             */
            public Builder adbpgSegmentStatus(AdbpgSegmentStatus adbpgSegmentStatus) {
                this.adbpgSegmentStatus = adbpgSegmentStatus;
                return this;
            }

            /**
             * The information of instance health status.
             */
            public Builder adbpgStatus(AdbpgStatus adbpgStatus) {
                this.adbpgStatus = adbpgStatus;
                return this;
            }

            /**
             * The information of coordinator node connection health status.
             */
            public Builder nodeMasterConnectionStatus(NodeMasterConnectionStatus nodeMasterConnectionStatus) {
                this.nodeMasterConnectionStatus = nodeMasterConnectionStatus;
                return this;
            }

            /**
             * The information of coordinator node health status.
             */
            public Builder nodeMasterStatus(NodeMasterStatus nodeMasterStatus) {
                this.nodeMasterStatus = nodeMasterStatus;
                return this;
            }

            /**
             * The information of compute node connection health status.
             */
            public Builder nodeSegmentConnectionStatus(NodeSegmentConnectionStatus nodeSegmentConnectionStatus) {
                this.nodeSegmentConnectionStatus = nodeSegmentConnectionStatus;
                return this;
            }

            /**
             * The information of compute node storage status.
             * <p>
             * 
             * >  This parameter value is returned only for instances in elastic storage mode.
             */
            public Builder nodeSegmentDiskStatus(NodeSegmentDiskStatus nodeSegmentDiskStatus) {
                this.nodeSegmentDiskStatus = nodeSegmentDiskStatus;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
}
