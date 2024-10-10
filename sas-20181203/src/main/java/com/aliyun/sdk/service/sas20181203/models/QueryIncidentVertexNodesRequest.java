// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIncidentVertexNodesRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentVertexNodesRequest</p>
 */
public class QueryIncidentVertexNodesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EdgeLabelList")
    private java.util.List < String > edgeLabelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VertexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vertexId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VertexLabel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vertexLabel;

    private QueryIncidentVertexNodesRequest(Builder builder) {
        super(builder);
        this.edgeLabelList = builder.edgeLabelList;
        this.offset = builder.offset;
        this.size = builder.size;
        this.vertexId = builder.vertexId;
        this.vertexLabel = builder.vertexLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentVertexNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeLabelList
     */
    public java.util.List < String > getEdgeLabelList() {
        return this.edgeLabelList;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return vertexId
     */
    public String getVertexId() {
        return this.vertexId;
    }

    /**
     * @return vertexLabel
     */
    public String getVertexLabel() {
        return this.vertexLabel;
    }

    public static final class Builder extends Request.Builder<QueryIncidentVertexNodesRequest, Builder> {
        private java.util.List < String > edgeLabelList; 
        private Long offset; 
        private Integer size; 
        private String vertexId; 
        private String vertexLabel; 

        private Builder() {
            super();
        } 

        private Builder(QueryIncidentVertexNodesRequest request) {
            super(request);
            this.edgeLabelList = request.edgeLabelList;
            this.offset = request.offset;
            this.size = request.size;
            this.vertexId = request.vertexId;
            this.vertexLabel = request.vertexLabel;
        } 

        /**
         * <p>The types of the edges that you want to query.</p>
         */
        public Builder edgeLabelList(java.util.List < String > edgeLabelList) {
            String edgeLabelListShrink = shrink(edgeLabelList, "EdgeLabelList", "simple");
            this.putBodyParameter("EdgeLabelList", edgeLabelListShrink);
            this.edgeLabelList = edgeLabelList;
            return this;
        }

        /**
         * <p>The page number. Valid values start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The ID of the node that you want to query.</p>
         * <blockquote>
         * <p> You can call the <a href="~~QueryIncidentTracingDetail~~">QueryIncidentTracingDetail</a> operation to query the node ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d6d7738a34cc252219866d223c0093f8</p>
         */
        public Builder vertexId(String vertexId) {
            this.putBodyParameter("VertexId", vertexId);
            this.vertexId = vertexId;
            return this;
        }

        /**
         * <p>The node label. Valid values include but are not limited to:</p>
         * <ul>
         * <li><strong>process</strong></li>
         * <li><strong>file</strong></li>
         * <li><strong>alert</strong></li>
         * <li><strong>ip</strong></li>
         * <li><strong>domain</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>process</p>
         */
        public Builder vertexLabel(String vertexLabel) {
            this.putBodyParameter("VertexLabel", vertexLabel);
            this.vertexLabel = vertexLabel;
            return this;
        }

        @Override
        public QueryIncidentVertexNodesRequest build() {
            return new QueryIncidentVertexNodesRequest(this);
        } 

    } 

}
