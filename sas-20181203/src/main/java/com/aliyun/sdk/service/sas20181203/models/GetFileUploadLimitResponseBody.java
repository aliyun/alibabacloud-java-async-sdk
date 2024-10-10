// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFileUploadLimitResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileUploadLimitResponseBody</p>
 */
public class GetFileUploadLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileUploadLimitResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileUploadLimitResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned if the request is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A975D03-5F49-5354-B2CB-3918D5DA431A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileUploadLimitResponseBody build() {
            return new GetFileUploadLimitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileUploadLimitResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileUploadLimitResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private String limit;

        private Data(Builder builder) {
            this.limit = builder.limit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public String getLimit() {
            return this.limit;
        }

        public static final class Builder {
            private String limit; 

            /**
             * <p>The QPS limit on the files uploaded from the client.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder limit(String limit) {
                this.limit = limit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
