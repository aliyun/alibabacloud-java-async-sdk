// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link MdbAgentInstanceVo} extends {@link TeaModel}
 *
 * <p>MdbAgentInstanceVo</p>
 */
public class MdbAgentInstanceVo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessUrl")
    private String accessUrl;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("EngineInstanceId")
    private String engineInstanceId;

    @com.aliyun.core.annotation.NameInMap("EngineRegion")
    private String engineRegion;

    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("LastActiveTime")
    private String lastActiveTime;

    @com.aliyun.core.annotation.NameInMap("LockTime")
    private String lockTime;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("PublicDomain")
    private String publicDomain;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("StatusDesc")
    private String statusDesc;

    @com.aliyun.core.annotation.NameInMap("StatusMessage")
    private String statusMessage;

    private MdbAgentInstanceVo(Builder builder) {
        this.accessUrl = builder.accessUrl;
        this.chargeType = builder.chargeType;
        this.engineInstanceId = builder.engineInstanceId;
        this.engineRegion = builder.engineRegion;
        this.engineType = builder.engineType;
        this.gmtCreate = builder.gmtCreate;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lastActiveTime = builder.lastActiveTime;
        this.lockTime = builder.lockTime;
        this.orderId = builder.orderId;
        this.publicDomain = builder.publicDomain;
        this.status = builder.status;
        this.statusDesc = builder.statusDesc;
        this.statusMessage = builder.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MdbAgentInstanceVo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessUrl
     */
    public String getAccessUrl() {
        return this.accessUrl;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return engineInstanceId
     */
    public String getEngineInstanceId() {
        return this.engineInstanceId;
    }

    /**
     * @return engineRegion
     */
    public String getEngineRegion() {
        return this.engineRegion;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return lastActiveTime
     */
    public String getLastActiveTime() {
        return this.lastActiveTime;
    }

    /**
     * @return lockTime
     */
    public String getLockTime() {
        return this.lockTime;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return publicDomain
     */
    public String getPublicDomain() {
        return this.publicDomain;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return statusDesc
     */
    public String getStatusDesc() {
        return this.statusDesc;
    }

    /**
     * @return statusMessage
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public static final class Builder {
        private String accessUrl; 
        private String chargeType; 
        private String engineInstanceId; 
        private String engineRegion; 
        private String engineType; 
        private String gmtCreate; 
        private String instanceId; 
        private String instanceName; 
        private String lastActiveTime; 
        private String lockTime; 
        private String orderId; 
        private String publicDomain; 
        private Integer status; 
        private String statusDesc; 
        private String statusMessage; 

        private Builder() {
        } 

        private Builder(MdbAgentInstanceVo model) {
            this.accessUrl = model.accessUrl;
            this.chargeType = model.chargeType;
            this.engineInstanceId = model.engineInstanceId;
            this.engineRegion = model.engineRegion;
            this.engineType = model.engineType;
            this.gmtCreate = model.gmtCreate;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.lastActiveTime = model.lastActiveTime;
            this.lockTime = model.lockTime;
            this.orderId = model.orderId;
            this.publicDomain = model.publicDomain;
            this.status = model.status;
            this.statusDesc = model.statusDesc;
            this.statusMessage = model.statusMessage;
        } 

        /**
         * AccessUrl.
         */
        public Builder accessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * EngineInstanceId.
         */
        public Builder engineInstanceId(String engineInstanceId) {
            this.engineInstanceId = engineInstanceId;
            return this;
        }

        /**
         * EngineRegion.
         */
        public Builder engineRegion(String engineRegion) {
            this.engineRegion = engineRegion;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * LastActiveTime.
         */
        public Builder lastActiveTime(String lastActiveTime) {
            this.lastActiveTime = lastActiveTime;
            return this;
        }

        /**
         * LockTime.
         */
        public Builder lockTime(String lockTime) {
            this.lockTime = lockTime;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PublicDomain.
         */
        public Builder publicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * StatusDesc.
         */
        public Builder statusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }

        /**
         * StatusMessage.
         */
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        public MdbAgentInstanceVo build() {
            return new MdbAgentInstanceVo(this);
        } 

    } 

}
