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
 * {@link GetBatchChangeTableOwnerStatusRequest} extends {@link RequestModel}
 *
 * <p>GetBatchChangeTableOwnerStatusRequest</p>
 */
public class GetBatchChangeTableOwnerStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String batchId;

    private GetBatchChangeTableOwnerStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.batchId = builder.batchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchChangeTableOwnerStatusRequest create() {
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
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    public static final class Builder extends Request.Builder<GetBatchChangeTableOwnerStatusRequest, Builder> {
        private String regionId; 
        private String batchId; 

        private Builder() {
            super();
        } 

        private Builder(GetBatchChangeTableOwnerStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.batchId = request.batchId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <p>524257_openapi-req-abc123</p>
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        @Override
        public GetBatchChangeTableOwnerStatusRequest build() {
            return new GetBatchChangeTableOwnerStatusRequest(this);
        } 

    } 

}
