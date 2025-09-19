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
 * {@link GetAgentlessTaskCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentlessTaskCountResponseBody</p>
 */
public class GetAgentlessTaskCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineCheckCount")
    private Integer baselineCheckCount;

    @com.aliyun.core.annotation.NameInMap("CveVulCount")
    private Integer cveVulCount;

    @com.aliyun.core.annotation.NameInMap("LastTaskTime")
    private Long lastTaskTime;

    @com.aliyun.core.annotation.NameInMap("MaliciousFile")
    private Integer maliciousFile;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskMachine")
    private Integer riskMachine;

    @com.aliyun.core.annotation.NameInMap("ScaVulCount")
    private Integer scaVulCount;

    @com.aliyun.core.annotation.NameInMap("ScanMachine")
    private Integer scanMachine;

    @com.aliyun.core.annotation.NameInMap("SensitiveFileCount")
    private Integer sensitiveFileCount;

    @com.aliyun.core.annotation.NameInMap("SysVulCount")
    private String sysVulCount;

    @com.aliyun.core.annotation.NameInMap("Vulnerability")
    private Integer vulnerability;

    private GetAgentlessTaskCountResponseBody(Builder builder) {
        this.baselineCheckCount = builder.baselineCheckCount;
        this.cveVulCount = builder.cveVulCount;
        this.lastTaskTime = builder.lastTaskTime;
        this.maliciousFile = builder.maliciousFile;
        this.requestId = builder.requestId;
        this.riskMachine = builder.riskMachine;
        this.scaVulCount = builder.scaVulCount;
        this.scanMachine = builder.scanMachine;
        this.sensitiveFileCount = builder.sensitiveFileCount;
        this.sysVulCount = builder.sysVulCount;
        this.vulnerability = builder.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentlessTaskCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineCheckCount
     */
    public Integer getBaselineCheckCount() {
        return this.baselineCheckCount;
    }

    /**
     * @return cveVulCount
     */
    public Integer getCveVulCount() {
        return this.cveVulCount;
    }

    /**
     * @return lastTaskTime
     */
    public Long getLastTaskTime() {
        return this.lastTaskTime;
    }

    /**
     * @return maliciousFile
     */
    public Integer getMaliciousFile() {
        return this.maliciousFile;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskMachine
     */
    public Integer getRiskMachine() {
        return this.riskMachine;
    }

    /**
     * @return scaVulCount
     */
    public Integer getScaVulCount() {
        return this.scaVulCount;
    }

    /**
     * @return scanMachine
     */
    public Integer getScanMachine() {
        return this.scanMachine;
    }

    /**
     * @return sensitiveFileCount
     */
    public Integer getSensitiveFileCount() {
        return this.sensitiveFileCount;
    }

    /**
     * @return sysVulCount
     */
    public String getSysVulCount() {
        return this.sysVulCount;
    }

    /**
     * @return vulnerability
     */
    public Integer getVulnerability() {
        return this.vulnerability;
    }

    public static final class Builder {
        private Integer baselineCheckCount; 
        private Integer cveVulCount; 
        private Long lastTaskTime; 
        private Integer maliciousFile; 
        private String requestId; 
        private Integer riskMachine; 
        private Integer scaVulCount; 
        private Integer scanMachine; 
        private Integer sensitiveFileCount; 
        private String sysVulCount; 
        private Integer vulnerability; 

        private Builder() {
        } 

        private Builder(GetAgentlessTaskCountResponseBody model) {
            this.baselineCheckCount = model.baselineCheckCount;
            this.cveVulCount = model.cveVulCount;
            this.lastTaskTime = model.lastTaskTime;
            this.maliciousFile = model.maliciousFile;
            this.requestId = model.requestId;
            this.riskMachine = model.riskMachine;
            this.scaVulCount = model.scaVulCount;
            this.scanMachine = model.scanMachine;
            this.sensitiveFileCount = model.sensitiveFileCount;
            this.sysVulCount = model.sysVulCount;
            this.vulnerability = model.vulnerability;
        } 

        /**
         * <p>The number of baseline checks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder baselineCheckCount(Integer baselineCheckCount) {
            this.baselineCheckCount = baselineCheckCount;
            return this;
        }

        /**
         * <p>The number of system vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cveVulCount(Integer cveVulCount) {
            this.cveVulCount = cveVulCount;
            return this;
        }

        /**
         * <p>The timestamp generated when the last detection is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1682577532318</p>
         */
        public Builder lastTaskTime(Long lastTaskTime) {
            this.lastTaskTime = lastTaskTime;
            return this;
        }

        /**
         * <p>The number of malicious files.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maliciousFile(Integer maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
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
         * <p>The number of application vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaVulCount(Integer scaVulCount) {
            this.scaVulCount = scaVulCount;
            return this;
        }

        /**
         * <p>The number of hosts that are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanMachine(Integer scanMachine) {
            this.scanMachine = scanMachine;
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
         * <p>The total number of Windows system vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sysVulCount(String sysVulCount) {
            this.sysVulCount = sysVulCount;
            return this;
        }

        /**
         * <p>The number of vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vulnerability(Integer vulnerability) {
            this.vulnerability = vulnerability;
            return this;
        }

        public GetAgentlessTaskCountResponseBody build() {
            return new GetAgentlessTaskCountResponseBody(this);
        } 

    } 

}
