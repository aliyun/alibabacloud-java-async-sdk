// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link LivePackagingConfig} extends {@link TeaModel}
 *
 * <p>LivePackagingConfig</p>
 */
public class LivePackagingConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DrmConfig")
    private DrmConfig drmConfig;

    @com.aliyun.core.annotation.NameInMap("LiveManifestConfigs")
    private java.util.List<LiveManifestConfig> liveManifestConfigs;

    @com.aliyun.core.annotation.NameInMap("SegmentDuration")
    private Integer segmentDuration;

    @com.aliyun.core.annotation.NameInMap("UseAudioRenditionGroups")
    private Boolean useAudioRenditionGroups;

    private LivePackagingConfig(Builder builder) {
        this.drmConfig = builder.drmConfig;
        this.liveManifestConfigs = builder.liveManifestConfigs;
        this.segmentDuration = builder.segmentDuration;
        this.useAudioRenditionGroups = builder.useAudioRenditionGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LivePackagingConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drmConfig
     */
    public DrmConfig getDrmConfig() {
        return this.drmConfig;
    }

    /**
     * @return liveManifestConfigs
     */
    public java.util.List<LiveManifestConfig> getLiveManifestConfigs() {
        return this.liveManifestConfigs;
    }

    /**
     * @return segmentDuration
     */
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

    /**
     * @return useAudioRenditionGroups
     */
    public Boolean getUseAudioRenditionGroups() {
        return this.useAudioRenditionGroups;
    }

    public static final class Builder {
        private DrmConfig drmConfig; 
        private java.util.List<LiveManifestConfig> liveManifestConfigs; 
        private Integer segmentDuration; 
        private Boolean useAudioRenditionGroups; 

        private Builder() {
        } 

        private Builder(LivePackagingConfig model) {
            this.drmConfig = model.drmConfig;
            this.liveManifestConfigs = model.liveManifestConfigs;
            this.segmentDuration = model.segmentDuration;
            this.useAudioRenditionGroups = model.useAudioRenditionGroups;
        } 

        /**
         * DrmConfig.
         */
        public Builder drmConfig(DrmConfig drmConfig) {
            this.drmConfig = drmConfig;
            return this;
        }

        /**
         * LiveManifestConfigs.
         */
        public Builder liveManifestConfigs(java.util.List<LiveManifestConfig> liveManifestConfigs) {
            this.liveManifestConfigs = liveManifestConfigs;
            return this;
        }

        /**
         * SegmentDuration.
         */
        public Builder segmentDuration(Integer segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }

        /**
         * UseAudioRenditionGroups.
         */
        public Builder useAudioRenditionGroups(Boolean useAudioRenditionGroups) {
            this.useAudioRenditionGroups = useAudioRenditionGroups;
            return this;
        }

        public LivePackagingConfig build() {
            return new LivePackagingConfig(this);
        } 

    } 

    /**
     * 
     * {@link LivePackagingConfig} extends {@link TeaModel}
     *
     * <p>LivePackagingConfig</p>
     */
    public static class DrmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentId")
        private String contentId;

        @com.aliyun.core.annotation.NameInMap("EncryptionMethod")
        private String encryptionMethod;

        @com.aliyun.core.annotation.NameInMap("IV")
        private String iv;

        @com.aliyun.core.annotation.NameInMap("RotatePeriod")
        private Integer rotatePeriod;

        @com.aliyun.core.annotation.NameInMap("SystemIds")
        private java.util.List<String> systemIds;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private DrmConfig(Builder builder) {
            this.contentId = builder.contentId;
            this.encryptionMethod = builder.encryptionMethod;
            this.iv = builder.iv;
            this.rotatePeriod = builder.rotatePeriod;
            this.systemIds = builder.systemIds;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrmConfig create() {
            return builder().build();
        }

        /**
         * @return contentId
         */
        public String getContentId() {
            return this.contentId;
        }

        /**
         * @return encryptionMethod
         */
        public String getEncryptionMethod() {
            return this.encryptionMethod;
        }

        /**
         * @return iv
         */
        public String getIv() {
            return this.iv;
        }

        /**
         * @return rotatePeriod
         */
        public Integer getRotatePeriod() {
            return this.rotatePeriod;
        }

        /**
         * @return systemIds
         */
        public java.util.List<String> getSystemIds() {
            return this.systemIds;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String contentId; 
            private String encryptionMethod; 
            private String iv; 
            private Integer rotatePeriod; 
            private java.util.List<String> systemIds; 
            private String url; 

            private Builder() {
            } 

            private Builder(DrmConfig model) {
                this.contentId = model.contentId;
                this.encryptionMethod = model.encryptionMethod;
                this.iv = model.iv;
                this.rotatePeriod = model.rotatePeriod;
                this.systemIds = model.systemIds;
                this.url = model.url;
            } 

            /**
             * ContentId.
             */
            public Builder contentId(String contentId) {
                this.contentId = contentId;
                return this;
            }

            /**
             * EncryptionMethod.
             */
            public Builder encryptionMethod(String encryptionMethod) {
                this.encryptionMethod = encryptionMethod;
                return this;
            }

            /**
             * IV.
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            /**
             * RotatePeriod.
             */
            public Builder rotatePeriod(Integer rotatePeriod) {
                this.rotatePeriod = rotatePeriod;
                return this;
            }

            /**
             * SystemIds.
             */
            public Builder systemIds(java.util.List<String> systemIds) {
                this.systemIds = systemIds;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public DrmConfig build() {
                return new DrmConfig(this);
            } 

        } 

    }
}
