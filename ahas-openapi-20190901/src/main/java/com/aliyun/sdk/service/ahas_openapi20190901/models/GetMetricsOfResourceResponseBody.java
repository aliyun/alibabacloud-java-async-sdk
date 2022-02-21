// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetricsOfResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetricsOfResourceResponseBody</p>
 */
public class GetMetricsOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMetricsOfResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricsOfResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetricsOfResourceResponseBody build() {
            return new GetMetricsOfResourceResponseBody(this);
        } 

    } 

    public static class InnerMetrics extends TeaModel {
        @NameInMap("BlockedQps")
        private Float blockedQps;

        @NameInMap("BlockedQpsAvg")
        private Float blockedQpsAvg;

        @NameInMap("BlockedQpsMax")
        private Float blockedQpsMax;

        @NameInMap("BlockedQpsMin")
        private Float blockedQpsMin;

        @NameInMap("BlockedQpsP75")
        private Float blockedQpsP75;

        @NameInMap("BlockedQpsP95")
        private Float blockedQpsP95;

        @NameInMap("BlockedQpsP99")
        private Float blockedQpsP99;

        @NameInMap("BlockedQpsStd")
        private Float blockedQpsStd;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("Exception")
        private Float exception;

        @NameInMap("ExceptionAvg")
        private Float exceptionAvg;

        @NameInMap("ExceptionMax")
        private Float exceptionMax;

        @NameInMap("ExceptionMin")
        private Float exceptionMin;

        @NameInMap("ExceptionP75")
        private Float exceptionP75;

        @NameInMap("ExceptionP95")
        private Float exceptionP95;

        @NameInMap("ExceptionP99")
        private Float exceptionP99;

        @NameInMap("ExceptionStd")
        private Float exceptionStd;

        @NameInMap("PassedQps")
        private Float passedQps;

        @NameInMap("PassedQpsAvg")
        private Float passedQpsAvg;

        @NameInMap("PassedQpsMax")
        private Float passedQpsMax;

        @NameInMap("PassedQpsMin")
        private Float passedQpsMin;

        @NameInMap("PassedQpsP75")
        private Float passedQpsP75;

        @NameInMap("PassedQpsP95")
        private Float passedQpsP95;

        @NameInMap("PassedQpsP99")
        private Float passedQpsP99;

        @NameInMap("PassedQpsStd")
        private Float passedQpsStd;

        @NameInMap("Rt")
        private Float rt;

        @NameInMap("RtAvg")
        private Float rtAvg;

        @NameInMap("RtMax")
        private Float rtMax;

        @NameInMap("RtMin")
        private Float rtMin;

        @NameInMap("RtP75")
        private Float rtP75;

        @NameInMap("RtP95")
        private Float rtP95;

        @NameInMap("RtP99")
        private Float rtP99;

        @NameInMap("RtStd")
        private Float rtStd;

        @NameInMap("SuccessQps")
        private Float successQps;

        @NameInMap("SuccessQpsAvg")
        private Float successQpsAvg;

        @NameInMap("SuccessQpsMax")
        private Float successQpsMax;

        @NameInMap("SuccessQpsMin")
        private Float successQpsMin;

        @NameInMap("SuccessQpsP75")
        private Float successQpsP75;

        @NameInMap("SuccessQpsP95")
        private Float successQpsP95;

        @NameInMap("SuccessQpsP99")
        private Float successQpsP99;

        @NameInMap("SuccessQpsStd")
        private Float successQpsStd;

        @NameInMap("Thread")
        private Float thread;

        @NameInMap("ThreadAvg")
        private Float threadAvg;

        @NameInMap("ThreadMax")
        private Float threadMax;

        @NameInMap("ThreadMin")
        private Float threadMin;

        @NameInMap("ThreadP75")
        private Float threadP75;

        @NameInMap("ThreadP95")
        private Float threadP95;

        @NameInMap("ThreadP99")
        private Float threadP99;

        @NameInMap("ThreadStd")
        private Float threadStd;

        @NameInMap("Timestamp")
        private Long timestamp;

        private InnerMetrics(Builder builder) {
            this.blockedQps = builder.blockedQps;
            this.blockedQpsAvg = builder.blockedQpsAvg;
            this.blockedQpsMax = builder.blockedQpsMax;
            this.blockedQpsMin = builder.blockedQpsMin;
            this.blockedQpsP75 = builder.blockedQpsP75;
            this.blockedQpsP95 = builder.blockedQpsP95;
            this.blockedQpsP99 = builder.blockedQpsP99;
            this.blockedQpsStd = builder.blockedQpsStd;
            this.count = builder.count;
            this.exception = builder.exception;
            this.exceptionAvg = builder.exceptionAvg;
            this.exceptionMax = builder.exceptionMax;
            this.exceptionMin = builder.exceptionMin;
            this.exceptionP75 = builder.exceptionP75;
            this.exceptionP95 = builder.exceptionP95;
            this.exceptionP99 = builder.exceptionP99;
            this.exceptionStd = builder.exceptionStd;
            this.passedQps = builder.passedQps;
            this.passedQpsAvg = builder.passedQpsAvg;
            this.passedQpsMax = builder.passedQpsMax;
            this.passedQpsMin = builder.passedQpsMin;
            this.passedQpsP75 = builder.passedQpsP75;
            this.passedQpsP95 = builder.passedQpsP95;
            this.passedQpsP99 = builder.passedQpsP99;
            this.passedQpsStd = builder.passedQpsStd;
            this.rt = builder.rt;
            this.rtAvg = builder.rtAvg;
            this.rtMax = builder.rtMax;
            this.rtMin = builder.rtMin;
            this.rtP75 = builder.rtP75;
            this.rtP95 = builder.rtP95;
            this.rtP99 = builder.rtP99;
            this.rtStd = builder.rtStd;
            this.successQps = builder.successQps;
            this.successQpsAvg = builder.successQpsAvg;
            this.successQpsMax = builder.successQpsMax;
            this.successQpsMin = builder.successQpsMin;
            this.successQpsP75 = builder.successQpsP75;
            this.successQpsP95 = builder.successQpsP95;
            this.successQpsP99 = builder.successQpsP99;
            this.successQpsStd = builder.successQpsStd;
            this.thread = builder.thread;
            this.threadAvg = builder.threadAvg;
            this.threadMax = builder.threadMax;
            this.threadMin = builder.threadMin;
            this.threadP75 = builder.threadP75;
            this.threadP95 = builder.threadP95;
            this.threadP99 = builder.threadP99;
            this.threadStd = builder.threadStd;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InnerMetrics create() {
            return builder().build();
        }

        /**
         * @return blockedQps
         */
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        /**
         * @return blockedQpsAvg
         */
        public Float getBlockedQpsAvg() {
            return this.blockedQpsAvg;
        }

        /**
         * @return blockedQpsMax
         */
        public Float getBlockedQpsMax() {
            return this.blockedQpsMax;
        }

        /**
         * @return blockedQpsMin
         */
        public Float getBlockedQpsMin() {
            return this.blockedQpsMin;
        }

        /**
         * @return blockedQpsP75
         */
        public Float getBlockedQpsP75() {
            return this.blockedQpsP75;
        }

        /**
         * @return blockedQpsP95
         */
        public Float getBlockedQpsP95() {
            return this.blockedQpsP95;
        }

        /**
         * @return blockedQpsP99
         */
        public Float getBlockedQpsP99() {
            return this.blockedQpsP99;
        }

        /**
         * @return blockedQpsStd
         */
        public Float getBlockedQpsStd() {
            return this.blockedQpsStd;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return exception
         */
        public Float getException() {
            return this.exception;
        }

        /**
         * @return exceptionAvg
         */
        public Float getExceptionAvg() {
            return this.exceptionAvg;
        }

        /**
         * @return exceptionMax
         */
        public Float getExceptionMax() {
            return this.exceptionMax;
        }

        /**
         * @return exceptionMin
         */
        public Float getExceptionMin() {
            return this.exceptionMin;
        }

        /**
         * @return exceptionP75
         */
        public Float getExceptionP75() {
            return this.exceptionP75;
        }

        /**
         * @return exceptionP95
         */
        public Float getExceptionP95() {
            return this.exceptionP95;
        }

        /**
         * @return exceptionP99
         */
        public Float getExceptionP99() {
            return this.exceptionP99;
        }

        /**
         * @return exceptionStd
         */
        public Float getExceptionStd() {
            return this.exceptionStd;
        }

        /**
         * @return passedQps
         */
        public Float getPassedQps() {
            return this.passedQps;
        }

        /**
         * @return passedQpsAvg
         */
        public Float getPassedQpsAvg() {
            return this.passedQpsAvg;
        }

        /**
         * @return passedQpsMax
         */
        public Float getPassedQpsMax() {
            return this.passedQpsMax;
        }

        /**
         * @return passedQpsMin
         */
        public Float getPassedQpsMin() {
            return this.passedQpsMin;
        }

        /**
         * @return passedQpsP75
         */
        public Float getPassedQpsP75() {
            return this.passedQpsP75;
        }

        /**
         * @return passedQpsP95
         */
        public Float getPassedQpsP95() {
            return this.passedQpsP95;
        }

        /**
         * @return passedQpsP99
         */
        public Float getPassedQpsP99() {
            return this.passedQpsP99;
        }

        /**
         * @return passedQpsStd
         */
        public Float getPassedQpsStd() {
            return this.passedQpsStd;
        }

        /**
         * @return rt
         */
        public Float getRt() {
            return this.rt;
        }

        /**
         * @return rtAvg
         */
        public Float getRtAvg() {
            return this.rtAvg;
        }

        /**
         * @return rtMax
         */
        public Float getRtMax() {
            return this.rtMax;
        }

        /**
         * @return rtMin
         */
        public Float getRtMin() {
            return this.rtMin;
        }

        /**
         * @return rtP75
         */
        public Float getRtP75() {
            return this.rtP75;
        }

        /**
         * @return rtP95
         */
        public Float getRtP95() {
            return this.rtP95;
        }

        /**
         * @return rtP99
         */
        public Float getRtP99() {
            return this.rtP99;
        }

        /**
         * @return rtStd
         */
        public Float getRtStd() {
            return this.rtStd;
        }

        /**
         * @return successQps
         */
        public Float getSuccessQps() {
            return this.successQps;
        }

        /**
         * @return successQpsAvg
         */
        public Float getSuccessQpsAvg() {
            return this.successQpsAvg;
        }

        /**
         * @return successQpsMax
         */
        public Float getSuccessQpsMax() {
            return this.successQpsMax;
        }

        /**
         * @return successQpsMin
         */
        public Float getSuccessQpsMin() {
            return this.successQpsMin;
        }

        /**
         * @return successQpsP75
         */
        public Float getSuccessQpsP75() {
            return this.successQpsP75;
        }

        /**
         * @return successQpsP95
         */
        public Float getSuccessQpsP95() {
            return this.successQpsP95;
        }

        /**
         * @return successQpsP99
         */
        public Float getSuccessQpsP99() {
            return this.successQpsP99;
        }

        /**
         * @return successQpsStd
         */
        public Float getSuccessQpsStd() {
            return this.successQpsStd;
        }

        /**
         * @return thread
         */
        public Float getThread() {
            return this.thread;
        }

        /**
         * @return threadAvg
         */
        public Float getThreadAvg() {
            return this.threadAvg;
        }

        /**
         * @return threadMax
         */
        public Float getThreadMax() {
            return this.threadMax;
        }

        /**
         * @return threadMin
         */
        public Float getThreadMin() {
            return this.threadMin;
        }

        /**
         * @return threadP75
         */
        public Float getThreadP75() {
            return this.threadP75;
        }

        /**
         * @return threadP95
         */
        public Float getThreadP95() {
            return this.threadP95;
        }

        /**
         * @return threadP99
         */
        public Float getThreadP99() {
            return this.threadP99;
        }

        /**
         * @return threadStd
         */
        public Float getThreadStd() {
            return this.threadStd;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Float blockedQps; 
            private Float blockedQpsAvg; 
            private Float blockedQpsMax; 
            private Float blockedQpsMin; 
            private Float blockedQpsP75; 
            private Float blockedQpsP95; 
            private Float blockedQpsP99; 
            private Float blockedQpsStd; 
            private Integer count; 
            private Float exception; 
            private Float exceptionAvg; 
            private Float exceptionMax; 
            private Float exceptionMin; 
            private Float exceptionP75; 
            private Float exceptionP95; 
            private Float exceptionP99; 
            private Float exceptionStd; 
            private Float passedQps; 
            private Float passedQpsAvg; 
            private Float passedQpsMax; 
            private Float passedQpsMin; 
            private Float passedQpsP75; 
            private Float passedQpsP95; 
            private Float passedQpsP99; 
            private Float passedQpsStd; 
            private Float rt; 
            private Float rtAvg; 
            private Float rtMax; 
            private Float rtMin; 
            private Float rtP75; 
            private Float rtP95; 
            private Float rtP99; 
            private Float rtStd; 
            private Float successQps; 
            private Float successQpsAvg; 
            private Float successQpsMax; 
            private Float successQpsMin; 
            private Float successQpsP75; 
            private Float successQpsP95; 
            private Float successQpsP99; 
            private Float successQpsStd; 
            private Float thread; 
            private Float threadAvg; 
            private Float threadMax; 
            private Float threadMin; 
            private Float threadP75; 
            private Float threadP95; 
            private Float threadP99; 
            private Float threadStd; 
            private Long timestamp; 

            /**
             * BlockedQps.
             */
            public Builder blockedQps(Float blockedQps) {
                this.blockedQps = blockedQps;
                return this;
            }

            /**
             * BlockedQpsAvg.
             */
            public Builder blockedQpsAvg(Float blockedQpsAvg) {
                this.blockedQpsAvg = blockedQpsAvg;
                return this;
            }

            /**
             * BlockedQpsMax.
             */
            public Builder blockedQpsMax(Float blockedQpsMax) {
                this.blockedQpsMax = blockedQpsMax;
                return this;
            }

            /**
             * BlockedQpsMin.
             */
            public Builder blockedQpsMin(Float blockedQpsMin) {
                this.blockedQpsMin = blockedQpsMin;
                return this;
            }

            /**
             * BlockedQpsP75.
             */
            public Builder blockedQpsP75(Float blockedQpsP75) {
                this.blockedQpsP75 = blockedQpsP75;
                return this;
            }

            /**
             * BlockedQpsP95.
             */
            public Builder blockedQpsP95(Float blockedQpsP95) {
                this.blockedQpsP95 = blockedQpsP95;
                return this;
            }

            /**
             * BlockedQpsP99.
             */
            public Builder blockedQpsP99(Float blockedQpsP99) {
                this.blockedQpsP99 = blockedQpsP99;
                return this;
            }

            /**
             * BlockedQpsStd.
             */
            public Builder blockedQpsStd(Float blockedQpsStd) {
                this.blockedQpsStd = blockedQpsStd;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Exception.
             */
            public Builder exception(Float exception) {
                this.exception = exception;
                return this;
            }

            /**
             * ExceptionAvg.
             */
            public Builder exceptionAvg(Float exceptionAvg) {
                this.exceptionAvg = exceptionAvg;
                return this;
            }

            /**
             * ExceptionMax.
             */
            public Builder exceptionMax(Float exceptionMax) {
                this.exceptionMax = exceptionMax;
                return this;
            }

            /**
             * ExceptionMin.
             */
            public Builder exceptionMin(Float exceptionMin) {
                this.exceptionMin = exceptionMin;
                return this;
            }

            /**
             * ExceptionP75.
             */
            public Builder exceptionP75(Float exceptionP75) {
                this.exceptionP75 = exceptionP75;
                return this;
            }

            /**
             * ExceptionP95.
             */
            public Builder exceptionP95(Float exceptionP95) {
                this.exceptionP95 = exceptionP95;
                return this;
            }

            /**
             * ExceptionP99.
             */
            public Builder exceptionP99(Float exceptionP99) {
                this.exceptionP99 = exceptionP99;
                return this;
            }

            /**
             * ExceptionStd.
             */
            public Builder exceptionStd(Float exceptionStd) {
                this.exceptionStd = exceptionStd;
                return this;
            }

            /**
             * PassedQps.
             */
            public Builder passedQps(Float passedQps) {
                this.passedQps = passedQps;
                return this;
            }

            /**
             * PassedQpsAvg.
             */
            public Builder passedQpsAvg(Float passedQpsAvg) {
                this.passedQpsAvg = passedQpsAvg;
                return this;
            }

            /**
             * PassedQpsMax.
             */
            public Builder passedQpsMax(Float passedQpsMax) {
                this.passedQpsMax = passedQpsMax;
                return this;
            }

            /**
             * PassedQpsMin.
             */
            public Builder passedQpsMin(Float passedQpsMin) {
                this.passedQpsMin = passedQpsMin;
                return this;
            }

            /**
             * PassedQpsP75.
             */
            public Builder passedQpsP75(Float passedQpsP75) {
                this.passedQpsP75 = passedQpsP75;
                return this;
            }

            /**
             * PassedQpsP95.
             */
            public Builder passedQpsP95(Float passedQpsP95) {
                this.passedQpsP95 = passedQpsP95;
                return this;
            }

            /**
             * PassedQpsP99.
             */
            public Builder passedQpsP99(Float passedQpsP99) {
                this.passedQpsP99 = passedQpsP99;
                return this;
            }

            /**
             * PassedQpsStd.
             */
            public Builder passedQpsStd(Float passedQpsStd) {
                this.passedQpsStd = passedQpsStd;
                return this;
            }

            /**
             * Rt.
             */
            public Builder rt(Float rt) {
                this.rt = rt;
                return this;
            }

            /**
             * RtAvg.
             */
            public Builder rtAvg(Float rtAvg) {
                this.rtAvg = rtAvg;
                return this;
            }

            /**
             * RtMax.
             */
            public Builder rtMax(Float rtMax) {
                this.rtMax = rtMax;
                return this;
            }

            /**
             * RtMin.
             */
            public Builder rtMin(Float rtMin) {
                this.rtMin = rtMin;
                return this;
            }

            /**
             * RtP75.
             */
            public Builder rtP75(Float rtP75) {
                this.rtP75 = rtP75;
                return this;
            }

            /**
             * RtP95.
             */
            public Builder rtP95(Float rtP95) {
                this.rtP95 = rtP95;
                return this;
            }

            /**
             * RtP99.
             */
            public Builder rtP99(Float rtP99) {
                this.rtP99 = rtP99;
                return this;
            }

            /**
             * RtStd.
             */
            public Builder rtStd(Float rtStd) {
                this.rtStd = rtStd;
                return this;
            }

            /**
             * SuccessQps.
             */
            public Builder successQps(Float successQps) {
                this.successQps = successQps;
                return this;
            }

            /**
             * SuccessQpsAvg.
             */
            public Builder successQpsAvg(Float successQpsAvg) {
                this.successQpsAvg = successQpsAvg;
                return this;
            }

            /**
             * SuccessQpsMax.
             */
            public Builder successQpsMax(Float successQpsMax) {
                this.successQpsMax = successQpsMax;
                return this;
            }

            /**
             * SuccessQpsMin.
             */
            public Builder successQpsMin(Float successQpsMin) {
                this.successQpsMin = successQpsMin;
                return this;
            }

            /**
             * SuccessQpsP75.
             */
            public Builder successQpsP75(Float successQpsP75) {
                this.successQpsP75 = successQpsP75;
                return this;
            }

            /**
             * SuccessQpsP95.
             */
            public Builder successQpsP95(Float successQpsP95) {
                this.successQpsP95 = successQpsP95;
                return this;
            }

            /**
             * SuccessQpsP99.
             */
            public Builder successQpsP99(Float successQpsP99) {
                this.successQpsP99 = successQpsP99;
                return this;
            }

            /**
             * SuccessQpsStd.
             */
            public Builder successQpsStd(Float successQpsStd) {
                this.successQpsStd = successQpsStd;
                return this;
            }

            /**
             * Thread.
             */
            public Builder thread(Float thread) {
                this.thread = thread;
                return this;
            }

            /**
             * ThreadAvg.
             */
            public Builder threadAvg(Float threadAvg) {
                this.threadAvg = threadAvg;
                return this;
            }

            /**
             * ThreadMax.
             */
            public Builder threadMax(Float threadMax) {
                this.threadMax = threadMax;
                return this;
            }

            /**
             * ThreadMin.
             */
            public Builder threadMin(Float threadMin) {
                this.threadMin = threadMin;
                return this;
            }

            /**
             * ThreadP75.
             */
            public Builder threadP75(Float threadP75) {
                this.threadP75 = threadP75;
                return this;
            }

            /**
             * ThreadP95.
             */
            public Builder threadP95(Float threadP95) {
                this.threadP95 = threadP95;
                return this;
            }

            /**
             * ThreadP99.
             */
            public Builder threadP99(Float threadP99) {
                this.threadP99 = threadP99;
                return this;
            }

            /**
             * ThreadStd.
             */
            public Builder threadStd(Float threadStd) {
                this.threadStd = threadStd;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public InnerMetrics build() {
                return new InnerMetrics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("InnerMetrics")
        private java.util.List < InnerMetrics> innerMetrics;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Resource")
        private String resource;

        private Data(Builder builder) {
            this.appName = builder.appName;
            this.innerMetrics = builder.innerMetrics;
            this.namespace = builder.namespace;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return innerMetrics
         */
        public java.util.List < InnerMetrics> getInnerMetrics() {
            return this.innerMetrics;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private String appName; 
            private java.util.List < InnerMetrics> innerMetrics; 
            private String namespace; 
            private String resource; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * InnerMetrics.
             */
            public Builder innerMetrics(java.util.List < InnerMetrics> innerMetrics) {
                this.innerMetrics = innerMetrics;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
