// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListShiftPersonnelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListShiftPersonnelsResponseBody</p>
 */
public class ListShiftPersonnelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Paging")
    private Paging paging;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The pagination data.</p>
         */
        public Builder paging(Paging paging) {
            this.paging = paging;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListShiftPersonnelsResponseBody build() {
            return new ListShiftPersonnelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListShiftPersonnelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListShiftPersonnelsResponseBody</p>
     */
    public static class ShiftPersons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ShiftPersonName")
        private String shiftPersonName;

        @com.aliyun.core.annotation.NameInMap("ShiftPersonUID")
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
             * <p>The time when the on-duty engineer starts the shift.</p>
             * 
             * <strong>example:</strong>
             * <p>1593950832000</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The time when the on-duty engineer ends the shift.</p>
             * 
             * <strong>example:</strong>
             * <p>1593950832000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the on-duty engineer.</p>
             */
            public Builder shiftPersonName(String shiftPersonName) {
                this.shiftPersonName = shiftPersonName;
                return this;
            }

            /**
             * <p>The UID of the on-duty engineer.</p>
             * 
             * <strong>example:</strong>
             * <p>3726346****</p>
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
    /**
     * 
     * {@link ListShiftPersonnelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListShiftPersonnelsResponseBody</p>
     */
    public static class Paging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ShiftPersons")
        private java.util.List < ShiftPersons> shiftPersons;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The page number. Valid values: 1 to 100. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>A list of on-duty engineers in a shift schedule.</p>
             */
            public Builder shiftPersons(java.util.List < ShiftPersons> shiftPersons) {
                this.shiftPersons = shiftPersons;
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
