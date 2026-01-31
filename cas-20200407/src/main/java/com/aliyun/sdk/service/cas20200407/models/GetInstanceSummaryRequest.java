// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetInstanceSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceSummaryRequest</p>
 */
public class GetInstanceSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    private GetInstanceSummaryRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<GetInstanceSummaryRequest, Builder> {
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceSummaryRequest request) {
            super(request);
            this.instanceType = request.instanceType;
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
        public GetInstanceSummaryRequest build() {
            return new GetInstanceSummaryRequest(this);
        } 

    } 

}
