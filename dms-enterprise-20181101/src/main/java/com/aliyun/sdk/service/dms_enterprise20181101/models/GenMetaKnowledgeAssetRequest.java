// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GenMetaKnowledgeAssetRequest} extends {@link RequestModel}
 *
 * <p>GenMetaKnowledgeAssetRequest</p>
 */
public class GenMetaKnowledgeAssetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dbId;

    private GenMetaKnowledgeAssetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenMetaKnowledgeAssetRequest create() {
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
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    public static final class Builder extends Request.Builder<GenMetaKnowledgeAssetRequest, Builder> {
        private String regionId; 
        private Integer dbId; 

        private Builder() {
            super();
        } 

        private Builder(GenMetaKnowledgeAssetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
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
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        @Override
        public GenMetaKnowledgeAssetRequest build() {
            return new GenMetaKnowledgeAssetRequest(this);
        } 

    } 

}
