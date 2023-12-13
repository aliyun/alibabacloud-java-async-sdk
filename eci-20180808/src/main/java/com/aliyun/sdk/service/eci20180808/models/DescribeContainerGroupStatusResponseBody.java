// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupStatusResponseBody</p>
 */
public class DescribeContainerGroupStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeContainerGroupStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The collection of status of the elastic container instances.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeContainerGroupStatusResponseBody build() {
            return new DescribeContainerGroupStatusResponseBody(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("lastTransitionTime")
        private String lastTransitionTime;

        @NameInMap("status")
        private String status;

        @NameInMap("type")
        private String type;

        private Conditions(Builder builder) {
            this.message = builder.message;
            this.reason = builder.reason;
            this.lastTransitionTime = builder.lastTransitionTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
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
         * @return lastTransitionTime
         */
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String message; 
            private String reason; 
            private String lastTransitionTime; 
            private String status; 
            private String type; 

            /**
             * The message about the event.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The cause of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The time when the status last changed.
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * The state of the pod condition.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the pod condition. Valid values:
             * <p>
             * 
             * *   PodScheduled
             * *   Ready
             * *   Initialized
             * *   Unschedulable
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    public static class Running extends TeaModel {
        @NameInMap("StartedAtstartedAt")
        private String startedAtstartedAt;

        private Running(Builder builder) {
            this.startedAtstartedAt = builder.startedAtstartedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Running create() {
            return builder().build();
        }

        /**
         * @return startedAtstartedAt
         */
        public String getStartedAtstartedAt() {
            return this.startedAtstartedAt;
        }

        public static final class Builder {
            private String startedAtstartedAt; 

            /**
             * The start time.
             */
            public Builder startedAtstartedAt(String startedAtstartedAt) {
                this.startedAtstartedAt = startedAtstartedAt;
                return this;
            }

            public Running build() {
                return new Running(this);
            } 

        } 

    }
    public static class Terminated extends TeaModel {
        @NameInMap("ContainerID")
        private String containerID;

        @NameInMap("ExitCode")
        private Integer exitCode;

        @NameInMap("FinishedAt")
        private String finishedAt;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Integer signal;

        @NameInMap("StartedAt")
        private String startedAt;

        private Terminated(Builder builder) {
            this.containerID = builder.containerID;
            this.exitCode = builder.exitCode;
            this.finishedAt = builder.finishedAt;
            this.message = builder.message;
            this.reason = builder.reason;
            this.signal = builder.signal;
            this.startedAt = builder.startedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terminated create() {
            return builder().build();
        }

        /**
         * @return containerID
         */
        public String getContainerID() {
            return this.containerID;
        }

        /**
         * @return exitCode
         */
        public Integer getExitCode() {
            return this.exitCode;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
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
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        public static final class Builder {
            private String containerID; 
            private Integer exitCode; 
            private String finishedAt; 
            private String message; 
            private String reason; 
            private Integer signal; 
            private String startedAt; 

            /**
             * The container ID.
             */
            public Builder containerID(String containerID) {
                this.containerID = containerID;
                return this;
            }

            /**
             * The exit code.
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The end time.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * The message about the event.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The cause of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The signal code.
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * The start time.
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            public Terminated build() {
                return new Terminated(this);
            } 

        } 

    }
    public static class Waiting extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        private Waiting(Builder builder) {
            this.message = builder.message;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Waiting create() {
            return builder().build();
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

        public static final class Builder {
            private String message; 
            private String reason; 

            /**
             * The message about the event.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The cause of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public Waiting build() {
                return new Waiting(this);
            } 

        } 

    }
    public static class LastState extends TeaModel {
        @NameInMap("Running")
        private Running running;

        @NameInMap("Terminated")
        private Terminated terminated;

        @NameInMap("Waiting")
        private Waiting waiting;

        private LastState(Builder builder) {
            this.running = builder.running;
            this.terminated = builder.terminated;
            this.waiting = builder.waiting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastState create() {
            return builder().build();
        }

        /**
         * @return running
         */
        public Running getRunning() {
            return this.running;
        }

        /**
         * @return terminated
         */
        public Terminated getTerminated() {
            return this.terminated;
        }

        /**
         * @return waiting
         */
        public Waiting getWaiting() {
            return this.waiting;
        }

        public static final class Builder {
            private Running running; 
            private Terminated terminated; 
            private Waiting waiting; 

            /**
             * The container is created and running.
             */
            public Builder running(Running running) {
                this.running = running;
                return this;
            }

            /**
             * The container is terminated and exits after a successful or failed run.
             */
            public Builder terminated(Terminated terminated) {
                this.terminated = terminated;
                return this;
            }

            /**
             * The container is waiting for being created.
             */
            public Builder waiting(Waiting waiting) {
                this.waiting = waiting;
                return this;
            }

            public LastState build() {
                return new LastState(this);
            } 

        } 

    }
    public static class StateRunning extends TeaModel {
        @NameInMap("StartedAtstartedAt")
        private String startedAtstartedAt;

        private StateRunning(Builder builder) {
            this.startedAtstartedAt = builder.startedAtstartedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateRunning create() {
            return builder().build();
        }

        /**
         * @return startedAtstartedAt
         */
        public String getStartedAtstartedAt() {
            return this.startedAtstartedAt;
        }

        public static final class Builder {
            private String startedAtstartedAt; 

            /**
             * The start time.
             */
            public Builder startedAtstartedAt(String startedAtstartedAt) {
                this.startedAtstartedAt = startedAtstartedAt;
                return this;
            }

            public StateRunning build() {
                return new StateRunning(this);
            } 

        } 

    }
    public static class StateTerminated extends TeaModel {
        @NameInMap("ContainerID")
        private String containerID;

        @NameInMap("ExitCode")
        private Integer exitCode;

        @NameInMap("FinishedAt")
        private String finishedAt;

        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Signal")
        private Integer signal;

        @NameInMap("StartedAt")
        private String startedAt;

        private StateTerminated(Builder builder) {
            this.containerID = builder.containerID;
            this.exitCode = builder.exitCode;
            this.finishedAt = builder.finishedAt;
            this.message = builder.message;
            this.reason = builder.reason;
            this.signal = builder.signal;
            this.startedAt = builder.startedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateTerminated create() {
            return builder().build();
        }

        /**
         * @return containerID
         */
        public String getContainerID() {
            return this.containerID;
        }

        /**
         * @return exitCode
         */
        public Integer getExitCode() {
            return this.exitCode;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
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
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        public static final class Builder {
            private String containerID; 
            private Integer exitCode; 
            private String finishedAt; 
            private String message; 
            private String reason; 
            private Integer signal; 
            private String startedAt; 

            /**
             * The container ID.
             */
            public Builder containerID(String containerID) {
                this.containerID = containerID;
                return this;
            }

            /**
             * The exit code.
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The end time.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * The message about the event.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The cause of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The signal code.
             */
            public Builder signal(Integer signal) {
                this.signal = signal;
                return this;
            }

            /**
             * The start time.
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            public StateTerminated build() {
                return new StateTerminated(this);
            } 

        } 

    }
    public static class StateWaiting extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Reason")
        private String reason;

        private StateWaiting(Builder builder) {
            this.message = builder.message;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateWaiting create() {
            return builder().build();
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

        public static final class Builder {
            private String message; 
            private String reason; 

            /**
             * The message about the event.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The cause of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public StateWaiting build() {
                return new StateWaiting(this);
            } 

        } 

    }
    public static class State extends TeaModel {
        @NameInMap("Running")
        private StateRunning running;

        @NameInMap("Terminated")
        private StateTerminated terminated;

        @NameInMap("Waiting")
        private StateWaiting waiting;

        private State(Builder builder) {
            this.running = builder.running;
            this.terminated = builder.terminated;
            this.waiting = builder.waiting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static State create() {
            return builder().build();
        }

        /**
         * @return running
         */
        public StateRunning getRunning() {
            return this.running;
        }

        /**
         * @return terminated
         */
        public StateTerminated getTerminated() {
            return this.terminated;
        }

        /**
         * @return waiting
         */
        public StateWaiting getWaiting() {
            return this.waiting;
        }

        public static final class Builder {
            private StateRunning running; 
            private StateTerminated terminated; 
            private StateWaiting waiting; 

            /**
             * The container is created and running.
             */
            public Builder running(StateRunning running) {
                this.running = running;
                return this;
            }

            /**
             * The container is terminated and exits after a successful or failed run.
             */
            public Builder terminated(StateTerminated terminated) {
                this.terminated = terminated;
                return this;
            }

            /**
             * The container is waiting for being created.
             */
            public Builder waiting(StateWaiting waiting) {
                this.waiting = waiting;
                return this;
            }

            public State build() {
                return new State(this);
            } 

        } 

    }
    public static class ContainerStatuses extends TeaModel {
        @NameInMap("Image")
        private String image;

        @NameInMap("ImageID")
        private String imageID;

        @NameInMap("LastState")
        private LastState lastState;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ready")
        private Boolean ready;

        @NameInMap("RestartCount")
        private Integer restartCount;

        @NameInMap("Started")
        private Boolean started;

        @NameInMap("State")
        private State state;

        private ContainerStatuses(Builder builder) {
            this.image = builder.image;
            this.imageID = builder.imageID;
            this.lastState = builder.lastState;
            this.name = builder.name;
            this.ready = builder.ready;
            this.restartCount = builder.restartCount;
            this.started = builder.started;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerStatuses create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return imageID
         */
        public String getImageID() {
            return this.imageID;
        }

        /**
         * @return lastState
         */
        public LastState getLastState() {
            return this.lastState;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return started
         */
        public Boolean getStarted() {
            return this.started;
        }

        /**
         * @return state
         */
        public State getState() {
            return this.state;
        }

        public static final class Builder {
            private String image; 
            private String imageID; 
            private LastState lastState; 
            private String name; 
            private Boolean ready; 
            private Integer restartCount; 
            private Boolean started; 
            private State state; 

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageID(String imageID) {
                this.imageID = imageID;
                return this;
            }

            /**
             * The most recent state of the container.
             */
            public Builder lastState(LastState lastState) {
                this.lastState = lastState;
                return this;
            }

            /**
             * The container name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the container is ready for use.
             */
            public Builder ready(Boolean ready) {
                this.ready = ready;
                return this;
            }

            /**
             * The number of restarts.
             */
            public Builder restartCount(Integer restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            /**
             * Indicates whether the container is started.
             */
            public Builder started(Boolean started) {
                this.started = started;
                return this;
            }

            /**
             * The state of the container. Valid values:
             * <p>
             * 
             * *   Waiting
             * *   Running
             * *   Terminated
             */
            public Builder state(State state) {
                this.state = state;
                return this;
            }

            public ContainerStatuses build() {
                return new ContainerStatuses(this);
            } 

        } 

    }
    public static class PodIps extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        private PodIps(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodIps create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String ip; 

            /**
             * The IP address of the pod.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public PodIps build() {
                return new PodIps(this);
            } 

        } 

    }
    public static class PodStatus extends TeaModel {
        @NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @NameInMap("ContainerStatuses")
        private java.util.List < ContainerStatuses> containerStatuses;

        @NameInMap("HostIp")
        private String hostIp;

        @NameInMap("Phase")
        private String phase;

        @NameInMap("PodIp")
        private String podIp;

        @NameInMap("PodIps")
        private java.util.List < PodIps> podIps;

        @NameInMap("QosClass")
        private String qosClass;

        @NameInMap("StartTime")
        private String startTime;

        private PodStatus(Builder builder) {
            this.conditions = builder.conditions;
            this.containerStatuses = builder.containerStatuses;
            this.hostIp = builder.hostIp;
            this.phase = builder.phase;
            this.podIp = builder.podIp;
            this.podIps = builder.podIps;
            this.qosClass = builder.qosClass;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodStatus create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return containerStatuses
         */
        public java.util.List < ContainerStatuses> getContainerStatuses() {
            return this.containerStatuses;
        }

        /**
         * @return hostIp
         */
        public String getHostIp() {
            return this.hostIp;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return podIp
         */
        public String getPodIp() {
            return this.podIp;
        }

        /**
         * @return podIps
         */
        public java.util.List < PodIps> getPodIps() {
            return this.podIps;
        }

        /**
         * @return qosClass
         */
        public String getQosClass() {
            return this.qosClass;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List < Conditions> conditions; 
            private java.util.List < ContainerStatuses> containerStatuses; 
            private String hostIp; 
            private String phase; 
            private String podIp; 
            private java.util.List < PodIps> podIps; 
            private String qosClass; 
            private String startTime; 

            /**
             * The information about the pod conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * The state information about the container.
             */
            public Builder containerStatuses(java.util.List < ContainerStatuses> containerStatuses) {
                this.containerStatuses = containerStatuses;
                return this;
            }

            /**
             * The IP address of the host.
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * The lifecycle phase of the pod.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * The IP address of the pod.
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * The collection of pod IP addresses.
             */
            public Builder podIps(java.util.List < PodIps> podIps) {
                this.podIps = podIps;
                return this;
            }

            /**
             * The quality of service (QoS) of the pod.
             */
            public Builder qosClass(String qosClass) {
                this.qosClass = qosClass;
                return this;
            }

            /**
             * The time when the container started to run.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public PodStatus build() {
                return new PodStatus(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Annotations")
        private String annotations;

        @NameInMap("ContainerGroupId")
        private String containerGroupId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("PodStatus")
        private PodStatus podStatus;

        @NameInMap("Status")
        private String status;

        @NameInMap("uuid")
        private String uuid;

        private Data(Builder builder) {
            this.annotations = builder.annotations;
            this.containerGroupId = builder.containerGroupId;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.podStatus = builder.podStatus;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public String getAnnotations() {
            return this.annotations;
        }

        /**
         * @return containerGroupId
         */
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return podStatus
         */
        public PodStatus getPodStatus() {
            return this.podStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String annotations; 
            private String containerGroupId; 
            private String name; 
            private String namespace; 
            private PodStatus podStatus; 
            private String status; 
            private String uuid; 

            /**
             * The annotations of the elastic container instance.
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * The ID of the elastic container instance.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * The name of the elastic container instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace where the elastic container instance resides.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The state information about the elastic container instance.
             */
            public Builder podStatus(PodStatus podStatus) {
                this.podStatus = podStatus;
                return this;
            }

            /**
             * The state of the elastic container instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The UUID of the elastic container instance. The UUID of an elastic container instance is similar to the UID of a Kubernetes pod in concept and usage.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
