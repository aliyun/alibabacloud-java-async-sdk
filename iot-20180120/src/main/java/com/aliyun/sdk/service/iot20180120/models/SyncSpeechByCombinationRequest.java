// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncSpeechByCombinationRequest} extends {@link RequestModel}
 *
 * <p>SyncSpeechByCombinationRequest</p>
 */
public class SyncSpeechByCombinationRequest extends Request {
    @Body
    @NameInMap("AudioFormat")
    private String audioFormat;

    @Body
    @NameInMap("CombinationList")
    @Validation(required = true)
    private java.util.List < String > combinationList;

    @Body
    @NameInMap("DeviceName")
    private String deviceName;

    @Body
    @NameInMap("EnforceFlag")
    private Boolean enforceFlag;

    @Body
    @NameInMap("IotId")
    private String iotId;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProductKey")
    private String productKey;

    @Body
    @NameInMap("SpeechId")
    private String speechId;

    private SyncSpeechByCombinationRequest(Builder builder) {
        super(builder);
        this.audioFormat = builder.audioFormat;
        this.combinationList = builder.combinationList;
        this.deviceName = builder.deviceName;
        this.enforceFlag = builder.enforceFlag;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.speechId = builder.speechId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncSpeechByCombinationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFormat
     */
    public String getAudioFormat() {
        return this.audioFormat;
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
     * @return enforceFlag
     */
    public Boolean getEnforceFlag() {
        return this.enforceFlag;
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

    /**
     * @return speechId
     */
    public String getSpeechId() {
        return this.speechId;
    }

    public static final class Builder extends Request.Builder<SyncSpeechByCombinationRequest, Builder> {
        private String audioFormat; 
        private java.util.List < String > combinationList; 
        private String deviceName; 
        private Boolean enforceFlag; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private String speechId; 

        private Builder() {
            super();
        } 

        private Builder(SyncSpeechByCombinationRequest request) {
            super(request);
            this.audioFormat = request.audioFormat;
            this.combinationList = request.combinationList;
            this.deviceName = request.deviceName;
            this.enforceFlag = request.enforceFlag;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.speechId = request.speechId;
        } 

        /**
         * AudioFormat.
         */
        public Builder audioFormat(String audioFormat) {
            this.putBodyParameter("AudioFormat", audioFormat);
            this.audioFormat = audioFormat;
            return this;
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
         * EnforceFlag.
         */
        public Builder enforceFlag(Boolean enforceFlag) {
            this.putBodyParameter("EnforceFlag", enforceFlag);
            this.enforceFlag = enforceFlag;
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

        /**
         * SpeechId.
         */
        public Builder speechId(String speechId) {
            this.putBodyParameter("SpeechId", speechId);
            this.speechId = speechId;
            return this;
        }

        @Override
        public SyncSpeechByCombinationRequest build() {
            return new SyncSpeechByCombinationRequest(this);
        } 

    } 

}
