// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeInstanceTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTypesRequest</p>
 */
public class DescribeInstanceTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    private DescribeInstanceTypesRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeInstanceTypesRequest, Builder> {
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTypesRequest request) {
            super(request);
            this.instanceType = request.instanceType;
        } 

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.sn1.small</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public DescribeInstanceTypesRequest build() {
            return new DescribeInstanceTypesRequest(this);
        } 

    } 

}
