// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskDetailResponseBody</p>
 */
public class GetSyntheticTaskDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskDetail")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskDetail.
         */
        public Builder taskDetail(TaskDetail taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }

        public GetSyntheticTaskDetailResponseBody build() {
            return new GetSyntheticTaskDetailResponseBody(this);
        } 

    } 

    public static class AlertList extends TeaModel {
        @NameInMap("GeneralAlert")
        private String generalAlert;

        @NameInMap("IsCritical")
        private String isCritical;

        @NameInMap("Name")
        private String name;

        @NameInMap("SeriousAlert")
        private String seriousAlert;

        @NameInMap("Symbols")
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
             * GeneralAlert.
             */
            public Builder generalAlert(String generalAlert) {
                this.generalAlert = generalAlert;
                return this;
            }

            /**
             * IsCritical.
             */
            public Builder isCritical(String isCritical) {
                this.isCritical = isCritical;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SeriousAlert.
             */
            public Builder seriousAlert(String seriousAlert) {
                this.seriousAlert = seriousAlert;
                return this;
            }

            /**
             * Symbols.
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
    public static class CommonParam extends TeaModel {
        @NameInMap("AlarmFlag")
        private Long alarmFlag;

        @NameInMap("AlertList")
        private java.util.List < AlertList> alertList;

        @NameInMap("AlertNotifierId")
        private String alertNotifierId;

        @NameInMap("AlertPolicyId")
        private String alertPolicyId;

        @NameInMap("MonitorSamples")
        private String monitorSamples;

        @NameInMap("StartExecutionTime")
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
             * AlarmFlag.
             */
            public Builder alarmFlag(Long alarmFlag) {
                this.alarmFlag = alarmFlag;
                return this;
            }

            /**
             * AlertList.
             */
            public Builder alertList(java.util.List < AlertList> alertList) {
                this.alertList = alertList;
                return this;
            }

            /**
             * AlertNotifierId.
             */
            public Builder alertNotifierId(String alertNotifierId) {
                this.alertNotifierId = alertNotifierId;
                return this;
            }

            /**
             * AlertPolicyId.
             */
            public Builder alertPolicyId(String alertPolicyId) {
                this.alertPolicyId = alertPolicyId;
                return this;
            }

            /**
             * MonitorSamples.
             */
            public Builder monitorSamples(String monitorSamples) {
                this.monitorSamples = monitorSamples;
                return this;
            }

            /**
             * StartExecutionTime.
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
    public static class Download extends TeaModel {
        @NameInMap("ConnectionTimeout")
        private Long connectionTimeout;

        @NameInMap("DownloadCustomHeaderContent")
        private String downloadCustomHeaderContent;

        @NameInMap("DownloadCustomHost")
        private Long downloadCustomHost;

        @NameInMap("DownloadCustomHostIp")
        private String downloadCustomHostIp;

        @NameInMap("DownloadKernel")
        private Long downloadKernel;

        @NameInMap("DownloadRedirect")
        private Long downloadRedirect;

        @NameInMap("DownloadTransmissionSize")
        private Long downloadTransmissionSize;

        @NameInMap("MonitorTimeout")
        private Long monitorTimeout;

        @NameInMap("QuickProtocol")
        private String quickProtocol;

        @NameInMap("ValidateKeywords")
        private String validateKeywords;

        @NameInMap("VerifyWay")
        private Long verifyWay;

        @NameInMap("WhiteList")
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
             * ConnectionTimeout.
             */
            public Builder connectionTimeout(Long connectionTimeout) {
                this.connectionTimeout = connectionTimeout;
                return this;
            }

            /**
             * DownloadCustomHeaderContent.
             */
            public Builder downloadCustomHeaderContent(String downloadCustomHeaderContent) {
                this.downloadCustomHeaderContent = downloadCustomHeaderContent;
                return this;
            }

            /**
             * DownloadCustomHost.
             */
            public Builder downloadCustomHost(Long downloadCustomHost) {
                this.downloadCustomHost = downloadCustomHost;
                return this;
            }

            /**
             * DownloadCustomHostIp.
             */
            public Builder downloadCustomHostIp(String downloadCustomHostIp) {
                this.downloadCustomHostIp = downloadCustomHostIp;
                return this;
            }

            /**
             * DownloadKernel.
             */
            public Builder downloadKernel(Long downloadKernel) {
                this.downloadKernel = downloadKernel;
                return this;
            }

            /**
             * DownloadRedirect.
             */
            public Builder downloadRedirect(Long downloadRedirect) {
                this.downloadRedirect = downloadRedirect;
                return this;
            }

            /**
             * DownloadTransmissionSize.
             */
            public Builder downloadTransmissionSize(Long downloadTransmissionSize) {
                this.downloadTransmissionSize = downloadTransmissionSize;
                return this;
            }

            /**
             * MonitorTimeout.
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * QuickProtocol.
             */
            public Builder quickProtocol(String quickProtocol) {
                this.quickProtocol = quickProtocol;
                return this;
            }

            /**
             * ValidateKeywords.
             */
            public Builder validateKeywords(String validateKeywords) {
                this.validateKeywords = validateKeywords;
                return this;
            }

            /**
             * VerifyWay.
             */
            public Builder verifyWay(Long verifyWay) {
                this.verifyWay = verifyWay;
                return this;
            }

            /**
             * WhiteList.
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
    public static class ExtendInterval extends TeaModel {
        @NameInMap("Days")
        private java.util.List < Long > days;

        @NameInMap("EndMinute")
        private Long endMinute;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Endhour")
        private Long endhour;

        @NameInMap("StartHour")
        private Long startHour;

        @NameInMap("StartMinute")
        private Long startMinute;

        @NameInMap("StartTime")
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
             * Days.
             */
            public Builder days(java.util.List < Long > days) {
                this.days = days;
                return this;
            }

            /**
             * EndMinute.
             */
            public Builder endMinute(Long endMinute) {
                this.endMinute = endMinute;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Endhour.
             */
            public Builder endhour(Long endhour) {
                this.endhour = endhour;
                return this;
            }

            /**
             * StartHour.
             */
            public Builder startHour(Long startHour) {
                this.startHour = startHour;
                return this;
            }

            /**
             * StartMinute.
             */
            public Builder startMinute(Long startMinute) {
                this.startMinute = startMinute;
                return this;
            }

            /**
             * StartTime.
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
    public static class MonitorList extends TeaModel {
        @NameInMap("CityCode")
        private Long cityCode;

        @NameInMap("MonitorType")
        private Long monitorType;

        @NameInMap("NetServiceId")
        private Long netServiceId;

        @NameInMap("SendCount")
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
             * CityCode.
             */
            public Builder cityCode(Long cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * MonitorType.
             */
            public Builder monitorType(Long monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * NetServiceId.
             */
            public Builder netServiceId(Long netServiceId) {
                this.netServiceId = netServiceId;
                return this;
            }

            /**
             * SendCount.
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
    public static class Nav extends TeaModel {
        @NameInMap("DnsHijackWhitelist")
        private String dnsHijackWhitelist;

        @NameInMap("ElementBlacklist")
        private String elementBlacklist;

        @NameInMap("ExecuteActiveX")
        private Long executeActiveX;

        @NameInMap("ExecuteApplet")
        private Long executeApplet;

        @NameInMap("ExecuteScript")
        private Long executeScript;

        @NameInMap("FilterInvalidIP")
        private Long filterInvalidIP;

        @NameInMap("FlowHijackJumpTimes")
        private Long flowHijackJumpTimes;

        @NameInMap("FlowHijackLogo")
        private String flowHijackLogo;

        @NameInMap("MonitorTimeout")
        private Long monitorTimeout;

        @NameInMap("NavAutomaticScrolling")
        private Long navAutomaticScrolling;

        @NameInMap("NavCustomHeader")
        private String navCustomHeader;

        @NameInMap("NavCustomHeaderContent")
        private String navCustomHeaderContent;

        @NameInMap("NavCustomHost")
        private Long navCustomHost;

        @NameInMap("NavCustomHostIp")
        private String navCustomHostIp;

        @NameInMap("NavDisableCache")
        private Long navDisableCache;

        @NameInMap("NavDisableCompression")
        private Long navDisableCompression;

        @NameInMap("NavIgnoreCertificateError")
        private Long navIgnoreCertificateError;

        @NameInMap("NavRedirect")
        private Long navRedirect;

        @NameInMap("NavReturnElement")
        private Long navReturnElement;

        @NameInMap("PageTampering")
        private String pageTampering;

        @NameInMap("ProcessName")
        private String processName;

        @NameInMap("QuicDomain")
        private String quicDomain;

        @NameInMap("QuicVersion")
        private Long quicVersion;

        @NameInMap("RequestHeader")
        private Long requestHeader;

        @NameInMap("SlowElementThreshold")
        private Long slowElementThreshold;

        @NameInMap("VerifyStringBlacklist")
        private String verifyStringBlacklist;

        @NameInMap("VerifyStringWhitelist")
        private String verifyStringWhitelist;

        @NameInMap("WaitCompletionTime")
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
             * DnsHijackWhitelist.
             */
            public Builder dnsHijackWhitelist(String dnsHijackWhitelist) {
                this.dnsHijackWhitelist = dnsHijackWhitelist;
                return this;
            }

            /**
             * ElementBlacklist.
             */
            public Builder elementBlacklist(String elementBlacklist) {
                this.elementBlacklist = elementBlacklist;
                return this;
            }

            /**
             * ExecuteActiveX.
             */
            public Builder executeActiveX(Long executeActiveX) {
                this.executeActiveX = executeActiveX;
                return this;
            }

            /**
             * ExecuteApplet.
             */
            public Builder executeApplet(Long executeApplet) {
                this.executeApplet = executeApplet;
                return this;
            }

            /**
             * ExecuteScript.
             */
            public Builder executeScript(Long executeScript) {
                this.executeScript = executeScript;
                return this;
            }

            /**
             * FilterInvalidIP.
             */
            public Builder filterInvalidIP(Long filterInvalidIP) {
                this.filterInvalidIP = filterInvalidIP;
                return this;
            }

            /**
             * FlowHijackJumpTimes.
             */
            public Builder flowHijackJumpTimes(Long flowHijackJumpTimes) {
                this.flowHijackJumpTimes = flowHijackJumpTimes;
                return this;
            }

            /**
             * FlowHijackLogo.
             */
            public Builder flowHijackLogo(String flowHijackLogo) {
                this.flowHijackLogo = flowHijackLogo;
                return this;
            }

            /**
             * MonitorTimeout.
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * NavAutomaticScrolling.
             */
            public Builder navAutomaticScrolling(Long navAutomaticScrolling) {
                this.navAutomaticScrolling = navAutomaticScrolling;
                return this;
            }

            /**
             * NavCustomHeader.
             */
            public Builder navCustomHeader(String navCustomHeader) {
                this.navCustomHeader = navCustomHeader;
                return this;
            }

            /**
             * NavCustomHeaderContent.
             */
            public Builder navCustomHeaderContent(String navCustomHeaderContent) {
                this.navCustomHeaderContent = navCustomHeaderContent;
                return this;
            }

            /**
             * NavCustomHost.
             */
            public Builder navCustomHost(Long navCustomHost) {
                this.navCustomHost = navCustomHost;
                return this;
            }

            /**
             * NavCustomHostIp.
             */
            public Builder navCustomHostIp(String navCustomHostIp) {
                this.navCustomHostIp = navCustomHostIp;
                return this;
            }

            /**
             * NavDisableCache.
             */
            public Builder navDisableCache(Long navDisableCache) {
                this.navDisableCache = navDisableCache;
                return this;
            }

            /**
             * NavDisableCompression.
             */
            public Builder navDisableCompression(Long navDisableCompression) {
                this.navDisableCompression = navDisableCompression;
                return this;
            }

            /**
             * NavIgnoreCertificateError.
             */
            public Builder navIgnoreCertificateError(Long navIgnoreCertificateError) {
                this.navIgnoreCertificateError = navIgnoreCertificateError;
                return this;
            }

            /**
             * NavRedirect.
             */
            public Builder navRedirect(Long navRedirect) {
                this.navRedirect = navRedirect;
                return this;
            }

            /**
             * NavReturnElement.
             */
            public Builder navReturnElement(Long navReturnElement) {
                this.navReturnElement = navReturnElement;
                return this;
            }

            /**
             * PageTampering.
             */
            public Builder pageTampering(String pageTampering) {
                this.pageTampering = pageTampering;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * QuicDomain.
             */
            public Builder quicDomain(String quicDomain) {
                this.quicDomain = quicDomain;
                return this;
            }

            /**
             * QuicVersion.
             */
            public Builder quicVersion(Long quicVersion) {
                this.quicVersion = quicVersion;
                return this;
            }

            /**
             * RequestHeader.
             */
            public Builder requestHeader(Long requestHeader) {
                this.requestHeader = requestHeader;
                return this;
            }

            /**
             * SlowElementThreshold.
             */
            public Builder slowElementThreshold(Long slowElementThreshold) {
                this.slowElementThreshold = slowElementThreshold;
                return this;
            }

            /**
             * VerifyStringBlacklist.
             */
            public Builder verifyStringBlacklist(String verifyStringBlacklist) {
                this.verifyStringBlacklist = verifyStringBlacklist;
                return this;
            }

            /**
             * VerifyStringWhitelist.
             */
            public Builder verifyStringWhitelist(String verifyStringWhitelist) {
                this.verifyStringWhitelist = verifyStringWhitelist;
                return this;
            }

            /**
             * WaitCompletionTime.
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
    public static class Net extends TeaModel {
        @NameInMap("NetDigSwitch")
        private Long netDigSwitch;

        @NameInMap("NetDnsNs")
        private String netDnsNs;

        @NameInMap("NetDnsQueryMethod")
        private String netDnsQueryMethod;

        @NameInMap("NetDnsServer")
        private Long netDnsServer;

        @NameInMap("NetDnsSwitch")
        private Long netDnsSwitch;

        @NameInMap("NetDnsTimeout")
        private String netDnsTimeout;

        @NameInMap("NetIcmpActive")
        private Long netIcmpActive;

        @NameInMap("NetIcmpDataCut")
        private Long netIcmpDataCut;

        @NameInMap("NetIcmpInterval")
        private Long netIcmpInterval;

        @NameInMap("NetIcmpNum")
        private Long netIcmpNum;

        @NameInMap("NetIcmpSize")
        private Long netIcmpSize;

        @NameInMap("NetIcmpSwitch")
        private Long netIcmpSwitch;

        @NameInMap("NetIcmpTimeout")
        private Long netIcmpTimeout;

        @NameInMap("NetTraceRouteNum")
        private Long netTraceRouteNum;

        @NameInMap("NetTraceRouteSwitch")
        private Long netTraceRouteSwitch;

        @NameInMap("NetTraceRouteTimeout")
        private Long netTraceRouteTimeout;

        @NameInMap("WhiteList")
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
             * NetDigSwitch.
             */
            public Builder netDigSwitch(Long netDigSwitch) {
                this.netDigSwitch = netDigSwitch;
                return this;
            }

            /**
             * NetDnsNs.
             */
            public Builder netDnsNs(String netDnsNs) {
                this.netDnsNs = netDnsNs;
                return this;
            }

            /**
             * NetDnsQueryMethod.
             */
            public Builder netDnsQueryMethod(String netDnsQueryMethod) {
                this.netDnsQueryMethod = netDnsQueryMethod;
                return this;
            }

            /**
             * NetDnsServer.
             */
            public Builder netDnsServer(Long netDnsServer) {
                this.netDnsServer = netDnsServer;
                return this;
            }

            /**
             * NetDnsSwitch.
             */
            public Builder netDnsSwitch(Long netDnsSwitch) {
                this.netDnsSwitch = netDnsSwitch;
                return this;
            }

            /**
             * NetDnsTimeout.
             */
            public Builder netDnsTimeout(String netDnsTimeout) {
                this.netDnsTimeout = netDnsTimeout;
                return this;
            }

            /**
             * NetIcmpActive.
             */
            public Builder netIcmpActive(Long netIcmpActive) {
                this.netIcmpActive = netIcmpActive;
                return this;
            }

            /**
             * NetIcmpDataCut.
             */
            public Builder netIcmpDataCut(Long netIcmpDataCut) {
                this.netIcmpDataCut = netIcmpDataCut;
                return this;
            }

            /**
             * NetIcmpInterval.
             */
            public Builder netIcmpInterval(Long netIcmpInterval) {
                this.netIcmpInterval = netIcmpInterval;
                return this;
            }

            /**
             * NetIcmpNum.
             */
            public Builder netIcmpNum(Long netIcmpNum) {
                this.netIcmpNum = netIcmpNum;
                return this;
            }

            /**
             * NetIcmpSize.
             */
            public Builder netIcmpSize(Long netIcmpSize) {
                this.netIcmpSize = netIcmpSize;
                return this;
            }

            /**
             * NetIcmpSwitch.
             */
            public Builder netIcmpSwitch(Long netIcmpSwitch) {
                this.netIcmpSwitch = netIcmpSwitch;
                return this;
            }

            /**
             * NetIcmpTimeout.
             */
            public Builder netIcmpTimeout(Long netIcmpTimeout) {
                this.netIcmpTimeout = netIcmpTimeout;
                return this;
            }

            /**
             * NetTraceRouteNum.
             */
            public Builder netTraceRouteNum(Long netTraceRouteNum) {
                this.netTraceRouteNum = netTraceRouteNum;
                return this;
            }

            /**
             * NetTraceRouteSwitch.
             */
            public Builder netTraceRouteSwitch(Long netTraceRouteSwitch) {
                this.netTraceRouteSwitch = netTraceRouteSwitch;
                return this;
            }

            /**
             * NetTraceRouteTimeout.
             */
            public Builder netTraceRouteTimeout(Long netTraceRouteTimeout) {
                this.netTraceRouteTimeout = netTraceRouteTimeout;
                return this;
            }

            /**
             * WhiteList.
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
    public static class Formdata extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Urlencoded extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class RequestContentBody extends TeaModel {
        @NameInMap("Formdata")
        private Formdata formdata;

        @NameInMap("Language")
        private String language;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Raw")
        private String raw;

        @NameInMap("Urlencoded")
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
             * Formdata.
             */
            public Builder formdata(Formdata formdata) {
                this.formdata = formdata;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Raw.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * Urlencoded.
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
    public static class RequestContentHeader extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class RequestContent extends TeaModel {
        @NameInMap("Body")
        private RequestContentBody body;

        @NameInMap("Header")
        private java.util.List < RequestContentHeader> header;

        @NameInMap("Method")
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
             * Body.
             */
            public Builder body(RequestContentBody body) {
                this.body = body;
                return this;
            }

            /**
             * Header.
             */
            public Builder header(java.util.List < RequestContentHeader> header) {
                this.header = header;
                return this;
            }

            /**
             * Method.
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
    public static class Protocol extends TeaModel {
        @NameInMap("CharacterEncoding")
        private Long characterEncoding;

        @NameInMap("CustomHost")
        private Long customHost;

        @NameInMap("CustomHostIp")
        private String customHostIp;

        @NameInMap("ProtocolConnectionTimeout")
        private Long protocolConnectionTimeout;

        @NameInMap("ProtocolMonitorTimeout")
        private Long protocolMonitorTimeout;

        @NameInMap("ReceivedDataSize")
        private Long receivedDataSize;

        @NameInMap("RequestContent")
        private RequestContent requestContent;

        @NameInMap("VerifyContent")
        private String verifyContent;

        @NameInMap("VerifyWay")
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
             * CharacterEncoding.
             */
            public Builder characterEncoding(Long characterEncoding) {
                this.characterEncoding = characterEncoding;
                return this;
            }

            /**
             * CustomHost.
             */
            public Builder customHost(Long customHost) {
                this.customHost = customHost;
                return this;
            }

            /**
             * CustomHostIp.
             */
            public Builder customHostIp(String customHostIp) {
                this.customHostIp = customHostIp;
                return this;
            }

            /**
             * ProtocolConnectionTimeout.
             */
            public Builder protocolConnectionTimeout(Long protocolConnectionTimeout) {
                this.protocolConnectionTimeout = protocolConnectionTimeout;
                return this;
            }

            /**
             * ProtocolMonitorTimeout.
             */
            public Builder protocolMonitorTimeout(Long protocolMonitorTimeout) {
                this.protocolMonitorTimeout = protocolMonitorTimeout;
                return this;
            }

            /**
             * ReceivedDataSize.
             */
            public Builder receivedDataSize(Long receivedDataSize) {
                this.receivedDataSize = receivedDataSize;
                return this;
            }

            /**
             * RequestContent.
             */
            public Builder requestContent(RequestContent requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            /**
             * VerifyContent.
             */
            public Builder verifyContent(String verifyContent) {
                this.verifyContent = verifyContent;
                return this;
            }

            /**
             * VerifyWay.
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
    public static class TaskDetail extends TeaModel {
        @NameInMap("CommonParam")
        private CommonParam commonParam;

        @NameInMap("Download")
        private Download download;

        @NameInMap("ExtendInterval")
        private ExtendInterval extendInterval;

        @NameInMap("IntervalTime")
        private Long intervalTime;

        @NameInMap("IntervalType")
        private Long intervalType;

        @NameInMap("IpType")
        private Long ipType;

        @NameInMap("MonitorList")
        private java.util.List < MonitorList> monitorList;

        @NameInMap("MonitorListString")
        private String monitorListString;

        @NameInMap("Nav")
        private Nav nav;

        @NameInMap("Net")
        private Net net;

        @NameInMap("Protocol")
        private Protocol protocol;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskType")
        private Long taskType;

        @NameInMap("Url")
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
             * CommonParam.
             */
            public Builder commonParam(CommonParam commonParam) {
                this.commonParam = commonParam;
                return this;
            }

            /**
             * Download.
             */
            public Builder download(Download download) {
                this.download = download;
                return this;
            }

            /**
             * ExtendInterval.
             */
            public Builder extendInterval(ExtendInterval extendInterval) {
                this.extendInterval = extendInterval;
                return this;
            }

            /**
             * IntervalTime.
             */
            public Builder intervalTime(Long intervalTime) {
                this.intervalTime = intervalTime;
                return this;
            }

            /**
             * IntervalType.
             */
            public Builder intervalType(Long intervalType) {
                this.intervalType = intervalType;
                return this;
            }

            /**
             * IpType.
             */
            public Builder ipType(Long ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * MonitorList.
             */
            public Builder monitorList(java.util.List < MonitorList> monitorList) {
                this.monitorList = monitorList;
                return this;
            }

            /**
             * MonitorListString.
             */
            public Builder monitorListString(String monitorListString) {
                this.monitorListString = monitorListString;
                return this;
            }

            /**
             * Nav.
             */
            public Builder nav(Nav nav) {
                this.nav = nav;
                return this;
            }

            /**
             * Net.
             */
            public Builder net(Net net) {
                this.net = net;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(Protocol protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(Long taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * Url.
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
