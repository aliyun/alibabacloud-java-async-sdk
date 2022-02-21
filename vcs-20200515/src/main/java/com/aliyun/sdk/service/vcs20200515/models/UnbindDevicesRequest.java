// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDevicesRequest} extends {@link RequestModel}
 *
 * <p>UnbindDevicesRequest</p>
 */
public class UnbindDevicesRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Body
    @NameInMap("SubDeviceIdList")
    @Validation(required = true)
    private String subDeviceIdList;

    private UnbindDevicesRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.deviceId = builder.deviceId;
        this.subDeviceIdList = builder.subDeviceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return subDeviceIdList
     */
    public String getSubDeviceIdList() {
        return this.subDeviceIdList;
    }

    public static final class Builder extends Request.Builder<UnbindDevicesRequest, Builder> {
        private String corpId; 
        private String deviceId; 
        private String subDeviceIdList; 

        private Builder() {
            super();
        } 

        private Builder(UnbindDevicesRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.deviceId = response.deviceId;
            this.subDeviceIdList = response.subDeviceIdList;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * SubDeviceIdList.
         */
        public Builder subDeviceIdList(String subDeviceIdList) {
            this.putBodyParameter("SubDeviceIdList", subDeviceIdList);
            this.subDeviceIdList = subDeviceIdList;
            return this;
        }

        @Override
        public UnbindDevicesRequest build() {
            return new UnbindDevicesRequest(this);
        } 

    } 

}
