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
            this.runTimeout = request.runTimeout;
            this.version = request.version;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RuntimeId.
         */
        public Builder runtimeId(String runtimeId) {
            this.putPathParameter("RuntimeId", runtimeId);
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * Action.
         */
        public Builder action(String action) {
            this.putBodyParameter("Action", action);
            this.action = action;
            return this;
        }

        /**
         * RunTimeout.
         */
        public Builder runTimeout(Integer runTimeout) {
            this.putBodyParameter("RunTimeout", runTimeout);
            this.runTimeout = runTimeout;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        /**
         * WorkspaceId.
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
