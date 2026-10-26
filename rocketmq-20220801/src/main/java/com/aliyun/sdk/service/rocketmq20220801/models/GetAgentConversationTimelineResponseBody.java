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
 * {@link GetAgentConversationTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentConversationTimelineResponseBody</p>
 */
public class GetAgentConversationTimelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private Object items;

    @com.aliyun.core.annotation.NameInMap("replayCursor")
    private Long replayCursor;

    @com.aliyun.core.annotation.NameInMap("responseFeedback")
    private Object responseFeedback;

    @com.aliyun.core.annotation.NameInMap("runs")
    private Object runs;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private GetAgentConversationTimelineResponseBody(Builder builder) {
        this.items = builder.items;
        this.replayCursor = builder.replayCursor;
        this.responseFeedback = builder.responseFeedback;
        this.runs = builder.runs;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentConversationTimelineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Object getItems() {
        return this.items;
    }

    /**
     * @return replayCursor
     */
    public Long getReplayCursor() {
        return this.replayCursor;
    }

    /**
     * @return responseFeedback
     */
    public Object getResponseFeedback() {
        return this.responseFeedback;
    }

    /**
     * @return runs
     */
    public Object getRuns() {
        return this.runs;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private Object items; 
        private Long replayCursor; 
        private Object responseFeedback; 
        private Object runs; 
        private String source; 

        private Builder() {
        } 

        private Builder(GetAgentConversationTimelineResponseBody model) {
            this.items = model.items;
            this.replayCursor = model.replayCursor;
            this.responseFeedback = model.responseFeedback;
            this.runs = model.runs;
            this.source = model.source;
        } 

        /**
         * items.
         */
        public Builder items(Object items) {
            this.items = items;
            return this;
        }

        /**
         * replayCursor.
         */
        public Builder replayCursor(Long replayCursor) {
            this.replayCursor = replayCursor;
            return this;
        }

        /**
         * responseFeedback.
         */
        public Builder responseFeedback(Object responseFeedback) {
            this.responseFeedback = responseFeedback;
            return this;
        }

        /**
         * runs.
         */
        public Builder runs(Object runs) {
            this.runs = runs;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public GetAgentConversationTimelineResponseBody build() {
            return new GetAgentConversationTimelineResponseBody(this);
        } 

    } 

}
