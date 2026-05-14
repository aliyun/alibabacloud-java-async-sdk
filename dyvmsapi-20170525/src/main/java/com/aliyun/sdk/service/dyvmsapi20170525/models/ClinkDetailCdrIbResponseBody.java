// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkDetailCdrIbResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkDetailCdrIbResponseBody</p>
 */
public class ClinkDetailCdrIbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkDetailCdrIbResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkDetailCdrIbResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkDetailCdrIbResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ClinkDetailCdrIbResponseBody build() {
            return new ClinkDetailCdrIbResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkDetailCdrIbResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDetailCdrIbResponseBody</p>
     */
    public static class Investigation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InvestigationName")
        private String investigationName;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private Long keys;

        @com.aliyun.core.annotation.NameInMap("MultiKeys")
        private String multiKeys;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Investigation(Builder builder) {
            this.clientName = builder.clientName;
            this.cno = builder.cno;
            this.endTime = builder.endTime;
            this.investigationName = builder.investigationName;
            this.keys = builder.keys;
            this.multiKeys = builder.multiKeys;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Investigation create() {
            return builder().build();
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return investigationName
         */
        public String getInvestigationName() {
            return this.investigationName;
        }

        /**
         * @return keys
         */
        public Long getKeys() {
            return this.keys;
        }

        /**
         * @return multiKeys
         */
        public String getMultiKeys() {
            return this.multiKeys;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String clientName; 
            private String cno; 
            private Long endTime; 
            private String investigationName; 
            private Long keys; 
            private String multiKeys; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Investigation model) {
                this.clientName = model.clientName;
                this.cno = model.cno;
                this.endTime = model.endTime;
                this.investigationName = model.investigationName;
                this.keys = model.keys;
                this.multiKeys = model.multiKeys;
                this.startTime = model.startTime;
            } 

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * <p>座席号</p>
             * 
             * <strong>example:</strong>
             * <p>11221</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1731483979</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>满意度导航</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder investigationName(String investigationName) {
                this.investigationName = investigationName;
                return this;
            }

            /**
             * <p>按键值</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder keys(Long keys) {
                this.keys = keys;
                return this;
            }

            /**
             * <p>多按键值</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder multiKeys(String multiKeys) {
                this.multiKeys = multiKeys;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1731483974</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Investigation build() {
                return new Investigation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkDetailCdrIbResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDetailCdrIbResponseBody</p>
     */
    public static class IvrFlows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private Long action;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private Long name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("PathName")
        private String pathName;

        @com.aliyun.core.annotation.NameInMap("PressKey")
        private String pressKey;

        @com.aliyun.core.annotation.NameInMap("PressTime")
        private Long pressTime;

        @com.aliyun.core.annotation.NameInMap("RouterEndTime")
        private Long routerEndTime;

        @com.aliyun.core.annotation.NameInMap("RouterName")
        private Long routerName;

        @com.aliyun.core.annotation.NameInMap("RouterStartTime")
        private Long routerStartTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private IvrFlows(Builder builder) {
            this.action = builder.action;
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.path = builder.path;
            this.pathName = builder.pathName;
            this.pressKey = builder.pressKey;
            this.pressTime = builder.pressTime;
            this.routerEndTime = builder.routerEndTime;
            this.routerName = builder.routerName;
            this.routerStartTime = builder.routerStartTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IvrFlows create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public Long getAction() {
            return this.action;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return name
         */
        public Long getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return pathName
         */
        public String getPathName() {
            return this.pathName;
        }

        /**
         * @return pressKey
         */
        public String getPressKey() {
            return this.pressKey;
        }

        /**
         * @return pressTime
         */
        public Long getPressTime() {
            return this.pressTime;
        }

        /**
         * @return routerEndTime
         */
        public Long getRouterEndTime() {
            return this.routerEndTime;
        }

        /**
         * @return routerName
         */
        public Long getRouterName() {
            return this.routerName;
        }

        /**
         * @return routerStartTime
         */
        public Long getRouterStartTime() {
            return this.routerStartTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long action; 
            private Long endTime; 
            private Long name; 
            private String path; 
            private String pathName; 
            private String pressKey; 
            private Long pressTime; 
            private Long routerEndTime; 
            private Long routerName; 
            private Long routerStartTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(IvrFlows model) {
                this.action = model.action;
                this.endTime = model.endTime;
                this.name = model.name;
                this.path = model.path;
                this.pathName = model.pathName;
                this.pressKey = model.pressKey;
                this.pressTime = model.pressTime;
                this.routerEndTime = model.routerEndTime;
                this.routerName = model.routerName;
                this.routerStartTime = model.routerStartTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>执行动作</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder action(Long action) {
                this.action = action;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1731483927</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>ivr 名称</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder name(Long name) {
                this.name = name;
                return this;
            }

            /**
             * <p>节点 id</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>节点名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder pathName(String pathName) {
                this.pathName = pathName;
                return this;
            }

            /**
             * <p>按键值</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder pressKey(String pressKey) {
                this.pressKey = pressKey;
                return this;
            }

            /**
             * <p>按键时间</p>
             * 
             * <strong>example:</strong>
             * <p>1731483814</p>
             */
            public Builder pressTime(Long pressTime) {
                this.pressTime = pressTime;
                return this;
            }

            /**
             * <p>路由结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1731483897</p>
             */
            public Builder routerEndTime(Long routerEndTime) {
                this.routerEndTime = routerEndTime;
                return this;
            }

            /**
             * <p>路由名称</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder routerName(Long routerName) {
                this.routerName = routerName;
                return this;
            }

            /**
             * <p>路由开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1731483814</p>
             */
            public Builder routerStartTime(Long routerStartTime) {
                this.routerStartTime = routerStartTime;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1731483814</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public IvrFlows build() {
                return new IvrFlows(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkDetailCdrIbResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDetailCdrIbResponseBody</p>
     */
    public static class CdrIbDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAnswerInTime")
        private String agentAnswerInTime;

        @com.aliyun.core.annotation.NameInMap("BindType")
        private Long bindType;

        @com.aliyun.core.annotation.NameInMap("BridgeDuration")
        private Long bridgeDuration;

        @com.aliyun.core.annotation.NameInMap("BridgeTime")
        private Long bridgeTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CustomerCity")
        private String customerCity;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("CustomerNumberEncrypt")
        private String customerNumberEncrypt;

        @com.aliyun.core.annotation.NameInMap("CustomerProvince")
        private String customerProvince;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Evaluation")
        private String evaluation;

        @com.aliyun.core.annotation.NameInMap("FirstCallCname")
        private String firstCallCname;

        @com.aliyun.core.annotation.NameInMap("FirstCallCno")
        private String firstCallCno;

        @com.aliyun.core.annotation.NameInMap("FirstCallNumber")
        private String firstCallNumber;

        @com.aliyun.core.annotation.NameInMap("FirstCallQname")
        private String firstCallQname;

        @com.aliyun.core.annotation.NameInMap("FirstCallQno")
        private String firstCallQno;

        @com.aliyun.core.annotation.NameInMap("FirstJoinQueueTime")
        private Long firstJoinQueueTime;

        @com.aliyun.core.annotation.NameInMap("FirstLeaveQueueTime")
        private Long firstLeaveQueueTime;

        @com.aliyun.core.annotation.NameInMap("FirstQueueDuration")
        private Long firstQueueDuration;

        @com.aliyun.core.annotation.NameInMap("Hotline")
        private String hotline;

        @com.aliyun.core.annotation.NameInMap("HotlineName")
        private String hotlineName;

        @com.aliyun.core.annotation.NameInMap("Investigation")
        private Investigation investigation;

        @com.aliyun.core.annotation.NameInMap("InvestigationKeys")
        private Long investigationKeys;

        @com.aliyun.core.annotation.NameInMap("IvrFlows")
        private java.util.List<IvrFlows> ivrFlows;

        @com.aliyun.core.annotation.NameInMap("IvrName")
        private String ivrName;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("MarkData")
        private String markData;

        @com.aliyun.core.annotation.NameInMap("OnHookSource")
        private String onHookSource;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("RtcUid")
        private String rtcUid;

        @com.aliyun.core.annotation.NameInMap("SayVoiceDuration")
        private Long sayVoiceDuration;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusResult")
        private String statusResult;

        @com.aliyun.core.annotation.NameInMap("StatusRobot")
        private String statusRobot;

        @com.aliyun.core.annotation.NameInMap("TagNames")
        private java.util.List<String> tagNames;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("UserField")
        private String userField;

        @com.aliyun.core.annotation.NameInMap("WebrtcCallId")
        private String webrtcCallId;

        @com.aliyun.core.annotation.NameInMap("Xnumber")
        private String xnumber;

        private CdrIbDetail(Builder builder) {
            this.agentAnswerInTime = builder.agentAnswerInTime;
            this.bindType = builder.bindType;
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeTime = builder.bridgeTime;
            this.callId = builder.callId;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerNumberEncrypt = builder.customerNumberEncrypt;
            this.customerProvince = builder.customerProvince;
            this.endTime = builder.endTime;
            this.evaluation = builder.evaluation;
            this.firstCallCname = builder.firstCallCname;
            this.firstCallCno = builder.firstCallCno;
            this.firstCallNumber = builder.firstCallNumber;
            this.firstCallQname = builder.firstCallQname;
            this.firstCallQno = builder.firstCallQno;
            this.firstJoinQueueTime = builder.firstJoinQueueTime;
            this.firstLeaveQueueTime = builder.firstLeaveQueueTime;
            this.firstQueueDuration = builder.firstQueueDuration;
            this.hotline = builder.hotline;
            this.hotlineName = builder.hotlineName;
            this.investigation = builder.investigation;
            this.investigationKeys = builder.investigationKeys;
            this.ivrFlows = builder.ivrFlows;
            this.ivrName = builder.ivrName;
            this.mainUniqueId = builder.mainUniqueId;
            this.markData = builder.markData;
            this.onHookSource = builder.onHookSource;
            this.recordFile = builder.recordFile;
            this.rtcUid = builder.rtcUid;
            this.sayVoiceDuration = builder.sayVoiceDuration;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusResult = builder.statusResult;
            this.statusRobot = builder.statusRobot;
            this.tagNames = builder.tagNames;
            this.totalDuration = builder.totalDuration;
            this.userField = builder.userField;
            this.webrtcCallId = builder.webrtcCallId;
            this.xnumber = builder.xnumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdrIbDetail create() {
            return builder().build();
        }

        /**
         * @return agentAnswerInTime
         */
        public String getAgentAnswerInTime() {
            return this.agentAnswerInTime;
        }

        /**
         * @return bindType
         */
        public Long getBindType() {
            return this.bindType;
        }

        /**
         * @return bridgeDuration
         */
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        /**
         * @return bridgeTime
         */
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return customerCity
         */
        public String getCustomerCity() {
            return this.customerCity;
        }

        /**
         * @return customerNumber
         */
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        /**
         * @return customerNumberEncrypt
         */
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        /**
         * @return customerProvince
         */
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return evaluation
         */
        public String getEvaluation() {
            return this.evaluation;
        }

        /**
         * @return firstCallCname
         */
        public String getFirstCallCname() {
            return this.firstCallCname;
        }

        /**
         * @return firstCallCno
         */
        public String getFirstCallCno() {
            return this.firstCallCno;
        }

        /**
         * @return firstCallNumber
         */
        public String getFirstCallNumber() {
            return this.firstCallNumber;
        }

        /**
         * @return firstCallQname
         */
        public String getFirstCallQname() {
            return this.firstCallQname;
        }

        /**
         * @return firstCallQno
         */
        public String getFirstCallQno() {
            return this.firstCallQno;
        }

        /**
         * @return firstJoinQueueTime
         */
        public Long getFirstJoinQueueTime() {
            return this.firstJoinQueueTime;
        }

        /**
         * @return firstLeaveQueueTime
         */
        public Long getFirstLeaveQueueTime() {
            return this.firstLeaveQueueTime;
        }

        /**
         * @return firstQueueDuration
         */
        public Long getFirstQueueDuration() {
            return this.firstQueueDuration;
        }

        /**
         * @return hotline
         */
        public String getHotline() {
            return this.hotline;
        }

        /**
         * @return hotlineName
         */
        public String getHotlineName() {
            return this.hotlineName;
        }

        /**
         * @return investigation
         */
        public Investigation getInvestigation() {
            return this.investigation;
        }

        /**
         * @return investigationKeys
         */
        public Long getInvestigationKeys() {
            return this.investigationKeys;
        }

        /**
         * @return ivrFlows
         */
        public java.util.List<IvrFlows> getIvrFlows() {
            return this.ivrFlows;
        }

        /**
         * @return ivrName
         */
        public String getIvrName() {
            return this.ivrName;
        }

        /**
         * @return mainUniqueId
         */
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        /**
         * @return markData
         */
        public String getMarkData() {
            return this.markData;
        }

        /**
         * @return onHookSource
         */
        public String getOnHookSource() {
            return this.onHookSource;
        }

        /**
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return rtcUid
         */
        public String getRtcUid() {
            return this.rtcUid;
        }

        /**
         * @return sayVoiceDuration
         */
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusResult
         */
        public String getStatusResult() {
            return this.statusResult;
        }

        /**
         * @return statusRobot
         */
        public String getStatusRobot() {
            return this.statusRobot;
        }

        /**
         * @return tagNames
         */
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return userField
         */
        public String getUserField() {
            return this.userField;
        }

        /**
         * @return webrtcCallId
         */
        public String getWebrtcCallId() {
            return this.webrtcCallId;
        }

        /**
         * @return xnumber
         */
        public String getXnumber() {
            return this.xnumber;
        }

        public static final class Builder {
            private String agentAnswerInTime; 
            private Long bindType; 
            private Long bridgeDuration; 
            private Long bridgeTime; 
            private String callId; 
            private String customerCity; 
            private String customerNumber; 
            private String customerNumberEncrypt; 
            private String customerProvince; 
            private Long endTime; 
            private String evaluation; 
            private String firstCallCname; 
            private String firstCallCno; 
            private String firstCallNumber; 
            private String firstCallQname; 
            private String firstCallQno; 
            private Long firstJoinQueueTime; 
            private Long firstLeaveQueueTime; 
            private Long firstQueueDuration; 
            private String hotline; 
            private String hotlineName; 
            private Investigation investigation; 
            private Long investigationKeys; 
            private java.util.List<IvrFlows> ivrFlows; 
            private String ivrName; 
            private String mainUniqueId; 
            private String markData; 
            private String onHookSource; 
            private String recordFile; 
            private String rtcUid; 
            private Long sayVoiceDuration; 
            private Long startTime; 
            private String status; 
            private String statusResult; 
            private String statusRobot; 
            private java.util.List<String> tagNames; 
            private Long totalDuration; 
            private String userField; 
            private String webrtcCallId; 
            private String xnumber; 

            private Builder() {
            } 

            private Builder(CdrIbDetail model) {
                this.agentAnswerInTime = model.agentAnswerInTime;
                this.bindType = model.bindType;
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeTime = model.bridgeTime;
                this.callId = model.callId;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerNumberEncrypt = model.customerNumberEncrypt;
                this.customerProvince = model.customerProvince;
                this.endTime = model.endTime;
                this.evaluation = model.evaluation;
                this.firstCallCname = model.firstCallCname;
                this.firstCallCno = model.firstCallCno;
                this.firstCallNumber = model.firstCallNumber;
                this.firstCallQname = model.firstCallQname;
                this.firstCallQno = model.firstCallQno;
                this.firstJoinQueueTime = model.firstJoinQueueTime;
                this.firstLeaveQueueTime = model.firstLeaveQueueTime;
                this.firstQueueDuration = model.firstQueueDuration;
                this.hotline = model.hotline;
                this.hotlineName = model.hotlineName;
                this.investigation = model.investigation;
                this.investigationKeys = model.investigationKeys;
                this.ivrFlows = model.ivrFlows;
                this.ivrName = model.ivrName;
                this.mainUniqueId = model.mainUniqueId;
                this.markData = model.markData;
                this.onHookSource = model.onHookSource;
                this.recordFile = model.recordFile;
                this.rtcUid = model.rtcUid;
                this.sayVoiceDuration = model.sayVoiceDuration;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusResult = model.statusResult;
                this.statusRobot = model.statusRobot;
                this.tagNames = model.tagNames;
                this.totalDuration = model.totalDuration;
                this.userField = model.userField;
                this.webrtcCallId = model.webrtcCallId;
                this.xnumber = model.xnumber;
            } 

            /**
             * <p>首次及时应答</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder agentAnswerInTime(String agentAnswerInTime) {
                this.agentAnswerInTime = agentAnswerInTime;
                return this;
            }

            /**
             * <p>接听设备</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bindType(Long bindType) {
                this.bindType = bindType;
                return this;
            }

            /**
             * <p>通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder bridgeDuration(Long bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>首次接听时间</p>
             * 
             * <strong>example:</strong>
             * <p>1713848599</p>
             */
            public Builder bridgeTime(Long bridgeTime) {
                this.bridgeTime = bridgeTime;
                return this;
            }

            /**
             * <p>CallID</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>客户号码城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder customerCity(String customerCity) {
                this.customerCity = customerCity;
                return this;
            }

            /**
             * <p>客户号码</p>
             * 
             * <strong>example:</strong>
             * <p>138xxxx8888</p>
             */
            public Builder customerNumber(String customerNumber) {
                this.customerNumber = customerNumber;
                return this;
            }

            /**
             * <p>客户号码加密串</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerNumberEncrypt(String customerNumberEncrypt) {
                this.customerNumberEncrypt = customerNumberEncrypt;
                return this;
            }

            /**
             * <p>客户号码省份</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder customerProvince(String customerProvince) {
                this.customerProvince = customerProvince;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1713848599</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>是否邀评</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder evaluation(String evaluation) {
                this.evaluation = evaluation;
                return this;
            }

            /**
             * <p>首呼座席姓名</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder firstCallCname(String firstCallCname) {
                this.firstCallCname = firstCallCname;
                return this;
            }

            /**
             * <p>首呼座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>2233</p>
             */
            public Builder firstCallCno(String firstCallCno) {
                this.firstCallCno = firstCallCno;
                return this;
            }

            /**
             * <p>首呼座席电话</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder firstCallNumber(String firstCallNumber) {
                this.firstCallNumber = firstCallNumber;
                return this;
            }

            /**
             * <p>首呼队列名称</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder firstCallQname(String firstCallQname) {
                this.firstCallQname = firstCallQname;
                return this;
            }

            /**
             * <p>首呼队列号</p>
             * 
             * <strong>example:</strong>
             * <p>223</p>
             */
            public Builder firstCallQno(String firstCallQno) {
                this.firstCallQno = firstCallQno;
                return this;
            }

            /**
             * <p>首次进入队列时间</p>
             * 
             * <strong>example:</strong>
             * <p>1713848594</p>
             */
            public Builder firstJoinQueueTime(Long firstJoinQueueTime) {
                this.firstJoinQueueTime = firstJoinQueueTime;
                return this;
            }

            /**
             * <p>首次离开队列时间</p>
             * 
             * <strong>example:</strong>
             * <p>1713848595</p>
             */
            public Builder firstLeaveQueueTime(Long firstLeaveQueueTime) {
                this.firstLeaveQueueTime = firstLeaveQueueTime;
                return this;
            }

            /**
             * <p>首呼队列排队时长</p>
             * 
             * <strong>example:</strong>
             * <p>12233</p>
             */
            public Builder firstQueueDuration(Long firstQueueDuration) {
                this.firstQueueDuration = firstQueueDuration;
                return this;
            }

            /**
             * <p>热线号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder hotline(String hotline) {
                this.hotline = hotline;
                return this;
            }

            /**
             * <p>热线别名</p>
             * 
             * <strong>example:</strong>
             * <p>hotline3</p>
             */
            public Builder hotlineName(String hotlineName) {
                this.hotlineName = hotlineName;
                return this;
            }

            /**
             * <p>[满意度记录] #满意度记录</p>
             */
            public Builder investigation(Investigation investigation) {
                this.investigation = investigation;
                return this;
            }

            /**
             * <p>满意度评价</p>
             * 
             * <strong>example:</strong>
             * <p>38</p>
             */
            public Builder investigationKeys(Long investigationKeys) {
                this.investigationKeys = investigationKeys;
                return this;
            }

            /**
             * <p>[路由和IVR] #路由和IVR</p>
             */
            public Builder ivrFlows(java.util.List<IvrFlows> ivrFlows) {
                this.ivrFlows = ivrFlows;
                return this;
            }

            /**
             * <p>IVR名称</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder ivrName(String ivrName) {
                this.ivrName = ivrName;
                return this;
            }

            /**
             * <p>通话ID</p>
             * 
             * <strong>example:</strong>
             * <p>medias_1-162046xxxx.12</p>
             */
            public Builder mainUniqueId(String mainUniqueId) {
                this.mainUniqueId = mainUniqueId;
                return this;
            }

            /**
             * <p>备注</p>
             * 
             * <strong>example:</strong>
             * <p>mark</p>
             */
            public Builder markData(String markData) {
                this.markData = markData;
                return this;
            }

            /**
             * <p>挂断方</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder onHookSource(String onHookSource) {
                this.onHookSource = onHookSource;
                return this;
            }

            /**
             * <p>录音文件</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder recordFile(String recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>rtcUid</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder rtcUid(String rtcUid) {
                this.rtcUid = rtcUid;
                return this;
            }

            /**
             * <p>语音播报时长</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sayVoiceDuration(Long sayVoiceDuration) {
                this.sayVoiceDuration = sayVoiceDuration;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1713848570</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>接听状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder statusResult(String statusResult) {
                this.statusResult = statusResult;
                return this;
            }

            /**
             * <p>机器人接听状态</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder statusRobot(String statusRobot) {
                this.statusRobot = statusRobot;
                return this;
            }

            /**
             * <p>通话标签</p>
             */
            public Builder tagNames(java.util.List<String> tagNames) {
                this.tagNames = tagNames;
                return this;
            }

            /**
             * <p>总时长</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>自定义字段</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder userField(String userField) {
                this.userField = userField;
                return this;
            }

            /**
             * <p>WebRTCCallID</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder webrtcCallId(String webrtcCallId) {
                this.webrtcCallId = webrtcCallId;
                return this;
            }

            /**
             * <p>虚拟号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder xnumber(String xnumber) {
                this.xnumber = xnumber;
                return this;
            }

            public CdrIbDetail build() {
                return new CdrIbDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkDetailCdrIbResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDetailCdrIbResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdrIbDetail")
        private java.util.List<CdrIbDetail> cdrIbDetail;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        private Data(Builder builder) {
            this.cdrIbDetail = builder.cdrIbDetail;
            this.clinkRequestId = builder.clinkRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cdrIbDetail
         */
        public java.util.List<CdrIbDetail> getCdrIbDetail() {
            return this.cdrIbDetail;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public static final class Builder {
            private java.util.List<CdrIbDetail> cdrIbDetail; 
            private String clinkRequestId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdrIbDetail = model.cdrIbDetail;
                this.clinkRequestId = model.clinkRequestId;
            } 

            /**
             * <p>[客户来电记录详情] #客户来电记录详情</p>
             */
            public Builder cdrIbDetail(java.util.List<CdrIbDetail> cdrIbDetail) {
                this.cdrIbDetail = cdrIbDetail;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
