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
 * {@link DescribeLiveRecordVodConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRecordVodConfigsResponseBody</p>
 */
public class DescribeLiveRecordVodConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveRecordVodConfigs")
    private LiveRecordVodConfigs liveRecordVodConfigs;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private DescribeLiveRecordVodConfigsResponseBody(Builder builder) {
        this.liveRecordVodConfigs = builder.liveRecordVodConfigs;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRecordVodConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveRecordVodConfigs
     */
    public LiveRecordVodConfigs getLiveRecordVodConfigs() {
        return this.liveRecordVodConfigs;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private LiveRecordVodConfigs liveRecordVodConfigs; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private String total; 

        private Builder() {
        } 

        private Builder(DescribeLiveRecordVodConfigsResponseBody model) {
            this.liveRecordVodConfigs = model.liveRecordVodConfigs;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The configurations.</p>
         */
        public Builder liveRecordVodConfigs(LiveRecordVodConfigs liveRecordVodConfigs) {
            this.liveRecordVodConfigs = liveRecordVodConfigs;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5056369B-D337-499E-B8B7-B761BD37B08A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeLiveRecordVodConfigsResponseBody build() {
            return new DescribeLiveRecordVodConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveRecordVodConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordVodConfigsResponseBody</p>
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
             * AutoCompose.
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
    /**
     * 
     * {@link DescribeLiveRecordVodConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordVodConfigsResponseBody</p>
     */
    public static class RecordFormatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordFormat")
        private java.util.List<RecordFormat> recordFormat;

        private RecordFormatList(Builder builder) {
            this.recordFormat = builder.recordFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormatList create() {
            return builder().build();
        }

        /**
         * @return recordFormat
         */
        public java.util.List<RecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

        public static final class Builder {
            private java.util.List<RecordFormat> recordFormat; 

            private Builder() {
            } 

            private Builder(RecordFormatList model) {
                this.recordFormat = model.recordFormat;
            } 

            /**
             * RecordFormat.
             */
            public Builder recordFormat(java.util.List<RecordFormat> recordFormat) {
                this.recordFormat = recordFormat;
                return this;
            }

            public RecordFormatList build() {
                return new RecordFormatList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveRecordVodConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordVodConfigsResponseBody</p>
     */
    public static class LiveRecordVodConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AutoCompose")
        private String autoCompose;

        @com.aliyun.core.annotation.NameInMap("ComposeVodTranscodeGroupId")
        private String composeVodTranscodeGroupId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Integer delayTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("FormatConfig")
        private Boolean formatConfig;

        @com.aliyun.core.annotation.NameInMap("OnDemand")
        private Integer onDemand;

        @com.aliyun.core.annotation.NameInMap("RecordContent")
        private String recordContent;

        @com.aliyun.core.annotation.NameInMap("RecordFormatList")
        private RecordFormatList recordFormatList;

        @com.aliyun.core.annotation.NameInMap("SpaceId")
        private String spaceId;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplates")
        private String transcodeTemplates;

        @com.aliyun.core.annotation.NameInMap("VodTranscodeGroupId")
        private String vodTranscodeGroupId;

        private LiveRecordVodConfig(Builder builder) {
            this.appName = builder.appName;
            this.autoCompose = builder.autoCompose;
            this.composeVodTranscodeGroupId = builder.composeVodTranscodeGroupId;
            this.createTime = builder.createTime;
            this.cycleDuration = builder.cycleDuration;
            this.delayTime = builder.delayTime;
            this.domainName = builder.domainName;
            this.formatConfig = builder.formatConfig;
            this.onDemand = builder.onDemand;
            this.recordContent = builder.recordContent;
            this.recordFormatList = builder.recordFormatList;
            this.spaceId = builder.spaceId;
            this.storageLocation = builder.storageLocation;
            this.streamName = builder.streamName;
            this.transcodeTemplates = builder.transcodeTemplates;
            this.vodTranscodeGroupId = builder.vodTranscodeGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveRecordVodConfig create() {
            return builder().build();
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return recordContent
         */
        public String getRecordContent() {
            return this.recordContent;
        }

        /**
         * @return recordFormatList
         */
        public RecordFormatList getRecordFormatList() {
            return this.recordFormatList;
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
        public String getTranscodeTemplates() {
            return this.transcodeTemplates;
        }

        /**
         * @return vodTranscodeGroupId
         */
        public String getVodTranscodeGroupId() {
            return this.vodTranscodeGroupId;
        }

        public static final class Builder {
            private String appName; 
            private String autoCompose; 
            private String composeVodTranscodeGroupId; 
            private String createTime; 
            private Integer cycleDuration; 
            private Integer delayTime; 
            private String domainName; 
            private Boolean formatConfig; 
            private Integer onDemand; 
            private String recordContent; 
            private RecordFormatList recordFormatList; 
            private String spaceId; 
            private String storageLocation; 
            private String streamName; 
            private String transcodeTemplates; 
            private String vodTranscodeGroupId; 

            private Builder() {
            } 

            private Builder(LiveRecordVodConfig model) {
                this.appName = model.appName;
                this.autoCompose = model.autoCompose;
                this.composeVodTranscodeGroupId = model.composeVodTranscodeGroupId;
                this.createTime = model.createTime;
                this.cycleDuration = model.cycleDuration;
                this.delayTime = model.delayTime;
                this.domainName = model.domainName;
                this.formatConfig = model.formatConfig;
                this.onDemand = model.onDemand;
                this.recordContent = model.recordContent;
                this.recordFormatList = model.recordFormatList;
                this.spaceId = model.spaceId;
                this.storageLocation = model.storageLocation;
                this.streamName = model.streamName;
                this.transcodeTemplates = model.transcodeTemplates;
                this.vodTranscodeGroupId = model.vodTranscodeGroupId;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>Indicates whether automatic merging is enabled. Valid values:</p>
             * <ul>
             * <li><strong>ON</strong></li>
             * <li><strong>OFF</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder autoCompose(String autoCompose) {
                this.autoCompose = autoCompose;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group that was used to automatically merge the VOD files created from the live streams.</p>
             * <blockquote>
             * <p> This parameter is returned if the value of the AutoCompose parameter is ON.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dadfcaadde****</p>
             */
            public Builder composeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
                this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
                return this;
            }

            /**
             * <p>The time when the live stream was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-01T17:37:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The recording cycle. Unit: seconds. Default value: <strong>3600</strong>. Valid values: <strong>300 to 21600</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * DelayTime.
             */
            public Builder delayTime(Integer delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * FormatConfig.
             */
            public Builder formatConfig(Boolean formatConfig) {
                this.formatConfig = formatConfig;
                return this;
            }

            /**
             * <p>Indicates whether on-demand recording is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> (default): On-demand recording is disabled.</li>
             * <li><strong>1</strong>: On-demand recording is enabled by using the HTTP callback method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onDemand(Integer onDemand) {
                this.onDemand = onDemand;
                return this;
            }

            /**
             * RecordContent.
             */
            public Builder recordContent(String recordContent) {
                this.recordContent = recordContent;
                return this;
            }

            /**
             * RecordFormatList.
             */
            public Builder recordFormatList(RecordFormatList recordFormatList) {
                this.recordFormatList = recordFormatList;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
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
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * TranscodeTemplates.
             */
            public Builder transcodeTemplates(String transcodeTemplates) {
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
                this.vodTranscodeGroupId = vodTranscodeGroupId;
                return this;
            }

            public LiveRecordVodConfig build() {
                return new LiveRecordVodConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveRecordVodConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordVodConfigsResponseBody</p>
     */
    public static class LiveRecordVodConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveRecordVodConfig")
        private java.util.List<LiveRecordVodConfig> liveRecordVodConfig;

        private LiveRecordVodConfigs(Builder builder) {
            this.liveRecordVodConfig = builder.liveRecordVodConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveRecordVodConfigs create() {
            return builder().build();
        }

        /**
         * @return liveRecordVodConfig
         */
        public java.util.List<LiveRecordVodConfig> getLiveRecordVodConfig() {
            return this.liveRecordVodConfig;
        }

        public static final class Builder {
            private java.util.List<LiveRecordVodConfig> liveRecordVodConfig; 

            private Builder() {
            } 

            private Builder(LiveRecordVodConfigs model) {
                this.liveRecordVodConfig = model.liveRecordVodConfig;
            } 

            /**
             * LiveRecordVodConfig.
             */
            public Builder liveRecordVodConfig(java.util.List<LiveRecordVodConfig> liveRecordVodConfig) {
                this.liveRecordVodConfig = liveRecordVodConfig;
                return this;
            }

            public LiveRecordVodConfigs build() {
                return new LiveRecordVodConfigs(this);
            } 

        } 

    }
}
