// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>GetMaliciousFileWhitelistConfigRequest</p>
 */
public class GetMaliciousFileWhitelistConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
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
         * <p>The ID of the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
