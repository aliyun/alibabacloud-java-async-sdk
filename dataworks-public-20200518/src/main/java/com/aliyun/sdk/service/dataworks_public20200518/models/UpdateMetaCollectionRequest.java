// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaCollectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaCollectionRequest</p>
 */
public class UpdateMetaCollectionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("QualifiedName")
    @Validation(required = true)
    private String qualifiedName;

    private UpdateMetaCollectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.name = builder.name;
        this.qualifiedName = builder.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaCollectionRequest create() {
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
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static final class Builder extends Request.Builder<UpdateMetaCollectionRequest, Builder> {
        private String regionId; 
        private String comment; 
        private String name; 
        private String qualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaCollectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.name = request.name;
            this.qualifiedName = request.qualifiedName;
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
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
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
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.putQueryParameter("QualifiedName", qualifiedName);
            this.qualifiedName = qualifiedName;
            return this;
        }

        @Override
        public UpdateMetaCollectionRequest build() {
            return new UpdateMetaCollectionRequest(this);
        } 

    } 

}
