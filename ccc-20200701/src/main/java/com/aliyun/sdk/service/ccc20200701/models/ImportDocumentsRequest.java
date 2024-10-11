// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImportDocumentsRequest} extends {@link RequestModel}
 *
 * <p>ImportDocumentsRequest</p>
 */
public class ImportDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssFileKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossFileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaId;

    private ImportDocumentsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ossFileKey = builder.ossFileKey;
        this.requestId = builder.requestId;
        this.schemaId = builder.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDocumentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ossFileKey
     */
    public String getOssFileKey() {
        return this.ossFileKey;
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

    public static final class Builder extends Request.Builder<ImportDocumentsRequest, Builder> {
        private String instanceId; 
        private String ossFileKey; 
        private String requestId; 
        private String schemaId; 

        private Builder() {
            super();
        } 

        private Builder(ImportDocumentsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ossFileKey = request.ossFileKey;
            this.requestId = request.requestId;
            this.schemaId = request.schemaId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b0eb2742-f37e-4c67-82d4-25c651c1c450</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test/test-file.wav</p>
         */
        public Builder ossFileKey(String ossFileKey) {
            this.putBodyParameter("OssFileKey", ossFileKey);
            this.ossFileKey = ossFileKey;
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
        public ImportDocumentsRequest build() {
            return new ImportDocumentsRequest(this);
        } 

    } 

}
