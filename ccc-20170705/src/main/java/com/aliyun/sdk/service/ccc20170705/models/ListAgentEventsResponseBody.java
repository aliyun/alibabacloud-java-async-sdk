// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentEventsResponseBody</p>
 */
public class ListAgentEventsResponseBody extends TeaModel {
    @NameInMap("AgentEventList")
    private AgentEventList agentEventList;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListAgentEventsResponseBody(Builder builder) {
        this.agentEventList = builder.agentEventList;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return agentEventList
     */
    public AgentEventList getAgentEventList() {
        return this.agentEventList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AgentEventList agentEventList; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AgentEventList.
         */
        public Builder agentEventList(AgentEventList agentEventList) {
            this.agentEventList = agentEventList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAgentEventsResponseBody build() {
            return new ListAgentEventsResponseBody(this);
        } 

    } 

    public static class SkillGroup extends TeaModel {
        @NameInMap("SkillGroupId")
        private String skillGroupId;

        @NameInMap("SkillGroupName")
        private String skillGroupName;

        private SkillGroup(Builder builder) {
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroup create() {
            return builder().build();
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public static final class Builder {
            private String skillGroupId; 
            private String skillGroupName; 

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * SkillGroupName.
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            public SkillGroup build() {
                return new SkillGroup(this);
            } 

        } 

    }
    public static class SkillGroupIds extends TeaModel {
        @NameInMap("SkillGroup")
        private java.util.List < SkillGroup> skillGroup;

        private SkillGroupIds(Builder builder) {
            this.skillGroup = builder.skillGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroupIds create() {
            return builder().build();
        }

        /**
         * @return skillGroup
         */
        public java.util.List < SkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

        public static final class Builder {
            private java.util.List < SkillGroup> skillGroup; 

            /**
             * SkillGroup.
             */
            public Builder skillGroup(java.util.List < SkillGroup> skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            public SkillGroupIds build() {
                return new SkillGroupIds(this);
            } 

        } 

    }
    public static class AgentEvent extends TeaModel {
        @NameInMap("Event")
        private String event;

        @NameInMap("EventTime")
        private Long eventTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("RamId")
        private Long ramId;

        @NameInMap("SkillGroupIds")
        private SkillGroupIds skillGroupIds;

        private AgentEvent(Builder builder) {
            this.event = builder.event;
            this.eventTime = builder.eventTime;
            this.instanceId = builder.instanceId;
            this.loginName = builder.loginName;
            this.ramId = builder.ramId;
            this.skillGroupIds = builder.skillGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentEvent create() {
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

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return ramId
         */
        public Long getRamId() {
            return this.ramId;
        }

        /**
         * @return skillGroupIds
         */
        public SkillGroupIds getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public static final class Builder {
            private String event; 
            private Long eventTime; 
            private String instanceId; 
            private String loginName; 
            private Long ramId; 
            private SkillGroupIds skillGroupIds; 

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

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * RamId.
             */
            public Builder ramId(Long ramId) {
                this.ramId = ramId;
                return this;
            }

            /**
             * SkillGroupIds.
             */
            public Builder skillGroupIds(SkillGroupIds skillGroupIds) {
                this.skillGroupIds = skillGroupIds;
                return this;
            }

            public AgentEvent build() {
                return new AgentEvent(this);
            } 

        } 

    }
    public static class AgentEventList extends TeaModel {
        @NameInMap("AgentEvent")
        private java.util.List < AgentEvent> agentEvent;

        private AgentEventList(Builder builder) {
            this.agentEvent = builder.agentEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentEventList create() {
            return builder().build();
        }

        /**
         * @return agentEvent
         */
        public java.util.List < AgentEvent> getAgentEvent() {
            return this.agentEvent;
        }

        public static final class Builder {
            private java.util.List < AgentEvent> agentEvent; 

            /**
             * AgentEvent.
             */
            public Builder agentEvent(java.util.List < AgentEvent> agentEvent) {
                this.agentEvent = agentEvent;
                return this;
            }

            public AgentEventList build() {
                return new AgentEventList(this);
            } 

        } 

    }
}
