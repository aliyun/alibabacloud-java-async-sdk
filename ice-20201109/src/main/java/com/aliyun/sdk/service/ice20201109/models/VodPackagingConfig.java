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
         * DrmProvider.
         */
        public Builder drmProvider(DrmProvider drmProvider) {
            this.drmProvider = drmProvider;
            return this;
        }

        /**
         * ManifestName.
         */
        public Builder manifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        /**
         * SegmentDuration.
         */
        public Builder segmentDuration(Long segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }

        /**
         * StreamSelection.
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
             * MaxVideoBitsPerSecond.
             */
            public Builder maxVideoBitsPerSecond(Long maxVideoBitsPerSecond) {
                this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
                return this;
            }

            /**
             * MinVideoBitsPerSecond.
             */
            public Builder minVideoBitsPerSecond(Long minVideoBitsPerSecond) {
                this.minVideoBitsPerSecond = minVideoBitsPerSecond;
                return this;
            }

            /**
             * StreamOrder.
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
