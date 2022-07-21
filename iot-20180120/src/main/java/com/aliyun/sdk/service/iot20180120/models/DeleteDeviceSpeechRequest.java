// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeviceSpeechRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceSpeechRequest</p>
 */
public class DeleteDeviceSpeechRequest extends Request {
    @Body
    @NameInMap("DeviceSpeechList")
    @Validation(required = true)
    private java.util.List < DeviceSpeechList> deviceSpeechList;

    @Body
    @NameInMap("IotId")
    @Validation(required = true)
    private String iotId;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteDeviceSpeechRequest(Builder builder) {
        super(builder);
        this.deviceSpeechList = builder.deviceSpeechList;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeviceSpeechRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceSpeechList
     */
    public java.util.List < DeviceSpeechList> getDeviceSpeechList() {
        return this.deviceSpeechList;
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

    public static final class Builder extends Request.Builder<DeleteDeviceSpeechRequest, Builder> {
        private java.util.List < DeviceSpeechList> deviceSpeechList; 
        private String iotId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeviceSpeechRequest request) {
            super(request);
            this.deviceSpeechList = request.deviceSpeechList;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * DeviceSpeechList.
         */
        public Builder deviceSpeechList(java.util.List < DeviceSpeechList> deviceSpeechList) {
            this.putBodyParameter("DeviceSpeechList", deviceSpeechList);
            this.deviceSpeechList = deviceSpeechList;
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

        @Override
        public DeleteDeviceSpeechRequest build() {
            return new DeleteDeviceSpeechRequest(this);
        } 

    } 

    public static class DeviceSpeechList extends TeaModel {
        @NameInMap("AudioFormat")
        @Validation(required = true)
        private String audioFormat;

        @NameInMap("BizCode")
        @Validation(required = true)
        private String bizCode;

        private DeviceSpeechList(Builder builder) {
            this.audioFormat = builder.audioFormat;
            this.bizCode = builder.bizCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceSpeechList create() {
            return builder().build();
        }

        /**
         * @return audioFormat
         */
        public String getAudioFormat() {
            return this.audioFormat;
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        public static final class Builder {
            private String audioFormat; 
            private String bizCode; 

            /**
             * AudioFormat.
             */
            public Builder audioFormat(String audioFormat) {
                this.audioFormat = audioFormat;
                return this;
            }

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            public DeviceSpeechList build() {
                return new DeviceSpeechList(this);
            } 

        } 

    }
}
