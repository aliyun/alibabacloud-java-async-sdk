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
 * {@link DescribeOssObjectDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssObjectDetailResponseBody</p>
 */
public class DescribeOssObjectDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OssObjectDetail")
    private OssObjectDetail ossObjectDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOssObjectDetailResponseBody(Builder builder) {
        this.ossObjectDetail = builder.ossObjectDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssObjectDetailResponseBody create() {
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
         * <p>The details of the OSS object.</p>
         */
        public Builder ossObjectDetail(OssObjectDetail ossObjectDetail) {
            this.ossObjectDetail = ossObjectDetail;
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

        public DescribeOssObjectDetailResponseBody build() {
            return new DescribeOssObjectDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOssObjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssObjectDetailResponseBody</p>
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
             * <p>The tag ID.</p>
             * <ul>
             * <li><strong>101</strong>: sensitive personal information</li>
             * <li><strong>102</strong>: personal information</li>
             * <li><strong>103</strong>: important information</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * <ul>
             * <li>Sensitive personal information</li>
             * <li>Personal information</li>
             * <li>Important information</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>personal sensitive data</p>
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
     * {@link DescribeOssObjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssObjectDetailResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("ModelTags")
        private java.util.List<ModelTags> modelTags;

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
        public java.util.List<ModelTags> getModelTags() {
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
            private java.util.List<ModelTags> modelTags; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private String ruleName; 

            /**
             * <p>The type of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>Excel file</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The number of times that the OSS object hits the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>A list of tags for data that hits the recognition model.</p>
             */
            public Builder modelTags(java.util.List<ModelTags> modelTags) {
                this.modelTags = modelTags;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level of the OSS object.</p>
             * <ul>
             * <li><strong>1</strong>: No sensitive data is detected.</li>
             * <li><strong>2</strong>: indicates the low sensitivity level.</li>
             * <li><strong>3</strong>: indicates the medium sensitivity level.</li>
             * <li><strong>4</strong>: indicates the high sensitivity level.</li>
             * <li><strong>5</strong>: indicates the highest sensitivity level.</li>
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
             * <p>The name of the sensitive data detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>*** rule</p>
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
     * {@link DescribeOssObjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssObjectDetailResponseBody</p>
     */
    public static class OssObjectDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

        private OssObjectDetail(Builder builder) {
            this.bucketName = builder.bucketName;
            this.categoryName = builder.categoryName;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleList = builder.ruleList;
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
         * @return riskLevelName
         */
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        /**
         * @return ruleList
         */
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private String bucketName; 
            private String categoryName; 
            private String name; 
            private String regionId; 
            private String riskLevelName; 
            private java.util.List<RuleList> ruleList; 

            /**
             * <p>The name of the OSS bucket to which the OSS object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>bucke***</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The type of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p>Excel file</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
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
             * <p>A list of the sensitive data detection rules that the OSS object hits.</p>
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public OssObjectDetail build() {
                return new OssObjectDetail(this);
            } 

        } 

    }
}
