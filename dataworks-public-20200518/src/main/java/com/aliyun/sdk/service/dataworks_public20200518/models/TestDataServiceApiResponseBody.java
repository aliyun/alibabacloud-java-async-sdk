// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestDataServiceApiResponseBody} extends {@link TeaModel}
 *
 * <p>TestDataServiceApiResponseBody</p>
 */
public class TestDataServiceApiResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private TestDataServiceApiResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestDataServiceApiResponseBody create() {
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

        public TestDataServiceApiResponseBody build() {
            return new TestDataServiceApiResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TestId")
        private String testId;

        private Data(Builder builder) {
            this.testId = builder.testId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return testId
         */
        public String getTestId() {
            return this.testId;
        }

        public static final class Builder {
            private String testId; 

            /**
             * TestId.
             */
            public Builder testId(String testId) {
                this.testId = testId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
