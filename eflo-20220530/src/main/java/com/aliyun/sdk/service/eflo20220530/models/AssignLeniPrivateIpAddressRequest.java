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
 * {@link AssignLeniPrivateIpAddressRequest} extends {@link RequestModel}
 *
 * <p>AssignLeniPrivateIpAddressRequest</p>
 */
public class AssignLeniPrivateIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticNetworkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AssignLeniPrivateIpAddressRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignLeniPrivateIpAddressRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return elasticNetworkInterfaceId
     */
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AssignLeniPrivateIpAddressRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String elasticNetworkInterfaceId; 
        private String privateIpAddress; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssignLeniPrivateIpAddressRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.elasticNetworkInterfaceId = request.elasticNetworkInterfaceId;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The idempotent identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>3fd79d62-ab1d-11ec-9a53-0242ac110004</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the response code.</p>
         * 
         * <strong>example:</strong>
         * <p>wuhuaiyu</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
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
         * <p>Lingjun Elastic Network Interface secondary private network IP (automatically assigned by default).</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.****</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putBodyParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
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
        public AssignLeniPrivateIpAddressRequest build() {
            return new AssignLeniPrivateIpAddressRequest(this);
        } 

    } 

}
