// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizedListHeadersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedListHeadersResponseBody</p>
 */
public class DescribeCustomizedListHeadersResponseBody extends TeaModel {
    @NameInMap("Headers")
    private java.util.List < Headers> headers;

    @NameInMap("RequestId")
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

    /**
     * @return headers
     */
    public java.util.List < Headers> getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Headers> headers; 
        private String requestId; 

        /**
         * The headers.
         */
        public Builder headers(java.util.List < Headers> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomizedListHeadersResponseBody build() {
            return new DescribeCustomizedListHeadersResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("DisplayType")
        private String displayType;

        @NameInMap("HeaderKey")
        private String headerKey;

        @NameInMap("HeaderName")
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

            /**
             * The display type of the header. You can call the `ModifyCustomizedListHeaders` operation to modify the display type of the header.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * The key of the header.
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
                return this;
            }

            /**
             * The name of the header.
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
