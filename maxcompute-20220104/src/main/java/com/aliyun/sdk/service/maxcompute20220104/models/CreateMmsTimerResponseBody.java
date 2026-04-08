// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateMmsTimerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMmsTimerResponseBody</p>
 */
public class CreateMmsTimerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateMmsTimerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMmsTimerResponseBody create() {
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

        private Builder(CreateMmsTimerResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMmsTimerResponseBody build() {
            return new CreateMmsTimerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMmsTimerResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMmsTimerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("timerId")
        private Long timerId;

        private Data(Builder builder) {
            this.timerId = builder.timerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return timerId
         */
        public Long getTimerId() {
            return this.timerId;
        }

        public static final class Builder {
            private Long timerId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.timerId = model.timerId;
            } 

            /**
             * <p>timer id</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timerId(Long timerId) {
                this.timerId = timerId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
