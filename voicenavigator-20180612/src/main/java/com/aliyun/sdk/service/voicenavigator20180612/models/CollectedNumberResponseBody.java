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
 * {@link CollectedNumberResponseBody} extends {@link TeaModel}
 *
 * <p>CollectedNumberResponseBody</p>
 */
public class CollectedNumberResponseBody extends TeaModel {
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

    private CollectedNumberResponseBody(Builder builder) {
        this.action = builder.action;
        this.actionParams = builder.actionParams;
        this.interruptible = builder.interruptible;
        this.requestId = builder.requestId;
        this.textResponse = builder.textResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CollectedNumberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CollectedNumberResponseBody model) {
            this.action = model.action;
            this.actionParams = model.actionParams;
            this.interruptible = model.interruptible;
            this.requestId = model.requestId;
            this.textResponse = model.textResponse;
        } 

        /**
         * <p>The action.</p>
         * 
         * <strong>example:</strong>
         * <p>Broadcast</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The action parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;duration\&quot;:31340,\&quot;endTime\&quot;:1638243934786,\&quot;hangUpDirection\&quot;:\&quot;ivr\&quot;,\&quot;startTime\&quot;:1638243903446}</p>
         */
        public Builder actionParams(String actionParams) {
            this.actionParams = actionParams;
            return this;
        }

        /**
         * <p>Indicates whether the IVR announcement can be interrupted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder interruptible(Boolean interruptible) {
            this.interruptible = interruptible;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The announcement text.</p>
         * 
         * <strong>example:</strong>
         * <p>The collected digits are 123</p>
         */
        public Builder textResponse(String textResponse) {
            this.textResponse = textResponse;
            return this;
        }

        public CollectedNumberResponseBody build() {
            return new CollectedNumberResponseBody(this);
        } 

    } 

}
