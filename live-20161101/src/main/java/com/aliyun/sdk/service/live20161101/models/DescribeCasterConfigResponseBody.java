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
 * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterConfigResponseBody</p>
 */
public class DescribeCasterConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoSwitchUrgentConfig")
    private String autoSwitchUrgentConfig;

    @com.aliyun.core.annotation.NameInMap("AutoSwitchUrgentOn")
    private String autoSwitchUrgentOn;

    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("CasterName")
    private String casterName;

    @com.aliyun.core.annotation.NameInMap("ChannelEnable")
    private Integer channelEnable;

    @com.aliyun.core.annotation.NameInMap("Delay")
    private Float delay;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("ProgramEffect")
    private Integer programEffect;

    @com.aliyun.core.annotation.NameInMap("ProgramName")
    private String programName;

    @com.aliyun.core.annotation.NameInMap("RecordConfig")
    private RecordConfig recordConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SideOutputUrl")
    private String sideOutputUrl;

    @com.aliyun.core.annotation.NameInMap("SideOutputUrlList")
    private String sideOutputUrlList;

    @com.aliyun.core.annotation.NameInMap("SyncGroupsConfig")
    private SyncGroupsConfig syncGroupsConfig;

    @com.aliyun.core.annotation.NameInMap("TranscodeConfig")
    private TranscodeConfig transcodeConfig;

    @com.aliyun.core.annotation.NameInMap("UrgentImageId")
    private String urgentImageId;

    @com.aliyun.core.annotation.NameInMap("UrgentImageUrl")
    private String urgentImageUrl;

    @com.aliyun.core.annotation.NameInMap("UrgentLiveStreamUrl")
    private String urgentLiveStreamUrl;

    @com.aliyun.core.annotation.NameInMap("UrgentMaterialId")
    private String urgentMaterialId;

    private DescribeCasterConfigResponseBody(Builder builder) {
        this.autoSwitchUrgentConfig = builder.autoSwitchUrgentConfig;
        this.autoSwitchUrgentOn = builder.autoSwitchUrgentOn;
        this.callbackUrl = builder.callbackUrl;
        this.casterId = builder.casterId;
        this.casterName = builder.casterName;
        this.channelEnable = builder.channelEnable;
        this.delay = builder.delay;
        this.domainName = builder.domainName;
        this.programEffect = builder.programEffect;
        this.programName = builder.programName;
        this.recordConfig = builder.recordConfig;
        this.requestId = builder.requestId;
        this.sideOutputUrl = builder.sideOutputUrl;
        this.sideOutputUrlList = builder.sideOutputUrlList;
        this.syncGroupsConfig = builder.syncGroupsConfig;
        this.transcodeConfig = builder.transcodeConfig;
        this.urgentImageId = builder.urgentImageId;
        this.urgentImageUrl = builder.urgentImageUrl;
        this.urgentLiveStreamUrl = builder.urgentLiveStreamUrl;
        this.urgentMaterialId = builder.urgentMaterialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSwitchUrgentConfig
     */
    public String getAutoSwitchUrgentConfig() {
        return this.autoSwitchUrgentConfig;
    }

    /**
     * @return autoSwitchUrgentOn
     */
    public String getAutoSwitchUrgentOn() {
        return this.autoSwitchUrgentOn;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return casterName
     */
    public String getCasterName() {
        return this.casterName;
    }

    /**
     * @return channelEnable
     */
    public Integer getChannelEnable() {
        return this.channelEnable;
    }

    /**
     * @return delay
     */
    public Float getDelay() {
        return this.delay;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return programEffect
     */
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    /**
     * @return programName
     */
    public String getProgramName() {
        return this.programName;
    }

    /**
     * @return recordConfig
     */
    public RecordConfig getRecordConfig() {
        return this.recordConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sideOutputUrl
     */
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    /**
     * @return sideOutputUrlList
     */
    public String getSideOutputUrlList() {
        return this.sideOutputUrlList;
    }

    /**
     * @return syncGroupsConfig
     */
    public SyncGroupsConfig getSyncGroupsConfig() {
        return this.syncGroupsConfig;
    }

    /**
     * @return transcodeConfig
     */
    public TranscodeConfig getTranscodeConfig() {
        return this.transcodeConfig;
    }

    /**
     * @return urgentImageId
     */
    public String getUrgentImageId() {
        return this.urgentImageId;
    }

    /**
     * @return urgentImageUrl
     */
    public String getUrgentImageUrl() {
        return this.urgentImageUrl;
    }

    /**
     * @return urgentLiveStreamUrl
     */
    public String getUrgentLiveStreamUrl() {
        return this.urgentLiveStreamUrl;
    }

    /**
     * @return urgentMaterialId
     */
    public String getUrgentMaterialId() {
        return this.urgentMaterialId;
    }

    public static final class Builder {
        private String autoSwitchUrgentConfig; 
        private String autoSwitchUrgentOn; 
        private String callbackUrl; 
        private String casterId; 
        private String casterName; 
        private Integer channelEnable; 
        private Float delay; 
        private String domainName; 
        private Integer programEffect; 
        private String programName; 
        private RecordConfig recordConfig; 
        private String requestId; 
        private String sideOutputUrl; 
        private String sideOutputUrlList; 
        private SyncGroupsConfig syncGroupsConfig; 
        private TranscodeConfig transcodeConfig; 
        private String urgentImageId; 
        private String urgentImageUrl; 
        private String urgentLiveStreamUrl; 
        private String urgentMaterialId; 

        private Builder() {
        } 

        private Builder(DescribeCasterConfigResponseBody model) {
            this.autoSwitchUrgentConfig = model.autoSwitchUrgentConfig;
            this.autoSwitchUrgentOn = model.autoSwitchUrgentOn;
            this.callbackUrl = model.callbackUrl;
            this.casterId = model.casterId;
            this.casterName = model.casterName;
            this.channelEnable = model.channelEnable;
            this.delay = model.delay;
            this.domainName = model.domainName;
            this.programEffect = model.programEffect;
            this.programName = model.programName;
            this.recordConfig = model.recordConfig;
            this.requestId = model.requestId;
            this.sideOutputUrl = model.sideOutputUrl;
            this.sideOutputUrlList = model.sideOutputUrlList;
            this.syncGroupsConfig = model.syncGroupsConfig;
            this.transcodeConfig = model.transcodeConfig;
            this.urgentImageId = model.urgentImageId;
            this.urgentImageUrl = model.urgentImageUrl;
            this.urgentLiveStreamUrl = model.urgentLiveStreamUrl;
            this.urgentMaterialId = model.urgentMaterialId;
        } 

        /**
         * <p>The configuration for automatic switchover to the standby resource. The <code>eofThres</code> field specifies the duration after which the production studio automatically switches to the standby resource if a stream interruption occurs. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;eofThres&quot;:3}</p>
         */
        public Builder autoSwitchUrgentConfig(String autoSwitchUrgentConfig) {
            this.autoSwitchUrgentConfig = autoSwitchUrgentConfig;
            return this;
        }

        /**
         * <p>Indicates whether the production studio automatically switches to the standby resource in case of a stream interruption.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoSwitchUrgentOn(String autoSwitchUrgentOn) {
            this.autoSwitchUrgentOn = autoSwitchUrgentOn;
            return this;
        }

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/callBackLive">http://learn.aliyundoc.com/callBackLive</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The ID of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The name of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>coco-caster10</p>
         */
        public Builder casterName(String casterName) {
            this.casterName = casterName;
            return this;
        }

        /**
         * <p>Indicates whether channels are enabled for the production studio. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Channels are disabled.</li>
         * <li><strong>1</strong>: Channels are enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder channelEnable(Integer channelEnable) {
            this.channelEnable = channelEnable;
            return this;
        }

        /**
         * <p>Indicates whether stream delay is enabled. Unit: seconds.</p>
         * <ul>
         * <li><strong>0</strong>: Stream delay is disabled.</li>
         * <li><strong>A value greater than 0</strong>: Stream delay is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delay(Float delay) {
            this.delay = delay;
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
         * <p>Indicates whether the carousel playback feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The carousel playback feature is disabled.</li>
         * <li><strong>1</strong>: The carousel playback feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder programEffect(Integer programEffect) {
            this.programEffect = programEffect;
            return this;
        }

        /**
         * <p>The name of the playlist for carousel playback.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name</p>
         */
        public Builder programName(String programName) {
            this.programName = programName;
            return this;
        }

        /**
         * <p>The recording configuration. If this parameter is empty, the recording feature is disabled.</p>
         */
        public Builder recordConfig(RecordConfig recordConfig) {
            this.recordConfig = recordConfig;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>97df6b7f-3490-47d2-ac50-8833e1b64597</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The custom stream redirect URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://sophon-developer.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
         */
        public Builder sideOutputUrl(String sideOutputUrl) {
            this.sideOutputUrl = sideOutputUrl;
            return this;
        }

        /**
         * <p>The list of custom stream redirect URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://sophon-developer.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
         */
        public Builder sideOutputUrlList(String sideOutputUrlList) {
            this.sideOutputUrlList = sideOutputUrlList;
            return this;
        }

        /**
         * <p>The storage configuration.</p>
         */
        public Builder syncGroupsConfig(SyncGroupsConfig syncGroupsConfig) {
            this.syncGroupsConfig = syncGroupsConfig;
            return this;
        }

        /**
         * <p>The transcoding configuration.</p>
         */
        public Builder transcodeConfig(TranscodeConfig transcodeConfig) {
            this.transcodeConfig = transcodeConfig;
            return this;
        }

        /**
         * <p>Prepared broadcast image media asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a089175eb5f4427684fc0715159a****</p>
         */
        public Builder urgentImageId(String urgentImageId) {
            this.urgentImageId = urgentImageId;
            return this;
        }

        /**
         * <p>URL of the standby image material.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
         */
        public Builder urgentImageUrl(String urgentImageUrl) {
            this.urgentImageUrl = urgentImageUrl;
            return this;
        }

        /**
         * <p>The URL of the standby live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://demo.aliyundoc.com</p>
         */
        public Builder urgentLiveStreamUrl(String urgentLiveStreamUrl) {
            this.urgentLiveStreamUrl = urgentLiveStreamUrl;
            return this;
        }

        /**
         * <p>The ID of the material that is used as the standby video from the media library.</p>
         * 
         * <strong>example:</strong>
         * <p>98646538-bcf9-4aef-bd4a-e6bb76588****</p>
         */
        public Builder urgentMaterialId(String urgentMaterialId) {
            this.urgentMaterialId = urgentMaterialId;
            return this;
        }

        public DescribeCasterConfigResponseBody build() {
            return new DescribeCasterConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class RecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private RecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private String sliceOssObjectPrefix; 

            private Builder() {
            } 

            private Builder(RecordFormat model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.ossObjectPrefix = model.ossObjectPrefix;
                this.sliceOssObjectPrefix = model.sliceOssObjectPrefix;
            } 

            /**
             * <p>The length of the recording.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>The format of the recording.</p>
             * 
             * <strong>example:</strong>
             * <p>M3U8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The name of the recording.</p>
             * 
             * <strong>example:</strong>
             * <p>record/{liveApp****}/{liveStream****}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>The name of the segment.</p>
             * 
             * <strong>example:</strong>
             * <p>record/{liveApp****}/{liveStream****}/{UnixTimestamp****}</p>
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public RecordFormat build() {
                return new RecordFormat(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class RecordConfigRecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordFormat")
        private java.util.List<RecordFormat> recordFormat;

        private RecordConfigRecordFormat(Builder builder) {
            this.recordFormat = builder.recordFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordConfigRecordFormat create() {
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

            private Builder(RecordConfigRecordFormat model) {
                this.recordFormat = model.recordFormat;
            } 

            /**
             * RecordFormat.
             */
            public Builder recordFormat(java.util.List<RecordFormat> recordFormat) {
                this.recordFormat = recordFormat;
                return this;
            }

            public RecordConfigRecordFormat build() {
                return new RecordConfigRecordFormat(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class RecordConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OnDemand")
        private Integer onDemand;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("RecordFormat")
        private RecordConfigRecordFormat recordFormat;

        private RecordConfig(Builder builder) {
            this.onDemand = builder.onDemand;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.recordFormat = builder.recordFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordConfig create() {
            return builder().build();
        }

        /**
         * @return onDemand
         */
        public Integer getOnDemand() {
            return this.onDemand;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return recordFormat
         */
        public RecordConfigRecordFormat getRecordFormat() {
            return this.recordFormat;
        }

        public static final class Builder {
            private Integer onDemand; 
            private String ossBucket; 
            private String ossEndpoint; 
            private RecordConfigRecordFormat recordFormat; 

            private Builder() {
            } 

            private Builder(RecordConfig model) {
                this.onDemand = model.onDemand;
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.recordFormat = model.recordFormat;
            } 

            /**
             * <p>On-demand recording. Values:</p>
             * <ul>
             * <li>0: Off. </li>
             * <li>1: Via HTTP callback. </li>
             * <li>2: Parse streaming parameters for on-demand recording. </li>
             * <li>7: Default to not record.</li>
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
             * <p>The OSS bucket for storage.</p>
             * 
             * <strong>example:</strong>
             * <p>liveBucket****</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai.aliyundoc.com</p>
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * <p>The recording configuration.</p>
             */
            public Builder recordFormat(RecordConfigRecordFormat recordFormat) {
                this.recordFormat = recordFormat;
                return this;
            }

            public RecordConfig build() {
                return new RecordConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class ResourceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private java.util.List<String> resourceId;

        private ResourceIds(Builder builder) {
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceIds create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public java.util.List<String> getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.List<String> resourceId; 

            private Builder() {
            } 

            private Builder(ResourceIds model) {
                this.resourceId = model.resourceId;
            } 

            /**
             * ResourceId.
             */
            public Builder resourceId(java.util.List<String> resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public ResourceIds build() {
                return new ResourceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class SyncGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostResourceId")
        private String hostResourceId;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("ResourceIds")
        private ResourceIds resourceIds;

        private SyncGroup(Builder builder) {
            this.hostResourceId = builder.hostResourceId;
            this.mode = builder.mode;
            this.resourceIds = builder.resourceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncGroup create() {
            return builder().build();
        }

        /**
         * @return hostResourceId
         */
        public String getHostResourceId() {
            return this.hostResourceId;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return resourceIds
         */
        public ResourceIds getResourceIds() {
            return this.resourceIds;
        }

        public static final class Builder {
            private String hostResourceId; 
            private Integer mode; 
            private ResourceIds resourceIds; 

            private Builder() {
            } 

            private Builder(SyncGroup model) {
                this.hostResourceId = model.hostResourceId;
                this.mode = model.mode;
                this.resourceIds = model.resourceIds;
            } 

            /**
             * <p>The ID of the resource in the production studio.</p>
             * 
             * <strong>example:</strong>
             * <p>28768383240243****</p>
             */
            public Builder hostResourceId(String hostResourceId) {
                this.hostResourceId = hostResourceId;
                return this;
            }

            /**
             * <p>The cache mode of the Static Page Caching policy. Valid values:</p>
             * <ul>
             * <li>0: standard mode</li>
             * <li>1: force mode</li>
             * <li>2: no cache</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The IDs of the resources for which you want to modify the resource group. The number of resource IDs is 1 to 50.</p>
             */
            public Builder resourceIds(ResourceIds resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            public SyncGroup build() {
                return new SyncGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class SyncGroupsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SyncGroup")
        private java.util.List<SyncGroup> syncGroup;

        private SyncGroupsConfig(Builder builder) {
            this.syncGroup = builder.syncGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncGroupsConfig create() {
            return builder().build();
        }

        /**
         * @return syncGroup
         */
        public java.util.List<SyncGroup> getSyncGroup() {
            return this.syncGroup;
        }

        public static final class Builder {
            private java.util.List<SyncGroup> syncGroup; 

            private Builder() {
            } 

            private Builder(SyncGroupsConfig model) {
                this.syncGroup = model.syncGroup;
            } 

            /**
             * SyncGroup.
             */
            public Builder syncGroup(java.util.List<SyncGroup> syncGroup) {
                this.syncGroup = syncGroup;
                return this;
            }

            public SyncGroupsConfig build() {
                return new SyncGroupsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class Video extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bitrate")
        private Integer bitrate;

        @com.aliyun.core.annotation.NameInMap("fps")
        private Integer fps;

        @com.aliyun.core.annotation.NameInMap("height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("width")
        private Integer width;

        private Video(Builder builder) {
            this.bitrate = builder.bitrate;
            this.fps = builder.fps;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public Integer getBitrate() {
            return this.bitrate;
        }

        /**
         * @return fps
         */
        public Integer getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer bitrate; 
            private Integer fps; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(Video model) {
                this.bitrate = model.bitrate;
                this.fps = model.fps;
                this.height = model.height;
                this.width = model.width;
            } 

            /**
             * <p>The video bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder bitrate(Integer bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The video frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The video height. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The video width. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class CustomParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("video")
        private Video video;

        private CustomParams(Builder builder) {
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomParams create() {
            return builder().build();
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        public static final class Builder {
            private Video video; 

            private Builder() {
            } 

            private Builder(CustomParams model) {
                this.video = model.video;
            } 

            /**
             * <p>The video parameters.</p>
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            public CustomParams build() {
                return new CustomParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class LiveTemplateIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocationId")
        private java.util.List<String> locationId;

        private LiveTemplateIds(Builder builder) {
            this.locationId = builder.locationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveTemplateIds create() {
            return builder().build();
        }

        /**
         * @return locationId
         */
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

        public static final class Builder {
            private java.util.List<String> locationId; 

            private Builder() {
            } 

            private Builder(LiveTemplateIds model) {
                this.locationId = model.locationId;
            } 

            /**
             * LocationId.
             */
            public Builder locationId(java.util.List<String> locationId) {
                this.locationId = locationId;
                return this;
            }

            public LiveTemplateIds build() {
                return new LiveTemplateIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCasterConfigResponseBody</p>
     */
    public static class TranscodeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CasterTemplate")
        private String casterTemplate;

        @com.aliyun.core.annotation.NameInMap("CustomParams")
        private CustomParams customParams;

        @com.aliyun.core.annotation.NameInMap("LiveTemplateIds")
        private LiveTemplateIds liveTemplateIds;

        private TranscodeConfig(Builder builder) {
            this.casterTemplate = builder.casterTemplate;
            this.customParams = builder.customParams;
            this.liveTemplateIds = builder.liveTemplateIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeConfig create() {
            return builder().build();
        }

        /**
         * @return casterTemplate
         */
        public String getCasterTemplate() {
            return this.casterTemplate;
        }

        /**
         * @return customParams
         */
        public CustomParams getCustomParams() {
            return this.customParams;
        }

        /**
         * @return liveTemplateIds
         */
        public LiveTemplateIds getLiveTemplateIds() {
            return this.liveTemplateIds;
        }

        public static final class Builder {
            private String casterTemplate; 
            private CustomParams customParams; 
            private LiveTemplateIds liveTemplateIds; 

            private Builder() {
            } 

            private Builder(TranscodeConfig model) {
                this.casterTemplate = model.casterTemplate;
                this.customParams = model.customParams;
                this.liveTemplateIds = model.liveTemplateIds;
            } 

            /**
             * <p>The transcoding template of the production studio. Valid values:</p>
             * <ul>
             * <li><strong>lp_ld</strong>: low definition</li>
             * <li><strong>lp_sd</strong>: standard definition</li>
             * <li><strong>lp_hd</strong>: high definition</li>
             * <li><strong>lp_ud</strong>: ultra high definition</li>
             * <li><strong>lp_ld_v</strong>: low definition (portrait mode)</li>
             * <li><strong>lp_sd_v</strong>: standard definition (portrait mode)</li>
             * <li><strong>lp_hd_v</strong>: high definition (portrait mode)</li>
             * <li><strong>lp_ud_v</strong>: ultra high definition (portrait mode)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lp_hd</p>
             */
            public Builder casterTemplate(String casterTemplate) {
                this.casterTemplate = casterTemplate;
                return this;
            }

            /**
             * <p>The custom settings.</p>
             */
            public Builder customParams(CustomParams customParams) {
                this.customParams = customParams;
                return this;
            }

            /**
             * <p>The transcoding setting for live streams.</p>
             */
            public Builder liveTemplateIds(LiveTemplateIds liveTemplateIds) {
                this.liveTemplateIds = liveTemplateIds;
                return this;
            }

            public TranscodeConfig build() {
                return new TranscodeConfig(this);
            } 

        } 

    }
}
