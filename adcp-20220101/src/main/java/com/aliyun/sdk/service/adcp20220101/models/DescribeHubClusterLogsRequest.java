// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClusterLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHubClusterLogsRequest</p>
 */
public class DescribeHubClusterLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private DescribeHubClusterLogsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHubClusterLogsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeHubClusterLogsRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHubClusterLogsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The ID of the Fleet instance. You can call the [DescribeHubClusters](~~424404~~) operation to query the created Fleet instances.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public DescribeHubClusterLogsRequest build() {
            return new DescribeHubClusterLogsRequest(this);
        } 

    } 

}
