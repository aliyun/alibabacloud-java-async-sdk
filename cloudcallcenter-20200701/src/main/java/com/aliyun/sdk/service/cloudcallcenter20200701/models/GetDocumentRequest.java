// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

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
 * {@link GetDocumentRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentRequest</p>
 */
public class GetDocumentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaId;

    private GetDocumentRequest(Builder builder) {
        super(builder);
        this.documentId = builder.documentId;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.schemaId = builder.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemaId
     */
    public String getSchemaId() {
        return this.schemaId;
    }

    public static final class Builder extends Request.Builder<GetDocumentRequest, Builder> {
        private String documentId; 
        private String instanceId; 
        private String requestId; 
        private String schemaId; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentRequest request) {
            super(request);
            this.documentId = request.documentId;
            this.instanceId = request.instanceId;
            this.requestId = request.requestId;
            this.schemaId = request.schemaId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>51e155ce-3747-4f21-b402-13c69597b920</p>
         */
        public Builder documentId(String documentId) {
            this.putBodyParameter("DocumentId", documentId);
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>schema id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>profile</p>
         */
        public Builder schemaId(String schemaId) {
            this.putBodyParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        @Override
        public GetDocumentRequest build() {
            return new GetDocumentRequest(this);
        } 

    } 

}
