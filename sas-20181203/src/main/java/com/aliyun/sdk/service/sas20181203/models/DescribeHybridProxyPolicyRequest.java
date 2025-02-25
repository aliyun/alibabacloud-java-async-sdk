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
 * {@link DescribeHybridProxyPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridProxyPolicyRequest</p>
 */
public class DescribeHybridProxyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    private DescribeHybridProxyPolicyRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridProxyPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    public static final class Builder extends Request.Builder<DescribeHybridProxyPolicyRequest, Builder> {
        private String clusterName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridProxyPolicyRequest request) {
            super(request);
            this.clusterName = request.clusterName;
        } 

        /**
         * <p>The name of the proxy cluster. You can query the name of the proxy cluster in the Security Center console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-idc</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        @Override
        public DescribeHybridProxyPolicyRequest build() {
            return new DescribeHybridProxyPolicyRequest(this);
        } 

    } 

}
