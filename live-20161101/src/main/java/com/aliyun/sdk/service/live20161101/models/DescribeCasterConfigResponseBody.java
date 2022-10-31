// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterConfigResponseBody</p>
 */
public class DescribeCasterConfigResponseBody extends TeaModel {
    @NameInMap("CallbackUrl")
    private String callbackUrl;

    @NameInMap("CasterId")
    private String casterId;

    @NameInMap("CasterName")
    private String casterName;

    @NameInMap("ChannelEnable")
    private Integer channelEnable;

    @NameInMap("Delay")
    private Float delay;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("ProgramEffect")
    private Integer programEffect;

    @NameInMap("ProgramName")
    private String programName;

    @NameInMap("RecordConfig")
    private RecordConfig recordConfig;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SideOutputUrl")
    private String sideOutputUrl;

    @NameInMap("SideOutputUrlList")
    private String sideOutputUrlList;

    @NameInMap("SyncGroupsConfig")
    private SyncGroupsConfig syncGroupsConfig;

    @NameInMap("TranscodeConfig")
    private TranscodeConfig transcodeConfig;

    @NameInMap("UrgentLiveStreamUrl")
    private String urgentLiveStreamUrl;

    @NameInMap("UrgentMaterialId")
    private String urgentMaterialId;

    private DescribeCasterConfigResponseBody(Builder builder) {
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
        this.urgentLiveStreamUrl = builder.urgentLiveStreamUrl;
        this.urgentMaterialId = builder.urgentMaterialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterConfigResponseBody create() {
        return builder().build();
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
        private String urgentLiveStreamUrl; 
        private String urgentMaterialId; 

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * CasterName.
         */
        public Builder casterName(String casterName) {
            this.casterName = casterName;
            return this;
        }

        /**
         * ChannelEnable.
         */
        public Builder channelEnable(Integer channelEnable) {
            this.channelEnable = channelEnable;
            return this;
        }

        /**
         * Delay.
         */
        public Builder delay(Float delay) {
            this.delay = delay;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * ProgramEffect.
         */
        public Builder programEffect(Integer programEffect) {
            this.programEffect = programEffect;
            return this;
        }

        /**
         * ProgramName.
         */
        public Builder programName(String programName) {
            this.programName = programName;
            return this;
        }

        /**
         * RecordConfig.
         */
        public Builder recordConfig(RecordConfig recordConfig) {
            this.recordConfig = recordConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SideOutputUrl.
         */
        public Builder sideOutputUrl(String sideOutputUrl) {
            this.sideOutputUrl = sideOutputUrl;
            return this;
        }

        /**
         * SideOutputUrlList.
         */
        public Builder sideOutputUrlList(String sideOutputUrlList) {
            this.sideOutputUrlList = sideOutputUrlList;
            return this;
        }

        /**
         * SyncGroupsConfig.
         */
        public Builder syncGroupsConfig(SyncGroupsConfig syncGroupsConfig) {
            this.syncGroupsConfig = syncGroupsConfig;
            return this;
        }

        /**
         * TranscodeConfig.
         */
        public Builder transcodeConfig(TranscodeConfig transcodeConfig) {
            this.transcodeConfig = transcodeConfig;
            return this;
        }

        /**
         * UrgentLiveStreamUrl.
         */
        public Builder urgentLiveStreamUrl(String urgentLiveStreamUrl) {
            this.urgentLiveStreamUrl = urgentLiveStreamUrl;
            return this;
        }

        /**
         * UrgentMaterialId.
         */
        public Builder urgentMaterialId(String urgentMaterialId) {
            this.urgentMaterialId = urgentMaterialId;
            return this;
        }

        public DescribeCasterConfigResponseBody build() {
            return new DescribeCasterConfigResponseBody(this);
        } 

    } 

    public static class RecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        private Integer cycleDuration;

        @NameInMap("Format")
        private String format;

        @NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @NameInMap("SliceOssObjectPrefix")
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

            /**
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
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
             * OssObjectPrefix.
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * SliceOssObjectPrefix.
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
    public static class RecordConfigRecordFormat extends TeaModel {
        @NameInMap("RecordFormat")
        private java.util.List < RecordFormat> recordFormat;

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
        public java.util.List < RecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

        public static final class Builder {
            private java.util.List < RecordFormat> recordFormat; 

            /**
             * RecordFormat.
             */
            public Builder recordFormat(java.util.List < RecordFormat> recordFormat) {
                this.recordFormat = recordFormat;
                return this;
            }

            public RecordConfigRecordFormat build() {
                return new RecordConfigRecordFormat(this);
            } 

        } 

    }
    public static class RecordConfig extends TeaModel {
        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("RecordFormat")
        private RecordConfigRecordFormat recordFormat;

        private RecordConfig(Builder builder) {
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
            private String ossBucket; 
            private String ossEndpoint; 
            private RecordConfigRecordFormat recordFormat; 

            /**
             * OssBucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * RecordFormat.
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
    public static class ResourceIds extends TeaModel {
        @NameInMap("ResourceId")
        private java.util.List < String > resourceId;

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
        public java.util.List < String > getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private java.util.List < String > resourceId; 

            /**
             * ResourceId.
             */
            public Builder resourceId(java.util.List < String > resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public ResourceIds build() {
                return new ResourceIds(this);
            } 

        } 

    }
    public static class SyncGroup extends TeaModel {
        @NameInMap("HostResourceId")
        private String hostResourceId;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("ResourceIds")
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

            /**
             * HostResourceId.
             */
            public Builder hostResourceId(String hostResourceId) {
                this.hostResourceId = hostResourceId;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * ResourceIds.
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
    public static class SyncGroupsConfig extends TeaModel {
        @NameInMap("SyncGroup")
        private java.util.List < SyncGroup> syncGroup;

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
        public java.util.List < SyncGroup> getSyncGroup() {
            return this.syncGroup;
        }

        public static final class Builder {
            private java.util.List < SyncGroup> syncGroup; 

            /**
             * SyncGroup.
             */
            public Builder syncGroup(java.util.List < SyncGroup> syncGroup) {
                this.syncGroup = syncGroup;
                return this;
            }

            public SyncGroupsConfig build() {
                return new SyncGroupsConfig(this);
            } 

        } 

    }
    public static class LiveTemplateIds extends TeaModel {
        @NameInMap("LocationId")
        private java.util.List < String > locationId;

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
        public java.util.List < String > getLocationId() {
            return this.locationId;
        }

        public static final class Builder {
            private java.util.List < String > locationId; 

            /**
             * LocationId.
             */
            public Builder locationId(java.util.List < String > locationId) {
                this.locationId = locationId;
                return this;
            }

            public LiveTemplateIds build() {
                return new LiveTemplateIds(this);
            } 

        } 

    }
    public static class TranscodeConfig extends TeaModel {
        @NameInMap("CasterTemplate")
        private String casterTemplate;

        @NameInMap("LiveTemplateIds")
        private LiveTemplateIds liveTemplateIds;

        private TranscodeConfig(Builder builder) {
            this.casterTemplate = builder.casterTemplate;
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
         * @return liveTemplateIds
         */
        public LiveTemplateIds getLiveTemplateIds() {
            return this.liveTemplateIds;
        }

        public static final class Builder {
            private String casterTemplate; 
            private LiveTemplateIds liveTemplateIds; 

            /**
             * CasterTemplate.
             */
            public Builder casterTemplate(String casterTemplate) {
                this.casterTemplate = casterTemplate;
                return this;
            }

            /**
             * LiveTemplateIds.
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
