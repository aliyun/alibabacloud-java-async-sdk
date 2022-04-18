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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskLevelList.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

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

            /**
             * ReferenceNum.
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
