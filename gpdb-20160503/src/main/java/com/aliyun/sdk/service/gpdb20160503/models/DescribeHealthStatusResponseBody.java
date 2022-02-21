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
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
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
         * Status.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Value.
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

        @NameInMap("adbpg_master_disk_usage_percent_max")
        private AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax;

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
            this.adbpgMasterDiskUsagePercentMax = builder.adbpgMasterDiskUsagePercentMax;
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
         * @return adbpgMasterDiskUsagePercentMax
         */
        public AdbpgMasterDiskUsagePercentMax getAdbpgMasterDiskUsagePercentMax() {
            return this.adbpgMasterDiskUsagePercentMax;
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
            private AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax; 
            private AdbpgStatus adbpgStatus; 
            private NodeMasterConnectionStatus nodeMasterConnectionStatus; 
            private NodeMasterStatus nodeMasterStatus; 
            private NodeSegmentConnectionStatus nodeSegmentConnectionStatus; 
            private NodeSegmentDiskStatus nodeSegmentDiskStatus; 

            /**
             * adbgp_segment_disk_usage_percent_max.
             */
            public Builder adbgpSegmentDiskUsagePercentMax(AdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax) {
                this.adbgpSegmentDiskUsagePercentMax = adbgpSegmentDiskUsagePercentMax;
                return this;
            }

            /**
             * adbpg_connection_status.
             */
            public Builder adbpgConnectionStatus(AdbpgConnectionStatus adbpgConnectionStatus) {
                this.adbpgConnectionStatus = adbpgConnectionStatus;
                return this;
            }

            /**
             * adbpg_disk_status.
             */
            public Builder adbpgDiskStatus(AdbpgDiskStatus adbpgDiskStatus) {
                this.adbpgDiskStatus = adbpgDiskStatus;
                return this;
            }

            /**
             * adbpg_disk_usage_percent.
             */
            public Builder adbpgDiskUsagePercent(AdbpgDiskUsagePercent adbpgDiskUsagePercent) {
                this.adbpgDiskUsagePercent = adbpgDiskUsagePercent;
                return this;
            }

            /**
             * adbpg_master_disk_usage_percent_max.
             */
            public Builder adbpgMasterDiskUsagePercentMax(AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax) {
                this.adbpgMasterDiskUsagePercentMax = adbpgMasterDiskUsagePercentMax;
                return this;
            }

            /**
             * adbpg_status.
             */
            public Builder adbpgStatus(AdbpgStatus adbpgStatus) {
                this.adbpgStatus = adbpgStatus;
                return this;
            }

            /**
             * node_master_connection_status.
             */
            public Builder nodeMasterConnectionStatus(NodeMasterConnectionStatus nodeMasterConnectionStatus) {
                this.nodeMasterConnectionStatus = nodeMasterConnectionStatus;
                return this;
            }

            /**
             * node_master_status.
             */
            public Builder nodeMasterStatus(NodeMasterStatus nodeMasterStatus) {
                this.nodeMasterStatus = nodeMasterStatus;
                return this;
            }

            /**
             * node_segment_connection_status.
             */
            public Builder nodeSegmentConnectionStatus(NodeSegmentConnectionStatus nodeSegmentConnectionStatus) {
                this.nodeSegmentConnectionStatus = nodeSegmentConnectionStatus;
                return this;
            }

            /**
             * node_segment_disk_status.
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
