// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UnbindPolarClawAgentResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindPolarClawAgentResponseBody</p>
 */
public class UnbindPolarClawAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RemovedCount")
    private Integer removedCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalBindings")
    private Integer totalBindings;

    private UnbindPolarClawAgentResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.removedCount = builder.removedCount;
        this.requestId = builder.requestId;
        this.totalBindings = builder.totalBindings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindPolarClawAgentResponseBody create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return removedCount
     */
    public Integer getRemovedCount() {
        return this.removedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalBindings
     */
    public Integer getTotalBindings() {
        return this.totalBindings;
    }

    public static final class Builder {
        private String agentId; 
        private String applicationId; 
        private Integer code; 
        private String message; 
        private Integer removedCount; 
        private String requestId; 
        private Integer totalBindings; 

        private Builder() {
        } 

        private Builder(UnbindPolarClawAgentResponseBody model) {
            this.agentId = model.agentId;
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.removedCount = model.removedCount;
            this.requestId = model.requestId;
            this.totalBindings = model.totalBindings;
        } 

        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RemovedCount.
         */
        public Builder removedCount(Integer removedCount) {
            this.removedCount = removedCount;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalBindings.
         */
        public Builder totalBindings(Integer totalBindings) {
            this.totalBindings = totalBindings;
            return this;
        }

        public UnbindPolarClawAgentResponseBody build() {
            return new UnbindPolarClawAgentResponseBody(this);
        } 

    } 

}
