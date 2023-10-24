// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentlessTaskCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentlessTaskCountResponseBody</p>
 */
public class GetAgentlessTaskCountResponseBody extends TeaModel {
    @NameInMap("BaselineCheckCount")
    private Integer baselineCheckCount;

    @NameInMap("CveVulCount")
    private Integer cveVulCount;

    @NameInMap("LastTaskTime")
    private Long lastTaskTime;

    @NameInMap("MaliciousFile")
    private Integer maliciousFile;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskMachine")
    private Integer riskMachine;

    @NameInMap("ScaVulCount")
    private Integer scaVulCount;

    @NameInMap("ScanMachine")
    private Integer scanMachine;

    @NameInMap("SysVulCount")
    private String sysVulCount;

    @NameInMap("Vulnerability")
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
        this.sysVulCount = builder.sysVulCount;
        this.vulnerability = builder.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentlessTaskCountResponseBody create() {
        return builder().build();
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
        private String sysVulCount; 
        private Integer vulnerability; 

        /**
         * The number of baseline checks.
         */
        public Builder baselineCheckCount(Integer baselineCheckCount) {
            this.baselineCheckCount = baselineCheckCount;
            return this;
        }

        /**
         * The number of system vulnerabilities.
         */
        public Builder cveVulCount(Integer cveVulCount) {
            this.cveVulCount = cveVulCount;
            return this;
        }

        /**
         * The timestamp generated when the last detection is performed.
         */
        public Builder lastTaskTime(Long lastTaskTime) {
            this.lastTaskTime = lastTaskTime;
            return this;
        }

        /**
         * The number of malicious files.
         */
        public Builder maliciousFile(Integer maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of risky hosts.
         */
        public Builder riskMachine(Integer riskMachine) {
            this.riskMachine = riskMachine;
            return this;
        }

        /**
         * The number of application vulnerabilities.
         */
        public Builder scaVulCount(Integer scaVulCount) {
            this.scaVulCount = scaVulCount;
            return this;
        }

        /**
         * The number of hosts that are scanned.
         */
        public Builder scanMachine(Integer scanMachine) {
            this.scanMachine = scanMachine;
            return this;
        }

        /**
         * The total number of Windows system vulnerabilities.
         */
        public Builder sysVulCount(String sysVulCount) {
            this.sysVulCount = sysVulCount;
            return this;
        }

        /**
         * The number of vulnerabilities.
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
