// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>CreateEnvironmentRequest</p>
 */
public class CreateEnvironmentRequest extends Request {
    @Header
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("annotations")
    private String annotations;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("expiredAt")
    private String expiredAt;

    @Body
    @NameInMap("location")
    private String location;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("platform")
    private Platform platform;

    @Body
    @NameInMap("platformList")
    private java.util.List < Platform > platformList;

    @Body
    @NameInMap("productVersionUID")
    private String productVersionUID;

    @Body
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    @Body
    @NameInMap("vendorConfig")
    private String vendorConfig;

    @Body
    @NameInMap("vendorType")
    private String vendorType;

    private CreateEnvironmentRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.annotations = builder.annotations;
        this.description = builder.description;
        this.expiredAt = builder.expiredAt;
        this.location = builder.location;
        this.name = builder.name;
        this.platform = builder.platform;
        this.platformList = builder.platformList;
        this.productVersionUID = builder.productVersionUID;
        this.type = builder.type;
        this.vendorConfig = builder.vendorConfig;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return annotations
     */
    public String getAnnotations() {
        return this.annotations;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expiredAt
     */
    public String getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return platform
     */
    public Platform getPlatform() {
        return this.platform;
    }

    /**
     * @return platformList
     */
    public java.util.List < Platform > getPlatformList() {
        return this.platformList;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vendorConfig
     */
    public String getVendorConfig() {
        return this.vendorConfig;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder extends Request.Builder<CreateEnvironmentRequest, Builder> {
        private String clientToken; 
        private String annotations; 
        private String description; 
        private String expiredAt; 
        private String location; 
        private String name; 
        private Platform platform; 
        private java.util.List < Platform > platformList; 
        private String productVersionUID; 
        private String type; 
        private String vendorConfig; 
        private String vendorType; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnvironmentRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.annotations = request.annotations;
            this.description = request.description;
            this.expiredAt = request.expiredAt;
            this.location = request.location;
            this.name = request.name;
            this.platform = request.platform;
            this.platformList = request.platformList;
            this.productVersionUID = request.productVersionUID;
            this.type = request.type;
            this.vendorConfig = request.vendorConfig;
            this.vendorType = request.vendorType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putHeaderParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * annotations.
         */
        public Builder annotations(String annotations) {
            this.putBodyParameter("annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * expiredAt.
         */
        public Builder expiredAt(String expiredAt) {
            this.putBodyParameter("expiredAt", expiredAt);
            this.expiredAt = expiredAt;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.putBodyParameter("location", location);
            this.location = location;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(Platform platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * platformList.
         */
        public Builder platformList(java.util.List < Platform > platformList) {
            this.putBodyParameter("platformList", platformList);
            this.platformList = platformList;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putBodyParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * vendorConfig.
         */
        public Builder vendorConfig(String vendorConfig) {
            this.putBodyParameter("vendorConfig", vendorConfig);
            this.vendorConfig = vendorConfig;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.putBodyParameter("vendorType", vendorType);
            this.vendorType = vendorType;
            return this;
        }

        @Override
        public CreateEnvironmentRequest build() {
            return new CreateEnvironmentRequest(this);
        } 

    } 

    public static class Platform extends TeaModel {
        @NameInMap("architecture")
        private String architecture;

        @NameInMap("os")
        private String os;

        private Platform(Builder builder) {
            this.architecture = builder.architecture;
            this.os = builder.os;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platform create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        public static final class Builder {
            private String architecture; 
            private String os; 

            /**
             * architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            public Platform build() {
                return new Platform(this);
            } 

        } 

    }
}
