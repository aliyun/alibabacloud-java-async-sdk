// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>GetMaliciousFileWhitelistConfigRequest</p>
 */
public class GetMaliciousFileWhitelistConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    private Long configId;

    private GetMaliciousFileWhitelistConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMaliciousFileWhitelistConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetMaliciousFileWhitelistConfigRequest, Builder> {
        private Long configId; 

        private Builder() {
            super();
        } 

        private Builder(GetMaliciousFileWhitelistConfigRequest request) {
            super(request);
            this.configId = request.configId;
        } 

        /**
         * The ID of the whitelist rule.
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public GetMaliciousFileWhitelistConfigRequest build() {
            return new GetMaliciousFileWhitelistConfigRequest(this);
        } 

    } 

}
