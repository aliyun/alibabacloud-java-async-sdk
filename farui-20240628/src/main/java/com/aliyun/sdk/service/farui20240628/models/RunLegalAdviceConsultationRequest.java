// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunLegalAdviceConsultationRequest} extends {@link RequestModel}
 *
 * <p>RunLegalAdviceConsultationRequest</p>
 */
public class RunLegalAdviceConsultationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistant")
    private Assistant assistant;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thread")
    private Thread thread;

    private RunLegalAdviceConsultationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.assistant = builder.assistant;
        this.stream = builder.stream;
        this.thread = builder.thread;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunLegalAdviceConsultationRequest create() {
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
     * @return assistant
     */
    public Assistant getAssistant() {
        return this.assistant;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return thread
     */
    public Thread getThread() {
        return this.thread;
    }

    public static final class Builder extends Request.Builder<RunLegalAdviceConsultationRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private Assistant assistant; 
        private Boolean stream; 
        private Thread thread; 

        private Builder() {
            super();
        } 

        private Builder(RunLegalAdviceConsultationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.assistant = request.assistant;
            this.stream = request.stream;
            this.thread = request.thread;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * assistant.
         */
        public Builder assistant(Assistant assistant) {
            String assistantShrink = shrink(assistant, "assistant", "json");
            this.putBodyParameter("assistant", assistantShrink);
            this.assistant = assistant;
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

        /**
         * thread.
         */
        public Builder thread(Thread thread) {
            String threadShrink = shrink(thread, "thread", "json");
            this.putBodyParameter("thread", threadShrink);
            this.thread = thread;
            return this;
        }

        @Override
        public RunLegalAdviceConsultationRequest build() {
            return new RunLegalAdviceConsultationRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunLegalAdviceConsultationRequest} extends {@link TeaModel}
     *
     * <p>RunLegalAdviceConsultationRequest</p>
     */
    public static class Assistant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("metaData")
        private java.util.Map < String, String > metaData;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Assistant(Builder builder) {
            this.id = builder.id;
            this.metaData = builder.metaData;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assistant create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metaData
         */
        public java.util.Map < String, String > getMetaData() {
            return this.metaData;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String id; 
            private java.util.Map < String, String > metaData; 
            private String type; 
            private String version; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * metaData.
             */
            public Builder metaData(java.util.Map < String, String > metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Assistant build() {
                return new Assistant(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunLegalAdviceConsultationRequest} extends {@link TeaModel}
     *
     * <p>RunLegalAdviceConsultationRequest</p>
     */
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
    /**
     * 
     * {@link RunLegalAdviceConsultationRequest} extends {@link TeaModel}
     *
     * <p>RunLegalAdviceConsultationRequest</p>
     */
    public static class Thread extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List < Messages> messages;

        private Thread(Builder builder) {
            this.messages = builder.messages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thread create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List < Messages> getMessages() {
            return this.messages;
        }

        public static final class Builder {
            private java.util.List < Messages> messages; 

            /**
             * messages.
             */
            public Builder messages(java.util.List < Messages> messages) {
                this.messages = messages;
                return this;
            }

            public Thread build() {
                return new Thread(this);
            } 

        } 

    }
}
