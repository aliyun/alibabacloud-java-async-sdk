// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EdgeClusterAddEdgeMachineRequest} extends {@link RequestModel}
 *
 * <p>EdgeClusterAddEdgeMachineRequest</p>
 */
public class EdgeClusterAddEdgeMachineRequest extends Request {
    @Path
    @NameInMap("clusterid")
    @Validation(required = true)
    private String clusterid;

    @Path
    @NameInMap("edge_machineid")
    @Validation(required = true)
    private String edgeMachineid;

    @Body
    @NameInMap("expired")
    private Long expired;

    @Body
    @NameInMap("nodepool_id")
    @Validation(required = true)
    private String nodepoolId;

    @Body
    @NameInMap("options")
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
         * cluster id
         */
        public Builder clusterid(String clusterid) {
            this.putPathParameter("clusterid", clusterid);
            this.clusterid = clusterid;
            return this;
        }

        /**
         * edge machine id
         */
        public Builder edgeMachineid(String edgeMachineid) {
            this.putPathParameter("edge_machineid", edgeMachineid);
            this.edgeMachineid = edgeMachineid;
            return this;
        }

        /**
         * expired
         */
        public Builder expired(Long expired) {
            this.putBodyParameter("expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * nodepool_id
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * options
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
