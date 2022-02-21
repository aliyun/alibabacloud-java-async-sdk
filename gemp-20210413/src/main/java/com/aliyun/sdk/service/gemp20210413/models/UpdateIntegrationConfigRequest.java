// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntegrationConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntegrationConfigRequest</p>
 */
public class UpdateIntegrationConfigRequest extends Request {
    @Body
    @NameInMap("accessKey")
    private String accessKey;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("integrationConfigId")
    private Long integrationConfigId;

    private UpdateIntegrationConfigRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.clientToken = builder.clientToken;
        this.integrationConfigId = builder.integrationConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntegrationConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
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

    public static final class Builder extends Request.Builder<UpdateIntegrationConfigRequest, Builder> {
        private String accessKey; 
        private String clientToken; 
        private Long integrationConfigId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntegrationConfigRequest response) {
            super(response);
            this.accessKey = response.accessKey;
            this.clientToken = response.clientToken;
            this.integrationConfigId = response.integrationConfigId;
        } 

        /**
         * 集成秘钥
         */
        public Builder accessKey(String accessKey) {
            this.putBodyParameter("accessKey", accessKey);
            this.accessKey = accessKey;
            return this;
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
         * integrationConfigId.
         */
        public Builder integrationConfigId(Long integrationConfigId) {
            this.putBodyParameter("integrationConfigId", integrationConfigId);
            this.integrationConfigId = integrationConfigId;
            return this;
        }

        @Override
        public UpdateIntegrationConfigRequest build() {
            return new UpdateIntegrationConfigRequest(this);
        } 

    } 

}
