// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeGreyTagRouteRequest} extends {@link RequestModel}
 *
 * <p>DescribeGreyTagRouteRequest</p>
 */
public class DescribeGreyTagRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GreyTagRouteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
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
         * <p>The ID of the canary release rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
