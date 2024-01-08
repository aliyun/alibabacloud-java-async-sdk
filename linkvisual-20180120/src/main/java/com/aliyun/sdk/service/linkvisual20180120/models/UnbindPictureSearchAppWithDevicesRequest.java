// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindPictureSearchAppWithDevicesRequest} extends {@link RequestModel}
 *
 * <p>UnbindPictureSearchAppWithDevicesRequest</p>
 */
public class UnbindPictureSearchAppWithDevicesRequest extends Request {
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

    private UnbindPictureSearchAppWithDevicesRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.deviceIotIds = builder.deviceIotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindPictureSearchAppWithDevicesRequest create() {
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

    public static final class Builder extends Request.Builder<UnbindPictureSearchAppWithDevicesRequest, Builder> {
        private String appInstanceId; 
        private java.util.List < String > deviceIotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindPictureSearchAppWithDevicesRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.deviceIotIds = request.deviceIotIds;
            this.iotInstanceId = request.iotInstanceId;
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
        public UnbindPictureSearchAppWithDevicesRequest build() {
            return new UnbindPictureSearchAppWithDevicesRequest(this);
        } 

    } 

}
