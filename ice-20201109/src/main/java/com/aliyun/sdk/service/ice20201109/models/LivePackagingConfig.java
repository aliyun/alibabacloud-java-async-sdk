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
        @com.aliyun.core.annotation.NameInMap("EncryptionMethod")
        private String encryptionMethod;

        @com.aliyun.core.annotation.NameInMap("IV")
        private String iv;

        @com.aliyun.core.annotation.NameInMap("SystemIds")
        private java.util.List<String> systemIds;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private DrmConfig(Builder builder) {
            this.encryptionMethod = builder.encryptionMethod;
            this.iv = builder.iv;
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
            private String encryptionMethod; 
            private String iv; 
            private java.util.List<String> systemIds; 
            private String url; 

            private Builder() {
            } 

            private Builder(DrmConfig model) {
                this.encryptionMethod = model.encryptionMethod;
                this.iv = model.iv;
                this.systemIds = model.systemIds;
                this.url = model.url;
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
