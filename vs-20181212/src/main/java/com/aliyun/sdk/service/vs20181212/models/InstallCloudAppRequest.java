// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link InstallCloudAppRequest} extends {@link RequestModel}
 *
 * <p>InstallCloudAppRequest</p>
 */
public class InstallCloudAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatchId")
    private String patchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceIds")
    private java.util.List<String> renderingInstanceIds;

    private InstallCloudAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.patchId = builder.patchId;
        this.projectId = builder.projectId;
        this.renderingInstanceId = builder.renderingInstanceId;
        this.renderingInstanceIds = builder.renderingInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallCloudAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return patchId
     */
    public String getPatchId() {
        return this.patchId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return renderingInstanceIds
     */
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

    public static final class Builder extends Request.Builder<InstallCloudAppRequest, Builder> {
        private String appId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String patchId; 
        private String projectId; 
        private String renderingInstanceId; 
        private java.util.List<String> renderingInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(InstallCloudAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.patchId = request.patchId;
            this.projectId = request.projectId;
            this.renderingInstanceId = request.renderingInstanceId;
            this.renderingInstanceIds = request.renderingInstanceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PatchId.
         */
        public Builder patchId(String patchId) {
            this.putQueryParameter("PatchId", patchId);
            this.patchId = patchId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * RenderingInstanceIds.
         */
        public Builder renderingInstanceIds(java.util.List<String> renderingInstanceIds) {
            String renderingInstanceIdsShrink = shrink(renderingInstanceIds, "RenderingInstanceIds", "json");
            this.putQueryParameter("RenderingInstanceIds", renderingInstanceIdsShrink);
            this.renderingInstanceIds = renderingInstanceIds;
            return this;
        }

        @Override
        public InstallCloudAppRequest build() {
            return new InstallCloudAppRequest(this);
        } 

    } 

}
