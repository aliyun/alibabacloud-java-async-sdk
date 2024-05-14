// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReceiverDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryReceiverDetailResponseBody</p>
 */
public class QueryReceiverDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSchema")
    private String dataSchema;

    @com.aliyun.core.annotation.NameInMap("NextStart")
    private String nextStart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private QueryReceiverDetailResponseBody(Builder builder) {
        this.dataSchema = builder.dataSchema;
        this.nextStart = builder.nextStart;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReceiverDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSchema
     */
    public String getDataSchema() {
        return this.dataSchema;
    }

    /**
     * @return nextStart
     */
    public String getNextStart() {
        return this.nextStart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String dataSchema; 
        private String nextStart; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

        /**
         * DataSchema.
         */
        public Builder dataSchema(String dataSchema) {
            this.dataSchema = dataSchema;
            return this;
        }

        /**
         * NextStart.
         */
        public Builder nextStart(String nextStart) {
            this.nextStart = nextStart;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryReceiverDetailResponseBody build() {
            return new QueryReceiverDetailResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("UtcCreateTime")
        private Long utcCreateTime;

        private Detail(Builder builder) {
            this.createTime = builder.createTime;
            this.data = builder.data;
            this.email = builder.email;
            this.utcCreateTime = builder.utcCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return utcCreateTime
         */
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String data; 
            private String email; 
            private Long utcCreateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * UtcCreateTime.
             */
            public Builder utcCreateTime(Long utcCreateTime) {
                this.utcCreateTime = utcCreateTime;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
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
             * detail.
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
