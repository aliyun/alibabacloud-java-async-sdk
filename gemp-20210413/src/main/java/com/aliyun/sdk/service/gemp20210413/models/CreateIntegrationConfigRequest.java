// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntegrationConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateIntegrationConfigRequest</p>
 */
public class CreateIntegrationConfigRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("monitorSourceId")
    private Long monitorSourceId;

    private CreateIntegrationConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.monitorSourceId = builder.monitorSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntegrationConfigRequest create() {
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
     * @return monitorSourceId
     */
    public Long getMonitorSourceId() {
        return this.monitorSourceId;
    }

    public static final class Builder extends Request.Builder<CreateIntegrationConfigRequest, Builder> {
        private String clientToken; 
        private Long monitorSourceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntegrationConfigRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.monitorSourceId = response.monitorSourceId;
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
         * monitorSourceId.
         */
        public Builder monitorSourceId(Long monitorSourceId) {
            this.putBodyParameter("monitorSourceId", monitorSourceId);
            this.monitorSourceId = monitorSourceId;
            return this;
        }

        @Override
        public CreateIntegrationConfigRequest build() {
            return new CreateIntegrationConfigRequest(this);
        } 

    } 

}
