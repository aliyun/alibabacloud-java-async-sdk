// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrivateRegistryRequest} extends {@link RequestModel}
 *
 * <p>DeletePrivateRegistryRequest</p>
 */
public class DeletePrivateRegistryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registryId;

    private DeletePrivateRegistryRequest(Builder builder) {
        super(builder);
        this.registryId = builder.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrivateRegistryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryId
     */
    public Long getRegistryId() {
        return this.registryId;
    }

    public static final class Builder extends Request.Builder<DeletePrivateRegistryRequest, Builder> {
        private Long registryId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrivateRegistryRequest request) {
            super(request);
            this.registryId = request.registryId;
        } 

        /**
         * The ID of the image repository.
         * <p>
         * 
         * > You can call the [PageImageRegistry](~~PageImageRegistry~~) operation to query the IDs of image repositories.
         */
        public Builder registryId(Long registryId) {
            this.putQueryParameter("RegistryId", registryId);
            this.registryId = registryId;
            return this;
        }

        @Override
        public DeletePrivateRegistryRequest build() {
            return new DeletePrivateRegistryRequest(this);
        } 

    } 

}
