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
 * {@link ModifyHybridProxyPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridProxyPolicyRequest</p>
 */
public class ModifyHybridProxyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyInfo;

    private ModifyHybridProxyPolicyRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.policyInfo = builder.policyInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridProxyPolicyRequest create() {
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
     * @return policyInfo
     */
    public String getPolicyInfo() {
        return this.policyInfo;
    }

    public static final class Builder extends Request.Builder<ModifyHybridProxyPolicyRequest, Builder> {
        private String clusterName; 
        private String policyInfo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridProxyPolicyRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.policyInfo = request.policyInfo;
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
         * <p>The policy of the proxy cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;policyType&quot;: &quot;limitFrequency&quot;,
         *         &quot;info&quot;:
         *         [
         *             {
         *                 &quot;type&quot;: &quot;file&quot;,
         *                 &quot;config&quot;: &quot;10&quot;
         *             }
         *         ]
         *     },
         *     {
         *         &quot;policyType&quot;: &quot;limitBandWidth&quot;,
         *         &quot;info&quot;:
         *         [
         *             {
         *                 &quot;type&quot;: &quot;net&quot;
         *             },
         *             {
         *                 &quot;type&quot;: &quot;process&quot;
         *             }
         *         ]
         *     }
         * ]</p>
         */
        public Builder policyInfo(String policyInfo) {
            this.putQueryParameter("PolicyInfo", policyInfo);
            this.policyInfo = policyInfo;
            return this;
        }

        @Override
        public ModifyHybridProxyPolicyRequest build() {
            return new ModifyHybridProxyPolicyRequest(this);
        } 

    } 

}
