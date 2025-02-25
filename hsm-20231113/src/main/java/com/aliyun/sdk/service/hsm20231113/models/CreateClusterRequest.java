// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MasterInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String masterInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.masterInstanceId = builder.masterInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return masterInstanceId
     */
    public String getMasterInstanceId() {
        return this.masterInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String clusterName; 
        private String masterInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.masterInstanceId = request.masterInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster name.
         */
        public Builder clusterName(String clusterName) {
            this.putBodyParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The HSM ID.
         */
        public Builder masterInstanceId(String masterInstanceId) {
            this.putBodyParameter("MasterInstanceId", masterInstanceId);
            this.masterInstanceId = masterInstanceId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

}
