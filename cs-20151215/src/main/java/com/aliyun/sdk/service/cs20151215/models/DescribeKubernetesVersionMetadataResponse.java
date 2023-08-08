// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKubernetesVersionMetadataResponse} extends {@link TeaModel}
 *
 * <p>DescribeKubernetesVersionMetadataResponse</p>
 */
public class DescribeKubernetesVersionMetadataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribeKubernetesVersionMetadataResponseBody> body;

    private DescribeKubernetesVersionMetadataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public java.util.List < DescribeKubernetesVersionMetadataResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeKubernetesVersionMetadataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < DescribeKubernetesVersionMetadataResponseBody> body);

        @Override
        DescribeKubernetesVersionMetadataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeKubernetesVersionMetadataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < DescribeKubernetesVersionMetadataResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeKubernetesVersionMetadataResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < DescribeKubernetesVersionMetadataResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeKubernetesVersionMetadataResponse build() {
            return new DescribeKubernetesVersionMetadataResponse(this);
        } 

    } 

    public static class Images extends TeaModel {
        @NameInMap("image_id")
        private String imageId;

        @NameInMap("image_name")
        private String imageName;

        @NameInMap("platform")
        private String platform;

        @NameInMap("os_version")
        private String osVersion;

        @NameInMap("image_type")
        private String imageType;

        @NameInMap("os_type")
        private String osType;

        @NameInMap("image_category")
        private String imageCategory;

        @NameInMap("architecture")
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

            /**
             * image_id.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * image_name.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * os_version.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * image_type.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * os_type.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * image_category.
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
                return this;
            }

            /**
             * architecture.
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
    public static class DescribeKubernetesVersionMetadataResponseBody extends TeaModel {
        @NameInMap("capabilities")
        private java.util.Map < String, ? > capabilities;

        @NameInMap("images")
        private java.util.List < Images> images;

        @NameInMap("meta_data")
        private java.util.Map < String, ? > metaData;

        @NameInMap("runtimes")
        private java.util.List < Runtime > runtimes;

        @NameInMap("version")
        private String version;

        @NameInMap("release_date")
        private String releaseDate;

        @NameInMap("expiration_date")
        private String expirationDate;

        @NameInMap("creatable")
        private Boolean creatable;

        private DescribeKubernetesVersionMetadataResponseBody(Builder builder) {
            this.capabilities = builder.capabilities;
            this.images = builder.images;
            this.metaData = builder.metaData;
            this.runtimes = builder.runtimes;
            this.version = builder.version;
            this.releaseDate = builder.releaseDate;
            this.expirationDate = builder.expirationDate;
            this.creatable = builder.creatable;
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
        public java.util.Map < String, ? > getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return images
         */
        public java.util.List < Images> getImages() {
            return this.images;
        }

        /**
         * @return metaData
         */
        public java.util.Map < String, ? > getMetaData() {
            return this.metaData;
        }

        /**
         * @return runtimes
         */
        public java.util.List < Runtime > getRuntimes() {
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

        public static final class Builder {
            private java.util.Map < String, ? > capabilities; 
            private java.util.List < Images> images; 
            private java.util.Map < String, ? > metaData; 
            private java.util.List < Runtime > runtimes; 
            private String version; 
            private String releaseDate; 
            private String expirationDate; 
            private Boolean creatable; 

            /**
             * capabilities.
             */
            public Builder capabilities(java.util.Map < String, ? > capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * images.
             */
            public Builder images(java.util.List < Images> images) {
                this.images = images;
                return this;
            }

            /**
             * meta_data.
             */
            public Builder metaData(java.util.Map < String, ? > metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * runtimes.
             */
            public Builder runtimes(java.util.List < Runtime > runtimes) {
                this.runtimes = runtimes;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * release_date.
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * expiration_date.
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * creatable.
             */
            public Builder creatable(Boolean creatable) {
                this.creatable = creatable;
                return this;
            }

            public DescribeKubernetesVersionMetadataResponseBody build() {
                return new DescribeKubernetesVersionMetadataResponseBody(this);
            } 

        } 

    }
}
