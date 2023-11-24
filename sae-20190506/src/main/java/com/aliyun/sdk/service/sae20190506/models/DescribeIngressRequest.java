// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIngressRequest} extends {@link RequestModel}
 *
 * <p>DescribeIngressRequest</p>
 */
public class DescribeIngressRequest extends Request {
    @Query
    @NameInMap("IngressId")
    @Validation(required = true)
    private Long ingressId;

    private DescribeIngressRequest(Builder builder) {
        super(builder);
        this.ingressId = builder.ingressId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIngressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ingressId
     */
    public Long getIngressId() {
        return this.ingressId;
    }

    public static final class Builder extends Request.Builder<DescribeIngressRequest, Builder> {
        private Long ingressId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIngressRequest request) {
            super(request);
            this.ingressId = request.ingressId;
        } 

        /**
         * The returned data.
         */
        public Builder ingressId(Long ingressId) {
            this.putQueryParameter("IngressId", ingressId);
            this.ingressId = ingressId;
            return this;
        }

        @Override
        public DescribeIngressRequest build() {
            return new DescribeIngressRequest(this);
        } 

    } 

}
