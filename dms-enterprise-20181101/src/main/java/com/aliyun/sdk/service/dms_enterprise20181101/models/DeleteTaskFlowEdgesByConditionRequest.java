// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTaskFlowEdgesByConditionRequest} extends {@link RequestModel}
 *
 * <p>DeleteTaskFlowEdgesByConditionRequest</p>
 */
public class DeleteTaskFlowEdgesByConditionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("NodeEnd")
    private Long nodeEnd;

    @Query
    @NameInMap("NodeFrom")
    private Long nodeFrom;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private DeleteTaskFlowEdgesByConditionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.id = builder.id;
        this.nodeEnd = builder.nodeEnd;
        this.nodeFrom = builder.nodeFrom;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTaskFlowEdgesByConditionRequest create() {
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

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<DeleteTaskFlowEdgesByConditionRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Long id; 
        private Long nodeEnd; 
        private Long nodeFrom; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTaskFlowEdgesByConditionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.id = request.id;
            this.nodeEnd = request.nodeEnd;
            this.nodeFrom = request.nodeFrom;
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
         * The ID of the task flow edge to delete.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The ID of the end node of the edge to delete.
         */
        public Builder nodeEnd(Long nodeEnd) {
            this.putQueryParameter("NodeEnd", nodeEnd);
            this.nodeEnd = nodeEnd;
            return this;
        }

        /**
         * The ID of the start node on the edge to delete.
         */
        public Builder nodeFrom(Long nodeFrom) {
            this.putQueryParameter("NodeFrom", nodeFrom);
            this.nodeFrom = nodeFrom;
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
        public DeleteTaskFlowEdgesByConditionRequest build() {
            return new DeleteTaskFlowEdgesByConditionRequest(this);
        } 

    } 

}
