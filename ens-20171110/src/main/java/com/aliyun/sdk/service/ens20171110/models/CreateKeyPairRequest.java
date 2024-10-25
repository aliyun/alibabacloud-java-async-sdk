// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateKeyPairRequest} extends {@link RequestModel}
 *
 * <p>CreateKeyPairRequest</p>
 */
public class CreateKeyPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the key pair. The name must conform to the following naming conventions:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * <li>It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKeyPairName</p>
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
