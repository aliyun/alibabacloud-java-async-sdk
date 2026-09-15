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
 * {@link CreateTrafficMirrorSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficMirrorSessionRequest</p>
 */
public class CreateTrafficMirrorSessionRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true, maximum = 32766, minimum = 1)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMirrorFilterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionDescription")
    private String trafficMirrorSessionDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorSessionName")
    private String trafficMirrorSessionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorSourceIds")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private java.util.List<String> trafficMirrorSourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorTargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMirrorTargetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorTargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMirrorTargetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNetworkId")
    private Integer virtualNetworkId;

    private CreateTrafficMirrorSessionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.enabled = builder.enabled;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.packetLength = builder.packetLength;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
        this.trafficMirrorSessionDescription = builder.trafficMirrorSessionDescription;
        this.trafficMirrorSessionName = builder.trafficMirrorSessionName;
        this.trafficMirrorSourceIds = builder.trafficMirrorSourceIds;
        this.trafficMirrorTargetId = builder.trafficMirrorTargetId;
        this.trafficMirrorTargetType = builder.trafficMirrorTargetType;
        this.virtualNetworkId = builder.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMirrorSessionRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
     * @return trafficMirrorSessionName
     */
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
    }

    /**
     * @return trafficMirrorSourceIds
     */
    public java.util.List<String> getTrafficMirrorSourceIds() {
        return this.trafficMirrorSourceIds;
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

    public static final class Builder extends Request.Builder<CreateTrafficMirrorSessionRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Boolean enabled; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer packetLength; 
        private Integer priority; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 
        private String trafficMirrorFilterId; 
        private String trafficMirrorSessionDescription; 
        private String trafficMirrorSessionName; 
        private java.util.List<String> trafficMirrorSourceIds; 
        private String trafficMirrorTargetId; 
        private String trafficMirrorTargetType; 
        private Integer virtualNetworkId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficMirrorSessionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.enabled = request.enabled;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.packetLength = request.packetLength;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.trafficMirrorFilterId = request.trafficMirrorFilterId;
            this.trafficMirrorSessionDescription = request.trafficMirrorSessionDescription;
            this.trafficMirrorSessionName = request.trafficMirrorSessionName;
            this.trafficMirrorSourceIds = request.trafficMirrorSourceIds;
            this.trafficMirrorTargetId = request.trafficMirrorTargetId;
            this.trafficMirrorTargetType = request.trafficMirrorTargetType;
            this.virtualNetworkId = request.virtualNetworkId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
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
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the traffic mirror session is created.</p>
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
         * <p>The maximum length of the mirrored original packet, excluding the VXLAN packet length. Default value: <strong>1500</strong>. Valid values: <strong>64</strong> to <strong>8500</strong>. Unit: bytes.</p>
         * <ul>
         * <li><p>This parameter affects the length of packets received at the traffic mirror destination. For more information, see the mirrored packet length and MTU limits in <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
         * </li>
         * <li><p>This parameter is available only in specific regions. For more information, see the description of the mirrored packet length parameter in <a href="https://help.aliyun.com/document_detail/207514.html">Create and manage traffic mirrors</a>.</p>
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
         * <p>The priority of traffic mirror session. Valid values: <strong>1</strong> to <strong>32766</strong>.
         * A smaller value indicates a higher priority. The priorities of traffic mirror sessions created in the same region under the same account must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The ID of the resource group to which the traffic mirroring instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The tags of the resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The instance ID of the traffic mirror filter.</p>
         * <p>This parameter is required.</p>
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
         * <p>The description of the traffic mirror session.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a trafficmirrorsession.</p>
         */
        public Builder trafficMirrorSessionDescription(String trafficMirrorSessionDescription) {
            this.putQueryParameter("TrafficMirrorSessionDescription", trafficMirrorSessionDescription);
            this.trafficMirrorSessionDescription = trafficMirrorSessionDescription;
            return this;
        }

        /**
         * <p>The name of the traffic mirror session.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder trafficMirrorSessionName(String trafficMirrorSessionName) {
            this.putQueryParameter("TrafficMirrorSessionName", trafficMirrorSessionName);
            this.trafficMirrorSessionName = trafficMirrorSessionName;
            return this;
        }

        /**
         * <p>The instance ID of the traffic mirror source. Elastic network interfaces (ENIs) are supported as traffic mirror sources. The default value of <strong>N</strong> is <strong>1</strong>, which indicates that only one traffic mirror source can be added to a traffic mirror session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-j6c2fp57q8rr47rp****</p>
         */
        public Builder trafficMirrorSourceIds(java.util.List<String> trafficMirrorSourceIds) {
            this.putQueryParameter("TrafficMirrorSourceIds", trafficMirrorSourceIds);
            this.trafficMirrorSourceIds = trafficMirrorSourceIds;
            return this;
        }

        /**
         * <p>The instance ID of the traffic mirror destination. Elastic network interfaces (ENIs) and private network load balancing instances are supported as traffic mirror destinations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-j6c8znm5l1yt4sox****</p>
         */
        public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
            this.putQueryParameter("TrafficMirrorTargetId", trafficMirrorTargetId);
            this.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }

        /**
         * <p>The type of the traffic mirror destination. Valid values:</p>
         * <ul>
         * <li><p><strong>NetworkInterface</strong>: elastic network interface (ENI).</p>
         * </li>
         * <li><p><strong>SLB</strong>: private network load balancing instance.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The VXLAN network identifier (VNI) that is used to distinguish mirrored data from different traffic mirror sessions. Valid values: <strong>0</strong> to <strong>16777215</strong>.</p>
         * <p>You can use the VNI to identify mirrored data from different sessions at the traffic mirror destination. You can specify a custom VNI or use a system-assigned value. To use a system-assigned value, do not specify this parameter. The system randomly allocates the value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder virtualNetworkId(Integer virtualNetworkId) {
            this.putQueryParameter("VirtualNetworkId", virtualNetworkId);
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }

        @Override
        public CreateTrafficMirrorSessionRequest build() {
            return new CreateTrafficMirrorSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTrafficMirrorSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateTrafficMirrorSessionRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
