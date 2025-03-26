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
 * {@link DeleteElasticNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteElasticNetworkInterfaceRequest</p>
 */
public class DeleteElasticNetworkInterfaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticNetworkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteElasticNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteElasticNetworkInterfaceRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteElasticNetworkInterfaceRequest, Builder> {
        private String clientToken; 
        private String elasticNetworkInterfaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteElasticNetworkInterfaceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.elasticNetworkInterfaceId = request.elasticNetworkInterfaceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>By default, popApi is not ignored and idempotent</p>
         * 
         * <strong>example:</strong>
         * <p>141cccd6-dfbd-11ec-b8e8-0242ac110003</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Lingjun Elastic Network Interface ID</p>
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
        public DeleteElasticNetworkInterfaceRequest build() {
            return new DeleteElasticNetworkInterfaceRequest(this);
        } 

    } 

}
