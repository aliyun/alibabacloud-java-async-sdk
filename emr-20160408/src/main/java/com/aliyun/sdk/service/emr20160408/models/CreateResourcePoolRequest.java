// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourcePoolRequest} extends {@link RequestModel}
 *
 * <p>CreateResourcePoolRequest</p>
 */
public class CreateResourcePoolRequest extends Request {
    @Query
    @NameInMap("Active")
    @Validation(required = true)
    private Boolean active;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Config")
    private java.util.List < Config> config;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Note")
    private String note;

    @Query
    @NameInMap("PoolType")
    @Validation(required = true)
    private String poolType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("YarnSiteConfig")
    private String yarnSiteConfig;

    private CreateResourcePoolRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.clusterId = builder.clusterId;
        this.config = builder.config;
        this.name = builder.name;
        this.note = builder.note;
        this.poolType = builder.poolType;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.yarnSiteConfig = builder.yarnSiteConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourcePoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return config
     */
    public java.util.List < Config> getConfig() {
        return this.config;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return poolType
     */
    public String getPoolType() {
        return this.poolType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return yarnSiteConfig
     */
    public String getYarnSiteConfig() {
        return this.yarnSiteConfig;
    }

    public static final class Builder extends Request.Builder<CreateResourcePoolRequest, Builder> {
        private Boolean active; 
        private String clusterId; 
        private java.util.List < Config> config; 
        private String name; 
        private String note; 
        private String poolType; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String yarnSiteConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourcePoolRequest request) {
            super(request);
            this.active = request.active;
            this.clusterId = request.clusterId;
            this.config = request.config;
            this.name = request.name;
            this.note = request.note;
            this.poolType = request.poolType;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.yarnSiteConfig = request.yarnSiteConfig;
        } 

        /**
         * Active.
         */
        public Builder active(Boolean active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(java.util.List < Config> config) {
            this.putQueryParameter("Config", config);
            this.config = config;
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
         * Note.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * PoolType.
         */
        public Builder poolType(String poolType) {
            this.putQueryParameter("PoolType", poolType);
            this.poolType = poolType;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * YarnSiteConfig.
         */
        public Builder yarnSiteConfig(String yarnSiteConfig) {
            this.putQueryParameter("YarnSiteConfig", yarnSiteConfig);
            this.yarnSiteConfig = yarnSiteConfig;
            return this;
        }

        @Override
        public CreateResourcePoolRequest build() {
            return new CreateResourcePoolRequest(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        private String category;

        @NameInMap("ConfigKey")
        @Validation(required = true)
        private String configKey;

        @NameInMap("ConfigValue")
        @Validation(required = true)
        private String configValue;

        @NameInMap("Note")
        private String note;

        @NameInMap("TargetId")
        @Validation(required = true)
        private String targetId;

        @NameInMap("configType")
        @Validation(required = true)
        private String configType;

        private Config(Builder builder) {
            this.category = builder.category;
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
            this.note = builder.note;
            this.targetId = builder.targetId;
            this.configType = builder.configType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        public static final class Builder {
            private String category; 
            private String configKey; 
            private String configValue; 
            private String note; 
            private String targetId; 
            private String configType; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ConfigKey.
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * configType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
