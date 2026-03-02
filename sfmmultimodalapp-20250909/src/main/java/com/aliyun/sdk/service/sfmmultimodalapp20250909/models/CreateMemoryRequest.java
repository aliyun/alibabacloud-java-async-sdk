// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link CreateMemoryRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryRequest</p>
 */
public class CreateMemoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessagesJson")
    private String messagesJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetaData")
    private java.util.Map<String, String> metaData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefinedId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userDefinedId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateMemoryRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.content = builder.content;
        this.messagesJson = builder.messagesJson;
        this.metaData = builder.metaData;
        this.projectId = builder.projectId;
        this.userDefinedId = builder.userDefinedId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return messagesJson
     */
    public String getMessagesJson() {
        return this.messagesJson;
    }

    /**
     * @return metaData
     */
    public java.util.Map<String, String> getMetaData() {
        return this.metaData;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return userDefinedId
     */
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateMemoryRequest, Builder> {
        private String appId; 
        private String content; 
        private String messagesJson; 
        private java.util.Map<String, String> metaData; 
        private String projectId; 
        private String userDefinedId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryRequest request) {
            super(request);
            this.appId = request.appId;
            this.content = request.content;
            this.messagesJson = request.messagesJson;
            this.metaData = request.metaData;
            this.projectId = request.projectId;
            this.userDefinedId = request.userDefinedId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * MessagesJson.
         */
        public Builder messagesJson(String messagesJson) {
            this.putQueryParameter("MessagesJson", messagesJson);
            this.messagesJson = messagesJson;
            return this;
        }

        /**
         * MetaData.
         */
        public Builder metaData(java.util.Map<String, String> metaData) {
            String metaDataShrink = shrink(metaData, "MetaData", "json");
            this.putQueryParameter("MetaData", metaDataShrink);
            this.metaData = metaData;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CD51C0ED-4666-13DA-BC7D-C0D21CBE16C9</p>
         */
        public Builder userDefinedId(String userDefinedId) {
            this.putQueryParameter("UserDefinedId", userDefinedId);
            this.userDefinedId = userDefinedId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-jb5sabg80b4ts71g</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateMemoryRequest build() {
            return new CreateMemoryRequest(this);
        } 

    } 

}
