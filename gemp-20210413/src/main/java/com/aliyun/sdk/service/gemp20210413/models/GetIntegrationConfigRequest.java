// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationConfigRequest} extends {@link RequestModel}
 *
 * <p>GetIntegrationConfigRequest</p>
 */
public class GetIntegrationConfigRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("integrationConfigId")
    private Long integrationConfigId;

    private GetIntegrationConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.integrationConfigId = builder.integrationConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegrationConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetIntegrationConfigRequest, Builder> {
        private String clientToken; 
        private Long integrationConfigId; 

        private Builder() {
            super();
        } 

        private Builder(GetIntegrationConfigRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.integrationConfigId = response.integrationConfigId;
        } 

        /**
         * 幂等id
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 集成配置id
         */
        public Builder integrationConfigId(Long integrationConfigId) {
            this.putBodyParameter("integrationConfigId", integrationConfigId);
            this.integrationConfigId = integrationConfigId;
            return this;
        }

        @Override
        public GetIntegrationConfigRequest build() {
            return new GetIntegrationConfigRequest(this);
        } 

    } 

}
