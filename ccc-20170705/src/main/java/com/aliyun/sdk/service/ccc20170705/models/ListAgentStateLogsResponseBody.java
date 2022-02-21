// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentStateLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentStateLogsResponseBody</p>
 */
public class ListAgentStateLogsResponseBody extends TeaModel {
    @NameInMap("AgentStateLogPage")
    private AgentStateLogPage agentStateLogPage;

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

    private ListAgentStateLogsResponseBody(Builder builder) {
        this.agentStateLogPage = builder.agentStateLogPage;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentStateLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return agentStateLogPage
     */
    public AgentStateLogPage getAgentStateLogPage() {
        return this.agentStateLogPage;
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
        private AgentStateLogPage agentStateLogPage; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AgentStateLogPage.
         */
        public Builder agentStateLogPage(AgentStateLogPage agentStateLogPage) {
            this.agentStateLogPage = agentStateLogPage;
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

        public ListAgentStateLogsResponseBody build() {
            return new ListAgentStateLogsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ConnectId")
        private String connectId;

        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("CounterParty")
        private String counterParty;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RamId")
        private Long ramId;

        @NameInMap("SkillGroupIds")
        private String skillGroupIds;

        @NameInMap("State")
        private String state;

        @NameInMap("StateCode")
        private String stateCode;

        @NameInMap("StateTime")
        private Long stateTime;

        private List(Builder builder) {
            this.connectId = builder.connectId;
            this.contactId = builder.contactId;
            this.counterParty = builder.counterParty;
            this.instanceId = builder.instanceId;
            this.ramId = builder.ramId;
            this.skillGroupIds = builder.skillGroupIds;
            this.state = builder.state;
            this.stateCode = builder.stateCode;
            this.stateTime = builder.stateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return connectId
         */
        public String getConnectId() {
            return this.connectId;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return counterParty
         */
        public String getCounterParty() {
            return this.counterParty;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
        public String getSkillGroupIds() {
            return this.skillGroupIds;
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

        public static final class Builder {
            private String connectId; 
            private String contactId; 
            private String counterParty; 
            private String instanceId; 
            private Long ramId; 
            private String skillGroupIds; 
            private String state; 
            private String stateCode; 
            private Long stateTime; 

            /**
             * ConnectId.
             */
            public Builder connectId(String connectId) {
                this.connectId = connectId;
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
             * CounterParty.
             */
            public Builder counterParty(String counterParty) {
                this.counterParty = counterParty;
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
             * RamId.
             */
            public Builder ramId(Long ramId) {
                this.ramId = ramId;
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

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class AgentStateLogPage extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private AgentStateLogPage(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStateLogPage create() {
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

            public AgentStateLogPage build() {
                return new AgentStateLogPage(this);
            } 

        } 

    }
}
