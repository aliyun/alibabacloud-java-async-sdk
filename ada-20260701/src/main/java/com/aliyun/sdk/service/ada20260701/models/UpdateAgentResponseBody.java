// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link UpdateAgentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAgentResponseBody</p>
 */
public class UpdateAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private Long updatedAt;

    private UpdateAgentResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String agentId; 
        private String name; 
        private String requestId; 
        private Boolean success; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(UpdateAgentResponseBody model) {
            this.agentId = model.agentId;
            this.name = model.name;
            this.requestId = model.requestId;
            this.success = model.success;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>Agent ID。</p>
         * 
         * <strong>example:</strong>
         * <p>agent_00000000000000000000000000000001</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The Agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-agent</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID, used for Tracing Analysis and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the Agent was successfully updated. A successful response always returns <code>true</code>. A failure returns an error response.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The most recent update time, as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788332700000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public UpdateAgentResponseBody build() {
            return new UpdateAgentResponseBody(this);
        } 

    } 

}
