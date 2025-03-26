// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>GetNetworkInterfaceRequest</p>
 */
public class GetNetworkInterfaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubnetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subnetId;

    private GetNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.networkInterfaceId = builder.networkInterfaceId;
        this.regionId = builder.regionId;
        this.subnetId = builder.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkInterfaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    public static final class Builder extends Request.Builder<GetNetworkInterfaceRequest, Builder> {
        private String networkInterfaceId; 
        private String regionId; 
        private String subnetId; 

        private Builder() {
            super();
        } 

        private Builder(GetNetworkInterfaceRequest request) {
            super(request);
            this.networkInterfaceId = request.networkInterfaceId;
            this.regionId = request.regionId;
            this.subnetId = request.subnetId;
        } 

        /**
         * <p>Lingjun network interface controller ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-bp18exxqa2rvfn45e5pz</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putBodyParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Subnet of Lingjun</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-f3zfzmnc</p>
         */
        public Builder subnetId(String subnetId) {
            this.putBodyParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        @Override
        public GetNetworkInterfaceRequest build() {
            return new GetNetworkInterfaceRequest(this);
        } 

    } 

}
