// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIfEcsTypeSupportHtConfigRequest} extends {@link RequestModel}
 *
 * <p>GetIfEcsTypeSupportHtConfigRequest</p>
 */
public class GetIfEcsTypeSupportHtConfigRequest extends Request {
    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    private GetIfEcsTypeSupportHtConfigRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIfEcsTypeSupportHtConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<GetIfEcsTypeSupportHtConfigRequest, Builder> {
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(GetIfEcsTypeSupportHtConfigRequest response) {
            super(response);
            this.instanceType = response.instanceType;
        } 

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public GetIfEcsTypeSupportHtConfigRequest build() {
            return new GetIfEcsTypeSupportHtConfigRequest(this);
        } 

    } 

}
