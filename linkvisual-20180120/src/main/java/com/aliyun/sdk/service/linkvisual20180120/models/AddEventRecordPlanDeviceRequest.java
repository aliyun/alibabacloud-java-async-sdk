// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEventRecordPlanDeviceRequest} extends {@link RequestModel}
 *
 * <p>AddEventRecordPlanDeviceRequest</p>
 */
public class AddEventRecordPlanDeviceRequest extends Request {
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
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("StreamType")
    private Integer streamType;

    private AddEventRecordPlanDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.planId = builder.planId;
        this.productKey = builder.productKey;
        this.streamType = builder.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEventRecordPlanDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    public static final class Builder extends Request.Builder<AddEventRecordPlanDeviceRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String planId; 
        private String productKey; 
        private Integer streamType; 

        private Builder() {
            super();
        } 

        private Builder(AddEventRecordPlanDeviceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.planId = request.planId;
            this.productKey = request.productKey;
            this.streamType = request.streamType;
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
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
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

        /**
         * StreamType.
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        @Override
        public AddEventRecordPlanDeviceRequest build() {
            return new AddEventRecordPlanDeviceRequest(this);
        } 

    } 

}
