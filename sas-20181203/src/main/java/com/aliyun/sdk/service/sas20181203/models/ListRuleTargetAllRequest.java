// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRuleTargetAllRequest} extends {@link RequestModel}
 *
 * <p>ListRuleTargetAllRequest</p>
 */
public class ListRuleTargetAllRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private ListRuleTargetAllRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRuleTargetAllRequest create() {
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

    public static final class Builder extends Request.Builder<ListRuleTargetAllRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListRuleTargetAllRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The ID of the container cluster.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~182997~~) operation to query the IDs of container clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ListRuleTargetAllRequest build() {
            return new ListRuleTargetAllRequest(this);
        } 

    } 

}
