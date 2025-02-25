// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link MigrateAvailableZoneRequest} extends {@link RequestModel}
 *
 * <p>MigrateAvailableZoneRequest</p>
 */
public class MigrateAvailableZoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenZoneId")
    private String hiddenZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vswitch")
    private String vswitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private MigrateAvailableZoneRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.effectiveTime = builder.effectiveTime;
        this.hiddenZoneId = builder.hiddenZoneId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.vswitch = builder.vswitch;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateAvailableZoneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return hiddenZoneId
     */
    public String getHiddenZoneId() {
        return this.hiddenZoneId;
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
     * @return secondaryZoneId
     */
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    /**
     * @return vswitch
     */
    public String getVswitch() {
        return this.vswitch;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<MigrateAvailableZoneRequest, Builder> {
        private String DBInstanceId; 
        private String effectiveTime; 
        private String hiddenZoneId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secondaryZoneId; 
        private String vswitch; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateAvailableZoneRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.effectiveTime = request.effectiveTime;
            this.hiddenZoneId = request.hiddenZoneId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secondaryZoneId = request.secondaryZoneId;
            this.vswitch = request.vswitch;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>If the instance is deployed in a VPC, you must specify the <strong>Vswitch</strong> parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1ece71ff2f****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The time when the instance is migrated to the destination zone. Valid values:</p>
         * <ul>
         * <li><strong>Immediately</strong>: The instance is immediately migrated to the destination zone.</li>
         * <li><strong>MaintainTime</strong>: The instance is migrated to the destination zone during the maintenance window of the instance.</li>
         * </ul>
         * <p>Default value: <strong>Immediately</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Immediately</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The ID of the destination hidden zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-n</p>
         */
        public Builder hiddenZoneId(String hiddenZoneId) {
            this.putQueryParameter("HiddenZoneId", hiddenZoneId);
            this.hiddenZoneId = hiddenZoneId;
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
         * <p>The ID of the destination secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the destination zone.</p>
         * <blockquote>
         * <p>If the instance is deployed in a VPC, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1buy0h9myt5i9e7****</p>
         */
        public Builder vswitch(String vswitch) {
            this.putQueryParameter("Vswitch", vswitch);
            this.vswitch = vswitch;
            return this;
        }

        /**
         * <p>The ID of the destination zone.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The source zone and the destination zone belong to the same region.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the zone ID.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public MigrateAvailableZoneRequest build() {
            return new MigrateAvailableZoneRequest(this);
        } 

    } 

}
