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
 * {@link CreateQosPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateQosPolicyRequest</p>
 */
public class CreateQosPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destPortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DpiGroupIds")
    private java.util.List<String> dpiGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DpiSignatureIds")
    private java.util.List<String> dpiSignatureIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipProtocol;

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
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosId;

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
    @com.aliyun.core.annotation.NameInMap("SourceCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateQosPolicyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.destCidr = builder.destCidr;
        this.destPortRange = builder.destPortRange;
        this.dpiGroupIds = builder.dpiGroupIds;
        this.dpiSignatureIds = builder.dpiSignatureIds;
        this.endTime = builder.endTime;
        this.ipProtocol = builder.ipProtocol;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.qosId = builder.qosId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceCidr = builder.sourceCidr;
        this.sourcePortRange = builder.sourcePortRange;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQosPolicyRequest create() {
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
     * @return dpiGroupIds
     */
    public java.util.List<String> getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    /**
     * @return dpiSignatureIds
     */
    public java.util.List<String> getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
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
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateQosPolicyRequest, Builder> {
        private String description; 
        private String destCidr; 
        private String destPortRange; 
        private java.util.List<String> dpiGroupIds; 
        private java.util.List<String> dpiSignatureIds; 
        private String endTime; 
        private String ipProtocol; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private String qosId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceCidr; 
        private String sourcePortRange; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateQosPolicyRequest request) {
            super(request);
            this.description = request.description;
            this.destCidr = request.destCidr;
            this.destPortRange = request.destPortRange;
            this.dpiGroupIds = request.dpiGroupIds;
            this.dpiSignatureIds = request.dpiSignatureIds;
            this.endTime = request.endTime;
            this.ipProtocol = request.ipProtocol;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.qosId = request.qosId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceCidr = request.sourceCidr;
            this.sourcePortRange = request.sourcePortRange;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The description of the traffic classification rule.</p>
         * <p>The description must be 1 to 512 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination CIDR block.</p>
         * <p>Specify the value of this parameter in CIDR notation. Example: 192.168.10.0/24.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.20.0/24</p>
         */
        public Builder destCidr(String destCidr) {
            this.putQueryParameter("DestCidr", destCidr);
            this.destCidr = destCidr;
            return this;
        }

        /**
         * <p>The destination port range.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong> and <strong>-1</strong>.</p>
         * <p>Examples:</p>
         * <ul>
         * <li><strong>1/200</strong>: a port range from 1 to 200</li>
         * <li><strong>80/80</strong>: port 80</li>
         * <li><strong>-1/-1</strong>: all ports</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder destPortRange(String destPortRange) {
            this.putQueryParameter("DestPortRange", destPortRange);
            this.destPortRange = destPortRange;
            return this;
        }

        /**
         * DpiGroupIds.
         */
        public Builder dpiGroupIds(java.util.List<String> dpiGroupIds) {
            this.putQueryParameter("DpiGroupIds", dpiGroupIds);
            this.dpiGroupIds = dpiGroupIds;
            return this;
        }

        /**
         * DpiSignatureIds.
         */
        public Builder dpiSignatureIds(java.util.List<String> dpiSignatureIds) {
            this.putQueryParameter("DpiSignatureIds", dpiSignatureIds);
            this.dpiSignatureIds = dpiSignatureIds;
            return this;
        }

        /**
         * <p>The time when the traffic classification rule expires.</p>
         * <p>Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ss+0800</code> format. The time must be in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-14T16:41:33+0800</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The type of the protocol that applies to the traffic classification rule.</p>
         * <p>The supported protocols provided in this topic are for reference only. The actual protocols in the console shall prevail.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The name of the traffic classification rule.</p>
         * <p>The name must be 2 to 100 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
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
         * <p>The priority of the traffic throttling policy to which the traffic classification rule belongs.</p>
         * <p>Valid values: <strong>1 to 3</strong>. A smaller value indicates a higher priority.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the QoS policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-xitd8690ucu8ro****</p>
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The ID of the region to which the QoS policy belongs.</p>
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
         * <p>The source CIDR block.</p>
         * <p>Specify the value of this parameter in CIDR notation. Example: 192.168.1.0/24.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        public Builder sourceCidr(String sourceCidr) {
            this.putQueryParameter("SourceCidr", sourceCidr);
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * <p>The source port range.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong> and <strong>-1</strong>.</p>
         * <p>Examples:</p>
         * <ul>
         * <li><strong>1/200</strong>: a port range from 1 to 200</li>
         * <li><strong>80/80</strong>: port 80</li>
         * <li><strong>-1/-1</strong>: all ports</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * <p>The time when the traffic classification rule takes effect.</p>
         * <p>Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ss+0800</code> format. The time must be in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-14T16:41:33+0800</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateQosPolicyRequest build() {
            return new CreateQosPolicyRequest(this);
        } 

    } 

}
