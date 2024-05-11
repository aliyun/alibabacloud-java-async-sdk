// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageResponseBody</p>
 */
public class GetImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private Image image;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetImageResponseBody(Builder builder) {
        this.image = builder.image;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Image image; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Image.
         */
        public Builder image(Image image) {
            this.image = image;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetImageResponseBody build() {
            return new GetImageResponseBody(this);
        } 

    } 

    public static class RegistryCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private RegistryCredential(Builder builder) {
            this.password = builder.password;
            this.server = builder.server;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistryCredential create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String password; 
            private String server; 
            private String userName; 

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public RegistryCredential build() {
                return new RegistryCredential(this);
            } 

        } 

    }
    public static class ContainerImageSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsACREnterprise")
        private Boolean isACREnterprise;

        @com.aliyun.core.annotation.NameInMap("IsACRRegistry")
        private Boolean isACRRegistry;

        @com.aliyun.core.annotation.NameInMap("RegistryCredential")
        private RegistryCredential registryCredential;

        @com.aliyun.core.annotation.NameInMap("RegistryCriId")
        private String registryCriId;

        @com.aliyun.core.annotation.NameInMap("RegistryUrl")
        private String registryUrl;

        private ContainerImageSpec(Builder builder) {
            this.isACREnterprise = builder.isACREnterprise;
            this.isACRRegistry = builder.isACRRegistry;
            this.registryCredential = builder.registryCredential;
            this.registryCriId = builder.registryCriId;
            this.registryUrl = builder.registryUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerImageSpec create() {
            return builder().build();
        }

        /**
         * @return isACREnterprise
         */
        public Boolean getIsACREnterprise() {
            return this.isACREnterprise;
        }

        /**
         * @return isACRRegistry
         */
        public Boolean getIsACRRegistry() {
            return this.isACRRegistry;
        }

        /**
         * @return registryCredential
         */
        public RegistryCredential getRegistryCredential() {
            return this.registryCredential;
        }

        /**
         * @return registryCriId
         */
        public String getRegistryCriId() {
            return this.registryCriId;
        }

        /**
         * @return registryUrl
         */
        public String getRegistryUrl() {
            return this.registryUrl;
        }

        public static final class Builder {
            private Boolean isACREnterprise; 
            private Boolean isACRRegistry; 
            private RegistryCredential registryCredential; 
            private String registryCriId; 
            private String registryUrl; 

            /**
             * IsACREnterprise.
             */
            public Builder isACREnterprise(Boolean isACREnterprise) {
                this.isACREnterprise = isACREnterprise;
                return this;
            }

            /**
             * IsACRRegistry.
             */
            public Builder isACRRegistry(Boolean isACRRegistry) {
                this.isACRRegistry = isACRRegistry;
                return this;
            }

            /**
             * RegistryCredential.
             */
            public Builder registryCredential(RegistryCredential registryCredential) {
                this.registryCredential = registryCredential;
                return this;
            }

            /**
             * RegistryCriId.
             */
            public Builder registryCriId(String registryCriId) {
                this.registryCriId = registryCriId;
                return this;
            }

            /**
             * RegistryUrl.
             */
            public Builder registryUrl(String registryUrl) {
                this.registryUrl = registryUrl;
                return this;
            }

            public ContainerImageSpec build() {
                return new ContainerImageSpec(this);
            } 

        } 

    }
    public static class VMImageSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        private VMImageSpec(Builder builder) {
            this.architecture = builder.architecture;
            this.imageId = builder.imageId;
            this.osTag = builder.osTag;
            this.platform = builder.platform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VMImageSpec create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        public static final class Builder {
            private String architecture; 
            private String imageId; 
            private String osTag; 
            private String platform; 

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * OsTag.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            public VMImageSpec build() {
                return new VMImageSpec(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerImageSpec")
        private ContainerImageSpec containerImageSpec;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("VMImageSpec")
        private VMImageSpec VMImageSpec;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Image(Builder builder) {
            this.containerImageSpec = builder.containerImageSpec;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.imageType = builder.imageType;
            this.name = builder.name;
            this.size = builder.size;
            this.VMImageSpec = builder.VMImageSpec;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return containerImageSpec
         */
        public ContainerImageSpec getContainerImageSpec() {
            return this.containerImageSpec;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return VMImageSpec
         */
        public VMImageSpec getVMImageSpec() {
            return this.VMImageSpec;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private ContainerImageSpec containerImageSpec; 
            private String createTime; 
            private String description; 
            private String imageType; 
            private String name; 
            private String size; 
            private VMImageSpec VMImageSpec; 
            private String version; 

            /**
             * ContainerImageSpec.
             */
            public Builder containerImageSpec(ContainerImageSpec containerImageSpec) {
                this.containerImageSpec = containerImageSpec;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ImageType.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * VMImageSpec.
             */
            public Builder VMImageSpec(VMImageSpec VMImageSpec) {
                this.VMImageSpec = VMImageSpec;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
}
