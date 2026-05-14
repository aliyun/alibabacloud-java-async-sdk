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
 * {@link CloudAgentWorkloadReportResponseBody} extends {@link TeaModel}
 *
 * <p>CloudAgentWorkloadReportResponseBody</p>
 */
public class CloudAgentWorkloadReportResponseBody extends TeaModel {
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

    private CloudAgentWorkloadReportResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudAgentWorkloadReportResponseBody create() {
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

        private Builder(CloudAgentWorkloadReportResponseBody model) {
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

        public CloudAgentWorkloadReportResponseBody build() {
            return new CloudAgentWorkloadReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudAgentWorkloadReportResponseBody} extends {@link TeaModel}
     *
     * <p>CloudAgentWorkloadReportResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAnswerRate")
        private String agentAnswerRate;

        @com.aliyun.core.annotation.NameInMap("AgentCreateTime")
        private String agentCreateTime;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AgentRate")
        private String agentRate;

        @com.aliyun.core.annotation.NameInMap("AgentStopTime")
        private String agentStopTime;

        @com.aliyun.core.annotation.NameInMap("AvgIdleTime")
        private String avgIdleTime;

        @com.aliyun.core.annotation.NameInMap("AvgPauseTime")
        private String avgPauseTime;

        @com.aliyun.core.annotation.NameInMap("AvgPreviewObWaitTime")
        private String avgPreviewObWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgRestTime")
        private String avgRestTime;

        @com.aliyun.core.annotation.NameInMap("CallUtilization")
        private String callUtilization;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DateTimeRange")
        private String dateTimeRange;

        @com.aliyun.core.annotation.NameInMap("Day")
        private String day;

        @com.aliyun.core.annotation.NameInMap("DirectObAnsweredCount")
        private String directObAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("DirectObAnsweredDurationArray")
        private String directObAnsweredDurationArray;

        @com.aliyun.core.annotation.NameInMap("DirectObAnsweredDurationDscArray")
        private java.util.List<String> directObAnsweredDurationDscArray;

        @com.aliyun.core.annotation.NameInMap("DirectObBridgeDuration")
        private String directObBridgeDuration;

        @com.aliyun.core.annotation.NameInMap("DirectObBridgeTime")
        private String directObBridgeTime;

        @com.aliyun.core.annotation.NameInMap("DirectObConsultCount")
        private String directObConsultCount;

        @com.aliyun.core.annotation.NameInMap("DirectObMonitorBargeCount")
        private String directObMonitorBargeCount;

        @com.aliyun.core.annotation.NameInMap("DirectObMonitorDisconnectCount")
        private String directObMonitorDisconnectCount;

        @com.aliyun.core.annotation.NameInMap("DirectObMonitorSpyCount")
        private String directObMonitorSpyCount;

        @com.aliyun.core.annotation.NameInMap("DirectObMonitorThreewayCount")
        private String directObMonitorThreewayCount;

        @com.aliyun.core.annotation.NameInMap("DirectObMonitorWhisperCount")
        private String directObMonitorWhisperCount;

        @com.aliyun.core.annotation.NameInMap("DirectObTotalCount")
        private String directObTotalCount;

        @com.aliyun.core.annotation.NameInMap("DirectObTotalTime")
        private String directObTotalTime;

        @com.aliyun.core.annotation.NameInMap("DirectObTransferCount")
        private String directObTransferCount;

        @com.aliyun.core.annotation.NameInMap("DirectObValidCalls")
        private String directObValidCalls;

        @com.aliyun.core.annotation.NameInMap("DirectObValidTotalBridgeTime")
        private String directObValidTotalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("HoursUtilization")
        private String hoursUtilization;

        @com.aliyun.core.annotation.NameInMap("IbAgentHangupCount")
        private String ibAgentHangupCount;

        @com.aliyun.core.annotation.NameInMap("IbAgentRefuseCount")
        private String ibAgentRefuseCount;

        @com.aliyun.core.annotation.NameInMap("IbAnsweredCount")
        private String ibAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbAnsweredDurationArray")
        private java.util.List<String> ibAnsweredDurationArray;

        @com.aliyun.core.annotation.NameInMap("IbAnsweredDurationDscArray")
        private java.util.List<String> ibAnsweredDurationDscArray;

        @com.aliyun.core.annotation.NameInMap("IbAvgAnswerDelayTime")
        private String ibAvgAnswerDelayTime;

        @com.aliyun.core.annotation.NameInMap("IbAvgBridgeTime")
        private String ibAvgBridgeTime;

        @com.aliyun.core.annotation.NameInMap("IbAvgCallingTime")
        private String ibAvgCallingTime;

        @com.aliyun.core.annotation.NameInMap("IbAvgHoldTime")
        private String ibAvgHoldTime;

        @com.aliyun.core.annotation.NameInMap("IbAvgWrapupTime")
        private String ibAvgWrapupTime;

        @com.aliyun.core.annotation.NameInMap("IbBridgeCount")
        private String ibBridgeCount;

        @com.aliyun.core.annotation.NameInMap("IbBridgeMinute")
        private String ibBridgeMinute;

        @com.aliyun.core.annotation.NameInMap("IbBridgeTime")
        private String ibBridgeTime;

        @com.aliyun.core.annotation.NameInMap("IbCallingCount")
        private String ibCallingCount;

        @com.aliyun.core.annotation.NameInMap("IbCallingTime")
        private String ibCallingTime;

        @com.aliyun.core.annotation.NameInMap("IbConsultCount")
        private String ibConsultCount;

        @com.aliyun.core.annotation.NameInMap("IbCustomerHangupCount")
        private String ibCustomerHangupCount;

        @com.aliyun.core.annotation.NameInMap("IbHoldCount")
        private String ibHoldCount;

        @com.aliyun.core.annotation.NameInMap("IbHoldTime")
        private String ibHoldTime;

        @com.aliyun.core.annotation.NameInMap("IbMaxAnswerDelayTime")
        private String ibMaxAnswerDelayTime;

        @com.aliyun.core.annotation.NameInMap("IbMaxBridgeTime")
        private String ibMaxBridgeTime;

        @com.aliyun.core.annotation.NameInMap("IbMaxCallingTime")
        private String ibMaxCallingTime;

        @com.aliyun.core.annotation.NameInMap("IbMaxHoldTime")
        private String ibMaxHoldTime;

        @com.aliyun.core.annotation.NameInMap("IbMaxWrapupTime")
        private String ibMaxWrapupTime;

        @com.aliyun.core.annotation.NameInMap("IbMinAnswerDelayTime")
        private String ibMinAnswerDelayTime;

        @com.aliyun.core.annotation.NameInMap("IbMinBridgeTime")
        private String ibMinBridgeTime;

        @com.aliyun.core.annotation.NameInMap("IbMinCallingTime")
        private String ibMinCallingTime;

        @com.aliyun.core.annotation.NameInMap("IbMinHoldTime")
        private String ibMinHoldTime;

        @com.aliyun.core.annotation.NameInMap("IbMinWrapupTime")
        private String ibMinWrapupTime;

        @com.aliyun.core.annotation.NameInMap("IbMonitorBargeCount")
        private String ibMonitorBargeCount;

        @com.aliyun.core.annotation.NameInMap("IbMonitorBargeDuration")
        private String ibMonitorBargeDuration;

        @com.aliyun.core.annotation.NameInMap("IbMonitorDisconnectCount")
        private String ibMonitorDisconnectCount;

        @com.aliyun.core.annotation.NameInMap("IbMonitorPickupCount")
        private String ibMonitorPickupCount;

        @com.aliyun.core.annotation.NameInMap("IbMonitorPickupDuration")
        private String ibMonitorPickupDuration;

        @com.aliyun.core.annotation.NameInMap("IbMonitorSpyCount")
        private String ibMonitorSpyCount;

        @com.aliyun.core.annotation.NameInMap("IbMonitorSpyDuration")
        private String ibMonitorSpyDuration;

        @com.aliyun.core.annotation.NameInMap("IbMonitorThreewayCount")
        private String ibMonitorThreewayCount;

        @com.aliyun.core.annotation.NameInMap("IbMonitorWhisperCount")
        private String ibMonitorWhisperCount;

        @com.aliyun.core.annotation.NameInMap("IbMonitorWhisperDuration")
        private String ibMonitorWhisperDuration;

        @com.aliyun.core.annotation.NameInMap("IbTotalAnswerDelayTime")
        private String ibTotalAnswerDelayTime;

        @com.aliyun.core.annotation.NameInMap("IbTotalCount")
        private String ibTotalCount;

        @com.aliyun.core.annotation.NameInMap("IbTotalMinute")
        private String ibTotalMinute;

        @com.aliyun.core.annotation.NameInMap("IbTotalTime")
        private String ibTotalTime;

        @com.aliyun.core.annotation.NameInMap("IbTransferCount")
        private String ibTransferCount;

        @com.aliyun.core.annotation.NameInMap("IbUnansweredCount")
        private String ibUnansweredCount;

        @com.aliyun.core.annotation.NameInMap("IbUniqueAnsweredCount")
        private String ibUniqueAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("IbUniqueTotalCount")
        private String ibUniqueTotalCount;

        @com.aliyun.core.annotation.NameInMap("IbUniqueUnansweredCount")
        private String ibUniqueUnansweredCount;

        @com.aliyun.core.annotation.NameInMap("IbValidCalls")
        private String ibValidCalls;

        @com.aliyun.core.annotation.NameInMap("IbValidTotalBridgeTime")
        private String ibValidTotalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("IbWrapupCount")
        private String ibWrapupCount;

        @com.aliyun.core.annotation.NameInMap("IbWrapupTime")
        private String ibWrapupTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdleCount")
        private String idleCount;

        @com.aliyun.core.annotation.NameInMap("IdleTime")
        private String idleTime;

        @com.aliyun.core.annotation.NameInMap("IvrTransferBridgeCount")
        private String ivrTransferBridgeCount;

        @com.aliyun.core.annotation.NameInMap("IvrTransferBridgeDuration")
        private String ivrTransferBridgeDuration;

        @com.aliyun.core.annotation.NameInMap("IvrTransferCount")
        private String ivrTransferCount;

        @com.aliyun.core.annotation.NameInMap("LoginTime")
        private String loginTime;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private String maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("MaxPauseTime")
        private String maxPauseTime;

        @com.aliyun.core.annotation.NameInMap("MaxRestTime")
        private String maxRestTime;

        @com.aliyun.core.annotation.NameInMap("MinIdleTime")
        private String minIdleTime;

        @com.aliyun.core.annotation.NameInMap("MinPauseTime")
        private String minPauseTime;

        @com.aliyun.core.annotation.NameInMap("MinRestTime")
        private String minRestTime;

        @com.aliyun.core.annotation.NameInMap("ObAvgBridgeTime")
        private String obAvgBridgeTime;

        @com.aliyun.core.annotation.NameInMap("ObAvgCallingTime")
        private String obAvgCallingTime;

        @com.aliyun.core.annotation.NameInMap("ObAvgHoldTime")
        private String obAvgHoldTime;

        @com.aliyun.core.annotation.NameInMap("ObAvgWrapupTime")
        private String obAvgWrapupTime;

        @com.aliyun.core.annotation.NameInMap("ObBridgeCount")
        private String obBridgeCount;

        @com.aliyun.core.annotation.NameInMap("ObBridgeTime")
        private String obBridgeTime;

        @com.aliyun.core.annotation.NameInMap("ObCallingCount")
        private String obCallingCount;

        @com.aliyun.core.annotation.NameInMap("ObCallingTime")
        private String obCallingTime;

        @com.aliyun.core.annotation.NameInMap("ObHoldCount")
        private String obHoldCount;

        @com.aliyun.core.annotation.NameInMap("ObHoldTime")
        private String obHoldTime;

        @com.aliyun.core.annotation.NameInMap("ObMaxBridgeTime")
        private String obMaxBridgeTime;

        @com.aliyun.core.annotation.NameInMap("ObMaxCallingTime")
        private String obMaxCallingTime;

        @com.aliyun.core.annotation.NameInMap("ObMaxHoldTime")
        private String obMaxHoldTime;

        @com.aliyun.core.annotation.NameInMap("ObMaxWrapupTime")
        private String obMaxWrapupTime;

        @com.aliyun.core.annotation.NameInMap("ObMinBridgeTime")
        private String obMinBridgeTime;

        @com.aliyun.core.annotation.NameInMap("ObMinCallingTime")
        private String obMinCallingTime;

        @com.aliyun.core.annotation.NameInMap("ObMinHoldTime")
        private String obMinHoldTime;

        @com.aliyun.core.annotation.NameInMap("ObMinWrapupTime")
        private String obMinWrapupTime;

        @com.aliyun.core.annotation.NameInMap("ObRealBridgeTime")
        private String obRealBridgeTime;

        @com.aliyun.core.annotation.NameInMap("ObWrapupCount")
        private String obWrapupCount;

        @com.aliyun.core.annotation.NameInMap("ObWrapupTime")
        private String obWrapupTime;

        @com.aliyun.core.annotation.NameInMap("PauseCount")
        private String pauseCount;

        @com.aliyun.core.annotation.NameInMap("PauseTime")
        private String pauseTime;

        @com.aliyun.core.annotation.NameInMap("PredictObAgentAnsweredHour")
        private String predictObAgentAnsweredHour;

        @com.aliyun.core.annotation.NameInMap("PredictObAgentAnsweredTime")
        private Long predictObAgentAnsweredTime;

        @com.aliyun.core.annotation.NameInMap("PredictObAnsweredCount")
        private Long predictObAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("PredictObAnsweredDurationArray")
        private String predictObAnsweredDurationArray;

        @com.aliyun.core.annotation.NameInMap("PredictObConsultCount")
        private String predictObConsultCount;

        @com.aliyun.core.annotation.NameInMap("PredictObMonitorBargeCount")
        private String predictObMonitorBargeCount;

        @com.aliyun.core.annotation.NameInMap("PredictObMonitorBargeDuration")
        private String predictObMonitorBargeDuration;

        @com.aliyun.core.annotation.NameInMap("PredictObMonitorDisconnectCount")
        private String predictObMonitorDisconnectCount;

        @com.aliyun.core.annotation.NameInMap("PredictObMonitorSpyCount")
        private String predictObMonitorSpyCount;

        @com.aliyun.core.annotation.NameInMap("PredictObMonitorSpyDuration")
        private String predictObMonitorSpyDuration;

        @com.aliyun.core.annotation.NameInMap("PredictObMonitorThreewayCount")
        private String predictObMonitorThreewayCount;

        @com.aliyun.core.annotation.NameInMap("PredictObMonitorWhisperCount")
        private String predictObMonitorWhisperCount;

        @com.aliyun.core.annotation.NameInMap("PredictObMonitorWhisperDuration")
        private String predictObMonitorWhisperDuration;

        @com.aliyun.core.annotation.NameInMap("PredictObTotalCount")
        private Long predictObTotalCount;

        @com.aliyun.core.annotation.NameInMap("PredictObTransferCount")
        private String predictObTransferCount;

        @com.aliyun.core.annotation.NameInMap("PredictObValidCalls")
        private Long predictObValidCalls;

        @com.aliyun.core.annotation.NameInMap("PredictObValidTotalBridgeHour")
        private String predictObValidTotalBridgeHour;

        @com.aliyun.core.annotation.NameInMap("PredictObValidTotalBridgeTime")
        private Long predictObValidTotalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("PreviewAgentAnswerdRate")
        private String previewAgentAnswerdRate;

        @com.aliyun.core.annotation.NameInMap("PreviewCustomerAnswerdRate")
        private String previewCustomerAnswerdRate;

        @com.aliyun.core.annotation.NameInMap("PreviewObAgentAnsweredCount")
        private String previewObAgentAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObAgentAnsweredTime")
        private String previewObAgentAnsweredTime;

        @com.aliyun.core.annotation.NameInMap("PreviewObAnsweredCount")
        private String previewObAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObAnsweredDurationArray")
        private java.util.List<String> previewObAnsweredDurationArray;

        @com.aliyun.core.annotation.NameInMap("PreviewObAnsweredDurationDscArray")
        private java.util.List<String> previewObAnsweredDurationDscArray;

        @com.aliyun.core.annotation.NameInMap("PreviewObConsultCount")
        private String previewObConsultCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObCustomerAnsweredTime")
        private String previewObCustomerAnsweredTime;

        @com.aliyun.core.annotation.NameInMap("PreviewObCustomerRingingCount")
        private String previewObCustomerRingingCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObCustomerRingingRate")
        private String previewObCustomerRingingRate;

        @com.aliyun.core.annotation.NameInMap("PreviewObMonitorBargeCount")
        private String previewObMonitorBargeCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObMonitorBargeDuration")
        private String previewObMonitorBargeDuration;

        @com.aliyun.core.annotation.NameInMap("PreviewObMonitorDisconnectCount")
        private String previewObMonitorDisconnectCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObMonitorSpyCount")
        private String previewObMonitorSpyCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObMonitorSpyDuration")
        private String previewObMonitorSpyDuration;

        @com.aliyun.core.annotation.NameInMap("PreviewObMonitorThreewayCount")
        private String previewObMonitorThreewayCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObMonitorWhisperCount")
        private String previewObMonitorWhisperCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObMonitorWhisperDuration")
        private String previewObMonitorWhisperDuration;

        @com.aliyun.core.annotation.NameInMap("PreviewObTotalBridgeHour")
        private String previewObTotalBridgeHour;

        @com.aliyun.core.annotation.NameInMap("PreviewObTotalBridgeTime")
        private String previewObTotalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("PreviewObTotalCount")
        private String previewObTotalCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObTransferBridgeCount")
        private String previewObTransferBridgeCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObTransferBridgeDuration")
        private String previewObTransferBridgeDuration;

        @com.aliyun.core.annotation.NameInMap("PreviewObTransferCount")
        private String previewObTransferCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObValidCalls")
        private String previewObValidCalls;

        @com.aliyun.core.annotation.NameInMap("PreviewObValidTotalBridgeHour")
        private String previewObValidTotalBridgeHour;

        @com.aliyun.core.annotation.NameInMap("PreviewObValidTotalBridgeTime")
        private String previewObValidTotalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RestCount")
        private String restCount;

        @com.aliyun.core.annotation.NameInMap("RestTime")
        private String restTime;

        @com.aliyun.core.annotation.NameInMap("RowName")
        private String rowName;

        @com.aliyun.core.annotation.NameInMap("TotalBridgeTime")
        private String totalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("WebcallObAgentAnsweredTime")
        private String webcallObAgentAnsweredTime;

        @com.aliyun.core.annotation.NameInMap("WebcallObAnsweredCount")
        private String webcallObAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("WebcallObAnsweredDurationArray")
        private String webcallObAnsweredDurationArray;

        @com.aliyun.core.annotation.NameInMap("WebcallObConsultCount")
        private String webcallObConsultCount;

        @com.aliyun.core.annotation.NameInMap("WebcallObMonitorBargeCount")
        private String webcallObMonitorBargeCount;

        @com.aliyun.core.annotation.NameInMap("WebcallObMonitorBargeDuration")
        private String webcallObMonitorBargeDuration;

        @com.aliyun.core.annotation.NameInMap("WebcallObMonitorDisconnectCount")
        private String webcallObMonitorDisconnectCount;

        @com.aliyun.core.annotation.NameInMap("WebcallObMonitorSpyCount")
        private String webcallObMonitorSpyCount;

        @com.aliyun.core.annotation.NameInMap("WebcallObMonitorSpyDuration")
        private String webcallObMonitorSpyDuration;

        @com.aliyun.core.annotation.NameInMap("WebcallObMonitorThreewayCount")
        private String webcallObMonitorThreewayCount;

        @com.aliyun.core.annotation.NameInMap("WebcallObMonitorWhisperCount")
        private String webcallObMonitorWhisperCount;

        @com.aliyun.core.annotation.NameInMap("WebcallObMonitorWhisperDuration")
        private String webcallObMonitorWhisperDuration;

        @com.aliyun.core.annotation.NameInMap("WebcallObTotalCount")
        private String webcallObTotalCount;

        @com.aliyun.core.annotation.NameInMap("WebcallObTransferCount")
        private String webcallObTransferCount;

        private List(Builder builder) {
            this.agentAnswerRate = builder.agentAnswerRate;
            this.agentCreateTime = builder.agentCreateTime;
            this.agentName = builder.agentName;
            this.agentRate = builder.agentRate;
            this.agentStopTime = builder.agentStopTime;
            this.avgIdleTime = builder.avgIdleTime;
            this.avgPauseTime = builder.avgPauseTime;
            this.avgPreviewObWaitTime = builder.avgPreviewObWaitTime;
            this.avgRestTime = builder.avgRestTime;
            this.callUtilization = builder.callUtilization;
            this.cno = builder.cno;
            this.createTime = builder.createTime;
            this.dateTimeRange = builder.dateTimeRange;
            this.day = builder.day;
            this.directObAnsweredCount = builder.directObAnsweredCount;
            this.directObAnsweredDurationArray = builder.directObAnsweredDurationArray;
            this.directObAnsweredDurationDscArray = builder.directObAnsweredDurationDscArray;
            this.directObBridgeDuration = builder.directObBridgeDuration;
            this.directObBridgeTime = builder.directObBridgeTime;
            this.directObConsultCount = builder.directObConsultCount;
            this.directObMonitorBargeCount = builder.directObMonitorBargeCount;
            this.directObMonitorDisconnectCount = builder.directObMonitorDisconnectCount;
            this.directObMonitorSpyCount = builder.directObMonitorSpyCount;
            this.directObMonitorThreewayCount = builder.directObMonitorThreewayCount;
            this.directObMonitorWhisperCount = builder.directObMonitorWhisperCount;
            this.directObTotalCount = builder.directObTotalCount;
            this.directObTotalTime = builder.directObTotalTime;
            this.directObTransferCount = builder.directObTransferCount;
            this.directObValidCalls = builder.directObValidCalls;
            this.directObValidTotalBridgeTime = builder.directObValidTotalBridgeTime;
            this.enterpriseId = builder.enterpriseId;
            this.hoursUtilization = builder.hoursUtilization;
            this.ibAgentHangupCount = builder.ibAgentHangupCount;
            this.ibAgentRefuseCount = builder.ibAgentRefuseCount;
            this.ibAnsweredCount = builder.ibAnsweredCount;
            this.ibAnsweredDurationArray = builder.ibAnsweredDurationArray;
            this.ibAnsweredDurationDscArray = builder.ibAnsweredDurationDscArray;
            this.ibAvgAnswerDelayTime = builder.ibAvgAnswerDelayTime;
            this.ibAvgBridgeTime = builder.ibAvgBridgeTime;
            this.ibAvgCallingTime = builder.ibAvgCallingTime;
            this.ibAvgHoldTime = builder.ibAvgHoldTime;
            this.ibAvgWrapupTime = builder.ibAvgWrapupTime;
            this.ibBridgeCount = builder.ibBridgeCount;
            this.ibBridgeMinute = builder.ibBridgeMinute;
            this.ibBridgeTime = builder.ibBridgeTime;
            this.ibCallingCount = builder.ibCallingCount;
            this.ibCallingTime = builder.ibCallingTime;
            this.ibConsultCount = builder.ibConsultCount;
            this.ibCustomerHangupCount = builder.ibCustomerHangupCount;
            this.ibHoldCount = builder.ibHoldCount;
            this.ibHoldTime = builder.ibHoldTime;
            this.ibMaxAnswerDelayTime = builder.ibMaxAnswerDelayTime;
            this.ibMaxBridgeTime = builder.ibMaxBridgeTime;
            this.ibMaxCallingTime = builder.ibMaxCallingTime;
            this.ibMaxHoldTime = builder.ibMaxHoldTime;
            this.ibMaxWrapupTime = builder.ibMaxWrapupTime;
            this.ibMinAnswerDelayTime = builder.ibMinAnswerDelayTime;
            this.ibMinBridgeTime = builder.ibMinBridgeTime;
            this.ibMinCallingTime = builder.ibMinCallingTime;
            this.ibMinHoldTime = builder.ibMinHoldTime;
            this.ibMinWrapupTime = builder.ibMinWrapupTime;
            this.ibMonitorBargeCount = builder.ibMonitorBargeCount;
            this.ibMonitorBargeDuration = builder.ibMonitorBargeDuration;
            this.ibMonitorDisconnectCount = builder.ibMonitorDisconnectCount;
            this.ibMonitorPickupCount = builder.ibMonitorPickupCount;
            this.ibMonitorPickupDuration = builder.ibMonitorPickupDuration;
            this.ibMonitorSpyCount = builder.ibMonitorSpyCount;
            this.ibMonitorSpyDuration = builder.ibMonitorSpyDuration;
            this.ibMonitorThreewayCount = builder.ibMonitorThreewayCount;
            this.ibMonitorWhisperCount = builder.ibMonitorWhisperCount;
            this.ibMonitorWhisperDuration = builder.ibMonitorWhisperDuration;
            this.ibTotalAnswerDelayTime = builder.ibTotalAnswerDelayTime;
            this.ibTotalCount = builder.ibTotalCount;
            this.ibTotalMinute = builder.ibTotalMinute;
            this.ibTotalTime = builder.ibTotalTime;
            this.ibTransferCount = builder.ibTransferCount;
            this.ibUnansweredCount = builder.ibUnansweredCount;
            this.ibUniqueAnsweredCount = builder.ibUniqueAnsweredCount;
            this.ibUniqueTotalCount = builder.ibUniqueTotalCount;
            this.ibUniqueUnansweredCount = builder.ibUniqueUnansweredCount;
            this.ibValidCalls = builder.ibValidCalls;
            this.ibValidTotalBridgeTime = builder.ibValidTotalBridgeTime;
            this.ibWrapupCount = builder.ibWrapupCount;
            this.ibWrapupTime = builder.ibWrapupTime;
            this.id = builder.id;
            this.idleCount = builder.idleCount;
            this.idleTime = builder.idleTime;
            this.ivrTransferBridgeCount = builder.ivrTransferBridgeCount;
            this.ivrTransferBridgeDuration = builder.ivrTransferBridgeDuration;
            this.ivrTransferCount = builder.ivrTransferCount;
            this.loginTime = builder.loginTime;
            this.maxIdleTime = builder.maxIdleTime;
            this.maxPauseTime = builder.maxPauseTime;
            this.maxRestTime = builder.maxRestTime;
            this.minIdleTime = builder.minIdleTime;
            this.minPauseTime = builder.minPauseTime;
            this.minRestTime = builder.minRestTime;
            this.obAvgBridgeTime = builder.obAvgBridgeTime;
            this.obAvgCallingTime = builder.obAvgCallingTime;
            this.obAvgHoldTime = builder.obAvgHoldTime;
            this.obAvgWrapupTime = builder.obAvgWrapupTime;
            this.obBridgeCount = builder.obBridgeCount;
            this.obBridgeTime = builder.obBridgeTime;
            this.obCallingCount = builder.obCallingCount;
            this.obCallingTime = builder.obCallingTime;
            this.obHoldCount = builder.obHoldCount;
            this.obHoldTime = builder.obHoldTime;
            this.obMaxBridgeTime = builder.obMaxBridgeTime;
            this.obMaxCallingTime = builder.obMaxCallingTime;
            this.obMaxHoldTime = builder.obMaxHoldTime;
            this.obMaxWrapupTime = builder.obMaxWrapupTime;
            this.obMinBridgeTime = builder.obMinBridgeTime;
            this.obMinCallingTime = builder.obMinCallingTime;
            this.obMinHoldTime = builder.obMinHoldTime;
            this.obMinWrapupTime = builder.obMinWrapupTime;
            this.obRealBridgeTime = builder.obRealBridgeTime;
            this.obWrapupCount = builder.obWrapupCount;
            this.obWrapupTime = builder.obWrapupTime;
            this.pauseCount = builder.pauseCount;
            this.pauseTime = builder.pauseTime;
            this.predictObAgentAnsweredHour = builder.predictObAgentAnsweredHour;
            this.predictObAgentAnsweredTime = builder.predictObAgentAnsweredTime;
            this.predictObAnsweredCount = builder.predictObAnsweredCount;
            this.predictObAnsweredDurationArray = builder.predictObAnsweredDurationArray;
            this.predictObConsultCount = builder.predictObConsultCount;
            this.predictObMonitorBargeCount = builder.predictObMonitorBargeCount;
            this.predictObMonitorBargeDuration = builder.predictObMonitorBargeDuration;
            this.predictObMonitorDisconnectCount = builder.predictObMonitorDisconnectCount;
            this.predictObMonitorSpyCount = builder.predictObMonitorSpyCount;
            this.predictObMonitorSpyDuration = builder.predictObMonitorSpyDuration;
            this.predictObMonitorThreewayCount = builder.predictObMonitorThreewayCount;
            this.predictObMonitorWhisperCount = builder.predictObMonitorWhisperCount;
            this.predictObMonitorWhisperDuration = builder.predictObMonitorWhisperDuration;
            this.predictObTotalCount = builder.predictObTotalCount;
            this.predictObTransferCount = builder.predictObTransferCount;
            this.predictObValidCalls = builder.predictObValidCalls;
            this.predictObValidTotalBridgeHour = builder.predictObValidTotalBridgeHour;
            this.predictObValidTotalBridgeTime = builder.predictObValidTotalBridgeTime;
            this.previewAgentAnswerdRate = builder.previewAgentAnswerdRate;
            this.previewCustomerAnswerdRate = builder.previewCustomerAnswerdRate;
            this.previewObAgentAnsweredCount = builder.previewObAgentAnsweredCount;
            this.previewObAgentAnsweredTime = builder.previewObAgentAnsweredTime;
            this.previewObAnsweredCount = builder.previewObAnsweredCount;
            this.previewObAnsweredDurationArray = builder.previewObAnsweredDurationArray;
            this.previewObAnsweredDurationDscArray = builder.previewObAnsweredDurationDscArray;
            this.previewObConsultCount = builder.previewObConsultCount;
            this.previewObCustomerAnsweredTime = builder.previewObCustomerAnsweredTime;
            this.previewObCustomerRingingCount = builder.previewObCustomerRingingCount;
            this.previewObCustomerRingingRate = builder.previewObCustomerRingingRate;
            this.previewObMonitorBargeCount = builder.previewObMonitorBargeCount;
            this.previewObMonitorBargeDuration = builder.previewObMonitorBargeDuration;
            this.previewObMonitorDisconnectCount = builder.previewObMonitorDisconnectCount;
            this.previewObMonitorSpyCount = builder.previewObMonitorSpyCount;
            this.previewObMonitorSpyDuration = builder.previewObMonitorSpyDuration;
            this.previewObMonitorThreewayCount = builder.previewObMonitorThreewayCount;
            this.previewObMonitorWhisperCount = builder.previewObMonitorWhisperCount;
            this.previewObMonitorWhisperDuration = builder.previewObMonitorWhisperDuration;
            this.previewObTotalBridgeHour = builder.previewObTotalBridgeHour;
            this.previewObTotalBridgeTime = builder.previewObTotalBridgeTime;
            this.previewObTotalCount = builder.previewObTotalCount;
            this.previewObTransferBridgeCount = builder.previewObTransferBridgeCount;
            this.previewObTransferBridgeDuration = builder.previewObTransferBridgeDuration;
            this.previewObTransferCount = builder.previewObTransferCount;
            this.previewObValidCalls = builder.previewObValidCalls;
            this.previewObValidTotalBridgeHour = builder.previewObValidTotalBridgeHour;
            this.previewObValidTotalBridgeTime = builder.previewObValidTotalBridgeTime;
            this.queueName = builder.queueName;
            this.restCount = builder.restCount;
            this.restTime = builder.restTime;
            this.rowName = builder.rowName;
            this.totalBridgeTime = builder.totalBridgeTime;
            this.webcallObAgentAnsweredTime = builder.webcallObAgentAnsweredTime;
            this.webcallObAnsweredCount = builder.webcallObAnsweredCount;
            this.webcallObAnsweredDurationArray = builder.webcallObAnsweredDurationArray;
            this.webcallObConsultCount = builder.webcallObConsultCount;
            this.webcallObMonitorBargeCount = builder.webcallObMonitorBargeCount;
            this.webcallObMonitorBargeDuration = builder.webcallObMonitorBargeDuration;
            this.webcallObMonitorDisconnectCount = builder.webcallObMonitorDisconnectCount;
            this.webcallObMonitorSpyCount = builder.webcallObMonitorSpyCount;
            this.webcallObMonitorSpyDuration = builder.webcallObMonitorSpyDuration;
            this.webcallObMonitorThreewayCount = builder.webcallObMonitorThreewayCount;
            this.webcallObMonitorWhisperCount = builder.webcallObMonitorWhisperCount;
            this.webcallObMonitorWhisperDuration = builder.webcallObMonitorWhisperDuration;
            this.webcallObTotalCount = builder.webcallObTotalCount;
            this.webcallObTransferCount = builder.webcallObTransferCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentAnswerRate
         */
        public String getAgentAnswerRate() {
            return this.agentAnswerRate;
        }

        /**
         * @return agentCreateTime
         */
        public String getAgentCreateTime() {
            return this.agentCreateTime;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return agentRate
         */
        public String getAgentRate() {
            return this.agentRate;
        }

        /**
         * @return agentStopTime
         */
        public String getAgentStopTime() {
            return this.agentStopTime;
        }

        /**
         * @return avgIdleTime
         */
        public String getAvgIdleTime() {
            return this.avgIdleTime;
        }

        /**
         * @return avgPauseTime
         */
        public String getAvgPauseTime() {
            return this.avgPauseTime;
        }

        /**
         * @return avgPreviewObWaitTime
         */
        public String getAvgPreviewObWaitTime() {
            return this.avgPreviewObWaitTime;
        }

        /**
         * @return avgRestTime
         */
        public String getAvgRestTime() {
            return this.avgRestTime;
        }

        /**
         * @return callUtilization
         */
        public String getCallUtilization() {
            return this.callUtilization;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dateTimeRange
         */
        public String getDateTimeRange() {
            return this.dateTimeRange;
        }

        /**
         * @return day
         */
        public String getDay() {
            return this.day;
        }

        /**
         * @return directObAnsweredCount
         */
        public String getDirectObAnsweredCount() {
            return this.directObAnsweredCount;
        }

        /**
         * @return directObAnsweredDurationArray
         */
        public String getDirectObAnsweredDurationArray() {
            return this.directObAnsweredDurationArray;
        }

        /**
         * @return directObAnsweredDurationDscArray
         */
        public java.util.List<String> getDirectObAnsweredDurationDscArray() {
            return this.directObAnsweredDurationDscArray;
        }

        /**
         * @return directObBridgeDuration
         */
        public String getDirectObBridgeDuration() {
            return this.directObBridgeDuration;
        }

        /**
         * @return directObBridgeTime
         */
        public String getDirectObBridgeTime() {
            return this.directObBridgeTime;
        }

        /**
         * @return directObConsultCount
         */
        public String getDirectObConsultCount() {
            return this.directObConsultCount;
        }

        /**
         * @return directObMonitorBargeCount
         */
        public String getDirectObMonitorBargeCount() {
            return this.directObMonitorBargeCount;
        }

        /**
         * @return directObMonitorDisconnectCount
         */
        public String getDirectObMonitorDisconnectCount() {
            return this.directObMonitorDisconnectCount;
        }

        /**
         * @return directObMonitorSpyCount
         */
        public String getDirectObMonitorSpyCount() {
            return this.directObMonitorSpyCount;
        }

        /**
         * @return directObMonitorThreewayCount
         */
        public String getDirectObMonitorThreewayCount() {
            return this.directObMonitorThreewayCount;
        }

        /**
         * @return directObMonitorWhisperCount
         */
        public String getDirectObMonitorWhisperCount() {
            return this.directObMonitorWhisperCount;
        }

        /**
         * @return directObTotalCount
         */
        public String getDirectObTotalCount() {
            return this.directObTotalCount;
        }

        /**
         * @return directObTotalTime
         */
        public String getDirectObTotalTime() {
            return this.directObTotalTime;
        }

        /**
         * @return directObTransferCount
         */
        public String getDirectObTransferCount() {
            return this.directObTransferCount;
        }

        /**
         * @return directObValidCalls
         */
        public String getDirectObValidCalls() {
            return this.directObValidCalls;
        }

        /**
         * @return directObValidTotalBridgeTime
         */
        public String getDirectObValidTotalBridgeTime() {
            return this.directObValidTotalBridgeTime;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return hoursUtilization
         */
        public String getHoursUtilization() {
            return this.hoursUtilization;
        }

        /**
         * @return ibAgentHangupCount
         */
        public String getIbAgentHangupCount() {
            return this.ibAgentHangupCount;
        }

        /**
         * @return ibAgentRefuseCount
         */
        public String getIbAgentRefuseCount() {
            return this.ibAgentRefuseCount;
        }

        /**
         * @return ibAnsweredCount
         */
        public String getIbAnsweredCount() {
            return this.ibAnsweredCount;
        }

        /**
         * @return ibAnsweredDurationArray
         */
        public java.util.List<String> getIbAnsweredDurationArray() {
            return this.ibAnsweredDurationArray;
        }

        /**
         * @return ibAnsweredDurationDscArray
         */
        public java.util.List<String> getIbAnsweredDurationDscArray() {
            return this.ibAnsweredDurationDscArray;
        }

        /**
         * @return ibAvgAnswerDelayTime
         */
        public String getIbAvgAnswerDelayTime() {
            return this.ibAvgAnswerDelayTime;
        }

        /**
         * @return ibAvgBridgeTime
         */
        public String getIbAvgBridgeTime() {
            return this.ibAvgBridgeTime;
        }

        /**
         * @return ibAvgCallingTime
         */
        public String getIbAvgCallingTime() {
            return this.ibAvgCallingTime;
        }

        /**
         * @return ibAvgHoldTime
         */
        public String getIbAvgHoldTime() {
            return this.ibAvgHoldTime;
        }

        /**
         * @return ibAvgWrapupTime
         */
        public String getIbAvgWrapupTime() {
            return this.ibAvgWrapupTime;
        }

        /**
         * @return ibBridgeCount
         */
        public String getIbBridgeCount() {
            return this.ibBridgeCount;
        }

        /**
         * @return ibBridgeMinute
         */
        public String getIbBridgeMinute() {
            return this.ibBridgeMinute;
        }

        /**
         * @return ibBridgeTime
         */
        public String getIbBridgeTime() {
            return this.ibBridgeTime;
        }

        /**
         * @return ibCallingCount
         */
        public String getIbCallingCount() {
            return this.ibCallingCount;
        }

        /**
         * @return ibCallingTime
         */
        public String getIbCallingTime() {
            return this.ibCallingTime;
        }

        /**
         * @return ibConsultCount
         */
        public String getIbConsultCount() {
            return this.ibConsultCount;
        }

        /**
         * @return ibCustomerHangupCount
         */
        public String getIbCustomerHangupCount() {
            return this.ibCustomerHangupCount;
        }

        /**
         * @return ibHoldCount
         */
        public String getIbHoldCount() {
            return this.ibHoldCount;
        }

        /**
         * @return ibHoldTime
         */
        public String getIbHoldTime() {
            return this.ibHoldTime;
        }

        /**
         * @return ibMaxAnswerDelayTime
         */
        public String getIbMaxAnswerDelayTime() {
            return this.ibMaxAnswerDelayTime;
        }

        /**
         * @return ibMaxBridgeTime
         */
        public String getIbMaxBridgeTime() {
            return this.ibMaxBridgeTime;
        }

        /**
         * @return ibMaxCallingTime
         */
        public String getIbMaxCallingTime() {
            return this.ibMaxCallingTime;
        }

        /**
         * @return ibMaxHoldTime
         */
        public String getIbMaxHoldTime() {
            return this.ibMaxHoldTime;
        }

        /**
         * @return ibMaxWrapupTime
         */
        public String getIbMaxWrapupTime() {
            return this.ibMaxWrapupTime;
        }

        /**
         * @return ibMinAnswerDelayTime
         */
        public String getIbMinAnswerDelayTime() {
            return this.ibMinAnswerDelayTime;
        }

        /**
         * @return ibMinBridgeTime
         */
        public String getIbMinBridgeTime() {
            return this.ibMinBridgeTime;
        }

        /**
         * @return ibMinCallingTime
         */
        public String getIbMinCallingTime() {
            return this.ibMinCallingTime;
        }

        /**
         * @return ibMinHoldTime
         */
        public String getIbMinHoldTime() {
            return this.ibMinHoldTime;
        }

        /**
         * @return ibMinWrapupTime
         */
        public String getIbMinWrapupTime() {
            return this.ibMinWrapupTime;
        }

        /**
         * @return ibMonitorBargeCount
         */
        public String getIbMonitorBargeCount() {
            return this.ibMonitorBargeCount;
        }

        /**
         * @return ibMonitorBargeDuration
         */
        public String getIbMonitorBargeDuration() {
            return this.ibMonitorBargeDuration;
        }

        /**
         * @return ibMonitorDisconnectCount
         */
        public String getIbMonitorDisconnectCount() {
            return this.ibMonitorDisconnectCount;
        }

        /**
         * @return ibMonitorPickupCount
         */
        public String getIbMonitorPickupCount() {
            return this.ibMonitorPickupCount;
        }

        /**
         * @return ibMonitorPickupDuration
         */
        public String getIbMonitorPickupDuration() {
            return this.ibMonitorPickupDuration;
        }

        /**
         * @return ibMonitorSpyCount
         */
        public String getIbMonitorSpyCount() {
            return this.ibMonitorSpyCount;
        }

        /**
         * @return ibMonitorSpyDuration
         */
        public String getIbMonitorSpyDuration() {
            return this.ibMonitorSpyDuration;
        }

        /**
         * @return ibMonitorThreewayCount
         */
        public String getIbMonitorThreewayCount() {
            return this.ibMonitorThreewayCount;
        }

        /**
         * @return ibMonitorWhisperCount
         */
        public String getIbMonitorWhisperCount() {
            return this.ibMonitorWhisperCount;
        }

        /**
         * @return ibMonitorWhisperDuration
         */
        public String getIbMonitorWhisperDuration() {
            return this.ibMonitorWhisperDuration;
        }

        /**
         * @return ibTotalAnswerDelayTime
         */
        public String getIbTotalAnswerDelayTime() {
            return this.ibTotalAnswerDelayTime;
        }

        /**
         * @return ibTotalCount
         */
        public String getIbTotalCount() {
            return this.ibTotalCount;
        }

        /**
         * @return ibTotalMinute
         */
        public String getIbTotalMinute() {
            return this.ibTotalMinute;
        }

        /**
         * @return ibTotalTime
         */
        public String getIbTotalTime() {
            return this.ibTotalTime;
        }

        /**
         * @return ibTransferCount
         */
        public String getIbTransferCount() {
            return this.ibTransferCount;
        }

        /**
         * @return ibUnansweredCount
         */
        public String getIbUnansweredCount() {
            return this.ibUnansweredCount;
        }

        /**
         * @return ibUniqueAnsweredCount
         */
        public String getIbUniqueAnsweredCount() {
            return this.ibUniqueAnsweredCount;
        }

        /**
         * @return ibUniqueTotalCount
         */
        public String getIbUniqueTotalCount() {
            return this.ibUniqueTotalCount;
        }

        /**
         * @return ibUniqueUnansweredCount
         */
        public String getIbUniqueUnansweredCount() {
            return this.ibUniqueUnansweredCount;
        }

        /**
         * @return ibValidCalls
         */
        public String getIbValidCalls() {
            return this.ibValidCalls;
        }

        /**
         * @return ibValidTotalBridgeTime
         */
        public String getIbValidTotalBridgeTime() {
            return this.ibValidTotalBridgeTime;
        }

        /**
         * @return ibWrapupCount
         */
        public String getIbWrapupCount() {
            return this.ibWrapupCount;
        }

        /**
         * @return ibWrapupTime
         */
        public String getIbWrapupTime() {
            return this.ibWrapupTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idleCount
         */
        public String getIdleCount() {
            return this.idleCount;
        }

        /**
         * @return idleTime
         */
        public String getIdleTime() {
            return this.idleTime;
        }

        /**
         * @return ivrTransferBridgeCount
         */
        public String getIvrTransferBridgeCount() {
            return this.ivrTransferBridgeCount;
        }

        /**
         * @return ivrTransferBridgeDuration
         */
        public String getIvrTransferBridgeDuration() {
            return this.ivrTransferBridgeDuration;
        }

        /**
         * @return ivrTransferCount
         */
        public String getIvrTransferCount() {
            return this.ivrTransferCount;
        }

        /**
         * @return loginTime
         */
        public String getLoginTime() {
            return this.loginTime;
        }

        /**
         * @return maxIdleTime
         */
        public String getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return maxPauseTime
         */
        public String getMaxPauseTime() {
            return this.maxPauseTime;
        }

        /**
         * @return maxRestTime
         */
        public String getMaxRestTime() {
            return this.maxRestTime;
        }

        /**
         * @return minIdleTime
         */
        public String getMinIdleTime() {
            return this.minIdleTime;
        }

        /**
         * @return minPauseTime
         */
        public String getMinPauseTime() {
            return this.minPauseTime;
        }

        /**
         * @return minRestTime
         */
        public String getMinRestTime() {
            return this.minRestTime;
        }

        /**
         * @return obAvgBridgeTime
         */
        public String getObAvgBridgeTime() {
            return this.obAvgBridgeTime;
        }

        /**
         * @return obAvgCallingTime
         */
        public String getObAvgCallingTime() {
            return this.obAvgCallingTime;
        }

        /**
         * @return obAvgHoldTime
         */
        public String getObAvgHoldTime() {
            return this.obAvgHoldTime;
        }

        /**
         * @return obAvgWrapupTime
         */
        public String getObAvgWrapupTime() {
            return this.obAvgWrapupTime;
        }

        /**
         * @return obBridgeCount
         */
        public String getObBridgeCount() {
            return this.obBridgeCount;
        }

        /**
         * @return obBridgeTime
         */
        public String getObBridgeTime() {
            return this.obBridgeTime;
        }

        /**
         * @return obCallingCount
         */
        public String getObCallingCount() {
            return this.obCallingCount;
        }

        /**
         * @return obCallingTime
         */
        public String getObCallingTime() {
            return this.obCallingTime;
        }

        /**
         * @return obHoldCount
         */
        public String getObHoldCount() {
            return this.obHoldCount;
        }

        /**
         * @return obHoldTime
         */
        public String getObHoldTime() {
            return this.obHoldTime;
        }

        /**
         * @return obMaxBridgeTime
         */
        public String getObMaxBridgeTime() {
            return this.obMaxBridgeTime;
        }

        /**
         * @return obMaxCallingTime
         */
        public String getObMaxCallingTime() {
            return this.obMaxCallingTime;
        }

        /**
         * @return obMaxHoldTime
         */
        public String getObMaxHoldTime() {
            return this.obMaxHoldTime;
        }

        /**
         * @return obMaxWrapupTime
         */
        public String getObMaxWrapupTime() {
            return this.obMaxWrapupTime;
        }

        /**
         * @return obMinBridgeTime
         */
        public String getObMinBridgeTime() {
            return this.obMinBridgeTime;
        }

        /**
         * @return obMinCallingTime
         */
        public String getObMinCallingTime() {
            return this.obMinCallingTime;
        }

        /**
         * @return obMinHoldTime
         */
        public String getObMinHoldTime() {
            return this.obMinHoldTime;
        }

        /**
         * @return obMinWrapupTime
         */
        public String getObMinWrapupTime() {
            return this.obMinWrapupTime;
        }

        /**
         * @return obRealBridgeTime
         */
        public String getObRealBridgeTime() {
            return this.obRealBridgeTime;
        }

        /**
         * @return obWrapupCount
         */
        public String getObWrapupCount() {
            return this.obWrapupCount;
        }

        /**
         * @return obWrapupTime
         */
        public String getObWrapupTime() {
            return this.obWrapupTime;
        }

        /**
         * @return pauseCount
         */
        public String getPauseCount() {
            return this.pauseCount;
        }

        /**
         * @return pauseTime
         */
        public String getPauseTime() {
            return this.pauseTime;
        }

        /**
         * @return predictObAgentAnsweredHour
         */
        public String getPredictObAgentAnsweredHour() {
            return this.predictObAgentAnsweredHour;
        }

        /**
         * @return predictObAgentAnsweredTime
         */
        public Long getPredictObAgentAnsweredTime() {
            return this.predictObAgentAnsweredTime;
        }

        /**
         * @return predictObAnsweredCount
         */
        public Long getPredictObAnsweredCount() {
            return this.predictObAnsweredCount;
        }

        /**
         * @return predictObAnsweredDurationArray
         */
        public String getPredictObAnsweredDurationArray() {
            return this.predictObAnsweredDurationArray;
        }

        /**
         * @return predictObConsultCount
         */
        public String getPredictObConsultCount() {
            return this.predictObConsultCount;
        }

        /**
         * @return predictObMonitorBargeCount
         */
        public String getPredictObMonitorBargeCount() {
            return this.predictObMonitorBargeCount;
        }

        /**
         * @return predictObMonitorBargeDuration
         */
        public String getPredictObMonitorBargeDuration() {
            return this.predictObMonitorBargeDuration;
        }

        /**
         * @return predictObMonitorDisconnectCount
         */
        public String getPredictObMonitorDisconnectCount() {
            return this.predictObMonitorDisconnectCount;
        }

        /**
         * @return predictObMonitorSpyCount
         */
        public String getPredictObMonitorSpyCount() {
            return this.predictObMonitorSpyCount;
        }

        /**
         * @return predictObMonitorSpyDuration
         */
        public String getPredictObMonitorSpyDuration() {
            return this.predictObMonitorSpyDuration;
        }

        /**
         * @return predictObMonitorThreewayCount
         */
        public String getPredictObMonitorThreewayCount() {
            return this.predictObMonitorThreewayCount;
        }

        /**
         * @return predictObMonitorWhisperCount
         */
        public String getPredictObMonitorWhisperCount() {
            return this.predictObMonitorWhisperCount;
        }

        /**
         * @return predictObMonitorWhisperDuration
         */
        public String getPredictObMonitorWhisperDuration() {
            return this.predictObMonitorWhisperDuration;
        }

        /**
         * @return predictObTotalCount
         */
        public Long getPredictObTotalCount() {
            return this.predictObTotalCount;
        }

        /**
         * @return predictObTransferCount
         */
        public String getPredictObTransferCount() {
            return this.predictObTransferCount;
        }

        /**
         * @return predictObValidCalls
         */
        public Long getPredictObValidCalls() {
            return this.predictObValidCalls;
        }

        /**
         * @return predictObValidTotalBridgeHour
         */
        public String getPredictObValidTotalBridgeHour() {
            return this.predictObValidTotalBridgeHour;
        }

        /**
         * @return predictObValidTotalBridgeTime
         */
        public Long getPredictObValidTotalBridgeTime() {
            return this.predictObValidTotalBridgeTime;
        }

        /**
         * @return previewAgentAnswerdRate
         */
        public String getPreviewAgentAnswerdRate() {
            return this.previewAgentAnswerdRate;
        }

        /**
         * @return previewCustomerAnswerdRate
         */
        public String getPreviewCustomerAnswerdRate() {
            return this.previewCustomerAnswerdRate;
        }

        /**
         * @return previewObAgentAnsweredCount
         */
        public String getPreviewObAgentAnsweredCount() {
            return this.previewObAgentAnsweredCount;
        }

        /**
         * @return previewObAgentAnsweredTime
         */
        public String getPreviewObAgentAnsweredTime() {
            return this.previewObAgentAnsweredTime;
        }

        /**
         * @return previewObAnsweredCount
         */
        public String getPreviewObAnsweredCount() {
            return this.previewObAnsweredCount;
        }

        /**
         * @return previewObAnsweredDurationArray
         */
        public java.util.List<String> getPreviewObAnsweredDurationArray() {
            return this.previewObAnsweredDurationArray;
        }

        /**
         * @return previewObAnsweredDurationDscArray
         */
        public java.util.List<String> getPreviewObAnsweredDurationDscArray() {
            return this.previewObAnsweredDurationDscArray;
        }

        /**
         * @return previewObConsultCount
         */
        public String getPreviewObConsultCount() {
            return this.previewObConsultCount;
        }

        /**
         * @return previewObCustomerAnsweredTime
         */
        public String getPreviewObCustomerAnsweredTime() {
            return this.previewObCustomerAnsweredTime;
        }

        /**
         * @return previewObCustomerRingingCount
         */
        public String getPreviewObCustomerRingingCount() {
            return this.previewObCustomerRingingCount;
        }

        /**
         * @return previewObCustomerRingingRate
         */
        public String getPreviewObCustomerRingingRate() {
            return this.previewObCustomerRingingRate;
        }

        /**
         * @return previewObMonitorBargeCount
         */
        public String getPreviewObMonitorBargeCount() {
            return this.previewObMonitorBargeCount;
        }

        /**
         * @return previewObMonitorBargeDuration
         */
        public String getPreviewObMonitorBargeDuration() {
            return this.previewObMonitorBargeDuration;
        }

        /**
         * @return previewObMonitorDisconnectCount
         */
        public String getPreviewObMonitorDisconnectCount() {
            return this.previewObMonitorDisconnectCount;
        }

        /**
         * @return previewObMonitorSpyCount
         */
        public String getPreviewObMonitorSpyCount() {
            return this.previewObMonitorSpyCount;
        }

        /**
         * @return previewObMonitorSpyDuration
         */
        public String getPreviewObMonitorSpyDuration() {
            return this.previewObMonitorSpyDuration;
        }

        /**
         * @return previewObMonitorThreewayCount
         */
        public String getPreviewObMonitorThreewayCount() {
            return this.previewObMonitorThreewayCount;
        }

        /**
         * @return previewObMonitorWhisperCount
         */
        public String getPreviewObMonitorWhisperCount() {
            return this.previewObMonitorWhisperCount;
        }

        /**
         * @return previewObMonitorWhisperDuration
         */
        public String getPreviewObMonitorWhisperDuration() {
            return this.previewObMonitorWhisperDuration;
        }

        /**
         * @return previewObTotalBridgeHour
         */
        public String getPreviewObTotalBridgeHour() {
            return this.previewObTotalBridgeHour;
        }

        /**
         * @return previewObTotalBridgeTime
         */
        public String getPreviewObTotalBridgeTime() {
            return this.previewObTotalBridgeTime;
        }

        /**
         * @return previewObTotalCount
         */
        public String getPreviewObTotalCount() {
            return this.previewObTotalCount;
        }

        /**
         * @return previewObTransferBridgeCount
         */
        public String getPreviewObTransferBridgeCount() {
            return this.previewObTransferBridgeCount;
        }

        /**
         * @return previewObTransferBridgeDuration
         */
        public String getPreviewObTransferBridgeDuration() {
            return this.previewObTransferBridgeDuration;
        }

        /**
         * @return previewObTransferCount
         */
        public String getPreviewObTransferCount() {
            return this.previewObTransferCount;
        }

        /**
         * @return previewObValidCalls
         */
        public String getPreviewObValidCalls() {
            return this.previewObValidCalls;
        }

        /**
         * @return previewObValidTotalBridgeHour
         */
        public String getPreviewObValidTotalBridgeHour() {
            return this.previewObValidTotalBridgeHour;
        }

        /**
         * @return previewObValidTotalBridgeTime
         */
        public String getPreviewObValidTotalBridgeTime() {
            return this.previewObValidTotalBridgeTime;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return restCount
         */
        public String getRestCount() {
            return this.restCount;
        }

        /**
         * @return restTime
         */
        public String getRestTime() {
            return this.restTime;
        }

        /**
         * @return rowName
         */
        public String getRowName() {
            return this.rowName;
        }

        /**
         * @return totalBridgeTime
         */
        public String getTotalBridgeTime() {
            return this.totalBridgeTime;
        }

        /**
         * @return webcallObAgentAnsweredTime
         */
        public String getWebcallObAgentAnsweredTime() {
            return this.webcallObAgentAnsweredTime;
        }

        /**
         * @return webcallObAnsweredCount
         */
        public String getWebcallObAnsweredCount() {
            return this.webcallObAnsweredCount;
        }

        /**
         * @return webcallObAnsweredDurationArray
         */
        public String getWebcallObAnsweredDurationArray() {
            return this.webcallObAnsweredDurationArray;
        }

        /**
         * @return webcallObConsultCount
         */
        public String getWebcallObConsultCount() {
            return this.webcallObConsultCount;
        }

        /**
         * @return webcallObMonitorBargeCount
         */
        public String getWebcallObMonitorBargeCount() {
            return this.webcallObMonitorBargeCount;
        }

        /**
         * @return webcallObMonitorBargeDuration
         */
        public String getWebcallObMonitorBargeDuration() {
            return this.webcallObMonitorBargeDuration;
        }

        /**
         * @return webcallObMonitorDisconnectCount
         */
        public String getWebcallObMonitorDisconnectCount() {
            return this.webcallObMonitorDisconnectCount;
        }

        /**
         * @return webcallObMonitorSpyCount
         */
        public String getWebcallObMonitorSpyCount() {
            return this.webcallObMonitorSpyCount;
        }

        /**
         * @return webcallObMonitorSpyDuration
         */
        public String getWebcallObMonitorSpyDuration() {
            return this.webcallObMonitorSpyDuration;
        }

        /**
         * @return webcallObMonitorThreewayCount
         */
        public String getWebcallObMonitorThreewayCount() {
            return this.webcallObMonitorThreewayCount;
        }

        /**
         * @return webcallObMonitorWhisperCount
         */
        public String getWebcallObMonitorWhisperCount() {
            return this.webcallObMonitorWhisperCount;
        }

        /**
         * @return webcallObMonitorWhisperDuration
         */
        public String getWebcallObMonitorWhisperDuration() {
            return this.webcallObMonitorWhisperDuration;
        }

        /**
         * @return webcallObTotalCount
         */
        public String getWebcallObTotalCount() {
            return this.webcallObTotalCount;
        }

        /**
         * @return webcallObTransferCount
         */
        public String getWebcallObTransferCount() {
            return this.webcallObTransferCount;
        }

        public static final class Builder {
            private String agentAnswerRate; 
            private String agentCreateTime; 
            private String agentName; 
            private String agentRate; 
            private String agentStopTime; 
            private String avgIdleTime; 
            private String avgPauseTime; 
            private String avgPreviewObWaitTime; 
            private String avgRestTime; 
            private String callUtilization; 
            private String cno; 
            private String createTime; 
            private String dateTimeRange; 
            private String day; 
            private String directObAnsweredCount; 
            private String directObAnsweredDurationArray; 
            private java.util.List<String> directObAnsweredDurationDscArray; 
            private String directObBridgeDuration; 
            private String directObBridgeTime; 
            private String directObConsultCount; 
            private String directObMonitorBargeCount; 
            private String directObMonitorDisconnectCount; 
            private String directObMonitorSpyCount; 
            private String directObMonitorThreewayCount; 
            private String directObMonitorWhisperCount; 
            private String directObTotalCount; 
            private String directObTotalTime; 
            private String directObTransferCount; 
            private String directObValidCalls; 
            private String directObValidTotalBridgeTime; 
            private String enterpriseId; 
            private String hoursUtilization; 
            private String ibAgentHangupCount; 
            private String ibAgentRefuseCount; 
            private String ibAnsweredCount; 
            private java.util.List<String> ibAnsweredDurationArray; 
            private java.util.List<String> ibAnsweredDurationDscArray; 
            private String ibAvgAnswerDelayTime; 
            private String ibAvgBridgeTime; 
            private String ibAvgCallingTime; 
            private String ibAvgHoldTime; 
            private String ibAvgWrapupTime; 
            private String ibBridgeCount; 
            private String ibBridgeMinute; 
            private String ibBridgeTime; 
            private String ibCallingCount; 
            private String ibCallingTime; 
            private String ibConsultCount; 
            private String ibCustomerHangupCount; 
            private String ibHoldCount; 
            private String ibHoldTime; 
            private String ibMaxAnswerDelayTime; 
            private String ibMaxBridgeTime; 
            private String ibMaxCallingTime; 
            private String ibMaxHoldTime; 
            private String ibMaxWrapupTime; 
            private String ibMinAnswerDelayTime; 
            private String ibMinBridgeTime; 
            private String ibMinCallingTime; 
            private String ibMinHoldTime; 
            private String ibMinWrapupTime; 
            private String ibMonitorBargeCount; 
            private String ibMonitorBargeDuration; 
            private String ibMonitorDisconnectCount; 
            private String ibMonitorPickupCount; 
            private String ibMonitorPickupDuration; 
            private String ibMonitorSpyCount; 
            private String ibMonitorSpyDuration; 
            private String ibMonitorThreewayCount; 
            private String ibMonitorWhisperCount; 
            private String ibMonitorWhisperDuration; 
            private String ibTotalAnswerDelayTime; 
            private String ibTotalCount; 
            private String ibTotalMinute; 
            private String ibTotalTime; 
            private String ibTransferCount; 
            private String ibUnansweredCount; 
            private String ibUniqueAnsweredCount; 
            private String ibUniqueTotalCount; 
            private String ibUniqueUnansweredCount; 
            private String ibValidCalls; 
            private String ibValidTotalBridgeTime; 
            private String ibWrapupCount; 
            private String ibWrapupTime; 
            private String id; 
            private String idleCount; 
            private String idleTime; 
            private String ivrTransferBridgeCount; 
            private String ivrTransferBridgeDuration; 
            private String ivrTransferCount; 
            private String loginTime; 
            private String maxIdleTime; 
            private String maxPauseTime; 
            private String maxRestTime; 
            private String minIdleTime; 
            private String minPauseTime; 
            private String minRestTime; 
            private String obAvgBridgeTime; 
            private String obAvgCallingTime; 
            private String obAvgHoldTime; 
            private String obAvgWrapupTime; 
            private String obBridgeCount; 
            private String obBridgeTime; 
            private String obCallingCount; 
            private String obCallingTime; 
            private String obHoldCount; 
            private String obHoldTime; 
            private String obMaxBridgeTime; 
            private String obMaxCallingTime; 
            private String obMaxHoldTime; 
            private String obMaxWrapupTime; 
            private String obMinBridgeTime; 
            private String obMinCallingTime; 
            private String obMinHoldTime; 
            private String obMinWrapupTime; 
            private String obRealBridgeTime; 
            private String obWrapupCount; 
            private String obWrapupTime; 
            private String pauseCount; 
            private String pauseTime; 
            private String predictObAgentAnsweredHour; 
            private Long predictObAgentAnsweredTime; 
            private Long predictObAnsweredCount; 
            private String predictObAnsweredDurationArray; 
            private String predictObConsultCount; 
            private String predictObMonitorBargeCount; 
            private String predictObMonitorBargeDuration; 
            private String predictObMonitorDisconnectCount; 
            private String predictObMonitorSpyCount; 
            private String predictObMonitorSpyDuration; 
            private String predictObMonitorThreewayCount; 
            private String predictObMonitorWhisperCount; 
            private String predictObMonitorWhisperDuration; 
            private Long predictObTotalCount; 
            private String predictObTransferCount; 
            private Long predictObValidCalls; 
            private String predictObValidTotalBridgeHour; 
            private Long predictObValidTotalBridgeTime; 
            private String previewAgentAnswerdRate; 
            private String previewCustomerAnswerdRate; 
            private String previewObAgentAnsweredCount; 
            private String previewObAgentAnsweredTime; 
            private String previewObAnsweredCount; 
            private java.util.List<String> previewObAnsweredDurationArray; 
            private java.util.List<String> previewObAnsweredDurationDscArray; 
            private String previewObConsultCount; 
            private String previewObCustomerAnsweredTime; 
            private String previewObCustomerRingingCount; 
            private String previewObCustomerRingingRate; 
            private String previewObMonitorBargeCount; 
            private String previewObMonitorBargeDuration; 
            private String previewObMonitorDisconnectCount; 
            private String previewObMonitorSpyCount; 
            private String previewObMonitorSpyDuration; 
            private String previewObMonitorThreewayCount; 
            private String previewObMonitorWhisperCount; 
            private String previewObMonitorWhisperDuration; 
            private String previewObTotalBridgeHour; 
            private String previewObTotalBridgeTime; 
            private String previewObTotalCount; 
            private String previewObTransferBridgeCount; 
            private String previewObTransferBridgeDuration; 
            private String previewObTransferCount; 
            private String previewObValidCalls; 
            private String previewObValidTotalBridgeHour; 
            private String previewObValidTotalBridgeTime; 
            private String queueName; 
            private String restCount; 
            private String restTime; 
            private String rowName; 
            private String totalBridgeTime; 
            private String webcallObAgentAnsweredTime; 
            private String webcallObAnsweredCount; 
            private String webcallObAnsweredDurationArray; 
            private String webcallObConsultCount; 
            private String webcallObMonitorBargeCount; 
            private String webcallObMonitorBargeDuration; 
            private String webcallObMonitorDisconnectCount; 
            private String webcallObMonitorSpyCount; 
            private String webcallObMonitorSpyDuration; 
            private String webcallObMonitorThreewayCount; 
            private String webcallObMonitorWhisperCount; 
            private String webcallObMonitorWhisperDuration; 
            private String webcallObTotalCount; 
            private String webcallObTransferCount; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentAnswerRate = model.agentAnswerRate;
                this.agentCreateTime = model.agentCreateTime;
                this.agentName = model.agentName;
                this.agentRate = model.agentRate;
                this.agentStopTime = model.agentStopTime;
                this.avgIdleTime = model.avgIdleTime;
                this.avgPauseTime = model.avgPauseTime;
                this.avgPreviewObWaitTime = model.avgPreviewObWaitTime;
                this.avgRestTime = model.avgRestTime;
                this.callUtilization = model.callUtilization;
                this.cno = model.cno;
                this.createTime = model.createTime;
                this.dateTimeRange = model.dateTimeRange;
                this.day = model.day;
                this.directObAnsweredCount = model.directObAnsweredCount;
                this.directObAnsweredDurationArray = model.directObAnsweredDurationArray;
                this.directObAnsweredDurationDscArray = model.directObAnsweredDurationDscArray;
                this.directObBridgeDuration = model.directObBridgeDuration;
                this.directObBridgeTime = model.directObBridgeTime;
                this.directObConsultCount = model.directObConsultCount;
                this.directObMonitorBargeCount = model.directObMonitorBargeCount;
                this.directObMonitorDisconnectCount = model.directObMonitorDisconnectCount;
                this.directObMonitorSpyCount = model.directObMonitorSpyCount;
                this.directObMonitorThreewayCount = model.directObMonitorThreewayCount;
                this.directObMonitorWhisperCount = model.directObMonitorWhisperCount;
                this.directObTotalCount = model.directObTotalCount;
                this.directObTotalTime = model.directObTotalTime;
                this.directObTransferCount = model.directObTransferCount;
                this.directObValidCalls = model.directObValidCalls;
                this.directObValidTotalBridgeTime = model.directObValidTotalBridgeTime;
                this.enterpriseId = model.enterpriseId;
                this.hoursUtilization = model.hoursUtilization;
                this.ibAgentHangupCount = model.ibAgentHangupCount;
                this.ibAgentRefuseCount = model.ibAgentRefuseCount;
                this.ibAnsweredCount = model.ibAnsweredCount;
                this.ibAnsweredDurationArray = model.ibAnsweredDurationArray;
                this.ibAnsweredDurationDscArray = model.ibAnsweredDurationDscArray;
                this.ibAvgAnswerDelayTime = model.ibAvgAnswerDelayTime;
                this.ibAvgBridgeTime = model.ibAvgBridgeTime;
                this.ibAvgCallingTime = model.ibAvgCallingTime;
                this.ibAvgHoldTime = model.ibAvgHoldTime;
                this.ibAvgWrapupTime = model.ibAvgWrapupTime;
                this.ibBridgeCount = model.ibBridgeCount;
                this.ibBridgeMinute = model.ibBridgeMinute;
                this.ibBridgeTime = model.ibBridgeTime;
                this.ibCallingCount = model.ibCallingCount;
                this.ibCallingTime = model.ibCallingTime;
                this.ibConsultCount = model.ibConsultCount;
                this.ibCustomerHangupCount = model.ibCustomerHangupCount;
                this.ibHoldCount = model.ibHoldCount;
                this.ibHoldTime = model.ibHoldTime;
                this.ibMaxAnswerDelayTime = model.ibMaxAnswerDelayTime;
                this.ibMaxBridgeTime = model.ibMaxBridgeTime;
                this.ibMaxCallingTime = model.ibMaxCallingTime;
                this.ibMaxHoldTime = model.ibMaxHoldTime;
                this.ibMaxWrapupTime = model.ibMaxWrapupTime;
                this.ibMinAnswerDelayTime = model.ibMinAnswerDelayTime;
                this.ibMinBridgeTime = model.ibMinBridgeTime;
                this.ibMinCallingTime = model.ibMinCallingTime;
                this.ibMinHoldTime = model.ibMinHoldTime;
                this.ibMinWrapupTime = model.ibMinWrapupTime;
                this.ibMonitorBargeCount = model.ibMonitorBargeCount;
                this.ibMonitorBargeDuration = model.ibMonitorBargeDuration;
                this.ibMonitorDisconnectCount = model.ibMonitorDisconnectCount;
                this.ibMonitorPickupCount = model.ibMonitorPickupCount;
                this.ibMonitorPickupDuration = model.ibMonitorPickupDuration;
                this.ibMonitorSpyCount = model.ibMonitorSpyCount;
                this.ibMonitorSpyDuration = model.ibMonitorSpyDuration;
                this.ibMonitorThreewayCount = model.ibMonitorThreewayCount;
                this.ibMonitorWhisperCount = model.ibMonitorWhisperCount;
                this.ibMonitorWhisperDuration = model.ibMonitorWhisperDuration;
                this.ibTotalAnswerDelayTime = model.ibTotalAnswerDelayTime;
                this.ibTotalCount = model.ibTotalCount;
                this.ibTotalMinute = model.ibTotalMinute;
                this.ibTotalTime = model.ibTotalTime;
                this.ibTransferCount = model.ibTransferCount;
                this.ibUnansweredCount = model.ibUnansweredCount;
                this.ibUniqueAnsweredCount = model.ibUniqueAnsweredCount;
                this.ibUniqueTotalCount = model.ibUniqueTotalCount;
                this.ibUniqueUnansweredCount = model.ibUniqueUnansweredCount;
                this.ibValidCalls = model.ibValidCalls;
                this.ibValidTotalBridgeTime = model.ibValidTotalBridgeTime;
                this.ibWrapupCount = model.ibWrapupCount;
                this.ibWrapupTime = model.ibWrapupTime;
                this.id = model.id;
                this.idleCount = model.idleCount;
                this.idleTime = model.idleTime;
                this.ivrTransferBridgeCount = model.ivrTransferBridgeCount;
                this.ivrTransferBridgeDuration = model.ivrTransferBridgeDuration;
                this.ivrTransferCount = model.ivrTransferCount;
                this.loginTime = model.loginTime;
                this.maxIdleTime = model.maxIdleTime;
                this.maxPauseTime = model.maxPauseTime;
                this.maxRestTime = model.maxRestTime;
                this.minIdleTime = model.minIdleTime;
                this.minPauseTime = model.minPauseTime;
                this.minRestTime = model.minRestTime;
                this.obAvgBridgeTime = model.obAvgBridgeTime;
                this.obAvgCallingTime = model.obAvgCallingTime;
                this.obAvgHoldTime = model.obAvgHoldTime;
                this.obAvgWrapupTime = model.obAvgWrapupTime;
                this.obBridgeCount = model.obBridgeCount;
                this.obBridgeTime = model.obBridgeTime;
                this.obCallingCount = model.obCallingCount;
                this.obCallingTime = model.obCallingTime;
                this.obHoldCount = model.obHoldCount;
                this.obHoldTime = model.obHoldTime;
                this.obMaxBridgeTime = model.obMaxBridgeTime;
                this.obMaxCallingTime = model.obMaxCallingTime;
                this.obMaxHoldTime = model.obMaxHoldTime;
                this.obMaxWrapupTime = model.obMaxWrapupTime;
                this.obMinBridgeTime = model.obMinBridgeTime;
                this.obMinCallingTime = model.obMinCallingTime;
                this.obMinHoldTime = model.obMinHoldTime;
                this.obMinWrapupTime = model.obMinWrapupTime;
                this.obRealBridgeTime = model.obRealBridgeTime;
                this.obWrapupCount = model.obWrapupCount;
                this.obWrapupTime = model.obWrapupTime;
                this.pauseCount = model.pauseCount;
                this.pauseTime = model.pauseTime;
                this.predictObAgentAnsweredHour = model.predictObAgentAnsweredHour;
                this.predictObAgentAnsweredTime = model.predictObAgentAnsweredTime;
                this.predictObAnsweredCount = model.predictObAnsweredCount;
                this.predictObAnsweredDurationArray = model.predictObAnsweredDurationArray;
                this.predictObConsultCount = model.predictObConsultCount;
                this.predictObMonitorBargeCount = model.predictObMonitorBargeCount;
                this.predictObMonitorBargeDuration = model.predictObMonitorBargeDuration;
                this.predictObMonitorDisconnectCount = model.predictObMonitorDisconnectCount;
                this.predictObMonitorSpyCount = model.predictObMonitorSpyCount;
                this.predictObMonitorSpyDuration = model.predictObMonitorSpyDuration;
                this.predictObMonitorThreewayCount = model.predictObMonitorThreewayCount;
                this.predictObMonitorWhisperCount = model.predictObMonitorWhisperCount;
                this.predictObMonitorWhisperDuration = model.predictObMonitorWhisperDuration;
                this.predictObTotalCount = model.predictObTotalCount;
                this.predictObTransferCount = model.predictObTransferCount;
                this.predictObValidCalls = model.predictObValidCalls;
                this.predictObValidTotalBridgeHour = model.predictObValidTotalBridgeHour;
                this.predictObValidTotalBridgeTime = model.predictObValidTotalBridgeTime;
                this.previewAgentAnswerdRate = model.previewAgentAnswerdRate;
                this.previewCustomerAnswerdRate = model.previewCustomerAnswerdRate;
                this.previewObAgentAnsweredCount = model.previewObAgentAnsweredCount;
                this.previewObAgentAnsweredTime = model.previewObAgentAnsweredTime;
                this.previewObAnsweredCount = model.previewObAnsweredCount;
                this.previewObAnsweredDurationArray = model.previewObAnsweredDurationArray;
                this.previewObAnsweredDurationDscArray = model.previewObAnsweredDurationDscArray;
                this.previewObConsultCount = model.previewObConsultCount;
                this.previewObCustomerAnsweredTime = model.previewObCustomerAnsweredTime;
                this.previewObCustomerRingingCount = model.previewObCustomerRingingCount;
                this.previewObCustomerRingingRate = model.previewObCustomerRingingRate;
                this.previewObMonitorBargeCount = model.previewObMonitorBargeCount;
                this.previewObMonitorBargeDuration = model.previewObMonitorBargeDuration;
                this.previewObMonitorDisconnectCount = model.previewObMonitorDisconnectCount;
                this.previewObMonitorSpyCount = model.previewObMonitorSpyCount;
                this.previewObMonitorSpyDuration = model.previewObMonitorSpyDuration;
                this.previewObMonitorThreewayCount = model.previewObMonitorThreewayCount;
                this.previewObMonitorWhisperCount = model.previewObMonitorWhisperCount;
                this.previewObMonitorWhisperDuration = model.previewObMonitorWhisperDuration;
                this.previewObTotalBridgeHour = model.previewObTotalBridgeHour;
                this.previewObTotalBridgeTime = model.previewObTotalBridgeTime;
                this.previewObTotalCount = model.previewObTotalCount;
                this.previewObTransferBridgeCount = model.previewObTransferBridgeCount;
                this.previewObTransferBridgeDuration = model.previewObTransferBridgeDuration;
                this.previewObTransferCount = model.previewObTransferCount;
                this.previewObValidCalls = model.previewObValidCalls;
                this.previewObValidTotalBridgeHour = model.previewObValidTotalBridgeHour;
                this.previewObValidTotalBridgeTime = model.previewObValidTotalBridgeTime;
                this.queueName = model.queueName;
                this.restCount = model.restCount;
                this.restTime = model.restTime;
                this.rowName = model.rowName;
                this.totalBridgeTime = model.totalBridgeTime;
                this.webcallObAgentAnsweredTime = model.webcallObAgentAnsweredTime;
                this.webcallObAnsweredCount = model.webcallObAnsweredCount;
                this.webcallObAnsweredDurationArray = model.webcallObAnsweredDurationArray;
                this.webcallObConsultCount = model.webcallObConsultCount;
                this.webcallObMonitorBargeCount = model.webcallObMonitorBargeCount;
                this.webcallObMonitorBargeDuration = model.webcallObMonitorBargeDuration;
                this.webcallObMonitorDisconnectCount = model.webcallObMonitorDisconnectCount;
                this.webcallObMonitorSpyCount = model.webcallObMonitorSpyCount;
                this.webcallObMonitorSpyDuration = model.webcallObMonitorSpyDuration;
                this.webcallObMonitorThreewayCount = model.webcallObMonitorThreewayCount;
                this.webcallObMonitorWhisperCount = model.webcallObMonitorWhisperCount;
                this.webcallObMonitorWhisperDuration = model.webcallObMonitorWhisperDuration;
                this.webcallObTotalCount = model.webcallObTotalCount;
                this.webcallObTransferCount = model.webcallObTransferCount;
            } 

            /**
             * <p>座席来电接听率</p>
             * 
             * <strong>example:</strong>
             * <p>80%</p>
             */
            public Builder agentAnswerRate(String agentAnswerRate) {
                this.agentAnswerRate = agentAnswerRate;
                return this;
            }

            /**
             * <p>座席创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-20</p>
             */
            public Builder agentCreateTime(String agentCreateTime) {
                this.agentCreateTime = agentCreateTime;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>test-3</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>座席呼叫接听率</p>
             * 
             * <strong>example:</strong>
             * <p>0%</p>
             */
            public Builder agentRate(String agentRate) {
                this.agentRate = agentRate;
                return this;
            }

            /**
             * <p>座席停用时间</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:01</p>
             */
            public Builder agentStopTime(String agentStopTime) {
                this.agentStopTime = agentStopTime;
                return this;
            }

            /**
             * <p>平均空闲时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:01</p>
             */
            public Builder avgIdleTime(String avgIdleTime) {
                this.avgIdleTime = avgIdleTime;
                return this;
            }

            /**
             * <p>平均置忙时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder avgPauseTime(String avgPauseTime) {
                this.avgPauseTime = avgPauseTime;
                return this;
            }

            /**
             * <p>平均等待时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder avgPreviewObWaitTime(String avgPreviewObWaitTime) {
                this.avgPreviewObWaitTime = avgPreviewObWaitTime;
                return this;
            }

            /**
             * <p>平均休息时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:03</p>
             */
            public Builder avgRestTime(String avgRestTime) {
                this.avgRestTime = avgRestTime;
                return this;
            }

            /**
             * <p>通话利用率</p>
             * 
             * <strong>example:</strong>
             * <p>66%</p>
             */
            public Builder callUtilization(String callUtilization) {
                this.callUtilization = callUtilization;
                return this;
            }

            /**
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>时间范围</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder dateTimeRange(String dateTimeRange) {
                this.dateTimeRange = dateTimeRange;
                return this;
            }

            /**
             * <p>统计日期</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20</p>
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * <p>主叫外呼客户接听数</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder directObAnsweredCount(String directObAnsweredCount) {
                this.directObAnsweredCount = directObAnsweredCount;
                return this;
            }

            /**
             * <p>主叫外呼接听量分布</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObAnsweredDurationArray(String directObAnsweredDurationArray) {
                this.directObAnsweredDurationArray = directObAnsweredDurationArray;
                return this;
            }

            /**
             * <p>主叫外呼接听量分布描述</p>
             */
            public Builder directObAnsweredDurationDscArray(java.util.List<String> directObAnsweredDurationDscArray) {
                this.directObAnsweredDurationDscArray = directObAnsweredDurationDscArray;
                return this;
            }

            /**
             * <p>主叫外呼总时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder directObBridgeDuration(String directObBridgeDuration) {
                this.directObBridgeDuration = directObBridgeDuration;
                return this;
            }

            /**
             * <p>主叫外呼双方接听分钟数</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder directObBridgeTime(String directObBridgeTime) {
                this.directObBridgeTime = directObBridgeTime;
                return this;
            }

            /**
             * <p>主叫外呼咨询总次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObConsultCount(String directObConsultCount) {
                this.directObConsultCount = directObConsultCount;
                return this;
            }

            /**
             * <p>主叫外呼强插总次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObMonitorBargeCount(String directObMonitorBargeCount) {
                this.directObMonitorBargeCount = directObMonitorBargeCount;
                return this;
            }

            /**
             * <p>主叫外呼总监控强拆次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObMonitorDisconnectCount(String directObMonitorDisconnectCount) {
                this.directObMonitorDisconnectCount = directObMonitorDisconnectCount;
                return this;
            }

            /**
             * <p>主叫外呼监听总次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObMonitorSpyCount(String directObMonitorSpyCount) {
                this.directObMonitorSpyCount = directObMonitorSpyCount;
                return this;
            }

            /**
             * <p>主叫外呼监控三方总次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObMonitorThreewayCount(String directObMonitorThreewayCount) {
                this.directObMonitorThreewayCount = directObMonitorThreewayCount;
                return this;
            }

            /**
             * <p>主叫外呼耳语总次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObMonitorWhisperCount(String directObMonitorWhisperCount) {
                this.directObMonitorWhisperCount = directObMonitorWhisperCount;
                return this;
            }

            /**
             * <p>主叫外呼总次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObTotalCount(String directObTotalCount) {
                this.directObTotalCount = directObTotalCount;
                return this;
            }

            /**
             * <p>主叫外呼总分钟数</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:22</p>
             */
            public Builder directObTotalTime(String directObTotalTime) {
                this.directObTotalTime = directObTotalTime;
                return this;
            }

            /**
             * <p>主叫外呼转移总次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObTransferCount(String directObTransferCount) {
                this.directObTransferCount = directObTransferCount;
                return this;
            }

            /**
             * <p>主叫外呼有效接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directObValidCalls(String directObValidCalls) {
                this.directObValidCalls = directObValidCalls;
                return this;
            }

            /**
             * <p>主叫外呼有效接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder directObValidTotalBridgeTime(String directObValidTotalBridgeTime) {
                this.directObValidTotalBridgeTime = directObValidTotalBridgeTime;
                return this;
            }

            /**
             * <p>企业id</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>工时利用率</p>
             * 
             * <strong>example:</strong>
             * <p>80%</p>
             */
            public Builder hoursUtilization(String hoursUtilization) {
                this.hoursUtilization = hoursUtilization;
                return this;
            }

            /**
             * <p>座席挂机数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibAgentHangupCount(String ibAgentHangupCount) {
                this.ibAgentHangupCount = ibAgentHangupCount;
                return this;
            }

            /**
             * <p>来电座席拒接数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibAgentRefuseCount(String ibAgentRefuseCount) {
                this.ibAgentRefuseCount = ibAgentRefuseCount;
                return this;
            }

            /**
             * <p>呼入座席接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibAnsweredCount(String ibAnsweredCount) {
                this.ibAnsweredCount = ibAnsweredCount;
                return this;
            }

            /**
             * <p>接听量分布</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder ibAnsweredDurationArray(java.util.List<String> ibAnsweredDurationArray) {
                this.ibAnsweredDurationArray = ibAnsweredDurationArray;
                return this;
            }

            /**
             * <p>呼入接听量分布描述</p>
             */
            public Builder ibAnsweredDurationDscArray(java.util.List<String> ibAnsweredDurationDscArray) {
                this.ibAnsweredDurationDscArray = ibAnsweredDurationDscArray;
                return this;
            }

            /**
             * <p>呼入接听平均延迟时间</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibAvgAnswerDelayTime(String ibAvgAnswerDelayTime) {
                this.ibAvgAnswerDelayTime = ibAvgAnswerDelayTime;
                return this;
            }

            /**
             * <p>呼入平均通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibAvgBridgeTime(String ibAvgBridgeTime) {
                this.ibAvgBridgeTime = ibAvgBridgeTime;
                return this;
            }

            /**
             * <p>呼入平均呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibAvgCallingTime(String ibAvgCallingTime) {
                this.ibAvgCallingTime = ibAvgCallingTime;
                return this;
            }

            /**
             * <p>呼入平均保持时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibAvgHoldTime(String ibAvgHoldTime) {
                this.ibAvgHoldTime = ibAvgHoldTime;
                return this;
            }

            /**
             * <p>呼入平均整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:10</p>
             */
            public Builder ibAvgWrapupTime(String ibAvgWrapupTime) {
                this.ibAvgWrapupTime = ibAvgWrapupTime;
                return this;
            }

            /**
             * <p>呼入通话次数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ibBridgeCount(String ibBridgeCount) {
                this.ibBridgeCount = ibBridgeCount;
                return this;
            }

            /**
             * <p>呼入通话分钟数</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibBridgeMinute(String ibBridgeMinute) {
                this.ibBridgeMinute = ibBridgeMinute;
                return this;
            }

            /**
             * <p>呼入双方接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibBridgeTime(String ibBridgeTime) {
                this.ibBridgeTime = ibBridgeTime;
                return this;
            }

            /**
             * <p>呼入呼叫次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibCallingCount(String ibCallingCount) {
                this.ibCallingCount = ibCallingCount;
                return this;
            }

            /**
             * <p>呼入总呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibCallingTime(String ibCallingTime) {
                this.ibCallingTime = ibCallingTime;
                return this;
            }

            /**
             * <p>呼入咨询数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibConsultCount(String ibConsultCount) {
                this.ibConsultCount = ibConsultCount;
                return this;
            }

            /**
             * <p>客户挂机数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ibCustomerHangupCount(String ibCustomerHangupCount) {
                this.ibCustomerHangupCount = ibCustomerHangupCount;
                return this;
            }

            /**
             * <p>呼叫保持次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibHoldCount(String ibHoldCount) {
                this.ibHoldCount = ibHoldCount;
                return this;
            }

            /**
             * <p>呼入总保持时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibHoldTime(String ibHoldTime) {
                this.ibHoldTime = ibHoldTime;
                return this;
            }

            /**
             * <p>呼入接听最大延迟时间</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMaxAnswerDelayTime(String ibMaxAnswerDelayTime) {
                this.ibMaxAnswerDelayTime = ibMaxAnswerDelayTime;
                return this;
            }

            /**
             * <p>呼入最大通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMaxBridgeTime(String ibMaxBridgeTime) {
                this.ibMaxBridgeTime = ibMaxBridgeTime;
                return this;
            }

            /**
             * <p>呼入最大呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:10</p>
             */
            public Builder ibMaxCallingTime(String ibMaxCallingTime) {
                this.ibMaxCallingTime = ibMaxCallingTime;
                return this;
            }

            /**
             * <p>呼入最大保持时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMaxHoldTime(String ibMaxHoldTime) {
                this.ibMaxHoldTime = ibMaxHoldTime;
                return this;
            }

            /**
             * <p>呼入最大整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMaxWrapupTime(String ibMaxWrapupTime) {
                this.ibMaxWrapupTime = ibMaxWrapupTime;
                return this;
            }

            /**
             * <p>呼入接听最小延迟时间</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMinAnswerDelayTime(String ibMinAnswerDelayTime) {
                this.ibMinAnswerDelayTime = ibMinAnswerDelayTime;
                return this;
            }

            /**
             * <p>呼入最小通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:10</p>
             */
            public Builder ibMinBridgeTime(String ibMinBridgeTime) {
                this.ibMinBridgeTime = ibMinBridgeTime;
                return this;
            }

            /**
             * <p>呼入最小呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMinCallingTime(String ibMinCallingTime) {
                this.ibMinCallingTime = ibMinCallingTime;
                return this;
            }

            /**
             * <p>呼入最小保持时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMinHoldTime(String ibMinHoldTime) {
                this.ibMinHoldTime = ibMinHoldTime;
                return this;
            }

            /**
             * <p>呼入最小整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMinWrapupTime(String ibMinWrapupTime) {
                this.ibMinWrapupTime = ibMinWrapupTime;
                return this;
            }

            /**
             * <p>呼入监控强插数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibMonitorBargeCount(String ibMonitorBargeCount) {
                this.ibMonitorBargeCount = ibMonitorBargeCount;
                return this;
            }

            /**
             * <p>呼入强插时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMonitorBargeDuration(String ibMonitorBargeDuration) {
                this.ibMonitorBargeDuration = ibMonitorBargeDuration;
                return this;
            }

            /**
             * <p>呼入监控强拆数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibMonitorDisconnectCount(String ibMonitorDisconnectCount) {
                this.ibMonitorDisconnectCount = ibMonitorDisconnectCount;
                return this;
            }

            /**
             * <p>呼入监控抢线数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibMonitorPickupCount(String ibMonitorPickupCount) {
                this.ibMonitorPickupCount = ibMonitorPickupCount;
                return this;
            }

            /**
             * <p>呼入抢线时长</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibMonitorPickupDuration(String ibMonitorPickupDuration) {
                this.ibMonitorPickupDuration = ibMonitorPickupDuration;
                return this;
            }

            /**
             * <p>呼入监控监听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ibMonitorSpyCount(String ibMonitorSpyCount) {
                this.ibMonitorSpyCount = ibMonitorSpyCount;
                return this;
            }

            /**
             * <p>呼入监听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMonitorSpyDuration(String ibMonitorSpyDuration) {
                this.ibMonitorSpyDuration = ibMonitorSpyDuration;
                return this;
            }

            /**
             * <p>呼入监控三方数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibMonitorThreewayCount(String ibMonitorThreewayCount) {
                this.ibMonitorThreewayCount = ibMonitorThreewayCount;
                return this;
            }

            /**
             * <p>呼入监控耳语数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibMonitorWhisperCount(String ibMonitorWhisperCount) {
                this.ibMonitorWhisperCount = ibMonitorWhisperCount;
                return this;
            }

            /**
             * <p>呼入耳语时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibMonitorWhisperDuration(String ibMonitorWhisperDuration) {
                this.ibMonitorWhisperDuration = ibMonitorWhisperDuration;
                return this;
            }

            /**
             * <p>呼入接听总延迟时间</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibTotalAnswerDelayTime(String ibTotalAnswerDelayTime) {
                this.ibTotalAnswerDelayTime = ibTotalAnswerDelayTime;
                return this;
            }

            /**
             * <p>总呼入座席数</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder ibTotalCount(String ibTotalCount) {
                this.ibTotalCount = ibTotalCount;
                return this;
            }

            /**
             * <p>呼入总分钟数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibTotalMinute(String ibTotalMinute) {
                this.ibTotalMinute = ibTotalMinute;
                return this;
            }

            /**
             * <p>呼入总通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ibTotalTime(String ibTotalTime) {
                this.ibTotalTime = ibTotalTime;
                return this;
            }

            /**
             * <p>呼入转移数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ibTransferCount(String ibTransferCount) {
                this.ibTransferCount = ibTransferCount;
                return this;
            }

            /**
             * <p>呼入座席未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ibUnansweredCount(String ibUnansweredCount) {
                this.ibUnansweredCount = ibUnansweredCount;
                return this;
            }

            /**
             * <p>座席来电接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ibUniqueAnsweredCount(String ibUniqueAnsweredCount) {
                this.ibUniqueAnsweredCount = ibUniqueAnsweredCount;
                return this;
            }

            /**
             * <p>座席来电数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibUniqueTotalCount(String ibUniqueTotalCount) {
                this.ibUniqueTotalCount = ibUniqueTotalCount;
                return this;
            }

            /**
             * <p>座席来电未接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibUniqueUnansweredCount(String ibUniqueUnansweredCount) {
                this.ibUniqueUnansweredCount = ibUniqueUnansweredCount;
                return this;
            }

            /**
             * <p>呼入有效通话次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibValidCalls(String ibValidCalls) {
                this.ibValidCalls = ibValidCalls;
                return this;
            }

            /**
             * <p>呼入有效通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:10</p>
             */
            public Builder ibValidTotalBridgeTime(String ibValidTotalBridgeTime) {
                this.ibValidTotalBridgeTime = ibValidTotalBridgeTime;
                return this;
            }

            /**
             * <p>呼入整理次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ibWrapupCount(String ibWrapupCount) {
                this.ibWrapupCount = ibWrapupCount;
                return this;
            }

            /**
             * <p>呼入总整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder ibWrapupTime(String ibWrapupTime) {
                this.ibWrapupTime = ibWrapupTime;
                return this;
            }

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>123124</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>空闲次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder idleCount(String idleCount) {
                this.idleCount = idleCount;
                return this;
            }

            /**
             * <p>总空闲时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder idleTime(String idleTime) {
                this.idleTime = idleTime;
                return this;
            }

            /**
             * <p>预览外呼IVR转移座席接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ivrTransferBridgeCount(String ivrTransferBridgeCount) {
                this.ivrTransferBridgeCount = ivrTransferBridgeCount;
                return this;
            }

            /**
             * <p>预览外呼IVR转移双方接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:01</p>
             */
            public Builder ivrTransferBridgeDuration(String ivrTransferBridgeDuration) {
                this.ivrTransferBridgeDuration = ivrTransferBridgeDuration;
                return this;
            }

            /**
             * <p>预览外呼IVR转移座席数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ivrTransferCount(String ivrTransferCount) {
                this.ivrTransferCount = ivrTransferCount;
                return this;
            }

            /**
             * <p>总登录时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:01</p>
             */
            public Builder loginTime(String loginTime) {
                this.loginTime = loginTime;
                return this;
            }

            /**
             * <p>最大空闲时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder maxIdleTime(String maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * <p>最大置忙时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder maxPauseTime(String maxPauseTime) {
                this.maxPauseTime = maxPauseTime;
                return this;
            }

            /**
             * <p>最大休息时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder maxRestTime(String maxRestTime) {
                this.maxRestTime = maxRestTime;
                return this;
            }

            /**
             * <p>最小空闲时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:01</p>
             */
            public Builder minIdleTime(String minIdleTime) {
                this.minIdleTime = minIdleTime;
                return this;
            }

            /**
             * <p>最小置忙时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder minPauseTime(String minPauseTime) {
                this.minPauseTime = minPauseTime;
                return this;
            }

            /**
             * <p>最小休息时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder minRestTime(String minRestTime) {
                this.minRestTime = minRestTime;
                return this;
            }

            /**
             * <p>外呼平均通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder obAvgBridgeTime(String obAvgBridgeTime) {
                this.obAvgBridgeTime = obAvgBridgeTime;
                return this;
            }

            /**
             * <p>外呼平均呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:11</p>
             */
            public Builder obAvgCallingTime(String obAvgCallingTime) {
                this.obAvgCallingTime = obAvgCallingTime;
                return this;
            }

            /**
             * <p>外呼平均保持时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:50</p>
             */
            public Builder obAvgHoldTime(String obAvgHoldTime) {
                this.obAvgHoldTime = obAvgHoldTime;
                return this;
            }

            /**
             * <p>外呼平均整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:05</p>
             */
            public Builder obAvgWrapupTime(String obAvgWrapupTime) {
                this.obAvgWrapupTime = obAvgWrapupTime;
                return this;
            }

            /**
             * <p>外呼通话次数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder obBridgeCount(String obBridgeCount) {
                this.obBridgeCount = obBridgeCount;
                return this;
            }

            /**
             * <p>外呼总通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>ObBridgeTime</p>
             */
            public Builder obBridgeTime(String obBridgeTime) {
                this.obBridgeTime = obBridgeTime;
                return this;
            }

            /**
             * <p>外呼呼叫次数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder obCallingCount(String obCallingCount) {
                this.obCallingCount = obCallingCount;
                return this;
            }

            /**
             * <p>外呼总呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder obCallingTime(String obCallingTime) {
                this.obCallingTime = obCallingTime;
                return this;
            }

            /**
             * <p>外呼保持次数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder obHoldCount(String obHoldCount) {
                this.obHoldCount = obHoldCount;
                return this;
            }

            /**
             * <p>外呼总保持时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:10</p>
             */
            public Builder obHoldTime(String obHoldTime) {
                this.obHoldTime = obHoldTime;
                return this;
            }

            /**
             * <p>外呼最大通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder obMaxBridgeTime(String obMaxBridgeTime) {
                this.obMaxBridgeTime = obMaxBridgeTime;
                return this;
            }

            /**
             * <p>外呼最大呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:03</p>
             */
            public Builder obMaxCallingTime(String obMaxCallingTime) {
                this.obMaxCallingTime = obMaxCallingTime;
                return this;
            }

            /**
             * <p>外呼最大保持时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:01</p>
             */
            public Builder obMaxHoldTime(String obMaxHoldTime) {
                this.obMaxHoldTime = obMaxHoldTime;
                return this;
            }

            /**
             * <p>外呼最大整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:22</p>
             */
            public Builder obMaxWrapupTime(String obMaxWrapupTime) {
                this.obMaxWrapupTime = obMaxWrapupTime;
                return this;
            }

            /**
             * <p>外呼最小通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:02</p>
             */
            public Builder obMinBridgeTime(String obMinBridgeTime) {
                this.obMinBridgeTime = obMinBridgeTime;
                return this;
            }

            /**
             * <p>外呼最小呼叫时长</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder obMinCallingTime(String obMinCallingTime) {
                this.obMinCallingTime = obMinCallingTime;
                return this;
            }

            /**
             * <p>外呼最小保持时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder obMinHoldTime(String obMinHoldTime) {
                this.obMinHoldTime = obMinHoldTime;
                return this;
            }

            /**
             * <p>外呼最小整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder obMinWrapupTime(String obMinWrapupTime) {
                this.obMinWrapupTime = obMinWrapupTime;
                return this;
            }

            /**
             * <p>外呼双方接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:10</p>
             */
            public Builder obRealBridgeTime(String obRealBridgeTime) {
                this.obRealBridgeTime = obRealBridgeTime;
                return this;
            }

            /**
             * <p>外呼整理次数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder obWrapupCount(String obWrapupCount) {
                this.obWrapupCount = obWrapupCount;
                return this;
            }

            /**
             * <p>外呼总整理时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder obWrapupTime(String obWrapupTime) {
                this.obWrapupTime = obWrapupTime;
                return this;
            }

            /**
             * <p>置忙次数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pauseCount(String pauseCount) {
                this.pauseCount = pauseCount;
                return this;
            }

            /**
             * <p>总置忙时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:10</p>
             */
            public Builder pauseTime(String pauseTime) {
                this.pauseTime = pauseTime;
                return this;
            }

            /**
             * <p>预测外呼座席接听通话总小时</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder predictObAgentAnsweredHour(String predictObAgentAnsweredHour) {
                this.predictObAgentAnsweredHour = predictObAgentAnsweredHour;
                return this;
            }

            /**
             * <p>预测外呼座席接听通话总时长</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder predictObAgentAnsweredTime(Long predictObAgentAnsweredTime) {
                this.predictObAgentAnsweredTime = predictObAgentAnsweredTime;
                return this;
            }

            /**
             * <p>预测外呼座席接听数</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder predictObAnsweredCount(Long predictObAnsweredCount) {
                this.predictObAnsweredCount = predictObAnsweredCount;
                return this;
            }

            /**
             * <p>预测外呼接听量分布</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder predictObAnsweredDurationArray(String predictObAnsweredDurationArray) {
                this.predictObAnsweredDurationArray = predictObAnsweredDurationArray;
                return this;
            }

            /**
             * <p>预测外呼咨询数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictObConsultCount(String predictObConsultCount) {
                this.predictObConsultCount = predictObConsultCount;
                return this;
            }

            /**
             * <p>预测外呼监控强插数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictObMonitorBargeCount(String predictObMonitorBargeCount) {
                this.predictObMonitorBargeCount = predictObMonitorBargeCount;
                return this;
            }

            /**
             * <p>预测外呼强插时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder predictObMonitorBargeDuration(String predictObMonitorBargeDuration) {
                this.predictObMonitorBargeDuration = predictObMonitorBargeDuration;
                return this;
            }

            /**
             * <p>预测外呼监控强拆数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictObMonitorDisconnectCount(String predictObMonitorDisconnectCount) {
                this.predictObMonitorDisconnectCount = predictObMonitorDisconnectCount;
                return this;
            }

            /**
             * <p>预测外呼监控监听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictObMonitorSpyCount(String predictObMonitorSpyCount) {
                this.predictObMonitorSpyCount = predictObMonitorSpyCount;
                return this;
            }

            /**
             * <p>预测外呼监听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder predictObMonitorSpyDuration(String predictObMonitorSpyDuration) {
                this.predictObMonitorSpyDuration = predictObMonitorSpyDuration;
                return this;
            }

            /**
             * <p>预测外呼监控三方数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder predictObMonitorThreewayCount(String predictObMonitorThreewayCount) {
                this.predictObMonitorThreewayCount = predictObMonitorThreewayCount;
                return this;
            }

            /**
             * <p>预测外呼监控耳语数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictObMonitorWhisperCount(String predictObMonitorWhisperCount) {
                this.predictObMonitorWhisperCount = predictObMonitorWhisperCount;
                return this;
            }

            /**
             * <p>预测外呼耳语时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder predictObMonitorWhisperDuration(String predictObMonitorWhisperDuration) {
                this.predictObMonitorWhisperDuration = predictObMonitorWhisperDuration;
                return this;
            }

            /**
             * <p>预测外呼总数</p>
             * 
             * <strong>example:</strong>
             * <p>39</p>
             */
            public Builder predictObTotalCount(Long predictObTotalCount) {
                this.predictObTotalCount = predictObTotalCount;
                return this;
            }

            /**
             * <p>预测外呼转移数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictObTransferCount(String predictObTransferCount) {
                this.predictObTransferCount = predictObTransferCount;
                return this;
            }

            /**
             * <p>预测外呼有效通话数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictObValidCalls(Long predictObValidCalls) {
                this.predictObValidCalls = predictObValidCalls;
                return this;
            }

            /**
             * <p>预测外呼有效通话总小时</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder predictObValidTotalBridgeHour(String predictObValidTotalBridgeHour) {
                this.predictObValidTotalBridgeHour = predictObValidTotalBridgeHour;
                return this;
            }

            /**
             * <p>预测外呼有效通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder predictObValidTotalBridgeTime(Long predictObValidTotalBridgeTime) {
                this.predictObValidTotalBridgeTime = predictObValidTotalBridgeTime;
                return this;
            }

            /**
             * <p>预览外呼座席接听率</p>
             * 
             * <strong>example:</strong>
             * <p>33%</p>
             */
            public Builder previewAgentAnswerdRate(String previewAgentAnswerdRate) {
                this.previewAgentAnswerdRate = previewAgentAnswerdRate;
                return this;
            }

            /**
             * <p>预览外呼客户接听率</p>
             * 
             * <strong>example:</strong>
             * <p>0%</p>
             */
            public Builder previewCustomerAnswerdRate(String previewCustomerAnswerdRate) {
                this.previewCustomerAnswerdRate = previewCustomerAnswerdRate;
                return this;
            }

            /**
             * <p>预览外呼座席接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObAgentAnsweredCount(String previewObAgentAnsweredCount) {
                this.previewObAgentAnsweredCount = previewObAgentAnsweredCount;
                return this;
            }

            /**
             * <p>预览外呼座席接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:01</p>
             */
            public Builder previewObAgentAnsweredTime(String previewObAgentAnsweredTime) {
                this.previewObAgentAnsweredTime = previewObAgentAnsweredTime;
                return this;
            }

            /**
             * <p>预览外呼双方接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObAnsweredCount(String previewObAnsweredCount) {
                this.previewObAnsweredCount = previewObAnsweredCount;
                return this;
            }

            /**
             * <p>预览外呼接听量分布</p>
             */
            public Builder previewObAnsweredDurationArray(java.util.List<String> previewObAnsweredDurationArray) {
                this.previewObAnsweredDurationArray = previewObAnsweredDurationArray;
                return this;
            }

            /**
             * <p>预览外呼接听量分布描述</p>
             */
            public Builder previewObAnsweredDurationDscArray(java.util.List<String> previewObAnsweredDurationDscArray) {
                this.previewObAnsweredDurationDscArray = previewObAnsweredDurationDscArray;
                return this;
            }

            /**
             * <p>预览外呼咨询数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObConsultCount(String previewObConsultCount) {
                this.previewObConsultCount = previewObConsultCount;
                return this;
            }

            /**
             * <p>预览外呼客户接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder previewObCustomerAnsweredTime(String previewObCustomerAnsweredTime) {
                this.previewObCustomerAnsweredTime = previewObCustomerAnsweredTime;
                return this;
            }

            /**
             * <p>响铃数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder previewObCustomerRingingCount(String previewObCustomerRingingCount) {
                this.previewObCustomerRingingCount = previewObCustomerRingingCount;
                return this;
            }

            /**
             * <p>响铃率</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder previewObCustomerRingingRate(String previewObCustomerRingingRate) {
                this.previewObCustomerRingingRate = previewObCustomerRingingRate;
                return this;
            }

            /**
             * <p>预览外呼监控强插数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObMonitorBargeCount(String previewObMonitorBargeCount) {
                this.previewObMonitorBargeCount = previewObMonitorBargeCount;
                return this;
            }

            /**
             * <p>预览外呼强插时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder previewObMonitorBargeDuration(String previewObMonitorBargeDuration) {
                this.previewObMonitorBargeDuration = previewObMonitorBargeDuration;
                return this;
            }

            /**
             * <p>预览外呼监控强拆数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObMonitorDisconnectCount(String previewObMonitorDisconnectCount) {
                this.previewObMonitorDisconnectCount = previewObMonitorDisconnectCount;
                return this;
            }

            /**
             * <p>预览外呼监控监听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObMonitorSpyCount(String previewObMonitorSpyCount) {
                this.previewObMonitorSpyCount = previewObMonitorSpyCount;
                return this;
            }

            /**
             * <p>预览外呼监听时长</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObMonitorSpyDuration(String previewObMonitorSpyDuration) {
                this.previewObMonitorSpyDuration = previewObMonitorSpyDuration;
                return this;
            }

            /**
             * <p>预览外呼监控三方数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObMonitorThreewayCount(String previewObMonitorThreewayCount) {
                this.previewObMonitorThreewayCount = previewObMonitorThreewayCount;
                return this;
            }

            /**
             * <p>预览外呼监控耳语数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObMonitorWhisperCount(String previewObMonitorWhisperCount) {
                this.previewObMonitorWhisperCount = previewObMonitorWhisperCount;
                return this;
            }

            /**
             * <p>预览外呼耳语时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder previewObMonitorWhisperDuration(String previewObMonitorWhisperDuration) {
                this.previewObMonitorWhisperDuration = previewObMonitorWhisperDuration;
                return this;
            }

            /**
             * <p>预览外呼双方接听通话小时</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObTotalBridgeHour(String previewObTotalBridgeHour) {
                this.previewObTotalBridgeHour = previewObTotalBridgeHour;
                return this;
            }

            /**
             * <p>预览外呼双方接听通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder previewObTotalBridgeTime(String previewObTotalBridgeTime) {
                this.previewObTotalBridgeTime = previewObTotalBridgeTime;
                return this;
            }

            /**
             * <p>总预览外呼数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObTotalCount(String previewObTotalCount) {
                this.previewObTotalCount = previewObTotalCount;
                return this;
            }

            /**
             * <p>预览外呼被转接听数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder previewObTransferBridgeCount(String previewObTransferBridgeCount) {
                this.previewObTransferBridgeCount = previewObTransferBridgeCount;
                return this;
            }

            /**
             * <p>预览外呼被转接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder previewObTransferBridgeDuration(String previewObTransferBridgeDuration) {
                this.previewObTransferBridgeDuration = previewObTransferBridgeDuration;
                return this;
            }

            /**
             * <p>预览外呼被转数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder previewObTransferCount(String previewObTransferCount) {
                this.previewObTransferCount = previewObTransferCount;
                return this;
            }

            /**
             * <p>预览外呼有效通话次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previewObValidCalls(String previewObValidCalls) {
                this.previewObValidCalls = previewObValidCalls;
                return this;
            }

            /**
             * <p>预览外呼有效通话总小时</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder previewObValidTotalBridgeHour(String previewObValidTotalBridgeHour) {
                this.previewObValidTotalBridgeHour = previewObValidTotalBridgeHour;
                return this;
            }

            /**
             * <p>预览外呼有效总通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:22</p>
             */
            public Builder previewObValidTotalBridgeTime(String previewObValidTotalBridgeTime) {
                this.previewObValidTotalBridgeTime = previewObValidTotalBridgeTime;
                return this;
            }

            /**
             * <p>队列名</p>
             * 
             * <strong>example:</strong>
             * <p>name3</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>休息次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder restCount(String restCount) {
                this.restCount = restCount;
                return this;
            }

            /**
             * <p>总休息时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder restTime(String restTime) {
                this.restTime = restTime;
                return this;
            }

            /**
             * <p>行名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder rowName(String rowName) {
                this.rowName = rowName;
                return this;
            }

            /**
             * <p>总双方接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder totalBridgeTime(String totalBridgeTime) {
                this.totalBridgeTime = totalBridgeTime;
                return this;
            }

            /**
             * <p>webcall座席接听分钟数</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder webcallObAgentAnsweredTime(String webcallObAgentAnsweredTime) {
                this.webcallObAgentAnsweredTime = webcallObAgentAnsweredTime;
                return this;
            }

            /**
             * <p>webcall双方接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObAnsweredCount(String webcallObAnsweredCount) {
                this.webcallObAnsweredCount = webcallObAnsweredCount;
                return this;
            }

            /**
             * <p>webcall接听量分布</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder webcallObAnsweredDurationArray(String webcallObAnsweredDurationArray) {
                this.webcallObAnsweredDurationArray = webcallObAnsweredDurationArray;
                return this;
            }

            /**
             * <p>webcall咨询数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObConsultCount(String webcallObConsultCount) {
                this.webcallObConsultCount = webcallObConsultCount;
                return this;
            }

            /**
             * <p>webcall监控强插数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObMonitorBargeCount(String webcallObMonitorBargeCount) {
                this.webcallObMonitorBargeCount = webcallObMonitorBargeCount;
                return this;
            }

            /**
             * <p>webcall强插时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder webcallObMonitorBargeDuration(String webcallObMonitorBargeDuration) {
                this.webcallObMonitorBargeDuration = webcallObMonitorBargeDuration;
                return this;
            }

            /**
             * <p>webcall监控强拆数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObMonitorDisconnectCount(String webcallObMonitorDisconnectCount) {
                this.webcallObMonitorDisconnectCount = webcallObMonitorDisconnectCount;
                return this;
            }

            /**
             * <p>webcall监控监听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObMonitorSpyCount(String webcallObMonitorSpyCount) {
                this.webcallObMonitorSpyCount = webcallObMonitorSpyCount;
                return this;
            }

            /**
             * <p>webcall监听时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder webcallObMonitorSpyDuration(String webcallObMonitorSpyDuration) {
                this.webcallObMonitorSpyDuration = webcallObMonitorSpyDuration;
                return this;
            }

            /**
             * <p>webcall监控三方数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObMonitorThreewayCount(String webcallObMonitorThreewayCount) {
                this.webcallObMonitorThreewayCount = webcallObMonitorThreewayCount;
                return this;
            }

            /**
             * <p>webcall监控耳语数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObMonitorWhisperCount(String webcallObMonitorWhisperCount) {
                this.webcallObMonitorWhisperCount = webcallObMonitorWhisperCount;
                return this;
            }

            /**
             * <p>webcall耳语时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder webcallObMonitorWhisperDuration(String webcallObMonitorWhisperDuration) {
                this.webcallObMonitorWhisperDuration = webcallObMonitorWhisperDuration;
                return this;
            }

            /**
             * <p>总webcall数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObTotalCount(String webcallObTotalCount) {
                this.webcallObTotalCount = webcallObTotalCount;
                return this;
            }

            /**
             * <p>webcall转移数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webcallObTransferCount(String webcallObTransferCount) {
                this.webcallObTransferCount = webcallObTransferCount;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudAgentWorkloadReportResponseBody} extends {@link TeaModel}
     *
     * <p>CloudAgentWorkloadReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPageCount")
        private String totalPageCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
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
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public String getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private String pageSize; 
            private String totalCount; 
            private String totalPageCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.totalPageCount = model.totalPageCount;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(String totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
