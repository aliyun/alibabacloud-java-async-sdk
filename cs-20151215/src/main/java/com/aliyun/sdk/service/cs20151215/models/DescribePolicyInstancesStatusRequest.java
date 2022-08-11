// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyInstancesStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyInstancesStatusRequest</p>
 */
public class DescribePolicyInstancesStatusRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    private DescribePolicyInstancesStatusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyInstancesStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<DescribePolicyInstancesStatusRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyInstancesStatusRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * 目标集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DescribePolicyInstancesStatusRequest build() {
            return new DescribePolicyInstancesStatusRequest(this);
        } 

    } 

}
