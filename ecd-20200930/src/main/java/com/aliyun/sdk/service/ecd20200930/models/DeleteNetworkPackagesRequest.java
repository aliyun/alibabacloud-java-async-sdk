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
 * {@link DeleteNetworkPackagesRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkPackagesRequest</p>
 */
public class DeleteNetworkPackagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> networkPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    private DeleteNetworkPackagesRequest(Builder builder) {
        super(builder);
        this.networkPackageId = builder.networkPackageId;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkPackagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPackageId
     */
    public java.util.List<String> getNetworkPackageId() {
        return this.networkPackageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkPackagesRequest, Builder> {
        private java.util.List<String> networkPackageId; 
        private String regionId; 
        private Long resellerOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkPackagesRequest request) {
            super(request);
            this.networkPackageId = request.networkPackageId;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
        } 

        /**
         * <p>The IDs of premium bandwidth plans. You can specify one or more IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkPackageId(java.util.List<String> networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
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

        /**
         * ResellerOwnerUid.
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        @Override
        public DeleteNetworkPackagesRequest build() {
            return new DeleteNetworkPackagesRequest(this);
        } 

    } 

}
