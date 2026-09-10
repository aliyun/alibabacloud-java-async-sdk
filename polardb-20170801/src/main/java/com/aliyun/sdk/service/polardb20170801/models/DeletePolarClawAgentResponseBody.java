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
 * {@link DeletePolarClawAgentResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePolarClawAgentResponseBody</p>
 */
public class DeletePolarClawAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RemovedBindings")
    private Integer removedBindings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePolarClawAgentResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.removedBindings = builder.removedBindings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarClawAgentResponseBody create() {
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
     * @return removedBindings
     */
    public Integer getRemovedBindings() {
        return this.removedBindings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String agentId; 
        private String applicationId; 
        private Integer code; 
        private String message; 
        private Integer removedBindings; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeletePolarClawAgentResponseBody model) {
            this.agentId = model.agentId;
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.removedBindings = model.removedBindings;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the deleted agent.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of automatically removed bindings.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder removedBindings(Integer removedBindings) {
            this.removedBindings = removedBindings;
            return this;
        }

        /**
         * <p><strong>The request ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePolarClawAgentResponseBody build() {
            return new DeletePolarClawAgentResponseBody(this);
        } 

    } 

}
