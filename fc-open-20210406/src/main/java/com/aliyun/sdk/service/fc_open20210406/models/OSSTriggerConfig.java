// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OSSTriggerConfig} extends {@link TeaModel}
 *
 * <p>OSSTriggerConfig</p>
 */
public class OSSTriggerConfig extends TeaModel {
    @NameInMap("events")
    private java.util.List < String > events;

    @NameInMap("filter")
    private OSSTriggerFilter filter;

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
    public OSSTriggerFilter getFilter() {
        return this.filter;
    }

    public static final class Builder {
        private java.util.List < String > events; 
        private OSSTriggerFilter filter; 

        /**
         * events
         */
        public Builder events(java.util.List < String > events) {
            this.events = events;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(OSSTriggerFilter filter) {
            this.filter = filter;
            return this;
        }

        public OSSTriggerConfig build() {
            return new OSSTriggerConfig(this);
        } 

    } 

}
