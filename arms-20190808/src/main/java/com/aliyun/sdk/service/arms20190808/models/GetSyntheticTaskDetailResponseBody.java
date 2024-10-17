// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskDetailResponseBody</p>
 */
public class GetSyntheticTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskDetail")
    private TaskDetail taskDetail;

    private GetSyntheticTaskDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskDetail = builder.taskDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSyntheticTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskDetail
     */
    public TaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static final class Builder {
        private String requestId; 
        private TaskDetail taskDetail; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4D6C358A-A58B-4F4B-94CE-F5AAF023****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the task.</p>
         */
        public Builder taskDetail(TaskDetail taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }

        public GetSyntheticTaskDetailResponseBody build() {
            return new GetSyntheticTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class AlertList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GeneralAlert")
        private String generalAlert;

        @com.aliyun.core.annotation.NameInMap("IsCritical")
        private String isCritical;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SeriousAlert")
        private String seriousAlert;

        @com.aliyun.core.annotation.NameInMap("Symbols")
        private String symbols;

        private AlertList(Builder builder) {
            this.generalAlert = builder.generalAlert;
            this.isCritical = builder.isCritical;
            this.name = builder.name;
            this.seriousAlert = builder.seriousAlert;
            this.symbols = builder.symbols;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertList create() {
            return builder().build();
        }

        /**
         * @return generalAlert
         */
        public String getGeneralAlert() {
            return this.generalAlert;
        }

        /**
         * @return isCritical
         */
        public String getIsCritical() {
            return this.isCritical;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return seriousAlert
         */
        public String getSeriousAlert() {
            return this.seriousAlert;
        }

        /**
         * @return symbols
         */
        public String getSymbols() {
            return this.symbols;
        }

        public static final class Builder {
            private String generalAlert; 
            private String isCritical; 
            private String name; 
            private String seriousAlert; 
            private String symbols; 

            /**
             * <p>The low-risk alert.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder generalAlert(String generalAlert) {
                this.generalAlert = generalAlert;
                return this;
            }

            /**
             * <p>Indicates whether the condition is essential.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isCritical(String isCritical) {
                this.isCritical = isCritical;
                return this;
            }

            /**
             * <p>The alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>alert-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Critical-level alert.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder seriousAlert(String seriousAlert) {
                this.seriousAlert = seriousAlert;
                return this;
            }

            /**
             * <p>Greater than or less than.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder symbols(String symbols) {
                this.symbols = symbols;
                return this;
            }

            public AlertList build() {
                return new AlertList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class CommonParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmFlag")
        private Long alarmFlag;

        @com.aliyun.core.annotation.NameInMap("AlertList")
        private java.util.List < AlertList> alertList;

        @com.aliyun.core.annotation.NameInMap("AlertNotifierId")
        private String alertNotifierId;

        @com.aliyun.core.annotation.NameInMap("AlertPolicyId")
        private String alertPolicyId;

        @com.aliyun.core.annotation.NameInMap("MonitorSamples")
        private String monitorSamples;

        @com.aliyun.core.annotation.NameInMap("StartExecutionTime")
        private String startExecutionTime;

        private CommonParam(Builder builder) {
            this.alarmFlag = builder.alarmFlag;
            this.alertList = builder.alertList;
            this.alertNotifierId = builder.alertNotifierId;
            this.alertPolicyId = builder.alertPolicyId;
            this.monitorSamples = builder.monitorSamples;
            this.startExecutionTime = builder.startExecutionTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonParam create() {
            return builder().build();
        }

        /**
         * @return alarmFlag
         */
        public Long getAlarmFlag() {
            return this.alarmFlag;
        }

        /**
         * @return alertList
         */
        public java.util.List < AlertList> getAlertList() {
            return this.alertList;
        }

        /**
         * @return alertNotifierId
         */
        public String getAlertNotifierId() {
            return this.alertNotifierId;
        }

        /**
         * @return alertPolicyId
         */
        public String getAlertPolicyId() {
            return this.alertPolicyId;
        }

        /**
         * @return monitorSamples
         */
        public String getMonitorSamples() {
            return this.monitorSamples;
        }

        /**
         * @return startExecutionTime
         */
        public String getStartExecutionTime() {
            return this.startExecutionTime;
        }

        public static final class Builder {
            private Long alarmFlag; 
            private java.util.List < AlertList> alertList; 
            private String alertNotifierId; 
            private String alertPolicyId; 
            private String monitorSamples; 
            private String startExecutionTime; 

            /**
             * <p>The identifier of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alarmFlag(Long alarmFlag) {
                this.alarmFlag = alarmFlag;
                return this;
            }

            /**
             * <p>The list of alerts.</p>
             */
            public Builder alertList(java.util.List < AlertList> alertList) {
                this.alertList = alertList;
                return this;
            }

            /**
             * <p>The ID of the alert identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertNotifierId(String alertNotifierId) {
                this.alertNotifierId = alertNotifierId;
                return this;
            }

            /**
             * <p>The ID of the alert policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertPolicyId(String alertPolicyId) {
                this.alertPolicyId = alertPolicyId;
                return this;
            }

            /**
             * <p>The monitoring samples.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder monitorSamples(String monitorSamples) {
                this.monitorSamples = monitorSamples;
                return this;
            }

            /**
             * <p>The start time of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>1664427128</p>
             */
            public Builder startExecutionTime(String startExecutionTime) {
                this.startExecutionTime = startExecutionTime;
                return this;
            }

            public CommonParam build() {
                return new CommonParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class Download extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionTimeout")
        private Long connectionTimeout;

        @com.aliyun.core.annotation.NameInMap("DownloadCustomHeaderContent")
        private String downloadCustomHeaderContent;

        @com.aliyun.core.annotation.NameInMap("DownloadCustomHost")
        private Long downloadCustomHost;

        @com.aliyun.core.annotation.NameInMap("DownloadCustomHostIp")
        private String downloadCustomHostIp;

        @com.aliyun.core.annotation.NameInMap("DownloadKernel")
        private Long downloadKernel;

        @com.aliyun.core.annotation.NameInMap("DownloadRedirect")
        private Long downloadRedirect;

        @com.aliyun.core.annotation.NameInMap("DownloadTransmissionSize")
        private Long downloadTransmissionSize;

        @com.aliyun.core.annotation.NameInMap("MonitorTimeout")
        private Long monitorTimeout;

        @com.aliyun.core.annotation.NameInMap("QuickProtocol")
        private String quickProtocol;

        @com.aliyun.core.annotation.NameInMap("ValidateKeywords")
        private String validateKeywords;

        @com.aliyun.core.annotation.NameInMap("VerifyWay")
        private Long verifyWay;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private String whiteList;

        private Download(Builder builder) {
            this.connectionTimeout = builder.connectionTimeout;
            this.downloadCustomHeaderContent = builder.downloadCustomHeaderContent;
            this.downloadCustomHost = builder.downloadCustomHost;
            this.downloadCustomHostIp = builder.downloadCustomHostIp;
            this.downloadKernel = builder.downloadKernel;
            this.downloadRedirect = builder.downloadRedirect;
            this.downloadTransmissionSize = builder.downloadTransmissionSize;
            this.monitorTimeout = builder.monitorTimeout;
            this.quickProtocol = builder.quickProtocol;
            this.validateKeywords = builder.validateKeywords;
            this.verifyWay = builder.verifyWay;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Download create() {
            return builder().build();
        }

        /**
         * @return connectionTimeout
         */
        public Long getConnectionTimeout() {
            return this.connectionTimeout;
        }

        /**
         * @return downloadCustomHeaderContent
         */
        public String getDownloadCustomHeaderContent() {
            return this.downloadCustomHeaderContent;
        }

        /**
         * @return downloadCustomHost
         */
        public Long getDownloadCustomHost() {
            return this.downloadCustomHost;
        }

        /**
         * @return downloadCustomHostIp
         */
        public String getDownloadCustomHostIp() {
            return this.downloadCustomHostIp;
        }

        /**
         * @return downloadKernel
         */
        public Long getDownloadKernel() {
            return this.downloadKernel;
        }

        /**
         * @return downloadRedirect
         */
        public Long getDownloadRedirect() {
            return this.downloadRedirect;
        }

        /**
         * @return downloadTransmissionSize
         */
        public Long getDownloadTransmissionSize() {
            return this.downloadTransmissionSize;
        }

        /**
         * @return monitorTimeout
         */
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        /**
         * @return quickProtocol
         */
        public String getQuickProtocol() {
            return this.quickProtocol;
        }

        /**
         * @return validateKeywords
         */
        public String getValidateKeywords() {
            return this.validateKeywords;
        }

        /**
         * @return verifyWay
         */
        public Long getVerifyWay() {
            return this.verifyWay;
        }

        /**
         * @return whiteList
         */
        public String getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private Long connectionTimeout; 
            private String downloadCustomHeaderContent; 
            private Long downloadCustomHost; 
            private String downloadCustomHostIp; 
            private Long downloadKernel; 
            private Long downloadRedirect; 
            private Long downloadTransmissionSize; 
            private Long monitorTimeout; 
            private String quickProtocol; 
            private String validateKeywords; 
            private Long verifyWay; 
            private String whiteList; 

            /**
             * <p>The timeout period of the file download task.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder connectionTimeout(Long connectionTimeout) {
                this.connectionTimeout = connectionTimeout;
                return this;
            }

            /**
             * <p>The items to be ignored in a certificate error. Multiple values are concatenated with vertical bars (|).</p>
             * 
             * <strong>example:</strong>
             * <p>char</p>
             */
            public Builder downloadCustomHeaderContent(String downloadCustomHeaderContent) {
                this.downloadCustomHeaderContent = downloadCustomHeaderContent;
                return this;
            }

            /**
             * <p>The custom host. Valid values:</p>
             * <ul>
             * <li>1: round robin</li>
             * <li>0: random</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder downloadCustomHost(Long downloadCustomHost) {
                this.downloadCustomHost = downloadCustomHost;
                return this;
            }

            /**
             * <p>The custom IP address of the host. Multiple IP addresses are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>168.23.45.1</p>
             */
            public Builder downloadCustomHostIp(String downloadCustomHostIp) {
                this.downloadCustomHostIp = downloadCustomHostIp;
                return this;
            }

            /**
             * <p>The kernel type. Valid values:</p>
             * <ul>
             * <li>1: curl</li>
             * <li>0: WinInet</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder downloadKernel(Long downloadKernel) {
                this.downloadKernel = downloadKernel;
                return this;
            }

            /**
             * <p>Indicates whether redirection is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder downloadRedirect(Long downloadRedirect) {
                this.downloadRedirect = downloadRedirect;
                return this;
            }

            /**
             * <p>The file size. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder downloadTransmissionSize(Long downloadTransmissionSize) {
                this.downloadTransmissionSize = downloadTransmissionSize;
                return this;
            }

            /**
             * <p>The monitoring duration.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * <p>The QUIC protocol type. Valid values:</p>
             * <ul>
             * <li>1: HTTP/1</li>
             * <li>2: HTTP/2</li>
             * <li>3: http3</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quickProtocol(String quickProtocol) {
                this.quickProtocol = quickProtocol;
                return this;
            }

            /**
             * <p>The keyword that is used in verification.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder validateKeywords(String validateKeywords) {
                this.validateKeywords = validateKeywords;
                return this;
            }

            /**
             * <p>The method that is used to verify the response content. Valid values:</p>
             * <ul>
             * <li>0: no verification.</li>
             * <li>1: exact match with the verification string.</li>
             * <li>2: partial match with the verification string.</li>
             * <li>3: MD5 verification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder verifyWay(Long verifyWay) {
                this.verifyWay = verifyWay;
                return this;
            }

            /**
             * <p>The whitelisted objects that are used to avoid DNS hijacking. Format: <code>&lt;domain name&gt;:&lt;objects&gt;</code>.</p>
             * <blockquote>
             * <p> WAP networks do not support hijacking.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;src&quot;:&quot;211.154.166.174&quot;}]</p>
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Download build() {
                return new Download(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class ExtendInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Days")
        private java.util.List < Long > days;

        @com.aliyun.core.annotation.NameInMap("EndMinute")
        private Long endMinute;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Endhour")
        private Long endhour;

        @com.aliyun.core.annotation.NameInMap("StartHour")
        private Long startHour;

        @com.aliyun.core.annotation.NameInMap("StartMinute")
        private Long startMinute;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private ExtendInterval(Builder builder) {
            this.days = builder.days;
            this.endMinute = builder.endMinute;
            this.endTime = builder.endTime;
            this.endhour = builder.endhour;
            this.startHour = builder.startHour;
            this.startMinute = builder.startMinute;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendInterval create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public java.util.List < Long > getDays() {
            return this.days;
        }

        /**
         * @return endMinute
         */
        public Long getEndMinute() {
            return this.endMinute;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return endhour
         */
        public Long getEndhour() {
            return this.endhour;
        }

        /**
         * @return startHour
         */
        public Long getStartHour() {
            return this.startHour;
        }

        /**
         * @return startMinute
         */
        public Long getStartMinute() {
            return this.startMinute;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List < Long > days; 
            private Long endMinute; 
            private String endTime; 
            private Long endhour; 
            private Long startHour; 
            private Long startMinute; 
            private String startTime; 

            /**
             * <p>The day on which synthetic monitoring is performed. Valid values:</p>
             * <ul>
             * <li>-1: every day</li>
             * <li>0: Sunday</li>
             * <li>1: Monday</li>
             * <li>2: Tuesday</li>
             * <li>3: Wednesday</li>
             * <li>4: Thursday</li>
             * <li>5: Friday</li>
             * <li>6: Saturday</li>
             * </ul>
             */
            public Builder days(java.util.List < Long > days) {
                this.days = days;
                return this;
            }

            /**
             * <p>The minute at which synthetic monitoring ends.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder endMinute(Long endMinute) {
                this.endMinute = endMinute;
                return this;
            }

            /**
             * <p>The time when synthetic monitoring ends. Format: <code>yyyy-MM-dd HH</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-03 11:40</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The hour at which synthetic monitoring ends.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder endhour(Long endhour) {
                this.endhour = endhour;
                return this;
            }

            /**
             * <p>The hour at which synthetic monitoring starts.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder startHour(Long startHour) {
                this.startHour = startHour;
                return this;
            }

            /**
             * <p>The minute at which synthetic monitoring starts.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder startMinute(Long startMinute) {
                this.startMinute = startMinute;
                return this;
            }

            /**
             * <p>The time when synthetic monitoring starts. Format: yyyy-MM-dd HH.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-26 11:40</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ExtendInterval build() {
                return new ExtendInterval(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class MonitorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private Long cityCode;

        @com.aliyun.core.annotation.NameInMap("MonitorType")
        private Long monitorType;

        @com.aliyun.core.annotation.NameInMap("NetServiceId")
        private Long netServiceId;

        @com.aliyun.core.annotation.NameInMap("SendCount")
        private Long sendCount;

        private MonitorList(Builder builder) {
            this.cityCode = builder.cityCode;
            this.monitorType = builder.monitorType;
            this.netServiceId = builder.netServiceId;
            this.sendCount = builder.sendCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorList create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public Long getCityCode() {
            return this.cityCode;
        }

        /**
         * @return monitorType
         */
        public Long getMonitorType() {
            return this.monitorType;
        }

        /**
         * @return netServiceId
         */
        public Long getNetServiceId() {
            return this.netServiceId;
        }

        /**
         * @return sendCount
         */
        public Long getSendCount() {
            return this.sendCount;
        }

        public static final class Builder {
            private Long cityCode; 
            private Long monitorType; 
            private Long netServiceId; 
            private Long sendCount; 

            /**
             * <p>The city code.</p>
             * 
             * <strong>example:</strong>
             * <p>110100</p>
             */
            public Builder cityCode(Long cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The type of the detection point.</p>
             * 
             * <strong>example:</strong>
             * <p>IDC</p>
             */
            public Builder monitorType(Long monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * <p>The ID of the network service.</p>
             * 
             * <strong>example:</strong>
             * <p>12001</p>
             */
            public Builder netServiceId(Long netServiceId) {
                this.netServiceId = netServiceId;
                return this;
            }

            /**
             * <p>The number of times that the system sends detection requests.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder sendCount(Long sendCount) {
                this.sendCount = sendCount;
                return this;
            }

            public MonitorList build() {
                return new MonitorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class Nav extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsHijackWhitelist")
        private String dnsHijackWhitelist;

        @com.aliyun.core.annotation.NameInMap("ElementBlacklist")
        private String elementBlacklist;

        @com.aliyun.core.annotation.NameInMap("ExecuteActiveX")
        private Long executeActiveX;

        @com.aliyun.core.annotation.NameInMap("ExecuteApplet")
        private Long executeApplet;

        @com.aliyun.core.annotation.NameInMap("ExecuteScript")
        private Long executeScript;

        @com.aliyun.core.annotation.NameInMap("FilterInvalidIP")
        private Long filterInvalidIP;

        @com.aliyun.core.annotation.NameInMap("FlowHijackJumpTimes")
        private Long flowHijackJumpTimes;

        @com.aliyun.core.annotation.NameInMap("FlowHijackLogo")
        private String flowHijackLogo;

        @com.aliyun.core.annotation.NameInMap("MonitorTimeout")
        private Long monitorTimeout;

        @com.aliyun.core.annotation.NameInMap("NavAutomaticScrolling")
        private Long navAutomaticScrolling;

        @com.aliyun.core.annotation.NameInMap("NavCustomHeader")
        private String navCustomHeader;

        @com.aliyun.core.annotation.NameInMap("NavCustomHeaderContent")
        private String navCustomHeaderContent;

        @com.aliyun.core.annotation.NameInMap("NavCustomHost")
        private Long navCustomHost;

        @com.aliyun.core.annotation.NameInMap("NavCustomHostIp")
        private String navCustomHostIp;

        @com.aliyun.core.annotation.NameInMap("NavDisableCache")
        private Long navDisableCache;

        @com.aliyun.core.annotation.NameInMap("NavDisableCompression")
        private Long navDisableCompression;

        @com.aliyun.core.annotation.NameInMap("NavIgnoreCertificateError")
        private Long navIgnoreCertificateError;

        @com.aliyun.core.annotation.NameInMap("NavRedirect")
        private Long navRedirect;

        @com.aliyun.core.annotation.NameInMap("NavReturnElement")
        private Long navReturnElement;

        @com.aliyun.core.annotation.NameInMap("PageTampering")
        private String pageTampering;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("QuicDomain")
        private String quicDomain;

        @com.aliyun.core.annotation.NameInMap("QuicVersion")
        private Long quicVersion;

        @com.aliyun.core.annotation.NameInMap("RequestHeader")
        private Long requestHeader;

        @com.aliyun.core.annotation.NameInMap("SlowElementThreshold")
        private Long slowElementThreshold;

        @com.aliyun.core.annotation.NameInMap("VerifyStringBlacklist")
        private String verifyStringBlacklist;

        @com.aliyun.core.annotation.NameInMap("VerifyStringWhitelist")
        private String verifyStringWhitelist;

        @com.aliyun.core.annotation.NameInMap("WaitCompletionTime")
        private Long waitCompletionTime;

        private Nav(Builder builder) {
            this.dnsHijackWhitelist = builder.dnsHijackWhitelist;
            this.elementBlacklist = builder.elementBlacklist;
            this.executeActiveX = builder.executeActiveX;
            this.executeApplet = builder.executeApplet;
            this.executeScript = builder.executeScript;
            this.filterInvalidIP = builder.filterInvalidIP;
            this.flowHijackJumpTimes = builder.flowHijackJumpTimes;
            this.flowHijackLogo = builder.flowHijackLogo;
            this.monitorTimeout = builder.monitorTimeout;
            this.navAutomaticScrolling = builder.navAutomaticScrolling;
            this.navCustomHeader = builder.navCustomHeader;
            this.navCustomHeaderContent = builder.navCustomHeaderContent;
            this.navCustomHost = builder.navCustomHost;
            this.navCustomHostIp = builder.navCustomHostIp;
            this.navDisableCache = builder.navDisableCache;
            this.navDisableCompression = builder.navDisableCompression;
            this.navIgnoreCertificateError = builder.navIgnoreCertificateError;
            this.navRedirect = builder.navRedirect;
            this.navReturnElement = builder.navReturnElement;
            this.pageTampering = builder.pageTampering;
            this.processName = builder.processName;
            this.quicDomain = builder.quicDomain;
            this.quicVersion = builder.quicVersion;
            this.requestHeader = builder.requestHeader;
            this.slowElementThreshold = builder.slowElementThreshold;
            this.verifyStringBlacklist = builder.verifyStringBlacklist;
            this.verifyStringWhitelist = builder.verifyStringWhitelist;
            this.waitCompletionTime = builder.waitCompletionTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nav create() {
            return builder().build();
        }

        /**
         * @return dnsHijackWhitelist
         */
        public String getDnsHijackWhitelist() {
            return this.dnsHijackWhitelist;
        }

        /**
         * @return elementBlacklist
         */
        public String getElementBlacklist() {
            return this.elementBlacklist;
        }

        /**
         * @return executeActiveX
         */
        public Long getExecuteActiveX() {
            return this.executeActiveX;
        }

        /**
         * @return executeApplet
         */
        public Long getExecuteApplet() {
            return this.executeApplet;
        }

        /**
         * @return executeScript
         */
        public Long getExecuteScript() {
            return this.executeScript;
        }

        /**
         * @return filterInvalidIP
         */
        public Long getFilterInvalidIP() {
            return this.filterInvalidIP;
        }

        /**
         * @return flowHijackJumpTimes
         */
        public Long getFlowHijackJumpTimes() {
            return this.flowHijackJumpTimes;
        }

        /**
         * @return flowHijackLogo
         */
        public String getFlowHijackLogo() {
            return this.flowHijackLogo;
        }

        /**
         * @return monitorTimeout
         */
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        /**
         * @return navAutomaticScrolling
         */
        public Long getNavAutomaticScrolling() {
            return this.navAutomaticScrolling;
        }

        /**
         * @return navCustomHeader
         */
        public String getNavCustomHeader() {
            return this.navCustomHeader;
        }

        /**
         * @return navCustomHeaderContent
         */
        public String getNavCustomHeaderContent() {
            return this.navCustomHeaderContent;
        }

        /**
         * @return navCustomHost
         */
        public Long getNavCustomHost() {
            return this.navCustomHost;
        }

        /**
         * @return navCustomHostIp
         */
        public String getNavCustomHostIp() {
            return this.navCustomHostIp;
        }

        /**
         * @return navDisableCache
         */
        public Long getNavDisableCache() {
            return this.navDisableCache;
        }

        /**
         * @return navDisableCompression
         */
        public Long getNavDisableCompression() {
            return this.navDisableCompression;
        }

        /**
         * @return navIgnoreCertificateError
         */
        public Long getNavIgnoreCertificateError() {
            return this.navIgnoreCertificateError;
        }

        /**
         * @return navRedirect
         */
        public Long getNavRedirect() {
            return this.navRedirect;
        }

        /**
         * @return navReturnElement
         */
        public Long getNavReturnElement() {
            return this.navReturnElement;
        }

        /**
         * @return pageTampering
         */
        public String getPageTampering() {
            return this.pageTampering;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return quicDomain
         */
        public String getQuicDomain() {
            return this.quicDomain;
        }

        /**
         * @return quicVersion
         */
        public Long getQuicVersion() {
            return this.quicVersion;
        }

        /**
         * @return requestHeader
         */
        public Long getRequestHeader() {
            return this.requestHeader;
        }

        /**
         * @return slowElementThreshold
         */
        public Long getSlowElementThreshold() {
            return this.slowElementThreshold;
        }

        /**
         * @return verifyStringBlacklist
         */
        public String getVerifyStringBlacklist() {
            return this.verifyStringBlacklist;
        }

        /**
         * @return verifyStringWhitelist
         */
        public String getVerifyStringWhitelist() {
            return this.verifyStringWhitelist;
        }

        /**
         * @return waitCompletionTime
         */
        public Long getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

        public static final class Builder {
            private String dnsHijackWhitelist; 
            private String elementBlacklist; 
            private Long executeActiveX; 
            private Long executeApplet; 
            private Long executeScript; 
            private Long filterInvalidIP; 
            private Long flowHijackJumpTimes; 
            private String flowHijackLogo; 
            private Long monitorTimeout; 
            private Long navAutomaticScrolling; 
            private String navCustomHeader; 
            private String navCustomHeaderContent; 
            private Long navCustomHost; 
            private String navCustomHostIp; 
            private Long navDisableCache; 
            private Long navDisableCompression; 
            private Long navIgnoreCertificateError; 
            private Long navRedirect; 
            private Long navReturnElement; 
            private String pageTampering; 
            private String processName; 
            private String quicDomain; 
            private Long quicVersion; 
            private Long requestHeader; 
            private Long slowElementThreshold; 
            private String verifyStringBlacklist; 
            private String verifyStringWhitelist; 
            private Long waitCompletionTime; 

            /**
             * <p>The DNS whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>119.119.53.156</p>
             */
            public Builder dnsHijackWhitelist(String dnsHijackWhitelist) {
                this.dnsHijackWhitelist = dnsHijackWhitelist;
                return this;
            }

            /**
             * <p>The element blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder elementBlacklist(String elementBlacklist) {
                this.elementBlacklist = elementBlacklist;
                return this;
            }

            /**
             * <p>Indicates whether ActiveX is executed. Valid values:</p>
             * <ul>
             * <li>3: yes</li>
             * <li>0: no</li>
             * </ul>
             * <blockquote>
             * <p> Only IE elements support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder executeActiveX(Long executeActiveX) {
                this.executeActiveX = executeActiveX;
                return this;
            }

            /**
             * <p>Indicates whether the applet is executed. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executeApplet(Long executeApplet) {
                this.executeApplet = executeApplet;
                return this;
            }

            /**
             * <p>Indicates whether scripts are executed. Valid values:</p>
             * <ul>
             * <li>1: yes</li>
             * <li>0: no</li>
             * </ul>
             * <blockquote>
             * <p> Only IE elements support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executeScript(Long executeScript) {
                this.executeScript = executeScript;
                return this;
            }

            /**
             * <p>Indicates whether invalid IP addresses are excluded. Valid values:</p>
             * <ul>
             * <li>1: no</li>
             * <li>0: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder filterInvalidIP(Long filterInvalidIP) {
                this.filterInvalidIP = filterInvalidIP;
                return this;
            }

            /**
             * <p>The element that is used in DNS hijacking.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder flowHijackJumpTimes(Long flowHijackJumpTimes) {
                this.flowHijackJumpTimes = flowHijackJumpTimes;
                return this;
            }

            /**
             * <p>The tag that is used in DNS hijacking.</p>
             * 
             * <strong>example:</strong>
             * <p>target</p>
             */
            public Builder flowHijackLogo(String flowHijackLogo) {
                this.flowHijackLogo = flowHijackLogo;
                return this;
            }

            /**
             * <p>The monitoring timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * <p>Indicates whether the screen is automatically scrolled up and down to load a page. Valid values:</p>
             * <ul>
             * <li>1: yes</li>
             * <li>0: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder navAutomaticScrolling(Long navAutomaticScrolling) {
                this.navAutomaticScrolling = navAutomaticScrolling;
                return this;
            }

            /**
             * <p>Indicates whether a custom header is created. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: A custom header is created for the first packet.</li>
             * <li>2: A custom header is created for all packets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder navCustomHeader(String navCustomHeader) {
                this.navCustomHeader = navCustomHeader;
                return this;
            }

            /**
             * <p>The format of the custom header. Multiple fields are separated with vertical bars (|).</p>
             * 
             * <strong>example:</strong>
             * <p>content</p>
             */
            public Builder navCustomHeaderContent(String navCustomHeaderContent) {
                this.navCustomHeaderContent = navCustomHeaderContent;
                return this;
            }

            /**
             * <p>The custom host mode. Valid values:</p>
             * <ul>
             * <li>1: round robin</li>
             * <li>0: random</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder navCustomHost(Long navCustomHost) {
                this.navCustomHost = navCustomHost;
                return this;
            }

            /**
             * <p>The custom IP address of the host. Multiple IP addresses are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>119.119.53.156/32</p>
             */
            public Builder navCustomHostIp(String navCustomHostIp) {
                this.navCustomHostIp = navCustomHostIp;
                return this;
            }

            /**
             * <p>Indicates whether caching is disabled. Valid values:</p>
             * <ul>
             * <li>1: Caching is disabled.</li>
             * <li>0: Caching is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder navDisableCache(Long navDisableCache) {
                this.navDisableCache = navDisableCache;
                return this;
            }

            /**
             * <p>Indicates whether compression is disabled. Valid values:</p>
             * <ul>
             * <li>0: Compression is enabled.</li>
             * <li>1: Compression is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder navDisableCompression(Long navDisableCompression) {
                this.navDisableCompression = navDisableCompression;
                return this;
            }

            /**
             * <p>Indicates whether certificate errors are ignored during certificate verification in the SSL handshake. Valid values:</p>
             * <ul>
             * <li>1: yes</li>
             * <li>0: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder navIgnoreCertificateError(Long navIgnoreCertificateError) {
                this.navIgnoreCertificateError = navIgnoreCertificateError;
                return this;
            }

            /**
             * <p>Indicates whether redirection is enabled. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder navRedirect(Long navRedirect) {
                this.navRedirect = navRedirect;
                return this;
            }

            /**
             * <p>Indicates whether the elements on the page are returned.</p>
             * <ul>
             * <li>1: no. The basic document data is returned.</li>
             * <li>2: yes. All document data is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder navReturnElement(Long navReturnElement) {
                this.navReturnElement = navReturnElement;
                return this;
            }

            /**
             * <p>The page tampering.</p>
             * 
             * <strong>example:</strong>
             * <p>content</p>
             */
            public Builder pageTampering(String pageTampering) {
                this.pageTampering = pageTampering;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ssh</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The domain name of the QUIC request element.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder quicDomain(String quicDomain) {
                this.quicDomain = quicDomain;
                return this;
            }

            /**
             * <p>The QUIC version. Default value: 0. Valid values:</p>
             * <ul>
             * <li>35</li>
             * <li>39</li>
             * <li>43</li>
             * <li>44</li>
             * </ul>
             * <blockquote>
             * <p> Only Chrome elements support this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder quicVersion(Long quicVersion) {
                this.quicVersion = quicVersion;
                return this;
            }

            /**
             * <p>Indicates whether request headers are returned. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: The headers of base documents are returned.</li>
             * <li>2: All headers are returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder requestHeader(Long requestHeader) {
                this.requestHeader = requestHeader;
                return this;
            }

            /**
             * <p>The time threshold that is used to define a slow element. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder slowElementThreshold(Long slowElementThreshold) {
                this.slowElementThreshold = slowElementThreshold;
                return this;
            }

            /**
             * <p>The blacklist for string verification.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder verifyStringBlacklist(String verifyStringBlacklist) {
                this.verifyStringBlacklist = verifyStringBlacklist;
                return this;
            }

            /**
             * <p>The whitelist for string verification.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder verifyStringWhitelist(String verifyStringWhitelist) {
                this.verifyStringWhitelist = verifyStringWhitelist;
                return this;
            }

            /**
             * <p>The timeout period of waiting for the monitoring to complete.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder waitCompletionTime(Long waitCompletionTime) {
                this.waitCompletionTime = waitCompletionTime;
                return this;
            }

            public Nav build() {
                return new Nav(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class Net extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetDigSwitch")
        private Long netDigSwitch;

        @com.aliyun.core.annotation.NameInMap("NetDnsNs")
        private String netDnsNs;

        @com.aliyun.core.annotation.NameInMap("NetDnsQueryMethod")
        private String netDnsQueryMethod;

        @com.aliyun.core.annotation.NameInMap("NetDnsServer")
        private Long netDnsServer;

        @com.aliyun.core.annotation.NameInMap("NetDnsSwitch")
        private Long netDnsSwitch;

        @com.aliyun.core.annotation.NameInMap("NetDnsTimeout")
        private String netDnsTimeout;

        @com.aliyun.core.annotation.NameInMap("NetIcmpActive")
        private Long netIcmpActive;

        @com.aliyun.core.annotation.NameInMap("NetIcmpDataCut")
        private Long netIcmpDataCut;

        @com.aliyun.core.annotation.NameInMap("NetIcmpInterval")
        private Long netIcmpInterval;

        @com.aliyun.core.annotation.NameInMap("NetIcmpNum")
        private Long netIcmpNum;

        @com.aliyun.core.annotation.NameInMap("NetIcmpSize")
        private Long netIcmpSize;

        @com.aliyun.core.annotation.NameInMap("NetIcmpSwitch")
        private Long netIcmpSwitch;

        @com.aliyun.core.annotation.NameInMap("NetIcmpTimeout")
        private Long netIcmpTimeout;

        @com.aliyun.core.annotation.NameInMap("NetTraceRouteNum")
        private Long netTraceRouteNum;

        @com.aliyun.core.annotation.NameInMap("NetTraceRouteSwitch")
        private Long netTraceRouteSwitch;

        @com.aliyun.core.annotation.NameInMap("NetTraceRouteTimeout")
        private Long netTraceRouteTimeout;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private String whiteList;

        private Net(Builder builder) {
            this.netDigSwitch = builder.netDigSwitch;
            this.netDnsNs = builder.netDnsNs;
            this.netDnsQueryMethod = builder.netDnsQueryMethod;
            this.netDnsServer = builder.netDnsServer;
            this.netDnsSwitch = builder.netDnsSwitch;
            this.netDnsTimeout = builder.netDnsTimeout;
            this.netIcmpActive = builder.netIcmpActive;
            this.netIcmpDataCut = builder.netIcmpDataCut;
            this.netIcmpInterval = builder.netIcmpInterval;
            this.netIcmpNum = builder.netIcmpNum;
            this.netIcmpSize = builder.netIcmpSize;
            this.netIcmpSwitch = builder.netIcmpSwitch;
            this.netIcmpTimeout = builder.netIcmpTimeout;
            this.netTraceRouteNum = builder.netTraceRouteNum;
            this.netTraceRouteSwitch = builder.netTraceRouteSwitch;
            this.netTraceRouteTimeout = builder.netTraceRouteTimeout;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Net create() {
            return builder().build();
        }

        /**
         * @return netDigSwitch
         */
        public Long getNetDigSwitch() {
            return this.netDigSwitch;
        }

        /**
         * @return netDnsNs
         */
        public String getNetDnsNs() {
            return this.netDnsNs;
        }

        /**
         * @return netDnsQueryMethod
         */
        public String getNetDnsQueryMethod() {
            return this.netDnsQueryMethod;
        }

        /**
         * @return netDnsServer
         */
        public Long getNetDnsServer() {
            return this.netDnsServer;
        }

        /**
         * @return netDnsSwitch
         */
        public Long getNetDnsSwitch() {
            return this.netDnsSwitch;
        }

        /**
         * @return netDnsTimeout
         */
        public String getNetDnsTimeout() {
            return this.netDnsTimeout;
        }

        /**
         * @return netIcmpActive
         */
        public Long getNetIcmpActive() {
            return this.netIcmpActive;
        }

        /**
         * @return netIcmpDataCut
         */
        public Long getNetIcmpDataCut() {
            return this.netIcmpDataCut;
        }

        /**
         * @return netIcmpInterval
         */
        public Long getNetIcmpInterval() {
            return this.netIcmpInterval;
        }

        /**
         * @return netIcmpNum
         */
        public Long getNetIcmpNum() {
            return this.netIcmpNum;
        }

        /**
         * @return netIcmpSize
         */
        public Long getNetIcmpSize() {
            return this.netIcmpSize;
        }

        /**
         * @return netIcmpSwitch
         */
        public Long getNetIcmpSwitch() {
            return this.netIcmpSwitch;
        }

        /**
         * @return netIcmpTimeout
         */
        public Long getNetIcmpTimeout() {
            return this.netIcmpTimeout;
        }

        /**
         * @return netTraceRouteNum
         */
        public Long getNetTraceRouteNum() {
            return this.netTraceRouteNum;
        }

        /**
         * @return netTraceRouteSwitch
         */
        public Long getNetTraceRouteSwitch() {
            return this.netTraceRouteSwitch;
        }

        /**
         * @return netTraceRouteTimeout
         */
        public Long getNetTraceRouteTimeout() {
            return this.netTraceRouteTimeout;
        }

        /**
         * @return whiteList
         */
        public String getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private Long netDigSwitch; 
            private String netDnsNs; 
            private String netDnsQueryMethod; 
            private Long netDnsServer; 
            private Long netDnsSwitch; 
            private String netDnsTimeout; 
            private Long netIcmpActive; 
            private Long netIcmpDataCut; 
            private Long netIcmpInterval; 
            private Long netIcmpNum; 
            private Long netIcmpSize; 
            private Long netIcmpSwitch; 
            private Long netIcmpTimeout; 
            private Long netTraceRouteNum; 
            private Long netTraceRouteSwitch; 
            private Long netTraceRouteTimeout; 
            private String whiteList; 

            /**
             * <p>Indicates whether the data is displayed in the DIG format. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netDigSwitch(Long netDigSwitch) {
                this.netDigSwitch = netDigSwitch;
                return this;
            }

            /**
             * <p>The NS server.</p>
             * 
             * <strong>example:</strong>
             * <p>189.12.32.124</p>
             */
            public Builder netDnsNs(String netDnsNs) {
                this.netDnsNs = netDnsNs;
                return this;
            }

            /**
             * <p>The DNS query method. Valid values:</p>
             * <ul>
             * <li>1: recursive</li>
             * <li>2: iterative</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder netDnsQueryMethod(String netDnsQueryMethod) {
                this.netDnsQueryMethod = netDnsQueryMethod;
                return this;
            }

            /**
             * <p>The type of the DNS server. Valid values:</p>
             * <ul>
             * <li>0: ipv4</li>
             * <li>1: ipv6</li>
             * <li>2: A version is automatically selected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netDnsServer(Long netDnsServer) {
                this.netDnsServer = netDnsServer;
                return this;
            }

            /**
             * <p>Indicates whether DNS test is enabled. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netDnsSwitch(Long netDnsSwitch) {
                this.netDnsSwitch = netDnsSwitch;
                return this;
            }

            /**
             * <p>The timeout period of DNS requests.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder netDnsTimeout(String netDnsTimeout) {
                this.netDnsTimeout = netDnsTimeout;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li>0 : ICMP</li>
             * <li>1 : TCP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netIcmpActive(Long netIcmpActive) {
                this.netIcmpActive = netIcmpActive;
                return this;
            }

            /**
             * <p>Indicates whether packets are split. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netIcmpDataCut(Long netIcmpDataCut) {
                this.netIcmpDataCut = netIcmpDataCut;
                return this;
            }

            /**
             * <p>The interval at which the synthetic monitoring task is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder netIcmpInterval(Long netIcmpInterval) {
                this.netIcmpInterval = netIcmpInterval;
                return this;
            }

            /**
             * <p>The number of packets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder netIcmpNum(Long netIcmpNum) {
                this.netIcmpNum = netIcmpNum;
                return this;
            }

            /**
             * <p>The packet size.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder netIcmpSize(Long netIcmpSize) {
                this.netIcmpSize = netIcmpSize;
                return this;
            }

            /**
             * <p>Indicates whether ICMP test is enabled. Valid values:</p>
             * <ul>
             * <li>0: no.</li>
             * <li>1: yes. If you set this parameter to 1, you must also set the Icmp parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netIcmpSwitch(Long netIcmpSwitch) {
                this.netIcmpSwitch = netIcmpSwitch;
                return this;
            }

            /**
             * <p>The monitoring timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder netIcmpTimeout(Long netIcmpTimeout) {
                this.netIcmpTimeout = netIcmpTimeout;
                return this;
            }

            /**
             * <p>The maximum number of active detection points.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder netTraceRouteNum(Long netTraceRouteNum) {
                this.netTraceRouteNum = netTraceRouteNum;
                return this;
            }

            /**
             * <p>Indicates whether Tracert test is enabled. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes. If you set this parameter to 1, you must also set the Tracert parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netTraceRouteSwitch(Long netTraceRouteSwitch) {
                this.netTraceRouteSwitch = netTraceRouteSwitch;
                return this;
            }

            /**
             * <p>The monitoring timeout period. Valid values: 0 to 300. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder netTraceRouteTimeout(Long netTraceRouteTimeout) {
                this.netTraceRouteTimeout = netTraceRouteTimeout;
                return this;
            }

            /**
             * <p>The whitelisted objects that are used to avoid DNS hijacking. Format: <code>&lt;domain name&gt;:&lt;objects&gt;</code>.</p>
             * <blockquote>
             * <p> WAP networks do not support hijacking.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>119.119.53.156/32</p>
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Net build() {
                return new Net(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class Formdata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Formdata(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Formdata create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the <strong>form-data</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>appId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the form-data.</p>
             * 
             * <strong>example:</strong>
             * <p>3425</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Formdata build() {
                return new Formdata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class Urlencoded extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Urlencoded(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Urlencoded create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>appId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>11080</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Urlencoded build() {
                return new Urlencoded(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class RequestContentBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Formdata")
        private Formdata formdata;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("Urlencoded")
        private Urlencoded urlencoded;

        private RequestContentBody(Builder builder) {
            this.formdata = builder.formdata;
            this.language = builder.language;
            this.mode = builder.mode;
            this.raw = builder.raw;
            this.urlencoded = builder.urlencoded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestContentBody create() {
            return builder().build();
        }

        /**
         * @return formdata
         */
        public Formdata getFormdata() {
            return this.formdata;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        /**
         * @return urlencoded
         */
        public Urlencoded getUrlencoded() {
            return this.urlencoded;
        }

        public static final class Builder {
            private Formdata formdata; 
            private String language; 
            private String mode; 
            private String raw; 
            private Urlencoded urlencoded; 

            /**
             * <p>The data content. This parameter is returned when Mode is set to form-data.</p>
             */
            public Builder formdata(Formdata formdata) {
                this.formdata = formdata;
                return this;
            }

            /**
             * <p>The language used when Mode is set to raw. Valid values:</p>
             * <ul>
             * <li>json</li>
             * <li>xml</li>
             * <li>javascript</li>
             * <li>html</li>
             * <li>text</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>xml</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The type of the content. Valid values:</p>
             * <ul>
             * <li>form-data</li>
             * <li>x-www-form-urlencoded</li>
             * <li>raw</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>form-data</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The data content. This parameter is returned when <strong>Mode</strong> is set to <strong>raw</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>content</p>
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * <p>The URL of the body content.</p>
             */
            public Builder urlencoded(Urlencoded urlencoded) {
                this.urlencoded = urlencoded;
                return this;
            }

            public RequestContentBody build() {
                return new RequestContentBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class RequestContentHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RequestContentHeader(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestContentHeader create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the header in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>regionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the header in the request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RequestContentHeader build() {
                return new RequestContentHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class RequestContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private RequestContentBody body;

        @com.aliyun.core.annotation.NameInMap("Header")
        private java.util.List < RequestContentHeader> header;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        private RequestContent(Builder builder) {
            this.body = builder.body;
            this.header = builder.header;
            this.method = builder.method;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestContent create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public RequestContentBody getBody() {
            return this.body;
        }

        /**
         * @return header
         */
        public java.util.List < RequestContentHeader> getHeader() {
            return this.header;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        public static final class Builder {
            private RequestContentBody body; 
            private java.util.List < RequestContentHeader> header; 
            private String method; 

            /**
             * <p>The content of the request body.</p>
             */
            public Builder body(RequestContentBody body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The request header.</p>
             */
            public Builder header(java.util.List < RequestContentHeader> header) {
                this.header = header;
                return this;
            }

            /**
             * <p>The request method. Valid values:</p>
             * <ul>
             * <li>POST</li>
             * <li>GET</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            public RequestContent build() {
                return new RequestContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class Protocol extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharacterEncoding")
        private Long characterEncoding;

        @com.aliyun.core.annotation.NameInMap("CustomHost")
        private Long customHost;

        @com.aliyun.core.annotation.NameInMap("CustomHostIp")
        private String customHostIp;

        @com.aliyun.core.annotation.NameInMap("ProtocolConnectionTimeout")
        private Long protocolConnectionTimeout;

        @com.aliyun.core.annotation.NameInMap("ProtocolMonitorTimeout")
        private Long protocolMonitorTimeout;

        @com.aliyun.core.annotation.NameInMap("ReceivedDataSize")
        private Long receivedDataSize;

        @com.aliyun.core.annotation.NameInMap("RequestContent")
        private RequestContent requestContent;

        @com.aliyun.core.annotation.NameInMap("VerifyContent")
        private String verifyContent;

        @com.aliyun.core.annotation.NameInMap("VerifyWay")
        private Long verifyWay;

        private Protocol(Builder builder) {
            this.characterEncoding = builder.characterEncoding;
            this.customHost = builder.customHost;
            this.customHostIp = builder.customHostIp;
            this.protocolConnectionTimeout = builder.protocolConnectionTimeout;
            this.protocolMonitorTimeout = builder.protocolMonitorTimeout;
            this.receivedDataSize = builder.receivedDataSize;
            this.requestContent = builder.requestContent;
            this.verifyContent = builder.verifyContent;
            this.verifyWay = builder.verifyWay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Protocol create() {
            return builder().build();
        }

        /**
         * @return characterEncoding
         */
        public Long getCharacterEncoding() {
            return this.characterEncoding;
        }

        /**
         * @return customHost
         */
        public Long getCustomHost() {
            return this.customHost;
        }

        /**
         * @return customHostIp
         */
        public String getCustomHostIp() {
            return this.customHostIp;
        }

        /**
         * @return protocolConnectionTimeout
         */
        public Long getProtocolConnectionTimeout() {
            return this.protocolConnectionTimeout;
        }

        /**
         * @return protocolMonitorTimeout
         */
        public Long getProtocolMonitorTimeout() {
            return this.protocolMonitorTimeout;
        }

        /**
         * @return receivedDataSize
         */
        public Long getReceivedDataSize() {
            return this.receivedDataSize;
        }

        /**
         * @return requestContent
         */
        public RequestContent getRequestContent() {
            return this.requestContent;
        }

        /**
         * @return verifyContent
         */
        public String getVerifyContent() {
            return this.verifyContent;
        }

        /**
         * @return verifyWay
         */
        public Long getVerifyWay() {
            return this.verifyWay;
        }

        public static final class Builder {
            private Long characterEncoding; 
            private Long customHost; 
            private String customHostIp; 
            private Long protocolConnectionTimeout; 
            private Long protocolMonitorTimeout; 
            private Long receivedDataSize; 
            private RequestContent requestContent; 
            private String verifyContent; 
            private Long verifyWay; 

            /**
             * <p>The encoding format. Valid values:</p>
             * <ul>
             * <li>0: UTF-8</li>
             * <li>1: GBK</li>
             * <li>2: GB2312</li>
             * <li>3: Unicode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder characterEncoding(Long characterEncoding) {
                this.characterEncoding = characterEncoding;
                return this;
            }

            /**
             * <p>The custom host. Valid values:</p>
             * <ul>
             * <li>1: round robin</li>
             * <li>0: random</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customHost(Long customHost) {
                this.customHost = customHost;
                return this;
            }

            /**
             * <p>The custom IP address of the host. Multiple IP addresses are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>119.119.53.156</p>
             */
            public Builder customHostIp(String customHostIp) {
                this.customHostIp = customHostIp;
                return this;
            }

            /**
             * <p>The timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder protocolConnectionTimeout(Long protocolConnectionTimeout) {
                this.protocolConnectionTimeout = protocolConnectionTimeout;
                return this;
            }

            /**
             * <p>The timeout period of API performance monitoring. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder protocolMonitorTimeout(Long protocolMonitorTimeout) {
                this.protocolMonitorTimeout = protocolMonitorTimeout;
                return this;
            }

            /**
             * <p>The size of the received data. This parameter is returned when <strong>VerifyWay</strong> is set to 2.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder receivedDataSize(Long receivedDataSize) {
                this.receivedDataSize = receivedDataSize;
                return this;
            }

            /**
             * <p>The request content, including the header and body.</p>
             */
            public Builder requestContent(RequestContent requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            /**
             * <p>The verification string.</p>
             * 
             * <strong>example:</strong>
             * <p>list</p>
             */
            public Builder verifyContent(String verifyContent) {
                this.verifyContent = verifyContent;
                return this;
            }

            /**
             * <p>The method that is used to verify the response content. Valid values:</p>
             * <ul>
             * <li>0: no verification.</li>
             * <li>1: exact match with the verification string.</li>
             * <li>2: partial match with the verification string.</li>
             * <li>3: MD5 verification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder verifyWay(Long verifyWay) {
                this.verifyWay = verifyWay;
                return this;
            }

            public Protocol build() {
                return new Protocol(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskDetailResponseBody</p>
     */
    public static class TaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonParam")
        private CommonParam commonParam;

        @com.aliyun.core.annotation.NameInMap("Download")
        private Download download;

        @com.aliyun.core.annotation.NameInMap("ExtendInterval")
        private ExtendInterval extendInterval;

        @com.aliyun.core.annotation.NameInMap("IntervalTime")
        private Long intervalTime;

        @com.aliyun.core.annotation.NameInMap("IntervalType")
        private Long intervalType;

        @com.aliyun.core.annotation.NameInMap("IpType")
        private Long ipType;

        @com.aliyun.core.annotation.NameInMap("MonitorList")
        private java.util.List < MonitorList> monitorList;

        @com.aliyun.core.annotation.NameInMap("MonitorListString")
        private String monitorListString;

        @com.aliyun.core.annotation.NameInMap("Nav")
        private Nav nav;

        @com.aliyun.core.annotation.NameInMap("Net")
        private Net net;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private Protocol protocol;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private Long taskType;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TaskDetail(Builder builder) {
            this.commonParam = builder.commonParam;
            this.download = builder.download;
            this.extendInterval = builder.extendInterval;
            this.intervalTime = builder.intervalTime;
            this.intervalType = builder.intervalType;
            this.ipType = builder.ipType;
            this.monitorList = builder.monitorList;
            this.monitorListString = builder.monitorListString;
            this.nav = builder.nav;
            this.net = builder.net;
            this.protocol = builder.protocol;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDetail create() {
            return builder().build();
        }

        /**
         * @return commonParam
         */
        public CommonParam getCommonParam() {
            return this.commonParam;
        }

        /**
         * @return download
         */
        public Download getDownload() {
            return this.download;
        }

        /**
         * @return extendInterval
         */
        public ExtendInterval getExtendInterval() {
            return this.extendInterval;
        }

        /**
         * @return intervalTime
         */
        public Long getIntervalTime() {
            return this.intervalTime;
        }

        /**
         * @return intervalType
         */
        public Long getIntervalType() {
            return this.intervalType;
        }

        /**
         * @return ipType
         */
        public Long getIpType() {
            return this.ipType;
        }

        /**
         * @return monitorList
         */
        public java.util.List < MonitorList> getMonitorList() {
            return this.monitorList;
        }

        /**
         * @return monitorListString
         */
        public String getMonitorListString() {
            return this.monitorListString;
        }

        /**
         * @return nav
         */
        public Nav getNav() {
            return this.nav;
        }

        /**
         * @return net
         */
        public Net getNet() {
            return this.net;
        }

        /**
         * @return protocol
         */
        public Protocol getProtocol() {
            return this.protocol;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public Long getTaskType() {
            return this.taskType;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private CommonParam commonParam; 
            private Download download; 
            private ExtendInterval extendInterval; 
            private Long intervalTime; 
            private Long intervalType; 
            private Long ipType; 
            private java.util.List < MonitorList> monitorList; 
            private String monitorListString; 
            private Nav nav; 
            private Net net; 
            private Protocol protocol; 
            private Long taskId; 
            private String taskName; 
            private Long taskType; 
            private String url; 

            /**
             * <p>The list of common parameters.</p>
             */
            public Builder commonParam(CommonParam commonParam) {
                this.commonParam = commonParam;
                return this;
            }

            /**
             * <p>The file download task.</p>
             */
            public Builder download(Download download) {
                this.download = download;
                return this;
            }

            /**
             * <p>The frequency.</p>
             */
            public Builder extendInterval(ExtendInterval extendInterval) {
                this.extendInterval = extendInterval;
                return this;
            }

            /**
             * <p>The interval at which synthetic monitoring is performed. Unit: minutes. Valid values:</p>
             * <ul>
             * <li>1</li>
             * <li>5</li>
             * <li>10</li>
             * <li>15</li>
             * <li>20</li>
             * <li>30</li>
             * <li>60</li>
             * <li>120</li>
             * <li>180</li>
             * <li>240</li>
             * <li>360</li>
             * <li>480</li>
             * <li>720</li>
             * <li>1440</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder intervalTime(Long intervalTime) {
                this.intervalTime = intervalTime;
                return this;
            }

            /**
             * <p>The interval type. Valid values:</p>
             * <ul>
             * <li>0: daily</li>
             * <li>1: custom frequency</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder intervalType(Long intervalType) {
                this.intervalType = intervalType;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li>0: A version is automatically selected.</li>
             * <li>1: IPv4.</li>
             * <li>2: IPv6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ipType(Long ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * <p>The detection points.</p>
             */
            public Builder monitorList(java.util.List < MonitorList> monitorList) {
                this.monitorList = monitorList;
                return this;
            }

            /**
             * <p>The detection points.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder monitorListString(String monitorListString) {
                this.monitorListString = monitorListString;
                return this;
            }

            /**
             * <p>The browser test task.</p>
             */
            public Builder nav(Nav nav) {
                this.nav = nav;
                return this;
            }

            /**
             * <p>The network synthetic monitoring task.</p>
             */
            public Builder net(Net net) {
                this.net = net;
                return this;
            }

            /**
             * <p>The synthetic monitoring task of the API performance type.</p>
             */
            public Builder protocol(Protocol protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The ID of the synthetic monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>19584</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>net-test</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ol>
             * <li>3: web page performance - IE</li>
             * <li>34: web page performance - Chrome</li>
             * <li>0: network quality</li>
             * <li>40: file download</li>
             * <li>7: API performance</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskType(Long taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The URL for synthetic monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public TaskDetail build() {
                return new TaskDetail(this);
            } 

        } 

    }
}
