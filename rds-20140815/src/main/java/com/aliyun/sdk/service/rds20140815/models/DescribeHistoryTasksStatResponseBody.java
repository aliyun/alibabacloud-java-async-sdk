// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHistoryTasksStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryTasksStatResponseBody</p>
 */
public class DescribeHistoryTasksStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHistoryTasksStatResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryTasksStatResponseBody create() {
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
         * <p>The queried tasks.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHistoryTasksStatResponseBody build() {
            return new DescribeHistoryTasksStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHistoryTasksStatResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHistoryTasksStatResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.status = builder.status;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String status; 
            private Integer totalCount; 

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>Scheduled</strong></li>
             * <li><strong>Running</strong></li>
             * <li><strong>Succeed</strong></li>
             * <li><strong>Failed</strong></li>
             * <li><strong>Cancelling</strong></li>
             * <li><strong>Canceled</strong></li>
             * <li><strong>Waiting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeed,Waiting</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
