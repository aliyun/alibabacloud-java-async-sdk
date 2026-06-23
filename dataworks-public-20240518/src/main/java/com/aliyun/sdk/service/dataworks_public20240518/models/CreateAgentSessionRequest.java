// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateAgentSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentSessionRequest</p>
 */
public class CreateAgentSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private Params params;

    private CreateAgentSessionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jsonrpc
     */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<CreateAgentSessionRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentSessionRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Jsonrpc.
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("Jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public CreateAgentSessionRequest build() {
            return new CreateAgentSessionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        private Agent(Builder builder) {
            this.agentName = builder.agentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        public static final class Builder {
            private String agentName; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.agentName = model.agentName;
            } 

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class SessionTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionTagCode")
        private String sessionTagCode;

        private SessionTags(Builder builder) {
            this.sessionTagCode = builder.sessionTagCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionTags create() {
            return builder().build();
        }

        /**
         * @return sessionTagCode
         */
        public String getSessionTagCode() {
            return this.sessionTagCode;
        }

        public static final class Builder {
            private String sessionTagCode; 

            private Builder() {
            } 

            private Builder(SessionTags model) {
                this.sessionTagCode = model.sessionTagCode;
            } 

            /**
             * SessionTagCode.
             */
            public Builder sessionTagCode(String sessionTagCode) {
                this.sessionTagCode = sessionTagCode;
                return this;
            }

            public SessionTags build() {
                return new SessionTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionSource")
        private String sessionSource;

        @com.aliyun.core.annotation.NameInMap("SessionTags")
        private java.util.List<SessionTags> sessionTags;

        private Config(Builder builder) {
            this.sessionSource = builder.sessionSource;
            this.sessionTags = builder.sessionTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return sessionSource
         */
        public String getSessionSource() {
            return this.sessionSource;
        }

        /**
         * @return sessionTags
         */
        public java.util.List<SessionTags> getSessionTags() {
            return this.sessionTags;
        }

        public static final class Builder {
            private String sessionSource; 
            private java.util.List<SessionTags> sessionTags; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.sessionSource = model.sessionSource;
                this.sessionTags = model.sessionTags;
            } 

            /**
             * SessionSource.
             */
            public Builder sessionSource(String sessionSource) {
                this.sessionSource = sessionSource;
                return this;
            }

            /**
             * SessionTags.
             */
            public Builder sessionTags(java.util.List<SessionTags> sessionTags) {
                this.sessionTags = sessionTags;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class InitialConfigOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutionLane")
        private String executionLane;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private InitialConfigOptions(Builder builder) {
            this.executionLane = builder.executionLane;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitialConfigOptions create() {
            return builder().build();
        }

        /**
         * @return executionLane
         */
        public String getExecutionLane() {
            return this.executionLane;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String executionLane; 
            private String mode; 

            private Builder() {
            } 

            private Builder(InitialConfigOptions model) {
                this.executionLane = model.executionLane;
                this.mode = model.mode;
            } 

            /**
             * ExecutionLane.
             */
            public Builder executionLane(String executionLane) {
                this.executionLane = executionLane;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public InitialConfigOptions build() {
                return new InitialConfigOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private Agent agent;

        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("InitialConfigOptions")
        private InitialConfigOptions initialConfigOptions;

        private Meta(Builder builder) {
            this.agent = builder.agent;
            this.config = builder.config;
            this.initialConfigOptions = builder.initialConfigOptions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public Agent getAgent() {
            return this.agent;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return initialConfigOptions
         */
        public InitialConfigOptions getInitialConfigOptions() {
            return this.initialConfigOptions;
        }

        public static final class Builder {
            private Agent agent; 
            private Config config; 
            private InitialConfigOptions initialConfigOptions; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.agent = model.agent;
                this.config = model.config;
                this.initialConfigOptions = model.initialConfigOptions;
            } 

            /**
             * Agent.
             */
            public Builder agent(Agent agent) {
                this.agent = agent;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * InitialConfigOptions.
             */
            public Builder initialConfigOptions(InitialConfigOptions initialConfigOptions) {
                this.initialConfigOptions = initialConfigOptions;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAgentSessionRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentSessionRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private Meta meta;

        private Params(Builder builder) {
            this.meta = builder.meta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        public static final class Builder {
            private Meta meta; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.meta = model.meta;
            } 

            /**
             * Meta.
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
