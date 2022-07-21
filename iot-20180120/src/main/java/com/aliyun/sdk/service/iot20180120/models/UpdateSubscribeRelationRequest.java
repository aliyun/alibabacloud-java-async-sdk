// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubscribeRelationRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubscribeRelationRequest</p>
 */
public class UpdateSubscribeRelationRequest extends Request {
    @Query
    @NameInMap("ConsumerGroupIds")
    private java.util.List < String > consumerGroupIds;

    @Query
    @NameInMap("DeviceDataFlag")
    private Boolean deviceDataFlag;

    @Query
    @NameInMap("DeviceLifeCycleFlag")
    private Boolean deviceLifeCycleFlag;

    @Query
    @NameInMap("DeviceStatusChangeFlag")
    private Boolean deviceStatusChangeFlag;

    @Query
    @NameInMap("DeviceTagFlag")
    private Boolean deviceTagFlag;

    @Query
    @NameInMap("DeviceTopoLifeCycleFlag")
    private Boolean deviceTopoLifeCycleFlag;

    @Query
    @NameInMap("FoundDeviceListFlag")
    private Boolean foundDeviceListFlag;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("MnsConfiguration")
    private String mnsConfiguration;

    @Query
    @NameInMap("OtaEventFlag")
    private Boolean otaEventFlag;

    @Query
    @NameInMap("OtaJobFlag")
    private Boolean otaJobFlag;

    @Query
    @NameInMap("OtaVersionFlag")
    private Boolean otaVersionFlag;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ThingHistoryFlag")
    private Boolean thingHistoryFlag;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UpdateSubscribeRelationRequest(Builder builder) {
        super(builder);
        this.consumerGroupIds = builder.consumerGroupIds;
        this.deviceDataFlag = builder.deviceDataFlag;
        this.deviceLifeCycleFlag = builder.deviceLifeCycleFlag;
        this.deviceStatusChangeFlag = builder.deviceStatusChangeFlag;
        this.deviceTagFlag = builder.deviceTagFlag;
        this.deviceTopoLifeCycleFlag = builder.deviceTopoLifeCycleFlag;
        this.foundDeviceListFlag = builder.foundDeviceListFlag;
        this.iotInstanceId = builder.iotInstanceId;
        this.mnsConfiguration = builder.mnsConfiguration;
        this.otaEventFlag = builder.otaEventFlag;
        this.otaJobFlag = builder.otaJobFlag;
        this.otaVersionFlag = builder.otaVersionFlag;
        this.productKey = builder.productKey;
        this.thingHistoryFlag = builder.thingHistoryFlag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscribeRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupIds
     */
    public java.util.List < String > getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    /**
     * @return deviceDataFlag
     */
    public Boolean getDeviceDataFlag() {
        return this.deviceDataFlag;
    }

    /**
     * @return deviceLifeCycleFlag
     */
    public Boolean getDeviceLifeCycleFlag() {
        return this.deviceLifeCycleFlag;
    }

    /**
     * @return deviceStatusChangeFlag
     */
    public Boolean getDeviceStatusChangeFlag() {
        return this.deviceStatusChangeFlag;
    }

    /**
     * @return deviceTagFlag
     */
    public Boolean getDeviceTagFlag() {
        return this.deviceTagFlag;
    }

    /**
     * @return deviceTopoLifeCycleFlag
     */
    public Boolean getDeviceTopoLifeCycleFlag() {
        return this.deviceTopoLifeCycleFlag;
    }

    /**
     * @return foundDeviceListFlag
     */
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return mnsConfiguration
     */
    public String getMnsConfiguration() {
        return this.mnsConfiguration;
    }

    /**
     * @return otaEventFlag
     */
    public Boolean getOtaEventFlag() {
        return this.otaEventFlag;
    }

    /**
     * @return otaJobFlag
     */
    public Boolean getOtaJobFlag() {
        return this.otaJobFlag;
    }

    /**
     * @return otaVersionFlag
     */
    public Boolean getOtaVersionFlag() {
        return this.otaVersionFlag;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return thingHistoryFlag
     */
    public Boolean getThingHistoryFlag() {
        return this.thingHistoryFlag;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateSubscribeRelationRequest, Builder> {
        private java.util.List < String > consumerGroupIds; 
        private Boolean deviceDataFlag; 
        private Boolean deviceLifeCycleFlag; 
        private Boolean deviceStatusChangeFlag; 
        private Boolean deviceTagFlag; 
        private Boolean deviceTopoLifeCycleFlag; 
        private Boolean foundDeviceListFlag; 
        private String iotInstanceId; 
        private String mnsConfiguration; 
        private Boolean otaEventFlag; 
        private Boolean otaJobFlag; 
        private Boolean otaVersionFlag; 
        private String productKey; 
        private Boolean thingHistoryFlag; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubscribeRelationRequest request) {
            super(request);
            this.consumerGroupIds = request.consumerGroupIds;
            this.deviceDataFlag = request.deviceDataFlag;
            this.deviceLifeCycleFlag = request.deviceLifeCycleFlag;
            this.deviceStatusChangeFlag = request.deviceStatusChangeFlag;
            this.deviceTagFlag = request.deviceTagFlag;
            this.deviceTopoLifeCycleFlag = request.deviceTopoLifeCycleFlag;
            this.foundDeviceListFlag = request.foundDeviceListFlag;
            this.iotInstanceId = request.iotInstanceId;
            this.mnsConfiguration = request.mnsConfiguration;
            this.otaEventFlag = request.otaEventFlag;
            this.otaJobFlag = request.otaJobFlag;
            this.otaVersionFlag = request.otaVersionFlag;
            this.productKey = request.productKey;
            this.thingHistoryFlag = request.thingHistoryFlag;
            this.type = request.type;
        } 

        /**
         * ConsumerGroupIds.
         */
        public Builder consumerGroupIds(java.util.List < String > consumerGroupIds) {
            this.putQueryParameter("ConsumerGroupIds", consumerGroupIds);
            this.consumerGroupIds = consumerGroupIds;
            return this;
        }

        /**
         * DeviceDataFlag.
         */
        public Builder deviceDataFlag(Boolean deviceDataFlag) {
            this.putQueryParameter("DeviceDataFlag", deviceDataFlag);
            this.deviceDataFlag = deviceDataFlag;
            return this;
        }

        /**
         * DeviceLifeCycleFlag.
         */
        public Builder deviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
            this.putQueryParameter("DeviceLifeCycleFlag", deviceLifeCycleFlag);
            this.deviceLifeCycleFlag = deviceLifeCycleFlag;
            return this;
        }

        /**
         * DeviceStatusChangeFlag.
         */
        public Builder deviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
            this.putQueryParameter("DeviceStatusChangeFlag", deviceStatusChangeFlag);
            this.deviceStatusChangeFlag = deviceStatusChangeFlag;
            return this;
        }

        /**
         * DeviceTagFlag.
         */
        public Builder deviceTagFlag(Boolean deviceTagFlag) {
            this.putQueryParameter("DeviceTagFlag", deviceTagFlag);
            this.deviceTagFlag = deviceTagFlag;
            return this;
        }

        /**
         * DeviceTopoLifeCycleFlag.
         */
        public Builder deviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
            this.putQueryParameter("DeviceTopoLifeCycleFlag", deviceTopoLifeCycleFlag);
            this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
            return this;
        }

