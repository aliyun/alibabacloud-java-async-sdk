// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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

        private Builder(TestDataServiceApiResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the test.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>abdsfewe</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TestDataServiceApiResponseBody build() {
            return new TestDataServiceApiResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TestDataServiceApiResponseBody} extends {@link TeaModel}
     *
     * <p>TestDataServiceApiResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.testId = model.testId;
            } 

            /**
             * <p>The ID of the test.</p>
             * 
             * <strong>example:</strong>
             * <p>232432</p>
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
