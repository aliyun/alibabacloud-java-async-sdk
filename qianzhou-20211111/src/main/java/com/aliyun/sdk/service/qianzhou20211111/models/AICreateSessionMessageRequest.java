// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AICreateSessionMessageRequest} extends {@link RequestModel}
 *
 * <p>AICreateSessionMessageRequest</p>
 */
public class AICreateSessionMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("context")
    private Context context;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("session_id")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("employee_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String employeeId;

    private AICreateSessionMessageRequest(Builder builder) {
        super(builder);
        this.context = builder.context;
        this.language = builder.language;
        this.message = builder.message;
        this.sessionId = builder.sessionId;
        this.type = builder.type;
        this.employeeId = builder.employeeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AICreateSessionMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return employeeId
     */
    public String getEmployeeId() {
        return this.employeeId;
    }

    public static final class Builder extends Request.Builder<AICreateSessionMessageRequest, Builder> {
        private Context context; 
        private String language; 
        private String message; 
        private String sessionId; 
        private String type; 
        private String employeeId; 

        private Builder() {
            super();
        } 

        private Builder(AICreateSessionMessageRequest request) {
            super(request);
            this.context = request.context;
            this.language = request.language;
            this.message = request.message;
            this.sessionId = request.sessionId;
            this.type = request.type;
            this.employeeId = request.employeeId;
        } 

        /**
         * context.
         */
        public Builder context(Context context) {
            this.putBodyParameter("context", context);
            this.context = context;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putBodyParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.putBodyParameter("message", message);
            this.message = message;
            return this;
        }

        /**
         * session_id.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("session_id", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder employeeId(String employeeId) {
            this.putQueryParameter("employee_id", employeeId);
            this.employeeId = employeeId;
            return this;
        }

        @Override
        public AICreateSessionMessageRequest build() {
            return new AICreateSessionMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link AICreateSessionMessageRequest} extends {@link TeaModel}
     *
     * <p>AICreateSessionMessageRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("uuid")
        private String uuid;

        private Context(Builder builder) {
            this.clusterId = builder.clusterId;
            this.error = builder.error;
            this.kind = builder.kind;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String clusterId; 
            private String error; 
            private String kind; 
            private String name; 
            private String namespace; 
            private String uuid; 

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
}
