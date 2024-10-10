// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIngressRequest} extends {@link RequestModel}
 *
 * <p>DescribeIngressRequest</p>
 */
public class DescribeIngressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The returned data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
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
