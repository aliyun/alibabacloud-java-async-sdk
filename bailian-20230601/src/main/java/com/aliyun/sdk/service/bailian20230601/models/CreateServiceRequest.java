// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("Model")
    @Validation(required = true)
    private String model;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.model = builder.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String model; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.model = request.model;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

}
