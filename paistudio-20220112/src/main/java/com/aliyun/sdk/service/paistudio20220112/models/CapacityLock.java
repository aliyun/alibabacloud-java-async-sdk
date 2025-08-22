// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link CapacityLock} extends {@link TeaModel}
 *
 * <p>CapacityLock</p>
 */
public class CapacityLock extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("availableCount")
    private Integer availableCount;

    @com.aliyun.core.annotation.NameInMap("crsReservationId")
    private String crsReservationId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("instanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("lastReconcileAttemptTime")
    private String lastReconcileAttemptTime;

    @com.aliyun.core.annotation.NameInMap("lastSyncTime")
    private String lastSyncTime;

    @com.aliyun.core.annotation.NameInMap("lockProvider")
    private String lockProvider;

    @com.aliyun.core.annotation.NameInMap("lockedCount")
    private Integer lockedCount;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("privatePoolId")
    private String privatePoolId;

    @com.aliyun.core.annotation.NameInMap("requestedCount")
    private Integer requestedCount;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("usedCount")
    private Integer usedCount;

    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    private CapacityLock(Builder builder) {
        this.availableCount = builder.availableCount;
        this.crsReservationId = builder.crsReservationId;
        this.description = builder.description;
        this.expireTime = builder.expireTime;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.instanceType = builder.instanceType;
        this.lastReconcileAttemptTime = builder.lastReconcileAttemptTime;
        this.lastSyncTime = builder.lastSyncTime;
        this.lockProvider = builder.lockProvider;
        this.lockedCount = builder.lockedCount;
        this.operator = builder.operator;
        this.paymentType = builder.paymentType;
        this.privatePoolId = builder.privatePoolId;
        this.requestedCount = builder.requestedCount;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
        this.usedCount = builder.usedCount;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CapacityLock create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableCount
     */
    public Integer getAvailableCount() {
        return this.availableCount;
    }

    /**
     * @return crsReservationId
     */
    public String getCrsReservationId() {
        return this.crsReservationId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return lastReconcileAttemptTime
     */
    public String getLastReconcileAttemptTime() {
        return this.lastReconcileAttemptTime;
    }

    /**
     * @return lastSyncTime
     */
    public String getLastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * @return lockProvider
     */
    public String getLockProvider() {
        return this.lockProvider;
    }

    /**
     * @return lockedCount
     */
    public Integer getLockedCount() {
        return this.lockedCount;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return privatePoolId
     */
    public String getPrivatePoolId() {
        return this.privatePoolId;
    }

    /**
     * @return requestedCount
     */
    public Integer getRequestedCount() {
        return this.requestedCount;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return usedCount
     */
    public Integer getUsedCount() {
        return this.usedCount;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Integer availableCount; 
        private String crsReservationId; 
        private String description; 
        private String expireTime; 
        private String gmtCreated; 
        private String gmtModified; 
        private String id; 
        private String instanceType; 
        private String lastReconcileAttemptTime; 
        private String lastSyncTime; 
        private String lockProvider; 
        private Integer lockedCount; 
        private String operator; 
        private String paymentType; 
        private String privatePoolId; 
        private Integer requestedCount; 
        private String status; 
        private String tenantId; 
        private Integer usedCount; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(CapacityLock model) {
            this.availableCount = model.availableCount;
            this.crsReservationId = model.crsReservationId;
            this.description = model.description;
            this.expireTime = model.expireTime;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.instanceType = model.instanceType;
            this.lastReconcileAttemptTime = model.lastReconcileAttemptTime;
            this.lastSyncTime = model.lastSyncTime;
            this.lockProvider = model.lockProvider;
            this.lockedCount = model.lockedCount;
            this.operator = model.operator;
            this.paymentType = model.paymentType;
            this.privatePoolId = model.privatePoolId;
            this.requestedCount = model.requestedCount;
            this.status = model.status;
            this.tenantId = model.tenantId;
            this.usedCount = model.usedCount;
            this.zoneId = model.zoneId;
        } 

        /**
         * availableCount.
         */
        public Builder availableCount(Integer availableCount) {
            this.availableCount = availableCount;
            return this;
        }

        /**
         * crsReservationId.
         */
        public Builder crsReservationId(String crsReservationId) {
            this.crsReservationId = crsReservationId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * expireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * gmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * lastReconcileAttemptTime.
         */
        public Builder lastReconcileAttemptTime(String lastReconcileAttemptTime) {
            this.lastReconcileAttemptTime = lastReconcileAttemptTime;
            return this;
        }

        /**
         * lastSyncTime.
         */
        public Builder lastSyncTime(String lastSyncTime) {
            this.lastSyncTime = lastSyncTime;
            return this;
        }

        /**
         * lockProvider.
         */
        public Builder lockProvider(String lockProvider) {
            this.lockProvider = lockProvider;
            return this;
        }

        /**
         * lockedCount.
         */
        public Builder lockedCount(Integer lockedCount) {
            this.lockedCount = lockedCount;
            return this;
        }

        /**
         * operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * paymentType.
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * privatePoolId.
         */
        public Builder privatePoolId(String privatePoolId) {
            this.privatePoolId = privatePoolId;
            return this;
        }

        /**
         * requestedCount.
         */
        public Builder requestedCount(Integer requestedCount) {
            this.requestedCount = requestedCount;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * usedCount.
         */
        public Builder usedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public CapacityLock build() {
            return new CapacityLock(this);
        } 

    } 

}
