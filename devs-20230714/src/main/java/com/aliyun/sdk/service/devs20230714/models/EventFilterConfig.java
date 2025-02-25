// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EventFilterConfig} extends {@link TeaModel}
 *
 * <p>EventFilterConfig</p>
 */
public class EventFilterConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pullRequest")
    private PullRequestFilter pullRequest;

    @com.aliyun.core.annotation.NameInMap("push")
    private PushFilter push;

    private EventFilterConfig(Builder builder) {
        this.pullRequest = builder.pullRequest;
        this.push = builder.push;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventFilterConfig create() {
        return builder().build();
    }

    /**
     * @return pullRequest
     */
    public PullRequestFilter getPullRequest() {
        return this.pullRequest;
    }

    /**
     * @return push
     */
    public PushFilter getPush() {
        return this.push;
    }

    public static final class Builder {
        private PullRequestFilter pullRequest; 
        private PushFilter push; 

        /**
         * pullRequest.
         */
        public Builder pullRequest(PullRequestFilter pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        /**
         * push.
         */
        public Builder push(PushFilter push) {
            this.push = push;
            return this;
        }

        public EventFilterConfig build() {
            return new EventFilterConfig(this);
        } 

    } 

}
