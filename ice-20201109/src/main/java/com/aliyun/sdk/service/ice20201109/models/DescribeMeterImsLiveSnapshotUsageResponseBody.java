// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImsLiveSnapshotUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImsLiveSnapshotUsageResponseBody</p>
 */
public class DescribeMeterImsLiveSnapshotUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterImsLiveSnapshotUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImsLiveSnapshotUsageResponseBody create() {
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
         * Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterImsLiveSnapshotUsageResponseBody build() {
            return new DescribeMeterImsLiveSnapshotUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Time")
        private Long time;

        private Data(Builder builder) {
            this.count = builder.count;
            this.time = builder.time;
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
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long count; 
            private Long time; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
