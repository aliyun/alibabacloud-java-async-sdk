// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List<WarningSummarys> warningSummarys;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<WarningSummarys> getWarningSummarys() {
        return this.warningSummarys;
    }

    public static final class Builder {
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<WarningSummarys> warningSummarys; 

        private Builder() {
        } 

        private Builder(DescribeCheckWarningSummaryResponseBody model) {
            this.count = model.count;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.warningSummarys = model.warningSummarys;
        } 

        /**
         * <p>The number of check items returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number of the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00BD7CE2-284A-4534-BD09-FB69836DD750</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of check items.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The statistics of check items.</p>
         */
        public Builder warningSummarys(java.util.List<WarningSummarys> warningSummarys) {
            this.warningSummarys = warningSummarys;
            return this;
        }

        public DescribeCheckWarningSummaryResponseBody build() {
            return new DescribeCheckWarningSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCheckWarningSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCheckWarningSummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(WarningSummarys model) {
                this.checkCount = model.checkCount;
                this.checkExploit = model.checkExploit;
                this.containerRisk = model.containerRisk;
                this.databaseRisk = model.databaseRisk;
                this.highWarningCount = model.highWarningCount;
                this.lastFoundTime = model.lastFoundTime;
                this.level = model.level;
                this.lowWarningCount = model.lowWarningCount;
                this.mediumWarningCount = model.mediumWarningCount;
                this.riskId = model.riskId;
                this.riskName = model.riskName;
                this.subTypeAlias = model.subTypeAlias;
                this.typeAlias = model.typeAlias;
                this.warningMachineCount = model.warningMachineCount;
            } 

            /**
             * <p>The number of check items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder checkCount(Integer checkCount) {
                this.checkCount = checkCount;
                return this;
            }

            /**
             * <p>Indicates whether the risk item can be exploited. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder checkExploit(Boolean checkExploit) {
                this.checkExploit = checkExploit;
                return this;
            }

            /**
             * <p>Indicates  whether the risk item is a container runtime risk item. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder containerRisk(Boolean containerRisk) {
                this.containerRisk = containerRisk;
                return this;
            }

            /**
             * <p>Indicates whether the risk item is a database risk item. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder databaseRisk(Boolean databaseRisk) {
                this.databaseRisk = databaseRisk;
                return this;
            }

            /**
             * <p>The number of high-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * <p>The time when the last baseline check was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01 12:23:00</p>
             */
            public Builder lastFoundTime(String lastFoundTime) {
                this.lastFoundTime = lastFoundTime;
                return this;
            }

            /**
             * <p>The risk level of the risk item. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The number of low-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * <p>The number of medium-risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * <p>The ID of the risk item.</p>
             * 
             * <strong>example:</strong>
             * <p>118</p>
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * <p>The name of the risk item.</p>
             * 
             * <strong>example:</strong>
             * <p>Redis</p>
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * <p>The level-2 type of the risk item.</p>
             * 
             * <strong>example:</strong>
             * <p>Redis</p>
             */
            public Builder subTypeAlias(String subTypeAlias) {
                this.subTypeAlias = subTypeAlias;
                return this;
            }

            /**
             * <p>The level-1 type of the check item. Examples: database, system, weak password, and middleware.</p>
             * 
             * <strong>example:</strong>
             * <p>databases</p>
             */
            public Builder typeAlias(String typeAlias) {
                this.typeAlias = typeAlias;
                return this;
            }

            /**
             * <p>The number of assets on which risk items are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
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
