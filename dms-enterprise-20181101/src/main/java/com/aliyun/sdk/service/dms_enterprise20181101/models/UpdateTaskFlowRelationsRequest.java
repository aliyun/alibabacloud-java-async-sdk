// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowRelationsRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowRelationsRequest</p>
 */
public class UpdateTaskFlowRelationsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("Edges")
    private java.util.List < Edges> edges;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private UpdateTaskFlowRelationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.edges = builder.edges;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskFlowRelationsRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateTaskFlowRelationsRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private java.util.List < Edges> edges; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskFlowRelationsRequest request) {
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
         * The list of task flow edges to be updated.
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
         * >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateTaskFlowRelationsRequest build() {
            return new UpdateTaskFlowRelationsRequest(this);
        } 

    } 

    public static class Edges extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("NodeEnd")
        private Long nodeEnd;

        @NameInMap("NodeFrom")
        private Long nodeFrom;

        private Edges(Builder builder) {
            this.id = builder.id;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private Long id; 
            private Long nodeEnd; 
            private Long nodeFrom; 

            /**
             * The ID of the task flow edge.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the end node on the edge.
             */
            public Builder nodeEnd(Long nodeEnd) {
                this.nodeEnd = nodeEnd;
                return this;
            }

            /**
             * The ID of the start node on the edge.
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
