// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyGovernanceInClusterRequest} extends {@link RequestModel}
 *
 * <p>DescribePolicyGovernanceInClusterRequest</p>
 */
public class DescribePolicyGovernanceInClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private DescribePolicyGovernanceInClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyGovernanceInClusterRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePolicyGovernanceInClusterRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolicyGovernanceInClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The ID of the master instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DescribePolicyGovernanceInClusterRequest build() {
            return new DescribePolicyGovernanceInClusterRequest(this);
        } 

    } 

}
