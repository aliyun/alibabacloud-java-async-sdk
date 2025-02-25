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
         * ConfigurationName.
         */
        public Builder configurationName(String configurationName) {
            this.putQueryParameter("ConfigurationName", configurationName);
            this.configurationName = configurationName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * PackageConfig.
         */
        public Builder packageConfig(PackageConfig packageConfig) {
            String packageConfigShrink = shrink(packageConfig, "PackageConfig", "json");
            this.putQueryParameter("PackageConfig", packageConfigShrink);
            this.packageConfig = packageConfig;
            return this;
        }

        /**
         * Protocol.
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

            public PackageConfig build() {
                return new PackageConfig(this);
            } 

        } 

    }
}
