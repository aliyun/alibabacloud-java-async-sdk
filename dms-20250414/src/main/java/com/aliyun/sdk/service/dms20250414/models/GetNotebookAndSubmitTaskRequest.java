// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetNotebookAndSubmitTaskRequest} extends {@link RequestModel}
 *
 * <p>GetNotebookAndSubmitTaskRequest</p>
 */
public class GetNotebookAndSubmitTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    @com.aliyun.core.annotation.Validation(required = true)
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Retry")
    private Long retry;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetNotebookAndSubmitTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.params = builder.params;
        this.path = builder.path;
        this.retry = builder.retry;
        this.sessionId = builder.sessionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNotebookAndSubmitTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return retry
     */
    public Long getRetry() {
        return this.retry;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetNotebookAndSubmitTaskRequest, Builder> {
        private String regionId; 
        private String params; 
        private String path; 
        private Long retry; 
        private String sessionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetNotebookAndSubmitTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.params = request.params;
            this.path = request.path;
            this.retry = request.retry;
            this.sessionId = request.sessionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dt&quot;: &quot;2022-10-14&quot;}</p>
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/Workspace/code/default/test.ipynb</p>
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * Retry.
         */
        public Builder retry(Long retry) {
            this.putBodyParameter("Retry", retry);
            this.retry = retry;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8vkixxxxx***</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetNotebookAndSubmitTaskRequest build() {
            return new GetNotebookAndSubmitTaskRequest(this);
        } 

    } 

}
