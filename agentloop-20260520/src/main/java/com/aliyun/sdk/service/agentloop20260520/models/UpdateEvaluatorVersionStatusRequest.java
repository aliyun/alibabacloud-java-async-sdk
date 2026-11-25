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
 * {@link UpdateEvaluatorVersionStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateEvaluatorVersionStatusRequest</p>
 */
public class UpdateEvaluatorVersionStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expectedStatus")
    private String expectedStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionDescription")
    private String versionDescription;

    private UpdateEvaluatorVersionStatusRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.name = builder.name;
        this.expectedStatus = builder.expectedStatus;
        this.status = builder.status;
        this.version = builder.version;
        this.versionDescription = builder.versionDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEvaluatorVersionStatusRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return expectedStatus
     */
    public String getExpectedStatus() {
        return this.expectedStatus;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public static final class Builder extends Request.Builder<UpdateEvaluatorVersionStatusRequest, Builder> {
        private String agentSpace; 
        private String name; 
        private String expectedStatus; 
        private String status; 
        private String version; 
        private String versionDescription; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEvaluatorVersionStatusRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.name = request.name;
            this.expectedStatus = request.expectedStatus;
            this.status = request.status;
            this.version = request.version;
            this.versionDescription = request.versionDescription;
        } 

        /**
         * <p>The name of the AgentSpace to which the evaluator belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The name of the custom evaluator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>answer-quality</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The expected current status. Valid values: DRAFT, PUBLISHED, and OFFLINE. If the specified value does not match the actual status, the API operation returns a 409 error.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        public Builder expectedStatus(String expectedStatus) {
            this.putBodyParameter("expectedStatus", expectedStatus);
            this.expectedStatus = expectedStatus;
            return this;
        }

        /**
         * <p>The target status. PUBLISHED indicates publishing a draft for the first time or bringing an offline version back online. OFFLINE indicates taking a published version offline.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The version number to update. The maximum length is 64 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The version description that you can provide when publishing a draft for the first time. The maximum length is 256 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Added scoring rules for answer accuracy</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("versionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        @Override
        public UpdateEvaluatorVersionStatusRequest build() {
            return new UpdateEvaluatorVersionStatusRequest(this);
        } 

    } 

}
