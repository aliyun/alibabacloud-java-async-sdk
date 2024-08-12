// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDeviceOtaAutoStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDeviceOtaAutoStatusRequest</p>
 */
public class SetDeviceOtaAutoStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoUpdate")
    private Integer autoUpdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoUpdateTimeSchedule")
    private String autoUpdateTimeSchedule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceUpgrade")
    private Integer forceUpgrade;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private SetDeviceOtaAutoStatusRequest(Builder builder) {
        super(builder);
        this.autoUpdate = builder.autoUpdate;
        this.autoUpdateTimeSchedule = builder.autoUpdateTimeSchedule;
        this.clientType = builder.clientType;
        this.forceUpgrade = builder.forceUpgrade;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeviceOtaAutoStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUpdate
     */
    public Integer getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * @return autoUpdateTimeSchedule
     */
    public String getAutoUpdateTimeSchedule() {
        return this.autoUpdateTimeSchedule;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return forceUpgrade
     */
    public Integer getForceUpgrade() {
        return this.forceUpgrade;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetDeviceOtaAutoStatusRequest, Builder> {
        private Integer autoUpdate; 
        private String autoUpdateTimeSchedule; 
        private Integer clientType; 
        private Integer forceUpgrade; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetDeviceOtaAutoStatusRequest request) {
            super(request);
            this.autoUpdate = request.autoUpdate;
            this.autoUpdateTimeSchedule = request.autoUpdateTimeSchedule;
            this.clientType = request.clientType;
            this.forceUpgrade = request.forceUpgrade;
            this.status = request.status;
        } 

        /**
         * AutoUpdate.
         */
        public Builder autoUpdate(Integer autoUpdate) {
            this.putBodyParameter("AutoUpdate", autoUpdate);
            this.autoUpdate = autoUpdate;
            return this;
        }

        /**
         * AutoUpdateTimeSchedule.
         */
        public Builder autoUpdateTimeSchedule(String autoUpdateTimeSchedule) {
            this.putBodyParameter("AutoUpdateTimeSchedule", autoUpdateTimeSchedule);
            this.autoUpdateTimeSchedule = autoUpdateTimeSchedule;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * ForceUpgrade.
         */
        public Builder forceUpgrade(Integer forceUpgrade) {
            this.putBodyParameter("ForceUpgrade", forceUpgrade);
            this.forceUpgrade = forceUpgrade;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetDeviceOtaAutoStatusRequest build() {
            return new SetDeviceOtaAutoStatusRequest(this);
        } 

    } 

}
