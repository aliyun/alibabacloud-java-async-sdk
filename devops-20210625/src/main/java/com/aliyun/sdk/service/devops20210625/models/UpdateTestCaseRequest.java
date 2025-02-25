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
 * {@link UpdateTestCaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateTestCaseRequest</p>
 */
public class UpdateTestCaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("testcaseIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testcaseIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updateWorkitemPropertyRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<UpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest;

    private UpdateTestCaseRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.testcaseIdentifier = builder.testcaseIdentifier;
        this.updateWorkitemPropertyRequest = builder.updateWorkitemPropertyRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTestCaseRequest create() {
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
     * @return testcaseIdentifier
     */
    public String getTestcaseIdentifier() {
        return this.testcaseIdentifier;
    }

    /**
     * @return updateWorkitemPropertyRequest
     */
    public java.util.List<UpdateWorkitemPropertyRequest> getUpdateWorkitemPropertyRequest() {
        return this.updateWorkitemPropertyRequest;
    }

    public static final class Builder extends Request.Builder<UpdateTestCaseRequest, Builder> {
        private String organizationId; 
        private String testcaseIdentifier; 
        private java.util.List<UpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTestCaseRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.testcaseIdentifier = request.testcaseIdentifier;
            this.updateWorkitemPropertyRequest = request.updateWorkitemPropertyRequest;
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
         * <p>4e22xxxxxxxxc64c16037fe76</p>
         */
        public Builder testcaseIdentifier(String testcaseIdentifier) {
            this.putPathParameter("testcaseIdentifier", testcaseIdentifier);
            this.testcaseIdentifier = testcaseIdentifier;
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

        @Override
        public UpdateTestCaseRequest build() {
            return new UpdateTestCaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTestCaseRequest} extends {@link TeaModel}
     *
     * <p>UpdateTestCaseRequest</p>
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
             * <p>tc.type</p>
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0a032xx28107xxxx53e87a9</p>
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
