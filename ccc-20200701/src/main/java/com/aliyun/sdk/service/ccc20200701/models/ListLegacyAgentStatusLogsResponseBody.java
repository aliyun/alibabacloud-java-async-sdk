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
 * {@link ListLegacyAgentStatusLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLegacyAgentStatusLogsResponseBody</p>
 */
public class ListLegacyAgentStatusLogsResponseBody extends TeaModel {
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

    private ListLegacyAgentStatusLogsResponseBody(Builder builder) {
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

    public static ListLegacyAgentStatusLogsResponseBody create() {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLegacyAgentStatusLogsResponseBody build() {
            return new ListLegacyAgentStatusLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLegacyAgentStatusLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLegacyAgentStatusLogsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentDropCall")
        private String agentDropCall;

        @com.aliyun.core.annotation.NameInMap("AgentNo")
        private String agentNo;

        @com.aliyun.core.annotation.NameInMap("AliHangupCause")
        private String aliHangupCause;

        @com.aliyun.core.annotation.NameInMap("CallDir")
        private String callDir;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CalleeId")
        private String calleeId;

        @com.aliyun.core.annotation.NameInMap("CallerId")
        private String callerId;

        @com.aliyun.core.annotation.NameInMap("ConnId")
        private String connId;

        @com.aliyun.core.annotation.NameInMap("Extend1")
        private String extend1;

        @com.aliyun.core.annotation.NameInMap("Extend2")
        private String extend2;

        @com.aliyun.core.annotation.NameInMap("Extend3")
        private String extend3;

        @com.aliyun.core.annotation.NameInMap("Extend4")
        private String extend4;

        @com.aliyun.core.annotation.NameInMap("GroupNo")
        private String groupNo;

        @com.aliyun.core.annotation.NameInMap("MonitedAgentNo")
        private String monitedAgentNo;

        @com.aliyun.core.annotation.NameInMap("MonitedAgentPhoneNo")
        private String monitedAgentPhoneNo;

        @com.aliyun.core.annotation.NameInMap("OutboundScenario")
        private Boolean outboundScenario;

        @com.aliyun.core.annotation.NameInMap("PhoneNo")
        private String phoneNo;

        @com.aliyun.core.annotation.NameInMap("StatisticDate")
        private String statisticDate;

        @com.aliyun.core.annotation.NameInMap("StatisticTime")
        private Integer statisticTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetRequest")
        private String targetRequest;

        @com.aliyun.core.annotation.NameInMap("TargetSelect")
        private String targetSelect;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TransferNo")
        private String transferNo;

        @com.aliyun.core.annotation.NameInMap("TransferNumber")
        private String transferNumber;

        private List(Builder builder) {
            this.agentDropCall = builder.agentDropCall;
            this.agentNo = builder.agentNo;
            this.aliHangupCause = builder.aliHangupCause;
            this.callDir = builder.callDir;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.calleeId = builder.calleeId;
            this.callerId = builder.callerId;
            this.connId = builder.connId;
            this.extend1 = builder.extend1;
            this.extend2 = builder.extend2;
            this.extend3 = builder.extend3;
            this.extend4 = builder.extend4;
            this.groupNo = builder.groupNo;
            this.monitedAgentNo = builder.monitedAgentNo;
            this.monitedAgentPhoneNo = builder.monitedAgentPhoneNo;
            this.outboundScenario = builder.outboundScenario;
            this.phoneNo = builder.phoneNo;
            this.statisticDate = builder.statisticDate;
            this.statisticTime = builder.statisticTime;
            this.status = builder.status;
            this.targetRequest = builder.targetRequest;
            this.targetSelect = builder.targetSelect;
            this.tenantId = builder.tenantId;
            this.transferNo = builder.transferNo;
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
         * @return aliHangupCause
         */
        public String getAliHangupCause() {
            return this.aliHangupCause;
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
         * @return extend1
         */
        public String getExtend1() {
            return this.extend1;
        }

        /**
         * @return extend2
         */
        public String getExtend2() {
            return this.extend2;
        }

        /**
         * @return extend3
         */
        public String getExtend3() {
            return this.extend3;
        }

        /**
         * @return extend4
         */
        public String getExtend4() {
            return this.extend4;
        }

        /**
         * @return groupNo
         */
        public String getGroupNo() {
            return this.groupNo;
        }

        /**
         * @return monitedAgentNo
         */
        public String getMonitedAgentNo() {
            return this.monitedAgentNo;
        }

        /**
         * @return monitedAgentPhoneNo
         */
        public String getMonitedAgentPhoneNo() {
            return this.monitedAgentPhoneNo;
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
         * @return statisticTime
         */
        public Integer getStatisticTime() {
            return this.statisticTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return transferNo
         */
        public String getTransferNo() {
            return this.transferNo;
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
            private String aliHangupCause; 
            private String callDir; 
            private String callId; 
            private String callType; 
            private String calleeId; 
            private String callerId; 
            private String connId; 
            private String extend1; 
            private String extend2; 
            private String extend3; 
            private String extend4; 
            private String groupNo; 
            private String monitedAgentNo; 
            private String monitedAgentPhoneNo; 
            private Boolean outboundScenario; 
            private String phoneNo; 
            private String statisticDate; 
            private Integer statisticTime; 
            private String status; 
            private String targetRequest; 
            private String targetSelect; 
            private String tenantId; 
            private String transferNo; 
            private String transferNumber; 

            /**
             * AgentDropCall.
             */
            public Builder agentDropCall(String agentDropCall) {
                this.agentDropCall = agentDropCall;
                return this;
            }

            /**
             * AgentNo.
             */
            public Builder agentNo(String agentNo) {
                this.agentNo = agentNo;
                return this;
            }

            /**
             * AliHangupCause.
             */
            public Builder aliHangupCause(String aliHangupCause) {
                this.aliHangupCause = aliHangupCause;
                return this;
            }

            /**
             * CallDir.
             */
            public Builder callDir(String callDir) {
                this.callDir = callDir;
                return this;
            }

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
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
             * CalleeId.
             */
            public Builder calleeId(String calleeId) {
                this.calleeId = calleeId;
                return this;
            }

            /**
             * CallerId.
             */
            public Builder callerId(String callerId) {
                this.callerId = callerId;
                return this;
            }

            /**
             * ConnId.
             */
            public Builder connId(String connId) {
                this.connId = connId;
                return this;
            }

            /**
             * Extend1.
             */
            public Builder extend1(String extend1) {
                this.extend1 = extend1;
                return this;
            }

            /**
             * Extend2.
             */
            public Builder extend2(String extend2) {
                this.extend2 = extend2;
                return this;
            }

            /**
             * Extend3.
             */
            public Builder extend3(String extend3) {
                this.extend3 = extend3;
                return this;
            }

            /**
             * Extend4.
             */
            public Builder extend4(String extend4) {
                this.extend4 = extend4;
                return this;
            }

            /**
             * GroupNo.
             */
            public Builder groupNo(String groupNo) {
                this.groupNo = groupNo;
                return this;
            }

            /**
             * MonitedAgentNo.
             */
            public Builder monitedAgentNo(String monitedAgentNo) {
                this.monitedAgentNo = monitedAgentNo;
                return this;
            }

            /**
             * MonitedAgentPhoneNo.
             */
            public Builder monitedAgentPhoneNo(String monitedAgentPhoneNo) {
                this.monitedAgentPhoneNo = monitedAgentPhoneNo;
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
             * PhoneNo.
             */
            public Builder phoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
                return this;
            }

            /**
             * StatisticDate.
             */
            public Builder statisticDate(String statisticDate) {
                this.statisticDate = statisticDate;
                return this;
            }

            /**
             * StatisticTime.
             */
            public Builder statisticTime(Integer statisticTime) {
                this.statisticTime = statisticTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TargetRequest.
             */
            public Builder targetRequest(String targetRequest) {
                this.targetRequest = targetRequest;
                return this;
            }

            /**
             * TargetSelect.
             */
            public Builder targetSelect(String targetSelect) {
                this.targetSelect = targetSelect;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TransferNo.
             */
            public Builder transferNo(String transferNo) {
                this.transferNo = transferNo;
                return this;
            }

            /**
             * TransferNumber.
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
     * {@link ListLegacyAgentStatusLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLegacyAgentStatusLogsResponseBody</p>
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

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
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
