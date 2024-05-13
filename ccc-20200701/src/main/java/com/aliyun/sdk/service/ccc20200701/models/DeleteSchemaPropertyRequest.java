// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSchemaPropertyRequest} extends {@link RequestModel}
 *
 * <p>DeleteSchemaPropertyRequest</p>
 */
public class DeleteSchemaPropertyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String propertyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaId;

    private DeleteSchemaPropertyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.propertyName = builder.propertyName;
        this.requestId = builder.requestId;
        this.schemaId = builder.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSchemaPropertyRequest create() {
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
     * @return propertyName
     */
    public String getPropertyName() {
        return this.propertyName;
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

    public static final class Builder extends Request.Builder<DeleteSchemaPropertyRequest, Builder> {
        private String instanceId; 
        private String propertyName; 
        private String requestId; 
        private String schemaId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSchemaPropertyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.propertyName = request.propertyName;
            this.requestId = request.requestId;
            this.schemaId = request.schemaId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PropertyName.
         */
        public Builder propertyName(String propertyName) {
            this.putBodyParameter("PropertyName", propertyName);
            this.propertyName = propertyName;
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
         * schema id
         */
        public Builder schemaId(String schemaId) {
            this.putBodyParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        @Override
        public DeleteSchemaPropertyRequest build() {
            return new DeleteSchemaPropertyRequest(this);
        } 

    } 

}
