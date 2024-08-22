// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDispatchRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDispatchRuleRequest</p>
 */
public class UpdateDispatchRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispatchRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dispatchRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateDispatchRuleRequest(Builder builder) {
        super(builder);
        this.dispatchRule = builder.dispatchRule;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDispatchRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dispatchRule
     */
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateDispatchRuleRequest, Builder> {
        private String dispatchRule; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDispatchRuleRequest request) {
            super(request);
            this.dispatchRule = request.dispatchRule;
            this.regionId = request.regionId;
        } 

        /**
         * The dispatch rule configuration. The value is a JSON string. For more information about this parameter, see the following **additional information about the DispatchRule parameter**.
         */
        public Builder dispatchRule(String dispatchRule) {
            this.putQueryParameter("DispatchRule", dispatchRule);
            this.dispatchRule = dispatchRule;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateDispatchRuleRequest build() {
            return new UpdateDispatchRuleRequest(this);
        } 

    } 

}
