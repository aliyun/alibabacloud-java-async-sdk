// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyPairRequest} extends {@link RequestModel}
 *
 * <p>CreateKeyPairRequest</p>
 */
public class CreateKeyPairRequest extends Request {
    @Query
    @NameInMap("KeyPairName")
    @Validation(required = true)
    private String keyPairName;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private CreateKeyPairRequest(Builder builder) {
        super(builder);
        this.keyPairName = builder.keyPairName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyPairRequest create() {
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

    public static final class Builder extends Request.Builder<CreateKeyPairRequest, Builder> {
        private String keyPairName; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(CreateKeyPairRequest request) {
            super(request);
            this.keyPairName = request.keyPairName;
            this.version = request.version;
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
        public CreateKeyPairRequest build() {
            return new CreateKeyPairRequest(this);
        } 

    } 

}
