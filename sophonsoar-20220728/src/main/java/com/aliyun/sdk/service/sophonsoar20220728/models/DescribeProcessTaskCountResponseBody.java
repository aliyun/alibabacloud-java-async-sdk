// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProcessTaskCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessTaskCountResponseBody</p>
 */
public class DescribeProcessTaskCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProcessTaskCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessTaskCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProcessTaskCountResponseBody build() {
            return new DescribeProcessTaskCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProcessTaskCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessTaskCountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("EntityUuid")
        private String entityUuid;

        private Data(Builder builder) {
            this.count = builder.count;
            this.entityUuid = builder.entityUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return entityUuid
         */
        public String getEntityUuid() {
            return this.entityUuid;
        }

        public static final class Builder {
            private Long count; 
            private String entityUuid; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * EntityUuid.
             */
            public Builder entityUuid(String entityUuid) {
                this.entityUuid = entityUuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
