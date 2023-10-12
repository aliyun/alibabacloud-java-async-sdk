// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigurationVariateRequest} extends {@link RequestModel}
 *
 * <p>GetConfigurationVariateRequest</p>
 */
public class GetConfigurationVariateRequest extends Request {
    @Query
    @NameInMap("ConfigurationVariateId")
    @Validation(required = true)
    private String configurationVariateId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetConfigurationVariateRequest(Builder builder) {
        super(builder);
        this.configurationVariateId = builder.configurationVariateId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigurationVariateRequest create() {
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

    public static final class Builder extends Request.Builder<GetConfigurationVariateRequest, Builder> {
        private String configurationVariateId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigurationVariateRequest request) {
            super(request);
            this.configurationVariateId = request.configurationVariateId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ConfigurationVariateId.
         */
        public Builder configurationVariateId(String configurationVariateId) {
            this.putQueryParameter("ConfigurationVariateId", configurationVariateId);
            this.configurationVariateId = configurationVariateId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetConfigurationVariateRequest build() {
            return new GetConfigurationVariateRequest(this);
        } 

    } 

}
