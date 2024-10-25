// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the SDGs.</p>
         */
        public Builder SDGs(java.util.List < SDGs> SDGs) {
            this.SDGs = SDGs;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSDGResponseBody build() {
            return new DescribeSDGResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSDGResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDGResponseBody</p>
     */
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
             * <p>The time when the SDG was created on the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-27 15:13:26</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-26</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-517qu0tgznrg622he7nf4wd7n</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The status of the SDG on the node. Valid values:</p>
             * <ul>
             * <li><strong>sdg_making</strong></li>
             * <li><strong>sdg_saving</strong></li>
             * <li><strong>sdg_copying</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>success</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
    /**
     * 
     * {@link DescribeSDGResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDGResponseBody</p>
     */
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
             * <p>The time when the SDG was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-16T06:18:40Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test-20000</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The number of redundant replicas to quickly respond to shared mounts.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder redundantNum(Integer redundantNum) {
                this.redundantNum = redundantNum;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the status was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-22T08:17Z</p>
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
    /**
     * 
     * {@link DescribeSDGResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDGResponseBody</p>
     */
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
             * <p>SDGs that have snapshots.</p>
             */
            public Builder avaliableRegionIds(java.util.List < AvaliableRegionIds> avaliableRegionIds) {
                this.avaliableRegionIds = avaliableRegionIds;
                return this;
            }

            /**
             * <p>The ID of the instance on which the SDG is created.</p>
             * 
             * <strong>example:</strong>
             * <p>aic-5x20dyeos****</p>
             */
            public Builder creationInstanceId(String creationInstanceId) {
                this.creationInstanceId = creationInstanceId;
                return this;
            }

            /**
             * <p>The ID of the node on which the SDG is created.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-26</p>
             */
            public Builder creationRegionId(String creationRegionId) {
                this.creationRegionId = creationRegionId;
                return this;
            }

            /**
             * <p>The time when the first SDG in the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-27 15:07:21</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the SDG.</p>
             * 
             * <strong>example:</strong>
             * <p>Testing SDGs</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the source SDG from which you want to create an SDG. The value of this parameter is the value of the <strong>FromSDGId</strong> parameter that you need to specify when you call the <a href="https://help.aliyun.com/document_detail/608128.html">CreateSDG</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-xxxxx</p>
             */
            public Builder parentSDGId(String parentSDGId) {
                this.parentSDGId = parentSDGId;
                return this;
            }

            /**
             * <p>The preload information.</p>
             */
            public Builder preloadInfos(java.util.List < PreloadInfos> preloadInfos) {
                this.preloadInfos = preloadInfos;
                return this;
            }

            /**
             * <p>The ID of the SDG.</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-30e1fdba7196bc****</p>
             */
            public Builder SDGId(String SDGId) {
                this.SDGId = SDGId;
                return this;
            }

            /**
             * <p>The size of the SDG. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the SDG creation. Valid values:</p>
             * <ul>
             * <li><strong>sdg_making</strong></li>
             * <li><strong>sdg_saving</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>success</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the SDG was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-27 16:04:39</p>
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
