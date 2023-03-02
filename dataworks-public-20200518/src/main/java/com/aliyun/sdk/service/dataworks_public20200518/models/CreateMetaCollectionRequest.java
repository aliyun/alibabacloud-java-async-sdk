// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetaCollectionRequest} extends {@link RequestModel}
 *
 * <p>CreateMetaCollectionRequest</p>
 */
public class CreateMetaCollectionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CollectionType")
    @Validation(required = true)
    private String collectionType;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParentQualifiedName")
    private String parentQualifiedName;

    private CreateMetaCollectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.collectionType = builder.collectionType;
        this.comment = builder.comment;
        this.name = builder.name;
        this.parentQualifiedName = builder.parentQualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetaCollectionRequest create() {
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
     * @return collectionType
     */
    public String getCollectionType() {
        return this.collectionType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentQualifiedName
     */
    public String getParentQualifiedName() {
        return this.parentQualifiedName;
    }

    public static final class Builder extends Request.Builder<CreateMetaCollectionRequest, Builder> {
        private String regionId; 
        private String collectionType; 
        private String comment; 
        private String name; 
        private String parentQualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetaCollectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.collectionType = request.collectionType;
            this.comment = request.comment;
            this.name = request.name;
            this.parentQualifiedName = request.parentQualifiedName;
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
         * The type of the collection.
         */
        public Builder collectionType(String collectionType) {
            this.putQueryParameter("CollectionType", collectionType);
            this.collectionType = collectionType;
            return this;
        }

        /**
         * The comment of the collection.
         * <p>
         * 
         * The comment must be 1 to 64 characters in length.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The name of the collection.
         * <p>
         * 
         * The name must be 1 to 32 characters in length.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The unique identifier of the parent collection.
         */
        public Builder parentQualifiedName(String parentQualifiedName) {
            this.putQueryParameter("ParentQualifiedName", parentQualifiedName);
            this.parentQualifiedName = parentQualifiedName;
            return this;
        }

        @Override
        public CreateMetaCollectionRequest build() {
            return new CreateMetaCollectionRequest(this);
        } 

    } 

}
