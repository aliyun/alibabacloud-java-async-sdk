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
 * {@link GetGraphDraftAssembledResponseBody} extends {@link TeaModel}
 *
 * <p>GetGraphDraftAssembledResponseBody</p>
 */
public class GetGraphDraftAssembledResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("yamlEdit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yamlEdit;

    private GetGraphDraftAssembledResponseBody(Builder builder) {
        this.code = builder.code;
        this.graphName = builder.graphName;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schemaVersion = builder.schemaVersion;
        this.yamlEdit = builder.yamlEdit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGraphDraftAssembledResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return yamlEdit
     */
    public String getYamlEdit() {
        return this.yamlEdit;
    }

    public static final class Builder {
        private String code; 
        private String graphName; 
        private String message; 
        private String requestId; 
        private String schemaVersion; 
        private String yamlEdit; 

        private Builder() {
        } 

        private Builder(GetGraphDraftAssembledResponseBody model) {
            this.code = model.code;
            this.graphName = model.graphName;
            this.message = model.message;
            this.requestId = model.requestId;
            this.schemaVersion = model.schemaVersion;
            this.yamlEdit = model.yamlEdit;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The knowledge graph name.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>The raw Graph Schema YAML text trimmed by READ permissions, with $ref references within the authorized subgraph retained.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>objects:\n  - name: customer\n</p>
         */
        public Builder yamlEdit(String yamlEdit) {
            this.yamlEdit = yamlEdit;
            return this;
        }

        public GetGraphDraftAssembledResponseBody build() {
            return new GetGraphDraftAssembledResponseBody(this);
        } 

    } 

}
