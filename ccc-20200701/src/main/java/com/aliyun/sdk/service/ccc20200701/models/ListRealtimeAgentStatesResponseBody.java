// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
        private java.util.List < String > skillGroupIdList;

        @com.aliyun.core.annotation.NameInMap("SkillGroupNameList")
        private java.util.List < String > skillGroupNameList;

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
        public java.util.List < String > getSkillGroupIdList() {
            return this.skillGroupIdList;
        }

        /**
         * @return skillGroupNameList
         */
        public java.util.List < String > getSkillGroupNameList() {
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
            private String callType; 
            private String counterParty; 
            private Long duration; 
            private String extension; 
            private String instanceId; 
            private String mobile; 
            private Boolean outboundScenario; 
            private java.util.List < String > skillGroupIdList; 
            private java.util.List < String > skillGroupNameList; 
            private String state; 
            private String stateCode; 
            private Long stateTime; 
            private String workMode; 

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
             * CallType.
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * CounterParty.
             */
            public Builder counterParty(String counterParty) {
                this.counterParty = counterParty;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
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
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * OutboundScenario.
             */
            public Builder outboundScenario(Boolean outboundScenario) {
                this.outboundScenario = outboundScenario;
                return this;
            }

            /**
             * SkillGroupIdList.
             */
            public Builder skillGroupIdList(java.util.List < String > skillGroupIdList) {
                this.skillGroupIdList = skillGroupIdList;
                return this;
            }

            /**
             * SkillGroupNameList.
             */
            public Builder skillGroupNameList(java.util.List < String > skillGroupNameList) {
                this.skillGroupNameList = skillGroupNameList;
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
             * StateCode.
             */
            public Builder stateCode(String stateCode) {
                this.stateCode = stateCode;
                return this;
            }

            /**
             * StateTime.
             */
            public Builder stateTime(Long stateTime) {
                this.stateTime = stateTime;
                return this;
            }

            /**
             * WorkMode.
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
        private java.util.List < List> list;

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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
