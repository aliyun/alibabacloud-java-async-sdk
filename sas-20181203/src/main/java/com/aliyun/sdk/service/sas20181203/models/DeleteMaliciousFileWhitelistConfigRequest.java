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
 * {@link DeleteMaliciousFileWhitelistConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteMaliciousFileWhitelistConfigRequest</p>
 */
public class DeleteMaliciousFileWhitelistConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
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
         * <p>The ID of the alert whitelist rule of sensitive files that are detected by using the agentless detection feature. You can call the <a href="~~ListMaliciousFileWhitelistConfigs~~">ListMaliciousFileWhitelistConfigs</a> operation to query the IDs of alert whitelist rules.</p>
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
        public DeleteMaliciousFileWhitelistConfigRequest build() {
            return new DeleteMaliciousFileWhitelistConfigRequest(this);
        } 

    } 

}
