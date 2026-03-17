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
 * {@link UpdateProbeTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateProbeTaskRequest</p>
 */
public class UpdateProbeTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PacketNumber")
    private Integer packetNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String probeTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeTaskSourceAddress")
    private String probeTaskSourceAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private UpdateProbeTaskRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.enable = builder.enable;
        this.packetNumber = builder.packetNumber;
        this.port = builder.port;
        this.probeTaskId = builder.probeTaskId;
        this.probeTaskSourceAddress = builder.probeTaskSourceAddress;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.sagId = builder.sagId;
        this.sn = builder.sn;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProbeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return packetNumber
     */
    public Integer getPacketNumber() {
        return this.packetNumber;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return probeTaskId
     */
    public String getProbeTaskId() {
        return this.probeTaskId;
    }

    /**
     * @return probeTaskSourceAddress
     */
    public String getProbeTaskSourceAddress() {
        return this.probeTaskSourceAddress;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sagId
     */
    public String getSagId() {
        return this.sagId;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<UpdateProbeTaskRequest, Builder> {
        private String domain; 
        private Boolean enable; 
        private Integer packetNumber; 
        private Integer port; 
        private String probeTaskId; 
        private String probeTaskSourceAddress; 
        private String protocol; 
        private String regionId; 
        private String sagId; 
        private String sn; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProbeTaskRequest request) {
            super(request);
            this.domain = request.domain;
            this.enable = request.enable;
            this.packetNumber = request.packetNumber;
            this.port = request.port;
            this.probeTaskId = request.probeTaskId;
            this.probeTaskSourceAddress = request.probeTaskSourceAddress;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.sagId = request.sagId;
            this.sn = request.sn;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The domain name that is probed by the task.</p>
         * <p>If the protocol of the probe task is ICMP or TCP, set the value to the IP address or domain name of the service that you want to probe. If the protocol of the probe task is HTTP, set the value to the URL of the service that you want to probe.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Specifies whether to enable the probe task. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The number of probe packets transmitted by the probe task per minute.</p>
         * <p>Valid values: <strong>1</strong> to <strong>60</strong>.</p>
         * <blockquote>
         * <p>This parameter is required if the protocol of the probe task is ICMP. Ignore this parameter if the protocol of the probe task is not ICMP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder packetNumber(Integer packetNumber) {
            this.putQueryParameter("PacketNumber", packetNumber);
            this.packetNumber = packetNumber;
            return this;
        }

        /**
         * <p>The port that is probed by the task.</p>
         * <blockquote>
         * <p>This parameter is required if the protocol of the probe task is TCP. Ignore this parameter if the protocol of the probe task is not TCP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The ID of the probe task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>probe-****</p>
         */
        public Builder probeTaskId(String probeTaskId) {
            this.putQueryParameter("ProbeTaskId", probeTaskId);
            this.probeTaskId = probeTaskId;
            return this;
        }

        /**
         * <p>The source address of the probe task.</p>
         * <blockquote>
         * <p>This parameter is required if the task probes private networks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        public Builder probeTaskSourceAddress(String probeTaskSourceAddress) {
            this.putQueryParameter("ProbeTaskSourceAddress", probeTaskSourceAddress);
            this.probeTaskSourceAddress = probeTaskSourceAddress;
            return this;
        }

        /**
         * <p>The protocol of the probe task. Valid values:</p>
         * <ul>
         * <li><strong>ICMP</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>HTTP</strong></li>
         * </ul>
         * <blockquote>
         * <p>Tasks that probe private networks support only ICMP and TCP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ICMP</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The region ID of the SAG instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Smart Access Gateway (SAG) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-****</p>
         */
        public Builder sagId(String sagId) {
            this.putQueryParameter("SagId", sagId);
            this.sagId = sagId;
            return this;
        }

        /**
         * <p>The serial number of the SAG device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag****</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        /**
         * <p>The name of the probe task.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ping</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public UpdateProbeTaskRequest build() {
            return new UpdateProbeTaskRequest(this);
        } 

    } 

}
