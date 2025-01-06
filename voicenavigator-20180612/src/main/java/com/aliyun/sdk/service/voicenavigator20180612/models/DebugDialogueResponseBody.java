// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DebugDialogueResponseBody} extends {@link TeaModel}
 *
 * <p>DebugDialogueResponseBody</p>
 */
public class DebugDialogueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("ActionParams")
    private String actionParams;

    @com.aliyun.core.annotation.NameInMap("Interruptible")
    private Boolean interruptible;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TextResponse")
    private String textResponse;

    private DebugDialogueResponseBody(Builder builder) {
        this.action = builder.action;
        this.actionParams = builder.actionParams;
        this.interruptible = builder.interruptible;
        this.requestId = builder.requestId;
        this.textResponse = builder.textResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugDialogueResponseBody create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return actionParams
     */
    public String getActionParams() {
        return this.actionParams;
    }

    /**
     * @return interruptible
     */
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return textResponse
     */
    public String getTextResponse() {
        return this.textResponse;
    }

    public static final class Builder {
        private String action; 
        private String actionParams; 
        private Boolean interruptible; 
        private String requestId; 
        private String textResponse; 

        /**
         * Action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * ActionParams.
         */
        public Builder actionParams(String actionParams) {
            this.actionParams = actionParams;
            return this;
        }

        /**
         * Interruptible.
         */
        public Builder interruptible(Boolean interruptible) {
            this.interruptible = interruptible;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TextResponse.
         */
        public Builder textResponse(String textResponse) {
            this.textResponse = textResponse;
            return this;
        }

        public DebugDialogueResponseBody build() {
            return new DebugDialogueResponseBody(this);
        } 

    } 

}
