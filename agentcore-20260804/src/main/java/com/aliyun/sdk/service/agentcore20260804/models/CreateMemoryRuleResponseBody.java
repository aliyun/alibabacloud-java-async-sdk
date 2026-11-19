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
 * {@link CreateMemoryRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMemoryRuleResponseBody</p>
 */
public class CreateMemoryRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateMemoryRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateMemoryRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>httpStatusCode</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>success</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateMemoryRuleResponseBody build() {
            return new CreateMemoryRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemoryRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemoryRuleResponseBody</p>
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
     * {@link CreateMemoryRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemoryRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("memoryStoreId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memoryStoreId;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("strategy")
        @com.aliyun.core.annotation.Validation(required = true)
        private Strategy strategy;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.memoryStoreId = builder.memoryStoreId;
            this.name = builder.name;
            this.ruleId = builder.ruleId;
            this.strategy = builder.strategy;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
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
         * @return memoryStoreId
         */
        public String getMemoryStoreId() {
            return this.memoryStoreId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private Boolean enabled; 
            private String memoryStoreId; 
            private String name; 
            private String ruleId; 
            private Strategy strategy; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.enabled = model.enabled;
                this.memoryStoreId = model.memoryStoreId;
                this.name = model.name;
                this.ruleId = model.ruleId;
                this.strategy = model.strategy;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>createdAt</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
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
             * <p>This parameter is required.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>memoryStoreId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ms-2f5f9c5a8d0e4c3b</p>
             */
            public Builder memoryStoreId(String memoryStoreId) {
                this.memoryStoreId = memoryStoreId;
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
             * <p>ruleId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-2f5f9c5a8d0e4c3b</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
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

            /**
             * <p>updatedAt</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
