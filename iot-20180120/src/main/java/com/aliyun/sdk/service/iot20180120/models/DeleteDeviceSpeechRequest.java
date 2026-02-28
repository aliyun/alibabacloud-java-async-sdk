// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDeviceSpeechRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceSpeechRequest</p>
 */
public class DeleteDeviceSpeechRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceSpeechList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DeviceSpeechList> deviceSpeechList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
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
    public java.util.List<DeviceSpeechList> getDeviceSpeechList() {
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
        private java.util.List<DeviceSpeechList> deviceSpeechList; 
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
         * <p>This parameter is required.</p>
         */
        public Builder deviceSpeechList(java.util.List<DeviceSpeechList> deviceSpeechList) {
            this.putBodyParameter("DeviceSpeechList", deviceSpeechList);
            this.deviceSpeechList = deviceSpeechList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
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

    /**
     * 
     * {@link DeleteDeviceSpeechRequest} extends {@link TeaModel}
     *
     * <p>DeleteDeviceSpeechRequest</p>
     */
    public static class DeviceSpeechList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFormat")
        @com.aliyun.core.annotation.Validation(required = true)
        private String audioFormat;

        @com.aliyun.core.annotation.NameInMap("BizCode")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(DeviceSpeechList model) {
                this.audioFormat = model.audioFormat;
                this.bizCode = model.bizCode;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>wav</p>
             */
            public Builder audioFormat(String audioFormat) {
                this.audioFormat = audioFormat;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>identifying</p>
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
