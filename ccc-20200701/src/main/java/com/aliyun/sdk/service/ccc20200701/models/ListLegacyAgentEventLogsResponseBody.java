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
 * {@link ListLegacyAgentEventLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLegacyAgentEventLogsResponseBody</p>
 */
public class ListLegacyAgentEventLogsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListLegacyAgentEventLogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLegacyAgentEventLogsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListLegacyAgentEventLogsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>2802EE59-3B53-513A-A130-85E480AF689D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLegacyAgentEventLogsResponseBody build() {
            return new ListLegacyAgentEventLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLegacyAgentEventLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLegacyAgentEventLogsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentDropCall")
        private String agentDropCall;

        @com.aliyun.core.annotation.NameInMap("AgentNo")
        private String agentNo;

        @com.aliyun.core.annotation.NameInMap("CallDir")
        private String callDir;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallMode")
        private String callMode;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CalleeId")
        private String calleeId;

        @com.aliyun.core.annotation.NameInMap("CallerId")
        private String callerId;

        @com.aliyun.core.annotation.NameInMap("ConnId")
        private String connId;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("GroupNo")
        private String groupNo;

        @com.aliyun.core.annotation.NameInMap("OutboundScenario")
        private Boolean outboundScenario;

        @com.aliyun.core.annotation.NameInMap("PhoneNo")
        private String phoneNo;

        @com.aliyun.core.annotation.NameInMap("StatisticDate")
        private String statisticDate;

        @com.aliyun.core.annotation.NameInMap("TargetRequest")
        private String targetRequest;

        @com.aliyun.core.annotation.NameInMap("TargetSelect")
        private String targetSelect;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TransferNumber")
        private String transferNumber;

        private List(Builder builder) {
            this.agentDropCall = builder.agentDropCall;
            this.agentNo = builder.agentNo;
            this.callDir = builder.callDir;
            this.callId = builder.callId;
            this.callMode = builder.callMode;
            this.callType = builder.callType;
            this.calleeId = builder.calleeId;
            this.callerId = builder.callerId;
            this.connId = builder.connId;
            this.event = builder.event;
            this.groupNo = builder.groupNo;
            this.outboundScenario = builder.outboundScenario;
            this.phoneNo = builder.phoneNo;
            this.statisticDate = builder.statisticDate;
            this.targetRequest = builder.targetRequest;
            this.targetSelect = builder.targetSelect;
            this.tenantId = builder.tenantId;
            this.transferNumber = builder.transferNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentDropCall
         */
        public String getAgentDropCall() {
            return this.agentDropCall;
        }

        /**
         * @return agentNo
         */
        public String getAgentNo() {
            return this.agentNo;
        }

        /**
         * @return callDir
         */
        public String getCallDir() {
            return this.callDir;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callMode
         */
        public String getCallMode() {
            return this.callMode;
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return calleeId
         */
        public String getCalleeId() {
            return this.calleeId;
        }

        /**
         * @return callerId
         */
        public String getCallerId() {
            return this.callerId;
        }

        /**
         * @return connId
         */
        public String getConnId() {
            return this.connId;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return groupNo
         */
        public String getGroupNo() {
            return this.groupNo;
        }

        /**
         * @return outboundScenario
         */
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        /**
         * @return phoneNo
         */
        public String getPhoneNo() {
            return this.phoneNo;
        }

        /**
         * @return statisticDate
         */
        public String getStatisticDate() {
            return this.statisticDate;
        }

        /**
         * @return targetRequest
         */
        public String getTargetRequest() {
            return this.targetRequest;
        }

        /**
         * @return targetSelect
         */
        public String getTargetSelect() {
            return this.targetSelect;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return transferNumber
         */
        public String getTransferNumber() {
            return this.transferNumber;
        }

        public static final class Builder {
            private String agentDropCall; 
            private String agentNo; 
            private String callDir; 
            private String callId; 
            private String callMode; 
            private String callType; 
            private String calleeId; 
            private String callerId; 
            private String connId; 
            private String event; 
            private String groupNo; 
            private Boolean outboundScenario; 
            private String phoneNo; 
            private String statisticDate; 
            private String targetRequest; 
            private String targetSelect; 
            private String tenantId; 
            private String transferNumber; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentDropCall = model.agentDropCall;
                this.agentNo = model.agentNo;
                this.callDir = model.callDir;
                this.callId = model.callId;
                this.callMode = model.callMode;
                this.callType = model.callType;
                this.calleeId = model.calleeId;
                this.callerId = model.callerId;
                this.connId = model.connId;
                this.event = model.event;
                this.groupNo = model.groupNo;
                this.outboundScenario = model.outboundScenario;
                this.phoneNo = model.phoneNo;
                this.statisticDate = model.statisticDate;
                this.targetRequest = model.targetRequest;
                this.targetSelect = model.targetSelect;
                this.tenantId = model.tenantId;
                this.transferNumber = model.transferNumber;
            } 

            /**
             * <p>Indicates whether the agent hung up the call.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder agentDropCall(String agentDropCall) {
                this.agentDropCall = agentDropCall;
                return this;
            }

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder agentNo(String agentNo) {
                this.agentNo = agentNo;
                return this;
            }

            /**
             * <p>Call direction.</p>
             * 
             * <strong>example:</strong>
             * <p>内部</p>
             */
            public Builder callDir(String callDir) {
                this.callDir = callDir;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>378654****</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>Call pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>呼入</p>
             */
            public Builder callMode(String callMode) {
                this.callMode = callMode;
                return this;
            }

            /**
             * <p>Call type.</p>
             * 
             * <strong>example:</strong>
             * <p>呼入</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>Callee number.</p>
             * 
             * <strong>example:</strong>
             * <p>1312343****</p>
             */
            public Builder calleeId(String calleeId) {
                this.calleeId = calleeId;
                return this;
            }

            /**
             * <p>Calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>08331111****</p>
             */
            public Builder callerId(String callerId) {
                this.callerId = callerId;
                return this;
            }

            /**
             * <p>Call channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>345467****</p>
             */
            public Builder connId(String connId) {
                this.connId = connId;
                return this;
            }

            /**
             * <p>Type of management event.</p>
             * 
             * <strong>example:</strong>
             * <p>拨号</p>
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * <p>List of skill group IDs that the agent signed in to. Separate multiple skill group IDs with commas.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup1@ccc-test,skillgroup2@ccc-test</p>
             */
            public Builder groupNo(String groupNo) {
                this.groupNo = groupNo;
                return this;
            }

            /**
             * <p>Indicates whether the agent is in outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder outboundScenario(Boolean outboundScenario) {
                this.outboundScenario = outboundScenario;
                return this;
            }

            /**
             * <p>Agent extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>8012****</p>
             */
            public Builder phoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
                return this;
            }

            /**
             * <p>Statistics timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-03T10:15:30</p>
             */
            public Builder statisticDate(String statisticDate) {
                this.statisticDate = statisticDate;
                return this;
            }

            /**
             * <p>Skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder targetRequest(String targetRequest) {
                this.targetRequest = targetRequest;
                return this;
            }

            /**
             * <p>Skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder targetSelect(String targetSelect) {
                this.targetSelect = targetSelect;
                return this;
            }

            /**
             * <p>Tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acc101</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Transfer number.</p>
             * 
             * <strong>example:</strong>
             * <p>07518888****</p>
             */
            public Builder transferNumber(String transferNumber) {
                this.transferNumber = transferNumber;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLegacyAgentEventLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLegacyAgentEventLogsResponseBody</p>
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
             * <p>List of agent event logs.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number, ranging from 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size, ranging from 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
