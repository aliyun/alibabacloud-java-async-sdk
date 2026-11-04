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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * PacketNumber.
         */
        public Builder packetNumber(Integer packetNumber) {
            this.putQueryParameter("PacketNumber", packetNumber);
            this.packetNumber = packetNumber;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder probeTaskId(String probeTaskId) {
            this.putQueryParameter("ProbeTaskId", probeTaskId);
            this.probeTaskId = probeTaskId;
            return this;
        }

        /**
         * ProbeTaskSourceAddress.
         */
        public Builder probeTaskSourceAddress(String probeTaskSourceAddress) {
            this.putQueryParameter("ProbeTaskSourceAddress", probeTaskSourceAddress);
            this.probeTaskSourceAddress = probeTaskSourceAddress;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sagId(String sagId) {
            this.putQueryParameter("SagId", sagId);
            this.sagId = sagId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        /**
         * TaskName.
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
