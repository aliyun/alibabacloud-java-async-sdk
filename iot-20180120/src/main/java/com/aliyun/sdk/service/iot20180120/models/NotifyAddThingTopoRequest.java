// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotifyAddThingTopoRequest} extends {@link RequestModel}
 *
 * <p>NotifyAddThingTopoRequest</p>
 */
public class NotifyAddThingTopoRequest extends Request {
    @Query
    @NameInMap("DeviceListStr")
    private String deviceListStr;

    @Query
    @NameInMap("GwDeviceName")
    private String gwDeviceName;

    @Query
    @NameInMap("GwIotId")
    private String gwIotId;

    @Query
    @NameInMap("GwProductKey")
    private String gwProductKey;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private NotifyAddThingTopoRequest(Builder builder) {
        super(builder);
        this.deviceListStr = builder.deviceListStr;
        this.gwDeviceName = builder.gwDeviceName;
        this.gwIotId = builder.gwIotId;
        this.gwProductKey = builder.gwProductKey;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyAddThingTopoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceListStr
     */
    public String getDeviceListStr() {
        return this.deviceListStr;
    }

    /**
     * @return gwDeviceName
     */
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    /**
     * @return gwIotId
     */
    public String getGwIotId() {
        return this.gwIotId;
    }

    /**
     * @return gwProductKey
     */
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<NotifyAddThingTopoRequest, Builder> {
        private String deviceListStr; 
        private String gwDeviceName; 
        private String gwIotId; 
        private String gwProductKey; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(NotifyAddThingTopoRequest request) {
            super(request);
            this.deviceListStr = request.deviceListStr;
            this.gwDeviceName = request.gwDeviceName;
            this.gwIotId = request.gwIotId;
            this.gwProductKey = request.gwProductKey;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * DeviceListStr.
         */
        public Builder deviceListStr(String deviceListStr) {
            this.putQueryParameter("DeviceListStr", deviceListStr);
            this.deviceListStr = deviceListStr;
            return this;
        }

        /**
         * GwDeviceName.
         */
        public Builder gwDeviceName(String gwDeviceName) {
            this.putQueryParameter("GwDeviceName", gwDeviceName);
            this.gwDeviceName = gwDeviceName;
            return this;
        }

        /**
         * GwIotId.
         */
        public Builder gwIotId(String gwIotId) {
            this.putQueryParameter("GwIotId", gwIotId);
            this.gwIotId = gwIotId;
            return this;
        }

        /**
         * GwProductKey.
         */
        public Builder gwProductKey(String gwProductKey) {
            this.putQueryParameter("GwProductKey", gwProductKey);
            this.gwProductKey = gwProductKey;
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
        public NotifyAddThingTopoRequest build() {
            return new NotifyAddThingTopoRequest(this);
        } 

    } 

}
