// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTextGenerationRequest} extends {@link RequestModel}
 *
 * <p>GetTextGenerationRequest</p>
 */
public class GetTextGenerationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("csi_level")
    private String csiLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map < String, String > parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    private GetTextGenerationRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.csiLevel = builder.csiLevel;
        this.messages = builder.messages;
        this.parameters = builder.parameters;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextGenerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return csiLevel
     */
    public String getCsiLevel() {
        return this.csiLevel;
    }

    /**
     * @return messages
     */
    public java.util.List < Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<GetTextGenerationRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private String csiLevel; 
        private java.util.List < Messages> messages; 
        private java.util.Map < String, String > parameters; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(GetTextGenerationRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.csiLevel = request.csiLevel;
            this.messages = request.messages;
            this.parameters = request.parameters;
            this.stream = request.stream;
        } 

        /**
         * workspace_name.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * service_id.
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * csi_level.
         */
        public Builder csiLevel(String csiLevel) {
            this.putBodyParameter("csi_level", csiLevel);
            this.csiLevel = csiLevel;
            return this;
        }

        /**
         * messages.
         */
        public Builder messages(java.util.List < Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public GetTextGenerationRequest build() {
            return new GetTextGenerationRequest(this);
        } 

    } 

    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
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
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * role.
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
