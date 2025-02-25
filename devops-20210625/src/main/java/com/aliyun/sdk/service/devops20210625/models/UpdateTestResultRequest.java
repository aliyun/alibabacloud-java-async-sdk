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
 * {@link UpdateTestResultRequest} extends {@link RequestModel}
 *
 * <p>UpdateTestResultRequest</p>
 */
public class UpdateTestResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("testPlanIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testPlanIdentifier;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("testcaseIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testcaseIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executor")
    private String executor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateTestResultRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.testPlanIdentifier = builder.testPlanIdentifier;
        this.testcaseIdentifier = builder.testcaseIdentifier;
        this.executor = builder.executor;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTestResultRequest create() {
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
     * @return testPlanIdentifier
     */
    public String getTestPlanIdentifier() {
        return this.testPlanIdentifier;
    }

    /**
     * @return testcaseIdentifier
     */
    public String getTestcaseIdentifier() {
        return this.testcaseIdentifier;
    }

    /**
     * @return executor
     */
    public String getExecutor() {
        return this.executor;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateTestResultRequest, Builder> {
        private String organizationId; 
        private String testPlanIdentifier; 
        private String testcaseIdentifier; 
        private String executor; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTestResultRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.testPlanIdentifier = request.testPlanIdentifier;
            this.testcaseIdentifier = request.testcaseIdentifier;
            this.executor = request.executor;
            this.status = request.status;
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
         */
        public Builder testPlanIdentifier(String testPlanIdentifier) {
            this.putPathParameter("testPlanIdentifier", testPlanIdentifier);
            this.testPlanIdentifier = testPlanIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder testcaseIdentifier(String testcaseIdentifier) {
            this.putPathParameter("testcaseIdentifier", testcaseIdentifier);
            this.testcaseIdentifier = testcaseIdentifier;
            return this;
        }

        /**
         * executor.
         */
        public Builder executor(String executor) {
            this.putBodyParameter("executor", executor);
            this.executor = executor;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateTestResultRequest build() {
            return new UpdateTestResultRequest(this);
        } 

    } 

}
