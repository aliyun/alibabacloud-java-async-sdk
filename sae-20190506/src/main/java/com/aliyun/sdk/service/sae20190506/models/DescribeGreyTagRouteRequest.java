// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGreyTagRouteRequest} extends {@link RequestModel}
 *
 * <p>DescribeGreyTagRouteRequest</p>
 */
public class DescribeGreyTagRouteRequest extends Request {
    @Query
    @NameInMap("GreyTagRouteId")
    @Validation(required = true, minimum = 1)
    private Long greyTagRouteId;

    private DescribeGreyTagRouteRequest(Builder builder) {
        super(builder);
        this.greyTagRouteId = builder.greyTagRouteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGreyTagRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return greyTagRouteId
     */
    public Long getGreyTagRouteId() {
        return this.greyTagRouteId;
    }

    public static final class Builder extends Request.Builder<DescribeGreyTagRouteRequest, Builder> {
        private Long greyTagRouteId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGreyTagRouteRequest request) {
            super(request);
            this.greyTagRouteId = request.greyTagRouteId;
        } 

        /**
         * 规则ID
         */
        public Builder greyTagRouteId(Long greyTagRouteId) {
            this.putQueryParameter("GreyTagRouteId", greyTagRouteId);
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }

        @Override
        public DescribeGreyTagRouteRequest build() {
            return new DescribeGreyTagRouteRequest(this);
        } 

    } 

}
