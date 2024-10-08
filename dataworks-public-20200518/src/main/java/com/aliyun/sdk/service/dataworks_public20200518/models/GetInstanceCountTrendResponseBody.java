// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceCountTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceCountTrendResponseBody</p>
 */
public class GetInstanceCountTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCounts")
    private java.util.List < InstanceCounts> instanceCounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceCountTrendResponseBody(Builder builder) {
        this.instanceCounts = builder.instanceCounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceCountTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceCounts
     */
    public java.util.List < InstanceCounts> getInstanceCounts() {
        return this.instanceCounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceCounts> instanceCounts; 
        private String requestId; 

        /**
         * The quantity trend of instances.
         */
        public Builder instanceCounts(java.util.List < InstanceCounts> instanceCounts) {
            this.instanceCounts = instanceCounts;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceCountTrendResponseBody build() {
            return new GetInstanceCountTrendResponseBody(this);
        } 

    } 

    public static class InstanceCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Date")
        private Long date;

        private InstanceCounts(Builder builder) {
            this.count = builder.count;
            this.date = builder.date;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCounts create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return date
         */
        public Long getDate() {
            return this.date;
        }

        public static final class Builder {
            private Integer count; 
            private Long date; 

            /**
             * The number of instances.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The data timestamp.
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            public InstanceCounts build() {
                return new InstanceCounts(this);
            } 

        } 

    }
}
