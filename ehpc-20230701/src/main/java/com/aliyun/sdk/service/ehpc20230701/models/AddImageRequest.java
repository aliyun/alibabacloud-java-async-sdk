// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddImageRequest} extends {@link RequestModel}
 *
 * <p>AddImageRequest</p>
 */
public class AddImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerImageSpec")
    private ContainerImageSpec containerImageSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageVersion")
    private String imageVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VMImageSpec")
    private VMImageSpec VMImageSpec;

    private AddImageRequest(Builder builder) {
        super(builder);
        this.containerImageSpec = builder.containerImageSpec;
        this.description = builder.description;
        this.imageVersion = builder.imageVersion;
        this.name = builder.name;
        this.VMImageSpec = builder.VMImageSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerImageSpec
     */
    public ContainerImageSpec getContainerImageSpec() {
        return this.containerImageSpec;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageVersion
     */
    public String getImageVersion() {
        return this.imageVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return VMImageSpec
     */
    public VMImageSpec getVMImageSpec() {
        return this.VMImageSpec;
    }

    public static final class Builder extends Request.Builder<AddImageRequest, Builder> {
        private ContainerImageSpec containerImageSpec; 
        private String description; 
        private String imageVersion; 
        private String name; 
        private VMImageSpec VMImageSpec; 

        private Builder() {
            super();
        } 

        private Builder(AddImageRequest request) {
            super(request);
            this.containerImageSpec = request.containerImageSpec;
            this.description = request.description;
            this.imageVersion = request.imageVersion;
            this.name = request.name;
            this.VMImageSpec = request.VMImageSpec;
        } 

        /**
         * ContainerImageSpec.
         */
        public Builder containerImageSpec(ContainerImageSpec containerImageSpec) {
            String containerImageSpecShrink = shrink(containerImageSpec, "ContainerImageSpec", "json");
            this.putQueryParameter("ContainerImageSpec", containerImageSpecShrink);
            this.containerImageSpec = containerImageSpec;
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
         * ImageVersion.
         */
        public Builder imageVersion(String imageVersion) {
            this.putQueryParameter("ImageVersion", imageVersion);
            this.imageVersion = imageVersion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * VMImageSpec.
         */
        public Builder VMImageSpec(VMImageSpec VMImageSpec) {
            String VMImageSpecShrink = shrink(VMImageSpec, "VMImageSpec", "json");
            this.putQueryParameter("VMImageSpec", VMImageSpecShrink);
            this.VMImageSpec = VMImageSpec;
            return this;
        }

        @Override
        public AddImageRequest build() {
            return new AddImageRequest(this);
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
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        private VMImageSpec(Builder builder) {
            this.imageId = builder.imageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VMImageSpec create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        public static final class Builder {
            private String imageId; 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            public VMImageSpec build() {
                return new VMImageSpec(this);
            } 

        } 

    }
}
