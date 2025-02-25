// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetAlarmDetailByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlarmDetailByIdResponseBody</p>
 */
public class GetAlarmDetailByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAlarmDetailByIdResponseBody(Builder builder) {
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

    public static GetAlarmDetailByIdResponseBody create() {
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
         * <p>API response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
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
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5C1B0668-442C-57AE-9668-D894B0B012EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the operation was successful: - true: Success. - false: Failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAlarmDetailByIdResponseBody build() {
            return new GetAlarmDetailByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlarmDetailByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlarmDetailByIdResponseBody</p>
     */
    public static class EventDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameDisplay")
        private String nameDisplay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueDisplay")
        private String valueDisplay;

        private EventDetails(Builder builder) {
            this.nameDisplay = builder.nameDisplay;
            this.type = builder.type;
            this.value = builder.value;
            this.valueDisplay = builder.valueDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventDetails create() {
            return builder().build();
        }

        /**
         * @return nameDisplay
         */
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueDisplay
         */
        public String getValueDisplay() {
            return this.valueDisplay;
        }

        public static final class Builder {
            private String nameDisplay; 
            private String type; 
            private String value; 
            private String valueDisplay; 

            /**
             * <p>Alarm event display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Login with unusual location</p>
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * <p>Alarm event type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Path where the alarm event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>/etc/crontab</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>Path where the alarm event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>/etc/crontab</p>
             */
            public Builder valueDisplay(String valueDisplay) {
                this.valueDisplay = valueDisplay;
                return this;
            }

            public EventDetails build() {
                return new EventDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlarmDetailByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlarmDetailByIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmEventType")
        private String alarmEventType;

        @com.aliyun.core.annotation.NameInMap("AlarmEventTypeDisplay")
        private String alarmEventTypeDisplay;

        @com.aliyun.core.annotation.NameInMap("AlarmId")
        private Long alarmId;

        @com.aliyun.core.annotation.NameInMap("AlarmName")
        private String alarmName;

        @com.aliyun.core.annotation.NameInMap("AlarmSource")
        private String alarmSource;

        @com.aliyun.core.annotation.NameInMap("AlarmTime")
        private String alarmTime;

        @com.aliyun.core.annotation.NameInMap("AnalysisResult")
        private String analysisResult;

        @com.aliyun.core.annotation.NameInMap("ContainHwMode")
        private Boolean containHwMode;

        @com.aliyun.core.annotation.NameInMap("DealTime")
        private String dealTime;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("EventDetails")
        private java.util.List<EventDetails> eventDetails;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TacticDisplayName")
        private String tacticDisplayName;

        private Data(Builder builder) {
            this.alarmEventType = builder.alarmEventType;
            this.alarmEventTypeDisplay = builder.alarmEventTypeDisplay;
            this.alarmId = builder.alarmId;
            this.alarmName = builder.alarmName;
            this.alarmSource = builder.alarmSource;
            this.alarmTime = builder.alarmTime;
            this.analysisResult = builder.analysisResult;
            this.containHwMode = builder.containHwMode;
            this.dealTime = builder.dealTime;
            this.desc = builder.desc;
            this.eventDetails = builder.eventDetails;
            this.eventLevel = builder.eventLevel;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.occurrenceTime = builder.occurrenceTime;
            this.ownerId = builder.ownerId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.tacticDisplayName = builder.tacticDisplayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmEventType
         */
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        /**
         * @return alarmEventTypeDisplay
         */
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        /**
         * @return alarmId
         */
        public Long getAlarmId() {
            return this.alarmId;
        }

        /**
         * @return alarmName
         */
        public String getAlarmName() {
            return this.alarmName;
        }

        /**
         * @return alarmSource
         */
        public String getAlarmSource() {
            return this.alarmSource;
        }

        /**
         * @return alarmTime
         */
        public String getAlarmTime() {
            return this.alarmTime;
        }

        /**
         * @return analysisResult
         */
        public String getAnalysisResult() {
            return this.analysisResult;
        }

        /**
         * @return containHwMode
         */
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        /**
         * @return dealTime
         */
        public String getDealTime() {
            return this.dealTime;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return eventDetails
         */
        public java.util.List<EventDetails> getEventDetails() {
            return this.eventDetails;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tacticDisplayName
         */
        public String getTacticDisplayName() {
            return this.tacticDisplayName;
        }

        public static final class Builder {
            private String alarmEventType; 
            private String alarmEventTypeDisplay; 
            private Long alarmId; 
            private String alarmName; 
            private String alarmSource; 
            private String alarmTime; 
            private String analysisResult; 
            private Boolean containHwMode; 
            private String dealTime; 
            private String desc; 
            private java.util.List<EventDetails> eventDetails; 
            private String eventLevel; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String occurrenceTime; 
            private String ownerId; 
            private String remark; 
            private String status; 
            private String tacticDisplayName; 

            /**
             * <p>Alarm event type.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon</p>
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * <p>Alarm event type.</p>
             * 
             * <strong>example:</strong>
             * <p>Login with unusual location</p>
             */
            public Builder alarmEventTypeDisplay(String alarmEventTypeDisplay) {
                this.alarmEventTypeDisplay = alarmEventTypeDisplay;
                return this;
            }

            /**
             * <p>Alarm ID.</p>
             * 
             * <strong>example:</strong>
             * <p>202427220</p>
             */
            public Builder alarmId(Long alarmId) {
                this.alarmId = alarmId;
                return this;
            }

            /**
             * <p>Alarm name.</p>
             * 
             * <strong>example:</strong>
             * <p>负载均衡可挂载服务器数量告警</p>
             */
            public Builder alarmName(String alarmName) {
                this.alarmName = alarmName;
                return this;
            }

            /**
             * <p>Alarm source.</p>
             * 
             * <strong>example:</strong>
             * <p>SUSP_EVENT</p>
             */
            public Builder alarmSource(String alarmSource) {
                this.alarmSource = alarmSource;
                return this;
            }

            /**
             * <p>Latest alarm time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-26 01:51:01</p>
             */
            public Builder alarmTime(String alarmTime) {
                this.alarmTime = alarmTime;
                return this;
            }

            /**
             * <p>Analysis process.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;value&quot;:&quot;服务器可能已被黑客攻击，存在恶意进程在运行。 分析过程：告警显示，服务端存在一个名为”dns.exe”的进程在访问”polling.burpcollaborator.net”，这是一个被黑名单列出的恶意域名。在正常情况下,”dns.exe”不应该单独存在于系统的路径下，并且也不应该访问这类恶意域名。因此，这个进程可能是黑客留下的恶意进程。&quot;,&quot;key&quot;:&quot;结论&quot;},{&quot;value&quot;:&quot;尽快对服务器进行全面扫描，清除恶意进程。同时，联系网络安全专家进行深入调查，以确定是否有其他潜在的安全威胁。&quot;,&quot;key&quot;:&quot;处置建议&quot;}]</p>
             */
            public Builder analysisResult(String analysisResult) {
                this.analysisResult = analysisResult;
                return this;
            }

            /**
             * <p>Whether high-protection mode is enabled. true means enabled, false means not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * <p>Alarm handling time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-26 01:51:01</p>
             */
            public Builder dealTime(String dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>webshell</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>Event details information.</p>
             */
            public Builder eventDetails(java.util.List<EventDetails> eventDetails) {
                this.eventDetails = eventDetails;
                return this;
            }

            /**
             * <p>Alarm level.</p>
             * 
             * <strong>example:</strong>
             * <p>suspicious</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>Primary key ID of the work order.</p>
             * 
             * <strong>example:</strong>
             * <p>9772</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Public IP.</p>
             * 
             * <strong>example:</strong>
             * <p>47.116.126.79</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>Private IP.</p>
             * 
             * <strong>example:</strong>
             * <p>172.19.195.176</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>First occurrence time</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-26 01:51:01</p>
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * <p>Owner.</p>
             * 
             * <strong>example:</strong>
             * <p>324546</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>Disposal method.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Handling status.</p>
             * 
             * <strong>example:</strong>
             * <p>要查询的告警事件状态。取值：</p>
             * <p>0：全部
             * 1：待处理
             * 2：已忽略
             * 4：已确认
             * 8：已标记为误报
             * 16：处理中
             * 32：处理完毕
             * 64：已经过期
             * 128：已经删除
             * 512：自动拦截中
             * 513：自动拦截完毕</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>ATT&amp;CK tactic name.</p>
             * 
             * <strong>example:</strong>
             * <p>Malicious scripts-Malicious script code execution</p>
             */
            public Builder tacticDisplayName(String tacticDisplayName) {
                this.tacticDisplayName = tacticDisplayName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
