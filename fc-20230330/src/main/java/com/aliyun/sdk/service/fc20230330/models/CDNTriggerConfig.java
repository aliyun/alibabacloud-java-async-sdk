// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link CDNTriggerConfig} extends {@link TeaModel}
 *
 * <p>CDNTriggerConfig</p>
 */
public class CDNTriggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eventName")
    private String eventName;

    @com.aliyun.core.annotation.NameInMap("eventVersion")
    private String eventVersion;

    @com.aliyun.core.annotation.NameInMap("filter")
    private java.util.Map<String, java.util.List<String>> filter;

    @com.aliyun.core.annotation.NameInMap("notes")
    private String notes;

    private CDNTriggerConfig(Builder builder) {
        this.eventName = builder.eventName;
        this.eventVersion = builder.eventVersion;
        this.filter = builder.filter;
        this.notes = builder.notes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CDNTriggerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.Map<String, java.util.List<String>> getFilter() {
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
        private java.util.Map<String, java.util.List<String>> filter; 
        private String notes; 

        private Builder() {
        } 

        private Builder(CDNTriggerConfig model) {
            this.eventName = model.eventName;
            this.eventVersion = model.eventVersion;
            this.filter = model.filter;
            this.notes = model.notes;
        } 

        /**
         * <p>The name of the trigger event. For more information, see <a href="https://help.aliyun.com/document_detail/2513636.html">CDN events</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CdnDomainStarted</p>
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The version of the trigger event. Only the 1.0.0 event version is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder eventVersion(String eventVersion) {
            this.eventVersion = eventVersion;
            return this;
        }

        /**
         * <p>The details of the event filtering rules.</p>
         */
        public Builder filter(java.util.Map<String, java.util.List<String>> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * <p>The description of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>缓存事件触发器</p>
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public CDNTriggerConfig build() {
            return new CDNTriggerConfig(this);
        } 

    } 

}
