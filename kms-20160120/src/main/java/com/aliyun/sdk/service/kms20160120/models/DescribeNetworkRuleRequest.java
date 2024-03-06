// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkRuleRequest</p>
 */
public class DescribeNetworkRuleRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private DescribeNetworkRuleRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeNetworkRuleRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkRuleRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the access control rule that you want to query.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeNetworkRuleRequest build() {
            return new DescribeNetworkRuleRequest(this);
        } 

    } 

}
