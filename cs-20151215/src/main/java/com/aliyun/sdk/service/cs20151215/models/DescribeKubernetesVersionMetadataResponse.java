// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeKubernetesVersionMetadataResponse} extends {@link TeaModel}
 *
 * <p>DescribeKubernetesVersionMetadataResponse</p>
 */
public class DescribeKubernetesVersionMetadataResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<DescribeKubernetesVersionMetadataResponseBody> body;

    private DescribeKubernetesVersionMetadataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeKubernetesVersionMetadataResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<DescribeKubernetesVersionMetadataResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeKubernetesVersionMetadataResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<DescribeKubernetesVersionMetadataResponseBody> body);

        @Override
        DescribeKubernetesVersionMetadataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeKubernetesVersionMetadataResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<DescribeKubernetesVersionMetadataResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeKubernetesVersionMetadataResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<DescribeKubernetesVersionMetadataResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeKubernetesVersionMetadataResponse build() {
            return new DescribeKubernetesVersionMetadataResponse(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKubernetesVersionMetadataResponse} extends {@link TeaModel}
     *
     * <p>DescribeKubernetesVersionMetadataResponse</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("image_id")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("image_name")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("os_version")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("image_type")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("os_type")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("image_category")
        private String imageCategory;

        @com.aliyun.core.annotation.NameInMap("architecture")
        private String architecture;

        private Images(Builder builder) {
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.platform = builder.platform;
            this.osVersion = builder.osVersion;
            this.imageType = builder.imageType;
            this.osType = builder.osType;
            this.imageCategory = builder.imageCategory;
            this.architecture = builder.architecture;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return imageCategory
         */
        public String getImageCategory() {
            return this.imageCategory;
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        public static final class Builder {
            private String imageId; 
            private String imageName; 
            private String platform; 
            private String osVersion; 
            private String imageType; 
            private String osType; 
            private String imageCategory; 
            private String architecture; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.platform = model.platform;
                this.osVersion = model.osVersion;
                this.imageType = model.imageType;
                this.osType = model.osType;
                this.imageCategory = model.imageCategory;
                this.architecture = model.architecture;
            } 

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7_7_x64_20G_alibase_20200426.vhd</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS 7.7</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The OS platform. You can obtain the terminal ID by calling one of the following operations:</p>
             * <ul>
             * <li><code>AliyunLinux</code></li>
             * <li><code>CentOS</code></li>
             * <li><code>Windows</code></li>
             * <li><code>WindowsCore</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CentOS</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>7.7</p>
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * <p>The type of operating system distribution that you want to use. We recommend that you use this parameter to specify the node operating system. You can obtain the terminal ID by calling one of the following operations:</p>
             * <ul>
             * <li><code>CentOS</code></li>
             * <li><code>AliyunLinux</code></li>
             * <li><code>AliyunLinux Qboot</code></li>
             * <li><code>AliyunLinuxUEFI</code></li>
             * <li><code>AliyunLinux3</code></li>
             * <li><code>Windows</code></li>
             * <li><code>WindowsCore</code></li>
             * <li><code>AliyunLinux3Arm64</code></li>
             * <li><code>ContainerOS</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>centos_7_7_20</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The type of OS. Examples:</p>
             * <ul>
             * <li><code>Windows</code></li>
             * <li><code>Linux</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The type of image. Valid values:</p>
             * <ul>
             * <li><code>system</code>: public image</li>
             * <li><code>self</code>: custom image</li>
             * <li><code>others</code>: shared image from other Alibaba Cloud accounts</li>
             * <li><code>marketplace</code>: image from the marketplace</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
                return this;
            }

            /**
             * <p>The architecture of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKubernetesVersionMetadataResponse} extends {@link TeaModel}
     *
     * <p>DescribeKubernetesVersionMetadataResponse</p>
     */
    public static class DescribeKubernetesVersionMetadataResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capabilities")
        private java.util.Map<String, ?> capabilities;

        @com.aliyun.core.annotation.NameInMap("images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("meta_data")
        private java.util.Map<String, ?> metaData;

        @com.aliyun.core.annotation.NameInMap("runtimes")
        private java.util.List<Runtime> runtimes;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("release_date")
        private String releaseDate;

        @com.aliyun.core.annotation.NameInMap("expiration_date")
        private String expirationDate;

        @com.aliyun.core.annotation.NameInMap("creatable")
        private Boolean creatable;

        @com.aliyun.core.annotation.NameInMap("upgradable_versions")
        private java.util.List<String> upgradableVersions;

        private DescribeKubernetesVersionMetadataResponseBody(Builder builder) {
            this.capabilities = builder.capabilities;
            this.images = builder.images;
            this.metaData = builder.metaData;
            this.runtimes = builder.runtimes;
            this.version = builder.version;
            this.releaseDate = builder.releaseDate;
            this.expirationDate = builder.expirationDate;
            this.creatable = builder.creatable;
            this.upgradableVersions = builder.upgradableVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeKubernetesVersionMetadataResponseBody create() {
            return builder().build();
        }

        /**
         * @return capabilities
         */
        public java.util.Map<String, ?> getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return metaData
         */
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        /**
         * @return runtimes
         */
        public java.util.List<Runtime> getRuntimes() {
            return this.runtimes;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        /**
         * @return expirationDate
         */
        public String getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return creatable
         */
        public Boolean getCreatable() {
            return this.creatable;
        }

        /**
         * @return upgradableVersions
         */
        public java.util.List<String> getUpgradableVersions() {
            return this.upgradableVersions;
        }

        public static final class Builder {
            private java.util.Map<String, ?> capabilities; 
            private java.util.List<Images> images; 
            private java.util.Map<String, ?> metaData; 
            private java.util.List<Runtime> runtimes; 
            private String version; 
            private String releaseDate; 
            private String expirationDate; 
            private Boolean creatable; 
            private java.util.List<String> upgradableVersions; 

            private Builder() {
            } 

            private Builder(DescribeKubernetesVersionMetadataResponseBody model) {
                this.capabilities = model.capabilities;
                this.images = model.images;
                this.metaData = model.metaData;
                this.runtimes = model.runtimes;
                this.version = model.version;
                this.releaseDate = model.releaseDate;
                this.expirationDate = model.expirationDate;
                this.creatable = model.creatable;
                this.upgradableVersions = model.upgradableVersions;
            } 

            /**
             * <p>Features of the queried Kubernetes version.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;AnyAZ&quot;: true,
             *       &quot;ChargeType&quot;: &quot;PostPaid&quot;
             * }</p>
             */
            public Builder capabilities(java.util.Map<String, ?> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>The OS images that are returned.</p>
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The metadata of the Kubernetes version.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;KubernetesVersion&quot;: &quot;1.31.1-aliyun.1&quot;,
             *       &quot;SubClass&quot;: &quot;default&quot;,
             *       &quot;ServiceCIDR&quot;: &quot;&quot;
             * }</p>
             */
            public Builder metaData(java.util.Map<String, ?> metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>The container runtime configurations.</p>
             */
            public Builder runtimes(java.util.List<Runtime> runtimes) {
                this.runtimes = runtimes;
                return this;
            }

            /**
             * <p>The Kubernetes version supported by ACK. For more information, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1.16.9-aliyun.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The release date of the Kubernetes version.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-30T00:00:00Z</p>
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * <p>The expiration date of the Kubernetes version.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-30T00:00:00Z</p>
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * <p>Indicates whether you can create clusters that run the Kubernetes version.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder creatable(Boolean creatable) {
                this.creatable = creatable;
                return this;
            }

            /**
             * <p>The list of available Kubernetes versions for updates.</p>
             */
            public Builder upgradableVersions(java.util.List<String> upgradableVersions) {
                this.upgradableVersions = upgradableVersions;
                return this;
            }

            public DescribeKubernetesVersionMetadataResponseBody build() {
                return new DescribeKubernetesVersionMetadataResponseBody(this);
            } 

        } 

    }
}
