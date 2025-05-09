// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link EdgeClusterAddEdgeMachineRequest} extends {@link RequestModel}
 *
 * <p>EdgeClusterAddEdgeMachineRequest</p>
 */
public class EdgeClusterAddEdgeMachineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterid;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("edge_machineid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String edgeMachineid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expired")
    private Long expired;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private String options;

    private EdgeClusterAddEdgeMachineRequest(Builder builder) {
        super(builder);
        this.clusterid = builder.clusterid;
        this.edgeMachineid = builder.edgeMachineid;
        this.expired = builder.expired;
        this.nodepoolId = builder.nodepoolId;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EdgeClusterAddEdgeMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterid
     */
    public String getClusterid() {
        return this.clusterid;
    }

    /**
     * @return edgeMachineid
     */
    public String getEdgeMachineid() {
        return this.edgeMachineid;
    }

    /**
     * @return expired
     */
    public Long getExpired() {
        return this.expired;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<EdgeClusterAddEdgeMachineRequest, Builder> {
        private String clusterid; 
        private String edgeMachineid; 
        private Long expired; 
        private String nodepoolId; 
        private String options; 

        private Builder() {
            super();
        } 

        private Builder(EdgeClusterAddEdgeMachineRequest request) {
            super(request);
            this.clusterid = request.clusterid;
            this.edgeMachineid = request.edgeMachineid;
            this.expired = request.expired;
            this.nodepoolId = request.nodepoolId;
            this.options = request.options;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c35607f52179f4472a0d9723e7595****</p>
         */
        public Builder clusterid(String clusterid) {
            this.putPathParameter("clusterid", clusterid);
            this.clusterid = clusterid;
            return this;
        }

        /**
         * <p>The ID of the cloud-native box.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>edge_machineid</p>
         */
        public Builder edgeMachineid(String edgeMachineid) {
            this.putPathParameter("edge_machineid", edgeMachineid);
            this.edgeMachineid = edgeMachineid;
            return this;
        }

        /**
         * <p>The timeout period of sessions. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder expired(Long expired) {
            this.putBodyParameter("expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * <p>The node pool ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c26607f52179f4472a0d9723e7595****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>The options that you want to configure.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;enableIptables&quot;:true,&quot;quiet&quot;:true,&quot;manageRuntime&quot;:true,&quot;allowedClusterAddons&quot;:[&quot;kube-proxy&quot;,&quot;flannel&quot;,&quot;coredns&quot;]}&quot;</p>
         */
        public Builder options(String options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        @Override
        public EdgeClusterAddEdgeMachineRequest build() {
            return new EdgeClusterAddEdgeMachineRequest(this);
        } 

    } 

}
