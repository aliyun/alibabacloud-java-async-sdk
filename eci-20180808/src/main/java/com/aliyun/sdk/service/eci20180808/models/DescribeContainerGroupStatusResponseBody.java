// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

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
 * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupStatusResponseBody</p>
 */
public class DescribeContainerGroupStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeContainerGroupStatusResponseBody model) {
            this.data = model.data;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The collection of the statuses of the container groups.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1340C38D-6189-54D1-86F6-7D5ECF3E0088</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeContainerGroupStatusResponseBody build() {
            return new DescribeContainerGroupStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.message = model.message;
                this.reason = model.reason;
                this.lastTransitionTime = model.lastTransitionTime;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason for the transition into the current status of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The time when the status last changed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-12T07:02:47Z</p>
             */
            public Builder lastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
                return this;
            }

            /**
             * <p>The status of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the condition. Valid values:</p>
             * <ul>
             * <li>PodReadyToStartContainers</li>
             * <li>Initialized</li>
             * <li>Ready</li>
             * <li>ContainersReady</li>
             * <li>PodScheduled</li>
             * <li>ContainerHasSufficientDisk</li>
             * <li>ContainerInstanceCreated</li>
             * <li>Unschedulable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Running model) {
                this.startedAtstartedAt = model.startedAtstartedAt;
            } 

            /**
             * <p>The time when the container started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-23T20:49:31Z</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Terminated model) {
                this.containerID = model.containerID;
                this.exitCode = model.exitCode;
                this.finishedAt = model.finishedAt;
                this.message = model.message;
                this.reason = model.reason;
                this.signal = model.signal;
                this.startedAt = model.startedAt;
            } 

            /**
             * <p>The container ID.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd://3ff993933bea366c4719e43a1b067d89bc7f01f1f573981659a44ff17a******</p>
             */
            public Builder containerID(String containerID) {
                this.containerID = containerID;
                return this;
            }

            /**
             * <p>The exit code.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the container ends running.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-23T20:49:31Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason for the transition into the current status of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The signal code.</p>
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
             * <p>2021-05-12T07:02:52Z</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Waiting model) {
                this.message = model.message;
                this.reason = model.reason;
            } 

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Back-off</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason for the transition into the current status of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Started</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(LastState model) {
                this.running = model.running;
                this.terminated = model.terminated;
                this.waiting = model.waiting;
            } 

            /**
             * <p>The container is created and running.</p>
             */
            public Builder running(Running running) {
                this.running = running;
                return this;
            }

            /**
             * <p>The container is terminated and exits after a successful or failed running.</p>
             */
            public Builder terminated(Terminated terminated) {
                this.terminated = terminated;
                return this;
            }

            /**
             * <p>The container is waiting for being created.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StateRunning model) {
                this.startedAtstartedAt = model.startedAtstartedAt;
            } 

            /**
             * <p>The time when the container started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-23T20:49:31Z</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StateTerminated model) {
                this.containerID = model.containerID;
                this.exitCode = model.exitCode;
                this.finishedAt = model.finishedAt;
                this.message = model.message;
                this.reason = model.reason;
                this.signal = model.signal;
                this.startedAt = model.startedAt;
            } 

            /**
             * <p>The container ID.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd://3ff993933bea366c4719e43a1b067d89bc7f01f1f573981659a44ff17a******</p>
             */
            public Builder containerID(String containerID) {
                this.containerID = containerID;
                return this;
            }

            /**
             * <p>The exit code.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the container ends running.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-23T20:55:31Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason for the transition into the current status of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The signal code.</p>
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
             * <p>2021-05-23T20:49:31Z</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StateWaiting model) {
                this.message = model.message;
                this.reason = model.reason;
            } 

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Back-off</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The reason for the transition into the current status of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Started</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(State model) {
                this.running = model.running;
                this.terminated = model.terminated;
                this.waiting = model.waiting;
            } 

            /**
             * <p>The container is created and running.</p>
             */
            public Builder running(StateRunning running) {
                this.running = running;
                return this;
            }

            /**
             * <p>The container is terminated and exits after a successful or failed running.</p>
             */
            public Builder terminated(StateTerminated terminated) {
                this.terminated = terminated;
                return this;
            }

