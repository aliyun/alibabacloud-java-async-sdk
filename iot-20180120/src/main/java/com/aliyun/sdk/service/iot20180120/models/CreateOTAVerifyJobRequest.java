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
 * {@link CreateOTAVerifyJobRequest} extends {@link RequestModel}
 *
 * <p>CreateOTAVerifyJobRequest</p>
 */
public class CreateOTAVerifyJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadProtocol")
    private String downloadProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firmwareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedConfirm")
    private Boolean needConfirm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedPush")
    private Boolean needPush;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> targetDeviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetDeviceName
     */
    public java.util.List<String> getTargetDeviceName() {
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
        private java.util.List<Tag> tag; 
        private java.util.List<String> targetDeviceName; 
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
         * <p>The download protocol of the update package. Valid values: <strong>HTTPS</strong> and <strong>MQTT</strong>. Default value: HTTPS. After the device receives the update package information pushed by IoT Platform, this protocol is used to download the update package.</p>
         * <blockquote>
         * <p>If you want to download the update package over MQTT, take note of the following items:</p>
         * <ul>
         * <li>The following regions are supported: China (Shanghai), China (Beijing), and China (Shenzhen).</li>
         * <li>The OTA update package can contain only one file and the size of the file cannot exceed 16 MB.</li>
         * <li>You must use the latest version of Link SDK for C to develop the device features to perform OTA updates and download files over MQTT. For more information, see <a href="https://help.aliyun.com/document_detail/330985.html">Sample code</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        public Builder downloadProtocol(String downloadProtocol) {
            this.putQueryParameter("DownloadProtocol", downloadProtocol);
            this.downloadProtocol = downloadProtocol;
            return this;
        }

        /**
         * <p>The ID of the update package.</p>
         * <p>The <strong>FirmwareId</strong> parameter is returned when you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create an OTA update package.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/147450.html">ListOTAFirmware</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nx3xxVvFdwvn6dim50PY03****</p>
         */
        public Builder firmwareId(String firmwareId) {
            this.putQueryParameter("FirmwareId", firmwareId);
            this.firmwareId = firmwareId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the ID of an instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
         * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to control the update by using a mobile app. You must develop the mobile app as needed.</p>
         * <ul>
         * <li><strong>false</strong> (default): no. A device obtains the information about the OTA update task based on the <strong>NeedPush</strong> parameter.</li>
         * <li><strong>true</strong>: yes To perform an OTA update on a device, you must confirm the update by using your mobile app. Then, the device can obtain the information about the OTA update task based on the <strong>NeedPush</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needConfirm(Boolean needConfirm) {
            this.putQueryParameter("NeedConfirm", needConfirm);
            this.needConfirm = needConfirm;
            return this;
        }

        /**
         * <p>Specifies whether to automatically push update tasks from IoT Platform to devices.</p>
         * <ul>
         * <li><p><strong>true</strong> (default): yes. After an update batch is created, IoT Platform automatically pushes update tasks to the specified online devices.</p>
         * <p>In this case, a device can still initiate a request to obtain the information about the over-the-air (OTA) update task from IoT Platform.</p>
         * </li>
         * <li><p><strong>false</strong>: no. A device must initiate a request to obtain the information about the OTA update task from IoT Platform.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needPush(Boolean needPush) {
            this.putQueryParameter("NeedPush", needPush);
            this.needPush = needPush;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the OTA update package belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1VJwBw****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdevice</p>
         */
        public Builder targetDeviceName(java.util.List<String> targetDeviceName) {
            this.putQueryParameter("TargetDeviceName", targetDeviceName);
            this.targetDeviceName = targetDeviceName;
            return this;
        }

        /**
         * <p>The timeout period for a device to update the firmware. Unit: minutes. Valid values: 1 to 1440.</p>
         * 
         * <strong>example:</strong>
         * <p>1440</p>
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

    /**
     * 
     * {@link CreateOTAVerifyJobRequest} extends {@link TeaModel}
     *
     * <p>CreateOTAVerifyJobRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the update batch tag. The key must be 1 to 30 characters in length and can contain letters, digits, and periods (.). You can add up to 10 tags for each update batch.</p>
             * <p>The tags of an update batch are sent to devices when IoT Platform pushes update notifications to the devices.</p>
             * <blockquote>
             * <p> Update batch tags are optional. If you want to specify a tag, you must specify the Tag.N.Value and Tag.N.Key parameters in pair.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the update batch tag. The value must be 1 to 1,024 characters in length. You can add up to 10 tags for each update batch. The total length of the tag keys and tag values of all update batches cannot exceed 4,096 characters.</p>
             * <blockquote>
             * <p> Update batch tags are optional. If you want to specify a tag, you must specify the Tag.N.Value and Tag.N.Key parameters in pair.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
