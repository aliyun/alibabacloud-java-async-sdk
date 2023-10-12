// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConfigurationSpecificationRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigurationSpecificationRequest</p>
 */
public class DeleteConfigurationSpecificationRequest extends Request {
    @Body
    @NameInMap("ConfigurationSpecificationId")
    @Validation(required = true)
    private String configurationSpecificationId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private DeleteConfigurationSpecificationRequest(Builder builder) {
        super(builder);
        this.configurationSpecificationId = builder.configurationSpecificationId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigurationSpecificationRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteConfigurationSpecificationRequest, Builder> {
        private String configurationSpecificationId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigurationSpecificationRequest request) {
            super(request);
            this.configurationSpecificationId = request.configurationSpecificationId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ConfigurationSpecificationId.
         */
        public Builder configurationSpecificationId(String configurationSpecificationId) {
            this.putBodyParameter("ConfigurationSpecificationId", configurationSpecificationId);
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
        public DeleteConfigurationSpecificationRequest build() {
            return new DeleteConfigurationSpecificationRequest(this);
        } 

    } 

}
