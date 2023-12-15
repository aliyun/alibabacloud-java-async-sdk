// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryTasksStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryTasksStatResponseBody</p>
 */
public class DescribeHistoryTasksStatResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RequestId")
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
         * The details of the instance.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHistoryTasksStatResponseBody build() {
            return new DescribeHistoryTasksStatResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("TotalCount")
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
             * The status of the migration task. Valid values:
             * <p>
             * 
             * *   **NoStart**: The task is not started.
             * *   **Running**:The task is in progress.
             * *   **Success**: The task is successful.
             * *   **Failed**: The task failed.
             * *   **Waiting**: The task is waiting for an incremental backup file to be imported.
             */
            public Builder status(String status) {
                this.status = status;
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
