// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SetLiveMpuTaskSeiRequest} extends {@link RequestModel}
 *
 * <p>SetLiveMpuTaskSeiRequest</p>
 */
public class SetLiveMpuTaskSeiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSei")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customSei;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private SetLiveMpuTaskSeiRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.customSei = builder.customSei;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveMpuTaskSeiRequest create() {
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
     * @return customSei
     */
    public String getCustomSei() {
        return this.customSei;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<SetLiveMpuTaskSeiRequest, Builder> {
        private String appId; 
        private String customSei; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveMpuTaskSeiRequest request) {
            super(request);
            this.appId = request.appId;
            this.customSei = request.customSei;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The application ID.</p>
         * <blockquote>
         * <p> The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VKL3***</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The custom SEI.</p>
         * <blockquote>
         * <p> The value is a JSON string that can be up to 4,096 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;myroom&quot;}</p>
         */
        public Builder customSei(String customSei) {
            this.putQueryParameter("CustomSei", customSei);
            this.customSei = customSei;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <blockquote>
         * <p> The ID can be up to 55 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AL-4bce036dd90277c50705b0599wgfffc7</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public SetLiveMpuTaskSeiRequest build() {
            return new SetLiveMpuTaskSeiRequest(this);
        } 

    } 

}
