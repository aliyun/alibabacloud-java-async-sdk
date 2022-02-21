// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteKeyPairsRequest} extends {@link RequestModel}
 *
 * <p>DeleteKeyPairsRequest</p>
 */
public class DeleteKeyPairsRequest extends Request {
    @Query
    @NameInMap("KeyPairName")
    @Validation(required = true)
    private String keyPairName;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DeleteKeyPairsRequest(Builder builder) {
        super(builder);
        this.keyPairName = builder.keyPairName;
        this.version = builder.version;
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
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DeleteKeyPairsRequest, Builder> {
        private String keyPairName; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKeyPairsRequest response) {
            super(response);
            this.keyPairName = response.keyPairName;
            this.version = response.version;
        } 

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DeleteKeyPairsRequest build() {
            return new DeleteKeyPairsRequest(this);
        } 

    } 

}
