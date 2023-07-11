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
    @NameInMap("LastTaskTime")
    private Long lastTaskTime;

    @NameInMap("MaliciousFile")
    private Integer maliciousFile;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskMachine")
    private Integer riskMachine;

    @NameInMap("ScanMachine")
    private Integer scanMachine;

    @NameInMap("Vulnerability")
    private Integer vulnerability;

    private GetAgentlessTaskCountResponseBody(Builder builder) {
        this.lastTaskTime = builder.lastTaskTime;
        this.maliciousFile = builder.maliciousFile;
        this.requestId = builder.requestId;
        this.riskMachine = builder.riskMachine;
        this.scanMachine = builder.scanMachine;
        this.vulnerability = builder.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentlessTaskCountResponseBody create() {
        return builder().build();
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
     * @return scanMachine
     */
    public Integer getScanMachine() {
        return this.scanMachine;
    }

    /**
     * @return vulnerability
     */
    public Integer getVulnerability() {
        return this.vulnerability;
    }

    public static final class Builder {
        private Long lastTaskTime; 
        private Integer maliciousFile; 
        private String requestId; 
        private Integer riskMachine; 
        private Integer scanMachine; 
        private Integer vulnerability; 

        /**
         * LastTaskTime.
         */
        public Builder lastTaskTime(Long lastTaskTime) {
            this.lastTaskTime = lastTaskTime;
            return this;
        }

        /**
         * MaliciousFile.
         */
        public Builder maliciousFile(Integer maliciousFile) {
            this.maliciousFile = maliciousFile;
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
         * RiskMachine.
         */
        public Builder riskMachine(Integer riskMachine) {
            this.riskMachine = riskMachine;
            return this;
        }

        /**
         * ScanMachine.
         */
        public Builder scanMachine(Integer scanMachine) {
            this.scanMachine = scanMachine;
            return this;
        }

        /**
         * Vulnerability.
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
