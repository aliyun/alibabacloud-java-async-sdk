// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShiftPersonnelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListShiftPersonnelsResponseBody</p>
 */
public class ListShiftPersonnelsResponseBody extends TeaModel {
    @NameInMap("Paging")
    private Paging paging;

    @NameInMap("RequestId")
    private String requestId;

    private ListShiftPersonnelsResponseBody(Builder builder) {
        this.paging = builder.paging;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShiftPersonnelsResponseBody create() {
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
         * The ID of the request. You can use the ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListShiftPersonnelsResponseBody build() {
            return new ListShiftPersonnelsResponseBody(this);
        } 

    } 

    public static class ShiftPersons extends TeaModel {
        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ShiftPersonName")
        private String shiftPersonName;

        @NameInMap("ShiftPersonUID")
        private String shiftPersonUID;

        private ShiftPersons(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.shiftPersonName = builder.shiftPersonName;
            this.shiftPersonUID = builder.shiftPersonUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShiftPersons create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return shiftPersonName
         */
        public String getShiftPersonName() {
            return this.shiftPersonName;
        }

        /**
         * @return shiftPersonUID
         */
        public String getShiftPersonUID() {
            return this.shiftPersonUID;
        }

        public static final class Builder {
            private Long beginTime; 
            private Long endTime; 
            private String shiftPersonName; 
            private String shiftPersonUID; 

            /**
             * The time when the on-duty engineer starts the shift.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * The time when the on-duty engineer ends the shift.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the on-duty engineer.
             */
            public Builder shiftPersonName(String shiftPersonName) {
                this.shiftPersonName = shiftPersonName;
                return this;
            }

            /**
             * The UID of the on-duty engineer.
             */
            public Builder shiftPersonUID(String shiftPersonUID) {
                this.shiftPersonUID = shiftPersonUID;
                return this;
            }

            public ShiftPersons build() {
                return new ShiftPersons(this);
            } 

        } 

    }
    public static class Paging extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ShiftPersons")
        private java.util.List < ShiftPersons> shiftPersons;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Paging(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.shiftPersons = builder.shiftPersons;
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
         * @return shiftPersons
         */
        public java.util.List < ShiftPersons> getShiftPersons() {
            return this.shiftPersons;
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
            private java.util.List < ShiftPersons> shiftPersons; 
            private Integer totalCount; 

            /**
             * The page number of the returned page. Minimum value: 1. Maximum value: 100. Default value: 1.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The on-duty engineers in the shift schedule.
             */
            public Builder shiftPersons(java.util.List < ShiftPersons> shiftPersons) {
                this.shiftPersons = shiftPersons;
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
