// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTAVerifyJobRequest} extends {@link RequestModel}
 *
 * <p>CreateOTAVerifyJobRequest</p>
 */
public class CreateOTAVerifyJobRequest extends Request {
    @Query
    @NameInMap("DownloadProtocol")
    private String downloadProtocol;

    @Query
    @NameInMap("FirmwareId")
    @Validation(required = true)
    private String firmwareId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("NeedConfirm")
    private Boolean needConfirm;

    @Query
    @NameInMap("NeedPush")
    private Boolean needPush;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TargetDeviceName")
    @Validation(required = true)
    private java.util.List < String > targetDeviceName;

    @Query
    @NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;

    private CreateOTAVerifyJobRequest(Builder builder) {
        super(builder);
        this.downloadProtocol = builder.downloadProtocol;
        this.firmwareId = builder.firmwareId;
        this.iotInstanceId = builder.iotInstanceId;
        this.needConfirm = builder.needConfirm;
        this.needPush = builder.needPush;
        this.productKey = builder.productKey;
        this.tag = builder.tag;
        this.targetDeviceName = builder.targetDeviceName;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOTAVerifyJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadProtocol
     */
    public String getDownloadProtocol() {
        return this.downloadProtocol;
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
     * @return needConfirm
     */
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    /**
     * @return needPush
     */
    public Boolean getNeedPush() {
        return this.needPush;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetDeviceName
     */
    public java.util.List < String > getTargetDeviceName() {
        return this.targetDeviceName;
    }

    /**
     * @return timeoutInMinutes
     */
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static final class Builder extends Request.Builder<CreateOTAVerifyJobRequest, Builder> {
        private String downloadProtocol; 
        private String firmwareId; 
        private String iotInstanceId; 
        private Boolean needConfirm; 
        private Boolean needPush; 
        private String productKey; 
        private java.util.List < Tag> tag; 
        private java.util.List < String > targetDeviceName; 
        private Integer timeoutInMinutes; 

        private Builder() {
            super();
        } 

        private Builder(CreateOTAVerifyJobRequest request) {
            super(request);
            this.downloadProtocol = request.downloadProtocol;
            this.firmwareId = request.firmwareId;
            this.iotInstanceId = request.iotInstanceId;
            this.needConfirm = request.needConfirm;
            this.needPush = request.needPush;
            this.productKey = request.productKey;
            this.tag = request.tag;
            this.targetDeviceName = request.targetDeviceName;
            this.timeoutInMinutes = request.timeoutInMinutes;
        } 

        /**
         * DownloadProtocol.
         */
        public Builder downloadProtocol(String downloadProtocol) {
            this.putQueryParameter("DownloadProtocol", downloadProtocol);
            this.downloadProtocol = downloadProtocol;
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
         * NeedConfirm.
         */
        public Builder needConfirm(Boolean needConfirm) {
            this.putQueryParameter("NeedConfirm", needConfirm);
            this.needConfirm = needConfirm;
            return this;
        }

        /**
         * NeedPush.
         */
        public Builder needPush(Boolean needPush) {
            this.putQueryParameter("NeedPush", needPush);
            this.needPush = needPush;
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TargetDeviceName.
         */
        public Builder targetDeviceName(java.util.List < String > targetDeviceName) {
            this.putQueryParameter("TargetDeviceName", targetDeviceName);
            this.targetDeviceName = targetDeviceName;
            return this;
        }

        /**
         * TimeoutInMinutes.
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.putQueryParameter("TimeoutInMinutes", timeoutInMinutes);
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        @Override
        public CreateOTAVerifyJobRequest build() {
            return new CreateOTAVerifyJobRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
