// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListReleaseVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListReleaseVersionsRequest</p>
 */
public class ListReleaseVersionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IaasType")
    private String iaasType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListReleaseVersionsRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.iaasType = builder.iaasType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReleaseVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return iaasType
     */
    public String getIaasType() {
        return this.iaasType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListReleaseVersionsRequest, Builder> {
        private String clusterType; 
        private String iaasType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListReleaseVersionsRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.iaasType = request.iaasType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The type of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATALAKE</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The type of the IaaS resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder iaasType(String iaasType) {
            this.putQueryParameter("IaasType", iaasType);
            this.iaasType = iaasType;
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
        public ListReleaseVersionsRequest build() {
            return new ListReleaseVersionsRequest(this);
        } 

    } 

}
