// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

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
 * {@link ListSpanNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSpanNamesResponseBody</p>
 */
public class ListSpanNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpanNames")
    private SpanNames spanNames;

    private ListSpanNamesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spanNames = builder.spanNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSpanNamesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spanNames
     */
    public SpanNames getSpanNames() {
        return this.spanNames;
    }

    public static final class Builder {
        private String requestId; 
        private SpanNames spanNames; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1F******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The span names.</p>
         */
        public Builder spanNames(SpanNames spanNames) {
            this.spanNames = spanNames;
            return this;
        }

        public ListSpanNamesResponseBody build() {
            return new ListSpanNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSpanNamesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSpanNamesResponseBody</p>
     */
    public static class SpanNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpanName")
        private java.util.List<String> spanName;

        private SpanNames(Builder builder) {
            this.spanName = builder.spanName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpanNames create() {
            return builder().build();
        }

        /**
         * @return spanName
         */
        public java.util.List<String> getSpanName() {
            return this.spanName;
        }

        public static final class Builder {
            private java.util.List<String> spanName; 

            /**
             * SpanName.
             */
            public Builder spanName(java.util.List<String> spanName) {
                this.spanName = spanName;
                return this;
            }

            public SpanNames build() {
                return new SpanNames(this);
            } 

        } 

    }
}
