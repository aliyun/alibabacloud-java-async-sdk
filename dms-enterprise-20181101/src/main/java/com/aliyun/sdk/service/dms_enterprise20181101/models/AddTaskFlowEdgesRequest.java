// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTaskFlowEdgesRequest} extends {@link RequestModel}
 *
 * <p>AddTaskFlowEdgesRequest</p>
 */
public class AddTaskFlowEdgesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edges")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Edges> edges;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private AddTaskFlowEdgesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.edges = builder.edges;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTaskFlowEdgesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return edges
     */
    public java.util.List < Edges> getEdges() {
        return this.edges;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<AddTaskFlowEdgesRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private java.util.List < Edges> edges; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(AddTaskFlowEdgesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.edges = request.edges;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The list of edges of the task flow.
         */
        public Builder edges(java.util.List < Edges> edges) {
            String edgesShrink = shrink(edges, "Edges", "json");
            this.putQueryParameter("Edges", edgesShrink);
            this.edges = edges;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > : To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public AddTaskFlowEdgesRequest build() {
            return new AddTaskFlowEdgesRequest(this);
        } 

    } 

    public static class Edges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeEnd")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long nodeEnd;

        @com.aliyun.core.annotation.NameInMap("NodeFrom")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long nodeFrom;

        private Edges(Builder builder) {
            this.nodeEnd = builder.nodeEnd;
            this.nodeFrom = builder.nodeFrom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edges create() {
            return builder().build();
        }

        /**
         * @return nodeEnd
         */
        public Long getNodeEnd() {
            return this.nodeEnd;
        }

        /**
         * @return nodeFrom
         */
        public Long getNodeFrom() {
            return this.nodeFrom;
        }

        public static final class Builder {
            private Long nodeEnd; 
            private Long nodeFrom; 

            /**
             * The ID of the node where the end node of the edge is located.
             */
            public Builder nodeEnd(Long nodeEnd) {
                this.nodeEnd = nodeEnd;
                return this;
            }

            /**
             * The ID of the node where the start node of the edge is located.
             */
            public Builder nodeFrom(Long nodeFrom) {
                this.nodeFrom = nodeFrom;
                return this;
            }

            public Edges build() {
                return new Edges(this);
            } 

        } 

    }
}
