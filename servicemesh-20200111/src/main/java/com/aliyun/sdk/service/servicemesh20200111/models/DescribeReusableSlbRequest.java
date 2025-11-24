// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeReusableSlbRequest} extends {@link RequestModel}
 *
 * <p>DescribeReusableSlbRequest</p>
 */
public class DescribeReusableSlbRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("K8sClusterId")
    private String k8sClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LbType")
    private String lbType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    private String serviceMeshId;

    private DescribeReusableSlbRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
        this.lbType = builder.lbType;
        this.networkType = builder.networkType;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReusableSlbRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return k8sClusterId
     */
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    /**
     * @return lbType
     */
    public String getLbType() {
        return this.lbType;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeReusableSlbRequest, Builder> {
        private String k8sClusterId; 
        private String lbType; 
        private String networkType; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReusableSlbRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
            this.lbType = request.lbType;
            this.networkType = request.networkType;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The ID of the cluster on the data plane. If you specify this parameter, you cannot specify ServiceMeshId. This parameter and ServiceMeshId cannot be left empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>ca2cfe41fefeb489d9b9dba18a7c5****</p>
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putBodyParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * <p>Load balancer type, value:</p>
         * <ul>
         * <li><p><code>clb</code>: Classic Load Balancer</p>
         * </li>
         * <li><p><code>nlb</code>: Network Load Balancer</p>
         * </li>
         * </ul>
         * <p>default is <code>clb</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>clb</p>
         */
        public Builder lbType(String lbType) {
            this.putBodyParameter("LbType", lbType);
            this.lbType = lbType;
            return this;
        }

        /**
         * <p>The network type of the SLB instance. Valid values:</p>
         * <ul>
         * <li><code>intranet</code></li>
         * <li><code>internet</code></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The ID of the Service Mesh (ASM) instance. If you specify this parameter, you cannot specify K8sClusterId. This parameter and K8sClusterId cannot be left empty at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeReusableSlbRequest build() {
            return new DescribeReusableSlbRequest(this);
        } 

    } 

}
