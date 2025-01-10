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
 * {@link GetLniPrivateIpAddressRequest} extends {@link RequestModel}
 *
 * <p>GetLniPrivateIpAddressRequest</p>
 */
public class GetLniPrivateIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetLniPrivateIpAddressRequest(Builder builder) {
        super(builder);
        this.ipName = builder.ipName;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLniPrivateIpAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipName
     */
    public String getIpName() {
        return this.ipName;
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

    public static final class Builder extends Request.Builder<GetLniPrivateIpAddressRequest, Builder> {
        private String ipName; 
        private String networkInterfaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLniPrivateIpAddressRequest request) {
            super(request);
            this.ipName = request.ipName;
            this.networkInterfaceId = request.networkInterfaceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>IP unique identifier</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-xxxxx</p>
         */
        public Builder ipName(String ipName) {
            this.putBodyParameter("IpName", ipName);
            this.ipName = ipName;
            return this;
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

        @Override
        public GetLniPrivateIpAddressRequest build() {
            return new GetLniPrivateIpAddressRequest(this);
        } 

    } 

}
