// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeManagedClustersRequest</p>
 */
public class DescribeManagedClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private DescribeManagedClustersRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManagedClustersRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeManagedClustersRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeManagedClustersRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The status of the association between the clusters and Service Mesh (ASM).
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DescribeManagedClustersRequest build() {
            return new DescribeManagedClustersRequest(this);
        } 

    } 

}
