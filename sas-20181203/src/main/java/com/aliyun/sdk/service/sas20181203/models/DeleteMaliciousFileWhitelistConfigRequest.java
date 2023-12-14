// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteMaliciousFileWhitelistConfigRequest</p>
 */
public class DeleteMaliciousFileWhitelistConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    private DeleteMaliciousFileWhitelistConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMaliciousFileWhitelistConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    public static final class Builder extends Request.Builder<DeleteMaliciousFileWhitelistConfigRequest, Builder> {
        private Long configId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMaliciousFileWhitelistConfigRequest request) {
            super(request);
            this.configId = request.configId;
        } 

        /**
         * The ID of the whitelist rule. You can call the [ListMaliciousFileWhitelistConfigs](~~ListMaliciousFileWhitelistConfigs~~) operation to query the IDs of whitelist rules.
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public DeleteMaliciousFileWhitelistConfigRequest build() {
            return new DeleteMaliciousFileWhitelistConfigRequest(this);
        } 

    } 

}
