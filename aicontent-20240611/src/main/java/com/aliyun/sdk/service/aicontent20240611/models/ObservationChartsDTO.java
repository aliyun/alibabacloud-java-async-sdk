// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ObservationChartsDTO} extends {@link TeaModel}
 *
 * <p>ObservationChartsDTO</p>
 */
public class ObservationChartsDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("callVolume")
    private java.util.List<TimeSeriesPointDTO> callVolume;

    @com.aliyun.core.annotation.NameInMap("concurrency")
    private java.util.List<TimeSeriesPointDTO> concurrency;

    @com.aliyun.core.annotation.NameInMap("qpm")
    private java.util.List<TimeSeriesPointDTO> qpm;

    @com.aliyun.core.annotation.NameInMap("responseTime")
    private java.util.List<TimeSeriesPointDTO> responseTime;

    @com.aliyun.core.annotation.NameInMap("successRate")
    private java.util.List<TimeSeriesPointDTO> successRate;

    @com.aliyun.core.annotation.NameInMap("tpm")
    private java.util.List<TimeSeriesPointDTO> tpm;

    private ObservationChartsDTO(Builder builder) {
        this.callVolume = builder.callVolume;
        this.concurrency = builder.concurrency;
        this.qpm = builder.qpm;
        this.responseTime = builder.responseTime;
        this.successRate = builder.successRate;
        this.tpm = builder.tpm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObservationChartsDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callVolume
     */
    public java.util.List<TimeSeriesPointDTO> getCallVolume() {
        return this.callVolume;
    }

    /**
     * @return concurrency
     */
    public java.util.List<TimeSeriesPointDTO> getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return qpm
     */
    public java.util.List<TimeSeriesPointDTO> getQpm() {
        return this.qpm;
    }

    /**
     * @return responseTime
     */
    public java.util.List<TimeSeriesPointDTO> getResponseTime() {
        return this.responseTime;
    }

    /**
     * @return successRate
     */
    public java.util.List<TimeSeriesPointDTO> getSuccessRate() {
        return this.successRate;
    }

    /**
     * @return tpm
     */
    public java.util.List<TimeSeriesPointDTO> getTpm() {
        return this.tpm;
    }

    public static final class Builder {
        private java.util.List<TimeSeriesPointDTO> callVolume; 
        private java.util.List<TimeSeriesPointDTO> concurrency; 
        private java.util.List<TimeSeriesPointDTO> qpm; 
        private java.util.List<TimeSeriesPointDTO> responseTime; 
        private java.util.List<TimeSeriesPointDTO> successRate; 
        private java.util.List<TimeSeriesPointDTO> tpm; 

        private Builder() {
        } 

        private Builder(ObservationChartsDTO model) {
            this.callVolume = model.callVolume;
            this.concurrency = model.concurrency;
            this.qpm = model.qpm;
            this.responseTime = model.responseTime;
            this.successRate = model.successRate;
            this.tpm = model.tpm;
        } 

        /**
         * callVolume.
         */
        public Builder callVolume(java.util.List<TimeSeriesPointDTO> callVolume) {
            this.callVolume = callVolume;
            return this;
        }

        /**
         * concurrency.
         */
        public Builder concurrency(java.util.List<TimeSeriesPointDTO> concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * qpm.
         */
        public Builder qpm(java.util.List<TimeSeriesPointDTO> qpm) {
            this.qpm = qpm;
            return this;
        }

        /**
         * responseTime.
         */
        public Builder responseTime(java.util.List<TimeSeriesPointDTO> responseTime) {
            this.responseTime = responseTime;
            return this;
        }

        /**
         * successRate.
         */
        public Builder successRate(java.util.List<TimeSeriesPointDTO> successRate) {
            this.successRate = successRate;
            return this;
        }

        /**
         * tpm.
         */
        public Builder tpm(java.util.List<TimeSeriesPointDTO> tpm) {
            this.tpm = tpm;
            return this;
        }

        public ObservationChartsDTO build() {
            return new ObservationChartsDTO(this);
        } 

    } 

}
