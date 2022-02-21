// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCameraShootingRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCameraShootingRecordsResponseBody</p>
 */
public class ListCameraShootingRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShootingRecords")
    @Validation(required = true)
    private ShootingRecords shootingRecords;

    private ListCameraShootingRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.shootingRecords = builder.shootingRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCameraShootingRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shootingRecords
     */
    public ShootingRecords getShootingRecords() {
        return this.shootingRecords;
    }

    public static final class Builder {
        private String requestId; 
        private ShootingRecords shootingRecords; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShootingRecords.
         */
        public Builder shootingRecords(ShootingRecords shootingRecords) {
            this.shootingRecords = shootingRecords;
            return this;
        }

        public ListCameraShootingRecordsResponseBody build() {
            return new ListCameraShootingRecordsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Number")
        private Long number;

        @NameInMap("RecordTime")
        private Long recordTime;

        @NameInMap("ShootingType")
        private Long shootingType;

        @NameInMap("Status")
        private Long status;

        @NameInMap("Time")
        private Long time;

        private List(Builder builder) {
            this.id = builder.id;
            this.number = builder.number;
            this.recordTime = builder.recordTime;
            this.shootingType = builder.shootingType;
            this.status = builder.status;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return number
         */
        public Long getNumber() {
            return this.number;
        }

        /**
         * @return recordTime
         */
        public Long getRecordTime() {
            return this.recordTime;
        }

        /**
         * @return shootingType
         */
        public Long getShootingType() {
            return this.shootingType;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long id; 
            private Long number; 
            private Long recordTime; 
            private Long shootingType; 
            private Long status; 
            private Long time; 

            /**
             * 主键ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 拍摄数量
             */
            public Builder number(Long number) {
                this.number = number;
                return this;
            }

            /**
             * 记录时间
             */
            public Builder recordTime(Long recordTime) {
                this.recordTime = recordTime;
                return this;
            }

            /**
             * 拍摄类型，0-图片，1-视频
             */
            public Builder shootingType(Long shootingType) {
                this.shootingType = shootingType;
                return this;
            }

            /**
             * 状态：0-未完成，1-已完成
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * 拍照间隔/视频时长，单位为s
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("PageIndex")
        private Long pageIndex;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("TotalPageCount")
        private Long totalPageCount;

        private Pagination(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return pageIndex
         */
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private Long pageIndex; 
            private Long pageSize; 
            private Long totalCount; 
            private Long totalPageCount; 

            /**
             * PageIndex.
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(Long totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class ShootingRecords extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Pagination")
        private Pagination pagination;

        private ShootingRecords(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShootingRecords create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public ShootingRecords build() {
                return new ShootingRecords(this);
            } 

        } 

    }
}
