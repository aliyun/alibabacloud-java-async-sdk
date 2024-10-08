// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSDGResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSDGResponseBody</p>
 */
public class DescribeSDGResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SDGs")
    private java.util.List < SDGs> SDGs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSDGResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.SDGs = builder.SDGs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SDGs
     */
    public java.util.List < SDGs> getSDGs() {
        return this.SDGs;
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
        private String requestId; 
        private java.util.List < SDGs> SDGs; 
        private Integer totalCount; 

        /**
         * The page number.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the SDGs.
         */
        public Builder SDGs(java.util.List < SDGs> SDGs) {
            this.SDGs = SDGs;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSDGResponseBody build() {
            return new DescribeSDGResponseBody(this);
        } 

    } 

    public static class AvaliableRegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AvaliableRegionIds(Builder builder) {
            this.creationTime = builder.creationTime;
            this.regionId = builder.regionId;
            this.snapshotId = builder.snapshotId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvaliableRegionIds create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String regionId; 
            private String snapshotId; 
            private String status; 

            /**
             * The time when the SDG was created on the node.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the snapshot.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The status of the SDG on the node. Valid values:
             * <p>
             * 
             * *   **sdg_making**
             * *   **sdg_saving**
             * *   **sdg_copying**
             * *   **failed**
             * *   **success**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AvaliableRegionIds build() {
                return new AvaliableRegionIds(this);
            } 

        } 

    }
    public static class PreloadInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RedundantNum")
        private Integer redundantNum;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private PreloadInfos(Builder builder) {
            this.creationTime = builder.creationTime;
            this.namespace = builder.namespace;
            this.redundantNum = builder.redundantNum;
            this.regionId = builder.regionId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreloadInfos create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return redundantNum
         */
        public Integer getRedundantNum() {
            return this.redundantNum;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String creationTime; 
            private String namespace; 
            private Integer redundantNum; 
            private String regionId; 
            private String updateTime; 

            /**
             * The time when the SDG was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The number of redundant replicas to quickly respond to shared mounts.
             */
            public Builder redundantNum(Integer redundantNum) {
                this.redundantNum = redundantNum;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the status was last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PreloadInfos build() {
                return new PreloadInfos(this);
            } 

        } 

    }
    public static class SDGs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvaliableRegionIds")
        private java.util.List < AvaliableRegionIds> avaliableRegionIds;

        @com.aliyun.core.annotation.NameInMap("CreationInstanceId")
        private String creationInstanceId;

        @com.aliyun.core.annotation.NameInMap("CreationRegionId")
        private String creationRegionId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ParentSDGId")
        private String parentSDGId;

        @com.aliyun.core.annotation.NameInMap("PreloadInfos")
        private java.util.List < PreloadInfos> preloadInfos;

        @com.aliyun.core.annotation.NameInMap("SDGId")
        private String SDGId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private SDGs(Builder builder) {
            this.avaliableRegionIds = builder.avaliableRegionIds;
            this.creationInstanceId = builder.creationInstanceId;
            this.creationRegionId = builder.creationRegionId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.parentSDGId = builder.parentSDGId;
            this.preloadInfos = builder.preloadInfos;
            this.SDGId = builder.SDGId;
            this.size = builder.size;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SDGs create() {
            return builder().build();
        }

        /**
         * @return avaliableRegionIds
         */
        public java.util.List < AvaliableRegionIds> getAvaliableRegionIds() {
            return this.avaliableRegionIds;
        }

        /**
         * @return creationInstanceId
         */
        public String getCreationInstanceId() {
            return this.creationInstanceId;
        }

        /**
         * @return creationRegionId
         */
        public String getCreationRegionId() {
            return this.creationRegionId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return parentSDGId
         */
        public String getParentSDGId() {
            return this.parentSDGId;
        }

        /**
         * @return preloadInfos
         */
        public java.util.List < PreloadInfos> getPreloadInfos() {
            return this.preloadInfos;
        }

        /**
         * @return SDGId
         */
        public String getSDGId() {
            return this.SDGId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < AvaliableRegionIds> avaliableRegionIds; 
            private String creationInstanceId; 
            private String creationRegionId; 
            private String creationTime; 
            private String description; 
            private String parentSDGId; 
            private java.util.List < PreloadInfos> preloadInfos; 
            private String SDGId; 
            private Long size; 
            private String status; 
            private String updateTime; 

            /**
             * SDGs that have snapshots.
             */
            public Builder avaliableRegionIds(java.util.List < AvaliableRegionIds> avaliableRegionIds) {
                this.avaliableRegionIds = avaliableRegionIds;
                return this;
            }

            /**
             * The ID of the instance on which the SDG is created.
             */
            public Builder creationInstanceId(String creationInstanceId) {
                this.creationInstanceId = creationInstanceId;
                return this;
            }

            /**
             * The ID of the node on which the SDG is created.
             */
            public Builder creationRegionId(String creationRegionId) {
                this.creationRegionId = creationRegionId;
                return this;
            }

            /**
             * The time when the first SDG in the node was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the SDG.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the source SDG from which you want to create an SDG. The value of this parameter is the value of the **FromSDGId** parameter that you need to specify when you call the [CreateSDG](~~608128~~) operation.
             */
            public Builder parentSDGId(String parentSDGId) {
                this.parentSDGId = parentSDGId;
                return this;
            }

            /**
             * The preload information.
             */
            public Builder preloadInfos(java.util.List < PreloadInfos> preloadInfos) {
                this.preloadInfos = preloadInfos;
                return this;
            }

            /**
             * The ID of the SDG.
             */
            public Builder SDGId(String SDGId) {
                this.SDGId = SDGId;
                return this;
            }

            /**
             * The size of the SDG. Unit: GB.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the SDG creation. Valid values:
             * <p>
             * 
             * *   **sdg_making**
             * *   **sdg_saving**
             * *   **failed**
             * *   **success**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the SDG was last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SDGs build() {
                return new SDGs(this);
            } 

        } 

    }
}
