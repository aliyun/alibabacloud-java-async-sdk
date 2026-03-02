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
 * {@link SearchTracesByPageResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTracesByPageResponseBody</p>
 */
public class SearchTracesByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("traceInfos")
    private java.util.List<TraceInfo> traceInfos;

    private SearchTracesByPageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.traceInfos = builder.traceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTracesByPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceInfos
     */
    public java.util.List<TraceInfo> getTraceInfos() {
        return this.traceInfos;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TraceInfo> traceInfos; 

        private Builder() {
        } 

        private Builder(SearchTracesByPageResponseBody model) {
            this.requestId = model.requestId;
            this.traceInfos = model.traceInfos;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>sdadawqewe</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * traceInfos.
         */
        public Builder traceInfos(java.util.List<TraceInfo> traceInfos) {
            this.traceInfos = traceInfos;
            return this;
        }

        public SearchTracesByPageResponseBody build() {
            return new SearchTracesByPageResponseBody(this);
        } 

    } 

}
