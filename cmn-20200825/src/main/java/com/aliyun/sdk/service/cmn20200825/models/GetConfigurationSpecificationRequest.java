// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigurationSpecificationRequest} extends {@link RequestModel}
 *
 * <p>GetConfigurationSpecificationRequest</p>
 */
public class GetConfigurationSpecificationRequest extends Request {
    @Query
    @NameInMap("ConfigurationSpecificationId")
    @Validation(required = true)
    private String configurationSpecificationId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetConfigurationSpecificationRequest(Builder builder) {
        super(builder);
        this.configurationSpecificationId = builder.configurationSpecificationId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigurationSpecificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configurationSpecificationId
     */
    public String getConfigurationSpecificationId() {
        return this.configurationSpecificationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetConfigurationSpecificationRequest, Builder> {
        private String configurationSpecificationId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigurationSpecificationRequest request) {
            super(request);
            this.configurationSpecificationId = request.configurationSpecificationId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ConfigurationSpecificationId.
         */
        public Builder configurationSpecificationId(String configurationSpecificationId) {
            this.putQueryParameter("ConfigurationSpecificationId", configurationSpecificationId);
            this.configurationSpecificationId = configurationSpecificationId;
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
        public GetConfigurationSpecificationRequest build() {
            return new GetConfigurationSpecificationRequest(this);
        } 

    } 

}
