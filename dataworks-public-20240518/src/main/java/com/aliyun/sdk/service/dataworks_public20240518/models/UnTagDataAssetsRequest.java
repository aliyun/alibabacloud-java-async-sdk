// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UnTagDataAssetsRequest} extends {@link RequestModel}
 *
 * <p>UnTagDataAssetsRequest</p>
 */
public class UnTagDataAssetsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataAssetIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> dataAssetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataAssetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataAssetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tags> tags;

    private UnTagDataAssetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataAssetIds = builder.dataAssetIds;
        this.dataAssetType = builder.dataAssetType;
        this.envType = builder.envType;
        this.projectId = builder.projectId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnTagDataAssetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dataAssetIds
     */
    public java.util.List<String> getDataAssetIds() {
        return this.dataAssetIds;
    }

    /**
     * @return dataAssetType
     */
    public String getDataAssetType() {
        return this.dataAssetType;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UnTagDataAssetsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> dataAssetIds; 
        private String dataAssetType; 
        private String envType; 
        private Long projectId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(UnTagDataAssetsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataAssetIds = request.dataAssetIds;
            this.dataAssetType = request.dataAssetType;
            this.envType = request.envType;
            this.projectId = request.projectId;
            this.tags = request.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dataAssetIds(java.util.List<String> dataAssetIds) {
            String dataAssetIdsShrink = shrink(dataAssetIds, "DataAssetIds", "json");
            this.putQueryParameter("DataAssetIds", dataAssetIdsShrink);
            this.dataAssetIds = dataAssetIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::DataWorks::Task</p>
         */
        public Builder dataAssetType(String dataAssetType) {
            this.putQueryParameter("DataAssetType", dataAssetType);
            this.dataAssetType = dataAssetType;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public UnTagDataAssetsRequest build() {
            return new UnTagDataAssetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UnTagDataAssetsRequest} extends {@link TeaModel}
     *
     * <p>UnTagDataAssetsRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
