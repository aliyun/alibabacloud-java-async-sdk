// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServerlessJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServerlessJobsResponseBody</p>
 */
public class DescribeServerlessJobsResponseBody extends TeaModel {
    @NameInMap("JobInfos")
    private java.util.List < JobInfos> jobInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeServerlessJobsResponseBody(Builder builder) {
        this.jobInfos = builder.jobInfos;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServerlessJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobInfos
     */
    public java.util.List < JobInfos> getJobInfos() {
        return this.jobInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < JobInfos> jobInfos; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * JobInfos.
         */
        public Builder jobInfos(java.util.List < JobInfos> jobInfos) {
            this.jobInfos = jobInfos;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeServerlessJobsResponseBody build() {
            return new DescribeServerlessJobsResponseBody(this);
        } 

    } 

    public static class ArrayProperties extends TeaModel {
        @NameInMap("IndexEnd")
        private Long indexEnd;

        @NameInMap("IndexStart")
        private Long indexStart;

        @NameInMap("IndexStep")
        private Long indexStep;

        private ArrayProperties(Builder builder) {
            this.indexEnd = builder.indexEnd;
            this.indexStart = builder.indexStart;
            this.indexStep = builder.indexStep;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrayProperties create() {
            return builder().build();
        }

        /**
         * @return indexEnd
         */
        public Long getIndexEnd() {
            return this.indexEnd;
        }

        /**
         * @return indexStart
         */
        public Long getIndexStart() {
            return this.indexStart;
        }

        /**
         * @return indexStep
         */
        public Long getIndexStep() {
            return this.indexStep;
        }

        public static final class Builder {
            private Long indexEnd; 
            private Long indexStart; 
            private Long indexStep; 

            /**
             * IndexEnd.
             */
            public Builder indexEnd(Long indexEnd) {
                this.indexEnd = indexEnd;
                return this;
            }

            /**
             * IndexStart.
             */
            public Builder indexStart(Long indexStart) {
                this.indexStart = indexStart;
                return this;
            }

            /**
             * IndexStep.
             */
            public Builder indexStep(Long indexStep) {
                this.indexStep = indexStep;
                return this;
            }

            public ArrayProperties build() {
                return new ArrayProperties(this);
            } 

        } 

    }
    public static class CurrentState extends TeaModel {
        @NameInMap("DetailStatus")
        private String detailStatus;

        @NameInMap("ExitCode")
        private Long exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Long signal;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        private CurrentState(Builder builder) {
            this.detailStatus = builder.detailStatus;
            this.exitCode = builder.exitCode;
            this.finishTime = builder.finishTime;
            this.message = builder.message;
            this.reason = builder.reason;
            this.signal = builder.signal;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentState create() {
            return builder().build();
        }

        /**
         * @return detailStatus
         */
        public String getDetailStatus() {
            return this.detailStatus;
        }

        /**
         * @return exitCode
         */
        public Long getExitCode() {
            return this.exitCode;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return signal
         */
        public Long getSignal() {
            return this.signal;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String detailStatus; 
            private Long exitCode; 
            private String finishTime; 
            private String message; 
            private String reason; 
            private Long signal; 
            private String startTime; 
            private String state; 

            /**
             * DetailStatus.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * ExitCode.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Signal.
             */
            public Builder signal(Long signal) {
                this.signal = signal;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public CurrentState build() {
                return new CurrentState(this);
            } 

        } 

    }
    public static class FieldRef extends TeaModel {
        @NameInMap("FieldPath")
        private String fieldPath;

        private FieldRef(Builder builder) {
            this.fieldPath = builder.fieldPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldRef create() {
            return builder().build();
        }

        /**
         * @return fieldPath
         */
        public String getFieldPath() {
            return this.fieldPath;
        }

        public static final class Builder {
            private String fieldPath; 

            /**
             * FieldPath.
             */
            public Builder fieldPath(String fieldPath) {
                this.fieldPath = fieldPath;
                return this;
            }

            public FieldRef build() {
                return new FieldRef(this);
            } 

        } 

    }
    public static class ValueFrom extends TeaModel {
        @NameInMap("FieldRef")
        private FieldRef fieldRef;

        private ValueFrom(Builder builder) {
            this.fieldRef = builder.fieldRef;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueFrom create() {
            return builder().build();
        }

        /**
         * @return fieldRef
         */
        public FieldRef getFieldRef() {
            return this.fieldRef;
        }

        public static final class Builder {
            private FieldRef fieldRef; 

            /**
             * FieldRef.
             */
            public Builder fieldRef(FieldRef fieldRef) {
                this.fieldRef = fieldRef;
                return this;
            }

            public ValueFrom build() {
                return new ValueFrom(this);
            } 

        } 

    }
    public static class EnvironmentVars extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueFrom")
        private ValueFrom valueFrom;

        private EnvironmentVars(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
            this.valueFrom = builder.valueFrom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVars create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueFrom
         */
        public ValueFrom getValueFrom() {
            return this.valueFrom;
        }

        public static final class Builder {
            private String key; 
            private String value; 
            private ValueFrom valueFrom; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueFrom.
             */
            public Builder valueFrom(ValueFrom valueFrom) {
                this.valueFrom = valueFrom;
                return this;
            }

            public EnvironmentVars build() {
                return new EnvironmentVars(this);
            } 

        } 

    }
    public static class HttpGet extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("Port")
        private Long port;

        @NameInMap("Scheme")
        private String scheme;

        private HttpGet(Builder builder) {
            this.path = builder.path;
            this.port = builder.port;
            this.scheme = builder.scheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpGet create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        public static final class Builder {
            private String path; 
            private Long port; 
            private String scheme; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * Scheme.
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            public HttpGet build() {
                return new HttpGet(this);
            } 

        } 

    }
    public static class TcpSocket extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Port")
        private Long port;

        private TcpSocket(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TcpSocket create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private Long port; 

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            public TcpSocket build() {
                return new TcpSocket(this);
            } 

        } 

    }
    public static class LivenessProbe extends TeaModel {
        @NameInMap("Execs")
        private java.util.List < String > execs;

        @NameInMap("FailureThreshold")
        private Long failureThreshold;

        @NameInMap("HttpGet")
        private HttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        private Long initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        private Long periodSeconds;

        @NameInMap("SuccessThreshold")
        private Long successThreshold;

        @NameInMap("TcpSocket")
        private TcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        private Long timeoutSeconds;

        private LivenessProbe(Builder builder) {
            this.execs = builder.execs;
            this.failureThreshold = builder.failureThreshold;
            this.httpGet = builder.httpGet;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.periodSeconds = builder.periodSeconds;
            this.successThreshold = builder.successThreshold;
            this.tcpSocket = builder.tcpSocket;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivenessProbe create() {
            return builder().build();
        }

        /**
         * @return execs
         */
        public java.util.List < String > getExecs() {
            return this.execs;
        }

        /**
         * @return failureThreshold
         */
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        /**
         * @return httpGet
         */
        public HttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return initialDelaySeconds
         */
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return periodSeconds
         */
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return successThreshold
         */
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        /**
         * @return tcpSocket
         */
        public TcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        /**
         * @return timeoutSeconds
         */
        public Long getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private java.util.List < String > execs; 
            private Long failureThreshold; 
            private HttpGet httpGet; 
            private Long initialDelaySeconds; 
            private Long periodSeconds; 
            private Long successThreshold; 
            private TcpSocket tcpSocket; 
            private Long timeoutSeconds; 

            /**
             * Execs.
             */
            public Builder execs(java.util.List < String > execs) {
                this.execs = execs;
                return this;
            }

            /**
             * FailureThreshold.
             */
            public Builder failureThreshold(Long failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * HttpGet。
             */
            public Builder httpGet(HttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * InitialDelaySeconds.
             */
            public Builder initialDelaySeconds(Long initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Long periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * SuccessThreshold.
             */
            public Builder successThreshold(Long successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * TcpSocket。
             */
            public Builder tcpSocket(TcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * TimeoutSeconds.
             */
            public Builder timeoutSeconds(Long timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public LivenessProbe build() {
                return new LivenessProbe(this);
            } 

        } 

    }
    public static class Ports extends TeaModel {
        @NameInMap("Port")
        private Long port;

        @NameInMap("Protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Long port; 
            private String protocol; 

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    public static class PreviousState extends TeaModel {
        @NameInMap("DetailStatus")
        private String detailStatus;

        @NameInMap("ExitCode")
        private Long exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Long signal;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        private PreviousState(Builder builder) {
            this.detailStatus = builder.detailStatus;
            this.exitCode = builder.exitCode;
            this.finishTime = builder.finishTime;
            this.message = builder.message;
            this.reason = builder.reason;
            this.signal = builder.signal;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreviousState create() {
            return builder().build();
        }

        /**
         * @return detailStatus
         */
        public String getDetailStatus() {
            return this.detailStatus;
        }

        /**
         * @return exitCode
         */
        public Long getExitCode() {
            return this.exitCode;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return signal
         */
        public Long getSignal() {
            return this.signal;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String detailStatus; 
            private Long exitCode; 
            private String finishTime; 
            private String message; 
            private String reason; 
            private Long signal; 
            private String startTime; 
            private String state; 

            /**
             * DetailStatus.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * ExitCode.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Signal.
             */
            public Builder signal(Long signal) {
                this.signal = signal;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public PreviousState build() {
                return new PreviousState(this);
            } 

        } 

    }
    public static class ReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("Port")
        private Long port;

        @NameInMap("Scheme")
        private String scheme;

        private ReadinessProbeHttpGet(Builder builder) {
            this.path = builder.path;
            this.port = builder.port;
            this.scheme = builder.scheme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeHttpGet create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return scheme
         */
        public String getScheme() {
            return this.scheme;
        }

        public static final class Builder {
            private String path; 
            private Long port; 
            private String scheme; 

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * HTTP／HTTPS。
             */
            public Builder scheme(String scheme) {
                this.scheme = scheme;
                return this;
            }

            public ReadinessProbeHttpGet build() {
                return new ReadinessProbeHttpGet(this);
            } 

        } 

    }
    public static class ReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Port")
        private Long port;

        private ReadinessProbeTcpSocket(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbeTcpSocket create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private Long port; 

            /**
             * Host。
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            public ReadinessProbeTcpSocket build() {
                return new ReadinessProbeTcpSocket(this);
            } 

        } 

    }
    public static class ReadinessProbe extends TeaModel {
        @NameInMap("Execs")
        private java.util.List < String > execs;

        @NameInMap("FailureThreshold")
        private Long failureThreshold;

        @NameInMap("HttpGet")
        private ReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        private Long initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        private Long periodSeconds;

        @NameInMap("SuccessThreshold")
        private Long successThreshold;

        @NameInMap("TcpSocket")
        private ReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        private Long timeoutSeconds;

        private ReadinessProbe(Builder builder) {
            this.execs = builder.execs;
            this.failureThreshold = builder.failureThreshold;
            this.httpGet = builder.httpGet;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.periodSeconds = builder.periodSeconds;
            this.successThreshold = builder.successThreshold;
            this.tcpSocket = builder.tcpSocket;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadinessProbe create() {
            return builder().build();
        }

        /**
         * @return execs
         */
        public java.util.List < String > getExecs() {
            return this.execs;
        }

        /**
         * @return failureThreshold
         */
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        /**
         * @return httpGet
         */
        public ReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        /**
         * @return initialDelaySeconds
         */
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return periodSeconds
         */
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return successThreshold
         */
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        /**
         * @return tcpSocket
         */
        public ReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        /**
         * @return timeoutSeconds
         */
        public Long getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private java.util.List < String > execs; 
            private Long failureThreshold; 
            private ReadinessProbeHttpGet httpGet; 
            private Long initialDelaySeconds; 
            private Long periodSeconds; 
            private Long successThreshold; 
            private ReadinessProbeTcpSocket tcpSocket; 
            private Long timeoutSeconds; 

            /**
             * Execs.
             */
            public Builder execs(java.util.List < String > execs) {
                this.execs = execs;
                return this;
            }

            /**
             * FailureThreshold.
             */
            public Builder failureThreshold(Long failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * HttpGet。
             */
            public Builder httpGet(ReadinessProbeHttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * InitialDelaySeconds.
             */
            public Builder initialDelaySeconds(Long initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Long periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * SuccessThreshold.
             */
            public Builder successThreshold(Long successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * TcpSocket。
             */
            public Builder tcpSocket(ReadinessProbeTcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * TimeoutSeconds.
             */
            public Builder timeoutSeconds(Long timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public ReadinessProbe build() {
                return new ReadinessProbe(this);
            } 

        } 

    }
    public static class Capability extends TeaModel {
        @NameInMap("Adds")
        private java.util.List < String > adds;

        private Capability(Builder builder) {
            this.adds = builder.adds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capability create() {
            return builder().build();
        }

        /**
         * @return adds
         */
        public java.util.List < String > getAdds() {
            return this.adds;
        }

        public static final class Builder {
            private java.util.List < String > adds; 

            /**
             * Adds.
             */
            public Builder adds(java.util.List < String > adds) {
                this.adds = adds;
                return this;
            }

            public Capability build() {
                return new Capability(this);
            } 

        } 

    }
    public static class SecurityContext extends TeaModel {
        @NameInMap("Capability")
        private Capability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        private Long runAsUser;

        private SecurityContext(Builder builder) {
            this.capability = builder.capability;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsUser = builder.runAsUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContext create() {
            return builder().build();
        }

        /**
         * @return capability
         */
        public Capability getCapability() {
            return this.capability;
        }

        /**
         * @return readOnlyRootFilesystem
         */
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        /**
         * @return runAsUser
         */
        public Long getRunAsUser() {
            return this.runAsUser;
        }

        public static final class Builder {
            private Capability capability; 
            private Boolean readOnlyRootFilesystem; 
            private Long runAsUser; 

            /**
             * Capability.
             */
            public Builder capability(Capability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * ReadOnlyRootFilesystem.
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * RunAsUser.
             */
            public Builder runAsUser(Long runAsUser) {
                this.runAsUser = runAsUser;
                return this;
            }

            public SecurityContext build() {
                return new SecurityContext(this);
            } 

        } 

    }
    public static class VolumeMounts extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("MountPropagation")
        private String mountPropagation;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        @NameInMap("SubPath")
        private String subPath;

        private VolumeMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
            this.subPath = builder.subPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeMounts create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return mountPropagation
         */
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return subPath
         */
        public String getSubPath() {
            return this.subPath;
        }

        public static final class Builder {
            private String mountPath; 
            private String mountPropagation; 
            private String name; 
            private Boolean readOnly; 
            private String subPath; 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * MountPropagation.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * SubPath.
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            public VolumeMounts build() {
                return new VolumeMounts(this);
            } 

        } 

    }
    public static class Containers extends TeaModel {
        @NameInMap("Args")
        private java.util.List < String > args;

        @NameInMap("Commands")
        private java.util.List < String > commands;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("CurrentState")
        private CurrentState currentState;

        @NameInMap("EnvironmentVars")
        private java.util.List < EnvironmentVars> environmentVars;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("LivenessProbe")
        private LivenessProbe livenessProbe;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ports")
        private java.util.List < Ports> ports;

        @NameInMap("PreviousState")
        private PreviousState previousState;

        @NameInMap("ReadinessProbe")
        private ReadinessProbe readinessProbe;

        @NameInMap("Ready")
        private Boolean ready;

        @NameInMap("RestartCount")
        private Integer restartCount;

        @NameInMap("SecurityContext")
        private SecurityContext securityContext;

        @NameInMap("Stdin")
        private Boolean stdin;

        @NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @NameInMap("Tty")
        private Boolean tty;

        @NameInMap("VolumeMounts")
        private java.util.List < VolumeMounts> volumeMounts;

        @NameInMap("WorkingDir")
        private String workingDir;

        private Containers(Builder builder) {
            this.args = builder.args;
            this.commands = builder.commands;
            this.cpu = builder.cpu;
            this.currentState = builder.currentState;
            this.environmentVars = builder.environmentVars;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.livenessProbe = builder.livenessProbe;
            this.memory = builder.memory;
            this.name = builder.name;
            this.ports = builder.ports;
            this.previousState = builder.previousState;
            this.readinessProbe = builder.readinessProbe;
            this.ready = builder.ready;
            this.restartCount = builder.restartCount;
            this.securityContext = builder.securityContext;
            this.stdin = builder.stdin;
            this.stdinOnce = builder.stdinOnce;
            this.tty = builder.tty;
            this.volumeMounts = builder.volumeMounts;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Containers create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public java.util.List < String > getArgs() {
            return this.args;
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
            return this.commands;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return currentState
         */
        public CurrentState getCurrentState() {
            return this.currentState;
        }

        /**
         * @return environmentVars
         */
        public java.util.List < EnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imagePullPolicy
         */
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        /**
         * @return livenessProbe
         */
        public LivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ports
         */
        public java.util.List < Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return previousState
         */
        public PreviousState getPreviousState() {
            return this.previousState;
        }

        /**
         * @return readinessProbe
         */
        public ReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        /**
         * @return ready
         */
        public Boolean getReady() {
            return this.ready;
        }

        /**
         * @return restartCount
         */
        public Integer getRestartCount() {
            return this.restartCount;
        }

        /**
         * @return securityContext
         */
        public SecurityContext getSecurityContext() {
            return this.securityContext;
        }

        /**
         * @return stdin
         */
        public Boolean getStdin() {
            return this.stdin;
        }

        /**
         * @return stdinOnce
         */
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        /**
         * @return tty
         */
        public Boolean getTty() {
            return this.tty;
        }

        /**
         * @return volumeMounts
         */
        public java.util.List < VolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private java.util.List < String > args; 
            private java.util.List < String > commands; 
            private Float cpu; 
            private CurrentState currentState; 
            private java.util.List < EnvironmentVars> environmentVars; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private LivenessProbe livenessProbe; 
            private Float memory; 
            private String name; 
            private java.util.List < Ports> ports; 
            private PreviousState previousState; 
            private ReadinessProbe readinessProbe; 
            private Boolean ready; 
            private Integer restartCount; 
            private SecurityContext securityContext; 
            private Boolean stdin; 
            private Boolean stdinOnce; 
            private Boolean tty; 
            private java.util.List < VolumeMounts> volumeMounts; 
            private String workingDir; 

            /**
             * Args.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * Commands.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CurrentState.
             */
            public Builder currentState(CurrentState currentState) {
                this.currentState = currentState;
                return this;
            }

            /**
             * EnvironmentVars.
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * ImagePullPolicy.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * LivenessProbe.
             */
            public Builder livenessProbe(LivenessProbe livenessProbe) {
                this.livenessProbe = livenessProbe;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Ports.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * PreviousState.
             */
            public Builder previousState(PreviousState previousState) {
                this.previousState = previousState;
                return this;
            }

            /**
             * ReadinessProbe.
             */
            public Builder readinessProbe(ReadinessProbe readinessProbe) {
                this.readinessProbe = readinessProbe;
                return this;
            }

            /**
             * Ready.
             */
            public Builder ready(Boolean ready) {
                this.ready = ready;
                return this;
            }

            /**
             * RestartCount.
             */
            public Builder restartCount(Integer restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            /**
             * SecurityContext.
             */
            public Builder securityContext(SecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * Stdin.
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * StdinOnce.
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * Tty.
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * VolumeMounts.
             */
            public Builder volumeMounts(java.util.List < VolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * WorkingDir.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public Containers build() {
                return new Containers(this);
            } 

        } 

    }
    public static class Options extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private Options(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    public static class DnsConfig extends TeaModel {
        @NameInMap("NameServers")
        private java.util.List < String > nameServers;

        @NameInMap("Options")
        private java.util.List < Options> options;

        @NameInMap("Searches")
        private java.util.List < String > searches;

        private DnsConfig(Builder builder) {
            this.nameServers = builder.nameServers;
            this.options = builder.options;
            this.searches = builder.searches;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConfig create() {
            return builder().build();
        }

        /**
         * @return nameServers
         */
        public java.util.List < String > getNameServers() {
            return this.nameServers;
        }

        /**
         * @return options
         */
        public java.util.List < Options> getOptions() {
            return this.options;
        }

        /**
         * @return searches
         */
        public java.util.List < String > getSearches() {
            return this.searches;
        }

        public static final class Builder {
            private java.util.List < String > nameServers; 
            private java.util.List < Options> options; 
            private java.util.List < String > searches; 

            /**
             * NameServers.
             */
            public Builder nameServers(java.util.List < String > nameServers) {
                this.nameServers = nameServers;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(java.util.List < Options> options) {
                this.options = options;
                return this;
            }

            /**
             * Searches.
             */
            public Builder searches(java.util.List < String > searches) {
                this.searches = searches;
                return this;
            }

            public DnsConfig build() {
                return new DnsConfig(this);
            } 

        } 

    }
    public static class Sysctls extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private Sysctls(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sysctls create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Sysctls build() {
                return new Sysctls(this);
            } 

        } 

    }
    public static class EciSecurityContext extends TeaModel {
        @NameInMap("Sysctls")
        private java.util.List < Sysctls> sysctls;

        private EciSecurityContext(Builder builder) {
            this.sysctls = builder.sysctls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EciSecurityContext create() {
            return builder().build();
        }

        /**
         * @return sysctls
         */
        public java.util.List < Sysctls> getSysctls() {
            return this.sysctls;
        }

        public static final class Builder {
            private java.util.List < Sysctls> sysctls; 

            /**
             * Sysctls.
             */
            public Builder sysctls(java.util.List < Sysctls> sysctls) {
                this.sysctls = sysctls;
                return this;
            }

            public EciSecurityContext build() {
                return new EciSecurityContext(this);
            } 

        } 

    }
    public static class Events extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("FirstTimestamp")
        private String firstTimestamp;

        @NameInMap("LastTimestamp")
        private String lastTimestamp;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Type")
        private String type;

        private Events(Builder builder) {
            this.count = builder.count;
            this.firstTimestamp = builder.firstTimestamp;
            this.lastTimestamp = builder.lastTimestamp;
            this.message = builder.message;
            this.name = builder.name;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return firstTimestamp
         */
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        /**
         * @return lastTimestamp
         */
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String firstTimestamp; 
            private String lastTimestamp; 
            private String message; 
            private String name; 
            private String reason; 
            private String type; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * FirstTimestamp.
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * LastTimestamp.
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    public static class HostAliases extends TeaModel {
        @NameInMap("Hostnames")
        private java.util.List < String > hostnames;

        @NameInMap("Ip")
        private String ip;

        private HostAliases(Builder builder) {
            this.hostnames = builder.hostnames;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAliases create() {
            return builder().build();
        }

        /**
         * @return hostnames
         */
        public java.util.List < String > getHostnames() {
            return this.hostnames;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > hostnames; 
            private String ip; 

            /**
             * Hostnames.
             */
            public Builder hostnames(java.util.List < String > hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public HostAliases build() {
                return new HostAliases(this);
            } 

        } 

    }
    public static class InitContainersCurrentState extends TeaModel {
        @NameInMap("DetailStatus")
        private String detailStatus;

        @NameInMap("ExitCode")
        private Long exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Long signal;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        private InitContainersCurrentState(Builder builder) {
            this.detailStatus = builder.detailStatus;
            this.exitCode = builder.exitCode;
            this.finishTime = builder.finishTime;
            this.message = builder.message;
            this.reason = builder.reason;
            this.signal = builder.signal;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersCurrentState create() {
            return builder().build();
        }

        /**
         * @return detailStatus
         */
        public String getDetailStatus() {
            return this.detailStatus;
        }

        /**
         * @return exitCode
         */
        public Long getExitCode() {
            return this.exitCode;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return signal
         */
        public Long getSignal() {
            return this.signal;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String detailStatus; 
            private Long exitCode; 
            private String finishTime; 
            private String message; 
            private String reason; 
            private Long signal; 
            private String startTime; 
            private String state; 

            /**
             * DetailStatus.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * ExitCode.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Signal.
             */
            public Builder signal(Long signal) {
                this.signal = signal;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public InitContainersCurrentState build() {
                return new InitContainersCurrentState(this);
            } 

        } 

    }
    public static class ValueFromFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        private String fieldPath;

        private ValueFromFieldRef(Builder builder) {
            this.fieldPath = builder.fieldPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueFromFieldRef create() {
            return builder().build();
        }

        /**
         * @return fieldPath
         */
        public String getFieldPath() {
            return this.fieldPath;
        }

        public static final class Builder {
            private String fieldPath; 

            /**
             * FieldPath.
             */
            public Builder fieldPath(String fieldPath) {
                this.fieldPath = fieldPath;
                return this;
            }

            public ValueFromFieldRef build() {
                return new ValueFromFieldRef(this);
            } 

        } 

    }
    public static class EnvironmentVarsValueFrom extends TeaModel {
        @NameInMap("FieldRef")
        private ValueFromFieldRef fieldRef;

        private EnvironmentVarsValueFrom(Builder builder) {
            this.fieldRef = builder.fieldRef;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVarsValueFrom create() {
            return builder().build();
        }

        /**
         * @return fieldRef
         */
        public ValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

        public static final class Builder {
            private ValueFromFieldRef fieldRef; 

            /**
             * FieldRef.
             */
            public Builder fieldRef(ValueFromFieldRef fieldRef) {
                this.fieldRef = fieldRef;
                return this;
            }

            public EnvironmentVarsValueFrom build() {
                return new EnvironmentVarsValueFrom(this);
            } 

        } 

    }
    public static class InitContainersEnvironmentVars extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueFrom")
        private EnvironmentVarsValueFrom valueFrom;

        private InitContainersEnvironmentVars(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
            this.valueFrom = builder.valueFrom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersEnvironmentVars create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueFrom
         */
        public EnvironmentVarsValueFrom getValueFrom() {
            return this.valueFrom;
        }

        public static final class Builder {
            private String key; 
            private String value; 
            private EnvironmentVarsValueFrom valueFrom; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueFrom.
             */
            public Builder valueFrom(EnvironmentVarsValueFrom valueFrom) {
                this.valueFrom = valueFrom;
                return this;
            }

            public InitContainersEnvironmentVars build() {
                return new InitContainersEnvironmentVars(this);
            } 

        } 

    }
    public static class InitContainersPorts extends TeaModel {
        @NameInMap("Port")
        private Long port;

        @NameInMap("Protocol")
        private String protocol;

        private InitContainersPorts(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersPorts create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Long port; 
            private String protocol; 

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public InitContainersPorts build() {
                return new InitContainersPorts(this);
            } 

        } 

    }
    public static class InitContainersPreviousState extends TeaModel {
        @NameInMap("DetailStatus")
        private String detailStatus;

        @NameInMap("ExitCode")
        private Long exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Long signal;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        private InitContainersPreviousState(Builder builder) {
            this.detailStatus = builder.detailStatus;
            this.exitCode = builder.exitCode;
            this.finishTime = builder.finishTime;
            this.message = builder.message;
            this.reason = builder.reason;
            this.signal = builder.signal;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersPreviousState create() {
            return builder().build();
        }

        /**
         * @return detailStatus
         */
        public String getDetailStatus() {
            return this.detailStatus;
        }

        /**
         * @return exitCode
         */
        public Long getExitCode() {
            return this.exitCode;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return signal
         */
        public Long getSignal() {
            return this.signal;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String detailStatus; 
            private Long exitCode; 
            private String finishTime; 
            private String message; 
            private String reason; 
            private Long signal; 
            private String startTime; 
            private String state; 

            /**
             * DetailStatus.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * ExitCode.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
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
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Signal.
             */
            public Builder signal(Long signal) {
                this.signal = signal;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public InitContainersPreviousState build() {
                return new InitContainersPreviousState(this);
            } 

        } 

    }
    public static class SecurityContextCapability extends TeaModel {
        @NameInMap("Adds")
        private java.util.List < String > adds;

        private SecurityContextCapability(Builder builder) {
            this.adds = builder.adds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityContextCapability create() {
            return builder().build();
        }

        /**
         * @return adds
         */
        public java.util.List < String > getAdds() {
            return this.adds;
        }

        public static final class Builder {
            private java.util.List < String > adds; 

            /**
             * Adds.
             */
            public Builder adds(java.util.List < String > adds) {
                this.adds = adds;
                return this;
            }

            public SecurityContextCapability build() {
                return new SecurityContextCapability(this);
            } 

        } 

    }
    public static class InitContainersSecurityContext extends TeaModel {
        @NameInMap("Capability")
        private SecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        private Long runAsUser;

        private InitContainersSecurityContext(Builder builder) {
            this.capability = builder.capability;
            this.readOnlyRootFilesystem = builder.readOnlyRootFilesystem;
            this.runAsUser = builder.runAsUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersSecurityContext create() {
            return builder().build();
        }

        /**
         * @return capability
         */
        public SecurityContextCapability getCapability() {
            return this.capability;
        }

        /**
         * @return readOnlyRootFilesystem
         */
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        /**
         * @return runAsUser
         */
        public Long getRunAsUser() {
            return this.runAsUser;
        }

        public static final class Builder {
            private SecurityContextCapability capability; 
            private Boolean readOnlyRootFilesystem; 
            private Long runAsUser; 

            /**
             * Capability.
             */
            public Builder capability(SecurityContextCapability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * ReadOnlyRootFilesystem.
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * RunAsUser.
             */
            public Builder runAsUser(Long runAsUser) {
                this.runAsUser = runAsUser;
                return this;
            }

            public InitContainersSecurityContext build() {
                return new InitContainersSecurityContext(this);
            } 

        } 

    }
    public static class InitContainersVolumeMounts extends TeaModel {
        @NameInMap("MountPath")
        private String mountPath;

        @NameInMap("MountPropagation")
        private String mountPropagation;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReadOnly")
        private Boolean readOnly;

        private InitContainersVolumeMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.mountPropagation = builder.mountPropagation;
            this.name = builder.name;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainersVolumeMounts create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return mountPropagation
         */
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public static final class Builder {
            private String mountPath; 
            private String mountPropagation; 
            private String name; 
            private Boolean readOnly; 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * MountPropagation.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ReadOnly.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public InitContainersVolumeMounts build() {
                return new InitContainersVolumeMounts(this);
            } 

        } 

    }
    public static class InitContainers extends TeaModel {
        @NameInMap("Args")
        private java.util.List < String > args;

        @NameInMap("Command")
        private java.util.List < String > command;

        @NameInMap("Cpu")
        private Long cpu;

        @NameInMap("CurrentState")
        private InitContainersCurrentState currentState;

        @NameInMap("EnvironmentVars")
        private java.util.List < InitContainersEnvironmentVars> environmentVars;

        @NameInMap("Gpu")
        private Long gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ports")
        private java.util.List < InitContainersPorts> ports;

        @NameInMap("PreviousState")
        private InitContainersPreviousState previousState;

        @NameInMap("Ready")
        private Boolean ready;

        @NameInMap("RestartCount")
        private Long restartCount;

        @NameInMap("SecurityContext")
        private InitContainersSecurityContext securityContext;

        @NameInMap("VolumeMounts")
        private java.util.List < InitContainersVolumeMounts> volumeMounts;

        @NameInMap("WorkingDir")
        private String workingDir;

        private InitContainers(Builder builder) {
            this.args = builder.args;
            this.command = builder.command;
            this.cpu = builder.cpu;
            this.currentState = builder.currentState;
            this.environmentVars = builder.environmentVars;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.imagePullPolicy = builder.imagePullPolicy;
            this.memory = builder.memory;
            this.name = builder.name;
            this.ports = builder.ports;
            this.previousState = builder.previousState;
            this.ready = builder.ready;
            this.restartCount = builder.restartCount;
            this.securityContext = builder.securityContext;
            this.volumeMounts = builder.volumeMounts;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitContainers create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public java.util.List < String > getArgs() {
            return this.args;
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        /**
         * @return cpu
         */
        public Long getCpu() {
            return this.cpu;
        }

        /**
         * @return currentState
         */
        public InitContainersCurrentState getCurrentState() {
            return this.currentState;
        }

        /**
         * @return environmentVars
         */
        public java.util.List < InitContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        /**
         * @return gpu
         */
        public Long getGpu() {
            return this.gpu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imagePullPolicy
         */
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ports
         */
        public java.util.List < InitContainersPorts> getPorts() {
            return this.ports;
        }

        /**
         * @return previousState
         */
        public InitContainersPreviousState getPreviousState() {
            return this.previousState;
        }

        /**
         * @return ready
         */
        public Boolean getReady() {
            return this.ready;
        }

        /**
         * @return restartCount
         */
        public Long getRestartCount() {
            return this.restartCount;
        }

        /**
         * @return securityContext
         */
        public InitContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        /**
         * @return volumeMounts
         */
        public java.util.List < InitContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private java.util.List < String > args; 
            private java.util.List < String > command; 
            private Long cpu; 
            private InitContainersCurrentState currentState; 
            private java.util.List < InitContainersEnvironmentVars> environmentVars; 
            private Long gpu; 
            private String image; 
            private String imagePullPolicy; 
            private Long memory; 
            private String name; 
            private java.util.List < InitContainersPorts> ports; 
            private InitContainersPreviousState previousState; 
            private Boolean ready; 
            private Long restartCount; 
            private InitContainersSecurityContext securityContext; 
            private java.util.List < InitContainersVolumeMounts> volumeMounts; 
            private String workingDir; 

            /**
             * Args.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CurrentState.
             */
            public Builder currentState(InitContainersCurrentState currentState) {
                this.currentState = currentState;
                return this;
            }

            /**
             * EnvironmentVars.
             */
            public Builder environmentVars(java.util.List < InitContainersEnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Long gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * ImagePullPolicy.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Ports.
             */
            public Builder ports(java.util.List < InitContainersPorts> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * PreviousState.
             */
            public Builder previousState(InitContainersPreviousState previousState) {
                this.previousState = previousState;
                return this;
            }

            /**
             * Ready.
             */
            public Builder ready(Boolean ready) {
                this.ready = ready;
                return this;
            }

            /**
             * RestartCount.
             */
            public Builder restartCount(Long restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            /**
             * SecurityContext.
             */
            public Builder securityContext(InitContainersSecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * VolumeMounts.
             */
            public Builder volumeMounts(java.util.List < InitContainersVolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * WorkingDir.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public InitContainers build() {
                return new InitContainers(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ConfigFileVolumeConfigFileToPaths extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Path")
        private String path;

        private ConfigFileVolumeConfigFileToPaths(Builder builder) {
            this.content = builder.content;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFileVolumeConfigFileToPaths create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String content; 
            private String path; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ConfigFileVolumeConfigFileToPaths build() {
                return new ConfigFileVolumeConfigFileToPaths(this);
            } 

        } 

    }
    public static class Volumes extends TeaModel {
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        private java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        @NameInMap("DiskVolumeDiskId")
        private String diskVolumeDiskId;

        @NameInMap("DiskVolumeFsType")
        private String diskVolumeFsType;

        @NameInMap("EmptyDirVolumeMedium")
        private String emptyDirVolumeMedium;

        @NameInMap("EmptyDirVolumeSizeLimit")
        private String emptyDirVolumeSizeLimit;

        @NameInMap("FlexVolumeDriver")
        private String flexVolumeDriver;

        @NameInMap("FlexVolumeFsType")
        private String flexVolumeFsType;

        @NameInMap("FlexVolumeOptions")
        private String flexVolumeOptions;

        @NameInMap("NFSVolumePath")
        private String NFSVolumePath;

        @NameInMap("NFSVolumeReadOnly")
        private Boolean NFSVolumeReadOnly;

        @NameInMap("NFSVolumeServer")
        private String NFSVolumeServer;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private Volumes(Builder builder) {
            this.configFileVolumeConfigFileToPaths = builder.configFileVolumeConfigFileToPaths;
            this.diskVolumeDiskId = builder.diskVolumeDiskId;
            this.diskVolumeFsType = builder.diskVolumeFsType;
            this.emptyDirVolumeMedium = builder.emptyDirVolumeMedium;
            this.emptyDirVolumeSizeLimit = builder.emptyDirVolumeSizeLimit;
            this.flexVolumeDriver = builder.flexVolumeDriver;
            this.flexVolumeFsType = builder.flexVolumeFsType;
            this.flexVolumeOptions = builder.flexVolumeOptions;
            this.NFSVolumePath = builder.NFSVolumePath;
            this.NFSVolumeReadOnly = builder.NFSVolumeReadOnly;
            this.NFSVolumeServer = builder.NFSVolumeServer;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volumes create() {
            return builder().build();
        }

        /**
         * @return configFileVolumeConfigFileToPaths
         */
        public java.util.List < ConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        /**
         * @return diskVolumeDiskId
         */
        public String getDiskVolumeDiskId() {
            return this.diskVolumeDiskId;
        }

        /**
         * @return diskVolumeFsType
         */
        public String getDiskVolumeFsType() {
            return this.diskVolumeFsType;
        }

        /**
         * @return emptyDirVolumeMedium
         */
        public String getEmptyDirVolumeMedium() {
            return this.emptyDirVolumeMedium;
        }

        /**
         * @return emptyDirVolumeSizeLimit
         */
        public String getEmptyDirVolumeSizeLimit() {
            return this.emptyDirVolumeSizeLimit;
        }

        /**
         * @return flexVolumeDriver
         */
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        /**
         * @return flexVolumeFsType
         */
        public String getFlexVolumeFsType() {
            return this.flexVolumeFsType;
        }

        /**
         * @return flexVolumeOptions
         */
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        /**
         * @return NFSVolumePath
         */
        public String getNFSVolumePath() {
            return this.NFSVolumePath;
        }

        /**
         * @return NFSVolumeReadOnly
         */
        public Boolean getNFSVolumeReadOnly() {
            return this.NFSVolumeReadOnly;
        }

        /**
         * @return NFSVolumeServer
         */
        public String getNFSVolumeServer() {
            return this.NFSVolumeServer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths; 
            private String diskVolumeDiskId; 
            private String diskVolumeFsType; 
            private String emptyDirVolumeMedium; 
            private String emptyDirVolumeSizeLimit; 
            private String flexVolumeDriver; 
            private String flexVolumeFsType; 
            private String flexVolumeOptions; 
            private String NFSVolumePath; 
            private Boolean NFSVolumeReadOnly; 
            private String NFSVolumeServer; 
            private String name; 
            private String type; 

            /**
             * ConfigFileVolumeConfigFileToPaths.
             */
            public Builder configFileVolumeConfigFileToPaths(java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
                this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
                return this;
            }

            /**
             * DiskVolumeDiskId.
             */
            public Builder diskVolumeDiskId(String diskVolumeDiskId) {
                this.diskVolumeDiskId = diskVolumeDiskId;
                return this;
            }

            /**
             * DiskVolumeFsType.
             */
            public Builder diskVolumeFsType(String diskVolumeFsType) {
                this.diskVolumeFsType = diskVolumeFsType;
                return this;
            }

            /**
             * EmptyDirVolumeMedium.
             */
            public Builder emptyDirVolumeMedium(String emptyDirVolumeMedium) {
                this.emptyDirVolumeMedium = emptyDirVolumeMedium;
                return this;
            }

            /**
             * EmptyDirVolumeSizeLimit.
             */
            public Builder emptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
                this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
                return this;
            }

            /**
             * FlexVolumeDriver.
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * FlexVolumeFsType.
             */
            public Builder flexVolumeFsType(String flexVolumeFsType) {
                this.flexVolumeFsType = flexVolumeFsType;
                return this;
            }

            /**
             * FlexVolumeOptions.
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * NFSVolumePath.
             */
            public Builder NFSVolumePath(String NFSVolumePath) {
                this.NFSVolumePath = NFSVolumePath;
                return this;
            }

            /**
             * NFSVolumeReadOnly.
             */
            public Builder NFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
                this.NFSVolumeReadOnly = NFSVolumeReadOnly;
                return this;
            }

            /**
             * NFSVolumeServer.
             */
            public Builder NFSVolumeServer(String NFSVolumeServer) {
                this.NFSVolumeServer = NFSVolumeServer;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
    public static class ContainerGroups extends TeaModel {
        @NameInMap("ContainerGroupId")
        private String containerGroupId;

        @NameInMap("ContainerGroupName")
        private String containerGroupName;

        @NameInMap("Containers")
        private java.util.List < Containers> containers;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Discount")
        private Long discount;

        @NameInMap("DnsConfig")
        private DnsConfig dnsConfig;

        @NameInMap("EciSecurityContext")
        private EciSecurityContext eciSecurityContext;

        @NameInMap("EniInstanceId")
        private String eniInstanceId;

        @NameInMap("EphemeralStorage")
        private Long ephemeralStorage;

        @NameInMap("Events")
        private java.util.List < Events> events;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("FailedTime")
        private String failedTime;

        @NameInMap("HostAliases")
        private java.util.List < HostAliases> hostAliases;

        @NameInMap("InitContainers")
        private java.util.List < InitContainers> initContainers;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ipv6Address")
        private String ipv6Address;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RestartPolicy")
        private String restartPolicy;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        private String spotStrategy;

        @NameInMap("Status")
        private String status;

        @NameInMap("SucceededTime")
        private String succeededTime;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TenantEniInstanceId")
        private String tenantEniInstanceId;

        @NameInMap("TenantEniIp")
        private String tenantEniIp;

        @NameInMap("TenantSecurityGroupId")
        private String tenantSecurityGroupId;

        @NameInMap("TenantVSwitchId")
        private String tenantVSwitchId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("Volumes")
        private java.util.List < Volumes> volumes;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ContainerGroups(Builder builder) {
            this.containerGroupId = builder.containerGroupId;
            this.containerGroupName = builder.containerGroupName;
            this.containers = builder.containers;
            this.cpu = builder.cpu;
            this.creationTime = builder.creationTime;
            this.discount = builder.discount;
            this.dnsConfig = builder.dnsConfig;
            this.eciSecurityContext = builder.eciSecurityContext;
            this.eniInstanceId = builder.eniInstanceId;
            this.ephemeralStorage = builder.ephemeralStorage;
            this.events = builder.events;
            this.expiredTime = builder.expiredTime;
            this.failedTime = builder.failedTime;
            this.hostAliases = builder.hostAliases;
            this.initContainers = builder.initContainers;
            this.instanceType = builder.instanceType;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ipv6Address = builder.ipv6Address;
            this.memory = builder.memory;
            this.ramRoleName = builder.ramRoleName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.restartPolicy = builder.restartPolicy;
            this.securityGroupId = builder.securityGroupId;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.spotStrategy = builder.spotStrategy;
            this.status = builder.status;
            this.succeededTime = builder.succeededTime;
            this.tags = builder.tags;
            this.tenantEniInstanceId = builder.tenantEniInstanceId;
            this.tenantEniIp = builder.tenantEniIp;
            this.tenantSecurityGroupId = builder.tenantSecurityGroupId;
            this.tenantVSwitchId = builder.tenantVSwitchId;
            this.vSwitchId = builder.vSwitchId;
            this.volumes = builder.volumes;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerGroups create() {
            return builder().build();
        }

        /**
         * @return containerGroupId
         */
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        /**
         * @return containerGroupName
         */
        public String getContainerGroupName() {
            return this.containerGroupName;
        }

        /**
         * @return containers
         */
        public java.util.List < Containers> getContainers() {
            return this.containers;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return discount
         */
        public Long getDiscount() {
            return this.discount;
        }

        /**
         * @return dnsConfig
         */
        public DnsConfig getDnsConfig() {
            return this.dnsConfig;
        }

        /**
         * @return eciSecurityContext
         */
        public EciSecurityContext getEciSecurityContext() {
            return this.eciSecurityContext;
        }

        /**
         * @return eniInstanceId
         */
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        /**
         * @return ephemeralStorage
         */
        public Long getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        /**
         * @return events
         */
        public java.util.List < Events> getEvents() {
            return this.events;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return failedTime
         */
        public String getFailedTime() {
            return this.failedTime;
        }

        /**
         * @return hostAliases
         */
        public java.util.List < HostAliases> getHostAliases() {
            return this.hostAliases;
        }

        /**
         * @return initContainers
         */
        public java.util.List < InitContainers> getInitContainers() {
            return this.initContainers;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return restartPolicy
         */
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return succeededTime
         */
        public String getSucceededTime() {
            return this.succeededTime;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tenantEniInstanceId
         */
        public String getTenantEniInstanceId() {
            return this.tenantEniInstanceId;
        }

        /**
         * @return tenantEniIp
         */
        public String getTenantEniIp() {
            return this.tenantEniIp;
        }

        /**
         * @return tenantSecurityGroupId
         */
        public String getTenantSecurityGroupId() {
            return this.tenantSecurityGroupId;
        }

        /**
         * @return tenantVSwitchId
         */
        public String getTenantVSwitchId() {
            return this.tenantVSwitchId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return volumes
         */
        public java.util.List < Volumes> getVolumes() {
            return this.volumes;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String containerGroupId; 
            private String containerGroupName; 
            private java.util.List < Containers> containers; 
            private Float cpu; 
            private String creationTime; 
            private Long discount; 
            private DnsConfig dnsConfig; 
            private EciSecurityContext eciSecurityContext; 
            private String eniInstanceId; 
            private Long ephemeralStorage; 
            private java.util.List < Events> events; 
            private String expiredTime; 
            private String failedTime; 
            private java.util.List < HostAliases> hostAliases; 
            private java.util.List < InitContainers> initContainers; 
            private String instanceType; 
            private String internetIp; 
            private String intranetIp; 
            private String ipv6Address; 
            private Float memory; 
            private String ramRoleName; 
            private String regionId; 
            private String resourceGroupId; 
            private String restartPolicy; 
            private String securityGroupId; 
            private Float spotPriceLimit; 
            private String spotStrategy; 
            private String status; 
            private String succeededTime; 
            private java.util.List < Tags> tags; 
            private String tenantEniInstanceId; 
            private String tenantEniIp; 
            private String tenantSecurityGroupId; 
            private String tenantVSwitchId; 
            private String vSwitchId; 
            private java.util.List < Volumes> volumes; 
            private String vpcId; 
            private String zoneId; 

            /**
             * ContainerGroupId.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * ContainerGroupName.
             */
            public Builder containerGroupName(String containerGroupName) {
                this.containerGroupName = containerGroupName;
                return this;
            }

            /**
             * Containers.
             */
            public Builder containers(java.util.List < Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Discount.
             */
            public Builder discount(Long discount) {
                this.discount = discount;
                return this;
            }

            /**
             * DnsConfig.
             */
            public Builder dnsConfig(DnsConfig dnsConfig) {
                this.dnsConfig = dnsConfig;
                return this;
            }

            /**
             * EciSecurityContext.
             */
            public Builder eciSecurityContext(EciSecurityContext eciSecurityContext) {
                this.eciSecurityContext = eciSecurityContext;
                return this;
            }

            /**
             * EniInstanceId.
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * EphemeralStorage.
             */
            public Builder ephemeralStorage(Long ephemeralStorage) {
                this.ephemeralStorage = ephemeralStorage;
                return this;
            }

            /**
             * Events.
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * FailedTime.
             */
            public Builder failedTime(String failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            /**
             * HostAliases.
             */
            public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
                this.hostAliases = hostAliases;
                return this;
            }

            /**
             * InitContainers.
             */
            public Builder initContainers(java.util.List < InitContainers> initContainers) {
                this.initContainers = initContainers;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * RamRoleName.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RestartPolicy.
             */
            public Builder restartPolicy(String restartPolicy) {
                this.restartPolicy = restartPolicy;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SucceededTime.
             */
            public Builder succeededTime(String succeededTime) {
                this.succeededTime = succeededTime;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TenantEniInstanceId.
             */
            public Builder tenantEniInstanceId(String tenantEniInstanceId) {
                this.tenantEniInstanceId = tenantEniInstanceId;
                return this;
            }

            /**
             * TenantEniIp.
             */
            public Builder tenantEniIp(String tenantEniIp) {
                this.tenantEniIp = tenantEniIp;
                return this;
            }

            /**
             * TenantSecurityGroupId.
             */
            public Builder tenantSecurityGroupId(String tenantSecurityGroupId) {
                this.tenantSecurityGroupId = tenantSecurityGroupId;
                return this;
            }

            /**
             * TenantVSwitchId.
             */
            public Builder tenantVSwitchId(String tenantVSwitchId) {
                this.tenantVSwitchId = tenantVSwitchId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * Volumes.
             */
            public Builder volumes(java.util.List < Volumes> volumes) {
                this.volumes = volumes;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ContainerGroups build() {
                return new ContainerGroups(this);
            } 

        } 

    }
    public static class JobInfos extends TeaModel {
        @NameInMap("ArrayProperties")
        private ArrayProperties arrayProperties;

        @NameInMap("ContainerGroups")
        private java.util.List < ContainerGroups> containerGroups;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsArrayJob")
        private Boolean isArrayJob;

        @NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Priority")
        private Long priority;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("SubmitTime")
        private Long submitTime;

        private JobInfos(Builder builder) {
            this.arrayProperties = builder.arrayProperties;
            this.containerGroups = builder.containerGroups;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.isArrayJob = builder.isArrayJob;
            this.lastModifyTime = builder.lastModifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.queue = builder.queue;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfos create() {
            return builder().build();
        }

        /**
         * @return arrayProperties
         */
        public ArrayProperties getArrayProperties() {
            return this.arrayProperties;
        }

        /**
         * @return containerGroups
         */
        public java.util.List < ContainerGroups> getContainerGroups() {
            return this.containerGroups;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isArrayJob
         */
        public Boolean getIsArrayJob() {
            return this.isArrayJob;
        }

        /**
         * @return lastModifyTime
         */
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return submitTime
         */
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private ArrayProperties arrayProperties; 
            private java.util.List < ContainerGroups> containerGroups; 
            private Long endTime; 
            private String id; 
            private Boolean isArrayJob; 
            private Long lastModifyTime; 
            private String name; 
            private String owner; 
            private Long priority; 
            private String queue; 
            private Long startTime; 
            private String state; 
            private Long submitTime; 

            /**
             * ArrayProperties.
             */
            public Builder arrayProperties(ArrayProperties arrayProperties) {
                this.arrayProperties = arrayProperties;
                return this;
            }

            /**
             * ContainerGroups.
             */
            public Builder containerGroups(java.util.List < ContainerGroups> containerGroups) {
                this.containerGroups = containerGroups;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsArrayJob.
             */
            public Builder isArrayJob(Boolean isArrayJob) {
                this.isArrayJob = isArrayJob;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(Long submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public JobInfos build() {
                return new JobInfos(this);
            } 

        } 

    }
}
