// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClusterRuleSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetClusterRuleSummaryRequest</p>
 */
public class GetClusterRuleSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private GetClusterRuleSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterRuleSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<GetClusterRuleSummaryRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterRuleSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc49d88d1exxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public GetClusterRuleSummaryRequest build() {
            return new GetClusterRuleSummaryRequest(this);
        } 

    } 

}
