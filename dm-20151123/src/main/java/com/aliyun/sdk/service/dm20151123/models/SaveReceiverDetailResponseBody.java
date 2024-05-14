// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveReceiverDetailResponseBody} extends {@link TeaModel}
 *
 * <p>SaveReceiverDetailResponseBody</p>
 */
public class SaveReceiverDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCount")
    private Integer errorCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    private SaveReceiverDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCount = builder.errorCount;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveReceiverDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCount
     */
    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCount; 
        private String requestId; 
        private Integer successCount; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCount.
         */
        public Builder errorCount(Integer errorCount) {
            this.errorCount = errorCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public SaveReceiverDetailResponseBody build() {
            return new SaveReceiverDetailResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        private Detail(Builder builder) {
            this.email = builder.email;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        public static final class Builder {
            private String email; 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List < Detail> detail;

        private Data(Builder builder) {
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
