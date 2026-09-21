// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link UpdateDatasetRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetRequest</p>
 */
public class UpdateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("datasetName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("renames")
    private java.util.List<Renames> renames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schema")
    private java.util.Map<String, IndexKey> schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateDatasetRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.datasetName = builder.datasetName;
        this.description = builder.description;
        this.renames = builder.renames;
        this.schema = builder.schema;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
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
     * @return renames
     */
    public java.util.List<Renames> getRenames() {
        return this.renames;
    }

    /**
     * @return schema
     */
    public java.util.Map<String, IndexKey> getSchema() {
        return this.schema;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetRequest, Builder> {
        private String agentSpace; 
        private String datasetName; 
        private String description; 
        private java.util.List<Renames> renames; 
        private java.util.Map<String, IndexKey> schema; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.datasetName = request.datasetName;
            this.description = request.description;
            this.renames = request.renames;
            this.schema = request.schema;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The name of the agent space.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sop-agent</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The name of the dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product_faq_dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putPathParameter("datasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>backend by serverless devs</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The field renames for the dataset.</p>
         */
        public Builder renames(java.util.List<Renames> renames) {
            this.putBodyParameter("renames", renames);
            this.renames = renames;
            return this;
        }

        /**
         * <p>The table schema of the dataset.</p>
         */
        public Builder schema(java.util.Map<String, IndexKey> schema) {
            this.putBodyParameter("schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * <p>The idempotency token. A unique string generated by the client to ensure that the update operation is idempotent.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateDatasetRequest build() {
            return new UpdateDatasetRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDatasetRequest} extends {@link TeaModel}
     *
     * <p>UpdateDatasetRequest</p>
     */
    public static class Renames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("newName")
        private String newName;

        @com.aliyun.core.annotation.NameInMap("oldName")
        private String oldName;

        private Renames(Builder builder) {
            this.newName = builder.newName;
            this.oldName = builder.oldName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Renames create() {
            return builder().build();
        }

        /**
         * @return newName
         */
        public String getNewName() {
            return this.newName;
        }

        /**
         * @return oldName
         */
        public String getOldName() {
            return this.oldName;
        }

        public static final class Builder {
            private String newName; 
            private String oldName; 

            private Builder() {
            } 

            private Builder(Renames model) {
                this.newName = model.newName;
                this.oldName = model.oldName;
            } 

            /**
             * <p>The new field name.</p>
             * 
             * <strong>example:</strong>
             * <p>t2</p>
             */
            public Builder newName(String newName) {
                this.newName = newName;
                return this;
            }

            /**
             * <p>The original field name.</p>
             * 
             * <strong>example:</strong>
             * <p>t1</p>
             */
            public Builder oldName(String oldName) {
                this.oldName = oldName;
                return this;
            }

            public Renames build() {
                return new Renames(this);
            } 

        } 

    }
}
