// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link RerunNodeAIResponseBody} extends {@link TeaModel}
 *
 * <p>RerunNodeAIResponseBody</p>
 */
public class RerunNodeAIResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("rerunAccepted")
    private Boolean rerunAccepted;

    @com.aliyun.core.annotation.NameInMap("stateVersion")
    private Long stateVersion;

    private RerunNodeAIResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.nodeId = builder.nodeId;
        this.requestId = builder.requestId;
        this.rerunAccepted = builder.rerunAccepted;
        this.stateVersion = builder.stateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerunNodeAIResponseBody create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rerunAccepted
     */
    public Boolean getRerunAccepted() {
        return this.rerunAccepted;
    }

    /**
     * @return stateVersion
     */
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public static final class Builder {
        private String code; 
        private String instanceId; 
        private String message; 
        private String nodeId; 
        private String requestId; 
        private Boolean rerunAccepted; 
        private Long stateVersion; 

        private Builder() {
        } 

        private Builder(RerunNodeAIResponseBody model) {
            this.code = model.code;
            this.instanceId = model.instanceId;
            this.message = model.message;
            this.nodeId = model.nodeId;
            this.requestId = model.requestId;
            this.rerunAccepted = model.rerunAccepted;
            this.stateVersion = model.stateVersion;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The physical instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_example</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The key of the node scheduled for rerun.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the rerun request is accepted. A value of true indicates that the rerun is accepted, but does not mean that the AI has completed the task. Failures are returned through the Code and Message fields.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder rerunAccepted(Boolean rerunAccepted) {
            this.rerunAccepted = rerunAccepted;
            return this;
        }

        /**
         * <p>The state version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder stateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }

        public RerunNodeAIResponseBody build() {
            return new RerunNodeAIResponseBody(this);
        } 

    } 

}
