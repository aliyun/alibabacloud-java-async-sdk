// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeCustomizedListHeadersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedListHeadersResponseBody</p>
 */
public class DescribeCustomizedListHeadersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private java.util.List<Headers> headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCustomizedListHeadersResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizedListHeadersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.List<Headers> getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Headers> headers; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCustomizedListHeadersResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of table headers.</p>
         */
        public Builder headers(java.util.List<Headers> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomizedListHeadersResponseBody build() {
            return new DescribeCustomizedListHeadersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomizedListHeadersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomizedListHeadersResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("HeaderKey")
        private String headerKey;

        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        private Headers(Builder builder) {
            this.displayType = builder.displayType;
            this.headerKey = builder.headerKey;
            this.headerName = builder.headerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return headerKey
         */
        public String getHeaderKey() {
            return this.headerKey;
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        public static final class Builder {
            private String displayType; 
            private String headerKey; 
            private String headerName; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.displayType = model.displayType;
                this.headerKey = model.headerKey;
                this.headerName = model.headerName;
            } 

            /**
             * <p>The display type of the table header. You can invoke <a href="https://help.aliyun.com/document_detail/452324.html">ModifyCustomizedListHeaders</a> to change it.</p>
             * 
             * <strong>example:</strong>
             * <p>display</p>
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * <p>The key of the table header.</p>
             * 
             * <strong>example:</strong>
             * <p>pay_type</p>
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
                return this;
            }

            /**
             * <p>The name of the table header.</p>
             * 
             * <strong>example:</strong>
             * <p>System disk/Data disk</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
}
