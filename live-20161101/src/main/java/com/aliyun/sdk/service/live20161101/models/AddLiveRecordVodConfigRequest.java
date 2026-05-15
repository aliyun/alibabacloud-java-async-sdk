// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link AddLiveRecordVodConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveRecordVodConfigRequest</p>
 */
public class AddLiveRecordVodConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCompose")
    private String autoCompose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComposeVodTranscodeGroupId")
    private String composeVodTranscodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleDuration")
    @com.aliyun.core.annotation.Validation(maximum = 21600, minimum = 300)
    private Integer cycleDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayTime")
    @com.aliyun.core.annotation.Validation(maximum = 21600, minimum = 15)
    private Integer delayTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FormatConfig")
    private Boolean formatConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnDemand")
    private Integer onDemand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordContent")
    private String recordContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordFormat")
    private java.util.List<RecordFormat> recordFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpaceId")
    private String spaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplates")
    private java.util.List<String> transcodeTemplates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VodTranscodeGroupId")
    private String vodTranscodeGroupId;

    private AddLiveRecordVodConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.autoCompose = builder.autoCompose;
        this.composeVodTranscodeGroupId = builder.composeVodTranscodeGroupId;
        this.cycleDuration = builder.cycleDuration;
        this.delayTime = builder.delayTime;
        this.domainName = builder.domainName;
        this.formatConfig = builder.formatConfig;
        this.onDemand = builder.onDemand;
        this.ownerId = builder.ownerId;
        this.recordContent = builder.recordContent;
        this.recordFormat = builder.recordFormat;
        this.regionId = builder.regionId;
        this.spaceId = builder.spaceId;
        this.storageLocation = builder.storageLocation;
        this.streamName = builder.streamName;
        this.transcodeTemplates = builder.transcodeTemplates;
        this.vodTranscodeGroupId = builder.vodTranscodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveRecordVodConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return autoCompose
     */
    public String getAutoCompose() {
        return this.autoCompose;
    }

    /**
     * @return composeVodTranscodeGroupId
     */
    public String getComposeVodTranscodeGroupId() {
        return this.composeVodTranscodeGroupId;
    }

    /**
     * @return cycleDuration
     */
    public Integer getCycleDuration() {
        return this.cycleDuration;
    }

    /**
     * @return delayTime
     */
    public Integer getDelayTime() {
        return this.delayTime;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return formatConfig
     */
    public Boolean getFormatConfig() {
        return this.formatConfig;
    }

    /**
     * @return onDemand
     */
    public Integer getOnDemand() {
        return this.onDemand;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recordContent
     */
    public String getRecordContent() {
        return this.recordContent;
    }

    /**
     * @return recordFormat
     */
    public java.util.List<RecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return transcodeTemplates
     */
    public java.util.List<String> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    /**
     * @return vodTranscodeGroupId
     */
    public String getVodTranscodeGroupId() {
        return this.vodTranscodeGroupId;
    }

    public static final class Builder extends Request.Builder<AddLiveRecordVodConfigRequest, Builder> {
        private String appName; 
        private String autoCompose; 
        private String composeVodTranscodeGroupId; 
        private Integer cycleDuration; 
        private Integer delayTime; 
        private String domainName; 
        private Boolean formatConfig; 
        private Integer onDemand; 
        private Long ownerId; 
        private String recordContent; 
        private java.util.List<RecordFormat> recordFormat; 
        private String regionId; 
        private String spaceId; 
        private String storageLocation; 
        private String streamName; 
        private java.util.List<String> transcodeTemplates; 
        private String vodTranscodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveRecordVodConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.autoCompose = request.autoCompose;
            this.composeVodTranscodeGroupId = request.composeVodTranscodeGroupId;
            this.cycleDuration = request.cycleDuration;
            this.delayTime = request.delayTime;
            this.domainName = request.domainName;
            this.formatConfig = request.formatConfig;
            this.onDemand = request.onDemand;
            this.ownerId = request.ownerId;
            this.recordContent = request.recordContent;
            this.recordFormat = request.recordFormat;
            this.regionId = request.regionId;
            this.spaceId = request.spaceId;
            this.storageLocation = request.storageLocation;
            this.streamName = request.streamName;
            this.transcodeTemplates = request.transcodeTemplates;
            this.vodTranscodeGroupId = request.vodTranscodeGroupId;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic merging. If you set the value to <strong>ON</strong>, automatic merging is enabled and the ComposeVodTranscodeGroupId parameter is required. If you do not specify this parameter, automatic merging is disabled.</p>
         * <blockquote>
         * <p> If you enable automatic merging, the VOD files that are created from live streams are automatically merged by using the editing and production feature of ApsaraVideo VOD. For information about the billing of the feature, see <a href="https://help.aliyun.com/document_detail/188310.html">Billing of value-added services</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder autoCompose(String autoCompose) {
            this.putQueryParameter("AutoCompose", autoCompose);
            this.autoCompose = autoCompose;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group in ApsaraVideo VOD that is used to transcode the video file. The video file is generated by merging the VOD files created from live streams.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if you set the AutoCompose parameter to ON.</p>
         * </li>
         * <li><p>For more information about automatic merging and transcoding, see <a href="https://help.aliyun.com/document_detail/99726.html">FAQ about Live-to-VOD</a>.</p>
         * </li>
         * <li><p>For information about the billing of transcoding in ApsaraVideo VOD, see <a href="https://help.aliyun.com/document_detail/188308.html">Billing of basic services</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder composeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
            this.putQueryParameter("ComposeVodTranscodeGroupId", composeVodTranscodeGroupId);
            this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
            return this;
        }

        /**
         * <p>The recording cycle. Unit: seconds. Valid values: <strong>300 to 21600</strong>. Default value: <strong>3600</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder cycleDuration(Integer cycleDuration) {
            this.putQueryParameter("CycleDuration", cycleDuration);
            this.cycleDuration = cycleDuration;
            return this;
        }

        /**
         * DelayTime.
         */
        public Builder delayTime(Integer delayTime) {
            this.putQueryParameter("DelayTime", delayTime);
            this.delayTime = delayTime;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <blockquote>
         * <p> Make sure that ApsaraVideo VOD is activated in the same region as the live center of the streaming domain.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * FormatConfig.
         */
        public Builder formatConfig(Boolean formatConfig) {
            this.putQueryParameter("FormatConfig", formatConfig);
            this.formatConfig = formatConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable on-demand recording. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): disables on-demand recording.</li>
         * <li><strong>1</strong>: enables on-demand recording.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder onDemand(Integer onDemand) {
            this.putQueryParameter("OnDemand", onDemand);
            this.onDemand = onDemand;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RecordContent.
         */
        public Builder recordContent(String recordContent) {
            this.putQueryParameter("RecordContent", recordContent);
            this.recordContent = recordContent;
            return this;
        }

        /**
         * RecordFormat.
         */
        public Builder recordFormat(java.util.List<RecordFormat> recordFormat) {
            this.putQueryParameter("RecordFormat", recordFormat);
            this.recordFormat = recordFormat;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putQueryParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * <p>The storage location.</p>
         * 
         * <strong>example:</strong>
         * <p>****-tjptr2vatm.oss-cn-shanghai.aliyuncs.com</p>
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * 
         * <strong>example:</strong>
         * <p>stream</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * TranscodeTemplates.
         */
        public Builder transcodeTemplates(java.util.List<String> transcodeTemplates) {
            this.putQueryParameter("TranscodeTemplates", transcodeTemplates);
            this.transcodeTemplates = transcodeTemplates;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group in ApsaraVideo VOD.</p>
         * 
         * <strong>example:</strong>
         * <p>e2d796d3bb5fd8049d32bff62f94****</p>
         */
        public Builder vodTranscodeGroupId(String vodTranscodeGroupId) {
            this.putQueryParameter("VodTranscodeGroupId", vodTranscodeGroupId);
            this.vodTranscodeGroupId = vodTranscodeGroupId;
            return this;
        }

        @Override
        public AddLiveRecordVodConfigRequest build() {
            return new AddLiveRecordVodConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddLiveRecordVodConfigRequest} extends {@link TeaModel}
     *
     * <p>AddLiveRecordVodConfigRequest</p>
     */
    public static class RecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCompose")
        private String autoCompose;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("ProcessMethod")
        private String processMethod;

        @com.aliyun.core.annotation.NameInMap("ProcessTemplateId")
        private String processTemplateId;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("VideoProcess")
        private String videoProcess;

        private RecordFormat(Builder builder) {
            this.autoCompose = builder.autoCompose;
            this.format = builder.format;
            this.processMethod = builder.processMethod;
            this.processTemplateId = builder.processTemplateId;
            this.sliceDuration = builder.sliceDuration;
            this.tags = builder.tags;
            this.videoProcess = builder.videoProcess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormat create() {
            return builder().build();
        }

        /**
         * @return autoCompose
         */
        public String getAutoCompose() {
            return this.autoCompose;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return processMethod
         */
        public String getProcessMethod() {
            return this.processMethod;
        }

        /**
         * @return processTemplateId
         */
        public String getProcessTemplateId() {
            return this.processTemplateId;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return videoProcess
         */
        public String getVideoProcess() {
            return this.videoProcess;
        }

        public static final class Builder {
            private String autoCompose; 
            private String format; 
            private String processMethod; 
            private String processTemplateId; 
            private Integer sliceDuration; 
            private String tags; 
            private String videoProcess; 

            private Builder() {
            } 

            private Builder(RecordFormat model) {
                this.autoCompose = model.autoCompose;
                this.format = model.format;
                this.processMethod = model.processMethod;
                this.processTemplateId = model.processTemplateId;
                this.sliceDuration = model.sliceDuration;
                this.tags = model.tags;
                this.videoProcess = model.videoProcess;
            } 

            /**
             * <p>Specifies whether to enable automatic merging. If you set the value to <strong>ON</strong>, automatic merging is enabled and the ComposeVodTranscodeGroupId parameter is required. If you do not specify this parameter, automatic merging is disabled.</p>
             * <blockquote>
             * <p> If you enable automatic merging, the VOD files that are created from live streams are automatically merged by using the editing and production feature of ApsaraVideo VOD. For information about the billing of the feature, see <a href="https://help.aliyun.com/document_detail/188310.html">Billing of value-added services</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder autoCompose(String autoCompose) {
                this.autoCompose = autoCompose;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * ProcessMethod.
             */
            public Builder processMethod(String processMethod) {
                this.processMethod = processMethod;
                return this;
            }

            /**
             * ProcessTemplateId.
             */
            public Builder processTemplateId(String processTemplateId) {
                this.processTemplateId = processTemplateId;
                return this;
            }

            /**
             * SliceDuration.
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VideoProcess.
             */
            public Builder videoProcess(String videoProcess) {
                this.videoProcess = videoProcess;
                return this;
            }

            public RecordFormat build() {
                return new RecordFormat(this);
            } 

        } 

    }
}
