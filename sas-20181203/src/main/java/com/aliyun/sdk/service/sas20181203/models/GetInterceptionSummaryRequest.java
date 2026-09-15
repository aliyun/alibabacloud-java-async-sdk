// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetInterceptionSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetInterceptionSummaryRequest</p>
 */
public class GetInterceptionSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeClusterTypes")
    private java.util.List<String> excludeClusterTypes;

    private GetInterceptionSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.excludeClusterTypes = builder.excludeClusterTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionSummaryRequest create() {
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

    /**
     * @return excludeClusterTypes
     */
    public java.util.List<String> getExcludeClusterTypes() {
        return this.excludeClusterTypes;
    }

    public static final class Builder extends Request.Builder<GetInterceptionSummaryRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> excludeClusterTypes; 

        private Builder() {
            super();
        } 

        private Builder(GetInterceptionSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.excludeClusterTypes = request.excludeClusterTypes;
        } 

        /**
         * <p>The ID of the cluster to query. This parameter takes effect only on the InterceptionCountInDays response parameter.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c2999***bb61b</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The list of cluster types to exclude.</p>
         */
        public Builder excludeClusterTypes(java.util.List<String> excludeClusterTypes) {
            this.putQueryParameter("ExcludeClusterTypes", excludeClusterTypes);
            this.excludeClusterTypes = excludeClusterTypes;
            return this;
        }

        @Override
        public GetInterceptionSummaryRequest build() {
            return new GetInterceptionSummaryRequest(this);
        } 

    } 

}
