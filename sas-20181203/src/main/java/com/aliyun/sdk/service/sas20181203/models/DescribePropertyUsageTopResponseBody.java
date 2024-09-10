// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyUsageTopResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyUsageTopResponseBody</p>
 */
public class DescribePropertyUsageTopResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ItemCount")
    private Integer itemCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopStatisticItems")
    private java.util.List < TopStatisticItems> topStatisticItems;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribePropertyUsageTopResponseBody(Builder builder) {
        this.itemCount = builder.itemCount;
        this.requestId = builder.requestId;
        this.topStatisticItems = builder.topStatisticItems;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUsageTopResponseBody create() {
        return builder().build();
    }

    /**
     * @return itemCount
     */
    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topStatisticItems
     */
    public java.util.List < TopStatisticItems> getTopStatisticItems() {
        return this.topStatisticItems;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer itemCount; 
        private String requestId; 
        private java.util.List < TopStatisticItems> topStatisticItems; 
        private String type; 

        /**
         * The number of fingerprints.
         */
        public Builder itemCount(Integer itemCount) {
            this.itemCount = itemCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The statistical results.
         */
        public Builder topStatisticItems(java.util.List < TopStatisticItems> topStatisticItems) {
            this.topStatisticItems = topStatisticItems;
            return this;
        }

        /**
         * The type of the asset fingerprint. Valid value:
         * <p>
         * 
         * *   **port**: port
         * *   **process**: process
         * *   **software**: software
         * *   **user**: account
         * *   **sca**: middleware
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribePropertyUsageTopResponseBody build() {
            return new DescribePropertyUsageTopResponseBody(this);
        } 

    } 

    public static class TopStatisticItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TopStatisticItems(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopStatisticItems create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer count; 
            private String name; 

            /**
             * The quantity.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The statistical item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TopStatisticItems build() {
                return new TopStatisticItems(this);
            } 

        } 

    }
}
