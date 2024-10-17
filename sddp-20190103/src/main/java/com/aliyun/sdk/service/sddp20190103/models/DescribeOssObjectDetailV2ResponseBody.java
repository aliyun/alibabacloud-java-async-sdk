// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOssObjectDetailV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssObjectDetailV2ResponseBody</p>
 */
public class DescribeOssObjectDetailV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OssObjectDetail")
    private OssObjectDetail ossObjectDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOssObjectDetailV2ResponseBody(Builder builder) {
        this.ossObjectDetail = builder.ossObjectDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssObjectDetailV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return ossObjectDetail
     */
    public OssObjectDetail getOssObjectDetail() {
        return this.ossObjectDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OssObjectDetail ossObjectDetail; 
        private String requestId; 

        /**
         * OssObjectDetail.
         */
        public Builder ossObjectDetail(OssObjectDetail ossObjectDetail) {
            this.ossObjectDetail = ossObjectDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOssObjectDetailV2ResponseBody build() {
            return new DescribeOssObjectDetailV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOssObjectDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssObjectDetailV2ResponseBody</p>
     */
    public static class ModelTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ModelTags(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelTags create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ModelTags build() {
                return new ModelTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOssObjectDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssObjectDetailV2ResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("ModelTags")
        private java.util.List < ModelTags> modelTags;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private RuleList(Builder builder) {
            this.categoryName = builder.categoryName;
            this.count = builder.count;
            this.modelTags = builder.modelTags;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return modelTags
         */
        public java.util.List < ModelTags> getModelTags() {
            return this.modelTags;
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
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String categoryName; 
            private Long count; 
            private java.util.List < ModelTags> modelTags; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private String ruleName; 

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * ModelTags.
             */
            public Builder modelTags(java.util.List < ModelTags> modelTags) {
                this.modelTags = modelTags;
                return this;
            }

            /**
             * RiskLevelId.
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * RiskLevelName.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOssObjectDetailV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssObjectDetailV2ResponseBody</p>
     */
    public static class OssObjectDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("FileCategoryName")
        private String fileCategoryName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModelTagIds")
        private String modelTagIds;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectAcl")
        private String objectAcl;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Integer riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private OssObjectDetail(Builder builder) {
            this.bucketName = builder.bucketName;
            this.categoryName = builder.categoryName;
            this.fileCategoryName = builder.fileCategoryName;
            this.id = builder.id;
            this.modelTagIds = builder.modelTagIds;
            this.name = builder.name;
            this.objectAcl = builder.objectAcl;
            this.regionId = builder.regionId;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleList = builder.ruleList;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssObjectDetail create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return fileCategoryName
         */
        public String getFileCategoryName() {
            return this.fileCategoryName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modelTagIds
         */
        public String getModelTagIds() {
            return this.modelTagIds;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectAcl
         */
        public String getObjectAcl() {
            return this.objectAcl;
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
        public Integer getRiskLevelId() {
            return this.riskLevelId;
        }

        /**
         * @return riskLevelName
         */
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        /**
         * @return ruleList
         */
        public java.util.List < RuleList> getRuleList() {
            return this.ruleList;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String bucketName; 
            private String categoryName; 
            private String fileCategoryName; 
            private String id; 
            private String modelTagIds; 
            private String name; 
            private String objectAcl; 
            private String regionId; 
            private Integer riskLevelId; 
            private String riskLevelName; 
            private java.util.List < RuleList> ruleList; 
            private Long size; 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * FileCategoryName.
             */
            public Builder fileCategoryName(String fileCategoryName) {
                this.fileCategoryName = fileCategoryName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ModelTagIds.
             */
            public Builder modelTagIds(String modelTagIds) {
                this.modelTagIds = modelTagIds;
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
             * ObjectAcl.
             */
            public Builder objectAcl(String objectAcl) {
                this.objectAcl = objectAcl;
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
             * RiskLevelId.
             */
            public Builder riskLevelId(Integer riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * RiskLevelName.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public OssObjectDetail build() {
                return new OssObjectDetail(this);
            } 

        } 

    }
}
