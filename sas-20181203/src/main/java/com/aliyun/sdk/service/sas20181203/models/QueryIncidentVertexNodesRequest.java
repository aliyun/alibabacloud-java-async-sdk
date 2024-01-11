// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentVertexNodesRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentVertexNodesRequest</p>
 */
public class QueryIncidentVertexNodesRequest extends Request {
    @Body
    @NameInMap("EdgeLabelList")
    private java.util.List < String > edgeLabelList;

    @Body
    @NameInMap("Offset")
    private Long offset;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("VertexId")
    @Validation(required = true)
    private String vertexId;

    @Body
    @NameInMap("VertexLabel")
    @Validation(required = true)
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
         * The types of the edges that you want to query.
         */
        public Builder edgeLabelList(java.util.List < String > edgeLabelList) {
            String edgeLabelListShrink = shrink(edgeLabelList, "EdgeLabelList", "simple");
            this.putBodyParameter("EdgeLabelList", edgeLabelListShrink);
            this.edgeLabelList = edgeLabelList;
            return this;
        }

        /**
         * The page number. Valid values start from 1.
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The number of entries per page. Valid values start from 1.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * The ID of the node that you want to query.
         * <p>
         * 
         * >  You can call the [QueryIncidentTracingDetail](~~QueryIncidentTracingDetail~~) operation to query the node ID.
         */
        public Builder vertexId(String vertexId) {
            this.putBodyParameter("VertexId", vertexId);
            this.vertexId = vertexId;
            return this;
        }

        /**
         * The node label. Valid values include but are not limited to:
         * <p>
         * 
         * *   **process**
         * *   **file**
         * *   **alert**
         * *   **ip**
         * *   **domain**
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
