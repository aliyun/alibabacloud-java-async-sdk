// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupsResponseBody</p>
 */
public class DescribeContainerGroupsResponseBody extends TeaModel {
    @NameInMap("ContainerGroups")
    private java.util.List < ContainerGroups> containerGroups;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeContainerGroupsResponseBody(Builder builder) {
        this.containerGroups = builder.containerGroups;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerGroups
     */
    public java.util.List < ContainerGroups> getContainerGroups() {
        return this.containerGroups;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < ContainerGroups> containerGroups; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the elastic container instances.
         */
        public Builder containerGroups(java.util.List < ContainerGroups> containerGroups) {
            this.containerGroups = containerGroups;
            return this;
        }

        /**
         * The token that determines the start point of the query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request. The value is unique.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of queried instances.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeContainerGroupsResponseBody build() {
            return new DescribeContainerGroupsResponseBody(this);
        } 

    } 

    public static class CurrentState extends TeaModel {
        @NameInMap("DetailStatus")
        private String detailStatus;

        @NameInMap("ExitCode")
        private Integer exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Integer signal;

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
        public Integer getExitCode() {
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
        public Integer getSignal() {
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
            private Integer exitCode; 
            private String finishTime; 
            private String message; 
            private String reason; 
            private Integer signal; 
            private String startTime; 
            private String state; 

            /**
             * The details of the container status.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * The exit code of the container.
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The time when the container stopped running.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The message about the container status.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The reason why the container is in this state.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The code of the container status.
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * The time when the container started to run.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The container status. Valid values:
             * <p>
             * 
             * *   Waiting
             * *   Running
             * *   Terminated
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
             * The path of the field.
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
             * The specified field.
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
             * The name of the environment variable.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The source of the environment variable value. This parameter has a value only when the Value parameter is not empty.
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
        private Integer port;

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
        public Integer getPort() {
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
            private Integer port; 
            private String scheme; 

            /**
             * The path to which the system sends an HTTP GET request for a health check.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The port to which the system sends an HTTP GET request for a health check.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type supported by the method. Valid values: HTTP and HTTPS.
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
        private Integer port;

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
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private Integer port; 

            /**
             * The hostname.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The port number.
             */
            public Builder port(Integer port) {
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
        private Integer failureThreshold;

        @NameInMap("HttpGet")
        private HttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @NameInMap("TcpSocket")
        private TcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

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
        public Integer getFailureThreshold() {
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
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return successThreshold
         */
        public Integer getSuccessThreshold() {
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
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private java.util.List < String > execs; 
            private Integer failureThreshold; 
            private HttpGet httpGet; 
            private Integer initialDelaySeconds; 
            private Integer periodSeconds; 
            private Integer successThreshold; 
            private TcpSocket tcpSocket; 
            private Integer timeoutSeconds; 

            /**
             * The commands that are used to check the containers.
             */
            public Builder execs(java.util.List < String > execs) {
                this.execs = execs;
                return this;
            }

            /**
             * The minimum number of consecutive failures that must occur for the check to be considered failed. Default value: 3.
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * The HTTP GET method used to check the container.
             */
            public Builder httpGet(HttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * The number of seconds between the time when the startup of the container ends and the time when the probe starts.
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * The interval at which the health check is performed. Unit: seconds. Default value: 10. Minimum value: 1.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. Set the value to 1.
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * The TCP socket method that is used to check the container.
             */
            public Builder tcpSocket(TcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * The timeout period of the check. Default value: 1. Minimum value: 1. Unit: seconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
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
        private Integer port;

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
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * The port number. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type.
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
        private Integer exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Integer signal;

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
        public Integer getExitCode() {
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
        public Integer getSignal() {
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
            private Integer exitCode; 
            private String finishTime; 
            private String message; 
            private String reason; 
            private Integer signal; 
            private String startTime; 
            private String state; 

            /**
             * The details of the container status.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * The exit code of the container.
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The time when the container stopped running.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The message about the container status.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The reason why the container is in this state.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The code of the container status.
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * The time when the container started to run.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The container status. Valid values:
             * <p>
             * 
             * *   Waiting: The container is being started.
             * *   Running: The container is running.
             * *   Terminated: The container stops running.
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
        private Integer port;

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
        public Integer getPort() {
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
            private Integer port; 
            private String scheme; 

            /**
             * The path to which the system sends an HTTP GET request for a health check.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The port to which the system sends an HTTP GET request for a health check.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type supported by the method. Valid values: HTTP and HTTPS.
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
        private Integer port;

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
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private Integer port; 

            /**
             * The hostname.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The port number.
             */
            public Builder port(Integer port) {
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
        private Integer failureThreshold;

        @NameInMap("HttpGet")
        private ReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @NameInMap("TcpSocket")
        private ReadinessProbeTcpSocket tcpSocket;

        @NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

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
        public Integer getFailureThreshold() {
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
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return successThreshold
         */
        public Integer getSuccessThreshold() {
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
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private java.util.List < String > execs; 
            private Integer failureThreshold; 
            private ReadinessProbeHttpGet httpGet; 
            private Integer initialDelaySeconds; 
            private Integer periodSeconds; 
            private Integer successThreshold; 
            private ReadinessProbeTcpSocket tcpSocket; 
            private Integer timeoutSeconds; 

            /**
             * The commands that are run in the container when you use a CLI to perform health checks.
             */
            public Builder execs(java.util.List < String > execs) {
                this.execs = execs;
                return this;
            }

            /**
             * The minimum number of consecutive failures that must occur for the check to be considered failed. Default value: 3.
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * The HTTP GET method that is used to check the container.
             */
            public Builder httpGet(ReadinessProbeHttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * The number of seconds between the time when the startup of the container ends and the time when the probe starts.
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * The interval at which the health check is performed. Unit: seconds. Default value: 10. Minimum value: 1.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. Set the value to 1.
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * The TCP socket method that is used to check the container.
             */
            public Builder tcpSocket(ReadinessProbeTcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * The timeout period of the check. Default value: 1. Minimum value: 1. Unit: seconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
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
             * The permissions specific to the processes in the container.
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
             * The permissions specific to the processes in the container.
             */
            public Builder capability(Capability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * Indicates whether permissions on the root file system are read-only.
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * The user ID (UID) that is used to run the container.
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
             * The directory of the volume that is mounted to the container. The data in this directory is overwritten by the data on the volume.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: The volume mount does not receive subsequent mounts that are performed on the volume or on the subdirectories of the volume.
             * *   HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.
             * *   Bidirectional: The volume mount behaves the same as the HostToContainer mount. The volume mount receives subsequent mounts that are performed on the volume or on the subdirectories of the volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The volume name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the volume is read-only.
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * The subdirectory of the volume. You can use this parameter to mount the same volume to different subdirectories of the container.
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
             * The arguments that are passed to the startup commands of the container.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * The startup commands of the container.
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * The number of vCPUs that are allocated to the container.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The current container status.
             */
            public Builder currentState(CurrentState currentState) {
                this.currentState = currentState;
                return this;
            }

            /**
             * The environment variables of the container.
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * The number of GPUs.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The image in the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The image pulling policy. Valid values:
             * <p>
             * 
             * *   Always: Each time the instance is updated, image pulling is performed.
             * *   IfNotPresent: On-premises images are used first. If no on-premises images are available, image pulling is performed.
             * *   Never: On-premises images are always used. Image pulling is not performed.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The liveness probe of the container.
             */
            public Builder livenessProbe(LivenessProbe livenessProbe) {
                this.livenessProbe = livenessProbe;
                return this;
            }

            /**
             * The memory size of the container. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The exposed ports and protocols of the container.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The previous status of the container.
             */
            public Builder previousState(PreviousState previousState) {
                this.previousState = previousState;
                return this;
            }

            /**
             * The readiness probe that is used to check whether the container is ready to serve a request.
             */
            public Builder readinessProbe(ReadinessProbe readinessProbe) {
                this.readinessProbe = readinessProbe;
                return this;
            }

            /**
             * Indicates whether the container passed the readiness probe.
             */
            public Builder ready(Boolean ready) {
                this.ready = ready;
                return this;
            }

            /**
             * The number of times that the container restarted.
             */
            public Builder restartCount(Integer restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            /**
             * The security context of the elastic container instance.
             */
            public Builder securityContext(SecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * Indicates whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * Indicates whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected among multiple sessions. If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container restarts.
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * Indicates whether interaction is enabled. Default value: false. If the value of the Command parameter is `/bin/bash`, the value of this parameter is true.
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * Information about the mounted volumes.
             */
            public Builder volumeMounts(java.util.List < VolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * The working directory of the container.
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
             * The variable name of the option.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The variable value of the option.
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
             * The IP addresses of DNS servers.
             */
            public Builder nameServers(java.util.List < String > nameServers) {
                this.nameServers = nameServers;
                return this;
            }

            /**
             * The options. Each option is a name-value pair. The value in the name-value pair is optional.
             */
            public Builder options(java.util.List < Options> options) {
                this.options = options;
                return this;
            }

            /**
             * The search domain of the DNS server.
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
             * The name of the Sysctl parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the Sysctl parameter.
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
             * sysctl parameters.
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
             * The number of the events.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The start time of the event.
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * The end time of the event.
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * The event message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The category to which the event belongs.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The event name.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The type of the event. Valid values:
             * <p>
             * 
             * *   Normal
             * *   Warning
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
             * The information about the hosts.
             */
            public Builder hostnames(java.util.List < String > hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * The IP address of the instance.
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
        private Integer exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Integer signal;

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
        public Integer getExitCode() {
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
        public Integer getSignal() {
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
            private Integer exitCode; 
            private String finishTime; 
            private String message; 
            private String reason; 
            private Integer signal; 
            private String startTime; 
            private String state; 

            /**
             * The details of the container status.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * The exit code of the container.
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The time when the container stopped running.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The event message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The reason why the container is in this state.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The code of the container status.
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * The time when the container started to run.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The container status. Valid values:
             * <p>
             * 
             * *   Waiting
             * *   Running
             * *   Terminated
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
             * The path of the field. Only `status.podIP` is supported.
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
             * The specified fields.
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
             * The name of the environment variable.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The source of the environment variable value. This parameter has a value only when the Value parameter is not empty.
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
        private Integer port;

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
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * The port number. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type.
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
        private Integer exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Integer signal;

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
        public Integer getExitCode() {
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
        public Integer getSignal() {
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
            private Integer exitCode; 
            private String finishTime; 
            private String message; 
            private String reason; 
            private Integer signal; 
            private String startTime; 
            private String state; 

            /**
             * The details of the container status.
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * The exit code of the container.
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The time when the container stopped running.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The message about the container status.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The reason why the container is in this state.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The code of the container status.
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * The time when the container started to run.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The container status. Valid values: Waiting, Running, and Terminated.
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
             * The permissions specific to the processes in the container.
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
             * The permissions specific to the processes in the container.
             */
            public Builder capability(SecurityContextCapability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * Indicates whether permissions on the root file system are read-only.
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * The UID this is used to run the entry point of the container process.
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
             * The directory of the volume that is mounted to the container. The data in this directory is overwritten by the data on the volume.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * The mount propagation settings of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:
             * <p>
             * 
             * *   None: The volume mount does not receive subsequent mounts that are performed on the volume or on the subdirectories of the volume.
             * *   HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or the subdirectories of this volume.
             * *   Bidirectional: The volume mount behaves the same as the HostToContainer mount. The volume mount receives subsequent mounts that are performed on the volume or on the subdirectories of the volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * The name of the volume. The value of this parameter is the same as the name of the volume that you selected when you purchased the container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Default value: false.
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
        private Float cpu;

        @NameInMap("CurrentState")
        private InitContainersCurrentState currentState;

        @NameInMap("EnvironmentVars")
        private java.util.List < InitContainersEnvironmentVars> environmentVars;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        private String image;

        @NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @NameInMap("Memory")
        private Float memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ports")
        private java.util.List < InitContainersPorts> ports;

        @NameInMap("PreviousState")
        private InitContainersPreviousState previousState;

        @NameInMap("Ready")
        private Boolean ready;

        @NameInMap("RestartCount")
        private Integer restartCount;

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
        public Float getCpu() {
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
        public Integer getRestartCount() {
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
            private Float cpu; 
            private InitContainersCurrentState currentState; 
            private java.util.List < InitContainersEnvironmentVars> environmentVars; 
            private Integer gpu; 
            private String image; 
            private String imagePullPolicy; 
            private Float memory; 
            private String name; 
            private java.util.List < InitContainersPorts> ports; 
            private InitContainersPreviousState previousState; 
            private Boolean ready; 
            private Integer restartCount; 
            private InitContainersSecurityContext securityContext; 
            private java.util.List < InitContainersVolumeMounts> volumeMounts; 
            private String workingDir; 

            /**
             * The arguments that are passed to the startup commands of the container.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * The startup commands of the containers.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * The number of vCPUs that are allocated to the container.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The current container status.
             */
            public Builder currentState(InitContainersCurrentState currentState) {
                this.currentState = currentState;
                return this;
            }

            /**
             * The environment variables of the container.
             */
            public Builder environmentVars(java.util.List < InitContainersEnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * The number of GPUs.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The image pulling policy. Valid values:
             * <p>
             * 
             * *   Always: Each time the instance is updated, image pulling is performed.
             * *   IfNotPresent: On-premises images are used first. If no on-premises images are available, image pulling is performed.
             * *   Never: On-premises images are always used. Image pulling is not performed.
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * The memory size of the init container. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the init container.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The exposed ports and protocols of the container.
             */
            public Builder ports(java.util.List < InitContainersPorts> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The previous state of the container.
             */
            public Builder previousState(InitContainersPreviousState previousState) {
                this.previousState = previousState;
                return this;
            }

            /**
             * Indicates whether the container passed the readiness probe.
             */
            public Builder ready(Boolean ready) {
                this.ready = ready;
                return this;
            }

            /**
             * The number of times the container restarted.
             */
            public Builder restartCount(Integer restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            /**
             * The security context of the container.
             */
            public Builder securityContext(InitContainersSecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * The information about the volumes that are mounted to the init container.
             */
            public Builder volumeMounts(java.util.List < InitContainersVolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * The working directory of the container.
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
             * The content of the ConfigFile volume. Maximum size: 32 KB.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The relative path of the ConfigFile volume.
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
             * The path of the ConfigFile volume.
             */
            public Builder configFileVolumeConfigFileToPaths(java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
                this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
                return this;
            }

            /**
             * The ID of the disk when you set the Type parameter to DiskVolume.
             */
            public Builder diskVolumeDiskId(String diskVolumeDiskId) {
                this.diskVolumeDiskId = diskVolumeDiskId;
                return this;
            }

            /**
             * The file system type of the disk volume.
             */
            public Builder diskVolumeFsType(String diskVolumeFsType) {
                this.diskVolumeFsType = diskVolumeFsType;
                return this;
            }

            /**
             * The storage media for the emptyDir volume. This parameter is empty by default, indicating that the node file system is used as the storage media. Valid values:
             * <p>
             * 
             * *   Memory: Memory is used as the storage media.
             * *   LocalRaid0: Local disks are formed into RAID 0. This value is valid only if an elastic container instance that has local disks mounted is created. For more information, see [Create an elastic container instance that has local disks mounted](~~114664~~).
             */
            public Builder emptyDirVolumeMedium(String emptyDirVolumeMedium) {
                this.emptyDirVolumeMedium = emptyDirVolumeMedium;
                return this;
            }

            /**
             * The storage size of the emptyDir volume.
             */
            public Builder emptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
                this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
                return this;
            }

            /**
             * The name of the driver when you set the Type parameter to FlexVolume.
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * The file system type when you set the Type parameter to FlexVolume. The default value varies based on the script of the FlexVolume plug-in.
             */
            public Builder flexVolumeFsType(String flexVolumeFsType) {
                this.flexVolumeFsType = flexVolumeFsType;
                return this;
            }

            /**
             * The options when you set the Type parameter to FlexVolume.
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * The path of the NFS volume.
             */
            public Builder NFSVolumePath(String NFSVolumePath) {
                this.NFSVolumePath = NFSVolumePath;
                return this;
            }

            /**
             * Indicates whether the NFS volume is read-only.
             */
            public Builder NFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
                this.NFSVolumeReadOnly = NFSVolumeReadOnly;
                return this;
            }

            /**
             * The endpoint of the server when you set the Type parameter to NFSVolume.
             */
            public Builder NFSVolumeServer(String NFSVolumeServer) {
                this.NFSVolumeServer = NFSVolumeServer;
                return this;
            }

            /**
             * The volume name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the volume. Valid values:
             * <p>
             * 
             * *   EmptyDirVolume
             * *   NFSVolume
             * *   ConfigFileVolume
             * *   FlexVolume
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
        @NameInMap("ComputeCategory")
        private String computeCategory;

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
        private Integer discount;

        @NameInMap("DnsConfig")
        private DnsConfig dnsConfig;

        @NameInMap("EciSecurityContext")
        private EciSecurityContext eciSecurityContext;

        @NameInMap("EniInstanceId")
        private String eniInstanceId;

        @NameInMap("EphemeralStorage")
        private Integer ephemeralStorage;

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
        private Double spotPriceLimit;

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
            this.computeCategory = builder.computeCategory;
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
         * @return computeCategory
         */
        public String getComputeCategory() {
            return this.computeCategory;
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
        public Integer getDiscount() {
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
        public Integer getEphemeralStorage() {
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
        public Double getSpotPriceLimit() {
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
            private String computeCategory; 
            private String containerGroupId; 
            private String containerGroupName; 
            private java.util.List < Containers> containers; 
            private Float cpu; 
            private String creationTime; 
            private Integer discount; 
            private DnsConfig dnsConfig; 
            private EciSecurityContext eciSecurityContext; 
            private String eniInstanceId; 
            private Integer ephemeralStorage; 
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
            private Double spotPriceLimit; 
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
             * The computing power type of the elastic container instance. A value of economy indicates economic instances.
             */
            public Builder computeCategory(String computeCategory) {
                this.computeCategory = computeCategory;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder containerGroupName(String containerGroupName) {
                this.containerGroupName = containerGroupName;
                return this;
            }

            /**
             * The information about containers in the elastic container instance.
             */
            public Builder containers(java.util.List < Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * The number of vCPUs that are allocated to the elastic container instance.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the system created the elastic container instance after the system received the request. The time follows the RFC 3339 standard. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The discount.
             */
            public Builder discount(Integer discount) {
                this.discount = discount;
                return this;
            }

            /**
             * The Domain Name System (DNS) settings.
             */
            public Builder dnsConfig(DnsConfig dnsConfig) {
                this.dnsConfig = dnsConfig;
                return this;
            }

            /**
             * The security context of the elastic container instance.
             */
            public Builder eciSecurityContext(EciSecurityContext eciSecurityContext) {
                this.eciSecurityContext = eciSecurityContext;
                return this;
            }

            /**
             * The ID of the elastic network interface (ENI).
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * The size of the temporary storage space. Unit: GiB.
             */
            public Builder ephemeralStorage(Integer ephemeralStorage) {
                this.ephemeralStorage = ephemeralStorage;
                return this;
            }

            /**
             * The events of the elastic container instance. A maximum of 50 events can be returned.
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * The time when the elastic container instance failed to run due to overdue payments. The time follows the RFC 3339 standard. The time is displayed in UTC.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The time when the instance failed to run. The time follows the RFC 3339 standard. The time is displayed in UTC.
             */
            public Builder failedTime(String failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            /**
             * The hostnames and IP addresses for a container that are added to the hosts file of the elastic container instance.
             */
            public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
                this.hostAliases = hostAliases;
                return this;
            }

            /**
             * The information about the init containers.
             */
            public Builder initContainers(java.util.List < InitContainers> initContainers) {
                this.initContainers = initContainers;
                return this;
            }

            /**
             * The instance type of the specified Elastic Compute Service (ECS) instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The IPv6 address of the instance.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * The memory size of the instance. Unit: GiB.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the instance RAM role. The elastic container instance and the ECS instance share a RAM role. For more information, see [Use an instance RAM role by calling API operations](~~61178~~).
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The restart policy of the elastic container instance. Valid values:
             * <p>
             * 
             * *   Never: Never restarts the instance if a container in the instance exits.
             * *   Always: Always restarts the instance if a container in the instance exits.
             * *   OnFailure: Restarts the instance only if a container in the instance exists upon failure with a status code of non-zero.
             */
            public Builder restartPolicy(String restartPolicy) {
                this.restartPolicy = restartPolicy;
                return this;
            }

            /**
             * The security group ID.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The maximum hourly price for the preemptible elastic container instance.
             * <p>
             * 
             * This parameter is returned only when SpotStrategy is set to SpotWithPriceLimit.
             */
            public Builder spotPriceLimit(Double spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The bid policy for the instance. Default value: NoSpot. Valid values:
             * <p>
             * 
             * *   NoSpot: The instance is a regular pay-as-you-go instance.
             * *   SpotWithPriceLimit: The instance is a preemptible instance that has a maximum price.
             * *   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * The state of the instance. Valid values:
             * <p>
             * 
             * *   Pending: The instance is being started.
             * *   Running: The instance is running.
             * *   Succeeded: The instance successfully runs.
             * *   Failed: The instance fails to run.
             * *   Scheduling: The instance is being created.
             * *   ScheduleFailed: The instance fails to be created.
             * *   Restarting: The instance is being restarted.
             * *   Updating: The instance is being updated.
             * *   Terminating: The instance is being terminated.
             * *   Expired: The instance is expired.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when all containers exited on success. The time follows the RFC 3339 standard. The time is displayed in UTC.
             */
            public Builder succeededTime(String succeededTime) {
                this.succeededTime = succeededTime;
                return this;
            }

            /**
             * The tags of the instance.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * This parameter is not publicly available.
             */
            public Builder tenantEniInstanceId(String tenantEniInstanceId) {
                this.tenantEniInstanceId = tenantEniInstanceId;
                return this;
            }

            /**
             * This parameter is not publicly available.
             */
            public Builder tenantEniIp(String tenantEniIp) {
                this.tenantEniIp = tenantEniIp;
                return this;
            }

            /**
             * This parameter is not publicly available.
             */
            public Builder tenantSecurityGroupId(String tenantSecurityGroupId) {
                this.tenantSecurityGroupId = tenantSecurityGroupId;
                return this;
            }

            /**
             * This parameter is not publicly available.
             */
            public Builder tenantVSwitchId(String tenantVSwitchId) {
                this.tenantVSwitchId = tenantVSwitchId;
                return this;
            }

            /**
             * The ID of the vSwitch to which the instance is connected.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * Information about the volumes.
             */
            public Builder volumes(java.util.List < Volumes> volumes) {
                this.volumes = volumes;
                return this;
            }

            /**
             * The ID of the VPC to which the instance belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone to which the instance belongs.
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
}
