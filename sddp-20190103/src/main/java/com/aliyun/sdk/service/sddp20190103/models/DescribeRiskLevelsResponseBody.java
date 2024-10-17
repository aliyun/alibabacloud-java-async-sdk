// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRiskLevelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskLevelsResponseBody</p>
 */
public class DescribeRiskLevelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List < RiskLevelList> riskLevelList;

    private DescribeRiskLevelsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskLevelList = builder.riskLevelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskLevelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskLevelList
     */
    public java.util.List < RiskLevelList> getRiskLevelList() {
        return this.riskLevelList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RiskLevelList> riskLevelList; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>136082B3-B21F-5E9D-B68E-991FFD205D24</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of sensitivity levels.</p>
         */
        public Builder riskLevelList(java.util.List < RiskLevelList> riskLevelList) {
            this.riskLevelList = riskLevelList;
            return this;
        }

        public DescribeRiskLevelsResponseBody build() {
            return new DescribeRiskLevelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskLevelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskLevelsResponseBody</p>
     */
    public static class RiskLevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReferenceNum")
        private Integer referenceNum;

        private RiskLevelList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.referenceNum = builder.referenceNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskLevelList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        /**
         * @return referenceNum
         */
        public Integer getReferenceNum() {
            return this.referenceNum;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private Integer referenceNum; 

            /**
             * <p>The description of the sensitivity level. You can enter a custom description.</p>
             * <p>The following list describes the sensitivity level names and the corresponding default description:</p>
             * <ul>
             * <li><strong>NA</strong>: which indicates that no sensitive data is detected.</li>
             * <li><strong>S1</strong>: which indicates the sensitive data at sensitivity level 1.</li>
             * <li><strong>S2</strong>: which indicates the sensitive data at sensitivity level 2.</li>
             * <li><strong>S3</strong>: which indicates the sensitive data at sensitivity level 3.</li>
             * <li><strong>S4</strong>: which indicates the sensitive data at sensitivity level 4.</li>
             * <li><strong>S5</strong>: which indicates the sensitive data at sensitivity level 5.</li>
             * <li><strong>S6</strong>: which indicates the sensitive data at sensitivity level 6.</li>
             * <li><strong>S7</strong>: which indicates the sensitive data at sensitivity level 7.</li>
             * <li><strong>S8</strong>: which indicates the sensitive data at sensitivity level 8.</li>
             * <li><strong>S9</strong>: which indicates the sensitive data at sensitivity level 9.</li>
             * <li><strong>S10</strong>: which indicates the sensitive data at sensitivity level 10.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Sensitive data at sensitivity level 1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique ID of the sensitivity level. Valid values: 1 to 11. Each sensitivity level ID maps a sensitivity level. For example, the sensitivity level ID of 2 corresponds to the sensitivity level S1.</p>
             * <p>For more information, see the description of the Name parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the sensitivity level. The highest sensitivity level varies based on rule templates. The highest sensitivity level is S10. The highest sensitivity level of the <strong>Built-in data security classification templates for Alibaba and Ant Group</strong> is S4, and that of the <strong>built-in classification templates for financial data</strong> and <strong>built-in classification templates for assets</strong> is S5. For more information about the built-in classification templates for financial data, see Guidelines for Security Classification of Financial Data and Security Data - JRT 0197-2020. For a copied rule template, the highest sensitivity level is S10. The following list describes the sensitivity level names and the corresponding IDs:</p>
             * <ul>
             * <li><strong>NA</strong>: 1</li>
             * <li><strong>S1</strong>: 2</li>
             * <li><strong>S2</strong>: 3</li>
             * <li><strong>S3</strong>: 4</li>
             * <li><strong>S4</strong>: 5</li>
             * <li><strong>S5</strong>: 6</li>
             * <li><strong>S6</strong>: 7</li>
             * <li><strong>S7</strong>: 8</li>
             * <li><strong>S8</strong>: 9</li>
             * <li><strong>S9</strong>: 10</li>
             * <li><strong>S10</strong>: 11</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of times that each sensitivity level is referenced in the rule template. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder referenceNum(Integer referenceNum) {
                this.referenceNum = referenceNum;
                return this;
            }

            public RiskLevelList build() {
                return new RiskLevelList(this);
            } 

        } 

    }
}
