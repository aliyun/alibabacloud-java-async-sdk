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
 * {@link SearchTracesPageResult} extends {@link TeaModel}
 *
 * <p>SearchTracesPageResult</p>
 */
public class SearchTracesPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("traceInfos")
    private java.util.List<TraceInfo> traceInfos;

    private SearchTracesPageResult(Builder builder) {
        this.traceInfos = builder.traceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTracesPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return traceInfos
     */
    public java.util.List<TraceInfo> getTraceInfos() {
        return this.traceInfos;
    }

    public static final class Builder {
        private java.util.List<TraceInfo> traceInfos; 

        private Builder() {
        } 

        private Builder(SearchTracesPageResult model) {
            this.traceInfos = model.traceInfos;
        } 

        /**
         * traceInfos.
         */
        public Builder traceInfos(java.util.List<TraceInfo> traceInfos) {
            this.traceInfos = traceInfos;
            return this;
        }

        public SearchTracesPageResult build() {
            return new SearchTracesPageResult(this);
        } 

    } 

}
