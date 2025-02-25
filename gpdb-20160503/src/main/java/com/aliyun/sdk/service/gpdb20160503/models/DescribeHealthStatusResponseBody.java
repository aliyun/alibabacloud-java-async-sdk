// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthStatusResponseBody</p>
 */
public class DescribeHealthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The ID of instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D97B4191-104D-10CE-8BC5-53**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried performance metrics. Each performance metric consists of the parameter name, status, and metric value. The metric information is returned only for the performance parameters specified by <strong>Key</strong>. For example, if you set <strong>Key</strong> to <strong>adbpg_status</strong>, only the metric information of <strong>adbpg_status</strong> is returned.</p>
         * <p>For more information about performance parameters, see <a href="https://help.aliyun.com/document_detail/86943.html">Performance parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;node_master_connection_status&quot;:{&quot;Status&quot;:&quot;healthy&quot;,&quot;Value&quot;:1.6}}</p>
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        public DescribeHealthStatusResponseBody build() {
            return new DescribeHealthStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbgpSegmentDiskUsagePercentMax extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The status corresponding to the maximum storage usage among all compute nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The compute node storage usage is greater than or equal to 90%. In this case, the instance is locked.</li>
             * <li><strong>warning</strong>: The compute node storage usage is greater than or equal to 80% and less than 90%.</li>
             * <li><strong>healthy</strong>: The compute node storage usage is less than 80%.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of maximum compute node storage usage.</p>
             * <p>Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>1.52</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgConnectionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The connection health status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The instance connection usage is greater than 95%. In this case, this metric is marked in red in the console.</li>
             * <li><strong>warning</strong>: The instance connection usage is greater than 90% and less than or equal to 95%. In this case, this metric is marked in yellow in the console.</li>
             * <li><strong>healthy</strong>: The instance connection usage is less than or equal to 90%. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * <blockquote>
             * <p> The instance connection usage is the maximum connection usage among all the coordinator and compute nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of instance connection usage.</p>
             * <p>Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>1.71</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgDiskStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The storage status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The instance storage usage is greater than or equal to 90%. In this case, this metric is marked in red in the console and the instance is locked.</li>
             * <li><strong>warning</strong>: The instance storage usage is greater than or equal to 70% and less than 90%. In this case, this metric is marked in yellow in the console.</li>
             * <li><strong>healthy</strong>: The instance storage usage is less than 70%. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * <blockquote>
             * <p> The instance storage usage is the average storage usage of all compute nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of instance storage usage.</p>
             * <p>Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>1.52</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgDiskUsagePercent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The status corresponding to the storage usage of the instance. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The instance storage usage is greater than or equal to 90%. In this case, the instance is locked.</li>
             * <li><strong>warning</strong>: The instance storage usage is greater than or equal to 70% and less than 90%.</li>
             * <li><strong>healthy</strong>: The instance storage usage is less than 70%.</li>
             * </ul>
             * <blockquote>
             * <p> The instance storage usage is the average storage usage of all compute nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of instance storage usage.</p>
             * <p>Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>1.52</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgInstanceColdDataGb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The total amount of cold data storage. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgInstanceHotDataGb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The total amount of hot data storage. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>4.1</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgInstanceTotalDataGb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The total amount of data storage of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>4.1</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgMasterDiskUsagePercentMax extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The status corresponding to the maximum storage usage of the coordinator node. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The coordinator node storage usage is greater than or equal to 90%. In this case, the instance is locked.</li>
             * <li><strong>warning</strong>: The coordinator node storage usage is greater than or equal to 70% and less than 90%.</li>
             * <li><strong>healthy</strong>: The coordinator node storage usage is less than 70%.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of maximum coordinator node storage usage.</p>
             * <p>Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>1.34</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgMasterStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The availability status of the coordinator node. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: Both the primary and standby coordinator nodes are unavailable. In this case, this metric is marked in red in the console.</li>
             * <li><strong>warning</strong>: The primary or standby coordinator node is unavailable. In this case, this metric is marked in yellow in the console.</li>
             * <li><strong>healthy</strong>: Both the primary and standby coordinator nodes are available. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of coordinator node availability status. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgSegmentStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The availability status of compute nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: All the primary and secondary compute nodes are unavailable. In this case, this metric is marked in red in the console.</li>
             * <li><strong>warning</strong>: Fifty percent or more than fifty percent of compute nodes are unavailable. In this case, this metric is marked in yellow in the console.</li>
             * <li><strong>healthy</strong>: All compute nodes are available. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of compute node availability status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class AdbpgStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The health status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The coordinator node or a compute node is unavailable. In this case, this metric is marked in red in the console.</li>
             * <li><strong>healthy</strong>: All nodes are available. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of instance health status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: healthy</li>
             * <li><strong>0</strong>: critical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class NodeMasterConnectionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The connection health status of the coordinator node. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The coordinator node connection usage is greater than 95%. In this case, this metric is marked in red in the console.</li>
             * <li><strong>warning</strong>: The coordinator node connection usage is greater than or equal to 90% and less than 95%. In this case, this metric is marked in yellow in the console.</li>
             * <li><strong>healthy</strong>: The coordinator node connection usage is less than 90%. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * <blockquote>
             * <p> The coordinator node connection usage is the maximum connection usage of the coordinator node.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of coordinator node connection usage.</p>
             * <p>Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>1.71</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class NodeMasterStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The health status of the coordinator node. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The primary or standby coordinator node is unavailable. In this case, this metric is marked in red in the console.</li>
             * <li><strong>healthy</strong>: Both the primary and standby coordinator nodes are available. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of coordinator node health status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: healthy</li>
             * <li><strong>0</strong>: critical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class NodeSegmentConnectionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The connection health status of compute nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The compute node connection usage is greater than or equal to 95%. In this case, this metric is marked in red in the console.</li>
             * <li><strong>warning</strong>: The compute node connection usage is greater than or equal to 90% and less than 95%. In this case, this metric is marked in yellow in the console.</li>
             * <li><strong>healthy</strong>: The compute node connection usage is less than 90%. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * <blockquote>
             * <p> The compute node connection usage is the maximum connection usage among all compute nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of maximum compute node connection usage.</p>
             * <p>Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>0.48</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class NodeSegmentDiskStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The storage status of compute nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The compute node storage usage is greater than or equal to 90%. In this case, this metric is marked in red in the console and the instance is locked.</li>
             * <li><strong>warning</strong>: The compute node storage usage is greater than or equal to 80% and less than 90%. In this case, this metric is marked in yellow in the console.</li>
             * <li><strong>healthy</strong>: The compute node storage usage is less than 80%. In this case, this metric is marked in green in the console.</li>
             * </ul>
             * <blockquote>
             * <p> The compute node storage usage is the maximum storage usage among all compute nodes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The metric value of maximum compute node storage usage.</p>
             * <p>Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>1.52</p>
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
    /**
     * 
     * {@link DescribeHealthStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthStatusResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adbgp_segment_disk_usage_percent_max")
        private AdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax;

        @com.aliyun.core.annotation.NameInMap("adbpg_connection_status")
        private AdbpgConnectionStatus adbpgConnectionStatus;

        @com.aliyun.core.annotation.NameInMap("adbpg_disk_status")
        private AdbpgDiskStatus adbpgDiskStatus;

        @com.aliyun.core.annotation.NameInMap("adbpg_disk_usage_percent")
        private AdbpgDiskUsagePercent adbpgDiskUsagePercent;

        @com.aliyun.core.annotation.NameInMap("adbpg_instance_cold_data_gb")
        private AdbpgInstanceColdDataGb adbpgInstanceColdDataGb;

        @com.aliyun.core.annotation.NameInMap("adbpg_instance_hot_data_gb")
        private AdbpgInstanceHotDataGb adbpgInstanceHotDataGb;

        @com.aliyun.core.annotation.NameInMap("adbpg_instance_total_data_gb")
        private AdbpgInstanceTotalDataGb adbpgInstanceTotalDataGb;

        @com.aliyun.core.annotation.NameInMap("adbpg_master_disk_usage_percent_max")
        private AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax;

        @com.aliyun.core.annotation.NameInMap("adbpg_master_status")
        private AdbpgMasterStatus adbpgMasterStatus;

        @com.aliyun.core.annotation.NameInMap("adbpg_segment_status")
        private AdbpgSegmentStatus adbpgSegmentStatus;

        @com.aliyun.core.annotation.NameInMap("adbpg_status")
        private AdbpgStatus adbpgStatus;

        @com.aliyun.core.annotation.NameInMap("node_master_connection_status")
        private NodeMasterConnectionStatus nodeMasterConnectionStatus;

        @com.aliyun.core.annotation.NameInMap("node_master_status")
        private NodeMasterStatus nodeMasterStatus;

        @com.aliyun.core.annotation.NameInMap("node_segment_connection_status")
        private NodeSegmentConnectionStatus nodeSegmentConnectionStatus;

        @com.aliyun.core.annotation.NameInMap("node_segment_disk_status")
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
             * <p>The information of maximum compute node storage usage.</p>
             * <blockquote>
             * <p> This parameter value is returned only for instances in elastic storage mode.</p>
             * </blockquote>
             */
            public Builder adbgpSegmentDiskUsagePercentMax(AdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax) {
                this.adbgpSegmentDiskUsagePercentMax = adbgpSegmentDiskUsagePercentMax;
                return this;
            }

            /**
             * <p>The information of instance connection health status.</p>
             */
            public Builder adbpgConnectionStatus(AdbpgConnectionStatus adbpgConnectionStatus) {
                this.adbpgConnectionStatus = adbpgConnectionStatus;
                return this;
            }

            /**
             * <p>The information of instance storage status.</p>
             * <blockquote>
             * <p> This parameter value is returned only for instances in elastic storage mode.</p>
             * </blockquote>
             */
            public Builder adbpgDiskStatus(AdbpgDiskStatus adbpgDiskStatus) {
                this.adbpgDiskStatus = adbpgDiskStatus;
                return this;
            }

            /**
             * <p>The information of instance storage usage.</p>
             * <blockquote>
             * <p> This parameter value is returned only for instances in elastic storage mode.</p>
             * </blockquote>
             */
            public Builder adbpgDiskUsagePercent(AdbpgDiskUsagePercent adbpgDiskUsagePercent) {
                this.adbpgDiskUsagePercent = adbpgDiskUsagePercent;
                return this;
            }

            /**
             * <p>The total amount of cold data storage.</p>
             */
            public Builder adbpgInstanceColdDataGb(AdbpgInstanceColdDataGb adbpgInstanceColdDataGb) {
                this.adbpgInstanceColdDataGb = adbpgInstanceColdDataGb;
                return this;
            }

            /**
             * <p>The total amount of hot data storage.</p>
             */
            public Builder adbpgInstanceHotDataGb(AdbpgInstanceHotDataGb adbpgInstanceHotDataGb) {
                this.adbpgInstanceHotDataGb = adbpgInstanceHotDataGb;
                return this;
            }

            /**
             * <p>The total amount of data storage of the instance.</p>
             */
            public Builder adbpgInstanceTotalDataGb(AdbpgInstanceTotalDataGb adbpgInstanceTotalDataGb) {
                this.adbpgInstanceTotalDataGb = adbpgInstanceTotalDataGb;
                return this;
            }

            /**
             * <p>The information of maximum coordinator node storage usage.</p>
             * <blockquote>
             * <p> This parameter value is returned only for instances in elastic storage mode.</p>
             * </blockquote>
             */
            public Builder adbpgMasterDiskUsagePercentMax(AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax) {
                this.adbpgMasterDiskUsagePercentMax = adbpgMasterDiskUsagePercentMax;
                return this;
            }

            /**
             * <p>The information of coordinator node availability status.</p>
             */
            public Builder adbpgMasterStatus(AdbpgMasterStatus adbpgMasterStatus) {
                this.adbpgMasterStatus = adbpgMasterStatus;
                return this;
            }

            /**
             * <p>The information of compute node availability status.</p>
             */
            public Builder adbpgSegmentStatus(AdbpgSegmentStatus adbpgSegmentStatus) {
                this.adbpgSegmentStatus = adbpgSegmentStatus;
                return this;
            }

            /**
             * <p>The information of instance health status.</p>
             */
            public Builder adbpgStatus(AdbpgStatus adbpgStatus) {
                this.adbpgStatus = adbpgStatus;
                return this;
            }

            /**
             * <p>The information of coordinator node connection health status.</p>
             */
            public Builder nodeMasterConnectionStatus(NodeMasterConnectionStatus nodeMasterConnectionStatus) {
                this.nodeMasterConnectionStatus = nodeMasterConnectionStatus;
                return this;
            }

            /**
             * <p>The information of coordinator node health status.</p>
             */
            public Builder nodeMasterStatus(NodeMasterStatus nodeMasterStatus) {
                this.nodeMasterStatus = nodeMasterStatus;
                return this;
            }

            /**
             * <p>The information of compute node connection health status.</p>
             */
            public Builder nodeSegmentConnectionStatus(NodeSegmentConnectionStatus nodeSegmentConnectionStatus) {
                this.nodeSegmentConnectionStatus = nodeSegmentConnectionStatus;
                return this;
            }

            /**
             * <p>The information of compute node storage status.</p>
             * <blockquote>
             * <p> This parameter value is returned only for instances in elastic storage mode.</p>
             * </blockquote>
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
