// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetCallDetailRecordResponseBody</p>
 */
public class GetCallDetailRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCallDetailRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallDetailRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCallDetailRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetCallDetailRecordResponseBody build() {
            return new GetCallDetailRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class EventSequence extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        private EventSequence(Builder builder) {
            this.duration = builder.duration;
            this.event = builder.event;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventSequence create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private Long duration; 
            private String event; 
            private Long eventTime; 

            private Builder() {
            } 

            private Builder(EventSequence model) {
                this.duration = model.duration;
                this.event = model.event;
                this.eventTime = model.eventTime;
            } 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public EventSequence build() {
                return new EventSequence(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class AgentEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("EventSequence")
        private java.util.List<EventSequence> eventSequence;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        private AgentEvents(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.eventSequence = builder.eventSequence;
            this.skillGroupId = builder.skillGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentEvents create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return eventSequence
         */
        public java.util.List<EventSequence> getEventSequence() {
            return this.eventSequence;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private java.util.List<EventSequence> eventSequence; 
            private String skillGroupId; 

            private Builder() {
            } 

            private Builder(AgentEvents model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.eventSequence = model.eventSequence;
                this.skillGroupId = model.skillGroupId;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * EventSequence.
             */
            public Builder eventSequence(java.util.List<EventSequence> eventSequence) {
                this.eventSequence = eventSequence;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            public AgentEvents build() {
                return new AgentEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class Emotion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Integer confidence;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Emotion(Builder builder) {
            this.confidence = builder.confidence;
            this.remark = builder.remark;
            this.success = builder.success;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Emotion create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer confidence; 
            private String remark; 
            private Boolean success; 
            private String taskId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Emotion model) {
                this.confidence = model.confidence;
                this.remark = model.remark;
                this.success = model.success;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * Confidence.
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Emotion build() {
                return new Emotion(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class ProblemSolving extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Problem")
        private String problem;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("Solved")
        private Boolean solved;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private ProblemSolving(Builder builder) {
            this.problem = builder.problem;
            this.solution = builder.solution;
            this.solved = builder.solved;
            this.success = builder.success;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProblemSolving create() {
            return builder().build();
        }

        /**
         * @return problem
         */
        public String getProblem() {
            return this.problem;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return solved
         */
        public Boolean getSolved() {
            return this.solved;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String problem; 
            private String solution; 
            private Boolean solved; 
            private Boolean success; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(ProblemSolving model) {
                this.problem = model.problem;
                this.solution = model.solution;
                this.solved = model.solved;
                this.success = model.success;
                this.taskId = model.taskId;
            } 

            /**
             * Problem.
             */
            public Builder problem(String problem) {
                this.problem = problem;
                return this;
            }

            /**
             * Solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * Solved.
             */
            public Builder solved(Boolean solved) {
                this.solved = solved;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public ProblemSolving build() {
                return new ProblemSolving(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class Satisfaction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SatisfactionDescription")
        private String satisfactionDescription;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Satisfaction(Builder builder) {
            this.remark = builder.remark;
            this.satisfactionDescription = builder.satisfactionDescription;
            this.success = builder.success;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Satisfaction create() {
            return builder().build();
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return satisfactionDescription
         */
        public String getSatisfactionDescription() {
            return this.satisfactionDescription;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String remark; 
            private String satisfactionDescription; 
            private Boolean success; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Satisfaction model) {
                this.remark = model.remark;
                this.satisfactionDescription = model.satisfactionDescription;
                this.success = model.success;
                this.taskId = model.taskId;
            } 

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SatisfactionDescription.
             */
            public Builder satisfactionDescription(String satisfactionDescription) {
                this.satisfactionDescription = satisfactionDescription;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Satisfaction build() {
                return new Satisfaction(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class TodoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<String> tasks;

        private TodoList(Builder builder) {
            this.success = builder.success;
            this.taskId = builder.taskId;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodoList create() {
            return builder().build();
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tasks
         */
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private Boolean success; 
            private String taskId; 
            private java.util.List<String> tasks; 

            private Builder() {
            } 

            private Builder(TodoList model) {
                this.success = model.success;
                this.taskId = model.taskId;
                this.tasks = model.tasks;
            } 

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Tasks.
             */
            public Builder tasks(java.util.List<String> tasks) {
                this.tasks = tasks;
                return this;
            }

            public TodoList build() {
                return new TodoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class AnalyticsReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Emotion")
        private Emotion emotion;

        @com.aliyun.core.annotation.NameInMap("ProblemSolving")
        private ProblemSolving problemSolving;

        @com.aliyun.core.annotation.NameInMap("Satisfaction")
        private Satisfaction satisfaction;

        @com.aliyun.core.annotation.NameInMap("TodoList")
        private TodoList todoList;

        private AnalyticsReport(Builder builder) {
            this.emotion = builder.emotion;
            this.problemSolving = builder.problemSolving;
            this.satisfaction = builder.satisfaction;
            this.todoList = builder.todoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalyticsReport create() {
            return builder().build();
        }

        /**
         * @return emotion
         */
        public Emotion getEmotion() {
            return this.emotion;
        }

        /**
         * @return problemSolving
         */
        public ProblemSolving getProblemSolving() {
            return this.problemSolving;
        }

        /**
         * @return satisfaction
         */
        public Satisfaction getSatisfaction() {
            return this.satisfaction;
        }

        /**
         * @return todoList
         */
        public TodoList getTodoList() {
            return this.todoList;
        }

        public static final class Builder {
            private Emotion emotion; 
            private ProblemSolving problemSolving; 
            private Satisfaction satisfaction; 
            private TodoList todoList; 

            private Builder() {
            } 

            private Builder(AnalyticsReport model) {
                this.emotion = model.emotion;
                this.problemSolving = model.problemSolving;
                this.satisfaction = model.satisfaction;
                this.todoList = model.todoList;
            } 

            /**
             * Emotion.
             */
            public Builder emotion(Emotion emotion) {
                this.emotion = emotion;
                return this;
            }

            /**
             * ProblemSolving.
             */
            public Builder problemSolving(ProblemSolving problemSolving) {
                this.problemSolving = problemSolving;
                return this;
            }

            /**
             * Satisfaction.
             */
            public Builder satisfaction(Satisfaction satisfaction) {
                this.satisfaction = satisfaction;
                return this;
            }

            /**
             * TodoList.
             */
            public Builder todoList(TodoList todoList) {
                this.todoList = todoList;
                return this;
            }

            public AnalyticsReport build() {
                return new AnalyticsReport(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class CustomerEventsEventSequence extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        private CustomerEventsEventSequence(Builder builder) {
            this.event = builder.event;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerEventsEventSequence create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private String event; 
            private Long eventTime; 

            private Builder() {
            } 

            private Builder(CustomerEventsEventSequence model) {
                this.event = model.event;
                this.eventTime = model.eventTime;
            } 

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public CustomerEventsEventSequence build() {
                return new CustomerEventsEventSequence(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class CustomerEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("EventSequence")
        private java.util.List<CustomerEventsEventSequence> eventSequence;

        private CustomerEvents(Builder builder) {
            this.customerId = builder.customerId;
            this.eventSequence = builder.eventSequence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerEvents create() {
            return builder().build();
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return eventSequence
         */
        public java.util.List<CustomerEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        public static final class Builder {
            private String customerId; 
            private java.util.List<CustomerEventsEventSequence> eventSequence; 

            private Builder() {
            } 

            private Builder(CustomerEvents model) {
                this.customerId = model.customerId;
                this.eventSequence = model.eventSequence;
            } 

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * EventSequence.
             */
            public Builder eventSequence(java.util.List<CustomerEventsEventSequence> eventSequence) {
                this.eventSequence = eventSequence;
                return this;
            }

            public CustomerEvents build() {
                return new CustomerEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class IvrEventsEventSequence extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        private IvrEventsEventSequence(Builder builder) {
            this.event = builder.event;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IvrEventsEventSequence create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private String event; 
            private Long eventTime; 

            private Builder() {
            } 

            private Builder(IvrEventsEventSequence model) {
                this.event = model.event;
                this.eventTime = model.eventTime;
            } 

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public IvrEventsEventSequence build() {
                return new IvrEventsEventSequence(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class IvrEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSequence")
        private java.util.List<IvrEventsEventSequence> eventSequence;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowType")
        private String flowType;

        private IvrEvents(Builder builder) {
            this.eventSequence = builder.eventSequence;
            this.flowId = builder.flowId;
            this.flowType = builder.flowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IvrEvents create() {
            return builder().build();
        }

        /**
         * @return eventSequence
         */
        public java.util.List<IvrEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        public static final class Builder {
            private java.util.List<IvrEventsEventSequence> eventSequence; 
            private String flowId; 
            private String flowType; 

            private Builder() {
            } 

            private Builder(IvrEvents model) {
                this.eventSequence = model.eventSequence;
                this.flowId = model.flowId;
                this.flowType = model.flowType;
            } 

            /**
             * EventSequence.
             */
            public Builder eventSequence(java.util.List<IvrEventsEventSequence> eventSequence) {
                this.eventSequence = eventSequence;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowType.
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            public IvrEvents build() {
                return new IvrEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class QueueEventsEventSequence extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        private QueueEventsEventSequence(Builder builder) {
            this.event = builder.event;
            this.eventTime = builder.eventTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueEventsEventSequence create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        public static final class Builder {
            private String event; 
            private Long eventTime; 

            private Builder() {
            } 

            private Builder(QueueEventsEventSequence model) {
                this.event = model.event;
                this.eventTime = model.eventTime;
            } 

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            public QueueEventsEventSequence build() {
                return new QueueEventsEventSequence(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class QueueEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSequence")
        private java.util.List<QueueEventsEventSequence> eventSequence;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private String queueId;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("QueueType")
        private Integer queueType;

        private QueueEvents(Builder builder) {
            this.eventSequence = builder.eventSequence;
            this.flowId = builder.flowId;
            this.queueId = builder.queueId;
            this.queueName = builder.queueName;
            this.queueType = builder.queueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueueEvents create() {
            return builder().build();
        }

        /**
         * @return eventSequence
         */
        public java.util.List<QueueEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return queueId
         */
        public String getQueueId() {
            return this.queueId;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return queueType
         */
        public Integer getQueueType() {
            return this.queueType;
        }

        public static final class Builder {
            private java.util.List<QueueEventsEventSequence> eventSequence; 
            private String flowId; 
            private String queueId; 
            private String queueName; 
            private Integer queueType; 

            private Builder() {
            } 

            private Builder(QueueEvents model) {
                this.eventSequence = model.eventSequence;
                this.flowId = model.flowId;
                this.queueId = model.queueId;
                this.queueName = model.queueName;
                this.queueType = model.queueType;
            } 

            /**
             * EventSequence.
             */
            public Builder eventSequence(java.util.List<QueueEventsEventSequence> eventSequence) {
                this.eventSequence = eventSequence;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * QueueId.
             */
            public Builder queueId(String queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * QueueType.
             */
            public Builder queueType(Integer queueType) {
                this.queueType = queueType;
                return this;
            }

            public QueueEvents build() {
                return new QueueEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentEvents")
        private java.util.List<AgentEvents> agentEvents;

        @com.aliyun.core.annotation.NameInMap("AgentIds")
        private String agentIds;

        @com.aliyun.core.annotation.NameInMap("AgentNames")
        private String agentNames;

        @com.aliyun.core.annotation.NameInMap("AnalyticsReport")
        private AnalyticsReport analyticsReport;

        @com.aliyun.core.annotation.NameInMap("AnalyticsReportReady")
        private Boolean analyticsReportReady;

        @com.aliyun.core.annotation.NameInMap("CallDuration")
        private Long callDuration;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CalleeLocation")
        private String calleeLocation;

        @com.aliyun.core.annotation.NameInMap("CallerLocation")
        private String callerLocation;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ContactDisposition")
        private String contactDisposition;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactType")
        private String contactType;

        @com.aliyun.core.annotation.NameInMap("CustomerEvents")
        private java.util.List<CustomerEvents> customerEvents;

        @com.aliyun.core.annotation.NameInMap("EarlyMediaState")
        private String earlyMediaState;

        @com.aliyun.core.annotation.NameInMap("EstablishedTime")
        private Long establishedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IvrEvents")
        private java.util.List<IvrEvents> ivrEvents;

        @com.aliyun.core.annotation.NameInMap("QueueEvents")
        private java.util.List<QueueEvents> queueEvents;

        @com.aliyun.core.annotation.NameInMap("RecordingReady")
        private Boolean recordingReady;

        @com.aliyun.core.annotation.NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @com.aliyun.core.annotation.NameInMap("ReleaseReason")
        private String releaseReason;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("Satisfaction")
        private Integer satisfaction;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveyChannel")
        private String satisfactionSurveyChannel;

        @com.aliyun.core.annotation.NameInMap("SatisfactionSurveyOffered")
        private Boolean satisfactionSurveyOffered;

        @com.aliyun.core.annotation.NameInMap("SkillGroupIds")
        private String skillGroupIds;

        @com.aliyun.core.annotation.NameInMap("SkillGroupNames")
        private String skillGroupNames;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Data(Builder builder) {
            this.agentEvents = builder.agentEvents;
            this.agentIds = builder.agentIds;
            this.agentNames = builder.agentNames;
            this.analyticsReport = builder.analyticsReport;
            this.analyticsReportReady = builder.analyticsReportReady;
            this.callDuration = builder.callDuration;
            this.calledNumber = builder.calledNumber;
            this.calleeLocation = builder.calleeLocation;
            this.callerLocation = builder.callerLocation;
            this.callingNumber = builder.callingNumber;
            this.contactDisposition = builder.contactDisposition;
            this.contactId = builder.contactId;
            this.contactType = builder.contactType;
            this.customerEvents = builder.customerEvents;
            this.earlyMediaState = builder.earlyMediaState;
            this.establishedTime = builder.establishedTime;
            this.instanceId = builder.instanceId;
            this.ivrEvents = builder.ivrEvents;
            this.queueEvents = builder.queueEvents;
            this.recordingReady = builder.recordingReady;
            this.releaseInitiator = builder.releaseInitiator;
            this.releaseReason = builder.releaseReason;
            this.releaseTime = builder.releaseTime;
            this.satisfaction = builder.satisfaction;
            this.satisfactionSurveyChannel = builder.satisfactionSurveyChannel;
            this.satisfactionSurveyOffered = builder.satisfactionSurveyOffered;
            this.skillGroupIds = builder.skillGroupIds;
            this.skillGroupNames = builder.skillGroupNames;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentEvents
         */
        public java.util.List<AgentEvents> getAgentEvents() {
            return this.agentEvents;
        }

        /**
         * @return agentIds
         */
        public String getAgentIds() {
            return this.agentIds;
        }

        /**
         * @return agentNames
         */
        public String getAgentNames() {
            return this.agentNames;
        }

        /**
         * @return analyticsReport
         */
        public AnalyticsReport getAnalyticsReport() {
            return this.analyticsReport;
        }

        /**
         * @return analyticsReportReady
         */
        public Boolean getAnalyticsReportReady() {
            return this.analyticsReportReady;
        }

        /**
         * @return callDuration
         */
        public Long getCallDuration() {
            return this.callDuration;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return calleeLocation
         */
        public String getCalleeLocation() {
            return this.calleeLocation;
        }

        /**
         * @return callerLocation
         */
        public String getCallerLocation() {
            return this.callerLocation;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return contactDisposition
         */
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return contactType
         */
        public String getContactType() {
            return this.contactType;
        }

        /**
         * @return customerEvents
         */
        public java.util.List<CustomerEvents> getCustomerEvents() {
            return this.customerEvents;
        }

        /**
         * @return earlyMediaState
         */
        public String getEarlyMediaState() {
            return this.earlyMediaState;
        }

        /**
         * @return establishedTime
         */
        public Long getEstablishedTime() {
            return this.establishedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ivrEvents
         */
        public java.util.List<IvrEvents> getIvrEvents() {
            return this.ivrEvents;
        }

        /**
         * @return queueEvents
         */
        public java.util.List<QueueEvents> getQueueEvents() {
            return this.queueEvents;
        }

        /**
         * @return recordingReady
         */
        public Boolean getRecordingReady() {
            return this.recordingReady;
        }

        /**
         * @return releaseInitiator
         */
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        /**
         * @return releaseReason
         */
        public String getReleaseReason() {
            return this.releaseReason;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return satisfaction
         */
        public Integer getSatisfaction() {
            return this.satisfaction;
        }

        /**
         * @return satisfactionSurveyChannel
         */
        public String getSatisfactionSurveyChannel() {
            return this.satisfactionSurveyChannel;
        }

        /**
         * @return satisfactionSurveyOffered
         */
        public Boolean getSatisfactionSurveyOffered() {
            return this.satisfactionSurveyOffered;
        }

        /**
         * @return skillGroupIds
         */
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        /**
         * @return skillGroupNames
         */
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List<AgentEvents> agentEvents; 
            private String agentIds; 
            private String agentNames; 
            private AnalyticsReport analyticsReport; 
            private Boolean analyticsReportReady; 
            private Long callDuration; 
            private String calledNumber; 
            private String calleeLocation; 
            private String callerLocation; 
            private String callingNumber; 
            private String contactDisposition; 
            private String contactId; 
            private String contactType; 
            private java.util.List<CustomerEvents> customerEvents; 
            private String earlyMediaState; 
            private Long establishedTime; 
            private String instanceId; 
            private java.util.List<IvrEvents> ivrEvents; 
            private java.util.List<QueueEvents> queueEvents; 
            private Boolean recordingReady; 
            private String releaseInitiator; 
            private String releaseReason; 
            private Long releaseTime; 
            private Integer satisfaction; 
            private String satisfactionSurveyChannel; 
            private Boolean satisfactionSurveyOffered; 
            private String skillGroupIds; 
            private String skillGroupNames; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentEvents = model.agentEvents;
                this.agentIds = model.agentIds;
                this.agentNames = model.agentNames;
                this.analyticsReport = model.analyticsReport;
                this.analyticsReportReady = model.analyticsReportReady;
                this.callDuration = model.callDuration;
                this.calledNumber = model.calledNumber;
                this.calleeLocation = model.calleeLocation;
                this.callerLocation = model.callerLocation;
                this.callingNumber = model.callingNumber;
                this.contactDisposition = model.contactDisposition;
                this.contactId = model.contactId;
                this.contactType = model.contactType;
                this.customerEvents = model.customerEvents;
                this.earlyMediaState = model.earlyMediaState;
                this.establishedTime = model.establishedTime;
                this.instanceId = model.instanceId;
                this.ivrEvents = model.ivrEvents;
                this.queueEvents = model.queueEvents;
                this.recordingReady = model.recordingReady;
                this.releaseInitiator = model.releaseInitiator;
                this.releaseReason = model.releaseReason;
                this.releaseTime = model.releaseTime;
                this.satisfaction = model.satisfaction;
                this.satisfactionSurveyChannel = model.satisfactionSurveyChannel;
                this.satisfactionSurveyOffered = model.satisfactionSurveyOffered;
                this.skillGroupIds = model.skillGroupIds;
                this.skillGroupNames = model.skillGroupNames;
                this.startTime = model.startTime;
            } 

            /**
             * AgentEvents.
             */
            public Builder agentEvents(java.util.List<AgentEvents> agentEvents) {
                this.agentEvents = agentEvents;
                return this;
            }

            /**
             * AgentIds.
             */
            public Builder agentIds(String agentIds) {
                this.agentIds = agentIds;
                return this;
            }

            /**
             * AgentNames.
             */
            public Builder agentNames(String agentNames) {
                this.agentNames = agentNames;
                return this;
            }

            /**
             * AnalyticsReport.
             */
            public Builder analyticsReport(AnalyticsReport analyticsReport) {
                this.analyticsReport = analyticsReport;
                return this;
            }

            /**
             * AnalyticsReportReady.
             */
            public Builder analyticsReportReady(Boolean analyticsReportReady) {
                this.analyticsReportReady = analyticsReportReady;
                return this;
            }

            /**
             * CallDuration.
             */
            public Builder callDuration(Long callDuration) {
                this.callDuration = callDuration;
                return this;
            }

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CalleeLocation.
             */
            public Builder calleeLocation(String calleeLocation) {
                this.calleeLocation = calleeLocation;
                return this;
            }

            /**
             * CallerLocation.
             */
            public Builder callerLocation(String callerLocation) {
                this.callerLocation = callerLocation;
                return this;
            }

            /**
             * CallingNumber.
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * ContactDisposition.
             */
            public Builder contactDisposition(String contactDisposition) {
                this.contactDisposition = contactDisposition;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactType.
             */
            public Builder contactType(String contactType) {
                this.contactType = contactType;
                return this;
            }

            /**
             * CustomerEvents.
             */
            public Builder customerEvents(java.util.List<CustomerEvents> customerEvents) {
                this.customerEvents = customerEvents;
                return this;
            }

            /**
             * EarlyMediaState.
             */
            public Builder earlyMediaState(String earlyMediaState) {
                this.earlyMediaState = earlyMediaState;
                return this;
            }

            /**
             * EstablishedTime.
             */
            public Builder establishedTime(Long establishedTime) {
                this.establishedTime = establishedTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IvrEvents.
             */
            public Builder ivrEvents(java.util.List<IvrEvents> ivrEvents) {
                this.ivrEvents = ivrEvents;
                return this;
            }

            /**
             * QueueEvents.
             */
            public Builder queueEvents(java.util.List<QueueEvents> queueEvents) {
                this.queueEvents = queueEvents;
                return this;
            }

            /**
             * RecordingReady.
             */
            public Builder recordingReady(Boolean recordingReady) {
                this.recordingReady = recordingReady;
                return this;
            }

            /**
             * ReleaseInitiator.
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * ReleaseReason.
             */
            public Builder releaseReason(String releaseReason) {
                this.releaseReason = releaseReason;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * Satisfaction.
             */
            public Builder satisfaction(Integer satisfaction) {
                this.satisfaction = satisfaction;
                return this;
            }

            /**
             * SatisfactionSurveyChannel.
             */
            public Builder satisfactionSurveyChannel(String satisfactionSurveyChannel) {
                this.satisfactionSurveyChannel = satisfactionSurveyChannel;
                return this;
            }

            /**
             * SatisfactionSurveyOffered.
             */
            public Builder satisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
                this.satisfactionSurveyOffered = satisfactionSurveyOffered;
                return this;
            }

            /**
             * SkillGroupIds.
             */
            public Builder skillGroupIds(String skillGroupIds) {
                this.skillGroupIds = skillGroupIds;
                return this;
            }

            /**
             * SkillGroupNames.
             */
            public Builder skillGroupNames(String skillGroupNames) {
                this.skillGroupNames = skillGroupNames;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
