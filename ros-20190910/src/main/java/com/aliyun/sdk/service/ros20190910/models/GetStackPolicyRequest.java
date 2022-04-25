// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetStackPolicyRequest</p>
 */
public class GetStackPolicyRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
    private String stackId;

    private GetStackPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackPolicyRequest create() {
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
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<GetStackPolicyRequest, Builder> {
        private String regionId; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.stackId = request.stackId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public GetStackPolicyRequest build() {
            return new GetStackPolicyRequest(this);
        } 

    } 

}
