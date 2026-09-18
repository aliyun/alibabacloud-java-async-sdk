// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SaveGraphDraftBatchDefineRequest} extends {@link RequestModel}
 *
 * <p>SaveGraphDraftBatchDefineRequest</p>
 */
public class SaveGraphDraftBatchDefineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("draftChangeIds")
    private java.util.List<Long> draftChangeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("saveMode")
    private String saveMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("yamlEdit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yamlEdit;

    private SaveGraphDraftBatchDefineRequest(Builder builder) {
        super(builder);
        this.draftChangeIds = builder.draftChangeIds;
        this.graphName = builder.graphName;
        this.saveMode = builder.saveMode;
        this.tenantId = builder.tenantId;
        this.yamlEdit = builder.yamlEdit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveGraphDraftBatchDefineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return draftChangeIds
     */
    public java.util.List<Long> getDraftChangeIds() {
        return this.draftChangeIds;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return saveMode
     */
    public String getSaveMode() {
        return this.saveMode;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return yamlEdit
     */
    public String getYamlEdit() {
        return this.yamlEdit;
    }

    public static final class Builder extends Request.Builder<SaveGraphDraftBatchDefineRequest, Builder> {
        private java.util.List<Long> draftChangeIds; 
        private String graphName; 
        private String saveMode; 
        private String tenantId; 
        private String yamlEdit; 

        private Builder() {
            super();
        } 

        private Builder(SaveGraphDraftBatchDefineRequest request) {
            super(request);
            this.draftChangeIds = request.draftChangeIds;
            this.graphName = request.graphName;
            this.saveMode = request.saveMode;
            this.tenantId = request.tenantId;
            this.yamlEdit = request.yamlEdit;
        } 

        /**
         * <p>The list of draft change IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[401001, 401002]</p>
         */
        public Builder draftChangeIds(java.util.List<Long> draftChangeIds) {
            String draftChangeIdsShrink = shrink(draftChangeIds, "draftChangeIds", "json");
            this.putBodyParameter("draftChangeIds", draftChangeIdsShrink);
            this.draftChangeIds = draftChangeIds;
            return this;
        }

        /**
         * <p>The graph name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.putBodyParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>The save mode.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL_YAML</p>
         */
        public Builder saveMode(String saveMode) {
            this.putBodyParameter("saveMode", saveMode);
            this.saveMode = saveMode;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The raw YAML text of the graph schema trimmed by READ permissions, with $ref references retained within the authorized subgraph.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name: crm_graph</p>
         */
        public Builder yamlEdit(String yamlEdit) {
            this.putBodyParameter("yamlEdit", yamlEdit);
            this.yamlEdit = yamlEdit;
            return this;
        }

        @Override
        public SaveGraphDraftBatchDefineRequest build() {
            return new SaveGraphDraftBatchDefineRequest(this);
        } 

    } 

}
