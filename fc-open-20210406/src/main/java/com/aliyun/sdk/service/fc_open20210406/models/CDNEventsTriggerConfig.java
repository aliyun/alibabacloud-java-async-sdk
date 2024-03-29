// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CDNEventsTriggerConfig} extends {@link TeaModel}
 *
 * <p>CDNEventsTriggerConfig</p>
 */
public class CDNEventsTriggerConfig extends TeaModel {
    @NameInMap("eventName")
    private String eventName;

    @NameInMap("eventVersion")
    private String eventVersion;

    @NameInMap("filter")
    private java.util.Map < String, java.util.List<String>> filter;

    @NameInMap("notes")
    private String notes;

    private CDNEventsTriggerConfig(Builder builder) {
        this.eventName = builder.eventName;
        this.eventVersion = builder.eventVersion;
        this.filter = builder.filter;
        this.notes = builder.notes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CDNEventsTriggerConfig create() {
        return builder().build();
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventVersion
     */
    public String getEventVersion() {
        return this.eventVersion;
    }

    /**
     * @return filter
     */
    public java.util.Map < String, java.util.List<String>> getFilter() {
        return this.filter;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    public static final class Builder {
        private String eventName; 
        private String eventVersion; 
        private java.util.Map < String, java.util.List<String>> filter; 
        private String notes; 

        /**
         * eventName.
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * eventVersion.
         */
        public Builder eventVersion(String eventVersion) {
            this.eventVersion = eventVersion;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(java.util.Map < String, java.util.List<String>> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * notes.
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public CDNEventsTriggerConfig build() {
            return new CDNEventsTriggerConfig(this);
        } 

    } 

}
