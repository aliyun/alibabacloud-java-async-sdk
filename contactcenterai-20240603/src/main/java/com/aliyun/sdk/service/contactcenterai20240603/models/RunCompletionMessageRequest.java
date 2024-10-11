// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunCompletionMessageRequest} extends {@link RequestModel}
 *
 * <p>RunCompletionMessageRequest</p>
 */
public class RunCompletionMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelCode")
    private String modelCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stream")
    private Boolean stream;

    private RunCompletionMessageRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.messages = builder.messages;
        this.modelCode = builder.modelCode;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCompletionMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return messages
     */
    public java.util.List < Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<RunCompletionMessageRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private String regionId; 
        private java.util.List < Messages> messages; 
        private String modelCode; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(RunCompletionMessageRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.messages = request.messages;
            this.modelCode = request.modelCode;
            this.stream = request.stream;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-ik******RVYCKzt</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>097d65c9c7004f8dad2b454850ac232b</p>
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
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
         */
        public Builder messages(java.util.List < Messages> messages) {
            this.putBodyParameter("Messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * ModelCode.
         */
        public Builder modelCode(String modelCode) {
            this.putBodyParameter("ModelCode", modelCode);
            this.modelCode = modelCode;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public RunCompletionMessageRequest build() {
            return new RunCompletionMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunCompletionMessageRequest} extends {@link TeaModel}
     *
     * <p>RunCompletionMessageRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        @com.aliyun.core.annotation.Validation(required = true)
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
