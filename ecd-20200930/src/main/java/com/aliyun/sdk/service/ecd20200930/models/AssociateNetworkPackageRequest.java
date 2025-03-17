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
 * {@link AssociateNetworkPackageRequest} extends {@link RequestModel}
 *
 * <p>AssociateNetworkPackageRequest</p>
 */
public class AssociateNetworkPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AssociateNetworkPackageRequest(Builder builder) {
        super(builder);
        this.networkPackageId = builder.networkPackageId;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateNetworkPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPackageId
     */
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AssociateNetworkPackageRequest, Builder> {
        private String networkPackageId; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateNetworkPackageRequest request) {
            super(request);
            this.networkPackageId = request.networkPackageId;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the premium bandwidth plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np-e0iodl3yzb62q****</p>
         */
        public Builder networkPackageId(String networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * <p>The ID of the office network. You can call the <a href="https://help.aliyun.com/document_detail/216079.html">DescribeNetworkPackages</a> to obtain the ID of the office network to which a premium bandwidth plan is bound.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-*********</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
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
        public AssociateNetworkPackageRequest build() {
            return new AssociateNetworkPackageRequest(this);
        } 

    } 

}
