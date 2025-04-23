// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link ListTracesDatasResponseBody} extends {@link TeaModel}
 *
 * <p>ListTracesDatasResponseBody</p>
 */
public class ListTracesDatasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Traces")
    private java.util.List<?> traces;

    private ListTracesDatasResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.traces = builder.traces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTracesDatasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return traces
     */
    public java.util.List<?> getTraces() {
        return this.traces;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<?> traces; 

        private Builder() {
        } 

        private Builder(ListTracesDatasResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.traces = model.traces;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>POP request id</p>
         * 
         * <strong>example:</strong>
         * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Traces.
         */
        public Builder traces(java.util.List<?> traces) {
            this.traces = traces;
            return this;
        }

        public ListTracesDatasResponseBody build() {
            return new ListTracesDatasResponseBody(this);
        } 

    } 

}
