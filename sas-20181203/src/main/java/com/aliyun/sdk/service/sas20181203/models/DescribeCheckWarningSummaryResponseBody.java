// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningSummaryResponseBody</p>
 */
public class DescribeCheckWarningSummaryResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("WarningSummarys")
    private java.util.List < WarningSummarys> warningSummarys;

    private DescribeCheckWarningSummaryResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.warningSummarys = builder.warningSummarys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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

    /**
     * @return warningSummarys
     */
    public java.util.List < WarningSummarys> getWarningSummarys() {
        return this.warningSummarys;
    }

    public static final class Builder {
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < WarningSummarys> warningSummarys; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WarningSummarys.
         */
        public Builder warningSummarys(java.util.List < WarningSummarys> warningSummarys) {
            this.warningSummarys = warningSummarys;
            return this;
        }

        public DescribeCheckWarningSummaryResponseBody build() {
            return new DescribeCheckWarningSummaryResponseBody(this);
        } 

    } 

    public static class WarningSummarys extends TeaModel {
        @NameInMap("CheckCount")
        private Integer checkCount;

        @NameInMap("CheckExploit")
        private Boolean checkExploit;

        @NameInMap("DatabaseRisk")
        private Boolean databaseRisk;

        @NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @NameInMap("LastFoundTime")
        private String lastFoundTime;

        @NameInMap("Level")
        private String level;

        @NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        @NameInMap("RiskId")
        private Long riskId;

        @NameInMap("RiskName")
        private String riskName;

        @NameInMap("SubTypeAlias")
        private String subTypeAlias;

        @NameInMap("TypeAlias")
        private String typeAlias;

        @NameInMap("WarningMachineCount")
        private Integer warningMachineCount;

        private WarningSummarys(Builder builder) {
            this.checkCount = builder.checkCount;
            this.checkExploit = builder.checkExploit;
            this.databaseRisk = builder.databaseRisk;
            this.highWarningCount = builder.highWarningCount;
            this.lastFoundTime = builder.lastFoundTime;
            this.level = builder.level;
            this.lowWarningCount = builder.lowWarningCount;
            this.mediumWarningCount = builder.mediumWarningCount;
            this.riskId = builder.riskId;
            this.riskName = builder.riskName;
            this.subTypeAlias = builder.subTypeAlias;
            this.typeAlias = builder.typeAlias;
            this.warningMachineCount = builder.warningMachineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningSummarys create() {
            return builder().build();
        }

        /**
         * @return checkCount
         */
        public Integer getCheckCount() {
            return this.checkCount;
        }

        /**
         * @return checkExploit
         */
        public Boolean getCheckExploit() {
            return this.checkExploit;
        }

        /**
         * @return databaseRisk
         */
        public Boolean getDatabaseRisk() {
            return this.databaseRisk;
        }

        /**
         * @return highWarningCount
         */
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        /**
         * @return lastFoundTime
         */
        public String getLastFoundTime() {
            return this.lastFoundTime;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return lowWarningCount
         */
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        /**
         * @return mediumWarningCount
         */
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        /**
         * @return riskId
         */
        public Long getRiskId() {
            return this.riskId;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        /**
         * @return subTypeAlias
         */
        public String getSubTypeAlias() {
            return this.subTypeAlias;
        }

        /**
         * @return typeAlias
         */
        public String getTypeAlias() {
            return this.typeAlias;
        }

        /**
         * @return warningMachineCount
         */
        public Integer getWarningMachineCount() {
            return this.warningMachineCount;
        }

        public static final class Builder {
            private Integer checkCount; 
            private Boolean checkExploit; 
            private Boolean databaseRisk; 
            private Integer highWarningCount; 
            private String lastFoundTime; 
            private String level; 
            private Integer lowWarningCount; 
            private Integer mediumWarningCount; 
            private Long riskId; 
            private String riskName; 
            private String subTypeAlias; 
            private String typeAlias; 
            private Integer warningMachineCount; 

            /**
             * CheckCount.
             */
            public Builder checkCount(Integer checkCount) {
                this.checkCount = checkCount;
                return this;
            }

            /**
             * CheckExploit.
             */
            public Builder checkExploit(Boolean checkExploit) {
                this.checkExploit = checkExploit;
                return this;
            }

            /**
             * DatabaseRisk.
             */
            public Builder databaseRisk(Boolean databaseRisk) {
                this.databaseRisk = databaseRisk;
                return this;
            }

            /**
             * HighWarningCount.
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * LastFoundTime.
             */
            public Builder lastFoundTime(String lastFoundTime) {
                this.lastFoundTime = lastFoundTime;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * LowWarningCount.
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * MediumWarningCount.
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * RiskId.
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * RiskName.
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * SubTypeAlias.
             */
            public Builder subTypeAlias(String subTypeAlias) {
                this.subTypeAlias = subTypeAlias;
                return this;
            }

            /**
             * TypeAlias.
             */
            public Builder typeAlias(String typeAlias) {
                this.typeAlias = typeAlias;
                return this;
            }

            /**
             * WarningMachineCount.
             */
            public Builder warningMachineCount(Integer warningMachineCount) {
                this.warningMachineCount = warningMachineCount;
                return this;
            }

            public WarningSummarys build() {
                return new WarningSummarys(this);
            } 

        } 

    }
}
