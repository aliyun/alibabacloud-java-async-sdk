// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    private DeleteKeyPairsRequest(Builder builder) {
        super(builder);
        this.keyPairId = builder.keyPairId;
        this.keyPairName = builder.keyPairName;
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
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public static final class Builder extends Request.Builder<DeleteKeyPairsRequest, Builder> {
        private String keyPairId; 
        private String keyPairName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKeyPairsRequest request) {
            super(request);
            this.keyPairId = request.keyPairId;
            this.keyPairName = request.keyPairName;
        } 

        /**
         * The ID of the SSH key pair.
         */
        public Builder keyPairId(String keyPairId) {
            this.putQueryParameter("KeyPairId", keyPairId);
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * The name of the key pair. The name must conform to the following naming conventions:
         * <p>
         * 
         * *   The name must be 2 to 128 characters in length.
         * *   The name must start with a letter and cannot start with `http://` or `https://`.
         * *   The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         * 
         * Before you delete a key pair, you can call the DescribeKeyPairs operation to query existing key pairs.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        @Override
        public DeleteKeyPairsRequest build() {
            return new DeleteKeyPairsRequest(this);
        } 

    } 

}
