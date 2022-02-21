// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SpeechByCombinationRequest} extends {@link RequestModel}
 *
 * <p>SpeechByCombinationRequest</p>
 */
public class SpeechByCombinationRequest extends Request {
    @Body
    @NameInMap("CombinationList")
    @Validation(required = true)
    private java.util.List < String > combinationList;

    @Body
    @NameInMap("DeviceName")
    private String deviceName;

    @Body
    @NameInMap("IotId")
    private String iotId;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProductKey")
    private String productKey;

    private SpeechByCombinationRequest(Builder builder) {
        super(builder);
        this.combinationList = builder.combinationList;
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpeechByCombinationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return combinationList
     */
    public java.util.List < String > getCombinationList() {
        return this.combinationList;
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

    public static final class Builder extends Request.Builder<SpeechByCombinationRequest, Builder> {
        private java.util.List < String > combinationList; 
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(SpeechByCombinationRequest response) {
            super(response);
            this.combinationList = response.combinationList;
            this.deviceName = response.deviceName;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
        } 

        /**
         * CombinationList.
         */
        public Builder combinationList(java.util.List < String > combinationList) {
            this.putBodyParameter("CombinationList", combinationList);
            this.combinationList = combinationList;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putBodyParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public SpeechByCombinationRequest build() {
            return new SpeechByCombinationRequest(this);
        } 

    } 

}
