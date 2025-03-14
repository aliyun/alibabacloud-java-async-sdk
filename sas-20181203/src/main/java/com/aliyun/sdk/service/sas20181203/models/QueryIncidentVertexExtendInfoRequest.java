// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link QueryIncidentVertexExtendInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentVertexExtendInfoRequest</p>
 */
public class QueryIncidentVertexExtendInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RelationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relationType;

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
         * <p>The type of the edge that you want to query. Valid values include but are not limited to:</p>
         * <ul>
         * <li><strong>process_exec_file:</strong> A process executes a file.</li>
         * <li><strong>process_connect_ip:</strong> A process connects to an IP address.</li>
         * <li><strong>domain_trgger_alert:</strong> A domain name triggers an alert.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>process_connect_ip</p>
         */
        public Builder relationType(String relationType) {
            this.putBodyParameter("RelationType", relationType);
            this.relationType = relationType;
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
         * <p>29872354f741b1b044b8a9b4e2ab0535</p>
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
        public QueryIncidentVertexExtendInfoRequest build() {
            return new QueryIncidentVertexExtendInfoRequest(this);
        } 

    } 

}
