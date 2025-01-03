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
 * {@link ExecuteChangeRequestReleaseStageRequest} extends {@link RequestModel}
 *
 * <p>ExecuteChangeRequestReleaseStageRequest</p>
 */
public class ExecuteChangeRequestReleaseStageRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    private java.util.Map<String, ?> params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    private ExecuteChangeRequestReleaseStageRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.releaseWorkflowSn = builder.releaseWorkflowSn;
        this.releaseStageSn = builder.releaseStageSn;
        this.params = builder.params;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteChangeRequestReleaseStageRequest create() {
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
     * @return params
     */
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<ExecuteChangeRequestReleaseStageRequest, Builder> {
        private String appName; 
        private String releaseWorkflowSn; 
        private String releaseStageSn; 
        private java.util.Map<String, ?> params; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteChangeRequestReleaseStageRequest request) {
            super(request);
            this.appName = request.appName;
            this.releaseWorkflowSn = request.releaseWorkflowSn;
            this.releaseStageSn = request.releaseStageSn;
            this.params = request.params;
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
         * params.
         */
        public Builder params(java.util.Map<String, ?> params) {
            this.putBodyParameter("params", params);
            this.params = params;
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
        public ExecuteChangeRequestReleaseStageRequest build() {
            return new ExecuteChangeRequestReleaseStageRequest(this);
        } 

    } 

}
