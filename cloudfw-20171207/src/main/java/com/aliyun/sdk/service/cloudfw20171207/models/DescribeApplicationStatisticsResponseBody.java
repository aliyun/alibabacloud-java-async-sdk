// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeApplicationStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationStatisticsResponseBody</p>
 */
public class DescribeApplicationStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryList")
    private java.util.List<CategoryList> categoryList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskList")
    private java.util.List<RiskList> riskList;

    @com.aliyun.core.annotation.NameInMap("TechnologyList")
    private java.util.List<TechnologyList> technologyList;

    private DescribeApplicationStatisticsResponseBody(Builder builder) {
        this.categoryList = builder.categoryList;
        this.requestId = builder.requestId;
        this.riskList = builder.riskList;
        this.technologyList = builder.technologyList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryList
     */
    public java.util.List<CategoryList> getCategoryList() {
        return this.categoryList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskList
     */
    public java.util.List<RiskList> getRiskList() {
        return this.riskList;
    }

    /**
     * @return technologyList
     */
    public java.util.List<TechnologyList> getTechnologyList() {
        return this.technologyList;
    }

    public static final class Builder {
        private java.util.List<CategoryList> categoryList; 
        private String requestId; 
        private java.util.List<RiskList> riskList; 
        private java.util.List<TechnologyList> technologyList; 

        private Builder() {
        } 

        private Builder(DescribeApplicationStatisticsResponseBody model) {
            this.categoryList = model.categoryList;
            this.requestId = model.requestId;
            this.riskList = model.riskList;
            this.technologyList = model.technologyList;
        } 

        /**
         * <p>The list of application counts grouped by application category.</p>
         */
        public Builder categoryList(java.util.List<CategoryList> categoryList) {
            this.categoryList = categoryList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of application counts grouped by risk level.</p>
         */
        public Builder riskList(java.util.List<RiskList> riskList) {
            this.riskList = riskList;
            return this;
        }

        /**
         * <p>The list of application counts grouped by technology type.</p>
         */
        public Builder technologyList(java.util.List<TechnologyList> technologyList) {
            this.technologyList = technologyList;
            return this;
        }

        public DescribeApplicationStatisticsResponseBody build() {
            return new DescribeApplicationStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationStatisticsResponseBody</p>
     */
    public static class CategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationCount")
        private Long applicationCount;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        private CategoryList(Builder builder) {
            this.applicationCount = builder.applicationCount;
            this.categoryName = builder.categoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryList create() {
            return builder().build();
        }

        /**
         * @return applicationCount
         */
        public Long getApplicationCount() {
            return this.applicationCount;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        public static final class Builder {
            private Long applicationCount; 
            private String categoryName; 

            private Builder() {
            } 

            private Builder(CategoryList model) {
                this.applicationCount = model.applicationCount;
                this.categoryName = model.categoryName;
            } 

            /**
             * <p>The number of applications in the application category.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder applicationCount(Long applicationCount) {
                this.applicationCount = applicationCount;
                return this;
            }

            /**
             * <p>The name of the application category. The name is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Office collaboration</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationStatisticsResponseBody</p>
     */
    public static class RiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationCount")
        private Long applicationCount;

        @com.aliyun.core.annotation.NameInMap("Risk")
        private String risk;

        private RiskList(Builder builder) {
            this.applicationCount = builder.applicationCount;
            this.risk = builder.risk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskList create() {
            return builder().build();
        }

        /**
         * @return applicationCount
         */
        public Long getApplicationCount() {
            return this.applicationCount;
        }

        /**
         * @return risk
         */
        public String getRisk() {
            return this.risk;
        }

        public static final class Builder {
            private Long applicationCount; 
            private String risk; 

            private Builder() {
            } 

            private Builder(RiskList model) {
                this.applicationCount = model.applicationCount;
                this.risk = model.risk;
            } 

            /**
             * <p>The number of applications at the risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder applicationCount(Long applicationCount) {
                this.applicationCount = applicationCount;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>Information</strong>: Informational.</li>
             * <li><strong>Low</strong>: Low.</li>
             * <li><strong>Medium</strong>: Medium.</li>
             * <li><strong>High</strong>: High.</li>
             * <li><strong>Critical</strong>: Critical.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Low</p>
             */
            public Builder risk(String risk) {
                this.risk = risk;
                return this;
            }

            public RiskList build() {
                return new RiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationStatisticsResponseBody</p>
     */
    public static class TechnologyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationCount")
        private Long applicationCount;

        @com.aliyun.core.annotation.NameInMap("Technology")
        private String technology;

        private TechnologyList(Builder builder) {
            this.applicationCount = builder.applicationCount;
            this.technology = builder.technology;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TechnologyList create() {
            return builder().build();
        }

        /**
         * @return applicationCount
         */
        public Long getApplicationCount() {
            return this.applicationCount;
        }

        /**
         * @return technology
         */
        public String getTechnology() {
            return this.technology;
        }

        public static final class Builder {
            private Long applicationCount; 
            private String technology; 

            private Builder() {
            } 

            private Builder(TechnologyList model) {
                this.applicationCount = model.applicationCount;
                this.technology = model.technology;
            } 

            /**
             * <p>The number of applications of the technology type.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder applicationCount(Long applicationCount) {
                this.applicationCount = applicationCount;
                return this;
            }

            /**
             * <p>The name of the technology type. The name is returned in Chinese or English based on the Lang parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Browser-based</p>
             */
            public Builder technology(String technology) {
                this.technology = technology;
                return this;
            }

            public TechnologyList build() {
                return new TechnologyList(this);
            } 

        } 

    }
}
