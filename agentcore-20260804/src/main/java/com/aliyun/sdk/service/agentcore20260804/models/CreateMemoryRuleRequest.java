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
 * {@link CreateMemoryRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryRuleRequest</p>
 */
public class CreateMemoryRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateMemoryRuleRequestBody body;

    private CreateMemoryRuleRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryRuleRequest create() {
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
     * @return body
     */
    public CreateMemoryRuleRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateMemoryRuleRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private CreateMemoryRuleRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryRuleRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
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
         * <p>The JSON request body.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateMemoryRuleRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public CreateMemoryRuleRequest build() {
            return new CreateMemoryRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemoryRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateMemoryRuleRequest</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The strategy-level instruction. It takes effect together with the store-level instruction. If a conflict occurs, this field takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>Retain only long-term preferences explicitly expressed by users</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>type</p>
             * <p>This parameter is required.</p>
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
     * {@link CreateMemoryRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateMemoryRuleRequest</p>
     */
    public static class CreateMemoryRuleRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("strategy")
        @com.aliyun.core.annotation.Validation(required = true)
        private Strategy strategy;

        private CreateMemoryRuleRequestBody(Builder builder) {
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.name = builder.name;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateMemoryRuleRequestBody create() {
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

            private Builder(CreateMemoryRuleRequestBody model) {
                this.description = model.description;
                this.enabled = model.enabled;
                this.name = model.name;
                this.strategy = model.strategy;
            } 

            /**
             * <p>description</p>
             * 
             * <strong>example:</strong>
             * <p>Extract long-term preferences explicitly expressed by users</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Long-term preferences</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>strategy</p>
             * <p>This parameter is required.</p>
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            public CreateMemoryRuleRequestBody build() {
                return new CreateMemoryRuleRequestBody(this);
            } 

        } 

    }
}
