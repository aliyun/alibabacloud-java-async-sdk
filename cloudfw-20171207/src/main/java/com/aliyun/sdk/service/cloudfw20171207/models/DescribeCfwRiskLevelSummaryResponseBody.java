// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCfwRiskLevelSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCfwRiskLevelSummaryResponseBody</p>
 */
public class DescribeCfwRiskLevelSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskList")
    private java.util.List < RiskList> riskList;

    private DescribeCfwRiskLevelSummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskList = builder.riskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCfwRiskLevelSummaryResponseBody create() {
        return builder().build();
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
    public java.util.List < RiskList> getRiskList() {
        return this.riskList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RiskList> riskList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskList.
         */
        public Builder riskList(java.util.List < RiskList> riskList) {
            this.riskList = riskList;
            return this;
        }

        public DescribeCfwRiskLevelSummaryResponseBody build() {
            return new DescribeCfwRiskLevelSummaryResponseBody(this);
        } 

    } 

    public static class RiskList extends TeaModel {
        @NameInMap("Level")
        private String level;

        @NameInMap("Num")
        private String num;

        @NameInMap("Type")
        private String type;

        private RiskList(Builder builder) {
            this.level = builder.level;
            this.num = builder.num;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskList create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return num
         */
        public String getNum() {
            return this.num;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level; 
            private String num; 
            private String type; 

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Num.
             */
            public Builder num(String num) {
                this.num = num;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RiskList build() {
                return new RiskList(this);
            } 

        } 

    }
}
