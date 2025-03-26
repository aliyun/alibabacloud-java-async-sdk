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
 * {@link UnassignLeniPrivateIpAddressRequest} extends {@link RequestModel}
 *
 * <p>UnassignLeniPrivateIpAddressRequest</p>
 */
public class UnassignLeniPrivateIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticNetworkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UnassignLeniPrivateIpAddressRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
        this.ipName = builder.ipName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassignLeniPrivateIpAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return elasticNetworkInterfaceId
     */
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    /**
     * @return ipName
     */
    public String getIpName() {
        return this.ipName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UnassignLeniPrivateIpAddressRequest, Builder> {
        private String clientToken; 
        private String elasticNetworkInterfaceId; 
        private String ipName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UnassignLeniPrivateIpAddressRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.elasticNetworkInterfaceId = request.elasticNetworkInterfaceId;
            this.ipName = request.ipName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The idempotent identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>967e77a2-b61d-11ec-a147-0242c0a80504</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Lingjun Elastic Network Interface ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        public Builder elasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.putBodyParameter("ElasticNetworkInterfaceId", elasticNetworkInterfaceId);
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }

        /**
         * <p>Lingjun Elastic Network Interface secondary private IP unique identifier.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-8ylg****</p>
         */
        public Builder ipName(String ipName) {
            this.putBodyParameter("IpName", ipName);
            this.ipName = ipName;
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
        public UnassignLeniPrivateIpAddressRequest build() {
            return new UnassignLeniPrivateIpAddressRequest(this);
        } 

    } 

}
