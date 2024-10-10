// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The number of fingerprints.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder itemCount(Integer itemCount) {
            this.itemCount = itemCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16AA5B62-A3C1-520B-B289-4BD971CC17AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistical results.</p>
         */
        public Builder topStatisticItems(java.util.List < TopStatisticItems> topStatisticItems) {
            this.topStatisticItems = topStatisticItems;
            return this;
        }

        /**
         * <p>The type of the asset fingerprint. Valid value:</p>
         * <ul>
         * <li><strong>port</strong>: port</li>
         * <li><strong>process</strong>: process</li>
         * <li><strong>software</strong>: software</li>
         * <li><strong>user</strong>: account</li>
         * <li><strong>sca</strong>: middleware</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribePropertyUsageTopResponseBody build() {
            return new DescribePropertyUsageTopResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyUsageTopResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyUsageTopResponseBody</p>
     */
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
             * <p>The quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The statistical item.</p>
             * 
             * <strong>example:</strong>
             * <p>openssl</p>
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
