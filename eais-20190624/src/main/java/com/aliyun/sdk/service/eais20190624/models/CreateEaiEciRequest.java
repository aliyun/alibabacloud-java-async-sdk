// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEaiEciRequest} extends {@link RequestModel}
 *
 * <p>CreateEaiEciRequest</p>
 */
public class CreateEaiEciRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EaisName")
    private String eaisName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EaisType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eaisType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Eci")
    private Eci eci;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    private CreateEaiEciRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.eaisName = builder.eaisName;
        this.eaisType = builder.eaisType;
        this.eci = builder.eci;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEaiEciRequest create() {
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
     * @return eaisName
     */
    public String getEaisName() {
        return this.eaisName;
    }

    /**
     * @return eaisType
     */
    public String getEaisType() {
        return this.eaisType;
    }

    /**
     * @return eci
     */
    public Eci getEci() {
        return this.eci;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateEaiEciRequest, Builder> {
        private String clientToken; 
        private String eaisName; 
        private String eaisType; 
        private Eci eci; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEaiEciRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.eaisName = request.eaisName;
            this.eaisType = request.eaisType;
            this.eci = request.eci;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EaisName.
         */
        public Builder eaisName(String eaisName) {
            this.putQueryParameter("EaisName", eaisName);
            this.eaisName = eaisName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eais.ei-a6.2xlarge</p>
         */
        public Builder eaisType(String eaisType) {
            this.putQueryParameter("EaisType", eaisType);
            this.eaisType = eaisType;
            return this;
        }

        /**
         * Eci.
         */
        public Builder eci(Eci eci) {
            String eciShrink = shrink(eci, "Eci", "json");
            this.putQueryParameter("Eci", eciShrink);
            this.eci = eci;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf66jeqopgqa9hdn****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6h3rbwbm90urjwa****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateEaiEciRequest build() {
            return new CreateEaiEciRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEaiEciRequest} extends {@link TeaModel}
     *
     * <p>CreateEaiEciRequest</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arg")
        private String arg;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Volumes")
        private String volumes;

        private Container(Builder builder) {
            this.arg = builder.arg;
            this.command = builder.command;
            this.image = builder.image;
            this.name = builder.name;
            this.volumes = builder.volumes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return arg
         */
        public String getArg() {
            return this.arg;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return volumes
         */
        public String getVolumes() {
            return this.volumes;
        }

        public static final class Builder {
            private String arg; 
            private String command; 
            private String image; 
            private String name; 
            private String volumes; 

            /**
             * Arg.
             */
            public Builder arg(String arg) {
                this.arg = arg;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
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
             * Volumes.
             */
            public Builder volumes(String volumes) {
                this.volumes = volumes;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEaiEciRequest} extends {@link TeaModel}
     *
     * <p>CreateEaiEciRequest</p>
     */
    public static class Eci extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("EipId")
        private String eipId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private String volume;

        private Eci(Builder builder) {
            this.container = builder.container;
            this.eipId = builder.eipId;
            this.name = builder.name;
            this.type = builder.type;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Eci create() {
            return builder().build();
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return eipId
         */
        public String getEipId() {
            return this.eipId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return volume
         */
        public String getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Container container; 
            private String eipId; 
            private String name; 
            private String type; 
            private String volume; 

            /**
             * Container.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * EipId.
             */
            public Builder eipId(String eipId) {
                this.eipId = eipId;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(String volume) {
                this.volume = volume;
                return this;
            }

            public Eci build() {
                return new Eci(this);
            } 

        } 

    }
}
