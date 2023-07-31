// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcDataUploadAndDownloadRequest} extends {@link RequestModel}
 *
 * <p>RpcDataUploadAndDownloadRequest</p>
 */
public class RpcDataUploadAndDownloadRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("query1")
    private String query1;

    private RpcDataUploadAndDownloadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.query1 = builder.query1;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcDataUploadAndDownloadRequest create() {
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
     * @return query1
     */
    public String getQuery1() {
        return this.query1;
    }

    public static final class Builder extends Request.Builder<RpcDataUploadAndDownloadRequest, Builder> {
        private String regionId; 
        private String query1; 

        private Builder() {
            super();
        } 

        private Builder(RpcDataUploadAndDownloadRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.query1 = request.query1;
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
         * query1.
         */
        public Builder query1(String query1) {
            this.putQueryParameter("query1", query1);
            this.query1 = query1;
            return this;
        }

        @Override
        public RpcDataUploadAndDownloadRequest build() {
            return new RpcDataUploadAndDownloadRequest(this);
        } 

    } 

}
