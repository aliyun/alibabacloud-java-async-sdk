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
 * {@link CreateMmsJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMmsJobResponseBody</p>
 */
public class CreateMmsJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateMmsJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMmsJobResponseBody create() {
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

        private Builder(CreateMmsJobResponseBody model) {
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

        public CreateMmsJobResponseBody build() {
            return new CreateMmsJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMmsJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMmsJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("asyncTaskId")
        private Long asyncTaskId;

        private Data(Builder builder) {
            this.asyncTaskId = builder.asyncTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asyncTaskId
         */
        public Long getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public static final class Builder {
            private Long asyncTaskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.asyncTaskId = model.asyncTaskId;
            } 

            /**
             * asyncTaskId.
             */
            public Builder asyncTaskId(Long asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
