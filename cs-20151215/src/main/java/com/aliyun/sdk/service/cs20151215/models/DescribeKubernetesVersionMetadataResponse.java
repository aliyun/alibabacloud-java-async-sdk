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

        private Images(Builder builder) {
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.platform = builder.platform;
            this.osVersion = builder.osVersion;
            this.imageType = builder.imageType;
            this.osType = builder.osType;
            this.imageCategory = builder.imageCategory;
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

        public static final class Builder {
            private String imageId; 
            private String imageName; 
            private String platform; 
            private String osVersion; 
            private String imageType; 
            private String osType; 
            private String imageCategory; 

            /**
             * 镜像ID。	
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * 镜像名称。	
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * 操作系统发行版。取值范围： CentOS,AliyunLinux,Windows,WindowsCore。
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * 镜像版本。
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * 镜像类型。	
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * 操作系统发行版本号。
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * 镜像分类
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
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

        @NameInMap("multi_az")
        private String multiAz;

        private DescribeKubernetesVersionMetadataResponseBody(Builder builder) {
            this.capabilities = builder.capabilities;
            this.images = builder.images;
            this.metaData = builder.metaData;
            this.runtimes = builder.runtimes;
            this.version = builder.version;
            this.multiAz = builder.multiAz;
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
         * @return multiAz
         */
        public String getMultiAz() {
            return this.multiAz;
        }

        public static final class Builder {
            private java.util.Map < String, ? > capabilities; 
            private java.util.List < Images> images; 
            private java.util.Map < String, ? > metaData; 
            private java.util.List < Runtime > runtimes; 
            private String version; 
            private String multiAz; 

            /**
             * Kubernetes版本特性。	
             */
            public Builder capabilities(java.util.Map < String, ? > capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * ECS系统镜像列表。	
             */
            public Builder images(java.util.List < Images> images) {
                this.images = images;
                return this;
            }

            /**
             * Kubernetes版本元数据信息。	
             */
            public Builder metaData(java.util.Map < String, ? > metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * 容器运行时详情。	
             */
            public Builder runtimes(java.util.List < Runtime > runtimes) {
                this.runtimes = runtimes;
                return this;
            }

            /**
             * Kubernetes版本。	
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * 是否为多可用区。
             */
            public Builder multiAz(String multiAz) {
                this.multiAz = multiAz;
                return this;
            }

            public DescribeKubernetesVersionMetadataResponseBody build() {
                return new DescribeKubernetesVersionMetadataResponseBody(this);
            } 

        } 

    }
}
