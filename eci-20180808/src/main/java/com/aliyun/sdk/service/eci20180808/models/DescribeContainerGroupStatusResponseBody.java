// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupStatusResponseBody</p>
 */
public class DescribeContainerGroupStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The collection of the statuses of the container groups.
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
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("lastTransitionTime")
        private String lastTransitionTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * The reason for the transition into the current status of the event.
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
             * The status of the condition.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the condition. Valid values:
             * <p>
             * 
             * *   PodReadyToStartContainers
             * *   Initialized
             * *   Ready
             * *   ContainersReady
             * *   PodScheduled
             * *   ContainerHasSufficientDisk
             * *   ContainerInstanceCreated
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
        @com.aliyun.core.annotation.NameInMap("StartedAtstartedAt")
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
             * The time when the container started to run.
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
        @com.aliyun.core.annotation.NameInMap("ContainerID")
        private String containerID;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Integer exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Signal")
        private Integer signal;

        @com.aliyun.core.annotation.NameInMap("StartedAt")
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
             * The time when the container ends running.
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
             * The reason for the transition into the current status of the event.
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
             * The time when the container started to run.
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
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
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
             * The reason for the transition into the current status of the event.
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
        @com.aliyun.core.annotation.NameInMap("Running")
        private Running running;

        @com.aliyun.core.annotation.NameInMap("Terminated")
        private Terminated terminated;

        @com.aliyun.core.annotation.NameInMap("Waiting")
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
             * The container is terminated and exits after a successful or failed running.
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
        @com.aliyun.core.annotation.NameInMap("StartedAtstartedAt")
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
             * The time when the container started to run.
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
        @com.aliyun.core.annotation.NameInMap("ContainerID")
        private String containerID;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Integer exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Signal")
        private Integer signal;

        @com.aliyun.core.annotation.NameInMap("StartedAt")
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
             * The time when the container ends running.
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
             * The reason for the transition into the current status of the event.
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
             * The time when the container started to run.
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
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Reason")
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
             * The reason for the transition into the current status of the event.
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
        @com.aliyun.core.annotation.NameInMap("Running")
        private StateRunning running;

        @com.aliyun.core.annotation.NameInMap("Terminated")
        private StateTerminated terminated;

        @com.aliyun.core.annotation.NameInMap("Waiting")
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
             * The container is terminated and exits after a successful or failed running.
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
        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("ImageID")
        private String imageID;

        @com.aliyun.core.annotation.NameInMap("LastState")
        private LastState lastState;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Ready")
        private Boolean ready;

        @com.aliyun.core.annotation.NameInMap("RestartCount")
        private Integer restartCount;

        @com.aliyun.core.annotation.NameInMap("Started")
        private Boolean started;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * The last status of the container.
             */
            public Builder lastState(LastState lastState) {
                this.lastState = lastState;
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
             * Indicates whether the container is ready.
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
             * Indicates whether the container is started.
             */
            public Builder started(Boolean started) {
                this.started = started;
                return this;
            }

            /**
             * The status of the container. Valid values:
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
        @com.aliyun.core.annotation.NameInMap("Ip")
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
             * The IP address of the container group.
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
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("ContainerStatuses")
        private java.util.List < ContainerStatuses> containerStatuses;

        @com.aliyun.core.annotation.NameInMap("HostIp")
        private String hostIp;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("PodIp")
        private String podIp;

        @com.aliyun.core.annotation.NameInMap("PodIps")
        private java.util.List < PodIps> podIps;

        @com.aliyun.core.annotation.NameInMap("QosClass")
        private String qosClass;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * The conditions of the container group.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * The statuses about the containers.
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
             * The lifecycle phase of the container group.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * The IP address of the container group.
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * The IP addresses of the container groups.
             */
            public Builder podIps(java.util.List < PodIps> podIps) {
                this.podIps = podIps;
                return this;
            }

            /**
             * The quality of service (QoS) of the container group.
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
        @com.aliyun.core.annotation.NameInMap("Annotations")
        private String annotations;

        @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
        private String containerGroupId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PodStatus")
        private PodStatus podStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("uuid")
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
             * Annotations that are added to the container groups.
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * The ID of the container group.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * The name of the container group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace in which the container group resides.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The status of the container group.
             */
            public Builder podStatus(PodStatus podStatus) {
                this.podStatus = podStatus;
                return this;
            }

            /**
             * The status of the container group.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The universally unique identifier (UUID) of the container group, which is similar to the unique identifier (UID) of the Kubernetes pod in terms of the concept and usage.
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
