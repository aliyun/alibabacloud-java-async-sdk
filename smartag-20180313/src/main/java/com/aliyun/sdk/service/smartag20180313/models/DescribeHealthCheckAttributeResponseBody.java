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
 * {@link DescribeHealthCheckAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthCheckAttributeResponseBody</p>
 */
public class DescribeHealthCheckAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DstIpAddr")
    private String dstIpAddr;

    @com.aliyun.core.annotation.NameInMap("DstPort")
    private Integer dstPort;

    @com.aliyun.core.annotation.NameInMap("FailCountThreshold")
    private Integer failCountThreshold;

    @com.aliyun.core.annotation.NameInMap("HcInstanceId")
    private String hcInstanceId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ProbeCount")
    private Integer probeCount;

    @com.aliyun.core.annotation.NameInMap("ProbeInterval")
    private Integer probeInterval;

    @com.aliyun.core.annotation.NameInMap("ProbeTimeout")
    private Integer probeTimeout;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RttFailThreshold")
    private Integer rttFailThreshold;

    @com.aliyun.core.annotation.NameInMap("RttThreshold")
    private Integer rttThreshold;

    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    @com.aliyun.core.annotation.NameInMap("SrcIpAddr")
    private String srcIpAddr;

    @com.aliyun.core.annotation.NameInMap("SrcPort")
    private Integer srcPort;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeHealthCheckAttributeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.dstIpAddr = builder.dstIpAddr;
        this.dstPort = builder.dstPort;
        this.failCountThreshold = builder.failCountThreshold;
        this.hcInstanceId = builder.hcInstanceId;
        this.name = builder.name;
        this.probeCount = builder.probeCount;
        this.probeInterval = builder.probeInterval;
        this.probeTimeout = builder.probeTimeout;
        this.requestId = builder.requestId;
        this.rttFailThreshold = builder.rttFailThreshold;
        this.rttThreshold = builder.rttThreshold;
        this.smartAGId = builder.smartAGId;
        this.srcIpAddr = builder.srcIpAddr;
        this.srcPort = builder.srcPort;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthCheckAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dstIpAddr
     */
    public String getDstIpAddr() {
        return this.dstIpAddr;
    }

    /**
     * @return dstPort
     */
    public Integer getDstPort() {
        return this.dstPort;
    }

    /**
     * @return failCountThreshold
     */
    public Integer getFailCountThreshold() {
        return this.failCountThreshold;
    }

    /**
     * @return hcInstanceId
     */
    public String getHcInstanceId() {
        return this.hcInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return probeCount
     */
    public Integer getProbeCount() {
        return this.probeCount;
    }

    /**
     * @return probeInterval
     */
    public Integer getProbeInterval() {
        return this.probeInterval;
    }

    /**
     * @return probeTimeout
     */
    public Integer getProbeTimeout() {
        return this.probeTimeout;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rttFailThreshold
     */
    public Integer getRttFailThreshold() {
        return this.rttFailThreshold;
    }

    /**
     * @return rttThreshold
     */
    public Integer getRttThreshold() {
        return this.rttThreshold;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return srcIpAddr
     */
    public String getSrcIpAddr() {
        return this.srcIpAddr;
    }

    /**
     * @return srcPort
     */
    public Integer getSrcPort() {
        return this.srcPort;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long createTime; 
        private String description; 
        private String dstIpAddr; 
        private Integer dstPort; 
        private Integer failCountThreshold; 
        private String hcInstanceId; 
        private String name; 
        private Integer probeCount; 
        private Integer probeInterval; 
        private Integer probeTimeout; 
        private String requestId; 
        private Integer rttFailThreshold; 
        private Integer rttThreshold; 
        private String smartAGId; 
        private String srcIpAddr; 
        private Integer srcPort; 
        private String type; 

        private Builder() {
        } 

        private Builder(DescribeHealthCheckAttributeResponseBody model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.dstIpAddr = model.dstIpAddr;
            this.dstPort = model.dstPort;
            this.failCountThreshold = model.failCountThreshold;
            this.hcInstanceId = model.hcInstanceId;
            this.name = model.name;
            this.probeCount = model.probeCount;
            this.probeInterval = model.probeInterval;
            this.probeTimeout = model.probeTimeout;
            this.requestId = model.requestId;
            this.rttFailThreshold = model.rttFailThreshold;
            this.rttThreshold = model.rttThreshold;
            this.smartAGId = model.smartAGId;
            this.srcIpAddr = model.srcIpAddr;
            this.srcPort = model.srcPort;
            this.type = model.type;
        } 

        /**
         * <p>The time when the health check instance was created. This value is a UNIX timestamp.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1586759657000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the health check instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hc-123</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The destination IP address of the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder dstIpAddr(String dstIpAddr) {
            this.dstIpAddr = dstIpAddr;
            return this;
        }

        /**
         * <p>The destination port of the health check instance.</p>
         * <blockquote>
         * <p> This feature is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1223</p>
         */
        public Builder dstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }

        /**
         * <p>The maximum number of failed probes before the health check is declared failed.</p>
         * <p>Valid values: <strong>1</strong> to <strong>15</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder failCountThreshold(Integer failCountThreshold) {
            this.failCountThreshold = failCountThreshold;
            return this;
        }

        /**
         * <p>The ID of the health check instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hc-1k4ucuq77b56x4****</p>
         */
        public Builder hcInstanceId(String hcInstanceId) {
            this.hcInstanceId = hcInstanceId;
            return this;
        }

        /**
         * <p>The name of the health check instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bvt-test-03****</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The number of probes performed per health check.</p>
         * <p>Valid values: <strong>1</strong> to <strong>20</strong>.</p>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder probeCount(Integer probeCount) {
            this.probeCount = probeCount;
            return this;
        }

        /**
         * <p>The time interval at which probes are performed. The next probe does not start before the current one is complete.</p>
         * <p>Valid values: <strong>1000</strong> to <strong>60000</strong>.</p>
         * <p>Default value: <strong>2000</strong>.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder probeInterval(Integer probeInterval) {
            this.probeInterval = probeInterval;
            return this;
        }

        /**
         * <p>The timeout period of the probe.</p>
         * <p>Valid values: <strong>10</strong> to <strong>30000</strong>.</p>
         * <p>Default value: <strong>1000</strong>.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder probeTimeout(Integer probeTimeout) {
            this.probeTimeout = probeTimeout;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DDA08B78-5634-4A83-94E4-5C58FD7EBA19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of times that the maximum RTT is exceeded before an alert is triggered.</p>
         * <p>Valid values: <strong>1</strong> to <strong>15</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder rttFailThreshold(Integer rttFailThreshold) {
            this.rttFailThreshold = rttFailThreshold;
            return this;
        }

        /**
         * <p>The maximum round-trip time (RTT).</p>
         * <p>Value values: <strong>-1</strong> and <strong>1</strong> to <strong>5000</strong>.</p>
         * <p>Default value: <strong>-1</strong>. This value indicates that the RTT threshold is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder rttThreshold(Integer rttThreshold) {
            this.rttThreshold = rttThreshold;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-1um5x5nwhilymw****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The source IP address of the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>10.XX.XX.1</p>
         */
        public Builder srcIpAddr(String srcIpAddr) {
            this.srcIpAddr = srcIpAddr;
            return this;
        }

        /**
         * <p>The source port of the health check instance.</p>
         * <blockquote>
         * <p> This feature is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2334</p>
         */
        public Builder srcPort(Integer srcPort) {
            this.srcPort = srcPort;
            return this;
        }

        /**
         * <p>The type of packets used in the health check.</p>
         * <p>Only <strong>ICMP_ECHO</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ICMP_ECHO</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeHealthCheckAttributeResponseBody build() {
            return new DescribeHealthCheckAttributeResponseBody(this);
        } 

    } 

}
