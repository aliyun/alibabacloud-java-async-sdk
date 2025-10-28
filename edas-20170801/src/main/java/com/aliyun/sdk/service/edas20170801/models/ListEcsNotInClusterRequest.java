// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListEcsNotInClusterRequest} extends {@link RequestModel}
 *
 * <p>ListEcsNotInClusterRequest</p>
 */
public class ListEcsNotInClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer networkMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
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
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>1: classic network</li>
         * <li>2: virtual private cloud (VPC)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder networkMode(Integer networkMode) {
            this.putQueryParameter("NetworkMode", networkMode);
            this.networkMode = networkMode;
            return this;
        }

        /**
         * <p>The ID of the VPC. This parameter is required if the NetworkMode parameter is set to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zef6ob8****v8x3q46kp</p>
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
