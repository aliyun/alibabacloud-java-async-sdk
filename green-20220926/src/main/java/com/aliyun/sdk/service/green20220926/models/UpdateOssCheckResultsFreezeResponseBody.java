// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateOssCheckResultsFreezeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOssCheckResultsFreezeResponseBody</p>
 */
public class UpdateOssCheckResultsFreezeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateOssCheckResultsFreezeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssCheckResultsFreezeResponseBody create() {
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

        private Builder(UpdateOssCheckResultsFreezeResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateOssCheckResultsFreezeResponseBody build() {
            return new UpdateOssCheckResultsFreezeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateOssCheckResultsFreezeResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateOssCheckResultsFreezeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidCount")
        private Integer invalidCount;

        @com.aliyun.core.annotation.NameInMap("RepeatCount")
        private Integer repeatCount;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.invalidCount = builder.invalidCount;
            this.repeatCount = builder.repeatCount;
            this.successCount = builder.successCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return invalidCount
         */
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        /**
         * @return repeatCount
         */
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer invalidCount; 
            private Integer repeatCount; 
            private Integer successCount; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.invalidCount = model.invalidCount;
                this.repeatCount = model.repeatCount;
                this.successCount = model.successCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of invalid records.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder invalidCount(Integer invalidCount) {
                this.invalidCount = invalidCount;
                return this;
            }

            /**
             * <p>The number of duplicate records.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder repeatCount(Integer repeatCount) {
                this.repeatCount = repeatCount;
                return this;
            }

            /**
             * <p>The number of successful operations.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
