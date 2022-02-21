// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDispatchRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDispatchRuleRequest</p>
 */
public class CreateDispatchRuleRequest extends Request {
    @Query
    @NameInMap("DispatchRule")
    @Validation(required = true)
    private String dispatchRule;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateDispatchRuleRequest(Builder builder) {
        super(builder);
        this.dispatchRule = builder.dispatchRule;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDispatchRuleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDispatchRuleRequest, Builder> {
        private String dispatchRule; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDispatchRuleRequest response) {
            super(response);
            this.dispatchRule = response.dispatchRule;
            this.regionId = response.regionId;
        } 

        /**
         * DispatchRule.
         */
        public Builder dispatchRule(String dispatchRule) {
            this.putQueryParameter("DispatchRule", dispatchRule);
            this.dispatchRule = dispatchRule;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDispatchRuleRequest build() {
            return new CreateDispatchRuleRequest(this);
        } 

    } 

}
