// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyRequest</p>
 */
public class DescribePolicyRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private DescribePolicyRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePolicyRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the permission policy that you want to query.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribePolicyRequest build() {
            return new DescribePolicyRequest(this);
        } 

    } 

}
