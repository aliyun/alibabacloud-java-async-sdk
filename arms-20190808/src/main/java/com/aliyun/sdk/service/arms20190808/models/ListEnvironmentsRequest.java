// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentsRequest</p>
 */
public class ListEnvironmentsRequest extends Request {
    @Query
    @NameInMap("AddonName")
    private String addonName;

    @Query
    @NameInMap("BindResourceId")
    private String bindResourceId;

    @Query
    @NameInMap("EnvironmentType")
    private String environmentType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListEnvironmentsRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.bindResourceId = builder.bindResourceId;
        this.environmentType = builder.environmentType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return bindResourceId
     */
    public String getBindResourceId() {
        return this.bindResourceId;
    }

    /**
     * @return environmentType
     */
    public String getEnvironmentType() {
        return this.environmentType;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentsRequest, Builder> {
        private String addonName; 
        private String bindResourceId; 
        private String environmentType; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentsRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.bindResourceId = request.bindResourceId;
            this.environmentType = request.environmentType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * The add-on name. You must specify at least one of the AddonName and EnvironmentType parameters.
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("AddonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * 绑定的资源ID。
         */
        public Builder bindResourceId(String bindResourceId) {
            this.putQueryParameter("BindResourceId", bindResourceId);
            this.bindResourceId = bindResourceId;
            return this;
        }

        /**
         * The environment type. You must specify at least one of the AddonName and EnvironmentType parameters.
         * <p>
         * 
         * Valid values:
         * 
         * *   CS
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     Container Service for Kubernetes (ACK)
         * 
         *     <!-- -->
         * 
         * *   ECS
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     Elastic Compute Service (ECS)
         * 
         *     <!-- -->
         * 
         * *   Cloud
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     cloud service
         * 
         *     <!-- -->
         */
        public Builder environmentType(String environmentType) {
            this.putQueryParameter("EnvironmentType", environmentType);
            this.environmentType = environmentType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        @Override
        public ListEnvironmentsRequest build() {
            return new ListEnvironmentsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
