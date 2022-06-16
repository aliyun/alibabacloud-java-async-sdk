// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersistentVolumeResponseBody} extends {@link TeaModel}
 *
 * <p>ListPersistentVolumeResponseBody</p>
 */
public class ListPersistentVolumeResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListPersistentVolumeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errMsg = builder.errMsg;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersistentVolumeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String errMsg; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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

        public ListPersistentVolumeResponseBody build() {
            return new ListPersistentVolumeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessModes")
        private String accessModes;

        @NameInMap("Capacity")
        private String capacity;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MountDir")
        private String mountDir;

        @NameInMap("Name")
        private String name;

        @NameInMap("PvcName")
        private String pvcName;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("ReclaimPolicy")
        private String reclaimPolicy;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageClass")
        private String storageClass;

        private Data(Builder builder) {
            this.accessModes = builder.accessModes;
            this.capacity = builder.capacity;
            this.createTime = builder.createTime;
            this.mountDir = builder.mountDir;
            this.name = builder.name;
            this.pvcName = builder.pvcName;
            this.reason = builder.reason;
            this.reclaimPolicy = builder.reclaimPolicy;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessModes
         */
        public String getAccessModes() {
            return this.accessModes;
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return mountDir
         */
        public String getMountDir() {
            return this.mountDir;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pvcName
         */
        public String getPvcName() {
            return this.pvcName;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reclaimPolicy
         */
        public String getReclaimPolicy() {
            return this.reclaimPolicy;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private String accessModes; 
            private String capacity; 
            private String createTime; 
            private String mountDir; 
            private String name; 
            private String pvcName; 
            private String reason; 
            private String reclaimPolicy; 
            private String status; 
            private String storageClass; 

            /**
             * AccessModes.
             */
            public Builder accessModes(String accessModes) {
                this.accessModes = accessModes;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * MountDir.
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PvcName.
             */
            public Builder pvcName(String pvcName) {
                this.pvcName = pvcName;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReclaimPolicy.
             */
            public Builder reclaimPolicy(String reclaimPolicy) {
                this.reclaimPolicy = reclaimPolicy;
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
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
