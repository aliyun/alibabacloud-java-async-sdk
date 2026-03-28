// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link UpdateRuntimeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuntimeRequest</p>
 */
public class UpdateRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    private String runtimeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoUpdateImage")
    private Boolean autoUpdateImage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunTimeout")
    private Integer runTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateRuntimeRequest(Builder builder) {
        super(builder);
        this.runtimeId = builder.runtimeId;
        this.action = builder.action;
        this.autoUpdateImage = builder.autoUpdateImage;
        this.runTimeout = builder.runTimeout;
        this.version = builder.version;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return autoUpdateImage
     */
    public Boolean getAutoUpdateImage() {
        return this.autoUpdateImage;
    }

    /**
     * @return runTimeout
     */
    public Integer getRunTimeout() {
        return this.runTimeout;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateRuntimeRequest, Builder> {
        private String runtimeId; 
        private String action; 
        private Boolean autoUpdateImage; 
        private Integer runTimeout; 
        private String version; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuntimeRequest request) {
            super(request);
            this.runtimeId = request.runtimeId;
            this.action = request.action;
            this.autoUpdateImage = request.autoUpdateImage;
            this.runTimeout = request.runTimeout;
            this.version = request.version;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Runtime ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rtime-apje******beaz</p>
         */
        public Builder runtimeId(String runtimeId) {
            this.putPathParameter("RuntimeId", runtimeId);
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * <p>Runtime operation. Valid values:</p>
         * <ul>
         * <li>Start: Startup runtime</li>
         * <li>Stop: Stop runtime</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Start</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("Action", action);
            this.action = action;
            return this;
        }

        /**
         * AutoUpdateImage.
         */
        public Builder autoUpdateImage(Boolean autoUpdateImage) {
            this.putBodyParameter("AutoUpdateImage", autoUpdateImage);
            this.autoUpdateImage = autoUpdateImage;
            return this;
        }

        /**
         * <p>Timeout in seconds for a single test executed on the runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder runTimeout(Integer runTimeout) {
            this.putBodyParameter("RunTimeout", runTimeout);
            this.runTimeout = runTimeout;
            return this;
        }

        /**
         * <p>Runtime image version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. To obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateRuntimeRequest build() {
            return new UpdateRuntimeRequest(this);
        } 

    } 

}
