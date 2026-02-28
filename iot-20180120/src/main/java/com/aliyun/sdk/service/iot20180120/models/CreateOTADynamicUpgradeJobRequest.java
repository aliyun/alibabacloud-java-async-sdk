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
 * {@link CreateOTADynamicUpgradeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateOTADynamicUpgradeJobRequest</p>
 */
public class CreateOTADynamicUpgradeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadProtocol")
    private String downloadProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicMode")
    private Integer dynamicMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firmwareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaximumPerMinute")
    private Integer maximumPerMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiModuleMode")
    private Boolean multiModuleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedConfirm")
    private Boolean needConfirm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedPush")
    private Boolean needPush;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverwriteMode")
    private Integer overwriteMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryCount")
    private Integer retryCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryInterval")
    private Integer retryInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcVersion")
    private java.util.List<String> srcVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;

    private CreateOTADynamicUpgradeJobRequest(Builder builder) {
        super(builder);
        this.downloadProtocol = builder.downloadProtocol;
        this.dynamicMode = builder.dynamicMode;
        this.firmwareId = builder.firmwareId;
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.iotInstanceId = builder.iotInstanceId;
        this.maximumPerMinute = builder.maximumPerMinute;
        this.multiModuleMode = builder.multiModuleMode;
        this.needConfirm = builder.needConfirm;
        this.needPush = builder.needPush;
        this.overwriteMode = builder.overwriteMode;
        this.productKey = builder.productKey;
        this.retryCount = builder.retryCount;
        this.retryInterval = builder.retryInterval;
        this.srcVersion = builder.srcVersion;
        this.tag = builder.tag;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOTADynamicUpgradeJobRequest create() {
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
     * @return dynamicMode
     */
    public Integer getDynamicMode() {
        return this.dynamicMode;
    }

    /**
     * @return firmwareId
     */
    public String getFirmwareId() {
        return this.firmwareId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return maximumPerMinute
     */
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    /**
     * @return multiModuleMode
     */
    public Boolean getMultiModuleMode() {
        return this.multiModuleMode;
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
     * @return overwriteMode
     */
    public Integer getOverwriteMode() {
        return this.overwriteMode;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return retryCount
     */
    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * @return retryInterval
     */
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * @return srcVersion
     */
    public java.util.List<String> getSrcVersion() {
        return this.srcVersion;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timeoutInMinutes
     */
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static final class Builder extends Request.Builder<CreateOTADynamicUpgradeJobRequest, Builder> {
        private String downloadProtocol; 
        private Integer dynamicMode; 
        private String firmwareId; 
        private String groupId; 
        private String groupType; 
        private String iotInstanceId; 
        private Integer maximumPerMinute; 
        private Boolean multiModuleMode; 
        private Boolean needConfirm; 
        private Boolean needPush; 
        private Integer overwriteMode; 
        private String productKey; 
        private Integer retryCount; 
        private Integer retryInterval; 
        private java.util.List<String> srcVersion; 
        private java.util.List<Tag> tag; 
        private Integer timeoutInMinutes; 

        private Builder() {
            super();
        } 

        private Builder(CreateOTADynamicUpgradeJobRequest request) {
            super(request);
            this.downloadProtocol = request.downloadProtocol;
            this.dynamicMode = request.dynamicMode;
            this.firmwareId = request.firmwareId;
            this.groupId = request.groupId;
            this.groupType = request.groupType;
            this.iotInstanceId = request.iotInstanceId;
            this.maximumPerMinute = request.maximumPerMinute;
            this.multiModuleMode = request.multiModuleMode;
            this.needConfirm = request.needConfirm;
            this.needPush = request.needPush;
            this.overwriteMode = request.overwriteMode;
            this.productKey = request.productKey;
            this.retryCount = request.retryCount;
            this.retryInterval = request.retryInterval;
            this.srcVersion = request.srcVersion;
            this.tag = request.tag;
            this.timeoutInMinutes = request.timeoutInMinutes;
        } 

        /**
         * <p>Specifies whether the device supports simultaneous updates of multiple modules. Default value: false. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong></p>
         * </li>
         * <li><p><strong>true</strong>: In this case, do not set <strong>OverwriteMode</strong> to <strong>2</strong>.********</p>
         * <p>The update tasks for the same module are overwritten. The update tasks that are in progress are not overwritten. The update tasks of the modules do not affect each other.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Only Enterprise Edition instances and new public instances are supported.</li>
         * <li>You must use Link SDK for C 4.x to develop the device.</li>
         * <li>If you initiate a group-based dynamic update batch, the settings of <strong>MultiModuleMode</strong> and <strong>OverwriteMode</strong> must be the same as those in the existing dynamic update batch of the group.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/58328.html">Overview</a>.</p>
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
         * <p>Specifies whether to automatically push update tasks from IoT Platform to devices. Default value: true. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: After an update batch is created, IoT Platform automatically pushes update tasks to the specified online devices.</p>
         * <p>In this case, a device can still initiate a request to obtain the information about the over-the-air (OTA) update task from IoT Platform.</p>
         * </li>
         * <li><p><strong>false</strong>: A device must initiate a request to obtain the information about the OTA update task from IoT Platform.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dynamicMode(Integer dynamicMode) {
            this.putQueryParameter("DynamicMode", dynamicMode);
            this.dynamicMode = dynamicMode;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the update package belongs.</p>
         * <p>A <strong>ProductKey</strong> is the unique identifier of a product in IoT Platform. You can view the information about all products within the current Alibaba Cloud account in the IoT Platform console or by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
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
         * <p>The type of the group. Valid value: <strong>LINK_PLATFORM_DYNAMIC</strong>.</p>
         * <ul>
         * <li>If you specify this parameter, you must also specify the <strong>GroupId</strong> parameter. In this case, do not specify the <strong>SrcVersion.N</strong> parameter.</li>
         * <li>If you do not specify this parameter, you do not need to specify the <strong>GroupId</strong> parameter. In this case, you must specify the <strong>SrcVersion.N</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IwOwQj7DJ***</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The download protocol of the update package. Valid values: <strong>HTTPS</strong> and <strong>MQTT</strong>. Default value: HTTPS. After the device receives the update package information pushed by IoT Platform, this protocol is used to download the update package.</p>
         * <blockquote>
         * <p>If you need to download the update package over MQTT, take note of the following items:</p>
         * <ul>
         * <li>Your service must be deployed in the China (Shanghai) region.</li>
         * <li>The OTA update package can contain only one file, and the size of the file cannot exceed 16 MB.</li>
         * <li>You must use the latest version of Link SDK for C to develop the device features to perform OTA updates and download files over MQTT. For more information, see <a href="https://help.aliyun.com/document_detail/330985.html">Sample code</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LINK_PLATFORM_DYNAMIC</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The ID of the update package.</p>
         * <p>An update package ID is returned when you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create the update package.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/147450.html">ListOTAFirmware</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite the previous update task. Default value: 1. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The previous update task is not overwritten. If a device already has an update task, the previous update task is implemented.</li>
         * <li><strong>2</strong>: The previous update task is overwritten. Only the current update task is implemented. In this case, you cannot set <strong>MultiModuleMode</strong> to <strong>true</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> The update task that is in progress is not overwritten.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maximumPerMinute(Integer maximumPerMinute) {
            this.putQueryParameter("MaximumPerMinute", maximumPerMinute);
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }

        /**
         * <p>The list of firmware versions to be updated.</p>
         * <ul>
         * <li>If you specify this parameter, do not specify the <strong>GroupId</strong> and <strong>GroupType</strong> parameters.</li>
         * <li>If you do not specify this parameter, you must specify the <strong>GroupId</strong> and <strong>GroupType</strong> parameters.</li>
         * </ul>
         * <blockquote>
         * <p>If you use differential update packages to perform dynamic update tasks on dynamic groups, you do not need to specify this parameter.</p>
         * <ul>
         * <li>If you use differential update packages to perform dynamic update tasks based on versions, the value of this parameter must be the same as the value of <strong>SrcVersion</strong>.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation and view the <strong>FirmwareVersion</strong> parameter in the response.</li>
         * <li>The version numbers must be unique in the list.</li>
         * <li>You can specify a maximum of 10 version numbers.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder multiModuleMode(Boolean multiModuleMode) {
            this.putQueryParameter("MultiModuleMode", multiModuleMode);
            this.multiModuleMode = multiModuleMode;
            return this;
        }

        /**
         * <p>The ID of the group.</p>
         * <ul>
         * <li>If you specify this parameter, you must also specify the <strong>GroupType</strong> parameter. In this case, do not specify the <strong>SrcVersion.N</strong> parameter.</li>
         * <li>If you do not specify this parameter, you do not need to specify the <strong>GroupType</strong> parameter. In this case, you must specify the <strong>SrcVersion.N</strong> parameter.</li>
         * </ul>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/93356.html">QueryDeviceGroupList</a> operation to query the <strong>GroupId</strong> parameter.</p>
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
         * <p>Specifies whether to control the update by using a mobile app. You must develop the mobile app as needed. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: A device obtains the information about the OTA update task based on the <strong>NeedPush</strong> parameter.</li>
         * <li><strong>true</strong>: To perform an OTA update on a device, you must confirm the update by using your mobile app. Then, the device can obtain the information about the OTA update task based on the <strong>NeedPush</strong> parameter.</li>
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
         * <p>The mode of dynamic update. Default value: 1. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: constantly updates the devices that meet the conditions.</li>
         * <li><strong>2</strong>: updates only the devices that subsequently submit the latest firmware versions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder overwriteMode(Integer overwriteMode) {
            this.putQueryParameter("OverwriteMode", overwriteMode);
            this.overwriteMode = overwriteMode;
            return this;
        }

        /**
         * <p>The automatic retry interval if a device fails to be updated. Unit: minutes. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: An automatic retry is immediately performed.</li>
         * <li><strong>10</strong>: An automatic retry is performed after 10 minutes.</li>
         * <li><strong>30</strong>: An automatic retry is performed after 30 minutes.</li>
         * <li><strong>60</strong>: An automatic retry is performed after 60 minutes (1 hour).</li>
         * <li><strong>1440</strong>: An automatic retry is performed after 1,440 minutes (24 hours).</li>
         * </ul>
         * <blockquote>
         * <p>The value of the <strong>RetryInterval</strong> parameter must be less than the value of the <strong>TimeoutInMinutes</strong> parameter. Examples:</p>
         * <ul>
         * <li>If the value of the <strong>TimeoutInMinutes</strong> parameter is set to 60, the maximum value of the <strong>RetryInterval</strong> parameter is 30.</li>
         * <li>If the value of the <strong>TimeoutInMinutes</strong> parameter is set to 1440, the maximum value of the <strong>RetryInterval</strong> parameter is 60.</li>
         * </ul>
         * </blockquote>
         * <p>If the value of the <strong>RetryInterval</strong> parameter is set to 1440, we recommend that you do not specify the <strong>TimeoutInMinutes</strong> parameter. If an update times out, no retry is performed.</p>
         * <p>If you do not specify this parameter, no retry is performed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1Le6d0****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The timeout period of the update. If the device is not updated within the specified period, a timeout error occurs. Unit: minutes. Valid values: 1 to 1440.</p>
         * <blockquote>
         * <ul>
         * <li>The timeout period starts from the time when the specified device submits the update progress for the first time. During the update, the update package may be repeatedly pushed to the specified device because the device goes online and offline multiple times. The start time of the update period remains unchanged.</li>
         * <li>If an update fails due to timeout, no retry is triggered.</li>
         * </ul>
         * </blockquote>
         * <p>If you do not specify this parameter, timeout errors do not occur.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retryCount(Integer retryCount) {
            this.putQueryParameter("RetryCount", retryCount);
            this.retryCount = retryCount;
            return this;
        }

        /**
         * <p>The number of automatic retries.</p>
         * <p>If you specify the <strong>RetryInterval</strong> parameter, you must specify this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: retries once.</li>
         * <li><strong>2</strong>: retries twice.</li>
         * <li><strong>5</strong>: retries five times.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * SrcVersion.
         */
        public Builder srcVersion(java.util.List<String> srcVersion) {
            this.putQueryParameter("SrcVersion", srcVersion);
            this.srcVersion = srcVersion;
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
         * <p>The maximum number of devices to which the download URL of the update package is pushed per minute. Valid values: 10 to 10000.</p>
         * <p>Default value: 10000.</p>
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
        public CreateOTADynamicUpgradeJobRequest build() {
            return new CreateOTADynamicUpgradeJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOTADynamicUpgradeJobRequest} extends {@link TeaModel}
     *
     * <p>CreateOTADynamicUpgradeJobRequest</p>
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
             * <p>The value of the update batch tag. The value must be 1 to 1,024 characters in length. You can add up to 10 tags for each update batch. The total length of the tag keys and tag values of all update batches cannot exceed 4,096 characters in length.</p>
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
             * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
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
