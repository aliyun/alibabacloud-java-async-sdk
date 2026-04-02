// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("datasetName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schema")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, IndexKey> schema;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.datasetName = builder.datasetName;
        this.description = builder.description;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return schema
     */
    public java.util.Map<String, IndexKey> getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String workspace; 
        private String datasetName; 
        private String description; 
        private java.util.Map<String, IndexKey> schema; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.datasetName = request.datasetName;
            this.description = request.description;
            this.schema = request.schema;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("datasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder schema(java.util.Map<String, IndexKey> schema) {
            this.putBodyParameter("schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

}
