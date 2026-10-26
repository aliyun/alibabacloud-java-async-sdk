// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link RespondAgentConversationActionResponseBody} extends {@link TeaModel}
 *
 * <p>RespondAgentConversationActionResponseBody</p>
 */
public class RespondAgentConversationActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accepted")
    private Boolean accepted;

    @com.aliyun.core.annotation.NameInMap("continuationCreated")
    private Boolean continuationCreated;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    private RespondAgentConversationActionResponseBody(Builder builder) {
        this.accepted = builder.accepted;
        this.continuationCreated = builder.continuationCreated;
        this.runId = builder.runId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RespondAgentConversationActionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accepted
     */
    public Boolean getAccepted() {
        return this.accepted;
    }

    /**
     * @return continuationCreated
     */
    public Boolean getContinuationCreated() {
        return this.continuationCreated;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    public static final class Builder {
        private Boolean accepted; 
        private Boolean continuationCreated; 
        private String runId; 

        private Builder() {
        } 

        private Builder(RespondAgentConversationActionResponseBody model) {
            this.accepted = model.accepted;
            this.continuationCreated = model.continuationCreated;
            this.runId = model.runId;
        } 

        /**
         * accepted.
         */
        public Builder accepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }

        /**
         * continuationCreated.
         */
        public Builder continuationCreated(Boolean continuationCreated) {
            this.continuationCreated = continuationCreated;
            return this;
        }

        /**
         * runId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        public RespondAgentConversationActionResponseBody build() {
            return new RespondAgentConversationActionResponseBody(this);
        } 

    } 

}
