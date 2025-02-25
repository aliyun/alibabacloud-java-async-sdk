// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSchemaRequest} extends {@link RequestModel}
 *
 * <p>UpdateSchemaRequest</p>
 */
public class UpdateSchemaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryConfigs")
    private String categoryConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchemaId")
    private Long schemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    private UpdateSchemaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.categoryConfigs = builder.categoryConfigs;
        this.description = builder.description;
        this.schemaId = builder.schemaId;
        this.schemaName = builder.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSchemaRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return categoryConfigs
     */
    public String getCategoryConfigs() {
        return this.categoryConfigs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return schemaId
     */
    public Long getSchemaId() {
        return this.schemaId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    public static final class Builder extends Request.Builder<UpdateSchemaRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String categoryConfigs; 
        private String description; 
        private Long schemaId; 
        private String schemaName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSchemaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.categoryConfigs = request.categoryConfigs;
            this.description = request.description;
            this.schemaId = request.schemaId;
            this.schemaName = request.schemaName;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * CategoryConfigs.
         */
        public Builder categoryConfigs(String categoryConfigs) {
            this.putBodyParameter("CategoryConfigs", categoryConfigs);
            this.categoryConfigs = categoryConfigs;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * SchemaId.
         */
        public Builder schemaId(Long schemaId) {
            this.putBodyParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.putBodyParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        @Override
        public UpdateSchemaRequest build() {
            return new UpdateSchemaRequest(this);
        } 

    } 

}
