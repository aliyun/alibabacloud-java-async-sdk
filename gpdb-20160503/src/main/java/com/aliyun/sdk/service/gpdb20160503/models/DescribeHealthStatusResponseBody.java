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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHealthStatusResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D97B4191-104D-10CE-8BC5-53**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detailed performance monitoring information, which consists of the metric name, status, and metric value. Monitoring information is returned only for the metrics specified in the <strong>Key</strong> request parameter. For example, if the <strong>Key</strong> parameter contains only <strong>adbpg_status</strong>, only the monitoring information for <strong>adbpg_status</strong> is returned.</p>
         * <p>For more information about performance metrics, see <a href="https://help.aliyun.com/document_detail/86943.html">Performance metrics</a>.</p>
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

            private Builder() {
            } 

            private Builder(AdbgpSegmentDiskUsagePercentMax model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The maximum storage usage status of segment nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: Instance storage usage is greater than or equal to 90%, and the instance will be locked.</li>
             * <li><strong>warning</strong>: Instance storage usage is greater than or equal to 80% and less than 90%.</li>
             * <li><strong>healthy</strong>: Instance storage usage is less than 80%, indicating a healthy storage status.</li>
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
             * <p>The metric value of the maximum storage usage of segment nodes.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgConnectionStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The connection status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The connection usage of the instance is greater than 95%. The status is displayed in red in the console.</li>
             * <li><strong>warning</strong>: The connection usage of the instance is greater than 90% and less than or equal to 95%. The status is displayed in yellow in the console.</li>
             * <li><strong>healthy</strong>: The connection usage of the instance is less than or equal to 90%. The status is displayed in green in the console.</li>
             * </ul>
             * <blockquote>
             * <p>The connection usage of the instance is the maximum connection usage among all master nodes and segment nodes.</p>
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
             * <p>The metric value of the instance connection usage, which is the maximum connection usage among all master nodes and segment nodes.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgDiskStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>Instance storage status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: Instance storage usage of the instance is greater than or equal to 90%. The status is displayed in red in the console, and the instance will be locked.</li>
             * <li><strong>warning</strong>: Instance storage usage of the instance is greater than or equal to 70% and less than 90%. The status is displayed in yellow in the console.</li>
             * <li><strong>healthy</strong>: Instance storage usage of the instance is less than 70%. The status is displayed in green in the console, indicating a healthy storage status.</li>
             * </ul>
             * <blockquote>
             * <p>Instance storage usage of the instance is the average storage usage of all segment nodes.</p>
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
             * <p>The metric value of the instance storage usage, which is the average storage usage of all segment nodes.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgDiskUsagePercent model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>Instance storage usage status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: Instance storage usage of the instance is greater than or equal to 90%, and the instance will be locked.</li>
             * <li><strong>warning</strong>: Instance storage usage of the instance is greater than or equal to 70% and less than 90%.</li>
             * <li><strong>healthy</strong>: Instance storage usage of the instance is less than 70%, indicating a healthy storage status.</li>
             * </ul>
             * <blockquote>
             * <p>Instance storage usage of the instance is the average storage usage of all segment nodes.</p>
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
             * <p>The metric value of the instance storage usage, which is the average storage usage of all segment nodes.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgInstanceColdDataGb model) {
                this.value = model.value;
            } 

            /**
             * <p>The total amount of cold data stored. Unit: GB.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgInstanceHotDataGb model) {
                this.value = model.value;
            } 

            /**
             * <p>The total amount of hot data stored. Unit: GB.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgInstanceTotalDataGb model) {
                this.value = model.value;
            } 

            /**
             * <p>The total amount of instance storage data. Unit: GB.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgMasterDiskUsagePercentMax model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The maximum storage usage status of master nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: Instance storage usage is greater than or equal to 90%, and the instance will be locked.</li>
             * <li><strong>warning</strong>: Instance storage usage is greater than or equal to 70% and less than 90%.</li>
             * <li><strong>healthy</strong>: Instance storage usage is less than 70%, indicating a healthy storage status.</li>
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
             * <p>The metric value of the maximum storage usage of master nodes.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgMasterStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The availability status of master nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: Both the primary and secondary nodes are unavailable. The status is displayed in red in the console.</li>
             * <li><strong>warning</strong>: The primary or secondary node is unavailable. The status is displayed in yellow in the console.</li>
             * <li><strong>healthy</strong>: All nodes are available. The status is displayed in green in the console.</li>
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
             * <p>The metric value of the availability status of master nodes. Valid values:</p>
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

            private Builder() {
            } 

            private Builder(AdbpgSegmentStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The availability status of segment nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: Both the primary and secondary nodes are unavailable. The status is displayed in red in the console.</li>
             * <li><strong>warning</strong>: 50% or more of the nodes are unavailable. The status is displayed in yellow in the console.</li>
             * <li><strong>healthy</strong>: All nodes are available. The status is displayed in green in the console.</li>
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
             * <p>The metric value of the availability status of segment nodes.</p>
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

            private Builder() {
            } 

            private Builder(AdbpgStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The health status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: At least one master node or segment node is unavailable. The status is displayed in red in the console.</li>
             * <li><strong>healthy</strong>: All nodes are available. The status is displayed in green in the console.</li>
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
             * <p>The metric value of the instance health status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: healthy.</li>
             * <li><strong>0</strong>: critical.</li>
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

            private Builder() {
            } 

            private Builder(NodeMasterConnectionStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The connection health status of master nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The connection usage of master nodes is greater than or equal to 95%. The status is displayed in red in the console.</li>
             * <li><strong>warning</strong>: The connection usage of master nodes is greater than or equal to 90% and less than 95%. The status is displayed in yellow in the console.</li>
             * <li><strong>healthy</strong>: The connection usage of master nodes is less than 90%. The status is displayed in green in the console.</li>
             * </ul>
             * <blockquote>
             * <p>The connection usage of master nodes is the maximum connection usage among all master nodes.</p>
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
             * <p>The metric value of the connection usage of master nodes, which is the maximum connection usage among all master nodes.</p>
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

            private Builder() {
            } 

            private Builder(NodeMasterStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The health status of master nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: At least one primary or secondary master node is unavailable. The status is displayed in red in the console.</li>
             * <li><strong>healthy</strong>: All master nodes are available. The status is displayed in green in the console.</li>
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
             * <p>The metric value of the master node health status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: healthy.</li>
             * <li><strong>0</strong>: critical.</li>
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

            private Builder() {
            } 

            private Builder(NodeSegmentConnectionStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The connection health status of segment nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: The connection usage of segment nodes is greater than or equal to 95%. The status is displayed in red in the console.</li>
             * <li><strong>warning</strong>: The connection usage of segment nodes is greater than or equal to 90% and less than 95%. The status is displayed in yellow in the console.</li>
             * <li><strong>healthy</strong>: The connection usage of segment nodes is less than 90%. The status is displayed in green in the console.</li>
             * </ul>
             * <blockquote>
             * <p>The connection usage of segment nodes is the maximum connection usage among all segment nodes.</p>
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
             * <p>The metric value of the connection usage of segment nodes, which is the maximum connection usage among all segment nodes.</p>
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

            private Builder() {
            } 

            private Builder(NodeSegmentDiskStatus model) {
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>Instance storage status of segment nodes. Valid values:</p>
             * <ul>
             * <li><strong>critical</strong>: Instance storage usage of segment nodes is greater than or equal to 90%. The status is displayed in red in the console, and the instance will be locked.</li>
             * <li><strong>warning</strong>: Instance storage usage of segment nodes is greater than or equal to 80% and less than 90%. The status is displayed in yellow in the console.</li>
             * <li><strong>healthy</strong>: Instance storage usage of segment nodes is less than 80%. The status is displayed in green in the console, indicating a healthy storage status.</li>
             * </ul>
             * <blockquote>
             * <p>Instance storage usage of segment nodes is the maximum storage usage among all segment nodes.</p>
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
             * <p>The metric value of the maximum storage usage of segment nodes.</p>
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

            private Builder() {
            } 

            private Builder(Status model) {
                this.adbgpSegmentDiskUsagePercentMax = model.adbgpSegmentDiskUsagePercentMax;
                this.adbpgConnectionStatus = model.adbpgConnectionStatus;
                this.adbpgDiskStatus = model.adbpgDiskStatus;
                this.adbpgDiskUsagePercent = model.adbpgDiskUsagePercent;
                this.adbpgInstanceColdDataGb = model.adbpgInstanceColdDataGb;
                this.adbpgInstanceHotDataGb = model.adbpgInstanceHotDataGb;
                this.adbpgInstanceTotalDataGb = model.adbpgInstanceTotalDataGb;
                this.adbpgMasterDiskUsagePercentMax = model.adbpgMasterDiskUsagePercentMax;
                this.adbpgMasterStatus = model.adbpgMasterStatus;
                this.adbpgSegmentStatus = model.adbpgSegmentStatus;
                this.adbpgStatus = model.adbpgStatus;
                this.nodeMasterConnectionStatus = model.nodeMasterConnectionStatus;
                this.nodeMasterStatus = model.nodeMasterStatus;
                this.nodeSegmentConnectionStatus = model.nodeSegmentConnectionStatus;
                this.nodeSegmentDiskStatus = model.nodeSegmentDiskStatus;
            } 

            /**
             * <p>The maximum storage usage of compute nodes in the instance, which is the maximum storage usage among all segment nodes in the instance.</p>
             * <blockquote>
             * <p>This value is returned only for instances in elastic storage mode.</p>
             * </blockquote>
             */
            public Builder adbgpSegmentDiskUsagePercentMax(AdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax) {
                this.adbgpSegmentDiskUsagePercentMax = adbgpSegmentDiskUsagePercentMax;
                return this;
            }

            /**
             * <p>The connection status of the instance.</p>
             */
            public Builder adbpgConnectionStatus(AdbpgConnectionStatus adbpgConnectionStatus) {
                this.adbpgConnectionStatus = adbpgConnectionStatus;
                return this;
            }

            /**
             * <p>The instance storage status.</p>
             * <blockquote>
             * <p>This value is returned only for instances in the elastic storage pattern.</p>
             * </blockquote>
             */
            public Builder adbpgDiskStatus(AdbpgDiskStatus adbpgDiskStatus) {
                this.adbpgDiskStatus = adbpgDiskStatus;
                return this;
            }

            /**
             * <p>The instance storage usage.</p>
             * <blockquote>
             * <p>This value is returned only for instances in the elastic storage pattern.</p>
             * </blockquote>
             */
            public Builder adbpgDiskUsagePercent(AdbpgDiskUsagePercent adbpgDiskUsagePercent) {
                this.adbpgDiskUsagePercent = adbpgDiskUsagePercent;
                return this;
            }

            /**
             * <p>The total amount of cold data stored.</p>
             */
            public Builder adbpgInstanceColdDataGb(AdbpgInstanceColdDataGb adbpgInstanceColdDataGb) {
                this.adbpgInstanceColdDataGb = adbpgInstanceColdDataGb;
                return this;
            }

            /**
             * <p>The total amount of hot data stored.</p>
             */
            public Builder adbpgInstanceHotDataGb(AdbpgInstanceHotDataGb adbpgInstanceHotDataGb) {
                this.adbpgInstanceHotDataGb = adbpgInstanceHotDataGb;
                return this;
            }

            /**
             * <p>The total amount of instance storage data.</p>
             */
            public Builder adbpgInstanceTotalDataGb(AdbpgInstanceTotalDataGb adbpgInstanceTotalDataGb) {
                this.adbpgInstanceTotalDataGb = adbpgInstanceTotalDataGb;
                return this;
            }

            /**
             * <p>The maximum storage usage of coordinator nodes in the instance, which is the maximum storage usage among all master nodes in the instance.</p>
             * <blockquote>
             * <p>This value is returned only for instances in elastic storage mode.</p>
             * </blockquote>
             */
            public Builder adbpgMasterDiskUsagePercentMax(AdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax) {
                this.adbpgMasterDiskUsagePercentMax = adbpgMasterDiskUsagePercentMax;
                return this;
            }

            /**
             * <p>The status of coordinator nodes, namely the availability status of master nodes.</p>
             */
            public Builder adbpgMasterStatus(AdbpgMasterStatus adbpgMasterStatus) {
                this.adbpgMasterStatus = adbpgMasterStatus;
                return this;
            }

            /**
             * <p>The status of compute nodes, namely the availability status of segment nodes.</p>
             */
            public Builder adbpgSegmentStatus(AdbpgSegmentStatus adbpgSegmentStatus) {
                this.adbpgSegmentStatus = adbpgSegmentStatus;
                return this;
            }

            /**
             * <p>The health status of the instance.</p>
             */
            public Builder adbpgStatus(AdbpgStatus adbpgStatus) {
                this.adbpgStatus = adbpgStatus;
                return this;
            }

            /**
             * <p>The connection health status of coordinator nodes, namely master nodes.</p>
             */
            public Builder nodeMasterConnectionStatus(NodeMasterConnectionStatus nodeMasterConnectionStatus) {
                this.nodeMasterConnectionStatus = nodeMasterConnectionStatus;
                return this;
            }

            /**
             * <p>The health status of coordinator nodes, namely master nodes.</p>
             */
            public Builder nodeMasterStatus(NodeMasterStatus nodeMasterStatus) {
                this.nodeMasterStatus = nodeMasterStatus;
                return this;
            }

            /**
             * <p>The connection health status of compute nodes, namely segment nodes.</p>
             */
            public Builder nodeSegmentConnectionStatus(NodeSegmentConnectionStatus nodeSegmentConnectionStatus) {
                this.nodeSegmentConnectionStatus = nodeSegmentConnectionStatus;
                return this;
            }

            /**
             * <p>The storage status of compute nodes, namely segment nodes.</p>
             * <blockquote>
             * <p>This value is returned only for instances in elastic storage mode.</p>
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
