// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMetaCollectionEntityRequest} extends {@link RequestModel}
 *
 * <p>AddMetaCollectionEntityRequest</p>
 */
public class AddMetaCollectionEntityRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CollectionQualifiedName")
    @Validation(required = true)
    private String collectionQualifiedName;

    @Query
    @NameInMap("EntityQualifiedName")
    @Validation(required = true)
    private String entityQualifiedName;

    private AddMetaCollectionEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.collectionQualifiedName = builder.collectionQualifiedName;
        this.entityQualifiedName = builder.entityQualifiedName;
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

    public static final class Builder extends Request.Builder<AddMetaCollectionEntityRequest, Builder> {
        private String regionId; 
        private String collectionQualifiedName; 
        private String entityQualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(AddMetaCollectionEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.collectionQualifiedName = request.collectionQualifiedName;
            this.entityQualifiedName = request.entityQualifiedName;
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
         * CollectionQualifiedName.
         */
        public Builder collectionQualifiedName(String collectionQualifiedName) {
            this.putQueryParameter("CollectionQualifiedName", collectionQualifiedName);
            this.collectionQualifiedName = collectionQualifiedName;
            return this;
        }

        /**
         * EntityQualifiedName.
         */
        public Builder entityQualifiedName(String entityQualifiedName) {
            this.putQueryParameter("EntityQualifiedName", entityQualifiedName);
            this.entityQualifiedName = entityQualifiedName;
            return this;
        }

        @Override
        public AddMetaCollectionEntityRequest build() {
            return new AddMetaCollectionEntityRequest(this);
        } 

    } 

}
