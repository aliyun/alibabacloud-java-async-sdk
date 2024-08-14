// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShiftSchedulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListShiftSchedulesResponseBody</p>
 */
public class ListShiftSchedulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Paging")
    private Paging paging;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListShiftSchedulesResponseBody(Builder builder) {
        this.paging = builder.paging;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShiftSchedulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return paging
     */
    public Paging getPaging() {
        return this.paging;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Paging paging; 
        private String requestId; 

        /**
         * The pagination data.
         */
        public Builder paging(Paging paging) {
            this.paging = paging;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListShiftSchedulesResponseBody build() {
            return new ListShiftSchedulesResponseBody(this);
        } 

    } 

    public static class ShiftSchedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShiftScheduleIdentifier")
        private String shiftScheduleIdentifier;

        @com.aliyun.core.annotation.NameInMap("ShiftScheduleName")
        private String shiftScheduleName;

        private ShiftSchedules(Builder builder) {
            this.shiftScheduleIdentifier = builder.shiftScheduleIdentifier;
            this.shiftScheduleName = builder.shiftScheduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShiftSchedules create() {
            return builder().build();
        }

        /**
         * @return shiftScheduleIdentifier
         */
        public String getShiftScheduleIdentifier() {
            return this.shiftScheduleIdentifier;
        }

        /**
         * @return shiftScheduleName
         */
        public String getShiftScheduleName() {
            return this.shiftScheduleName;
        }

        public static final class Builder {
            private String shiftScheduleIdentifier; 
            private String shiftScheduleName; 

            /**
             * The unique identifier of the shift schedule. You can use the identifier to query the on-duty engineers in the shift schedule.
             */
            public Builder shiftScheduleIdentifier(String shiftScheduleIdentifier) {
                this.shiftScheduleIdentifier = shiftScheduleIdentifier;
                return this;
            }

            /**
             * The name of the shift schedule.
             */
            public Builder shiftScheduleName(String shiftScheduleName) {
                this.shiftScheduleName = shiftScheduleName;
                return this;
            }

            public ShiftSchedules build() {
                return new ShiftSchedules(this);
            } 

        } 

    }
    public static class Paging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ShiftSchedules")
        private java.util.List < ShiftSchedules> shiftSchedules;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Paging(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.shiftSchedules = builder.shiftSchedules;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paging create() {
            return builder().build();
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
         * @return shiftSchedules
         */
        public java.util.List < ShiftSchedules> getShiftSchedules() {
            return this.shiftSchedules;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < ShiftSchedules> shiftSchedules; 
            private Integer totalCount; 

            /**
             * The page number. Minimum value: 1. Maximum value: 100.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The shift schedules.
             */
            public Builder shiftSchedules(java.util.List < ShiftSchedules> shiftSchedules) {
                this.shiftSchedules = shiftSchedules;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Paging build() {
                return new Paging(this);
            } 

        } 

    }
}
