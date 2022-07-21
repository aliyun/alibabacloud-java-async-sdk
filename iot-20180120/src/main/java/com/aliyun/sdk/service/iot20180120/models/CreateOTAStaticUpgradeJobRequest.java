// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTAStaticUpgradeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateOTAStaticUpgradeJobRequest</p>
 */
public class CreateOTAStaticUpgradeJobRequest extends Request {
    @Query
    @NameInMap("DnListFileUrl")
    private String dnListFileUrl;

    @Query
    @NameInMap("DownloadProtocol")
    private String downloadProtocol;

    @Query
    @NameInMap("FirmwareId")
    @Validation(required = true)
    private String firmwareId;

    @Query
    @NameInMap("GrayPercent")
    private String grayPercent;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("MaximumPerMinute")
    private Integer maximumPerMinute;

    @Query
    @NameInMap("MultiModuleMode")
    private Boolean multiModuleMode;

    @Query
    @NameInMap("NeedConfirm")
    private Boolean needConfirm;

    @Query
    @NameInMap("NeedPush")
    private Boolean needPush;

    @Query
    @NameInMap("OverwriteMode")
    private Integer overwriteMode;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("RetryCount")
    private Integer retryCount;

    @Query
    @NameInMap("RetryInterval")
    private Integer retryInterval;

    @Query
    @NameInMap("ScheduleFinishTime")
    private Long scheduleFinishTime;

    @Query
    @NameInMap("ScheduleTime")
    private Long scheduleTime;

    @Query
    @NameInMap("SrcVersion")
    private java.util.List < String > srcVersion;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TargetDeviceName")
    private java.util.List < String > targetDeviceName;

    @Query
    @NameInMap("TargetSelection")
    @Validation(required = true)
    private String targetSelection;

    @Query
    @NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;

    private CreateOTAStaticUpgradeJobRequest(Builder builder) {
        super(builder);
        this.dnListFileUrl = builder.dnListFileUrl;
        this.downloadProtocol = builder.downloadProtocol;
        this.firmwareId = builder.firmwareId;
        this.grayPercent = builder.grayPercent;
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
        this.scheduleFinishTime = builder.scheduleFinishTime;
        this.scheduleTime = builder.scheduleTime;
        this.srcVersion = builder.srcVersion;
        this.tag = builder.tag;
        this.targetDeviceName = builder.targetDeviceName;
        this.targetSelection = builder.targetSelection;
        this.timeoutInMinutes = builder.timeoutInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOTAStaticUpgradeJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnListFileUrl
     */
    public String getDnListFileUrl() {
        return this.dnListFileUrl;
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
     * @return grayPercent
     */
    public String getGrayPercent() {
        return this.grayPercent;
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
     * @return scheduleFinishTime
     */
    public Long getScheduleFinishTime() {
        return this.scheduleFinishTime;
    }

    /**
     * @return scheduleTime
     */
    public Long getScheduleTime() {
        return this.scheduleTime;
    }

    /**
     * @return srcVersion
     */
    public java.util.List < String > getSrcVersion() {
        return this.srcVersion;
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
     * @return targetSelection
     */
    public String getTargetSelection() {
        return this.targetSelection;
    }

    /**
     * @return timeoutInMinutes
     */
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static final class Builder extends Request.Builder<CreateOTAStaticUpgradeJobRequest, Builder> {
        private String dnListFileUrl; 
        private String downloadProtocol; 
        private String firmwareId; 
        private String grayPercent; 
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
        private Long scheduleFinishTime; 
        private Long scheduleTime; 
        private java.util.List < String > srcVersion; 
        private java.util.List < Tag> tag; 
        private java.util.List < String > targetDeviceName; 
        private String targetSelection; 
        private Integer timeoutInMinutes; 

        private Builder() {
            super();
        } 

        private Builder(CreateOTAStaticUpgradeJobRequest request) {
            super(request);
            this.dnListFileUrl = request.dnListFileUrl;
            this.downloadProtocol = request.downloadProtocol;
            this.firmwareId = request.firmwareId;
            this.grayPercent = request.grayPercent;
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
            this.scheduleFinishTime = request.scheduleFinishTime;
            this.scheduleTime = request.scheduleTime;
            this.srcVersion = request.srcVersion;
            this.tag = request.tag;
            this.targetDeviceName = request.targetDeviceName;
            this.targetSelection = request.targetSelection;
            this.timeoutInMinutes = request.timeoutInMinutes;
        } 

        /**
         * DnListFileUrl.
         */
        public Builder dnListFileUrl(String dnListFileUrl) {
            this.putQueryParameter("DnListFileUrl", dnListFileUrl);
            this.dnListFileUrl = dnListFileUrl;
            return this;
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
         * GrayPercent.
         */
        public Builder grayPercent(String grayPercent) {
            this.putQueryParameter("GrayPercent", grayPercent);
            this.grayPercent = grayPercent;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupType.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
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
         * MaximumPerMinute.
         */
        public Builder maximumPerMinute(Integer maximumPerMinute) {
            this.putQueryParameter("MaximumPerMinute", maximumPerMinute);
            this.maximumPerMinute = maximumPerMinute;
            return this;
        }

        /**
         * MultiModuleMode.
         */
        public Builder multiModuleMode(Boolean multiModuleMode) {
            this.putQueryParameter("MultiModuleMode", multiModuleMode);
            this.multiModuleMode = multiModuleMode;
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
         * OverwriteMode.
         */
        public Builder overwriteMode(Integer overwriteMode) {
            this.putQueryParameter("OverwriteMode", overwriteMode);
            this.overwriteMode = overwriteMode;
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
         * RetryCount.
         */
        public Builder retryCount(Integer retryCount) {
            this.putQueryParameter("RetryCount", retryCount);
            this.retryCount = retryCount;
            return this;
        }

        /**
         * RetryInterval.
         */
        public Builder retryInterval(Integer retryInterval) {
            this.putQueryParameter("RetryInterval", retryInterval);
            this.retryInterval = retryInterval;
            return this;
        }

        /**
         * ScheduleFinishTime.
         */
        public Builder scheduleFinishTime(Long scheduleFinishTime) {
            this.putQueryParameter("ScheduleFinishTime", scheduleFinishTime);
            this.scheduleFinishTime = scheduleFinishTime;
            return this;
        }

        /**
         * ScheduleTime.
         */
        public Builder scheduleTime(Long scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * SrcVersion.
         */
        public Builder srcVersion(java.util.List < String > srcVersion) {
            this.putQueryParameter("SrcVersion", srcVersion);
            this.srcVersion = srcVersion;
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
         * TargetSelection.
         */
        public Builder targetSelection(String targetSelection) {
            this.putQueryParameter("TargetSelection", targetSelection);
            this.targetSelection = targetSelection;
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
        public CreateOTAStaticUpgradeJobRequest build() {
            return new CreateOTAStaticUpgradeJobRequest(this);
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
