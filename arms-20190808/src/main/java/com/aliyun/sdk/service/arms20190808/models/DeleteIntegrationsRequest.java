// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DeleteIntegrationsRequest} extends {@link RequestModel}
 *
 * <p>DeleteIntegrationsRequest</p>
 */
public class DeleteIntegrationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntegrationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long integrationId;

    private DeleteIntegrationsRequest(Builder builder) {
        super(builder);
        this.integrationId = builder.integrationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIntegrationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return integrationId
     */
    public Long getIntegrationId() {
        return this.integrationId;
    }

    public static final class Builder extends Request.Builder<DeleteIntegrationsRequest, Builder> {
        private Long integrationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIntegrationsRequest request) {
            super(request);
            this.integrationId = request.integrationId;
        } 

        /**
         * <p>The ID of the alert integration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder integrationId(Long integrationId) {
            this.putQueryParameter("IntegrationId", integrationId);
            this.integrationId = integrationId;
            return this;
        }

        @Override
        public DeleteIntegrationsRequest build() {
            return new DeleteIntegrationsRequest(this);
        } 

    } 

}
