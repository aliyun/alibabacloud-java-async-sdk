// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupsResponseBody</p>
 */
public class DescribeContainerGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerGroups")
    private java.util.List < ContainerGroups> containerGroups;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Details about the queried elastic container instances.</p>
         */
        public Builder containerGroups(java.util.List < ContainerGroups> containerGroups) {
            this.containerGroups = containerGroups;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request. The value is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>89945DD3-9072-47D0-A318-353284CFC7B3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of queried instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeContainerGroupsResponseBody build() {
            return new DescribeContainerGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class CurrentState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailStatus")
        private String detailStatus;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Integer exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Signal")
        private Integer signal;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>The details of the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>working</p>
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * <p>The exit code of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the container stopped running.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The message about the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>Back-off 5m0s restarting failed container=test pod=test_eci-xxx(xxx)</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason why the container is in this status.</p>
             * 
             * <strong>example:</strong>
             * <p>Started</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The code of the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * <p>The time when the container started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-19T12:05:02Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The container status. Valid values:</p>
             * <ul>
             * <li>Waiting</li>
             * <li>Running</li>
             * <li>Terminated</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Terminated</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class FieldRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldPath")
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
             * <p>The path of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>status.podIP</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class ValueFrom extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRef")
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
             * <p>The specified field.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class EnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueFrom")
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
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The source of the environment variable value. This parameter has a value only when the Value parameter is left empty.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class HttpGet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Scheme")
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
             * <p>The path to which the system sends an HTTP GET request for a health check.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/nginx/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port to which the system sends an HTTP GET request for a health check.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type supported by the method. Valid values: HTTP and HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class TcpSocket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
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
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.3.4</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class LivenessProbe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Execs")
        private java.util.List < String > execs;

        @com.aliyun.core.annotation.NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @com.aliyun.core.annotation.NameInMap("HttpGet")
        private HttpGet httpGet;

        @com.aliyun.core.annotation.NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @com.aliyun.core.annotation.NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @com.aliyun.core.annotation.NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @com.aliyun.core.annotation.NameInMap("TcpSocket")
        private TcpSocket tcpSocket;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
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
             * <p>The commands that are used to check the containers.</p>
             */
            public Builder execs(java.util.List < String > execs) {
                this.execs = execs;
                return this;
            }

            /**
             * <p>The minimum number of consecutive failures that must occur for the check to be considered failed. Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * <p>The HTTP GET method that is used to check the container.</p>
             */
            public Builder httpGet(HttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * <p>The number of seconds between the time when the startup of the container ends and the time when the probe starts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * <p>The interval at which the health check is performed. Default value: 10. Minimum value: 1. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * <p>The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. The value must be 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * <p>The TCP socket method that is used to check the container.</p>
             */
            public Builder tcpSocket(TcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * <p>The timeout period of the check. Default value: 1. Minimum value: 1. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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
             * <p>The port number. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class PreviousState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailStatus")
        private String detailStatus;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Integer exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Signal")
        private Integer signal;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>The details of the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>working</p>
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * <p>The exit code of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the container stopped running.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The message about the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>Back-off 5m0s restarting failed container=test pod=test_eci-xxx(xxx)</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason why the container is in this status.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The code of the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * <p>The time when the container started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The container status. Valid values:</p>
             * <ul>
             * <li>Waiting: The container is being started.</li>
             * <li>Running: The container is running.</li>
             * <li>Terminated: The container stops running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Terminated</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class ReadinessProbeHttpGet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Scheme")
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
             * <p>The path to which the system sends an HTTP GET request for a health check.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The port to which the system sends an HTTP GET request for a health check.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type supported by the method. Valid values: HTTP and HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class ReadinessProbeTcpSocket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
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
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.3.4</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8888</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class ReadinessProbe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Execs")
        private java.util.List < String > execs;

        @com.aliyun.core.annotation.NameInMap("FailureThreshold")
        private Integer failureThreshold;

        @com.aliyun.core.annotation.NameInMap("HttpGet")
        private ReadinessProbeHttpGet httpGet;

        @com.aliyun.core.annotation.NameInMap("InitialDelaySeconds")
        private Integer initialDelaySeconds;

        @com.aliyun.core.annotation.NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @com.aliyun.core.annotation.NameInMap("SuccessThreshold")
        private Integer successThreshold;

        @com.aliyun.core.annotation.NameInMap("TcpSocket")
        private ReadinessProbeTcpSocket tcpSocket;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
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
             * <p>The commands that are run in the container when you use a CLI to perform health checks.</p>
             */
            public Builder execs(java.util.List < String > execs) {
                this.execs = execs;
                return this;
            }

            /**
             * <p>The minimum number of consecutive failures that must occur for the check to be considered failed. Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder failureThreshold(Integer failureThreshold) {
                this.failureThreshold = failureThreshold;
                return this;
            }

            /**
             * <p>The HTTP GET method that is used to check the container.</p>
             */
            public Builder httpGet(ReadinessProbeHttpGet httpGet) {
                this.httpGet = httpGet;
                return this;
            }

            /**
             * <p>The number of seconds between the time when the startup of the container ends and the time when the probe starts.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder initialDelaySeconds(Integer initialDelaySeconds) {
                this.initialDelaySeconds = initialDelaySeconds;
                return this;
            }

            /**
             * <p>The interval at which the health check is performed. Default value: 10. Minimum value: 1. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * <p>The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. The value must be 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successThreshold(Integer successThreshold) {
                this.successThreshold = successThreshold;
                return this;
            }

            /**
             * <p>The TCP socket method that is used to check the container.</p>
             */
            public Builder tcpSocket(ReadinessProbeTcpSocket tcpSocket) {
                this.tcpSocket = tcpSocket;
                return this;
            }

            /**
             * <p>The timeout period of the check. Default value: 1. Minimum value: 1. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class Capability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adds")
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
             * <p>The permissions specific to the process in the container.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class SecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capability")
        private Capability capability;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @com.aliyun.core.annotation.NameInMap("RunAsUser")
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
             * <p>The permissions specific to the processes in the container.</p>
             */
            public Builder capability(Capability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * <p>Indicates whether permissions on the root file system are read-only. Valid value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * <p>The user ID (UID) that is used to run the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class VolumeMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("MountPropagation")
        private String mountPropagation;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("SubPath")
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
             * <p>The directory of the volume that is mounted to the container. The data in this directory is overwritten by the data on the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/share/</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount propagation setting of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: The volume mount does not receive subsequent mounts that are performed on this volume or on the subdirectories of this volume.</li>
             * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or on the subdirectories of this volume.</li>
             * <li>Bidirectional: This value is similar to HostToCotainer. The volume mount receives subsequent mounts that are performed on this volume or on the subdirectories of this volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * <p>The volume name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-empty</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the volume is read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The subdirectory of the volume. You can use this parameter to mount the same volume to different subdirectories of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/sub</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List < String > args;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List < String > commands;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("CurrentState")
        private CurrentState currentState;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List < EnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("LivenessProbe")
        private LivenessProbe livenessProbe;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List < Ports> ports;

        @com.aliyun.core.annotation.NameInMap("PreviousState")
        private PreviousState previousState;

        @com.aliyun.core.annotation.NameInMap("ReadinessProbe")
        private ReadinessProbe readinessProbe;

        @com.aliyun.core.annotation.NameInMap("Ready")
        private Boolean ready;

        @com.aliyun.core.annotation.NameInMap("RestartCount")
        private Integer restartCount;

        @com.aliyun.core.annotation.NameInMap("SecurityContext")
        private SecurityContext securityContext;

        @com.aliyun.core.annotation.NameInMap("Stdin")
        private Boolean stdin;

        @com.aliyun.core.annotation.NameInMap("StdinOnce")
        private Boolean stdinOnce;

        @com.aliyun.core.annotation.NameInMap("Tty")
        private Boolean tty;

        @com.aliyun.core.annotation.NameInMap("VolumeMounts")
        private java.util.List < VolumeMounts> volumeMounts;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
             * <p>The arguments that are passed to the startup commands of the container.</p>
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup commands of the container.</p>
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            /**
             * <p>The number of vCPUs that are allocated to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The current container status.</p>
             */
            public Builder currentState(CurrentState currentState) {
                this.currentState = currentState;
                return this;
            }

            /**
             * <p>The environment variables of the container.</p>
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The image in the container.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image pulling policy. Valid values:</p>
             * <ul>
             * <li>Always: Each time the instance is updated, image pulling is performed.</li>
             * <li>IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
             * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * <p>The liveness probe of the container.</p>
             */
            public Builder livenessProbe(LivenessProbe livenessProbe) {
                this.livenessProbe = livenessProbe;
                return this;
            }

            /**
             * <p>The memory size of the container. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The exposed port and protocol of the container.</p>
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The previous state of the container.</p>
             */
            public Builder previousState(PreviousState previousState) {
                this.previousState = previousState;
                return this;
            }

            /**
             * <p>The readiness probe that is used to check whether the container is ready to serve a request.</p>
             */
            public Builder readinessProbe(ReadinessProbe readinessProbe) {
                this.readinessProbe = readinessProbe;
                return this;
            }

            /**
             * <p>Indicates whether the container passed the readiness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ready(Boolean ready) {
                this.ready = ready;
                return this;
            }

            /**
             * <p>The number of times that the container restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder restartCount(Integer restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            /**
             * <p>The security context of the elastic container instance.</p>
             */
            public Builder securityContext(SecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * <p>Indicates whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder stdin(Boolean stdin) {
                this.stdin = stdin;
                return this;
            }

            /**
             * <p>Indicates whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected among multiple sessions. If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container restarts.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder stdinOnce(Boolean stdinOnce) {
                this.stdinOnce = stdinOnce;
                return this;
            }

            /**
             * <p>Indicates whether interaction is enabled. Default value: false. If the value of the Command parameter is <code>/bin/bash</code>, the value of this parameter is true.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder tty(Boolean tty) {
                this.tty = tty;
                return this;
            }

            /**
             * <p>Information about the mounted volumes.</p>
             */
            public Builder volumeMounts(java.util.List < VolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * <p>The working directory of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/nginx</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The variable name of the option.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The variable value of the option.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class DnsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameServers")
        private java.util.List < String > nameServers;

        @com.aliyun.core.annotation.NameInMap("Options")
        private java.util.List < Options> options;

        @com.aliyun.core.annotation.NameInMap("Searches")
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
             * <p>The IP addresses of DNS servers.</p>
             */
            public Builder nameServers(java.util.List < String > nameServers) {
                this.nameServers = nameServers;
                return this;
            }

            /**
             * <p>The options. Each option is a name-value pair. The value in the name-value pair is optional.</p>
             */
            public Builder options(java.util.List < Options> options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The search domains of DNS servers.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class Sysctls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The name of the Sysctl parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel.msgmax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the Sysctl parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>65536</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class EciSecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sysctls")
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
             * <p>sysctl parameters.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FirstTimestamp")
        private String firstTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private String lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The number of the events.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The start time of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * <p>The end time of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The event message.</p>
             * 
             * <strong>example:</strong>
             * <p>Started container</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The category to which the event belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test-xxx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The type of the event. Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * <li>Warning</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class HostAliases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hostnames")
        private java.util.List < String > hostnames;

        @com.aliyun.core.annotation.NameInMap("Ip")
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
             * <p>The information about the hosts.</p>
             */
            public Builder hostnames(java.util.List < String > hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class InitContainersCurrentState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailStatus")
        private String detailStatus;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Integer exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Signal")
        private Integer signal;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>The details of the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>working</p>
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * <p>The exit code of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the container stopped running.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The event message.</p>
             * 
             * <strong>example:</strong>
             * <p>Created container</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason why the container is in this status.</p>
             * 
             * <strong>example:</strong>
             * <p>Started</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The code of the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * <p>The time when the container started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The container status. Valid values:</p>
             * <ul>
             * <li>Waiting</li>
             * <li>Running</li>
             * <li>Terminated</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class ValueFromFieldRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldPath")
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
             * <p>The path of the field. Only <code>status.podIP</code> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>status.podIP</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class EnvironmentVarsValueFrom extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldRef")
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
             * <p>The specified fields.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class InitContainersEnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueFrom")
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
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/bin</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The source of the environment variable value. This parameter has a value only when the Value parameter is left empty.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class InitContainersPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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
             * <p>The port number. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>8888</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class InitContainersPreviousState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailStatus")
        private String detailStatus;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Integer exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Signal")
        private Integer signal;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>The details of the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>working</p>
             */
            public Builder detailStatus(String detailStatus) {
                this.detailStatus = detailStatus;
                return this;
            }

            /**
             * <p>The exit code of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the container stopped running.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-24T05:35:44Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The message about the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>Started container</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason why the container is in this status.</p>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The code of the container status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * <p>The time when the container started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-24T05:35:44Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The container status. Valid values: Waiting, Running, and Terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>Terminated</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class SecurityContextCapability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adds")
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
             * <p>The permissions specific to the processes in the container.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class InitContainersSecurityContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capability")
        private SecurityContextCapability capability;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyRootFilesystem")
        private Boolean readOnlyRootFilesystem;

        @com.aliyun.core.annotation.NameInMap("RunAsUser")
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
             * <p>The permissions specific to the processes in the container.</p>
             */
            public Builder capability(SecurityContextCapability capability) {
                this.capability = capability;
                return this;
            }

            /**
             * <p>Indicates whether permissions on the root file system are read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
                this.readOnlyRootFilesystem = readOnlyRootFilesystem;
                return this;
            }

            /**
             * <p>The UID that is used to run the entry point of the container process.</p>
             * 
             * <strong>example:</strong>
             * <p>1557</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class InitContainersVolumeMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("MountPropagation")
        private String mountPropagation;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
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
             * <p>The directory of the volume that is mounted to the container. The data in this directory is overwritten by the data on the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/share/</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount propagation setting of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
             * <ul>
             * <li>None: The volume mount does not receive subsequent mounts that are performed on this volume or on the subdirectories of this volume.</li>
             * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or on the subdirectories of this volume.</li>
             * <li>Bidirectional: This value is similar to HostToCotainer. The volume mount receives subsequent mounts that are performed on this volume or on the subdirectories of this volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder mountPropagation(String mountPropagation) {
                this.mountPropagation = mountPropagation;
                return this;
            }

            /**
             * <p>The name of the volume. The value of this parameter is the same as the name of the volume that you selected when you purchased the container.</p>
             * 
             * <strong>example:</strong>
             * <p>test-empty</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the volume is read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class InitContainers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List < String > args;

        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List < String > command;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("CurrentState")
        private InitContainersCurrentState currentState;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List < InitContainersEnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImagePullPolicy")
        private String imagePullPolicy;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List < InitContainersPorts> ports;

        @com.aliyun.core.annotation.NameInMap("PreviousState")
        private InitContainersPreviousState previousState;

        @com.aliyun.core.annotation.NameInMap("Ready")
        private Boolean ready;

        @com.aliyun.core.annotation.NameInMap("RestartCount")
        private Integer restartCount;

        @com.aliyun.core.annotation.NameInMap("SecurityContext")
        private InitContainersSecurityContext securityContext;

        @com.aliyun.core.annotation.NameInMap("VolumeMounts")
        private java.util.List < InitContainersVolumeMounts> volumeMounts;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
             * <p>The arguments that are passed to the startup commands of the container.</p>
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The startup commands of the containers.</p>
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The number of vCPUs that are allocated to the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The current container status.</p>
             */
            public Builder currentState(InitContainersCurrentState currentState) {
                this.currentState = currentState;
                return this;
            }

            /**
             * <p>The environment variables of the init container.</p>
             */
            public Builder environmentVars(java.util.List < InitContainersEnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The image of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image pulling policy. Valid values:</p>
             * <ul>
             * <li>Always: Each time the instance is updated, image pulling is performed.</li>
             * <li>IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
             * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Always</p>
             */
            public Builder imagePullPolicy(String imagePullPolicy) {
                this.imagePullPolicy = imagePullPolicy;
                return this;
            }

            /**
             * <p>The memory size of the init container. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the init container.</p>
             * 
             * <strong>example:</strong>
             * <p>Init-xxx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The exposed port and protocol of the container.</p>
             */
            public Builder ports(java.util.List < InitContainersPorts> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The previous state of the container.</p>
             */
            public Builder previousState(InitContainersPreviousState previousState) {
                this.previousState = previousState;
                return this;
            }

            /**
             * <p>Indicates whether the container passed the readiness probe.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ready(Boolean ready) {
                this.ready = ready;
                return this;
            }

            /**
             * <p>The number of times that the container restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder restartCount(Integer restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            /**
             * <p>The security context of the container.</p>
             */
            public Builder securityContext(InitContainersSecurityContext securityContext) {
                this.securityContext = securityContext;
                return this;
            }

            /**
             * <p>The information about the volumes that are mounted to the init container.</p>
             */
            public Builder volumeMounts(java.util.List < InitContainersVolumeMounts> volumeMounts) {
                this.volumeMounts = volumeMounts;
                return this;
            }

            /**
             * <p>The working directory of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/test</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test-xh</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class ConfigFileVolumeConfigFileToPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Path")
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
             * <p>The content of the ConfigFile volume. Maximum size: 32 KB.</p>
             * 
             * <strong>example:</strong>
             * <p>hello world</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The relative path of the ConfigFile volume.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFileVolumeConfigFileToPaths")
        private java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        @com.aliyun.core.annotation.NameInMap("DiskVolumeDiskId")
        private String diskVolumeDiskId;

        @com.aliyun.core.annotation.NameInMap("DiskVolumeFsType")
        private String diskVolumeFsType;

        @com.aliyun.core.annotation.NameInMap("EmptyDirVolumeMedium")
        private String emptyDirVolumeMedium;

        @com.aliyun.core.annotation.NameInMap("EmptyDirVolumeSizeLimit")
        private String emptyDirVolumeSizeLimit;

        @com.aliyun.core.annotation.NameInMap("FlexVolumeDriver")
        private String flexVolumeDriver;

        @com.aliyun.core.annotation.NameInMap("FlexVolumeFsType")
        private String flexVolumeFsType;

        @com.aliyun.core.annotation.NameInMap("FlexVolumeOptions")
        private String flexVolumeOptions;

        @com.aliyun.core.annotation.NameInMap("NFSVolumePath")
        private String NFSVolumePath;

        @com.aliyun.core.annotation.NameInMap("NFSVolumeReadOnly")
        private Boolean NFSVolumeReadOnly;

        @com.aliyun.core.annotation.NameInMap("NFSVolumeServer")
        private String NFSVolumeServer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The path of the ConfigFile volume.</p>
             */
            public Builder configFileVolumeConfigFileToPaths(java.util.List < ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
                this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
                return this;
            }

            /**
             * <p>The ID of the disk when you set Type to DiskVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>d-xxxx</p>
             */
            public Builder diskVolumeDiskId(String diskVolumeDiskId) {
                this.diskVolumeDiskId = diskVolumeDiskId;
                return this;
            }

            /**
             * <p>The file system type of the disk volume.</p>
             * 
             * <strong>example:</strong>
             * <p>xfs</p>
             */
            public Builder diskVolumeFsType(String diskVolumeFsType) {
                this.diskVolumeFsType = diskVolumeFsType;
                return this;
            }

            /**
             * <p>The storage media for the emptyDir volume. This parameter is empty by default, indicating that the node file system is used as the storage media. Valid values:</p>
             * <ul>
             * <li>Memory: Memory is used as the storage media.</li>
             * <li>LocalRaid0: Local disks are formed into RAID 0. This value is valid only if an elastic container instance that has local disks mounted is created. For more information, see <a href="https://help.aliyun.com/document_detail/114664.html">Create an elastic container instance that has local disks mounted</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Memory</p>
             */
            public Builder emptyDirVolumeMedium(String emptyDirVolumeMedium) {
                this.emptyDirVolumeMedium = emptyDirVolumeMedium;
                return this;
            }

            /**
             * <p>The storage size of the emptyDir volume.</p>
             * 
             * <strong>example:</strong>
             * <p>256Mi</p>
             */
            public Builder emptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
                this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
                return this;
            }

            /**
             * <p>The name of the driver when you set the Type parameter to FlexVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>flexvolume</p>
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * <p>The file system type when you set the Type parameter to FlexVolume. The default value varies based on the script of the FlexVolume plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>ntfs</p>
             */
            public Builder flexVolumeFsType(String flexVolumeFsType) {
                this.flexVolumeFsType = flexVolumeFsType;
                return this;
            }

            /**
             * <p>The options when you set the Type parameter to FlexVolume.</p>
             * 
             * <strong>example:</strong>
             * <p>[nolock,tcp,noresvport]</p>
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * <p>The path of the NFS volume.</p>
             * 
             * <strong>example:</strong>
             * <p>/eci</p>
             */
            public Builder NFSVolumePath(String NFSVolumePath) {
                this.NFSVolumePath = NFSVolumePath;
                return this;
            }

            /**
             * <p>Indicates whether the NFS volume is read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder NFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
                this.NFSVolumeReadOnly = NFSVolumeReadOnly;
                return this;
            }

            /**
             * <p>The address of the NFS server.</p>
             * 
             * <strong>example:</strong>
             * <p>0eafxxxxx-xxxxx.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder NFSVolumeServer(String NFSVolumeServer) {
                this.NFSVolumeServer = NFSVolumeServer;
                return this;
            }

            /**
             * <p>The volume name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-empty</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the volume. Valid values:</p>
             * <ul>
             * <li>EmptyDirVolume</li>
             * <li>NFSVolume</li>
             * <li>ConfigFileVolume</li>
             * <li>FlexVolume</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EmptyDirVolume</p>
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
    /**
     * 
     * {@link DescribeContainerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupsResponseBody</p>
     */
    public static class ContainerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeCategory")
        private String computeCategory;

        @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
        private String containerGroupId;

        @com.aliyun.core.annotation.NameInMap("ContainerGroupName")
        private String containerGroupName;

        @com.aliyun.core.annotation.NameInMap("Containers")
        private java.util.List < Containers> containers;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Discount")
        private Integer discount;

        @com.aliyun.core.annotation.NameInMap("DnsConfig")
        private DnsConfig dnsConfig;

        @com.aliyun.core.annotation.NameInMap("DnsPolicy")
        private String dnsPolicy;

        @com.aliyun.core.annotation.NameInMap("EciSecurityContext")
        private EciSecurityContext eciSecurityContext;

        @com.aliyun.core.annotation.NameInMap("EniInstanceId")
        private String eniInstanceId;

        @com.aliyun.core.annotation.NameInMap("EphemeralStorage")
        private Integer ephemeralStorage;

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List < Events> events;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("FailedTime")
        private String failedTime;

        @com.aliyun.core.annotation.NameInMap("HostAliases")
        private java.util.List < HostAliases> hostAliases;

        @com.aliyun.core.annotation.NameInMap("InitContainers")
        private java.util.List < InitContainers> initContainers;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RestartPolicy")
        private String restartPolicy;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Double spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SucceededTime")
        private String succeededTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantEniInstanceId")
        private String tenantEniInstanceId;

        @com.aliyun.core.annotation.NameInMap("TenantEniIp")
        private String tenantEniIp;

        @com.aliyun.core.annotation.NameInMap("TenantSecurityGroupId")
        private String tenantSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("TenantVSwitchId")
        private String tenantVSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("Volumes")
        private java.util.List < Volumes> volumes;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
            this.dnsPolicy = builder.dnsPolicy;
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
         * @return dnsPolicy
         */
        public String getDnsPolicy() {
            return this.dnsPolicy;
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
            private String dnsPolicy; 
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
             * <p>The computing power type of the elastic container instance. Valid values:</p>
             * <ul>
             * <li>economy: economic computing power.</li>
             * <li>general: general-purpose computing power.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>economy</p>
             */
            public Builder computeCategory(String computeCategory) {
                this.computeCategory = computeCategory;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eci-bp1jrgfqqy54kg5hc****</p>
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder containerGroupName(String containerGroupName) {
                this.containerGroupName = containerGroupName;
                return this;
            }

            /**
             * <p>The information about containers in the elastic container instance.</p>
             */
            public Builder containers(java.util.List < Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>The number of vCPUs that are allocated to the elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time follows the RFC 3339 standard. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The discount.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder discount(Integer discount) {
                this.discount = discount;
                return this;
            }

            /**
             * <p>The Domain Name System (DNS) settings.</p>
             */
            public Builder dnsConfig(DnsConfig dnsConfig) {
                this.dnsConfig = dnsConfig;
                return this;
            }

            /**
             * DnsPolicy.
             */
            public Builder dnsPolicy(String dnsPolicy) {
                this.dnsPolicy = dnsPolicy;
                return this;
            }

            /**
             * <p>The security context of the elastic container instance.</p>
             */
            public Builder eciSecurityContext(EciSecurityContext eciSecurityContext) {
                this.eciSecurityContext = eciSecurityContext;
                return this;
            }

            /**
             * <p>The ID of the elastic network interface (ENI).</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp14rzqi6fd8satm****</p>
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * <p>The size of the temporary storage space. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ephemeralStorage(Integer ephemeralStorage) {
                this.ephemeralStorage = ephemeralStorage;
                return this;
            }

            /**
             * <p>The events of the elastic container instance. A maximum of 50 events can be returned.</p>
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The time when the elastic container instance failed to run due to overdue payments. The time follows the RFC 3339 standard. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The time when the instance failed to run. The time follows the RFC 3339 standard. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-02T15:00:00Z</p>
             */
            public Builder failedTime(String failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            /**
             * <p>The hostnames and IP addresses for a container that are added to the hosts file of the elastic container instance.</p>
             */
            public Builder hostAliases(java.util.List < HostAliases> hostAliases) {
                this.hostAliases = hostAliases;
                return this;
            }

            /**
             * <p>The information about the init containers.</p>
             */
            public Builder initContainers(java.util.List < InitContainers> initContainers) {
                this.initContainers = initContainers;
                return this;
            }

            /**
             * <p>The instance type of the specified Elastic Compute Service (ECS) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The IPv6 address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:XXXX:4:4:4:4:4:4</p>
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * <p>The memory size of the instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the instance RAM role. The elastic container instance and the ECS instance share a RAM role. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ram:PassRole</p>
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-8db03793gfrz****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The restart policy of the elastic container instance. Valid values:</p>
             * <ul>
             * <li>Never: Never restarts the instance if a container in the instance exits upon termination.</li>
             * <li>Always: Always restarts the instance if a container in the instance exits upon termination.</li>
             * <li>OnFailure: Restarts the instance only if a container in the instance exists upon failure with a status code of non-zero.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Never</p>
             */
            public Builder restartPolicy(String restartPolicy) {
                this.restartPolicy = restartPolicy;
                return this;
            }

            /**
             * <p>The ID of the security group to which the instances belong.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp12ujq5zpxuyjfo3o8r</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The maximum hourly price for the preemptible elastic container instance.</p>
             * <p>This parameter is returned only when SpotStrategy is set to SpotWithPriceLimit.</p>
             * 
             * <strong>example:</strong>
             * <p>0.025</p>
             */
            public Builder spotPriceLimit(Double spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The bid policy for the instance. Default value: NoSpot. Valid values:</p>
             * <ul>
             * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
             * <li>SpotWithPriceLimit: The instance is a preemptible instance that has a user-defined maximum hourly price.</li>
             * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoSpot</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>Pending: The instance is being started.</li>
             * <li>Running: The instance is running.</li>
             * <li>Succeeded: The instance successfully runs.</li>
             * <li>Failed: The instance fails to run.</li>
             * <li>Scheduling: The instance is being created.</li>
             * <li>ScheduleFailed: The instance fails to be created.</li>
             * <li>Restarting: The instance is being restarted.</li>
             * <li>Updating: The instance is being updated.</li>
             * <li>Terminating: The instance is being terminated.</li>
             * <li>Expired: The instance is expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when all containers exited on success. The time follows the RFC 3339 standard. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-11T04:33:42Z</p>
             */
            public Builder succeededTime(String succeededTime) {
                this.succeededTime = succeededTime;
                return this;
            }

            /**
             * <p>The tags that are added to the instance.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>i-xxx</p>
             */
            public Builder tenantEniInstanceId(String tenantEniInstanceId) {
                this.tenantEniInstanceId = tenantEniInstanceId;
                return this;
            }

            /**
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.XX.XX</p>
             */
            public Builder tenantEniIp(String tenantEniIp) {
                this.tenantEniIp = tenantEniIp;
                return this;
            }

            /**
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxx</p>
             */
            public Builder tenantSecurityGroupId(String tenantSecurityGroupId) {
                this.tenantSecurityGroupId = tenantSecurityGroupId;
                return this;
            }

            /**
             * <p>This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxx</p>
             */
            public Builder tenantVSwitchId(String tenantVSwitchId) {
                this.tenantVSwitchId = tenantVSwitchId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the instance is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1vzjjflab6wvjox****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The information about the volumes.</p>
             */
            public Builder volumes(java.util.List < Volumes> volumes) {
                this.volumes = volumes;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-1vzjjflab6wvjox****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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
