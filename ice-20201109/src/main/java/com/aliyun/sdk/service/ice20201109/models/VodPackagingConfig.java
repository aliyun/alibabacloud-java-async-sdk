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
 * {@link VodPackagingConfig} extends {@link TeaModel}
 *
 * <p>VodPackagingConfig</p>
 */
public class VodPackagingConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DrmProvider")
    private DrmProvider drmProvider;

    @com.aliyun.core.annotation.NameInMap("ManifestName")
    private String manifestName;

    @com.aliyun.core.annotation.NameInMap("SegmentDuration")
    private Long segmentDuration;

    @com.aliyun.core.annotation.NameInMap("StreamSelection")
    private StreamSelection streamSelection;

    private VodPackagingConfig(Builder builder) {
        this.drmProvider = builder.drmProvider;
        this.manifestName = builder.manifestName;
        this.segmentDuration = builder.segmentDuration;
        this.streamSelection = builder.streamSelection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VodPackagingConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder(VodPackagingConfig model) {
            this.drmProvider = model.drmProvider;
            this.manifestName = model.manifestName;
            this.segmentDuration = model.segmentDuration;
            this.streamSelection = model.streamSelection;
        } 

        /**
         * <p>The DRM encryption provider configuration.</p>
         */
        public Builder drmProvider(DrmProvider drmProvider) {
            this.drmProvider = drmProvider;
            return this;
        }

        /**
         * <p>The manifest name. The value must match the regular expression [A-Za-z0-9_]+ and cannot exceed 128 characters in length.</p>
         */
        public Builder manifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        /**
         * <p>The duration of each segment in seconds. The actual segment duration is rounded to the nearest multiple of the source segment duration. Valid values: 1 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder segmentDuration(Long segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }

        /**
         * <p>The stream selection configuration for packaging output.</p>
         */
        public Builder streamSelection(StreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public VodPackagingConfig build() {
            return new VodPackagingConfig(this);
        } 

    } 

    /**
     * 
     * {@link VodPackagingConfig} extends {@link TeaModel}
     *
     * <p>VodPackagingConfig</p>
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
             * <p>The encryption algorithm. Valid values:</p>
             * <ul>
             * <li>AES_128</li>
             * <li>SAMPLE_AES</li>
             * </ul>
             */
            public Builder encryptionMethod(String encryptionMethod) {
                this.encryptionMethod = encryptionMethod;
                return this;
            }

            /**
             * <p>The optional 128-bit (16-byte) hexadecimal value represented by a 32-character string, which is used with the key for encrypted data blocks. If you do not specify this value, MediaPackage creates a constant initialization vector (IV). Default value: empty. If specified, the value is passed through to the provider as a constant initialization vector.</p>
             * 
             * <strong>example:</strong>
             * <p>0123456789abcdef0123456789abcdef</p>
             */
            public Builder iv(String iv) {
                this.iv = iv;
                return this;
            }

            /**
             * <p>The DRM system IDs. The number of system IDs depends on the protocol type used:</p>
             * <ul>
             * <li>DASH: up to two</li>
             * <li>HLS: one</li>
             * <li>HLS_CMAF: up to two
             * Only the following three DRM systems are supported: Apple FairPlay, Google Widevine, and Microsoft PlayReady. The corresponding system IDs are:
             * Apple FairPlay:
             * 94ce86fb-07ff-4f43-adb8-93d2fa968ca2
             * Google Widevine:
             * edef8ba9-79d6-4ace-a3c8-27dcd51d21ed
             * Microsoft PlayReady:
             * 9a04f079-9840-4286-ab92-e65be0885f95.</li>
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
     * {@link VodPackagingConfig} extends {@link TeaModel}
     *
     * <p>VodPackagingConfig</p>
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
             * <p>The maximum video stream bitrate in bps.</p>
             */
            public Builder maxVideoBitsPerSecond(Long maxVideoBitsPerSecond) {
                this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
                return this;
            }

            /**
             * <p>The minimum video stream bitrate in bps.</p>
             */
            public Builder minVideoBitsPerSecond(Long minVideoBitsPerSecond) {
                this.minVideoBitsPerSecond = minVideoBitsPerSecond;
                return this;
            }

            /**
             * <p>The stream sorting rule. Valid values:</p>
             * <ul>
             * <li>ORIGINAL: Keeps the input sequence number.</li>
             * <li>VIDEO_BITRATE_ASCENDING: Sorts streams by video bitrate in ascending order.</li>
             * <li>VIDEO_BITRATE_DESCENDING: Sorts streams by video bitrate in descending order.</li>
             * </ul>
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
}
