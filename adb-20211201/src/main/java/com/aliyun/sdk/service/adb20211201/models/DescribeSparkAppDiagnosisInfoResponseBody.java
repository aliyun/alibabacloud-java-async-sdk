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
         * <p>The information about the request denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
         *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
         *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
         *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
         *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
         *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
         * }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/455888.html">ListSparkApps</a> operation to query all application IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s202404141952sz6a1391200****</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The CPU utilization. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder cpuUtilization(Double cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        /**
         * <p>The queried diagnostic information.</p>
         */
        public Builder diagnosisInfoList(java.util.List<Adb4MysqlSparkDiagnosisInfo> diagnosisInfoList) {
            this.diagnosisInfoList = diagnosisInfoList;
            return this;
        }

        /**
         * <p>The execution duration of the application. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>281063</p>
         */
        public Builder durationInMillis(Long durationInMillis) {
            this.durationInMillis = durationInMillis;
            return this;
        }

        /**
         * <p>The amount of time consumed by the Java virtual machine to perform garbage collection operations. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>81055</p>
         */
        public Builder JVMGcCostInMillis(Long JVMGcCostInMillis) {
            this.JVMGcCostInMillis = JVMGcCostInMillis;
            return this;
        }

        /**
         * <p>The peak memory usage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4096000</p>
         */
        public Builder peakMemoryInByte(Long peakMemoryInByte) {
            this.peakMemoryInByte = peakMemoryInByte;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FB5AC339-91F6-5000-8E5A-F47065B01B87</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The amount of data used for shuffle reads. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4096000</p>
         */
        public Builder shuffleReadInByte(Long shuffleReadInByte) {
            this.shuffleReadInByte = shuffleReadInByte;
            return this;
        }

        /**
         * <p>The amount of data used for shuffle writes. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>4096000</p>
         */
        public Builder shuffleWriteInByte(Long shuffleWriteInByte) {
            this.shuffleWriteInByte = shuffleWriteInByte;
            return this;
        }

        /**
         * <p>The amount of data spilled to disks when the memory is insufficient. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder spillInByte(Long spillInByte) {
            this.spillInByte = spillInByte;
            return this;
        }

        /**
         * <p>The time when the application started to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1718329831000</p>
         */
        public Builder startedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * <p>The status of the asynchronous import or export job. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>FINISHED</strong></li>
         * <li><strong>FAILED</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
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
