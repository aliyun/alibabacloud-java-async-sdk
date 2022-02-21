// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourcePoolRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourcePoolRequest</p>
 */
public class ModifyResourcePoolRequest extends Request {
    @Query
    @NameInMap("Active")
    private Boolean active;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Config")
    private java.util.List < Config> config;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Yarnsiteconfig")
    private String yarnsiteconfig;

    private ModifyResourcePoolRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.clusterId = builder.clusterId;
        this.config = builder.config;
        this.id = builder.id;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.yarnsiteconfig = builder.yarnsiteconfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourcePoolRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return yarnsiteconfig
     */
    public String getYarnsiteconfig() {
        return this.yarnsiteconfig;
    }

    public static final class Builder extends Request.Builder<ModifyResourcePoolRequest, Builder> {
        private Boolean active; 
        private String clusterId; 
        private java.util.List < Config> config; 
        private String id; 
        private String name; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String yarnsiteconfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourcePoolRequest response) {
            super(response);
            this.active = response.active;
            this.clusterId = response.clusterId;
            this.config = response.config;
            this.id = response.id;
            this.name = response.name;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.yarnsiteconfig = response.yarnsiteconfig;
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
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * Yarnsiteconfig.
         */
        public Builder yarnsiteconfig(String yarnsiteconfig) {
            this.putQueryParameter("Yarnsiteconfig", yarnsiteconfig);
            this.yarnsiteconfig = yarnsiteconfig;
            return this;
        }

        @Override
        public ModifyResourcePoolRequest build() {
            return new ModifyResourcePoolRequest(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("ConfigKey")
        private String configKey;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Id")
        private String id;

        @NameInMap("Note")
        private String note;

        private Config(Builder builder) {
            this.category = builder.category;
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
            this.id = builder.id;
            this.note = builder.note;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private String category; 
            private String configKey; 
            private String configValue; 
            private String id; 
            private String note; 

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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
