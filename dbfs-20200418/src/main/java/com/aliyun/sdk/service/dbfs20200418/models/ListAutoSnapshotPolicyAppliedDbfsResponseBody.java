// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoSnapshotPolicyAppliedDbfsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoSnapshotPolicyAppliedDbfsResponseBody</p>
 */
public class ListAutoSnapshotPolicyAppliedDbfsResponseBody extends TeaModel {
    @NameInMap("DbfsList")
    private java.util.List < DbfsList> dbfsList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAutoSnapshotPolicyAppliedDbfsResponseBody(Builder builder) {
        this.dbfsList = builder.dbfsList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoSnapshotPolicyAppliedDbfsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbfsList
     */
    public java.util.List < DbfsList> getDbfsList() {
        return this.dbfsList;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DbfsList> dbfsList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DbfsList.
         */
        public Builder dbfsList(java.util.List < DbfsList> dbfsList) {
            this.dbfsList = dbfsList;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAutoSnapshotPolicyAppliedDbfsResponseBody build() {
            return new ListAutoSnapshotPolicyAppliedDbfsResponseBody(this);
        } 

    } 

    public static class DbfsList extends TeaModel {
        @NameInMap("FsId")
        private String fsId;

        @NameInMap("FsName")
        private String fsName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SizeG")
        private Long sizeG;

        @NameInMap("SnapshotCount")
        private Integer snapshotCount;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalSize")
        private Long totalSize;

        private DbfsList(Builder builder) {
            this.fsId = builder.fsId;
            this.fsName = builder.fsName;
            this.regionId = builder.regionId;
            this.sizeG = builder.sizeG;
            this.snapshotCount = builder.snapshotCount;
            this.status = builder.status;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbfsList create() {
            return builder().build();
        }

        /**
         * @return fsId
         */
        public String getFsId() {
            return this.fsId;
        }

        /**
         * @return fsName
         */
        public String getFsName() {
            return this.fsName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sizeG
         */
        public Long getSizeG() {
            return this.sizeG;
        }

        /**
         * @return snapshotCount
         */
        public Integer getSnapshotCount() {
            return this.snapshotCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String fsId; 
            private String fsName; 
            private String regionId; 
            private Long sizeG; 
            private Integer snapshotCount; 
            private String status; 
            private Long totalSize; 

            /**
             * DBFS实例ID
             */
            public Builder fsId(String fsId) {
                this.fsId = fsId;
                return this;
            }

            /**
             * DBFS实例名称
             */
            public Builder fsName(String fsName) {
                this.fsName = fsName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 容量（GB）
             */
            public Builder sizeG(Long sizeG) {
                this.sizeG = sizeG;
                return this;
            }

            /**
             * SnapshotCount.
             */
            public Builder snapshotCount(Integer snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public DbfsList build() {
                return new DbfsList(this);
            } 

        } 

    }
}
