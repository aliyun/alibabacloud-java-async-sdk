// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > keyPairNames;

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
    public java.util.List < String > getKeyPairNames() {
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
        private java.util.List < String > keyPairNames; 
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The names of the SSH key pairs. The name must be 2 to 64 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter and cannot start with http:// or https://. You can specify the names of a maximum of 50 SSH key pairs.
         */
        public Builder keyPairNames(java.util.List < String > keyPairNames) {
            this.putQueryParameter("KeyPairNames", keyPairNames);
            this.keyPairNames = keyPairNames;
            return this;
        }

        /**
         * The region ID of the simple application servers. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
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
