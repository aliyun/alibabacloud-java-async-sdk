// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskLevelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskLevelsResponseBody</p>
 */
public class DescribeRiskLevelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskLevelList")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of sensitivity levels.
         */
        public Builder riskLevelList(java.util.List < RiskLevelList> riskLevelList) {
            this.riskLevelList = riskLevelList;
            return this;
        }

        public DescribeRiskLevelsResponseBody build() {
            return new DescribeRiskLevelsResponseBody(this);
        } 

    } 

    public static class RiskLevelList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReferenceNum")
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
             * The description of the sensitivity level. You can enter a custom description.
             * <p>
             * 
             * The following list describes the sensitivity level names and the corresponding default description:
             * 
             * *   **NA**: which indicates that no sensitive data is detected.
             * *   **S1**: which indicates the sensitive data at sensitivity level 1.
             * *   **S2**: which indicates the sensitive data at sensitivity level 2.
             * *   **S3**: which indicates the sensitive data at sensitivity level 3.
             * *   **S4**: which indicates the sensitive data at sensitivity level 4.
             * *   **S5**: which indicates the sensitive data at sensitivity level 5.
             * *   **S6**: which indicates the sensitive data at sensitivity level 6.
             * *   **S7**: which indicates the sensitive data at sensitivity level 7.
             * *   **S8**: which indicates the sensitive data at sensitivity level 8.
             * *   **S9**: which indicates the sensitive data at sensitivity level 9.
             * *   **S10**: which indicates the sensitive data at sensitivity level 10.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The unique ID of the sensitivity level. Valid values: 1 to 11. Each sensitivity level ID maps a sensitivity level. For example, the sensitivity level ID of 2 corresponds to the sensitivity level S1.
             * <p>
             * 
             * For more information, see the description of the Name parameter.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the sensitivity level. The highest sensitivity level varies based on rule templates. The highest sensitivity level is S10. The highest sensitivity level of the **Built-in data security classification templates for Alibaba and Ant Group** is S4, and that of the **built-in classification templates for financial data** and **built-in classification templates for assets** is S5. For more information about the built-in classification templates for financial data, see Guidelines for Security Classification of Financial Data and Security Data - JRT 0197-2020. For a copied rule template, the highest sensitivity level is S10. The following list describes the sensitivity level names and the corresponding IDs:
             * <p>
             * 
             * *   **NA**: 1
             * *   **S1**: 2
             * *   **S2**: 3
             * *   **S3**: 4
             * *   **S4**: 5
             * *   **S5**: 6
             * *   **S6**: 7
             * *   **S7**: 8
             * *   **S8**: 9
             * *   **S9**: 10
             * *   **S10**: 11
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of times that each sensitivity level is referenced in the rule template. Default value: 0.
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
