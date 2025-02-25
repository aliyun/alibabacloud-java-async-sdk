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
 * {@link UpdateMmsDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMmsDataSourceResponseBody</p>
 */
public class UpdateMmsDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateMmsDataSourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmsDataSourceResponseBody create() {
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

        public UpdateMmsDataSourceResponseBody build() {
            return new UpdateMmsDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMmsDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateMmsDataSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("asyncTaskId")
        private Long asyncTaskId;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        private Data(Builder builder) {
            this.asyncTaskId = builder.asyncTaskId;
            this.sourceId = builder.sourceId;
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

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        public static final class Builder {
            private Long asyncTaskId; 
            private Long sourceId; 

            /**
             * asyncTaskId.
             */
            public Builder asyncTaskId(Long asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
