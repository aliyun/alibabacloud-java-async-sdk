// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestDataServiceApiResponseBody} extends {@link TeaModel}
 *
 * <p>TestDataServiceApiResponseBody</p>
 */
public class TestDataServiceApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The information about the test.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("TestId")
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
             * The ID of the test.
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
