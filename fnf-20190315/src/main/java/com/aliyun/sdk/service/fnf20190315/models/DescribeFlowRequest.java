// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowRequest</p>
 */
public class DescribeFlowRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private DescribeFlowRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DescribeFlowRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the flow.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeFlowRequest build() {
            return new DescribeFlowRequest(this);
        } 

    } 

}
