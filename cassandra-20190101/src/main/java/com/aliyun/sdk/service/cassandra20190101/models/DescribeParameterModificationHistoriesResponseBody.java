// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterModificationHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterModificationHistoriesResponseBody</p>
 */
public class DescribeParameterModificationHistoriesResponseBody extends TeaModel {
    @NameInMap("Histories")
    private Histories histories;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeParameterModificationHistoriesResponseBody(Builder builder) {
        this.histories = builder.histories;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterModificationHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return histories
     */
    public Histories getHistories() {
        return this.histories;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Histories histories; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Histories.
         */
        public Builder histories(Histories histories) {
            this.histories = histories;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeParameterModificationHistoriesResponseBody build() {
            return new DescribeParameterModificationHistoriesResponseBody(this);
        } 

    } 

    public static class History extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("OldValue")
        private String oldValue;

        @NameInMap("Time")
        private Long time;

        private History(Builder builder) {
            this.name = builder.name;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String name; 
            private String newValue; 
            private String oldValue; 
            private Long time; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * OldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
    public static class Histories extends TeaModel {
        @NameInMap("History")
        private java.util.List < History> history;

        private Histories(Builder builder) {
            this.history = builder.history;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Histories create() {
            return builder().build();
        }

        /**
         * @return history
         */
        public java.util.List < History> getHistory() {
            return this.history;
        }

        public static final class Builder {
            private java.util.List < History> history; 

            /**
             * History.
             */
            public Builder history(java.util.List < History> history) {
                this.history = history;
                return this;
            }

            public Histories build() {
                return new Histories(this);
            } 

        } 

    }
}
