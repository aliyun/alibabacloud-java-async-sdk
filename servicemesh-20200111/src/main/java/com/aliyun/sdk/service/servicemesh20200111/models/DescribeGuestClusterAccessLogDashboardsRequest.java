// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestClusterAccessLogDashboardsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGuestClusterAccessLogDashboardsRequest</p>
 */
public class DescribeGuestClusterAccessLogDashboardsRequest extends Request {
    @Body
    @NameInMap("K8sClusterId")
    @Validation(required = true)
    private String k8sClusterId;

    private DescribeGuestClusterAccessLogDashboardsRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestClusterAccessLogDashboardsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return k8sClusterId
     */
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public static final class Builder extends Request.Builder<DescribeGuestClusterAccessLogDashboardsRequest, Builder> {
        private String k8sClusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGuestClusterAccessLogDashboardsRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
        } 

        /**
         * K8sClusterId.
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putBodyParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        @Override
        public DescribeGuestClusterAccessLogDashboardsRequest build() {
            return new DescribeGuestClusterAccessLogDashboardsRequest(this);
        } 

    } 

}
