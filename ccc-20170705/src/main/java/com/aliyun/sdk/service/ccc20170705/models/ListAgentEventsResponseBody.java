// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListAgentEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentEventsResponseBody</p>
 */
public class ListAgentEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentEventList")
    private AgentEventList agentEventList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAgentEventsResponseBody model) {
            this.agentEventList = model.agentEventList;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link ListAgentEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentEventsResponseBody</p>
     */
    public static class SkillGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
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

            private Builder() {
            } 

            private Builder(SkillGroup model) {
                this.skillGroupId = model.skillGroupId;
                this.skillGroupName = model.skillGroupName;
            } 

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
    /**
     * 
     * {@link ListAgentEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentEventsResponseBody</p>
     */
    public static class SkillGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillGroup")
        private java.util.List<SkillGroup> skillGroup;

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
        public java.util.List<SkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

        public static final class Builder {
            private java.util.List<SkillGroup> skillGroup; 

            private Builder() {
            } 

            private Builder(SkillGroupIds model) {
                this.skillGroup = model.skillGroup;
            } 

            /**
             * SkillGroup.
             */
            public Builder skillGroup(java.util.List<SkillGroup> skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            public SkillGroupIds build() {
                return new SkillGroupIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentEventsResponseBody</p>
     */
    public static class AgentEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("RamId")
        private Long ramId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupIds")
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

            private Builder() {
            } 

            private Builder(AgentEvent model) {
                this.event = model.event;
                this.eventTime = model.eventTime;
                this.instanceId = model.instanceId;
                this.loginName = model.loginName;
                this.ramId = model.ramId;
                this.skillGroupIds = model.skillGroupIds;
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
    /**
     * 
     * {@link ListAgentEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentEventsResponseBody</p>
     */
    public static class AgentEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentEvent")
        private java.util.List<AgentEvent> agentEvent;

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
        public java.util.List<AgentEvent> getAgentEvent() {
            return this.agentEvent;
        }

        public static final class Builder {
            private java.util.List<AgentEvent> agentEvent; 

            private Builder() {
            } 

            private Builder(AgentEventList model) {
                this.agentEvent = model.agentEvent;
            } 

            /**
             * AgentEvent.
             */
            public Builder agentEvent(java.util.List<AgentEvent> agentEvent) {
                this.agentEvent = agentEvent;
                return this;
            }

            public AgentEventList build() {
                return new AgentEventList(this);
            } 

        } 

    }
}
