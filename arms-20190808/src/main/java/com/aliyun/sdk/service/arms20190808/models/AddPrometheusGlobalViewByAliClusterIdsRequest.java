// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link AddPrometheusGlobalViewByAliClusterIdsRequest} extends {@link RequestModel}
 *
 * <p>AddPrometheusGlobalViewByAliClusterIdsRequest</p>
 */
public class AddPrometheusGlobalViewByAliClusterIdsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AddPrometheusGlobalViewByAliClusterIdsRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.groupName = builder.groupName;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrometheusGlobalViewByAliClusterIdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public String getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddPrometheusGlobalViewByAliClusterIdsRequest, Builder> {
        private String clusterIds; 
        private String groupName; 
        private String productCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddPrometheusGlobalViewByAliClusterIdsRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.groupName = request.groupName;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of clusters. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cd1d55bef19904324a20ed0ebb86caa5c,c5b48729918ab4745a24482ac29d0973a, c00a94896641449098bf24931e4166003, cd174485c09384060ba542bc1be1185a4</p>
         */
        public Builder clusterIds(String clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * <p>The name of the global aggregation instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zyGlobalView</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The identifier to identify the service if custom dashboards are created for the specified clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>adcp</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public AddPrometheusGlobalViewByAliClusterIdsRequest build() {
            return new AddPrometheusGlobalViewByAliClusterIdsRequest(this);
        } 

    } 

}
