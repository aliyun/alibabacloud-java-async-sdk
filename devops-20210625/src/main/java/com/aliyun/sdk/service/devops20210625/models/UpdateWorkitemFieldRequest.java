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
 * {@link UpdateWorkitemFieldRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkitemFieldRequest</p>
 */
public class UpdateWorkitemFieldRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updateWorkitemPropertyRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<UpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemIdentifier;

    private UpdateWorkitemFieldRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.updateWorkitemPropertyRequest = builder.updateWorkitemPropertyRequest;
        this.workitemIdentifier = builder.workitemIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkitemFieldRequest create() {
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
     * @return updateWorkitemPropertyRequest
     */
    public java.util.List<UpdateWorkitemPropertyRequest> getUpdateWorkitemPropertyRequest() {
        return this.updateWorkitemPropertyRequest;
    }

    /**
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    public static final class Builder extends Request.Builder<UpdateWorkitemFieldRequest, Builder> {
        private String organizationId; 
        private java.util.List<UpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest; 
        private String workitemIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkitemFieldRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.updateWorkitemPropertyRequest = request.updateWorkitemPropertyRequest;
            this.workitemIdentifier = request.workitemIdentifier;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60ee8a814690c27532d412f8</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateWorkitemPropertyRequest(java.util.List<UpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest) {
            this.putBodyParameter("updateWorkitemPropertyRequest", updateWorkitemPropertyRequest);
            this.updateWorkitemPropertyRequest = updateWorkitemPropertyRequest;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9144ef6b72d8exxxxx9e61a4d0</p>
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putBodyParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        @Override
        public UpdateWorkitemFieldRequest build() {
            return new UpdateWorkitemFieldRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkitemFieldRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkitemFieldRequest</p>
     */
    public static class UpdateWorkitemPropertyRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldIdentifier")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldIdentifier;

        @com.aliyun.core.annotation.NameInMap("fieldValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldValue;

        private UpdateWorkitemPropertyRequest(Builder builder) {
            this.fieldIdentifier = builder.fieldIdentifier;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateWorkitemPropertyRequest create() {
            return builder().build();
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldIdentifier; 
            private String fieldValue; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>tag</p>
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public UpdateWorkitemPropertyRequest build() {
                return new UpdateWorkitemPropertyRequest(this);
            } 

        } 

    }
}
