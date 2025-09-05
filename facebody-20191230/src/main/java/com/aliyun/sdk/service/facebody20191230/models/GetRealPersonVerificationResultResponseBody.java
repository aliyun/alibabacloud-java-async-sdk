// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

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
 * {@link GetRealPersonVerificationResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealPersonVerificationResultResponseBody</p>
 */
public class GetRealPersonVerificationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRealPersonVerificationResultResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

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

    /**
     * 
     * {@link GetRealPersonVerificationResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetRealPersonVerificationResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Passed")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.passed = model.passed;
            } 

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
