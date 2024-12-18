// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeSparkAppDiagnosisInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSparkAppDiagnosisInfoResponseBody</p>
 */
public class DescribeSparkAppDiagnosisInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("CpuUtilization")
    private Double cpuUtilization;

    @com.aliyun.core.annotation.NameInMap("DiagnosisInfoList")
    private java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfoList;

    @com.aliyun.core.annotation.NameInMap("DurationInMillis")
    private Long durationInMillis;

    @com.aliyun.core.annotation.NameInMap("JVMGcCostInMillis")
    private Long JVMGcCostInMillis;

    @com.aliyun.core.annotation.NameInMap("PeakMemoryInByte")
    private Long peakMemoryInByte;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShuffleReadInByte")
    private Long shuffleReadInByte;

    @com.aliyun.core.annotation.NameInMap("ShuffleWriteInByte")
    private Long shuffleWriteInByte;

    @com.aliyun.core.annotation.NameInMap("SpillInByte")
    private Long spillInByte;

    @com.aliyun.core.annotation.NameInMap("StartedTime")
    private Long startedTime;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private DescribeSparkAppDiagnosisInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.appId = builder.appId;
        this.cpuUtilization = builder.cpuUtilization;
        this.diagnosisInfoList = builder.diagnosisInfoList;
        this.durationInMillis = builder.durationInMillis;
        this.JVMGcCostInMillis = builder.JVMGcCostInMillis;
        this.peakMemoryInByte = builder.peakMemoryInByte;
        this.requestId = builder.requestId;
        this.shuffleReadInByte = builder.shuffleReadInByte;
        this.shuffleWriteInByte = builder.shuffleWriteInByte;
        this.spillInByte = builder.spillInByte;
        this.startedTime = builder.startedTime;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkAppDiagnosisInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return cpuUtilization
     */
    public Double getCpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * @return diagnosisInfoList
     */
    public java.util.List<Adb4MysqlSparkDiagnosisInfo> getDiagnosisInfoList() {
        return this.diagnosisInfoList;
    }

    /**
     * @return durationInMillis
     */
    public Long getDurationInMillis() {
        return this.durationInMillis;
    }

    /**
     * @return JVMGcCostInMillis
     */
    public Long getJVMGcCostInMillis() {
        return this.JVMGcCostInMillis;
    }

    /**
     * @return peakMemoryInByte
     */
    public Long getPeakMemoryInByte() {
        return this.peakMemoryInByte;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shuffleReadInByte
     */
    public Long getShuffleReadInByte() {
        return this.shuffleReadInByte;
    }

    /**
     * @return shuffleWriteInByte
     */
    public Long getShuffleWriteInByte() {
        return this.shuffleWriteInByte;
    }

    /**
     * @return spillInByte
     */
    public Long getSpillInByte() {
        return this.spillInByte;
    }

    /**
     * @return startedTime
     */
    public Long getStartedTime() {
        return this.startedTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String appId; 
        private Double cpuUtilization; 
        private java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfoList; 
        private Long durationInMillis; 
        private Long JVMGcCostInMillis; 
        private Long peakMemoryInByte; 
        private String requestId; 
        private Long shuffleReadInByte; 
        private Long shuffleWriteInByte; 
        private Long spillInByte; 
        private Long startedTime; 
        private String state; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * CpuUtilization.
         */
        public Builder cpuUtilization(Double cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        /**
         * DiagnosisInfoList.
         */
        public Builder diagnosisInfoList(java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfoList) {
            this.diagnosisInfoList = diagnosisInfoList;
            return this;
        }

        /**
         * DurationInMillis.
         */
        public Builder durationInMillis(Long durationInMillis) {
            this.durationInMillis = durationInMillis;
            return this;
        }

        /**
         * JVMGcCostInMillis.
         */
        public Builder JVMGcCostInMillis(Long JVMGcCostInMillis) {
            this.JVMGcCostInMillis = JVMGcCostInMillis;
            return this;
        }

        /**
         * PeakMemoryInByte.
         */
        public Builder peakMemoryInByte(Long peakMemoryInByte) {
            this.peakMemoryInByte = peakMemoryInByte;
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
         * ShuffleReadInByte.
         */
        public Builder shuffleReadInByte(Long shuffleReadInByte) {
            this.shuffleReadInByte = shuffleReadInByte;
            return this;
        }

        /**
         * ShuffleWriteInByte.
         */
        public Builder shuffleWriteInByte(Long shuffleWriteInByte) {
            this.shuffleWriteInByte = shuffleWriteInByte;
            return this;
        }

        /**
         * SpillInByte.
         */
        public Builder spillInByte(Long spillInByte) {
            this.spillInByte = spillInByte;
            return this;
        }

        /**
         * StartedTime.
         */
        public Builder startedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public DescribeSparkAppDiagnosisInfoResponseBody build() {
            return new DescribeSparkAppDiagnosisInfoResponseBody(this);
        } 

    } 

}
