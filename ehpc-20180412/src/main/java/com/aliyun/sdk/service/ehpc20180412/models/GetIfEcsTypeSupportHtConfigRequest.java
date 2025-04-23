// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetIfEcsTypeSupportHtConfigRequest} extends {@link RequestModel}
 *
 * <p>GetIfEcsTypeSupportHtConfigRequest</p>
 */
public class GetIfEcsTypeSupportHtConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetIfEcsTypeSupportHtConfigRequest request) {
            super(request);
            this.instanceType = request.instanceType;
        } 

        /**
         * <p>The Elastic Compute Service (ECS) instance type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
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