        /**
         * FoundDeviceListFlag.
         */
        public Builder foundDeviceListFlag(Boolean foundDeviceListFlag) {
            this.putQueryParameter("FoundDeviceListFlag", foundDeviceListFlag);
            this.foundDeviceListFlag = foundDeviceListFlag;
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
         * MnsConfiguration.
         */
        public Builder mnsConfiguration(String mnsConfiguration) {
            this.putQueryParameter("MnsConfiguration", mnsConfiguration);
            this.mnsConfiguration = mnsConfiguration;
            return this;
        }

        /**
         * OtaEventFlag.
         */
        public Builder otaEventFlag(Boolean otaEventFlag) {
            this.putQueryParameter("OtaEventFlag", otaEventFlag);
            this.otaEventFlag = otaEventFlag;
            return this;
        }

        /**
         * OtaJobFlag.
         */
        public Builder otaJobFlag(Boolean otaJobFlag) {
            this.putQueryParameter("OtaJobFlag", otaJobFlag);
            this.otaJobFlag = otaJobFlag;
            return this;
        }

        /**
         * OtaVersionFlag.
         */
        public Builder otaVersionFlag(Boolean otaVersionFlag) {
            this.putQueryParameter("OtaVersionFlag", otaVersionFlag);
            this.otaVersionFlag = otaVersionFlag;
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
         * ThingHistoryFlag.
         */
        public Builder thingHistoryFlag(Boolean thingHistoryFlag) {
            this.putQueryParameter("ThingHistoryFlag", thingHistoryFlag);
            this.thingHistoryFlag = thingHistoryFlag;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateSubscribeRelationRequest build() {
            return new UpdateSubscribeRelationRequest(this);
        } 

    } 

}
