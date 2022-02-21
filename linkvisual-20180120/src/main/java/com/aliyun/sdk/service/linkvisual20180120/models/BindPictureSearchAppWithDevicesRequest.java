// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindPictureSearchAppWithDevicesRequest} extends {@link RequestModel}
 *
 * <p>BindPictureSearchAppWithDevicesRequest</p>
 */
public class BindPictureSearchAppWithDevicesRequest extends Request {
    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("DeviceIotIds")
    @Validation(required = true)
    private java.util.List < String > deviceIotIds;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BindPictureSearchAppWithDevicesRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.deviceIotIds = builder.deviceIotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindPictureSearchAppWithDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return deviceIotIds
     */
    public java.util.List < String > getDeviceIotIds() {
        return this.deviceIotIds;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BindPictureSearchAppWithDevicesRequest, Builder> {
        private String appInstanceId; 
        private java.util.List < String > deviceIotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BindPictureSearchAppWithDevicesRequest response) {
            super(response);
            this.appInstanceId = response.appInstanceId;
            this.deviceIotIds = response.deviceIotIds;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * DeviceIotIds.
         */
        public Builder deviceIotIds(java.util.List < String > deviceIotIds) {
            this.putQueryParameter("DeviceIotIds", deviceIotIds);
            this.deviceIotIds = deviceIotIds;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BindPictureSearchAppWithDevicesRequest build() {
            return new BindPictureSearchAppWithDevicesRequest(this);
        } 

    } 

}
