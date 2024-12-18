// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeHistoryEventsStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryEventsStatResponseBody</p>
 */
public class DescribeHistoryEventsStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        /**
         * <p>The event.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E52666CC-330E-418A-8E5B-A19E3FB42D13</p>
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
             * <p>The system event category. For more information, see <a href="https://help.aliyun.com/document_detail/129759.html">View the event history of an ApsaraDB RDS instance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Exception</p>
             */
            public Builder eventCategory(String eventCategory) {
                this.eventCategory = eventCategory;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
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
