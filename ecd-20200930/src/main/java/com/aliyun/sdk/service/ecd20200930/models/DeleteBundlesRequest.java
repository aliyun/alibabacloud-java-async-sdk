// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DeleteBundlesRequest} extends {@link RequestModel}
 *
 * <p>DeleteBundlesRequest</p>
 */
public class DeleteBundlesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteBundlesRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBundlesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleId
     */
    public java.util.List<String> getBundleId() {
        return this.bundleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteBundlesRequest, Builder> {
        private java.util.List<String> bundleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBundlesRequest request) {
            super(request);
            this.bundleId = request.bundleId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the cloud computer templates. You can specify 1 to 100 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b-cezrnfgecbich****</p>
         */
        public Builder bundleId(java.util.List<String> bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteBundlesRequest build() {
            return new DeleteBundlesRequest(this);
        } 

    } 

}
