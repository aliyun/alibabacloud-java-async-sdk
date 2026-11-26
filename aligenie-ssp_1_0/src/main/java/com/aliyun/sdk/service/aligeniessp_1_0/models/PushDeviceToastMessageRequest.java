// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link PushDeviceToastMessageRequest} extends {@link RequestModel}
 *
 * <p>PushDeviceToastMessageRequest</p>
 */
public class PushDeviceToastMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceInfo")
    private DeviceInfo deviceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    private PushDeviceToastMessageRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.deviceInfo = builder.deviceInfo;
        this.payload = builder.payload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushDeviceToastMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    public static final class Builder extends Request.Builder<PushDeviceToastMessageRequest, Builder> {
        private String accessToken; 
        private DeviceInfo deviceInfo; 
        private Payload payload; 

        private Builder() {
            super();
        } 

        private Builder(PushDeviceToastMessageRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.deviceInfo = request.deviceInfo;
            this.payload = request.payload;
        } 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * DeviceInfo.
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            String deviceInfoShrink = shrink(deviceInfo, "DeviceInfo", "json");
            this.putBodyParameter("DeviceInfo", deviceInfoShrink);
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        @Override
        public PushDeviceToastMessageRequest build() {
            return new PushDeviceToastMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushDeviceToastMessageRequest} extends {@link TeaModel}
     *
     * <p>PushDeviceToastMessageRequest</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private DeviceInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(DeviceInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushDeviceToastMessageRequest} extends {@link TeaModel}
     *
     * <p>PushDeviceToastMessageRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ToastPosition")
        private String toastPosition;

        @com.aliyun.core.annotation.NameInMap("ToastTone")
        private String toastTone;

        @com.aliyun.core.annotation.NameInMap("ToastType")
        private String toastType;

        @com.aliyun.core.annotation.NameInMap("Tts")
        private String tts;

        @com.aliyun.core.annotation.NameInMap("UiContent")
        private String uiContent;

        private Payload(Builder builder) {
            this.toastPosition = builder.toastPosition;
            this.toastTone = builder.toastTone;
            this.toastType = builder.toastType;
            this.tts = builder.tts;
            this.uiContent = builder.uiContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return toastPosition
         */
        public String getToastPosition() {
            return this.toastPosition;
        }

        /**
         * @return toastTone
         */
        public String getToastTone() {
            return this.toastTone;
        }

        /**
         * @return toastType
         */
        public String getToastType() {
            return this.toastType;
        }

        /**
         * @return tts
         */
        public String getTts() {
            return this.tts;
        }

        /**
         * @return uiContent
         */
        public String getUiContent() {
            return this.uiContent;
        }

        public static final class Builder {
            private String toastPosition; 
            private String toastTone; 
            private String toastType; 
            private String tts; 
            private String uiContent; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.toastPosition = model.toastPosition;
                this.toastTone = model.toastTone;
                this.toastType = model.toastType;
                this.tts = model.tts;
                this.uiContent = model.uiContent;
            } 

            /**
             * ToastPosition.
             */
            public Builder toastPosition(String toastPosition) {
                this.toastPosition = toastPosition;
                return this;
            }

            /**
             * ToastTone.
             */
            public Builder toastTone(String toastTone) {
                this.toastTone = toastTone;
                return this;
            }

            /**
             * ToastType.
             */
            public Builder toastType(String toastType) {
                this.toastType = toastType;
                return this;
            }

            /**
             * Tts.
             */
            public Builder tts(String tts) {
                this.tts = tts;
                return this;
            }

            /**
             * UiContent.
             */
            public Builder uiContent(String uiContent) {
                this.uiContent = uiContent;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
}