            /**
             * <p>The container is waiting for being created.</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ContainerStatuses model) {
                this.image = model.image;
                this.imageID = model.imageID;
                this.lastState = model.lastState;
                this.name = model.name;
                this.ready = model.ready;
                this.restartCount = model.restartCount;
                this.started = model.started;
                this.state = model.state;
            } 

            /**
             * <p>The image of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-zhangjiakou.aliyuncs.com/eci_open/ubuntu:18.04</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-zhangjiakou.aliyuncs.com/eci_open/ubuntu@sha256:134c7fe821b9d359490cd009ce7ca322453f4f2d018623f849e580a89a685e5d</p>
             */
            public Builder imageID(String imageID) {
                this.imageID = imageID;
                return this;
            }

            /**
             * <p>The last status of the container.</p>
             */
            public Builder lastState(LastState lastState) {
                this.lastState = lastState;
                return this;
            }

            /**
             * <p>The name of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>ubuntu</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the container is ready.</p>
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
             * <p>1</p>
             */
            public Builder restartCount(Integer restartCount) {
                this.restartCount = restartCount;
                return this;
            }

            /**
             * <p>Indicates whether the container is started.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder started(Boolean started) {
                this.started = started;
                return this;
            }

            /**
             * <p>The status of the container. Valid values:</p>
             * <ul>
             * <li>Waiting</li>
             * <li>Running</li>
             * <li>Terminated</li>
             * </ul>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PodIps model) {
                this.ip = model.ip;
            } 

            /**
             * <p>The IP address of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
    public static class PodStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("ContainerStatuses")
        private java.util.List<ContainerStatuses> containerStatuses;

        @com.aliyun.core.annotation.NameInMap("HostIp")
        private String hostIp;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("PodIp")
        private String podIp;

        @com.aliyun.core.annotation.NameInMap("PodIps")
        private java.util.List<PodIps> podIps;

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
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return containerStatuses
         */
        public java.util.List<ContainerStatuses> getContainerStatuses() {
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
        public java.util.List<PodIps> getPodIps() {
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
            private java.util.List<Conditions> conditions; 
            private java.util.List<ContainerStatuses> containerStatuses; 
            private String hostIp; 
            private String phase; 
            private String podIp; 
            private java.util.List<PodIps> podIps; 
            private String qosClass; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(PodStatus model) {
                this.conditions = model.conditions;
                this.containerStatuses = model.containerStatuses;
                this.hostIp = model.hostIp;
                this.phase = model.phase;
                this.podIp = model.podIp;
                this.podIps = model.podIps;
                this.qosClass = model.qosClass;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The conditions of the container group.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The statuses about the containers.</p>
             */
            public Builder containerStatuses(java.util.List<ContainerStatuses> containerStatuses) {
                this.containerStatuses = containerStatuses;
                return this;
            }

            /**
             * <p>The IP address of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
                return this;
            }

            /**
             * <p>The lifecycle phase of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The IP address of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * <p>The IP addresses of the container groups.</p>
             */
            public Builder podIps(java.util.List<PodIps> podIps) {
                this.podIps = podIps;
                return this;
            }

            /**
             * <p>The quality of service (QoS) of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>Guaranteed</p>
             */
            public Builder qosClass(String qosClass) {
                this.qosClass = qosClass;
                return this;
            }

            /**
             * <p>The time when the container started to run.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-12T07:02:47Z</p>
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
    /**
     * 
     * {@link DescribeContainerGroupStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.annotations = model.annotations;
                this.containerGroupId = model.containerGroupId;
                this.name = model.name;
                this.namespace = model.namespace;
                this.podStatus = model.podStatus;
                this.status = model.status;
                this.uuid = model.uuid;
            } 

            /**
             * <p>Annotations that are added to the container groups.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;tenancy.x-k8s.io/namespace&quot;:&quot;redis&quot;}&quot;</p>
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The ID of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>eci-bp1jrgfqqy54kg5hc****</p>
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * <p>The name of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace in which the container group resides.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The status of the container group.</p>
             */
            public Builder podStatus(PodStatus podStatus) {
                this.podStatus = podStatus;
                return this;
            }

            /**
             * <p>The status of the container group.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The universally unique identifier (UUID) of the container group, which is similar to the unique identifier (UID) of the Kubernetes pod in terms of the concept and usage.</p>
             * 
             * <strong>example:</strong>
             * <p>78ee0657-987g-b8b2-1f507dic4****</p>
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
