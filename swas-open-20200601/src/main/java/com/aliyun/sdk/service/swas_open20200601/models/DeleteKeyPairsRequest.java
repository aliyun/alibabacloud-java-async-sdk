// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DeleteKeyPairsRequest} extends {@link RequestModel}
 *
 * <p>DeleteKeyPairsRequest</p>
 */
public class DeleteKeyPairsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> keyPairNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteKeyPairsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.keyPairNames = builder.keyPairNames;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKeyPairsRequest create() {
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
     * @return keyPairNames
     */
    public java.util.List<String> getKeyPairNames() {
        return this.keyPairNames;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteKeyPairsRequest, Builder> {
        private String clientToken; 
        private java.util.List<String> keyPairNames; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKeyPairsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.keyPairNames = request.keyPairNames;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The names of the SSH key pairs. The name must be 2 to 64 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter and cannot start with http:// or https://. You can specify the names of a maximum of 50 SSH key pairs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder keyPairNames(java.util.List<String> keyPairNames) {
            this.putQueryParameter("KeyPairNames", keyPairNames);
            this.keyPairNames = keyPairNames;
            return this;
        }

        /**
         * <p>The region ID of the simple application servers. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
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
        public DeleteKeyPairsRequest build() {
            return new DeleteKeyPairsRequest(this);
        } 

    } 

}
