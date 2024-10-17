// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTaskFlowEdgesByConditionRequest} extends {@link RequestModel}
 *
 * <p>ListTaskFlowEdgesByConditionRequest</p>
 */
public class ListTaskFlowEdgesByConditionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeEnd")
    private Long nodeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeFrom")
    private Long nodeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListTaskFlowEdgesByConditionRequest(Builder builder) {
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

    public static ListTaskFlowEdgesByConditionRequest create() {
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

    public static final class Builder extends Request.Builder<ListTaskFlowEdgesByConditionRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Long id; 
        private Long nodeEnd; 
        private Long nodeFrom; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskFlowEdgesByConditionRequest request) {
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
         * <p>The ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15***</p>
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * <p>The ID of the task flow edge.</p>
         * 
         * <strong>example:</strong>
         * <p>24***</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the end node on the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>44***</p>
         */
        public Builder nodeEnd(Long nodeEnd) {
            this.putQueryParameter("NodeEnd", nodeEnd);
            this.nodeEnd = nodeEnd;
            return this;
        }

        /**
         * <p>The ID of the start node on the edge.</p>
         * 
         * <strong>example:</strong>
         * <p>44***</p>
         */
        public Builder nodeFrom(Long nodeFrom) {
            this.putQueryParameter("NodeFrom", nodeFrom);
            this.nodeFrom = nodeFrom;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListTaskFlowEdgesByConditionRequest build() {
            return new ListTaskFlowEdgesByConditionRequest(this);
        } 

    } 

}
