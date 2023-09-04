// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProblemResponseBody</p>
 */
public class CreateProblemResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateProblemResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemResponseBody create() {
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
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProblemResponseBody build() {
            return new CreateProblemResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("problemId")
        private Long problemId;

        private Data(Builder builder) {
            this.problemId = builder.problemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return problemId
         */
        public Long getProblemId() {
            return this.problemId;
        }

        public static final class Builder {
            private Long problemId; 

            /**
             * problemId.
             */
            public Builder problemId(Long problemId) {
                this.problemId = problemId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
