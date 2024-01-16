// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssObjectsResponseBody</p>
 */
public class DescribeOssObjectsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOssObjectsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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
    public java.util.List < Items> getItems() {
        return this.items;
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
        private Integer currentPage; 
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * A list of OSS objects.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOssObjectsResponseBody build() {
            return new DescribeOssObjectsResponseBody(this);
        } 

    } 

    public static class RuleList extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Name")
        private String name;

        @NameInMap("RiskLevelId")
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
             * The number of times that the rule is hit.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The search keyword. Fuzzy match is supported.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the sensitivity level of the OSS object. Valid values:
             * <p>
             * 
             * *   **1**: N/A, which indicates that no sensitive data is detected.
             * *   **2**: S1, which indicates the low sensitivity level.
             * *   **3**: S2, which indicates the medium sensitivity level.
             * *   **4**: S3, which indicates the high sensitivity level.
             * *   **5**: S4, which indicates the highest sensitivity level.
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
    public static class Items extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("Category")
        private Long category;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("FileCategoryCode")
        private Long fileCategoryCode;

        @NameInMap("FileCategoryName")
        private String fileCategoryName;

        @NameInMap("FileId")
        private String fileId;

        @NameInMap("Id")
        private String id;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RiskLevelId")
        private Long riskLevelId;

        @NameInMap("RiskLevelName")
        private String riskLevelName;

        @NameInMap("RuleCount")
        private Integer ruleCount;

        @NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        @NameInMap("SensitiveCount")
        private Integer sensitiveCount;

        @NameInMap("Size")
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
        public java.util.List < RuleList> getRuleList() {
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
            private String name; 
            private String regionId; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private Integer ruleCount; 
            private java.util.List < RuleList> ruleList; 
            private Integer sensitiveCount; 
            private Long size; 

            /**
             * The name of the bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The type of the OSS object. Valid values include **900001**, **800015**, or **800005**, which indicates the MP4 file, PDF file, or OSS configuration file, respectively.
             */
            public Builder category(Long category) {
                this.category = category;
                return this;
            }

            /**
             * The name of the file type.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * The code of the file type.
             */
            public Builder fileCategoryCode(Long fileCategoryCode) {
                this.fileCategoryCode = fileCategoryCode;
                return this;
            }

            /**
             * The name of the file type.
             */
            public Builder fileCategoryName(String fileCategoryName) {
                this.fileCategoryName = fileCategoryName;
                return this;
            }

            /**
             * The file ID of the OSS object.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The ID of the OSS object.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the instance to which the OSS object belongs.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the OSS object.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The region ID of the OSS object.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the sensitivity level of the OSS object. Valid values:
             * <p>
             * 
             * *   **1**: N/A, which indicates that no sensitive data is detected.
             * *   **2**: S1, which indicates the low sensitivity level.
             * *   **3**: S2, which indicates the medium sensitivity level.
             * *   **4**: S3, which indicates the high sensitivity level.
             * *   **5**: S4, which indicates the highest sensitivity level.
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * The name of the sensitivity level for the OSS object.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * The number of rules that are hit.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * A list of rules.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * The number of fields that are hit.
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * The size of the file. Unit: bytes.
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
