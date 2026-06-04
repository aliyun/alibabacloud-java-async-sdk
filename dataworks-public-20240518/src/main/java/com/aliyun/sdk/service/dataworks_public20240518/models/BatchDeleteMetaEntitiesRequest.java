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
 * {@link BatchDeleteMetaEntitiesRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteMetaEntitiesRequest</p>
 */
public class BatchDeleteMetaEntitiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> ids;

    private BatchDeleteMetaEntitiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteMetaEntitiesRequest create() {
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
     * @return ids
     */
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<BatchDeleteMetaEntitiesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> ids; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteMetaEntitiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ids = request.ids;
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
         */
        public Builder ids(java.util.List<String> ids) {
            String idsShrink = shrink(ids, "Ids", "simple");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        @Override
        public BatchDeleteMetaEntitiesRequest build() {
            return new BatchDeleteMetaEntitiesRequest(this);
        } 

    } 

}
