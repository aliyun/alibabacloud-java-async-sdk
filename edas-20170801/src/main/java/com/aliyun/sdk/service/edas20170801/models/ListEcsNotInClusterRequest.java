// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcsNotInClusterRequest} extends {@link RequestModel}
 *
 * <p>ListEcsNotInClusterRequest</p>
 */
public class ListEcsNotInClusterRequest extends Request {
    @Query
    @NameInMap("NetworkMode")
    @Validation(required = true)
    private Integer networkMode;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private ListEcsNotInClusterRequest(Builder builder) {
        super(builder);
        this.networkMode = builder.networkMode;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcsNotInClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkMode
     */
    public Integer getNetworkMode() {
        return this.networkMode;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListEcsNotInClusterRequest, Builder> {
        private Integer networkMode; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListEcsNotInClusterRequest request) {
            super(request);
            this.networkMode = request.networkMode;
            this.vpcId = request.vpcId;
        } 

        /**
         * The network type. Valid values:
         * <p>
         * 
         * *   1: classic network
         * *   2: virtual private cloud (VPC)
         */
        public Builder networkMode(Integer networkMode) {
            this.putQueryParameter("NetworkMode", networkMode);
            this.networkMode = networkMode;
            return this;
        }

        /**
         * The ID of the VPC. This parameter is required if the NetworkMode parameter is set to 2.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListEcsNotInClusterRequest build() {
            return new ListEcsNotInClusterRequest(this);
        } 

    } 

}
