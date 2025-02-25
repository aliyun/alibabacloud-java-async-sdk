// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTypeRequest</p>
 */
public class DescribeInstanceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    private DescribeInstanceTypeRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeInstanceTypeRequest, Builder> {
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTypeRequest request) {
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
        public DescribeInstanceTypeRequest build() {
            return new DescribeInstanceTypeRequest(this);
        } 

    } 

}
