// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OSSTriggerConfig} extends {@link TeaModel}
 *
 * <p>OSSTriggerConfig</p>
 */
public class OSSTriggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("events")
    private java.util.List < String > events;

    @com.aliyun.core.annotation.NameInMap("filter")
    private Filter filter;

    private OSSTriggerConfig(Builder builder) {
        this.events = builder.events;
        this.filter = builder.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSTriggerConfig create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < String > getEvents() {
        return this.events;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    public static final class Builder {
        private java.util.List < String > events; 
        private Filter filter; 

        /**
         * events.
         */
        public Builder events(java.util.List < String > events) {
            this.events = events;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(Filter filter) {
            this.filter = filter;
            return this;
        }

        public OSSTriggerConfig build() {
            return new OSSTriggerConfig(this);
        } 

    } 

}
