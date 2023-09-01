// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEaiEcsRequest} extends {@link RequestModel}
 *
 * <p>CreateEaiEcsRequest</p>
 */
public class CreateEaiEcsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EaisName")
    private String eaisName;

    @Query
    @NameInMap("EaisType")
    @Validation(required = true)
    private String eaisType;

    @Query
    @NameInMap("Ecs")
    private Ecs ecs;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    private CreateEaiEcsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.eaisName = builder.eaisName;
        this.eaisType = builder.eaisType;
        this.ecs = builder.ecs;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEaiEcsRequest create() {
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
     * @return ecs
     */
    public Ecs getEcs() {
        return this.ecs;
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

    public static final class Builder extends Request.Builder<CreateEaiEcsRequest, Builder> {
        private String clientToken; 
        private String eaisName; 
        private String eaisType; 
        private Ecs ecs; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEaiEcsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.eaisName = request.eaisName;
            this.eaisType = request.eaisType;
            this.ecs = request.ecs;
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
         * EaisType.
         */
        public Builder eaisType(String eaisType) {
            this.putQueryParameter("EaisType", eaisType);
            this.eaisType = eaisType;
            return this;
        }

        /**
         * Ecs.
         */
        public Builder ecs(Ecs ecs) {
            String ecsShrink = shrink(ecs, "Ecs", "json");
            this.putQueryParameter("Ecs", ecsShrink);
            this.ecs = ecs;
            return this;
        }

        /**
         * RegionId.
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
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateEaiEcsRequest build() {
            return new CreateEaiEcsRequest(this);
        } 

    } 

    public static class Ecs extends TeaModel {
        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InternetMaxBandwidthIn")
        private String internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        private String internetMaxBandwidthOut;

        @NameInMap("Name")
        private String name;

        @NameInMap("Password")
        private String password;

        @NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        private Long systemDiskSize;

        @NameInMap("Type")
        private String type;

        @NameInMap("ZoneId")
        private String zoneId;

        private Ecs(Builder builder) {
            this.imageId = builder.imageId;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.name = builder.name;
            this.password = builder.password;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ecs create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public String getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public String getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String imageId; 
            private String internetMaxBandwidthIn; 
            private String internetMaxBandwidthOut; 
            private String name; 
            private String password; 
            private String systemDiskCategory; 
            private Long systemDiskSize; 
            private String type; 
            private String zoneId; 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InternetMaxBandwidthIn.
             */
            public Builder internetMaxBandwidthIn(String internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * InternetMaxBandwidthOut.
             */
            public Builder internetMaxBandwidthOut(String internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
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
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Ecs build() {
                return new Ecs(this);
            } 

        } 

    }
}
