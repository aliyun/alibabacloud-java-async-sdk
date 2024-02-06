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

    private CreateKeyPairRequest(Builder builder) {
        super(builder);
        this.keyPairName = builder.keyPairName;
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

    public static final class Builder extends Request.Builder<CreateKeyPairRequest, Builder> {
        private String keyPairName; 

        private Builder() {
            super();
        } 

        private Builder(CreateKeyPairRequest request) {
            super(request);
            this.keyPairName = request.keyPairName;
        } 

        /**
         * The name of the key pair. The name must conform to the following naming conventions:
         * <p>
         * 
         * *   The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         * *   It must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        @Override
        public CreateKeyPairRequest build() {
            return new CreateKeyPairRequest(this);
        } 

    } 

}
