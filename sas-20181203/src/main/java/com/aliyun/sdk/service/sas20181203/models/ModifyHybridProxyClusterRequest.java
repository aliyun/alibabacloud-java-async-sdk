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
 * {@link ModifyHybridProxyClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridProxyClusterRequest</p>
 */
public class ModifyHybridProxyClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remark;

    private ModifyHybridProxyClusterRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridProxyClusterRequest create() {
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ModifyHybridProxyClusterRequest, Builder> {
        private String clusterName; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridProxyClusterRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.remark = request.remark;
        } 

        /**
         * <p>The name of the proxy cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-test-cnnf</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public ModifyHybridProxyClusterRequest build() {
            return new ModifyHybridProxyClusterRequest(this);
        } 

    } 

}
