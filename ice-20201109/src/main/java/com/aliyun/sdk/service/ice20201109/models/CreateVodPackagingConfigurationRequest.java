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
 * {@link CreateVodPackagingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateVodPackagingConfigurationRequest</p>
 */
public class CreateVodPackagingConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigurationName")
    private String configurationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageConfig")
    private PackageConfig packageConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    private CreateVodPackagingConfigurationRequest(Builder builder) {
        super(builder);
        this.configurationName = builder.configurationName;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.packageConfig = builder.packageConfig;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVodPackagingConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configurationName
     */
    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return packageConfig
     */
    public PackageConfig getPackageConfig() {
        return this.packageConfig;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<CreateVodPackagingConfigurationRequest, Builder> {
        private String configurationName; 
        private String description; 
        private String groupName; 
        private PackageConfig packageConfig; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(CreateVodPackagingConfigurationRequest request) {
            super(request);
            this.configurationName = request.configurationName;
            this.description = request.description;
            this.groupName = request.groupName;
            this.packageConfig = request.packageConfig;
            this.protocol = request.protocol;
        } 

        /**
         * <p>The name of the packaging configuration. The name must be unique in an account and can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hls_3s</p>
         */
        public Builder configurationName(String configurationName) {
            this.putQueryParameter("ConfigurationName", configurationName);
            this.configurationName = configurationName;
            return this;
        }

        /**
         * <p>The description of the packaging configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS 3s vod packaging</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the packaging group. The name can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vod_hls</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The packaging configuration.</p>
         */
        public Builder packageConfig(PackageConfig packageConfig) {
            String packageConfigShrink = shrink(packageConfig, "PackageConfig", "json");
            this.putQueryParameter("PackageConfig", packageConfigShrink);
            this.packageConfig = packageConfig;
            return this;
        }

        /**
         * <p>The package type.</p>
         * <ul>
         * <li>HLS: packages content into TS segments for delivery over the HLS protocol.</li>
         * <li>HLS_CMAF: packages content into CMAF segments for delivery over the HLS protocol.</li>
         * <li>DASH: packages content for delivery over the DASH protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public CreateVodPackagingConfigurationRequest build() {
            return new CreateVodPackagingConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVodPackagingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateVodPackagingConfigurationRequest</p>
     */
    public static class DrmProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptionMethod")
        private String encryptionMethod;

        @com.aliyun.core.annotation.NameInMap("IV")
        private String iv;

        @com.aliyun.core.annotation.NameInMap("SystemIds")
        private java.util.List<String> systemIds;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private DrmProvider(Builder builder) {
            this.encryptionMethod = builder.encryptionMethod;
            this.iv = builder.iv;
            this.systemIds = builder.systemIds;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrmProvider create() {
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

            private Builder(DrmProvider model) {
                this.encryptionMethod = model.encryptionMethod;
                this.iv = model.iv;
                this.systemIds = model.systemIds;
                this.url = model.url;
            } 

            /**
             * <p>The encryption method. Valid values:</p>
             * <ul>
             * <li>AES_128: Advanced Encryption Standard (AES) with 128-bit key length.</li>
             * <li>SAMPLE_AES: an encryption method that encrypts individual media samples.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AES_128</p>
             */
            public Builder encryptionMethod(String encryptionMethod) {
                this.encryptionMethod = encryptionMethod;
                return this;
            }

            /**
             * <p>A 128-bit, 16-byte hex value represented by a 32-character string that is used with the key for encrypting data blocks. If you leave this parameter empty, MediaPackage creates a constant initialization vector (IV). If it is specified, the value is passed to the DRM service.</p>
             * 
             * <strong>example:</strong>
             * <p>00001111222233334444555566667777</p>
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            /**
             * <p>The ID of the DRM system. The maximum number of system IDs allowed is determined by the protocol type. Limits:</p>
             * <ul>
             * <li>DASH: 2</li>
             * <li>HLS: 1</li>
             * <li>HLS_CMAF: 2</li>
             * </ul>
             * <p>Apple FairPlay, Google Widevine, and Microsoft PlayReady are supported. Their system IDs are as follows:</p>
             * <ul>
             * <li>Apple FairPlay: 94ce86fb-07ff-4f43-adb8-93d2fa968ca2</li>
             * <li>Google Widevine: edef8ba9-79d6-4ace-a3c8-27dcd51d21e</li>
             * <li>Microsoft PlayReady: 9a04f079-9840-4286-ab92-e65be0885f95</li>
             * </ul>
             */
            public Builder systemIds(java.util.List<String> systemIds) {
                this.systemIds = systemIds;
                return this;
            }

            /**
             * <p>The URL of the DRM key provider.</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public DrmProvider build() {
                return new DrmProvider(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateVodPackagingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateVodPackagingConfigurationRequest</p>
     */
    public static class StreamSelection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxVideoBitsPerSecond")
        private Long maxVideoBitsPerSecond;

        @com.aliyun.core.annotation.NameInMap("MinVideoBitsPerSecond")
        private Long minVideoBitsPerSecond;

        @com.aliyun.core.annotation.NameInMap("StreamOrder")
        private String streamOrder;

        private StreamSelection(Builder builder) {
            this.maxVideoBitsPerSecond = builder.maxVideoBitsPerSecond;
            this.minVideoBitsPerSecond = builder.minVideoBitsPerSecond;
            this.streamOrder = builder.streamOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamSelection create() {
            return builder().build();
        }

        /**
         * @return maxVideoBitsPerSecond
         */
        public Long getMaxVideoBitsPerSecond() {
            return this.maxVideoBitsPerSecond;
        }

        /**
         * @return minVideoBitsPerSecond
         */
        public Long getMinVideoBitsPerSecond() {
            return this.minVideoBitsPerSecond;
        }

        /**
         * @return streamOrder
         */
        public String getStreamOrder() {
            return this.streamOrder;
        }

        public static final class Builder {
            private Long maxVideoBitsPerSecond; 
            private Long minVideoBitsPerSecond; 
            private String streamOrder; 

            private Builder() {
            } 

            private Builder(StreamSelection model) {
                this.maxVideoBitsPerSecond = model.maxVideoBitsPerSecond;
                this.minVideoBitsPerSecond = model.minVideoBitsPerSecond;
                this.streamOrder = model.streamOrder;
            } 

            /**
             * <p>The maximum bitrate of the video stream. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000000</p>
             */
            public Builder maxVideoBitsPerSecond(Long maxVideoBitsPerSecond) {
                this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
                return this;
            }

            /**
             * <p>The minimum bitrate of the video stream. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder minVideoBitsPerSecond(Long minVideoBitsPerSecond) {
                this.minVideoBitsPerSecond = minVideoBitsPerSecond;
                return this;
            }

            /**
             * <p>The order of manifest files in the master playlist. Valid values:</p>
             * <ul>
             * <li>ORIGINAL: sorts the manifest files in the same order as the source.</li>
             * <li>VIDEO_BITRATE_ASCENDING: sorts the manifest files in ascending order of bitrates, from lowest to highest.</li>
             * <li>VIDEO_BITRATE_DESCENDING: sorts the manifest files in descending order of bitrates, from highest to lowest.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ORIGINAL</p>
             */
            public Builder streamOrder(String streamOrder) {
                this.streamOrder = streamOrder;
                return this;
            }

            public StreamSelection build() {
                return new StreamSelection(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateVodPackagingConfigurationRequest} extends {@link TeaModel}
     *
     * <p>CreateVodPackagingConfigurationRequest</p>
     */
    public static class PackageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrmProvider")
        private DrmProvider drmProvider;

        @com.aliyun.core.annotation.NameInMap("ManifestName")
        private String manifestName;

        @com.aliyun.core.annotation.NameInMap("SegmentDuration")
        private Long segmentDuration;

        @com.aliyun.core.annotation.NameInMap("StreamSelection")
        private StreamSelection streamSelection;

        private PackageConfig(Builder builder) {
            this.drmProvider = builder.drmProvider;
            this.manifestName = builder.manifestName;
            this.segmentDuration = builder.segmentDuration;
            this.streamSelection = builder.streamSelection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageConfig create() {
            return builder().build();
        }

        /**
         * @return drmProvider
         */
        public DrmProvider getDrmProvider() {
            return this.drmProvider;
        }

        /**
         * @return manifestName
         */
        public String getManifestName() {
            return this.manifestName;
        }

        /**
         * @return segmentDuration
         */
        public Long getSegmentDuration() {
            return this.segmentDuration;
        }

        /**
         * @return streamSelection
         */
        public StreamSelection getStreamSelection() {
            return this.streamSelection;
        }

        public static final class Builder {
            private DrmProvider drmProvider; 
            private String manifestName; 
            private Long segmentDuration; 
            private StreamSelection streamSelection; 

            private Builder() {
            } 

            private Builder(PackageConfig model) {
                this.drmProvider = model.drmProvider;
                this.manifestName = model.manifestName;
                this.segmentDuration = model.segmentDuration;
                this.streamSelection = model.streamSelection;
            } 

            /**
             * <p>The settings of digital rights management (DRM) encryption.</p>
             */
            public Builder drmProvider(DrmProvider drmProvider) {
                this.drmProvider = drmProvider;
                return this;
            }

            /**
             * <p>The manifest name. The name can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>index</p>
             */
            public Builder manifestName(String manifestName) {
                this.manifestName = manifestName;
                return this;
            }

            /**
             * <p>The duration of each segment in a packaged stream. Unit: seconds. MediaPackage rounds segments to the nearest multiple of the input segment duration. Valid values: 1 to 30.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder segmentDuration(Long segmentDuration) {
                this.segmentDuration = segmentDuration;
                return this;
            }

            /**
             * <p>The settings of stream selection.</p>
             */
            public Builder streamSelection(StreamSelection streamSelection) {
                this.streamSelection = streamSelection;
                return this;
            }

            public PackageConfig build() {
                return new PackageConfig(this);
            } 

        } 

    }
}
