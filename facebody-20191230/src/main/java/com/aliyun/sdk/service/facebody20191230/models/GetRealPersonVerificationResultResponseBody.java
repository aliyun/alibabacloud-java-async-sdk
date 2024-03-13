// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealPersonVerificationResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealPersonVerificationResultResponseBody</p>
 */
public class GetRealPersonVerificationResultResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetRealPersonVerificationResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealPersonVerificationResultResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRealPersonVerificationResultResponseBody build() {
            return new GetRealPersonVerificationResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Passed")
        private Boolean passed;

        private Data(Builder builder) {
            this.passed = builder.passed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return passed
         */
        public Boolean getPassed() {
            return this.passed;
        }

        public static final class Builder {
            private Boolean passed; 

            /**
             * Passed.
             */
            public Builder passed(Boolean passed) {
                this.passed = passed;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
