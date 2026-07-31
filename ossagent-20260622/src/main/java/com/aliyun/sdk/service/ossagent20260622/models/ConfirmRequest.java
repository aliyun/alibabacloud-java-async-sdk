// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossagent20260622.models;

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
 * {@link ConfirmRequest} extends {@link RequestModel}
 *
 * <p>ConfirmRequest</p>
 */
public class ConfirmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("confirmed")
    private Boolean confirmed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("toolCalls")
    private java.util.List<ToolCalls> toolCalls;

    private ConfirmRequest(Builder builder) {
        super(builder);
        this.confirmed = builder.confirmed;
        this.phase = builder.phase;
        this.reason = builder.reason;
        this.sessionId = builder.sessionId;
        this.toolCalls = builder.toolCalls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return confirmed
     */
    public Boolean getConfirmed() {
        return this.confirmed;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return toolCalls
     */
    public java.util.List<ToolCalls> getToolCalls() {
        return this.toolCalls;
    }

    public static final class Builder extends Request.Builder<ConfirmRequest, Builder> {
        private Boolean confirmed; 
        private String phase; 
        private String reason; 
        private String sessionId; 
        private java.util.List<ToolCalls> toolCalls; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmRequest request) {
            super(request);
            this.confirmed = request.confirmed;
            this.phase = request.phase;
            this.reason = request.reason;
            this.sessionId = request.sessionId;
            this.toolCalls = request.toolCalls;
        } 

        /**
         * confirmed.
         */
        public Builder confirmed(Boolean confirmed) {
            this.putBodyParameter("confirmed", confirmed);
            this.confirmed = confirmed;
            return this;
        }

        /**
         * phase.
         */
        public Builder phase(String phase) {
            this.putBodyParameter("phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * toolCalls.
         */
        public Builder toolCalls(java.util.List<ToolCalls> toolCalls) {
            this.putBodyParameter("toolCalls", toolCalls);
            this.toolCalls = toolCalls;
            return this;
        }

        @Override
        public ConfirmRequest build() {
            return new ConfirmRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfirmRequest} extends {@link TeaModel}
     *
     * <p>ConfirmRequest</p>
     */
    public static class ToolCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("modifiedInput")
        private java.util.Map<String, ?> modifiedInput;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ToolCalls(Builder builder) {
            this.id = builder.id;
            this.modifiedInput = builder.modifiedInput;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolCalls create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifiedInput
         */
        public java.util.Map<String, ?> getModifiedInput() {
            return this.modifiedInput;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private java.util.Map<String, ?> modifiedInput; 
            private String name; 

            private Builder() {
            } 

            private Builder(ToolCalls model) {
                this.id = model.id;
                this.modifiedInput = model.modifiedInput;
                this.name = model.name;
            } 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * modifiedInput.
             */
            public Builder modifiedInput(java.util.Map<String, ?> modifiedInput) {
                this.modifiedInput = modifiedInput;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ToolCalls build() {
                return new ToolCalls(this);
            } 

        } 

    }
}
