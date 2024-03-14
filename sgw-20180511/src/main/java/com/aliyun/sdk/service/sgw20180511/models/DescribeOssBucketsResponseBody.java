// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssBucketsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssBucketsResponseBody</p>
 */
public class DescribeOssBucketsResponseBody extends TeaModel {
    @NameInMap("Buckets")
    private Buckets buckets;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeOssBucketsResponseBody(Builder builder) {
        this.buckets = builder.buckets;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssBucketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return buckets
     */
    public Buckets getBuckets() {
        return this.buckets;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Buckets buckets; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Buckets.
         */
        public Builder buckets(Buckets buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeOssBucketsResponseBody build() {
            return new DescribeOssBucketsResponseBody(this);
        } 

    } 

    public static class Bucket extends TeaModel {
        @NameInMap("Name")
        private String name;

        private Bucket(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bucket create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Bucket build() {
                return new Bucket(this);
            } 

        } 

    }
    public static class Buckets extends TeaModel {
        @NameInMap("Bucket")
        private java.util.List < Bucket> bucket;

        private Buckets(Builder builder) {
            this.bucket = builder.bucket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Buckets create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public java.util.List < Bucket> getBucket() {
            return this.bucket;
        }

        public static final class Builder {
            private java.util.List < Bucket> bucket; 

            /**
             * Bucket.
             */
            public Builder bucket(java.util.List < Bucket> bucket) {
                this.bucket = bucket;
                return this;
            }

            public Buckets build() {
                return new Buckets(this);
            } 

        } 

    }
}
