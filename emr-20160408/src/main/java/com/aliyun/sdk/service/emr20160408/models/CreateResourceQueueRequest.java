// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceQueueRequest</p>
 */
public class CreateResourceQueueRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Config")
    private java.util.List < Config> config;

    @Query
    @NameInMap("Leaf")
    private Boolean leaf;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParentQueueId")
    private Long parentQueueId;

    @Query
    @NameInMap("QualifiedName")
    private String qualifiedName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourcePoolId")
    @Validation(required = true)
    private Long resourcePoolId;

    private CreateResourceQueueRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.config = builder.config;
        this.leaf = builder.leaf;
        this.name = builder.name;
        this.parentQueueId = builder.parentQueueId;
        this.qualifiedName = builder.qualifiedName;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolId = builder.resourcePoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return leaf
     */
    public Boolean getLeaf() {
        return this.leaf;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentQueueId
     */
    public Long getParentQueueId() {
        return this.parentQueueId;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
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
     * @return resourcePoolId
     */
    public Long getResourcePoolId() {
        return this.resourcePoolId;
    }

    public static final class Builder extends Request.Builder<CreateResourceQueueRequest, Builder> {
        private String clusterId; 
        private java.util.List < Config> config; 
        private Boolean leaf; 
        private String name; 
        private Long parentQueueId; 
        private String qualifiedName; 
        private String regionId; 
        private Long resourceOwnerId; 
        private Long resourcePoolId; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceQueueRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.config = request.config;
            this.leaf = request.leaf;
            this.name = request.name;
            this.parentQueueId = request.parentQueueId;
            this.qualifiedName = request.qualifiedName;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourcePoolId = request.resourcePoolId;
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
         * Leaf.
         */
        public Builder leaf(Boolean leaf) {
            this.putQueryParameter("Leaf", leaf);
            this.leaf = leaf;
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
         * ParentQueueId.
         */
        public Builder parentQueueId(Long parentQueueId) {
            this.putQueryParameter("ParentQueueId", parentQueueId);
            this.parentQueueId = parentQueueId;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.putQueryParameter("QualifiedName", qualifiedName);
            this.qualifiedName = qualifiedName;
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
         * ResourcePoolId.
         */
        public Builder resourcePoolId(Long resourcePoolId) {
            this.putQueryParameter("ResourcePoolId", resourcePoolId);
            this.resourcePoolId = resourcePoolId;
            return this;
        }

        @Override
        public CreateResourceQueueRequest build() {
            return new CreateResourceQueueRequest(this);
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

        private Config(Builder builder) {
            this.category = builder.category;
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
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
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private String category; 
            private String configKey; 
            private String configValue; 
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
