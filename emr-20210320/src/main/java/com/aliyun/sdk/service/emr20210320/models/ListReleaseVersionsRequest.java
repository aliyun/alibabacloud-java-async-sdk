// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListReleaseVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListReleaseVersionsRequest</p>
 */
public class ListReleaseVersionsRequest extends Request {
    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("IaasType")
    private String iaasType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * The type of the cluster.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The type of the IaaS resource.
         */
        public Builder iaasType(String iaasType) {
            this.putQueryParameter("IaasType", iaasType);
            this.iaasType = iaasType;
            return this;
        }

        /**
         * The ID of the region in which you want to create the instance.
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
