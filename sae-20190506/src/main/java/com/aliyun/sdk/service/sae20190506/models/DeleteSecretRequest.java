// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecretRequest</p>
 */
public class DeleteSecretRequest extends Request {
    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    @Query
    @NameInMap("SecretId")
    @Validation(required = true, maximum = 1000000000, minimum = 1)
    private Long secretId;

    private DeleteSecretRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return secretId
     */
    public Long getSecretId() {
        return this.secretId;
    }

    public static final class Builder extends Request.Builder<DeleteSecretRequest, Builder> {
        private String namespaceId; 
        private Long secretId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecretRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.secretId = request.secretId;
        } 

        /**
         * The ID of the namespace in which the Secret resides. By default, the namespace ID is the same as the region ID.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The ID of the Secret to be deleted. You can call the [ListSecrets](~~466929~~) operation to view the Secret IDs.
         */
        public Builder secretId(Long secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        @Override
        public DeleteSecretRequest build() {
            return new DeleteSecretRequest(this);
        } 

    } 

}
