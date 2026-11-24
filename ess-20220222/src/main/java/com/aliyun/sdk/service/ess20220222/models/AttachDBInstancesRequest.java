// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link AttachDBInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachDBInstancesRequest</p>
 */
public class AttachDBInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachMode")
    private String attachMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> DBInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceAttach")
    private Boolean forceAttach;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AttachDBInstancesRequest(Builder builder) {
        super(builder);
        this.attachMode = builder.attachMode;
        this.clientToken = builder.clientToken;
        this.DBInstances = builder.DBInstances;
        this.forceAttach = builder.forceAttach;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDBInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachMode
     */
    public String getAttachMode() {
        return this.attachMode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstances
     */
    public java.util.List<String> getDBInstances() {
        return this.DBInstances;
    }

    /**
     * @return forceAttach
     */
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AttachDBInstancesRequest, Builder> {
        private String attachMode; 
        private String clientToken; 
        private java.util.List<String> DBInstances; 
        private Boolean forceAttach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AttachDBInstancesRequest request) {
            super(request);
            this.attachMode = request.attachMode;
            this.clientToken = request.clientToken;
            this.DBInstances = request.DBInstances;
            this.forceAttach = request.forceAttach;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.type = request.type;
        } 

        /**
         * <p>The association mode between the scaling group and the database. Valid values:</p>
         * <ul>
         * <li>SecurityIp: The SecurityIp mode. In this mode, the IP addresses of scaled-out instances are automatically added to the IP address whitelist of the database. Currently, only ApsaraDB RDS databases support this mode.</li>
         * <li>SecurityGroup: The security group mode. In this mode, the security group of the scaling configuration is added to the security group whitelist of the database for association and registration.</li>
         * </ul>
         * <p>Default value: SecurityIp.</p>
         * 
         * <strong>example:</strong>
         * <p>SecurityIp</p>
         */
        public Builder attachMode(String attachMode) {
            this.putQueryParameter("AttachMode", attachMode);
            this.attachMode = attachMode;
            return this;
        }

        /**
         * <p>Ensures the idempotence of the request. You can generate a parameter value from your client to ensure that the parameter value is unique across different requests.</p>
         * <p>The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The IDs of the RDS instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder DBInstances(java.util.List<String> DBInstances) {
            this.putQueryParameter("DBInstances", DBInstances);
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * <p>Specifies whether to add the private IP addresses of all instances in the current scaling group to the IP address whitelist of the RDS instances when the RDS instances are attached to the scaling group. Valid values:</p>
         * <ul>
         * <li><p>true: Adds the private IP addresses.</p>
         * </li>
         * <li><p>false: Does not add the private IP addresses.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceAttach(Boolean forceAttach) {
            this.putQueryParameter("ForceAttach", forceAttach);
            this.forceAttach = forceAttach;
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
         * <p>The region ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
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
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1avr6ensitts3w****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li>RDS</li>
         * <li>Redis</li>
         * <li>MongoDB</li>
         * </ul>
         * <p>Default value: RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AttachDBInstancesRequest build() {
            return new AttachDBInstancesRequest(this);
        } 

    } 

}
