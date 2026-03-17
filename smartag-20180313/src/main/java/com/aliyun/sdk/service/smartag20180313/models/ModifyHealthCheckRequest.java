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
 * {@link ModifyHealthCheckRequest} extends {@link RequestModel}
 *
 * <p>ModifyHealthCheckRequest</p>
 */
public class ModifyHealthCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIpAddr")
    private String dstIpAddr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstPort")
    private Integer dstPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailCountThreshold")
    private Integer failCountThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HcInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hcInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeCount")
    private Integer probeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeInterval")
    private Integer probeInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeTimeout")
    private Integer probeTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RttFailThreshold")
    private Integer rttFailThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RttThreshold")
    private Integer rttThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIpAddr")
    private String srcIpAddr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPort")
    private Integer srcPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ModifyHealthCheckRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.dstIpAddr = builder.dstIpAddr;
        this.dstPort = builder.dstPort;
        this.failCountThreshold = builder.failCountThreshold;
        this.hcInstanceId = builder.hcInstanceId;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.probeCount = builder.probeCount;
        this.probeInterval = builder.probeInterval;
        this.probeTimeout = builder.probeTimeout;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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

    public static ModifyHealthCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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

    public static final class Builder extends Request.Builder<ModifyHealthCheckRequest, Builder> {
        private String description; 
        private String dstIpAddr; 
        private Integer dstPort; 
        private Integer failCountThreshold; 
        private String hcInstanceId; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer probeCount; 
        private Integer probeInterval; 
        private Integer probeTimeout; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer rttFailThreshold; 
        private Integer rttThreshold; 
        private String smartAGId; 
        private String srcIpAddr; 
        private Integer srcPort; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHealthCheckRequest request) {
            super(request);
            this.description = request.description;
            this.dstIpAddr = request.dstIpAddr;
            this.dstPort = request.dstPort;
            this.failCountThreshold = request.failCountThreshold;
            this.hcInstanceId = request.hcInstanceId;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.probeCount = request.probeCount;
            this.probeInterval = request.probeInterval;
            this.probeTimeout = request.probeTimeout;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rttFailThreshold = request.rttFailThreshold;
            this.rttThreshold = request.rttThreshold;
            this.smartAGId = request.smartAGId;
            this.srcIpAddr = request.srcIpAddr;
            this.srcPort = request.srcPort;
            this.type = request.type;
        } 

        /**
         * <p>The description of the health check.</p>
         * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
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
            this.putQueryParameter("DstIpAddr", dstIpAddr);
            this.dstIpAddr = dstIpAddr;
            return this;
        }

        /**
         * <p>The destination port of the health check.</p>
         * <blockquote>
         * <p> This parameter is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2233</p>
         */
        public Builder dstPort(Integer dstPort) {
            this.putQueryParameter("DstPort", dstPort);
            this.dstPort = dstPort;
            return this;
        }

        /**
         * <p>The number of failed probes before a health check is declared failed.</p>
         * <p>Valid values: <strong>1</strong> to <strong>15</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder failCountThreshold(Integer failCountThreshold) {
            this.putQueryParameter("FailCountThreshold", failCountThreshold);
            this.failCountThreshold = failCountThreshold;
            return this;
        }

        /**
         * <p>The ID of the health check.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hc-k9id4loo3lup57****</p>
         */
        public Builder hcInstanceId(String hcInstanceId) {
            this.putQueryParameter("HcInstanceId", hcInstanceId);
            this.hcInstanceId = hcInstanceId;
            return this;
        }

        /**
         * <p>The name of the health check.</p>
         * <p>The name must be 2 to 100 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>sss333</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of probes that are performed per health check.</p>
         * <p>Valid values: <strong>1</strong> to <strong>20</strong>.</p>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder probeCount(Integer probeCount) {
            this.putQueryParameter("ProbeCount", probeCount);
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
            this.putQueryParameter("ProbeInterval", probeInterval);
            this.probeInterval = probeInterval;
            return this;
        }

        /**
         * <p>The timeout period of the probe.</p>
         * <p>Valid values: <strong>10</strong> to <strong>30000</strong>.</p>
         * <p>Default value: <strong>3000</strong>.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder probeTimeout(Integer probeTimeout) {
            this.putQueryParameter("ProbeTimeout", probeTimeout);
            this.probeTimeout = probeTimeout;
            return this;
        }

        /**
         * <p>The region ID of the Smart Access Gateway (SAG) instance.</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
            this.putQueryParameter("RttFailThreshold", rttFailThreshold);
            this.rttFailThreshold = rttFailThreshold;
            return this;
        }

        /**
         * <p>The maximum round-trip time (RTT).</p>
         * <p>Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>5000</strong>.</p>
         * <p>Default value: <strong>-1</strong>. This value indicates that the RTT threshold is not specified.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder rttThreshold(Integer rttThreshold) {
            this.putQueryParameter("RttThreshold", rttThreshold);
            this.rttThreshold = rttThreshold;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-i0e85k06v1mzpo****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The source IP address of the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder srcIpAddr(String srcIpAddr) {
            this.putQueryParameter("SrcIpAddr", srcIpAddr);
            this.srcIpAddr = srcIpAddr;
            return this;
        }

        /**
         * <p>The source port of the health check.</p>
         * <blockquote>
         * <p> This parameter is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3333</p>
         */
        public Builder srcPort(Integer srcPort) {
            this.putQueryParameter("SrcPort", srcPort);
            this.srcPort = srcPort;
            return this;
        }

        /**
         * <p>The type of packet used in the health check. Only <strong>ICMP_ECHO</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ICMP_ECHO</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyHealthCheckRequest build() {
            return new ModifyHealthCheckRequest(this);
        } 

    } 

}
