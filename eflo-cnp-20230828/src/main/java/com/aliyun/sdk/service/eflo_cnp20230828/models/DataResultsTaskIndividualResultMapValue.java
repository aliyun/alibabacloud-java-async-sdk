// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link DataResultsTaskIndividualResultMapValue} extends {@link TeaModel}
 *
 * <p>DataResultsTaskIndividualResultMapValue</p>
 */
public class DataResultsTaskIndividualResultMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private Long experimentId;

    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("PodName")
    private String podName;

    @com.aliyun.core.annotation.NameInMap("GpuNum")
    private Integer gpuNum;

    @com.aliyun.core.annotation.NameInMap("GpuName")
    private String gpuName;

    @com.aliyun.core.annotation.NameInMap("WarningFlag")
    private Boolean warningFlag;

    @com.aliyun.core.annotation.NameInMap("WarningMsg")
    private String warningMsg;

    @com.aliyun.core.annotation.NameInMap("ErrorFlag")
    private Boolean errorFlag;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("Tflops")
    private Double tflops;

    @com.aliyun.core.annotation.NameInMap("SamplesPerSecond")
    private Double samplesPerSecond;

    private DataResultsTaskIndividualResultMapValue(Builder builder) {
        this.experimentId = builder.experimentId;
        this.hostname = builder.hostname;
        this.podName = builder.podName;
        this.gpuNum = builder.gpuNum;
        this.gpuName = builder.gpuName;
        this.warningFlag = builder.warningFlag;
        this.warningMsg = builder.warningMsg;
        this.errorFlag = builder.errorFlag;
        this.errorMsg = builder.errorMsg;
        this.tflops = builder.tflops;
        this.samplesPerSecond = builder.samplesPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataResultsTaskIndividualResultMapValue create() {
        return builder().build();
    }

    /**
     * @return experimentId
     */
    public Long getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return gpuNum
     */
    public Integer getGpuNum() {
        return this.gpuNum;
    }

    /**
     * @return gpuName
     */
    public String getGpuName() {
        return this.gpuName;
    }

    /**
     * @return warningFlag
     */
    public Boolean getWarningFlag() {
        return this.warningFlag;
    }

    /**
     * @return warningMsg
     */
    public String getWarningMsg() {
        return this.warningMsg;
    }

    /**
     * @return errorFlag
     */
    public Boolean getErrorFlag() {
        return this.errorFlag;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return tflops
     */
    public Double getTflops() {
        return this.tflops;
    }

    /**
     * @return samplesPerSecond
     */
    public Double getSamplesPerSecond() {
        return this.samplesPerSecond;
    }

    public static final class Builder {
        private Long experimentId; 
        private String hostname; 
        private String podName; 
        private Integer gpuNum; 
        private String gpuName; 
        private Boolean warningFlag; 
        private String warningMsg; 
        private Boolean errorFlag; 
        private String errorMsg; 
        private Double tflops; 
        private Double samplesPerSecond; 

        /**
         * ExperimentId.
         */
        public Builder experimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * PodName.
         */
        public Builder podName(String podName) {
            this.podName = podName;
            return this;
        }

        /**
         * GpuNum.
         */
        public Builder gpuNum(Integer gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }

        /**
         * GpuName.
         */
        public Builder gpuName(String gpuName) {
            this.gpuName = gpuName;
            return this;
        }

        /**
         * WarningFlag.
         */
        public Builder warningFlag(Boolean warningFlag) {
            this.warningFlag = warningFlag;
            return this;
        }

        /**
         * WarningMsg.
         */
        public Builder warningMsg(String warningMsg) {
            this.warningMsg = warningMsg;
            return this;
        }

        /**
         * ErrorFlag.
         */
        public Builder errorFlag(Boolean errorFlag) {
            this.errorFlag = errorFlag;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>TFLOPS</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        public Builder tflops(Double tflops) {
            this.tflops = tflops;
            return this;
        }

        /**
         * SamplesPerSecond.
         */
        public Builder samplesPerSecond(Double samplesPerSecond) {
            this.samplesPerSecond = samplesPerSecond;
            return this;
        }

        public DataResultsTaskIndividualResultMapValue build() {
            return new DataResultsTaskIndividualResultMapValue(this);
        } 

    } 

}
