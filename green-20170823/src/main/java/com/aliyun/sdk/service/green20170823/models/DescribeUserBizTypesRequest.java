// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBizTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserBizTypesRequest</p>
 */
public class DescribeUserBizTypesRequest extends Request {
    @Query
    @NameInMap("Customized")
    private Boolean customized;

    private DescribeUserBizTypesRequest(Builder builder) {
        super(builder);
        this.customized = builder.customized;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBizTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customized
     */
    public Boolean getCustomized() {
        return this.customized;
    }

    public static final class Builder extends Request.Builder<DescribeUserBizTypesRequest, Builder> {
        private Boolean customized; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserBizTypesRequest request) {
            super(request);
            this.customized = request.customized;
        } 

        /**
         * Customized.
         */
        public Builder customized(Boolean customized) {
            this.putQueryParameter("Customized", customized);
            this.customized = customized;
            return this;
        }

        @Override
        public DescribeUserBizTypesRequest build() {
            return new DescribeUserBizTypesRequest(this);
        } 

    } 

}
