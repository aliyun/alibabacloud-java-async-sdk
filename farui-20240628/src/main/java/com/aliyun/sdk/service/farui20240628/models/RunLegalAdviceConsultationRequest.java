// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

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
 * {@link RunLegalAdviceConsultationRequest} extends {@link RequestModel}
 *
 * <p>RunLegalAdviceConsultationRequest</p>
 */
public class RunLegalAdviceConsultationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistant")
    private Assistant assistant;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private Extra extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("thread")
    private Thread thread;

    private RunLegalAdviceConsultationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.assistant = builder.assistant;
        this.extra = builder.extra;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return extra
     */
    public Extra getExtra() {
        return this.extra;
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
        private String regionId; 
        private String appId; 
        private Assistant assistant; 
        private Extra extra; 
        private Boolean stream; 
        private Thread thread; 

        private Builder() {
            super();
        } 

        private Builder(RunLegalAdviceConsultationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.assistant = request.assistant;
            this.extra = request.extra;
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
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
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
         * extra.
         */
        public Builder extra(Extra extra) {
            String extraShrink = shrink(extra, "extra", "json");
            this.putBodyParameter("extra", extraShrink);
            this.extra = extra;
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
        private java.util.Map<String, String> metaData;

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
        public java.util.Map<String, String> getMetaData() {
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
            private java.util.Map<String, String> metaData; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(Assistant model) {
                this.id = model.id;
                this.metaData = model.metaData;
                this.type = model.type;
                this.version = model.version;
            } 

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
            public Builder metaData(java.util.Map<String, String> metaData) {
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
    public static class Extra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deepThink")
        private Boolean deepThink;

        @com.aliyun.core.annotation.NameInMap("onlineSearch")
        private Boolean onlineSearch;

        private Extra(Builder builder) {
            this.deepThink = builder.deepThink;
            this.onlineSearch = builder.onlineSearch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
            return builder().build();
        }

        /**
         * @return deepThink
         */
        public Boolean getDeepThink() {
            return this.deepThink;
        }

        /**
         * @return onlineSearch
         */
        public Boolean getOnlineSearch() {
            return this.onlineSearch;
        }

        public static final class Builder {
            private Boolean deepThink; 
            private Boolean onlineSearch; 

            private Builder() {
            } 

            private Builder(Extra model) {
                this.deepThink = model.deepThink;
                this.onlineSearch = model.onlineSearch;
            } 

            /**
             * deepThink.
             */
            public Builder deepThink(Boolean deepThink) {
                this.deepThink = deepThink;
                return this;
            }

            /**
             * onlineSearch.
             */
            public Builder onlineSearch(Boolean onlineSearch) {
                this.onlineSearch = onlineSearch;
                return this;
            }

            public Extra build() {
                return new Extra(this);
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

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

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
        private java.util.List<Messages> messages;

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
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        public static final class Builder {
            private java.util.List<Messages> messages; 

            private Builder() {
            } 

            private Builder(Thread model) {
                this.messages = model.messages;
            } 

            /**
             * messages.
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            public Thread build() {
                return new Thread(this);
            } 

        } 

    }
}
