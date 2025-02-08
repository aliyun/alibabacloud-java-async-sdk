// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The pagination data.</p>
         */
        public Builder paging(Paging paging) {
            this.paging = paging;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6F0DBDD-5AD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListShiftSchedulesResponseBody build() {
            return new ListShiftSchedulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListShiftSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListShiftSchedulesResponseBody</p>
     */
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
             * <p>The unique identifier of the shift schedule. You can use the identifier to query the on-duty engineers in the shift schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>2ab6456ada634b2f938ee******9b45b</p>
             */
            public Builder shiftScheduleIdentifier(String shiftScheduleIdentifier) {
                this.shiftScheduleIdentifier = shiftScheduleIdentifier;
                return this;
            }

            /**
             * <p>The name of the shift schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>Duty table name</p>
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
    /**
     * 
     * {@link ListShiftSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListShiftSchedulesResponseBody</p>
     */
    public static class Paging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ShiftSchedules")
        private java.util.List<ShiftSchedules> shiftSchedules;

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
        public java.util.List<ShiftSchedules> getShiftSchedules() {
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
            private java.util.List<ShiftSchedules> shiftSchedules; 
            private Integer totalCount; 

            /**
             * <p>The page number. Minimum value: 1. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The shift schedules.</p>
             */
            public Builder shiftSchedules(java.util.List<ShiftSchedules> shiftSchedules) {
                this.shiftSchedules = shiftSchedules;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
