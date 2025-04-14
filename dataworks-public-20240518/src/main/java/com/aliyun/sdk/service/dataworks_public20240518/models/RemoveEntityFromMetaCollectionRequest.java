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
 * {@link RemoveEntityFromMetaCollectionRequest} extends {@link RequestModel}
 *
 * <p>RemoveEntityFromMetaCollectionRequest</p>
 */
public class RemoveEntityFromMetaCollectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaCollectionId")
    private String metaCollectionId;

    private RemoveEntityFromMetaCollectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.metaCollectionId = builder.metaCollectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveEntityFromMetaCollectionRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return metaCollectionId
     */
    public String getMetaCollectionId() {
        return this.metaCollectionId;
    }

    public static final class Builder extends Request.Builder<RemoveEntityFromMetaCollectionRequest, Builder> {
        private String regionId; 
        private String id; 
        private String metaCollectionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveEntityFromMetaCollectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.metaCollectionId = request.metaCollectionId;
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
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MetaCollectionId.
         */
        public Builder metaCollectionId(String metaCollectionId) {
            this.putQueryParameter("MetaCollectionId", metaCollectionId);
            this.metaCollectionId = metaCollectionId;
            return this;
        }

        @Override
        public RemoveEntityFromMetaCollectionRequest build() {
            return new RemoveEntityFromMetaCollectionRequest(this);
        } 

    } 

}
