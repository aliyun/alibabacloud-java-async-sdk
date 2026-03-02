// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link TraceSpansLogEventList} extends {@link TeaModel}
 *
 * <p>TraceSpansLogEventList</p>
 */
public class TraceSpansLogEventList extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logEventTagEntryList")
    private java.util.List<TagEntry> logEventTagEntryList;

    private TraceSpansLogEventList(Builder builder) {
        this.logEventTagEntryList = builder.logEventTagEntryList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TraceSpansLogEventList create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logEventTagEntryList
     */
    public java.util.List<TagEntry> getLogEventTagEntryList() {
        return this.logEventTagEntryList;
    }

    public static final class Builder {
        private java.util.List<TagEntry> logEventTagEntryList; 

        private Builder() {
        } 

        private Builder(TraceSpansLogEventList model) {
            this.logEventTagEntryList = model.logEventTagEntryList;
        } 

        /**
         * logEventTagEntryList.
         */
        public Builder logEventTagEntryList(java.util.List<TagEntry> logEventTagEntryList) {
            this.logEventTagEntryList = logEventTagEntryList;
            return this;
        }

        public TraceSpansLogEventList build() {
            return new TraceSpansLogEventList(this);
        } 

    } 

}
