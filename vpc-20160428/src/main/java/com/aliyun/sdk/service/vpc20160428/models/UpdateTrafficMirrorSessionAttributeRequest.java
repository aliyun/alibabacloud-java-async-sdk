// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link UpdateTrafficMirrorSessionAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficMirrorSessionAttributeRequest</p>
 */
public class UpdateTrafficMirrorSessionAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PacketLength")
    private Integer packetLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

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
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterId")
    private String trafficMirrorFilterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionDescription")
    private String trafficMirrorSessionDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMirrorSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionName")
    private String trafficMirrorSessionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorTargetId")
    private String trafficMirrorTargetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorTargetType")
    private String trafficMirrorTargetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNetworkId")
    private Integer virtualNetworkId;

    private UpdateTrafficMirrorSessionAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.enabled = builder.enabled;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.packetLength = builder.packetLength;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
        this.trafficMirrorSessionDescription = builder.trafficMirrorSessionDescription;
        this.trafficMirrorSessionId = builder.trafficMirrorSessionId;
        this.trafficMirrorSessionName = builder.trafficMirrorSessionName;
        this.trafficMirrorTargetId = builder.trafficMirrorTargetId;
        this.trafficMirrorTargetType = builder.trafficMirrorTargetType;
        this.virtualNetworkId = builder.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficMirrorSessionAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
     * @return packetLength
     */
    public Integer getPacketLength() {
        return this.packetLength;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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
     * @return trafficMirrorFilterId
     */
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * @return trafficMirrorSessionDescription
     */
    public String getTrafficMirrorSessionDescription() {
        return this.trafficMirrorSessionDescription;
    }

    /**
     * @return trafficMirrorSessionId
     */
    public String getTrafficMirrorSessionId() {
        return this.trafficMirrorSessionId;
    }

    /**
     * @return trafficMirrorSessionName
     */
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
    }

    /**
     * @return trafficMirrorTargetId
     */
    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    /**
     * @return trafficMirrorTargetType
     */
    public String getTrafficMirrorTargetType() {
        return this.trafficMirrorTargetType;
    }

    /**
     * @return virtualNetworkId
     */
    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    public static final class Builder extends Request.Builder<UpdateTrafficMirrorSessionAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Boolean enabled; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer packetLength; 
        private Integer priority; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMirrorFilterId; 
        private String trafficMirrorSessionDescription; 
        private String trafficMirrorSessionId; 
        private String trafficMirrorSessionName; 
        private String trafficMirrorTargetId; 
        private String trafficMirrorTargetType; 
        private Integer virtualNetworkId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrafficMirrorSessionAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.enabled = request.enabled;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.packetLength = request.packetLength;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMirrorFilterId = request.trafficMirrorFilterId;
            this.trafficMirrorSessionDescription = request.trafficMirrorSessionDescription;
            this.trafficMirrorSessionId = request.trafficMirrorSessionId;
            this.trafficMirrorSessionName = request.trafficMirrorSessionName;
            this.trafficMirrorTargetId = request.trafficMirrorTargetId;
            this.trafficMirrorTargetType = request.trafficMirrorTargetType;
            this.virtualNetworkId = request.virtualNetworkId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the configuration of the traffic mirror session is modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to enable the traffic mirror session. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): does not enable the traffic mirror session.</p>
         * </li>
         * <li><p><strong>true</strong>: enables the traffic mirror session.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
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
         * <p>The maximum length of the mirrored original packet, excluding the VXLAN header. Default value: <strong>1500</strong>. Valid values: <strong>64</strong> to <strong>8500</strong>. Unit: bytes.</p>
         * <ul>
         * <li><p>The value of this parameter affects the length of packets received at the traffic mirror destination. For more information, see the mirrored packet length and MTU limits in <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
         * </li>
         * <li><p>This parameter is available only in specific regions. For more information, see the mirrored packet length parameter description in <a href="https://help.aliyun.com/document_detail/207514.html">Create and manage traffic mirror sessions</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        public Builder packetLength(Integer packetLength) {
            this.putQueryParameter("PacketLength", packetLength);
            this.packetLength = packetLength;
            return this;
        }

        /**
         * <p>The new priority of traffic mirror session. Valid values: <strong>1</strong> to <strong>32766</strong>.
         * A smaller value indicates a higher priority. The priorities of traffic mirror sessions created by the same account in the same region must be unique.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The region ID of the traffic mirror session. You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list. For information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
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
         * <p>The instance ID of the new traffic mirror filter.</p>
         * 
         * <strong>example:</strong>
         * <p>tmf-j6cmls82xnc86vtpe****</p>
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            this.putQueryParameter("TrafficMirrorFilterId", trafficMirrorFilterId);
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        /**
         * <p>The new description of the traffic mirror session.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a new session.</p>
         */
        public Builder trafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
            this.putQueryParameter("TrafficMirrorSessionDescription", trafficMirrorSessionDescription);
            this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
            return this;
        }

        /**
         * <p>The instance ID of the traffic mirror session to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tms-j6cla50buc44ap8tu****</p>
         */
        public Builder trafficMirrorSessionId(String trafficMirrorSessionId) {
            this.putQueryParameter("TrafficMirrorSessionId", trafficMirrorSessionId);
            this.trafficMirrorSessionId = trafficMirrorSessionId;
            return this;
        }

        /**
         * <p>The new name of the traffic mirror session.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder trafficMirrorSessionName(String trafficMirrorSessionName) {
            this.putQueryParameter("TrafficMirrorSessionName", trafficMirrorSessionName);
            this.trafficMirrorSessionName = trafficMirrorSessionName;
            return this;
        }

        /**
         * <p>The instance ID of the new traffic mirror destination.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-j6c2fp57q8rr47rp*****</p>
         */
        public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
            this.putQueryParameter("TrafficMirrorTargetId", trafficMirrorTargetId);
            this.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }

        /**
         * <p>The new traffic mirror destination type. Valid values:</p>
         * <ul>
         * <li><p><strong>NetworkInterface</strong>: network interface controller (NIC).</p>
         * </li>
         * <li><p><strong>SLB</strong>: private network load balancing instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NetworkInterface</p>
         */
        public Builder trafficMirrorTargetType(String trafficMirrorTargetType) {
            this.putQueryParameter("TrafficMirrorTargetType", trafficMirrorTargetType);
            this.trafficMirrorTargetType = trafficMirrorTargetType;
            return this;
        }

        /**
         * <p>The new VXLAN network identifier (VNI) that is used to distinguish mirrored data from different traffic mirror sessions. Valid values: <strong>0</strong> to <strong>16777215</strong>.
         * You can use the VNI to identify mirrored data from different sessions at the traffic mirror destination. You can specify a custom VNI or use a system-allocated value. If you want the system to randomly allocate a VNI, do not configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder virtualNetworkId(Integer virtualNetworkId) {
            this.putQueryParameter("VirtualNetworkId", virtualNetworkId);
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }

        @Override
        public UpdateTrafficMirrorSessionAttributeRequest build() {
            return new UpdateTrafficMirrorSessionAttributeRequest(this);
        } 

    } 

}
