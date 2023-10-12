// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConfigurationVariateRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigurationVariateRequest</p>
 */
public class DeleteConfigurationVariateRequest extends Request {
    @Body
    @NameInMap("ConfigurationVariateId")
    @Validation(required = true)
    private String configurationVariateId;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    private DeleteConfigurationVariateRequest(Builder builder) {
        super(builder);
        this.configurationVariateId = builder.configurationVariateId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigurationVariateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configurationVariateId
     */
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteConfigurationVariateRequest, Builder> {
        private String configurationVariateId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigurationVariateRequest request) {
            super(request);
            this.configurationVariateId = request.configurationVariateId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ConfigurationVariateId.
         */
        public Builder configurationVariateId(String configurationVariateId) {
            this.putBodyParameter("ConfigurationVariateId", configurationVariateId);
            this.configurationVariateId = configurationVariateId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteConfigurationVariateRequest build() {
            return new DeleteConfigurationVariateRequest(this);
        } 

    } 

}
