// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckSummaryResponseBody</p>
 */
public class GetCheckSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Summarys")
    private java.util.List < Summarys> summarys;

    private GetCheckSummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.summarys = builder.summarys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summarys
     */
    public java.util.List < Summarys> getSummarys() {
        return this.summarys;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Summarys> summarys; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Summarys.
         */
        public Builder summarys(java.util.List < Summarys> summarys) {
            this.summarys = summarys;
            return this;
        }

        public GetCheckSummaryResponseBody build() {
            return new GetCheckSummaryResponseBody(this);
        } 

    } 

    public static class Standards extends TeaModel {
        @NameInMap("FailCount")
        private Integer failCount;

        @NameInMap("Id")
        private Long id;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("RiskLevelHighCount")
        private Integer riskLevelHighCount;

        @NameInMap("RiskLevelLowCount")
        private Integer riskLevelLowCount;

        @NameInMap("RiskLevelMediumCount")
        private Integer riskLevelMediumCount;

        @NameInMap("ShowName")
        private String showName;

        private Standards(Builder builder) {
            this.failCount = builder.failCount;
            this.id = builder.id;
            this.passCount = builder.passCount;
            this.riskLevelHighCount = builder.riskLevelHighCount;
            this.riskLevelLowCount = builder.riskLevelLowCount;
            this.riskLevelMediumCount = builder.riskLevelMediumCount;
            this.showName = builder.showName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Standards create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return riskLevelHighCount
         */
        public Integer getRiskLevelHighCount() {
            return this.riskLevelHighCount;
        }

        /**
         * @return riskLevelLowCount
         */
        public Integer getRiskLevelLowCount() {
            return this.riskLevelLowCount;
        }

        /**
         * @return riskLevelMediumCount
         */
        public Integer getRiskLevelMediumCount() {
            return this.riskLevelMediumCount;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        public static final class Builder {
            private Integer failCount; 
            private Long id; 
            private Integer passCount; 
            private Integer riskLevelHighCount; 
            private Integer riskLevelLowCount; 
            private Integer riskLevelMediumCount; 
            private String showName; 

            /**
             * FailCount.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
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
             * PassCount.
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * RiskLevelHighCount.
             */
            public Builder riskLevelHighCount(Integer riskLevelHighCount) {
                this.riskLevelHighCount = riskLevelHighCount;
                return this;
            }

            /**
             * RiskLevelLowCount.
             */
            public Builder riskLevelLowCount(Integer riskLevelLowCount) {
                this.riskLevelLowCount = riskLevelLowCount;
                return this;
            }

            /**
             * RiskLevelMediumCount.
             */
            public Builder riskLevelMediumCount(Integer riskLevelMediumCount) {
                this.riskLevelMediumCount = riskLevelMediumCount;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            public Standards build() {
                return new Standards(this);
            } 

        } 

    }
    public static class Summarys extends TeaModel {
        @NameInMap("FailCount")
        private Integer failCount;

        @NameInMap("PassCount")
        private Long passCount;

        @NameInMap("Standards")
        private java.util.List < Standards> standards;

        @NameInMap("Type")
        private String type;

        private Summarys(Builder builder) {
            this.failCount = builder.failCount;
            this.passCount = builder.passCount;
            this.standards = builder.standards;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summarys create() {
            return builder().build();
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return passCount
         */
        public Long getPassCount() {
            return this.passCount;
        }

        /**
         * @return standards
         */
        public java.util.List < Standards> getStandards() {
            return this.standards;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer failCount; 
            private Long passCount; 
            private java.util.List < Standards> standards; 
            private String type; 

            /**
             * FailCount.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * PassCount.
             */
            public Builder passCount(Long passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * Standards.
             */
            public Builder standards(java.util.List < Standards> standards) {
                this.standards = standards;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Summarys build() {
                return new Summarys(this);
            } 

        } 

    }
}
