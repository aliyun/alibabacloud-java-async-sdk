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
 * {@link ListRealtimeAgentStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRealtimeAgentStatesResponseBody</p>
 */
public class ListRealtimeAgentStatesResponseBody extends TeaModel {
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

    private ListRealtimeAgentStatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeAgentStatesResponseBody create() {
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

        private Builder(ListRealtimeAgentStatesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRealtimeAgentStatesResponseBody build() {
            return new ListRealtimeAgentStatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRealtimeAgentStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeAgentStatesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("BreakCode")
        private String breakCode;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CounterParty")
        private String counterParty;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("OutboundScenario")
        private Boolean outboundScenario;

        @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
        private java.util.List<String> skillGroupIdList;

        @com.aliyun.core.annotation.NameInMap("SkillGroupNameList")
        private java.util.List<String> skillGroupNameList;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StateCode")
        private String stateCode;

        @com.aliyun.core.annotation.NameInMap("StateTime")
        private Long stateTime;

        @com.aliyun.core.annotation.NameInMap("WorkMode")
        private String workMode;

        private List(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.breakCode = builder.breakCode;
            this.callType = builder.callType;
            this.counterParty = builder.counterParty;
            this.duration = builder.duration;
            this.extension = builder.extension;
            this.instanceId = builder.instanceId;
            this.mobile = builder.mobile;
            this.outboundScenario = builder.outboundScenario;
            this.skillGroupIdList = builder.skillGroupIdList;
            this.skillGroupNameList = builder.skillGroupNameList;
            this.state = builder.state;
            this.stateCode = builder.stateCode;
            this.stateTime = builder.stateTime;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
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
         * @return breakCode
         */
        public String getBreakCode() {
            return this.breakCode;
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return counterParty
         */
        public String getCounterParty() {
            return this.counterParty;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return outboundScenario
         */
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        /**
         * @return skillGroupIdList
         */
        public java.util.List<String> getSkillGroupIdList() {
            return this.skillGroupIdList;
        }

        /**
         * @return skillGroupNameList
         */
        public java.util.List<String> getSkillGroupNameList() {
            return this.skillGroupNameList;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateCode
         */
        public String getStateCode() {
            return this.stateCode;
        }

        /**
         * @return stateTime
         */
        public Long getStateTime() {
            return this.stateTime;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String breakCode; 
            private String callType; 
            private String counterParty; 
            private Long duration; 
            private String extension; 
            private String instanceId; 
            private String mobile; 
            private Boolean outboundScenario; 
            private java.util.List<String> skillGroupIdList; 
            private java.util.List<String> skillGroupNameList; 
            private String state; 
            private String stateCode; 
            private Long stateTime; 
            private String workMode; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.breakCode = model.breakCode;
                this.callType = model.callType;
                this.counterParty = model.counterParty;
                this.duration = model.duration;
                this.extension = model.extension;
                this.instanceId = model.instanceId;
                this.mobile = model.mobile;
                this.outboundScenario = model.outboundScenario;
                this.skillGroupIdList = model.skillGroupIdList;
                this.skillGroupNameList = model.skillGroupNameList;
                this.state = model.state;
                this.stateCode = model.stateCode;
                this.stateTime = model.stateTime;
                this.workMode = model.workMode;
            } 

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent1@ccc-test</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>Agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>坐席小王</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>Break code.</p>
             * <p><strong>Enumeration values:</strong></p>
             * <ul>
             * <li><p>RingingTimeout: Break caused by agent ringing timeout.</p>
             * </li>
             * <li><p>RejectCall: Break caused by agent call rejection.</p>
             * </li>
             * <li><p>Warm-up: Temporary break state after the agent is published and before becoming idle.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Warm-up</p>
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * <p>Call type.</p>
             * 
             * <strong>example:</strong>
             * <p>Outbound</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>Used in specific three-party scenarios, primarily for listener, coaching, and consultation. In three-party scenarios, it represents the third party—for example, the agent being monitored or coached in a listener or coaching scenario, or the agent or external number to which a call is transferred in a consultation scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder counterParty(String counterParty) {
                this.counterParty = counterParty;
                return this;
            }

            /**
             * <p>Duration of the current status, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The agent\&quot;s extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>80317391</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The agent\&quot;s personal phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1382114****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>Whether the agent is in outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder outboundScenario(Boolean outboundScenario) {
                this.outboundScenario = outboundScenario;
                return this;
            }

            /**
             * <p>List of skill group IDs that the agent has signed into.</p>
             */
            public Builder skillGroupIdList(java.util.List<String> skillGroupIdList) {
                this.skillGroupIdList = skillGroupIdList;
                return this;
            }

            /**
             * <p>List of skill group names that the agent has signed into.</p>
             */
            public Builder skillGroupNameList(java.util.List<String> skillGroupNameList) {
                this.skillGroupNameList = skillGroupNameList;
                return this;
            }

            /**
             * <p>Agent status.</p>
             * 
             * <strong>example:</strong>
             * <p>ACW</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Sub-status. In some scenarios, the agent\&quot;s status cannot be fully represented by the State field alone, so a sub-status is required for clarification. For example, when an agent is being monitored, State=Talking and StateCode=Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>Monitored</p>
             */
            public Builder stateCode(String stateCode) {
                this.stateCode = stateCode;
                return this;
            }

            /**
             * <p>Time when the status started.</p>
             * 
             * <strong>example:</strong>
             * <p>1696670640774</p>
             */
            public Builder stateTime(Long stateTime) {
                this.stateTime = stateTime;
                return this;
            }

            /**
             * <p>Work mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ON_SITE</p>
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealtimeAgentStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeAgentStatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>List of real-time agent status data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
