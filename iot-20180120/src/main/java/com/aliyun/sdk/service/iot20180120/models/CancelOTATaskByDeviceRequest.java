// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOTATaskByDeviceRequest} extends {@link RequestModel}
 *
 * <p>CancelOTATaskByDeviceRequest</p>
 */
public class CancelOTATaskByDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    @Validation(required = true)
    private java.util.List < String > deviceName;

    @Query
    @NameInMap("FirmwareId")
    @Validation(required = true)
    private String firmwareId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private CancelOTATaskByDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.firmwareId = builder.firmwareId;
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOTATaskByDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public java.util.List < String > getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return firmwareId
     */
    public String getFirmwareId() {
        return this.firmwareId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<CancelOTATaskByDeviceRequest, Builder> {
        private java.util.List < String > deviceName; 
        private String firmwareId; 
        private String iotInstanceId; 
        private String jobId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(CancelOTATaskByDeviceRequest response) {
            super(response);
            this.deviceName = response.deviceName;
            this.firmwareId = response.firmwareId;
            this.iotInstanceId = response.iotInstanceId;
            this.jobId = response.jobId;
            this.productKey = response.productKey;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(java.util.List < String > deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * FirmwareId.
         */
        public Builder firmwareId(String firmwareId) {
            this.putQueryParameter("FirmwareId", firmwareId);
            this.firmwareId = firmwareId;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
        public CancelOTATaskByDeviceRequest build() {
            return new CancelOTATaskByDeviceRequest(this);
        } 

    } 

}
