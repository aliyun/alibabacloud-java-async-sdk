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
 * {@link GetDatasetVersionRequest} extends {@link RequestModel}
 *
 * <p>GetDatasetVersionRequest</p>
 */
public class GetDatasetVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private GetDatasetVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetDatasetVersionRequest, Builder> {
        private String regionId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetDatasetVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
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
         * <p>The dataset version ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-datasetVersion:3pXXXb8o0ngr07njhps1
         * :2</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetDatasetVersionRequest build() {
            return new GetDatasetVersionRequest(this);
        } 

    } 

}
