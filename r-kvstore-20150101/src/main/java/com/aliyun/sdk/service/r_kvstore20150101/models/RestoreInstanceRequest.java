// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RestoreInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestoreInstanceRequest</p>
 */
public class RestoreInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterKey")
    private String filterKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    private String restoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeShift")
    private String timeShift;

    private RestoreInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupId = builder.backupId;
        this.filterKey = builder.filterKey;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.securityToken = builder.securityToken;
        this.timeShift = builder.timeShift;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return filterKey
     */
    public String getFilterKey() {
        return this.filterKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return timeShift
     */
    public String getTimeShift() {
        return this.timeShift;
    }

    public static final class Builder extends Request.Builder<RestoreInstanceRequest, Builder> {
        private String regionId; 
        private String backupId; 
        private String filterKey; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String securityToken; 
        private String timeShift; 

        private Builder() {
            super();
        } 

        private Builder(RestoreInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupId = request.backupId;
            this.filterKey = request.filterKey;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.securityToken = request.securityToken;
            this.timeShift = request.timeShift;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the backup file. You can call the <a href="https://help.aliyun.com/document_detail/61081.html">DescribeBackups</a> operation to query the IDs of backup files.</p>
         * 
         * <strong>example:</strong>
         * <p>78241****</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The key that you want to restore. You can specify multiple keys. Separate multiple keys with commas (,). Regular expressions are supported.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>In a regular expression, an asterisk (<code>*</code>) matches zero or more occurrences of a subexpression that occurs before. For example, if you set this parameter to <code>h.*llo</code>, strings such as <code>hllo</code> and <code>heeeello</code> are matched.</p>
         * </li>
         * <li><p>This parameter is available only if you set the <strong>RestoreType</strong> parameter to <strong>1</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>key:00000007198*</p>
         */
        public Builder filterKey(String filterKey) {
            this.putQueryParameter("FilterKey", filterKey);
            this.filterKey = filterKey;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>The point in time to which you want to restore data. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the <a href="https://help.aliyun.com/document_detail/148479.html">data flashback</a> feature is enabled for the instance, you can specify this parameter and the <strong>FilterKey</strong> parameter to restore the data of the specified key to the specified point in time that is accurate to the second. Other keys are not affected. This way, you can achieve more fine-grained data restoration.</p>
         * </li>
         * <li><p>This parameter is available only if you set the <strong>RestoreType</strong> parameter to <strong>1</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-07-06T07:25:57Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The restoration mode. Default value: 0. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: restores data from the specified backup set.</li>
         * <li><strong>1</strong>: restores data to a specified point in time. You can specify this value only if the <a href="https://help.aliyun.com/document_detail/148479.html">data flashback</a> feature is enabled for the instance. If you specify this value, you must also specify the <strong>RestoreTime</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The expiration offset time point of a key. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC. The key expires after the remaining validity period of the key elapses based on the expiration offset time point.</p>
         * <blockquote>
         * <p>This time point must be between the specified flashback time point and the submission time of the data restoration task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-07-06T08:25:57Z</p>
         */
        public Builder timeShift(String timeShift) {
            this.putQueryParameter("TimeShift", timeShift);
            this.timeShift = timeShift;
            return this;
        }

        @Override
        public RestoreInstanceRequest build() {
            return new RestoreInstanceRequest(this);
        } 

    } 

}
