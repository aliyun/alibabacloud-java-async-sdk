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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DataResultsTaskIndividualResultMapValue model) {
            this.experimentId = model.experimentId;
            this.hostname = model.hostname;
            this.podName = model.podName;
            this.gpuNum = model.gpuNum;
            this.gpuName = model.gpuName;
            this.warningFlag = model.warningFlag;
            this.warningMsg = model.warningMsg;
            this.errorFlag = model.errorFlag;
            this.errorMsg = model.errorMsg;
            this.tflops = model.tflops;
            this.samplesPerSecond = model.samplesPerSecond;
        } 

        /**
         * <p>Experiment ID</p>
         * 
         * <strong>example:</strong>
         * <p>54</p>
         */
        public Builder experimentId(Long experimentId) {
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>Host IP</p>
         * 
         * <strong>example:</strong>
         * <p>p-jt-waf-app1</p>
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>Pod name</p>
         * 
         * <strong>example:</strong>
         * <p>fluxserv-6fc89b45cf-w8wq6</p>
         */
        public Builder podName(String podName) {
            this.podName = podName;
            return this;
        }

        /**
         * <p>GPU数量</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder gpuNum(Integer gpuNum) {
            this.gpuNum = gpuNum;
            return this;
        }

        /**
         * <p>GPU名称</p>
         * 
         * <strong>example:</strong>
         * <p>8x OAM 810 GPU</p>
         */
        public Builder gpuName(String gpuName) {
            this.gpuName = gpuName;
            return this;
        }

        /**
         * <p>Whether there is a warning</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder warningFlag(Boolean warningFlag) {
            this.warningFlag = warningFlag;
            return this;
        }

        /**
         * <p>Warning message</p>
         * 
         * <strong>example:</strong>
         * <p>warning message</p>
         */
        public Builder warningMsg(String warningMsg) {
            this.warningMsg = warningMsg;
            return this;
        }

        /**
         * <p>Whether there is an error</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder errorFlag(Boolean errorFlag) {
            this.errorFlag = errorFlag;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>error message</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>TFLOPS value</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        public Builder tflops(Double tflops) {
            this.tflops = tflops;
            return this;
        }

        /**
         * <p>Throughput</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
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
