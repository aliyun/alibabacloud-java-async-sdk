// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryEventsStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryEventsStatResponseBody</p>
 */
public class DescribeHistoryEventsStatResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RequestId")
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
         * The migration tasks.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHistoryEventsStatResponseBody build() {
            return new DescribeHistoryEventsStatResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("EventCategory")
        private String eventCategory;

        @NameInMap("TotalCount")
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
             * Event category.
             */
            public Builder eventCategory(String eventCategory) {
                this.eventCategory = eventCategory;
                return this;
            }

            /**
             * The total number of tasks that meet these constraints without taking pagination into account.
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
