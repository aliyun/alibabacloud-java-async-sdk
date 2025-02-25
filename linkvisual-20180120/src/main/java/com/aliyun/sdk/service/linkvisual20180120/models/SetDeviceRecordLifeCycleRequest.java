// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDeviceRecordLifeCycleRequest} extends {@link RequestModel}
 *
 * <p>SetDeviceRecordLifeCycleRequest</p>
 */
public class SetDeviceRecordLifeCycleRequest extends Request {
    @Query
    @NameInMap("Day")
    @Validation(required = true)
    private Integer day;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private SetDeviceRecordLifeCycleRequest(Builder builder) {
        super(builder);
        this.day = builder.day;
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeviceRecordLifeCycleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return day
     */
    public Integer getDay() {
        return this.day;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<SetDeviceRecordLifeCycleRequest, Builder> {
        private Integer day; 
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(SetDeviceRecordLifeCycleRequest request) {
            super(request);
            this.day = request.day;
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * Day.
         */
        public Builder day(Integer day) {
            this.putQueryParameter("Day", day);
            this.day = day;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
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

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public SetDeviceRecordLifeCycleRequest build() {
            return new SetDeviceRecordLifeCycleRequest(this);
        } 

    } 

}
