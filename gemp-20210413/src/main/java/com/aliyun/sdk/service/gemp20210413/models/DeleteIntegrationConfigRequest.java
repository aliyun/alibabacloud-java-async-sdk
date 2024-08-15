// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIntegrationConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteIntegrationConfigRequest</p>
 */
public class DeleteIntegrationConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("integrationConfigId")
    private Long integrationConfigId;

    private DeleteIntegrationConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.integrationConfigId = builder.integrationConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIntegrationConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return integrationConfigId
     */
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

    public static final class Builder extends Request.Builder<DeleteIntegrationConfigRequest, Builder> {
        private String clientToken; 
        private Long integrationConfigId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIntegrationConfigRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.integrationConfigId = request.integrationConfigId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * integrationConfigId.
         */
        public Builder integrationConfigId(Long integrationConfigId) {
            this.putBodyParameter("integrationConfigId", integrationConfigId);
            this.integrationConfigId = integrationConfigId;
            return this;
        }

        @Override
        public DeleteIntegrationConfigRequest build() {
            return new DeleteIntegrationConfigRequest(this);
        } 

    } 

}
