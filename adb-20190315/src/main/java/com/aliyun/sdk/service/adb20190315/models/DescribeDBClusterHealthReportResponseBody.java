// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterHealthReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterHealthReportResponseBody</p>
 */
public class DescribeDBClusterHealthReportResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterHealthReportResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterHealthReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private String requestId; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterHealthReportResponseBody build() {
            return new DescribeDBClusterHealthReportResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Avg")
        private String avg;

        @NameInMap("Key")
        private String key;

        @NameInMap("Max")
        private String max;

        @NameInMap("Name")
        private String name;

        private Items(Builder builder) {
            this.avg = builder.avg;
            this.key = builder.key;
            this.max = builder.max;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return avg
         */
        public String getAvg() {
            return this.avg;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String avg; 
            private String key; 
            private String max; 
            private String name; 

            /**
             * Avg.
             */
            public Builder avg(String avg) {
                this.avg = avg;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
