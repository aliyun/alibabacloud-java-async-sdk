// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceRuleRequest} extends {@link RequestModel}
 *
 * <p>GetResourceRuleRequest</p>
 */
public class GetResourceRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRuleId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetResourceRuleRequest(Builder builder) {
        super(builder);
        this.resourceRuleId = builder.resourceRuleId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceRuleId
     */
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetResourceRuleRequest, Builder> {
        private String resourceRuleId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceRuleRequest request) {
            super(request);
            this.resourceRuleId = request.resourceRuleId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ResourceRuleId.
         */
        public Builder resourceRuleId(String resourceRuleId) {
            this.putPathParameter("ResourceRuleId", resourceRuleId);
            this.resourceRuleId = resourceRuleId;
            return this;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetResourceRuleRequest build() {
            return new GetResourceRuleRequest(this);
        } 

    } 

}
