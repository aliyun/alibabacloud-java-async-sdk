// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentVertexExtendInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentVertexExtendInfoRequest</p>
 */
public class QueryIncidentVertexExtendInfoRequest extends Request {
    @Body
    @NameInMap("Offset")
    private Long offset;

    @Body
    @NameInMap("RelationType")
    @Validation(required = true)
    private String relationType;

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

    private QueryIncidentVertexExtendInfoRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.relationType = builder.relationType;
        this.size = builder.size;
        this.vertexId = builder.vertexId;
        this.vertexLabel = builder.vertexLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentVertexExtendInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
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

    public static final class Builder extends Request.Builder<QueryIncidentVertexExtendInfoRequest, Builder> {
        private Long offset; 
        private String relationType; 
        private Integer size; 
        private String vertexId; 
        private String vertexLabel; 

        private Builder() {
            super();
        } 

        private Builder(QueryIncidentVertexExtendInfoRequest request) {
            super(request);
            this.offset = request.offset;
            this.relationType = request.relationType;
            this.size = request.size;
            this.vertexId = request.vertexId;
            this.vertexLabel = request.vertexLabel;
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
         * The type of the edge that you want to query. Valid values include but are not limited to:
         * <p>
         * 
         * *   **process_exec_file:** A process executes a file.
         * *   **process_connect_ip:** A process connects to an IP address.
         * *   **domain_trgger_alert:** A domain name triggers an alert.
         */
        public Builder relationType(String relationType) {
            this.putBodyParameter("RelationType", relationType);
            this.relationType = relationType;
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
        public QueryIncidentVertexExtendInfoRequest build() {
            return new QueryIncidentVertexExtendInfoRequest(this);
        } 

    } 

}
