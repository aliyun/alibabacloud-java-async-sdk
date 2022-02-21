// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpanNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSpanNamesResponseBody</p>
 */
public class ListSpanNamesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpanNames")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpanNames.
         */
        public Builder spanNames(SpanNames spanNames) {
            this.spanNames = spanNames;
            return this;
        }

        public ListSpanNamesResponseBody build() {
            return new ListSpanNamesResponseBody(this);
        } 

    } 

    public static class SpanNames extends TeaModel {
        @NameInMap("SpanName")
        private java.util.List < String > spanName;

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
        public java.util.List < String > getSpanName() {
            return this.spanName;
        }

        public static final class Builder {
            private java.util.List < String > spanName; 

            /**
             * SpanName.
             */
            public Builder spanName(java.util.List < String > spanName) {
                this.spanName = spanName;
                return this;
            }

            public SpanNames build() {
                return new SpanNames(this);
            } 

        } 

    }
}
