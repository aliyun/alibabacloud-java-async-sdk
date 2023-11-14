// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileUploadLimitResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileUploadLimitResponseBody</p>
 */
public class GetFileUploadLimitResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * The data returned if the request is successful.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileUploadLimitResponseBody build() {
            return new GetFileUploadLimitResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Limit")
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
             * The QPS limit on the files uploaded from the client.
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
