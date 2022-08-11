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
         * Paging.
         */
        public Builder paging(Paging paging) {
            this.paging = paging;
            return this;
        }

        /**
         * Id of the request
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
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ShiftPersonName.
             */
            public Builder shiftPersonName(String shiftPersonName) {
                this.shiftPersonName = shiftPersonName;
                return this;
            }

            /**
             * ShiftPersonUID.
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
             * ShiftPersons.
             */
            public Builder shiftPersons(java.util.List < ShiftPersons> shiftPersons) {
                this.shiftPersons = shiftPersons;
                return this;
            }

            /**
             * TotalCount.
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
