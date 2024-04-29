// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningSummaryResponseBody</p>
 */
public class DescribeCheckWarningSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WarningSummarys")
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
         * The number of check items returned on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The page number of the current page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of check items.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The statistics of check items.
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
        @com.aliyun.core.annotation.NameInMap("CheckCount")
        private Integer checkCount;

        @com.aliyun.core.annotation.NameInMap("CheckExploit")
        private Boolean checkExploit;

        @com.aliyun.core.annotation.NameInMap("ContainerRisk")
        private Boolean containerRisk;

        @com.aliyun.core.annotation.NameInMap("DatabaseRisk")
        private Boolean databaseRisk;

        @com.aliyun.core.annotation.NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @com.aliyun.core.annotation.NameInMap("LastFoundTime")
        private String lastFoundTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @com.aliyun.core.annotation.NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        @com.aliyun.core.annotation.NameInMap("RiskId")
        private Long riskId;

        @com.aliyun.core.annotation.NameInMap("RiskName")
        private String riskName;

        @com.aliyun.core.annotation.NameInMap("SubTypeAlias")
        private String subTypeAlias;

        @com.aliyun.core.annotation.NameInMap("TypeAlias")
        private String typeAlias;

        @com.aliyun.core.annotation.NameInMap("WarningMachineCount")
        private Integer warningMachineCount;

        private WarningSummarys(Builder builder) {
            this.checkCount = builder.checkCount;
            this.checkExploit = builder.checkExploit;
            this.containerRisk = builder.containerRisk;
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
         * @return containerRisk
         */
        public Boolean getContainerRisk() {
            return this.containerRisk;
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
            private Boolean containerRisk; 
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
             * The number of check items.
             */
            public Builder checkCount(Integer checkCount) {
                this.checkCount = checkCount;
                return this;
            }

            /**
             * Indicates whether the risk item can be exploited. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder checkExploit(Boolean checkExploit) {
                this.checkExploit = checkExploit;
                return this;
            }

            /**
             * Indicates  whether the risk item is a container runtime risk item. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder containerRisk(Boolean containerRisk) {
                this.containerRisk = containerRisk;
                return this;
            }

            /**
             * Indicates whether the risk item is a database risk item. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder databaseRisk(Boolean databaseRisk) {
                this.databaseRisk = databaseRisk;
                return this;
            }

            /**
             * The number of high-risk items.
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * The time when the last baseline check was performed.
             */
            public Builder lastFoundTime(String lastFoundTime) {
                this.lastFoundTime = lastFoundTime;
                return this;
            }

            /**
             * The risk level of the risk item. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The number of low-risk items.
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * The number of medium-risk items.
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * The ID of the risk item.
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * The name of the risk item.
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * The level-2 type of the risk item.
             */
            public Builder subTypeAlias(String subTypeAlias) {
                this.subTypeAlias = subTypeAlias;
                return this;
            }

            /**
             * The level-1 type of the check item. Examples: database, system, weak password, and middleware.
             */
            public Builder typeAlias(String typeAlias) {
                this.typeAlias = typeAlias;
                return this;
            }

            /**
             * The number of assets on which risk items are detected.
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
