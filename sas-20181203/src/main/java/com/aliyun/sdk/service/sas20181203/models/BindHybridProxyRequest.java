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
 * {@link BindHybridProxyRequest} extends {@link RequestModel}
 *
 * <p>BindHybridProxyRequest</p>
 */
public class BindHybridProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YundunUuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> yundunUuids;

    private BindHybridProxyRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.yundunUuids = builder.yundunUuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindHybridProxyRequest create() {
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

    /**
     * @return yundunUuids
     */
    public java.util.List<String> getYundunUuids() {
        return this.yundunUuids;
    }

    public static final class Builder extends Request.Builder<BindHybridProxyRequest, Builder> {
        private String clusterName; 
        private java.util.List<String> yundunUuids; 

        private Builder() {
            super();
        } 

        private Builder(BindHybridProxyRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.yundunUuids = request.yundunUuids;
        } 

        /**
         * <p>The name of the proxy cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-proxy</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The UUIDs of servers that you want to add to Security Center over the proxy server.</p>
         * <p>This parameter is required.</p>
         */
        public Builder yundunUuids(java.util.List<String> yundunUuids) {
            this.putQueryParameter("YundunUuids", yundunUuids);
            this.yundunUuids = yundunUuids;
            return this;
        }

        @Override
        public BindHybridProxyRequest build() {
            return new BindHybridProxyRequest(this);
        } 

    } 

}
