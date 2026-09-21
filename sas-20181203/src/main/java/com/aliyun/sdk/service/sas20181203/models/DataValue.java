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
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RiskMachine")
    private Integer riskMachine;

    @com.aliyun.core.annotation.NameInMap("ScanMachine")
    private Integer scanMachine;

    @com.aliyun.core.annotation.NameInMap("MaliciousFile")
    private Integer maliciousFile;

    @com.aliyun.core.annotation.NameInMap("Vulnerability")
    private Integer vulnerability;

    @com.aliyun.core.annotation.NameInMap("LastTaskTime")
    private Long lastTaskTime;

    @com.aliyun.core.annotation.NameInMap("BaselineCheckCount")
    private Integer baselineCheckCount;

    @com.aliyun.core.annotation.NameInMap("ScaVulCount")
    private Integer scaVulCount;

    @com.aliyun.core.annotation.NameInMap("CveVulCount")
    private Integer cveVulCount;

    @com.aliyun.core.annotation.NameInMap("SysVulCount")
    private Integer sysVulCount;

    @com.aliyun.core.annotation.NameInMap("SensitiveFileCount")
    private Integer sensitiveFileCount;

    @com.aliyun.core.annotation.NameInMap("EstimateUsedSize")
    private Long estimateUsedSize;

    @com.aliyun.core.annotation.NameInMap("CveNum")
    private Integer cveNum;

    @com.aliyun.core.annotation.NameInMap("EmgNum")
    private Integer emgNum;

    @com.aliyun.core.annotation.NameInMap("SysNum")
    private Integer sysNum;

    @com.aliyun.core.annotation.NameInMap("CmsNum")
    private Integer cmsNum;

    @com.aliyun.core.annotation.NameInMap("AppNum")
    private Integer appNum;

    @com.aliyun.core.annotation.NameInMap("ScaNum")
    private Integer scaNum;

    @com.aliyun.core.annotation.NameInMap("VulAsapSum")
    private Integer vulAsapSum;

    @com.aliyun.core.annotation.NameInMap("VulLaterSum")
    private Integer vulLaterSum;

    @com.aliyun.core.annotation.NameInMap("VulNntfSum")
    private Integer vulNntfSum;

    @com.aliyun.core.annotation.NameInMap("SysAsapNum")
    private Integer sysAsapNum;

    private DataValue(Builder builder) {
        this.riskMachine = builder.riskMachine;
        this.scanMachine = builder.scanMachine;
        this.maliciousFile = builder.maliciousFile;
        this.vulnerability = builder.vulnerability;
        this.lastTaskTime = builder.lastTaskTime;
        this.baselineCheckCount = builder.baselineCheckCount;
        this.scaVulCount = builder.scaVulCount;
        this.cveVulCount = builder.cveVulCount;
        this.sysVulCount = builder.sysVulCount;
        this.sensitiveFileCount = builder.sensitiveFileCount;
        this.estimateUsedSize = builder.estimateUsedSize;
        this.cveNum = builder.cveNum;
        this.emgNum = builder.emgNum;
        this.sysNum = builder.sysNum;
        this.cmsNum = builder.cmsNum;
        this.appNum = builder.appNum;
        this.scaNum = builder.scaNum;
        this.vulAsapSum = builder.vulAsapSum;
        this.vulLaterSum = builder.vulLaterSum;
        this.vulNntfSum = builder.vulNntfSum;
        this.sysAsapNum = builder.sysAsapNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return riskMachine
     */
    public Integer getRiskMachine() {
        return this.riskMachine;
    }

    /**
     * @return scanMachine
     */
    public Integer getScanMachine() {
        return this.scanMachine;
    }

    /**
     * @return maliciousFile
     */
    public Integer getMaliciousFile() {
        return this.maliciousFile;
    }

    /**
     * @return vulnerability
     */
    public Integer getVulnerability() {
        return this.vulnerability;
    }

    /**
     * @return lastTaskTime
     */
    public Long getLastTaskTime() {
        return this.lastTaskTime;
    }

    /**
     * @return baselineCheckCount
     */
    public Integer getBaselineCheckCount() {
        return this.baselineCheckCount;
    }

    /**
     * @return scaVulCount
     */
    public Integer getScaVulCount() {
        return this.scaVulCount;
    }

    /**
     * @return cveVulCount
     */
    public Integer getCveVulCount() {
        return this.cveVulCount;
    }

    /**
     * @return sysVulCount
     */
    public Integer getSysVulCount() {
        return this.sysVulCount;
    }

    /**
     * @return sensitiveFileCount
     */
    public Integer getSensitiveFileCount() {
        return this.sensitiveFileCount;
    }

    /**
     * @return estimateUsedSize
     */
    public Long getEstimateUsedSize() {
        return this.estimateUsedSize;
    }

    /**
     * @return cveNum
     */
    public Integer getCveNum() {
        return this.cveNum;
    }

    /**
     * @return emgNum
     */
    public Integer getEmgNum() {
        return this.emgNum;
    }

    /**
     * @return sysNum
     */
    public Integer getSysNum() {
        return this.sysNum;
    }

    /**
     * @return cmsNum
     */
    public Integer getCmsNum() {
        return this.cmsNum;
    }

    /**
     * @return appNum
     */
    public Integer getAppNum() {
        return this.appNum;
    }

    /**
     * @return scaNum
     */
    public Integer getScaNum() {
        return this.scaNum;
    }

    /**
     * @return vulAsapSum
     */
    public Integer getVulAsapSum() {
        return this.vulAsapSum;
    }

    /**
     * @return vulLaterSum
     */
    public Integer getVulLaterSum() {
        return this.vulLaterSum;
    }

    /**
     * @return vulNntfSum
     */
    public Integer getVulNntfSum() {
        return this.vulNntfSum;
    }

    /**
     * @return sysAsapNum
     */
    public Integer getSysAsapNum() {
        return this.sysAsapNum;
    }

    public static final class Builder {
        private Integer riskMachine; 
        private Integer scanMachine; 
        private Integer maliciousFile; 
        private Integer vulnerability; 
        private Long lastTaskTime; 
        private Integer baselineCheckCount; 
        private Integer scaVulCount; 
        private Integer cveVulCount; 
        private Integer sysVulCount; 
        private Integer sensitiveFileCount; 
        private Long estimateUsedSize; 
        private Integer cveNum; 
        private Integer emgNum; 
        private Integer sysNum; 
        private Integer cmsNum; 
        private Integer appNum; 
        private Integer scaNum; 
        private Integer vulAsapSum; 
        private Integer vulLaterSum; 
        private Integer vulNntfSum; 
        private Integer sysAsapNum; 

        private Builder() {
        } 

        private Builder(DataValue model) {
            this.riskMachine = model.riskMachine;
            this.scanMachine = model.scanMachine;
            this.maliciousFile = model.maliciousFile;
            this.vulnerability = model.vulnerability;
            this.lastTaskTime = model.lastTaskTime;
            this.baselineCheckCount = model.baselineCheckCount;
            this.scaVulCount = model.scaVulCount;
            this.cveVulCount = model.cveVulCount;
            this.sysVulCount = model.sysVulCount;
            this.sensitiveFileCount = model.sensitiveFileCount;
            this.estimateUsedSize = model.estimateUsedSize;
            this.cveNum = model.cveNum;
            this.emgNum = model.emgNum;
            this.sysNum = model.sysNum;
            this.cmsNum = model.cmsNum;
            this.appNum = model.appNum;
            this.scaNum = model.scaNum;
            this.vulAsapSum = model.vulAsapSum;
            this.vulLaterSum = model.vulLaterSum;
            this.vulNntfSum = model.vulNntfSum;
            this.sysAsapNum = model.sysAsapNum;
        } 

        /**
         * <p>The number of risky hosts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskMachine(Integer riskMachine) {
            this.riskMachine = riskMachine;
            return this;
        }

        /**
         * <p>The number of scanned hosts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanMachine(Integer scanMachine) {
            this.scanMachine = scanMachine;
            return this;
        }

        /**
         * <p>The total number of malicious sample files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maliciousFile(Integer maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }

        /**
         * <p>The number of vulnerability risks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vulnerability(Integer vulnerability) {
            this.vulnerability = vulnerability;
            return this;
        }

        /**
         * <p>The timestamp of the last scan time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1682577532318</p>
         */
        public Builder lastTaskTime(Long lastTaskTime) {
            this.lastTaskTime = lastTaskTime;
            return this;
        }

        /**
         * <p>The total number of baseline check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder baselineCheckCount(Integer baselineCheckCount) {
            this.baselineCheckCount = baselineCheckCount;
            return this;
        }

        /**
         * <p>The total number of application vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaVulCount(Integer scaVulCount) {
            this.scaVulCount = scaVulCount;
            return this;
        }

        /**
         * <p>The total number of system vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cveVulCount(Integer cveVulCount) {
            this.cveVulCount = cveVulCount;
            return this;
        }

        /**
         * <p>The total number of Windows system vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sysVulCount(Integer sysVulCount) {
            this.sysVulCount = sysVulCount;
            return this;
        }

        /**
         * <p>The total number of sensitive files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sensitiveFileCount(Integer sensitiveFileCount) {
            this.sensitiveFileCount = sensitiveFileCount;
            return this;
        }

        /**
         * <p>The estimated detection volume. Unit: GB. This field is not returned by the batch statistics operation.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder estimateUsedSize(Long estimateUsedSize) {
            this.estimateUsedSize = estimateUsedSize;
            return this;
        }

        /**
         * <p>The number of Linux software vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cveNum(Integer cveNum) {
            this.cveNum = cveNum;
            return this;
        }

        /**
         * <p>The number of emergency vulnerabilities. This field is 0 when ImageVul is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder emgNum(Integer emgNum) {
            this.emgNum = emgNum;
            return this;
        }

        /**
         * <p>The number of Windows system vulnerabilities. This field is 0 when ImageVul is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sysNum(Integer sysNum) {
            this.sysNum = sysNum;
            return this;
        }

        /**
         * <p>The number of Web-CMS vulnerabilities. This field is 0 when ImageVul is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cmsNum(Integer cmsNum) {
            this.cmsNum = cmsNum;
            return this;
        }

        /**
         * <p>The number of application vulnerabilities. This field is 0 when ImageVul is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder appNum(Integer appNum) {
            this.appNum = appNum;
            return this;
        }

        /**
         * <p>The number of software composition analysis (SCA) vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scaNum(Integer scaNum) {
            this.scaNum = scaNum;
            return this;
        }

        /**
         * <p>The number of high-priority vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vulAsapSum(Integer vulAsapSum) {
            this.vulAsapSum = vulAsapSum;
            return this;
        }

        /**
         * <p>The number of medium-priority vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vulLaterSum(Integer vulLaterSum) {
            this.vulLaterSum = vulLaterSum;
            return this;
        }

        /**
         * <p>The number of low-priority vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vulNntfSum(Integer vulNntfSum) {
            this.vulNntfSum = vulNntfSum;
            return this;
        }

        /**
         * <p>The number of high-priority system vulnerabilities among Linux software vulnerabilities and Windows system vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sysAsapNum(Integer sysAsapNum) {
            this.sysAsapNum = sysAsapNum;
            return this;
        }

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}
