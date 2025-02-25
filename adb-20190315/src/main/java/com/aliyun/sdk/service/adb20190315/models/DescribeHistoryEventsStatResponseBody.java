// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHistoryEventsStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryEventsStatResponseBody</p>
 */
public class DescribeHistoryEventsStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHistoryEventsStatResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryEventsStatResponseBody create() {
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

        public DescribeHistoryEventsStatResponseBody build() {
            return new DescribeHistoryEventsStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHistoryEventsStatResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHistoryEventsStatResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCategory")
        private String eventCategory;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.eventCategory = builder.eventCategory;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return eventCategory
         */
        public String getEventCategory() {
            return this.eventCategory;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String eventCategory; 
            private Integer totalCount; 

            /**
             * EventCategory.
             */
            public Builder eventCategory(String eventCategory) {
                this.eventCategory = eventCategory;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
