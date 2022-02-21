// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySubscribeRelationResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySubscribeRelationResponseBody</p>
 */
public class QuerySubscribeRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ConsumerGroupIds")
    private java.util.List < String > consumerGroupIds;

    @NameInMap("DeviceDataFlag")
    private Boolean deviceDataFlag;

    @NameInMap("DeviceLifeCycleFlag")
    private Boolean deviceLifeCycleFlag;

    @NameInMap("DeviceStatusChangeFlag")
    private Boolean deviceStatusChangeFlag;

    @NameInMap("DeviceTagFlag")
    private Boolean deviceTagFlag;

    @NameInMap("DeviceTopoLifeCycleFlag")
    private Boolean deviceTopoLifeCycleFlag;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("FoundDeviceListFlag")
    private Boolean foundDeviceListFlag;

    @NameInMap("MnsConfiguration")
    private String mnsConfiguration;

    @NameInMap("OtaEventFlag")
    private Boolean otaEventFlag;

    @NameInMap("OtaJobFlag")
    private Boolean otaJobFlag;

    @NameInMap("OtaVersionFlag")
    private Boolean otaVersionFlag;

    @NameInMap("ProductKey")
    private String productKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("ThingHistoryFlag")
    private Boolean thingHistoryFlag;

    @NameInMap("Type")
    private String type;

    private QuerySubscribeRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.consumerGroupIds = builder.consumerGroupIds;
        this.deviceDataFlag = builder.deviceDataFlag;
        this.deviceLifeCycleFlag = builder.deviceLifeCycleFlag;
        this.deviceStatusChangeFlag = builder.deviceStatusChangeFlag;
        this.deviceTagFlag = builder.deviceTagFlag;
        this.deviceTopoLifeCycleFlag = builder.deviceTopoLifeCycleFlag;
        this.errorMessage = builder.errorMessage;
        this.foundDeviceListFlag = builder.foundDeviceListFlag;
        this.mnsConfiguration = builder.mnsConfiguration;
        this.otaEventFlag = builder.otaEventFlag;
        this.otaJobFlag = builder.otaJobFlag;
        this.otaVersionFlag = builder.otaVersionFlag;
        this.productKey = builder.productKey;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.thingHistoryFlag = builder.thingHistoryFlag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySubscribeRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return foundDeviceListFlag
     */
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
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

    public static final class Builder {
        private String code; 
        private java.util.List < String > consumerGroupIds; 
        private Boolean deviceDataFlag; 
        private Boolean deviceLifeCycleFlag; 
        private Boolean deviceStatusChangeFlag; 
        private Boolean deviceTagFlag; 
        private Boolean deviceTopoLifeCycleFlag; 
        private String errorMessage; 
        private Boolean foundDeviceListFlag; 
        private String mnsConfiguration; 
        private Boolean otaEventFlag; 
        private Boolean otaJobFlag; 
        private Boolean otaVersionFlag; 
        private String productKey; 
        private String requestId; 
        private Boolean success; 
        private Boolean thingHistoryFlag; 
        private String type; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConsumerGroupIds.
         */
        public Builder consumerGroupIds(java.util.List < String > consumerGroupIds) {
            this.consumerGroupIds = consumerGroupIds;
            return this;
        }

        /**
         * DeviceDataFlag.
         */
        public Builder deviceDataFlag(Boolean deviceDataFlag) {
            this.deviceDataFlag = deviceDataFlag;
            return this;
        }

        /**
         * DeviceLifeCycleFlag.
         */
        public Builder deviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
            this.deviceLifeCycleFlag = deviceLifeCycleFlag;
            return this;
        }

        /**
         * DeviceStatusChangeFlag.
         */
        public Builder deviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
            this.deviceStatusChangeFlag = deviceStatusChangeFlag;
            return this;
        }

        /**
         * DeviceTagFlag.
         */
        public Builder deviceTagFlag(Boolean deviceTagFlag) {
            this.deviceTagFlag = deviceTagFlag;
            return this;
        }

        /**
         * DeviceTopoLifeCycleFlag.
         */
        public Builder deviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
            this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * FoundDeviceListFlag.
         */
        public Builder foundDeviceListFlag(Boolean foundDeviceListFlag) {
            this.foundDeviceListFlag = foundDeviceListFlag;
            return this;
        }

        /**
         * MnsConfiguration.
         */
        public Builder mnsConfiguration(String mnsConfiguration) {
            this.mnsConfiguration = mnsConfiguration;
            return this;
        }

        /**
         * OtaEventFlag.
         */
        public Builder otaEventFlag(Boolean otaEventFlag) {
            this.otaEventFlag = otaEventFlag;
            return this;
        }

        /**
         * OtaJobFlag.
         */
        public Builder otaJobFlag(Boolean otaJobFlag) {
            this.otaJobFlag = otaJobFlag;
            return this;
        }

        /**
         * OtaVersionFlag.
         */
        public Builder otaVersionFlag(Boolean otaVersionFlag) {
            this.otaVersionFlag = otaVersionFlag;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * ThingHistoryFlag.
         */
        public Builder thingHistoryFlag(Boolean thingHistoryFlag) {
            this.thingHistoryFlag = thingHistoryFlag;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public QuerySubscribeRelationResponseBody build() {
            return new QuerySubscribeRelationResponseBody(this);
        } 

    } 

}
