// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemSubtotalResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProblemSubtotalResponseBody</p>
 */
public class CreateProblemSubtotalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateProblemSubtotalResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemSubtotalResponseBody create() {
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
         * object
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

        public CreateProblemSubtotalResponseBody build() {
            return new CreateProblemSubtotalResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("subtotalId")
        private Long subtotalId;

        private Data(Builder builder) {
            this.subtotalId = builder.subtotalId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return subtotalId
         */
        public Long getSubtotalId() {
            return this.subtotalId;
        }

        public static final class Builder {
            private Long subtotalId; 

            /**
             * subtotalId.
             */
            public Builder subtotalId(Long subtotalId) {
                this.subtotalId = subtotalId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
