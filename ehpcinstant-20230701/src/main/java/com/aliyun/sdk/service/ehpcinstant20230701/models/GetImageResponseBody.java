// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetImageResponseBody model) {
            this.image = model.image;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the image.</p>
         */
        public Builder image(Image image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The task is successful.</li>
         * <li>false: The error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total amount of data in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetImageResponseBody build() {
            return new GetImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
    public static class AdditionalRegionsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AdditionalRegionsInfo(Builder builder) {
            this.imageId = builder.imageId;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalRegionsInfo create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String imageId; 
            private String regionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(AdditionalRegionsInfo model) {
                this.imageId = model.imageId;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AdditionalRegionsInfo build() {
                return new AdditionalRegionsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RegistryCredential model) {
                this.password = model.password;
                this.server = model.server;
                this.userName = model.userName;
            } 

            /**
             * <p>The password of the logon user.</p>
             * 
             * <strong>example:</strong>
             * <p>userpassword</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The registered address of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * <p>The username of the logon user.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
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
    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
    public static class ContainerImageSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("IsACREnterprise")
        private Boolean isACREnterprise;

        @com.aliyun.core.annotation.NameInMap("IsACRRegistry")
        private Boolean isACRRegistry;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RegistryCredential")
        private RegistryCredential registryCredential;

        @com.aliyun.core.annotation.NameInMap("RegistryCriId")
        private String registryCriId;

        @com.aliyun.core.annotation.NameInMap("RegistryUrl")
        private String registryUrl;

        private ContainerImageSpec(Builder builder) {
            this.architecture = builder.architecture;
            this.isACREnterprise = builder.isACREnterprise;
            this.isACRRegistry = builder.isACRRegistry;
            this.osTag = builder.osTag;
            this.platform = builder.platform;
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
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
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
            private String architecture; 
            private Boolean isACREnterprise; 
            private Boolean isACRRegistry; 
            private String osTag; 
            private String platform; 
            private RegistryCredential registryCredential; 
            private String registryCriId; 
            private String registryUrl; 

            private Builder() {
            } 

            private Builder(ContainerImageSpec model) {
                this.architecture = model.architecture;
                this.isACREnterprise = model.isACREnterprise;
                this.isACRRegistry = model.isACRRegistry;
                this.osTag = model.osTag;
                this.platform = model.platform;
                this.registryCredential = model.registryCredential;
                this.registryCriId = model.registryCriId;
                this.registryUrl = model.registryUrl;
            } 

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>Whether the instance is an Alibaba Cloud image repository Enterprise Edition.</p>
             * <ul>
             * <li>True</li>
             * <li>False</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isACREnterprise(Boolean isACREnterprise) {
                this.isACREnterprise = isACREnterprise;
                return this;
            }

            /**
             * <p>Whether it is an Alibaba Cloud image repository.</p>
             * <ul>
             * <li>True</li>
             * <li>False</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isACRRegistry(Boolean isACRRegistry) {
                this.isACRRegistry = isACRRegistry;
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

            /**
             * <p>The authentication of the private image repository.</p>
             */
            public Builder registryCredential(RegistryCredential registryCredential) {
                this.registryCredential = registryCredential;
                return this;
            }

            /**
             * <p>The ID of the Container Registry Enterprise Edition image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-xyz795ygf8k9****</p>
             */
            public Builder registryCriId(String registryCriId) {
                this.registryCriId = registryCriId;
                return this;
            }

            /**
             * <p>The endpoint of the container image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc_open/nginx:latest</p>
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
    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
    public static class DocumentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("DocumentId")
        private String documentId;

        @com.aliyun.core.annotation.NameInMap("EncodingMode")
        private String encodingMode;

        private DocumentInfo(Builder builder) {
            this.document = builder.document;
            this.documentId = builder.documentId;
            this.encodingMode = builder.encodingMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocumentInfo create() {
            return builder().build();
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return documentId
         */
        public String getDocumentId() {
            return this.documentId;
        }

        /**
         * @return encodingMode
         */
        public String getEncodingMode() {
            return this.encodingMode;
        }

        public static final class Builder {
            private String document; 
            private String documentId; 
            private String encodingMode; 

            private Builder() {
            } 

            private Builder(DocumentInfo model) {
                this.document = model.document;
                this.documentId = model.documentId;
                this.encodingMode = model.encodingMode;
            } 

            /**
             * Document.
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * DocumentId.
             */
            public Builder documentId(String documentId) {
                this.documentId = documentId;
                return this;
            }

            /**
             * EncodingMode.
             */
            public Builder encodingMode(String encodingMode) {
                this.encodingMode = encodingMode;
                return this;
            }

            public DocumentInfo build() {
                return new DocumentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VMImageSpec model) {
                this.architecture = model.architecture;
                this.imageId = model.imageId;
                this.osTag = model.osTag;
                this.platform = model.platform;
            } 

            /**
             * <p>The type of the architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-uf60twafjtaart******</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The ID of the specific OS version.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS  7.6 64 bit</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * <p>The type of the platform.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS</p>
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
    /**
     * 
     * {@link GetImageResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalRegionsInfo")
        private java.util.List<AdditionalRegionsInfo> additionalRegionsInfo;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ContainerImageSpec")
        private ContainerImageSpec containerImageSpec;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DocumentInfo")
        private DocumentInfo documentInfo;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VMImageSpec")
        private VMImageSpec VMImageSpec;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Image(Builder builder) {
            this.additionalRegionsInfo = builder.additionalRegionsInfo;
            this.appId = builder.appId;
            this.containerImageSpec = builder.containerImageSpec;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.documentInfo = builder.documentInfo;
            this.imageType = builder.imageType;
            this.name = builder.name;
            this.size = builder.size;
            this.status = builder.status;
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
         * @return additionalRegionsInfo
         */
        public java.util.List<AdditionalRegionsInfo> getAdditionalRegionsInfo() {
            return this.additionalRegionsInfo;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
         * @return documentInfo
         */
        public DocumentInfo getDocumentInfo() {
            return this.documentInfo;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private java.util.List<AdditionalRegionsInfo> additionalRegionsInfo; 
            private String appId; 
            private ContainerImageSpec containerImageSpec; 
            private String createTime; 
            private String description; 
            private DocumentInfo documentInfo; 
            private String imageType; 
            private String name; 
            private String size; 
            private String status; 
            private VMImageSpec VMImageSpec; 
            private String version; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.additionalRegionsInfo = model.additionalRegionsInfo;
                this.appId = model.appId;
                this.containerImageSpec = model.containerImageSpec;
                this.createTime = model.createTime;
                this.description = model.description;
                this.documentInfo = model.documentInfo;
                this.imageType = model.imageType;
                this.name = model.name;
                this.size = model.size;
                this.status = model.status;
                this.VMImageSpec = model.VMImageSpec;
                this.version = model.version;
            } 

            /**
             * AdditionalRegionsInfo.
             */
            public Builder additionalRegionsInfo(java.util.List<AdditionalRegionsInfo> additionalRegionsInfo) {
                this.additionalRegionsInfo = additionalRegionsInfo;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The configuration details of the container image.</p>
             */
            public Builder containerImageSpec(ContainerImageSpec containerImageSpec) {
                this.containerImageSpec = containerImageSpec;
                return this;
            }

            /**
             * <p>The time when the image was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-23T09:51:39Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DocumentInfo.
             */
            public Builder documentInfo(DocumentInfo documentInfo) {
                this.documentInfo = documentInfo;
                return this;
            }

            /**
             * <p>The type of the image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>VM</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>app-image</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the image. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40 GiB</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The configuration details of the virtual machine image.</p>
             */
            public Builder VMImageSpec(VMImageSpec VMImageSpec) {
                this.VMImageSpec = VMImageSpec;
                return this;
            }

            /**
             * <p>The version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0</p>
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
