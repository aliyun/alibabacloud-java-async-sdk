// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceRequest</p>
 */
public class DescribeServiceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("ModelServiceId")
    @Validation(required = true)
    private String modelServiceId;

    private DescribeServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.modelServiceId = builder.modelServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceRequest create() {
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
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String modelServiceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.modelServiceId = request.modelServiceId;
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
         * ModelServiceId.
         */
        public Builder modelServiceId(String modelServiceId) {
            this.putBodyParameter("ModelServiceId", modelServiceId);
            this.modelServiceId = modelServiceId;
            return this;
        }

        @Override
        public DescribeServiceRequest build() {
            return new DescribeServiceRequest(this);
        } 

    } 

}
