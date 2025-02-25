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
 * {@link GetReleaseStagePipelineRunRequest} extends {@link RequestModel}
 *
 * <p>GetReleaseStagePipelineRunRequest</p>
 */
public class GetReleaseStagePipelineRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("releaseWorkflowSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseWorkflowSn;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("releaseStageSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseStageSn;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("executionNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    private GetReleaseStagePipelineRunRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.releaseWorkflowSn = builder.releaseWorkflowSn;
        this.releaseStageSn = builder.releaseStageSn;
        this.executionNumber = builder.executionNumber;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReleaseStagePipelineRunRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return releaseWorkflowSn
     */
    public String getReleaseWorkflowSn() {
        return this.releaseWorkflowSn;
    }

    /**
     * @return releaseStageSn
     */
    public String getReleaseStageSn() {
        return this.releaseStageSn;
    }

    /**
     * @return executionNumber
     */
    public String getExecutionNumber() {
        return this.executionNumber;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<GetReleaseStagePipelineRunRequest, Builder> {
        private String appName; 
        private String releaseWorkflowSn; 
        private String releaseStageSn; 
        private String executionNumber; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(GetReleaseStagePipelineRunRequest request) {
            super(request);
            this.appName = request.appName;
            this.releaseWorkflowSn = request.releaseWorkflowSn;
            this.releaseStageSn = request.releaseStageSn;
            this.executionNumber = request.executionNumber;
            this.organizationId = request.organizationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce51b31b996246ecaf8747368383****</p>
         */
        public Builder releaseWorkflowSn(String releaseWorkflowSn) {
            this.putPathParameter("releaseWorkflowSn", releaseWorkflowSn);
            this.releaseWorkflowSn = releaseWorkflowSn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e173f3c11db5445eb426ca33c922****</p>
         */
        public Builder releaseStageSn(String releaseStageSn) {
            this.putPathParameter("releaseStageSn", releaseStageSn);
            this.releaseStageSn = releaseStageSn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder executionNumber(String executionNumber) {
            this.putPathParameter("executionNumber", executionNumber);
            this.executionNumber = executionNumber;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public GetReleaseStagePipelineRunRequest build() {
            return new GetReleaseStagePipelineRunRequest(this);
        } 

    } 

}
