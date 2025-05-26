// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryReceiverDetailResponseBody model) {
            this.dataSchema = model.dataSchema;
            this.nextStart = model.nextStart;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.data = model.data;
        } 

        /**
         * <p>Field name for the Data of recipients</p>
         * 
         * <strong>example:</strong>
         * <p>UserName,NickName,Gender,Birthday,Mobile</p>
         */
        public Builder dataSchema(String dataSchema) {
            this.dataSchema = dataSchema;
            return this;
        }

        /**
         * <p>Used for pagination. If there are more results, set this returned value to the NextStart in the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>90f0243616#<a href="mailto:40test@example.com">40test@example.com</a></p>
         */
        public Builder nextStart(String nextStart) {
            this.nextStart = nextStart;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count (deprecated field, kept for historical compatibility)</p>
         * 
         * <strong>example:</strong>
         * <p>361</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Detailed information</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryReceiverDetailResponseBody build() {
            return new QueryReceiverDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryReceiverDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryReceiverDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Detail model) {
                this.createTime = model.createTime;
                this.data = model.data;
                this.email = model.email;
                this.utcCreateTime = model.utcCreateTime;
            } 

            /**
             * <p>Creation Time</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-29T13:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Content</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Domains&quot;: [&quot;a.example.net&quot;, &quot;b.example.net&quot;, &quot;c.example.net&quot;, &quot;d.example.net&quot;]}</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Recipient address</p>
             * 
             * <strong>example:</strong>
             * <p>a***@example.net</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Creation time in UTC format</p>
             * 
             * <strong>example:</strong>
             * <p>1569734892</p>
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
    /**
     * 
     * {@link QueryReceiverDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryReceiverDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private java.util.List<Detail> detail;

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
        public java.util.List<Detail> getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private java.util.List<Detail> detail; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.detail = model.detail;
            } 

            /**
             * detail.
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
