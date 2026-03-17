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
 * {@link GetQosAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetQosAttributeResponseBody</p>
 */
public class GetQosAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorConfigSmartAGCount")
    private Integer errorConfigSmartAGCount;

    @com.aliyun.core.annotation.NameInMap("QosCars")
    private java.util.List<QosCars> qosCars;

    @com.aliyun.core.annotation.NameInMap("QosDescription")
    private String qosDescription;

    @com.aliyun.core.annotation.NameInMap("QosName")
    private String qosName;

    @com.aliyun.core.annotation.NameInMap("QosPolicies")
    private java.util.List<QosPolicies> qosPolicies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetQosAttributeResponseBody(Builder builder) {
        this.errorConfigSmartAGCount = builder.errorConfigSmartAGCount;
        this.qosCars = builder.qosCars;
        this.qosDescription = builder.qosDescription;
        this.qosName = builder.qosName;
        this.qosPolicies = builder.qosPolicies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQosAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorConfigSmartAGCount
     */
    public Integer getErrorConfigSmartAGCount() {
        return this.errorConfigSmartAGCount;
    }

    /**
     * @return qosCars
     */
    public java.util.List<QosCars> getQosCars() {
        return this.qosCars;
    }

    /**
     * @return qosDescription
     */
    public String getQosDescription() {
        return this.qosDescription;
    }

    /**
     * @return qosName
     */
    public String getQosName() {
        return this.qosName;
    }

    /**
     * @return qosPolicies
     */
    public java.util.List<QosPolicies> getQosPolicies() {
        return this.qosPolicies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer errorConfigSmartAGCount; 
        private java.util.List<QosCars> qosCars; 
        private String qosDescription; 
        private String qosName; 
        private java.util.List<QosPolicies> qosPolicies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetQosAttributeResponseBody model) {
            this.errorConfigSmartAGCount = model.errorConfigSmartAGCount;
            this.qosCars = model.qosCars;
            this.qosDescription = model.qosDescription;
            this.qosName = model.qosName;
            this.qosPolicies = model.qosPolicies;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of Smart Access Gateway (SAG) instances that have exceptional configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder errorConfigSmartAGCount(Integer errorConfigSmartAGCount) {
            this.errorConfigSmartAGCount = errorConfigSmartAGCount;
            return this;
        }

        /**
         * <p>The traffic throttling rule applied to the QoS policies that have exceptional configurations.</p>
         */
        public Builder qosCars(java.util.List<QosCars> qosCars) {
            this.qosCars = qosCars;
            return this;
        }

        /**
         * <p>The description of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder qosDescription(String qosDescription) {
            this.qosDescription = qosDescription;
            return this;
        }

        /**
         * <p>The name of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder qosName(String qosName) {
            this.qosName = qosName;
            return this;
        }

        /**
         * <p>List of QoS policies based on 5-tuple.</p>
         */
        public Builder qosPolicies(java.util.List<QosPolicies> qosPolicies) {
            this.qosPolicies = qosPolicies;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>91058E01-1806-45D5-B305-19E4D0A5CE04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQosAttributeResponseBody build() {
            return new GetQosAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQosAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetQosAttributeResponseBody</p>
     */
    public static class QosCars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("MaxBandwidthAbs")
        private Integer maxBandwidthAbs;

        @com.aliyun.core.annotation.NameInMap("MaxBandwidthPercent")
        private Integer maxBandwidthPercent;

        @com.aliyun.core.annotation.NameInMap("MinBandwidthAbs")
        private Integer minBandwidthAbs;

        @com.aliyun.core.annotation.NameInMap("MinBandwidthPercent")
        private Integer minBandwidthPercent;

        @com.aliyun.core.annotation.NameInMap("PercentSourceType")
        private String percentSourceType;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("QosCarDescription")
        private String qosCarDescription;

        @com.aliyun.core.annotation.NameInMap("QosCarId")
        private String qosCarId;

        @com.aliyun.core.annotation.NameInMap("QosCarName")
        private String qosCarName;

        private QosCars(Builder builder) {
            this.limitType = builder.limitType;
            this.maxBandwidthAbs = builder.maxBandwidthAbs;
            this.maxBandwidthPercent = builder.maxBandwidthPercent;
            this.minBandwidthAbs = builder.minBandwidthAbs;
            this.minBandwidthPercent = builder.minBandwidthPercent;
            this.percentSourceType = builder.percentSourceType;
            this.priority = builder.priority;
            this.qosCarDescription = builder.qosCarDescription;
            this.qosCarId = builder.qosCarId;
            this.qosCarName = builder.qosCarName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosCars create() {
            return builder().build();
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return maxBandwidthAbs
         */
        public Integer getMaxBandwidthAbs() {
            return this.maxBandwidthAbs;
        }

        /**
         * @return maxBandwidthPercent
         */
        public Integer getMaxBandwidthPercent() {
            return this.maxBandwidthPercent;
        }

        /**
         * @return minBandwidthAbs
         */
        public Integer getMinBandwidthAbs() {
            return this.minBandwidthAbs;
        }

        /**
         * @return minBandwidthPercent
         */
        public Integer getMinBandwidthPercent() {
            return this.minBandwidthPercent;
        }

        /**
         * @return percentSourceType
         */
        public String getPercentSourceType() {
            return this.percentSourceType;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return qosCarDescription
         */
        public String getQosCarDescription() {
            return this.qosCarDescription;
        }

        /**
         * @return qosCarId
         */
        public String getQosCarId() {
            return this.qosCarId;
        }

        /**
         * @return qosCarName
         */
        public String getQosCarName() {
            return this.qosCarName;
        }

        public static final class Builder {
            private String limitType; 
            private Integer maxBandwidthAbs; 
            private Integer maxBandwidthPercent; 
            private Integer minBandwidthAbs; 
            private Integer minBandwidthPercent; 
            private String percentSourceType; 
            private Integer priority; 
            private String qosCarDescription; 
            private String qosCarId; 
            private String qosCarName; 

            private Builder() {
            } 

            private Builder(QosCars model) {
                this.limitType = model.limitType;
                this.maxBandwidthAbs = model.maxBandwidthAbs;
                this.maxBandwidthPercent = model.maxBandwidthPercent;
                this.minBandwidthAbs = model.minBandwidthAbs;
                this.minBandwidthPercent = model.minBandwidthPercent;
                this.percentSourceType = model.percentSourceType;
                this.priority = model.priority;
                this.qosCarDescription = model.qosCarDescription;
                this.qosCarId = model.qosCarId;
                this.qosCarName = model.qosCarName;
            } 

            /**
             * <p>The type of traffic throttling. Valid values:</p>
             * <ul>
             * <li><strong>Absolute</strong>: throttles traffic based on a specific range of bandwidth.</li>
             * <li><strong>Percent</strong>: throttles traffic based on a specific range of bandwidth percentage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Absolute</p>
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * <p>The maximum bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxBandwidthAbs(Integer maxBandwidthAbs) {
                this.maxBandwidthAbs = maxBandwidthAbs;
                return this;
            }

            /**
             * <p>The maximum bandwidth percentage that the traffic is throttled to.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxBandwidthPercent(Integer maxBandwidthPercent) {
                this.maxBandwidthPercent = maxBandwidthPercent;
                return this;
            }

            /**
             * <p>The minimum bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minBandwidthAbs(Integer minBandwidthAbs) {
                this.minBandwidthAbs = minBandwidthAbs;
                return this;
            }

            /**
             * <p>The minimum bandwidth percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder minBandwidthPercent(Integer minBandwidthPercent) {
                this.minBandwidthPercent = minBandwidthPercent;
                return this;
            }

            /**
             * <p>Bandwidth type when traffic is throttled to a percentage of the total bandwidth of the network.</p>
             * <ul>
             * <li><strong>CcnBandwidth</strong>: Cloud Connect Network (CCN) bandwidth.</li>
             * <li><strong>InternetUpBandwidth</strong>: Internet upstream bandwidth.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InternetUpBandwidth</p>
             */
            public Builder percentSourceType(String percentSourceType) {
                this.percentSourceType = percentSourceType;
                return this;
            }

            /**
             * <p>The priority of the traffic throttling rule.</p>
             * <p>Valid values are from <strong>1</strong> to <strong>3</strong>. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The description of the traffic throttling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder qosCarDescription(String qosCarDescription) {
                this.qosCarDescription = qosCarDescription;
                return this;
            }

            /**
             * <p>The ID of the traffic throttling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>qoscar-xir1apa8ayjp56ei****</p>
             */
            public Builder qosCarId(String qosCarId) {
                this.qosCarId = qosCarId;
                return this;
            }

            /**
             * <p>The name of the traffic throttling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder qosCarName(String qosCarName) {
                this.qosCarName = qosCarName;
                return this;
            }

            public QosCars build() {
                return new QosCars(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQosAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetQosAttributeResponseBody</p>
     */
    public static class QosPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestCidr")
        private String destCidr;

        @com.aliyun.core.annotation.NameInMap("DestPortRange")
        private String destPortRange;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("QosPolicieDescription")
        private String qosPolicieDescription;

        @com.aliyun.core.annotation.NameInMap("QosPolicieName")
        private String qosPolicieName;

        @com.aliyun.core.annotation.NameInMap("SourceCidr")
        private String sourceCidr;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private QosPolicies(Builder builder) {
            this.destCidr = builder.destCidr;
            this.destPortRange = builder.destPortRange;
            this.endTime = builder.endTime;
            this.ipProtocol = builder.ipProtocol;
            this.priority = builder.priority;
            this.qosPolicieDescription = builder.qosPolicieDescription;
            this.qosPolicieName = builder.qosPolicieName;
            this.sourceCidr = builder.sourceCidr;
            this.sourcePortRange = builder.sourcePortRange;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosPolicies create() {
            return builder().build();
        }

        /**
         * @return destCidr
         */
        public String getDestCidr() {
            return this.destCidr;
        }

        /**
         * @return destPortRange
         */
        public String getDestPortRange() {
            return this.destPortRange;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return qosPolicieDescription
         */
        public String getQosPolicieDescription() {
            return this.qosPolicieDescription;
        }

        /**
         * @return qosPolicieName
         */
        public String getQosPolicieName() {
            return this.qosPolicieName;
        }

        /**
         * @return sourceCidr
         */
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String destCidr; 
            private String destPortRange; 
            private Long endTime; 
            private String ipProtocol; 
            private Integer priority; 
            private String qosPolicieDescription; 
            private String qosPolicieName; 
            private String sourceCidr; 
            private String sourcePortRange; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(QosPolicies model) {
                this.destCidr = model.destCidr;
                this.destPortRange = model.destPortRange;
                this.endTime = model.endTime;
                this.ipProtocol = model.ipProtocol;
                this.priority = model.priority;
                this.qosPolicieDescription = model.qosPolicieDescription;
                this.qosPolicieName = model.qosPolicieName;
                this.sourceCidr = model.sourceCidr;
                this.sourcePortRange = model.sourcePortRange;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The range of the destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder destCidr(String destCidr) {
                this.destCidr = destCidr;
                return this;
            }

            /**
             * <p>The range of destination ports.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65535</strong> and <strong>-1</strong>.</p>
             * <p>Examples of the format of the destination port range:</p>
             * <ul>
             * <li><strong>1/200</strong>: a port range from 1 to 200.</li>
             * <li><strong>80/80</strong>: port 80.</li>
             * <li><strong>-1/-1</strong>: all ports.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder destPortRange(String destPortRange) {
                this.destPortRange = destPortRange;
                return this;
            }

            /**
             * <p>The end time of the valid time of the 5-tuple.</p>
             * <p>The time must be in UTC+8.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-29T00:00:00+0800</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The type of the protocol that is applied to the 5-tuple rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The priority of the traffic throttling rule that is applied to the 5-tuple.rule.</p>
             * <p>A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The description of the 5-tuple.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder qosPolicieDescription(String qosPolicieDescription) {
                this.qosPolicieDescription = qosPolicieDescription;
                return this;
            }

            /**
             * <p>The name of the 5-tuple.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder qosPolicieName(String qosPolicieName) {
                this.qosPolicieName = qosPolicieName;
                return this;
            }

            /**
             * <p>The range of the source CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            /**
             * <p>The range of source ports.</p>
             * <p>Valid values: <strong>1</strong> to <strong>65535</strong> and <strong>-1</strong>.</p>
             * <p>Examples of the format of the source port range:</p>
             * <ul>
             * <li><strong>1/200</strong>: a port range from 1 to 200.</li>
             * <li><strong>80/80</strong>: port 80.</li>
             * <li><strong>-1/-1</strong>: all ports.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * <p>The start time of the valid time of the 5-tuple.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-21T00:00:00+0800</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public QosPolicies build() {
                return new QosPolicies(this);
            } 

        } 

    }
}
