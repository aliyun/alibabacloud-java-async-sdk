// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link EventTableQueryHistogram} extends {@link TeaModel}
 *
 * <p>EventTableQueryHistogram</p>
 */
public class EventTableQueryHistogram extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("From")
    private Long from;

    @com.aliyun.core.annotation.NameInMap("To")
    private Long to;

    private EventTableQueryHistogram(Builder builder) {
        this.count = builder.count;
        this.from = builder.from;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventTableQueryHistogram create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder {
        private Long count; 
        private Long from; 
        private Long to; 

        private Builder() {
        } 

        private Builder(EventTableQueryHistogram model) {
            this.count = model.count;
            this.from = model.from;
            this.to = model.to;
        } 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * From.
         */
        public Builder from(Long from) {
            this.from = from;
            return this;
        }

        /**
         * To.
         */
        public Builder to(Long to) {
            this.to = to;
            return this;
        }

        public EventTableQueryHistogram build() {
            return new EventTableQueryHistogram(this);
        } 

    } 

}
