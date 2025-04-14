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
 * {@link AddEntityIntoMetaCollectionRequest} extends {@link RequestModel}
 *
 * <p>AddEntityIntoMetaCollectionRequest</p>
 */
public class AddEntityIntoMetaCollectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaCollectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metaCollectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private AddEntityIntoMetaCollectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.metaCollectionId = builder.metaCollectionId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEntityIntoMetaCollectionRequest create() {
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

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<AddEntityIntoMetaCollectionRequest, Builder> {
        private String regionId; 
        private String id; 
        private String metaCollectionId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(AddEntityIntoMetaCollectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.metaCollectionId = request.metaCollectionId;
            this.remark = request.remark;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>category.123</p>
         */
        public Builder metaCollectionId(String metaCollectionId) {
            this.putQueryParameter("MetaCollectionId", metaCollectionId);
            this.metaCollectionId = metaCollectionId;
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
        public AddEntityIntoMetaCollectionRequest build() {
            return new AddEntityIntoMetaCollectionRequest(this);
        } 

    } 

}
