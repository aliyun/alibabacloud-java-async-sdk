// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetaCollectionRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetaCollectionRequest</p>
 */
public class DeleteMetaCollectionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("QualifiedName")
    @Validation(required = true)
    private String qualifiedName;

    private DeleteMetaCollectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.qualifiedName = builder.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetaCollectionRequest create() {
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
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static final class Builder extends Request.Builder<DeleteMetaCollectionRequest, Builder> {
        private String regionId; 
        private String qualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetaCollectionRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.putQueryParameter("QualifiedName", qualifiedName);
            this.qualifiedName = qualifiedName;
            return this;
        }

        @Override
        public DeleteMetaCollectionRequest build() {
            return new DeleteMetaCollectionRequest(this);
        } 

    } 

}
