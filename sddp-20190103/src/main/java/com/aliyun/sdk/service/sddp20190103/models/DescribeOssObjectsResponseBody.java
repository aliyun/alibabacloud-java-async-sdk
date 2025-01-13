// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeOssObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssObjectsResponseBody</p>
 */
public class DescribeOssObjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("NextMarker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Truncated")
    private Boolean truncated;

    private DescribeOssObjectsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.marker = builder.marker;
        this.nextMarker = builder.nextMarker;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.truncated = builder.truncated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssObjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
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

    /**
     * @return truncated
     */
    public Boolean getTruncated() {
        return this.truncated;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private String marker; 
        private String nextMarker; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Boolean truncated; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>A list of OSS objects.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Truncated.
         */
        public Builder truncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
        }

        public DescribeOssObjectsResponseBody build() {
            return new DescribeOssObjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOssObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssObjectsResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        private RuleList(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
            this.riskLevelId = builder.riskLevelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return riskLevelId
         */
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public static final class Builder {
            private Long count; 
            private String name; 
            private Long riskLevelId; 

            /**
             * <p>The number of times that the rule is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The search keyword. Fuzzy match is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>ID card</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level of the OSS object. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
             * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
             * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
             * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
             * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOssObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssObjectsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Category")
        private Long category;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("FileCategoryCode")
        private Long fileCategoryCode;

        @com.aliyun.core.annotation.NameInMap("FileCategoryName")
        private String fileCategoryName;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
        private Long lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Integer sensitiveCount;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private Items(Builder builder) {
            this.bucketName = builder.bucketName;
            this.category = builder.category;
            this.categoryName = builder.categoryName;
            this.fileCategoryCode = builder.fileCategoryCode;
            this.fileCategoryName = builder.fileCategoryName;
            this.fileId = builder.fileId;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleCount = builder.ruleCount;
            this.ruleList = builder.ruleList;
            this.sensitiveCount = builder.sensitiveCount;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return category
         */
        public Long getCategory() {
            return this.category;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return fileCategoryCode
         */
        public Long getFileCategoryCode() {
            return this.fileCategoryCode;
        }

        /**
         * @return fileCategoryName
         */
        public String getFileCategoryName() {
            return this.fileCategoryName;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastModifiedTime
         */
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return riskLevelId
         */
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        /**
         * @return riskLevelName
         */
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return ruleList
         */
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
        }

        /**
         * @return sensitiveCount
         */
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String bucketName; 
            private Long category; 
            private String categoryName; 
            private Long fileCategoryCode; 
            private String fileCategoryName; 
            private String fileId; 
            private String id; 
            private Long instanceId; 
            private Long lastModifiedTime; 
            private String name; 
            private String regionId; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private Integer ruleCount; 
            private java.util.List<RuleList> ruleList; 
            private Integer sensitiveCount; 
            private Long size; 

            /**
             * <p>The name of the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-duplicate-***</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The type of the OSS object. Valid values include <strong>900001</strong>, <strong>800015</strong>, or <strong>800005</strong>, which indicates the MP4 file, PDF file, or OSS configuration file, respectively.</p>
             * 
             * <strong>example:</strong>
             * <p>900001</p>
             */
            public Builder category(Long category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The name of the file type.</p>
             * 
             * <strong>example:</strong>
             * <p>MP4 file</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The code of the file type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fileCategoryCode(Long fileCategoryCode) {
                this.fileCategoryCode = fileCategoryCode;
                return this;
            }

            /**
             * <p>The name of the file type.</p>
             * 
             * <strong>example:</strong>
             * <p>text file</p>
             */
            public Builder fileCategoryName(String fileCategoryName) {
                this.fileCategoryName = fileCategoryName;
                return this;
            }

            /**
             * <p>The file ID of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>file-22***</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The ID of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>17383</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the instance to which the OSS object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1232122</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the file was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1536751124000</p>
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>The name of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>obj_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region ID of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-***</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level of the OSS object. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
             * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
             * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
             * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
             * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * <p>The name of the sensitivity level for the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>Medium sensitivity level</p>
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * <p>The number of rules that are hit.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * <p>A list of rules.</p>
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * <p>The number of fields that are hit.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
