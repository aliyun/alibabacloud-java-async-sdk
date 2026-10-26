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
 * {@link StopAgentConversationResponseBody} extends {@link TeaModel}
 *
 * <p>StopAgentConversationResponseBody</p>
 */
public class StopAgentConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("stopped")
    private Boolean stopped;

    private StopAgentConversationResponseBody(Builder builder) {
        this.stopped = builder.stopped;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAgentConversationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stopped
     */
    public Boolean getStopped() {
        return this.stopped;
    }

    public static final class Builder {
        private Boolean stopped; 

        private Builder() {
        } 

        private Builder(StopAgentConversationResponseBody model) {
            this.stopped = model.stopped;
        } 

        /**
         * stopped.
         */
        public Builder stopped(Boolean stopped) {
            this.stopped = stopped;
            return this;
        }

        public StopAgentConversationResponseBody build() {
            return new StopAgentConversationResponseBody(this);
        } 

    } 

}
