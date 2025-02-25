// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link UpdateWorkItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkItemRequest</p>
 */
public class UpdateWorkItemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fieldType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("propertyKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String propertyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("propertyValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String propertyValue;

    private UpdateWorkItemRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.fieldType = builder.fieldType;
        this.identifier = builder.identifier;
        this.propertyKey = builder.propertyKey;
        this.propertyValue = builder.propertyValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return fieldType
     */
    public String getFieldType() {
        return this.fieldType;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return propertyKey
     */
    public String getPropertyKey() {
        return this.propertyKey;
    }

    /**
     * @return propertyValue
     */
    public String getPropertyValue() {
        return this.propertyValue;
    }

    public static final class Builder extends Request.Builder<UpdateWorkItemRequest, Builder> {
        private String organizationId; 
        private String fieldType; 
        private String identifier; 
        private String propertyKey; 
        private String propertyValue; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkItemRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.fieldType = request.fieldType;
            this.identifier = request.identifier;
            this.propertyKey = request.propertyKey;
            this.propertyValue = request.propertyValue;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>subject</p>
         */
        public Builder fieldType(String fieldType) {
            this.putBodyParameter("fieldType", fieldType);
            this.fieldType = fieldType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e8b2xxxxxx2abdxxxxxxxx23</p>
         */
        public Builder identifier(String identifier) {
            this.putBodyParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>subject</p>
         */
        public Builder propertyKey(String propertyKey) {
            this.putBodyParameter("propertyKey", propertyKey);
            this.propertyKey = propertyKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>newValue</p>
         */
        public Builder propertyValue(String propertyValue) {
            this.putBodyParameter("propertyValue", propertyValue);
            this.propertyValue = propertyValue;
            return this;
        }

        @Override
        public UpdateWorkItemRequest build() {
            return new UpdateWorkItemRequest(this);
        } 

    } 

}
