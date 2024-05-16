// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMetaCollectionEntityRequest} extends {@link RequestModel}
 *
 * <p>AddMetaCollectionEntityRequest</p>
 */
public class AddMetaCollectionEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CollectionQualifiedName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collectionQualifiedName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityQualifiedName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityQualifiedName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(maxLength = 50)
    private String remark;

    private AddMetaCollectionEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.collectionQualifiedName = builder.collectionQualifiedName;
        this.entityQualifiedName = builder.entityQualifiedName;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMetaCollectionEntityRequest create() {
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
     * @return collectionQualifiedName
     */
    public String getCollectionQualifiedName() {
        return this.collectionQualifiedName;
    }

    /**
     * @return entityQualifiedName
     */
    public String getEntityQualifiedName() {
        return this.entityQualifiedName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<AddMetaCollectionEntityRequest, Builder> {
        private String regionId; 
        private String collectionQualifiedName; 
        private String entityQualifiedName; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(AddMetaCollectionEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.collectionQualifiedName = request.collectionQualifiedName;
            this.entityQualifiedName = request.entityQualifiedName;
            this.remark = request.remark;
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
         * The unique identifier of the entity.
         * <p>
         * 
         * Example: maxcompute-table.projectA.tableA.
         */
        public Builder collectionQualifiedName(String collectionQualifiedName) {
            this.putQueryParameter("CollectionQualifiedName", collectionQualifiedName);
            this.collectionQualifiedName = collectionQualifiedName;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder entityQualifiedName(String entityQualifiedName) {
            this.putQueryParameter("EntityQualifiedName", entityQualifiedName);
            this.entityQualifiedName = entityQualifiedName;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public AddMetaCollectionEntityRequest build() {
            return new AddMetaCollectionEntityRequest(this);
        } 

    } 

}
