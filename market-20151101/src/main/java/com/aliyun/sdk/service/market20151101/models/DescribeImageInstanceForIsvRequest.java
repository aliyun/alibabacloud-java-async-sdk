// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeImageInstanceForIsvRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageInstanceForIsvRequest</p>
 */
public class DescribeImageInstanceForIsvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerPk")
    private Long customerPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    private DescribeImageInstanceForIsvRequest(Builder builder) {
        super(builder);
        this.customerPk = builder.customerPk;
        this.ecsInstanceId = builder.ecsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageInstanceForIsvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerPk
     */
    public Long getCustomerPk() {
        return this.customerPk;
    }

    /**
     * @return ecsInstanceId
     */
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeImageInstanceForIsvRequest, Builder> {
        private Long customerPk; 
        private String ecsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageInstanceForIsvRequest request) {
            super(request);
            this.customerPk = request.customerPk;
            this.ecsInstanceId = request.ecsInstanceId;
        } 

        /**
         * CustomerPk.
         */
        public Builder customerPk(Long customerPk) {
            this.putQueryParameter("CustomerPk", customerPk);
            this.customerPk = customerPk;
            return this;
        }

        /**
         * EcsInstanceId.
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        @Override
        public DescribeImageInstanceForIsvRequest build() {
            return new DescribeImageInstanceForIsvRequest(this);
        } 

    } 

}
