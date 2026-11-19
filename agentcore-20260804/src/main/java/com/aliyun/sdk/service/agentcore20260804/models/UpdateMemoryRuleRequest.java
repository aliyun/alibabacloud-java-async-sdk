// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link UpdateMemoryRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemoryRuleRequest</p>
 */
public class UpdateMemoryRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateMemoryRuleRequestBody body;

    private UpdateMemoryRuleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.ruleId = builder.ruleId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryRuleRequest create() {
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
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return body
     */
    public UpdateMemoryRuleRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateMemoryRuleRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private String ruleId; 
        private UpdateMemoryRuleRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemoryRuleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.ruleId = request.ruleId;
            this.body = request.body;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the memory store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>ruleId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-2f5f9c5a8d0e4c3b</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The JSON request body.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateMemoryRuleRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateMemoryRuleRequest build() {
            return new UpdateMemoryRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMemoryRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateMemoryRuleRequest</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Strategy(Builder builder) {
            this.instruction = builder.instruction;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instruction; 
            private String type; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.instruction = model.instruction;
                this.type = model.type;
            } 

            /**
             * <p>The custom extraction instruction. If omitted, the original value is retained. An empty string clears the value.</p>
             * 
             * <strong>example:</strong>
             * <p>Retain only long-term preferences explicitly expressed by the user</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>type</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMemoryRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateMemoryRuleRequest</p>
     */
    public static class UpdateMemoryRuleRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("strategy")
        private Strategy strategy;

        private UpdateMemoryRuleRequestBody(Builder builder) {
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.name = builder.name;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateMemoryRuleRequestBody create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private String description; 
            private Boolean enabled; 
            private String name; 
            private Strategy strategy; 

            private Builder() {
            } 

            private Builder(UpdateMemoryRuleRequestBody model) {
                this.description = model.description;
                this.enabled = model.enabled;
                this.name = model.name;
                this.strategy = model.strategy;
            } 

            /**
             * <p>description</p>
             * 
             * <strong>example:</strong>
             * <p>Extract long-term preferences explicitly expressed by the user</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>enabled</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>name</p>
             * 
             * <strong>example:</strong>
             * <p>Long-term preferences</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The extraction strategy. Uses partial merging, where omitted fields retain their original values.</p>
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            public UpdateMemoryRuleRequestBody build() {
                return new UpdateMemoryRuleRequestBody(this);
            } 

        } 

    }
}
