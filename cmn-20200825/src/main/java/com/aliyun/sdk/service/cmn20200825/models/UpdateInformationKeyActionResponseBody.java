// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInformationKeyActionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInformationKeyActionResponseBody</p>
 */
public class UpdateInformationKeyActionResponseBody extends TeaModel {
    @NameInMap("ActionMessage")
    private String actionMessage;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateInformationKeyActionResponseBody(Builder builder) {
        this.actionMessage = builder.actionMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInformationKeyActionResponseBody create() {
        return builder().build();
    }

    /**
     * @return actionMessage
     */
    public String getActionMessage() {
        return this.actionMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String actionMessage; 
        private String requestId; 

        /**
         * ActionMessage.
         */
        public Builder actionMessage(String actionMessage) {
            this.actionMessage = actionMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateInformationKeyActionResponseBody build() {
            return new UpdateInformationKeyActionResponseBody(this);
        } 

    } 

}
