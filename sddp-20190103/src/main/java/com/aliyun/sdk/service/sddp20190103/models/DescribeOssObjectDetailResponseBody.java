// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssObjectDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssObjectDetailResponseBody</p>
 */
public class DescribeOssObjectDetailResponseBody extends TeaModel {
    @NameInMap("OssObjectDetail")
    private OssObjectDetail ossObjectDetail;

    @NameInMap("RequestId")
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

        public DescribeOssObjectDetailResponseBody build() {
            return new DescribeOssObjectDetailResponseBody(this);
        } 

    } 

    public static class RuleList extends TeaModel {
        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("Count")
        private Long count;

        @NameInMap("RiskLevelId")
        private Long riskLevelId;

        @NameInMap("RiskLevelName")
        private String riskLevelName;

        @NameInMap("RuleName")
        private String ruleName;

        private RuleList(Builder builder) {
            this.categoryName = builder.categoryName;
            this.count = builder.count;
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
    public static class OssObjectDetail extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RiskLevelName")
        private String riskLevelName;

        @NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

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
        public java.util.List < RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private String bucketName; 
            private String categoryName; 
            private String name; 
            private String regionId; 
            private String riskLevelName; 
            private java.util.List < RuleList> ruleList; 

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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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

            public OssObjectDetail build() {
                return new OssObjectDetail(this);
            } 

        } 

    }
}
