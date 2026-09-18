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
 * {@link SaveGraphDraftResourceRequest} extends {@link RequestModel}
 *
 * <p>SaveGraphDraftResourceRequest</p>
 */
public class SaveGraphDraftResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("elementType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elementType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("yamlEdit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yamlEdit;

    private SaveGraphDraftResourceRequest(Builder builder) {
        super(builder);
        this.elementType = builder.elementType;
        this.graphName = builder.graphName;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
        this.tenantId = builder.tenantId;
        this.yamlEdit = builder.yamlEdit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveGraphDraftResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elementType
     */
    public String getElementType() {
        return this.elementType;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
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

    public static final class Builder extends Request.Builder<SaveGraphDraftResourceRequest, Builder> {
        private String elementType; 
        private String graphName; 
        private String resourceName; 
        private String resourceType; 
        private String tenantId; 
        private String yamlEdit; 

        private Builder() {
            super();
        } 

        private Builder(SaveGraphDraftResourceRequest request) {
            super(request);
            this.elementType = request.elementType;
            this.graphName = request.graphName;
            this.resourceName = request.resourceName;
            this.resourceType = request.resourceType;
            this.tenantId = request.tenantId;
            this.yamlEdit = request.yamlEdit;
        } 

        /**
         * <p>The element type. Currently, only text is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>object_type</p>
         */
        public Builder elementType(String elementType) {
            this.putBodyParameter("elementType", elementType);
            this.elementType = elementType;
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
         * <p>The resource name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        public Builder resourceName(String resourceName) {
            this.putBodyParameter("resourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <p>This parameter is set to <strong>instance</strong>, which indicates that the resource type is instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>object</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
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
         * <p>The original YAML text of the graph schema trimmed by READ permissions, with $ref references within the authorized subgraph retained.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name: customer\ndisplay_name: Customer</p>
         */
        public Builder yamlEdit(String yamlEdit) {
            this.putBodyParameter("yamlEdit", yamlEdit);
            this.yamlEdit = yamlEdit;
            return this;
        }

        @Override
        public SaveGraphDraftResourceRequest build() {
            return new SaveGraphDraftResourceRequest(this);
        } 

    } 

}
