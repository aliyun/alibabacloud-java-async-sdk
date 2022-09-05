// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSyntheticTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSyntheticTaskRequest</p>
 */
public class CreateSyntheticTaskRequest extends Request {
    @Query
    @NameInMap("CommonParam")
    private CommonParam commonParam;

    @Query
    @NameInMap("Download")
    private Download download;

    @Query
    @NameInMap("ExtendInterval")
    private ExtendInterval extendInterval;

    @Query
    @NameInMap("IntervalTime")
    @Validation(required = true)
    private String intervalTime;

    @Query
    @NameInMap("IntervalType")
    @Validation(required = true)
    private String intervalType;

    @Query
    @NameInMap("IpType")
    @Validation(required = true)
    private Long ipType;

    @Query
    @NameInMap("MonitorList")
    @Validation(required = true)
    private java.util.List < MonitorList> monitorList;

    @Query
    @NameInMap("Navigation")
    private Navigation navigation;

    @Query
    @NameInMap("Net")
    private Net net;

    @Query
    @NameInMap("Protocol")
    private Protocol protocol;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private Long taskType;

    @Query
    @NameInMap("UpdateTask")
    private Boolean updateTask;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private CreateSyntheticTaskRequest(Builder builder) {
        super(builder);
        this.commonParam = builder.commonParam;
        this.download = builder.download;
        this.extendInterval = builder.extendInterval;
        this.intervalTime = builder.intervalTime;
        this.intervalType = builder.intervalType;
        this.ipType = builder.ipType;
        this.monitorList = builder.monitorList;
        this.navigation = builder.navigation;
        this.net = builder.net;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.updateTask = builder.updateTask;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSyntheticTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getIntervalTime() {
        return this.intervalTime;
    }

    /**
     * @return intervalType
     */
    public String getIntervalType() {
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
     * @return navigation
     */
    public Navigation getNavigation() {
        return this.navigation;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return updateTask
     */
    public Boolean getUpdateTask() {
        return this.updateTask;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateSyntheticTaskRequest, Builder> {
        private CommonParam commonParam; 
        private Download download; 
        private ExtendInterval extendInterval; 
        private String intervalTime; 
        private String intervalType; 
        private Long ipType; 
        private java.util.List < MonitorList> monitorList; 
        private Navigation navigation; 
        private Net net; 
        private Protocol protocol; 
        private String regionId; 
        private String taskName; 
        private Long taskType; 
        private Boolean updateTask; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateSyntheticTaskRequest request) {
            super(request);
            this.commonParam = request.commonParam;
            this.download = request.download;
            this.extendInterval = request.extendInterval;
            this.intervalTime = request.intervalTime;
            this.intervalType = request.intervalType;
            this.ipType = request.ipType;
            this.monitorList = request.monitorList;
            this.navigation = request.navigation;
            this.net = request.net;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.updateTask = request.updateTask;
            this.url = request.url;
        } 

        /**
         * CommonParam.
         */
        public Builder commonParam(CommonParam commonParam) {
            String commonParamShrink = shrink(commonParam, "CommonParam", "json");
            this.putQueryParameter("CommonParam", commonParamShrink);
            this.commonParam = commonParam;
            return this;
        }

        /**
         * Download.
         */
        public Builder download(Download download) {
            String downloadShrink = shrink(download, "Download", "json");
            this.putQueryParameter("Download", downloadShrink);
            this.download = download;
            return this;
        }

        /**
         * ExtendInterval.
         */
        public Builder extendInterval(ExtendInterval extendInterval) {
            String extendIntervalShrink = shrink(extendInterval, "ExtendInterval", "json");
            this.putQueryParameter("ExtendInterval", extendIntervalShrink);
            this.extendInterval = extendInterval;
            return this;
        }

        /**
         * IntervalTime.
         */
        public Builder intervalTime(String intervalTime) {
            this.putQueryParameter("IntervalTime", intervalTime);
            this.intervalTime = intervalTime;
            return this;
        }

        /**
         * IntervalType.
         */
        public Builder intervalType(String intervalType) {
            this.putQueryParameter("IntervalType", intervalType);
            this.intervalType = intervalType;
            return this;
        }

        /**
         * IpType.
         */
        public Builder ipType(Long ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * MonitorList.
         */
        public Builder monitorList(java.util.List < MonitorList> monitorList) {
            String monitorListShrink = shrink(monitorList, "MonitorList", "json");
            this.putQueryParameter("MonitorList", monitorListShrink);
            this.monitorList = monitorList;
            return this;
        }

        /**
         * Navigation.
         */
        public Builder navigation(Navigation navigation) {
            String navigationShrink = shrink(navigation, "Navigation", "json");
            this.putQueryParameter("Navigation", navigationShrink);
            this.navigation = navigation;
            return this;
        }

        /**
         * Net.
         */
        public Builder net(Net net) {
            String netShrink = shrink(net, "Net", "json");
            this.putQueryParameter("Net", netShrink);
            this.net = net;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(Protocol protocol) {
            String protocolShrink = shrink(protocol, "Protocol", "json");
            this.putQueryParameter("Protocol", protocolShrink);
            this.protocol = protocol;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(Long taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * UpdateTask.
         */
        public Builder updateTask(Boolean updateTask) {
            this.putQueryParameter("UpdateTask", updateTask);
            this.updateTask = updateTask;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateSyntheticTaskRequest build() {
            return new CreateSyntheticTaskRequest(this);
        } 

    } 

    public static class AlertList extends TeaModel {
        @NameInMap("IsCritical")
        private Long isCritical;

        @NameInMap("Name")
        private String name;

        @NameInMap("Symbols")
        private Long symbols;

        private AlertList(Builder builder) {
            this.isCritical = builder.isCritical;
            this.name = builder.name;
            this.symbols = builder.symbols;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertList create() {
            return builder().build();
        }

        /**
         * @return isCritical
         */
        public Long getIsCritical() {
            return this.isCritical;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return symbols
         */
        public Long getSymbols() {
            return this.symbols;
        }

        public static final class Builder {
            private Long isCritical; 
            private String name; 
            private Long symbols; 

            /**
             * IsCritical.
             */
            public Builder isCritical(Long isCritical) {
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
             * Symbols.
             */
            public Builder symbols(Long symbols) {
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
        private String alarmFlag;

        @NameInMap("AlertList")
        private java.util.List < AlertList> alertList;

        @NameInMap("AlertNotifierId")
        private String alertNotifierId;

        @NameInMap("AlertPolicyId")
        private String alertPolicyId;

        @NameInMap("MonitorSamples")
        private Long monitorSamples;

        @NameInMap("StartExecutionTime")
        private Long startExecutionTime;

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
        public String getAlarmFlag() {
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
        public Long getMonitorSamples() {
            return this.monitorSamples;
        }

        /**
         * @return startExecutionTime
         */
        public Long getStartExecutionTime() {
            return this.startExecutionTime;
        }

        public static final class Builder {
            private String alarmFlag; 
            private java.util.List < AlertList> alertList; 
            private String alertNotifierId; 
            private String alertPolicyId; 
            private Long monitorSamples; 
            private Long startExecutionTime; 

            /**
             * AlarmFlag.
             */
            public Builder alarmFlag(String alarmFlag) {
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
            public Builder monitorSamples(Long monitorSamples) {
                this.monitorSamples = monitorSamples;
                return this;
            }

            /**
             * StartExecutionTime.
             */
            public Builder startExecutionTime(Long startExecutionTime) {
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
        private Double connectionTimeout;

        @NameInMap("DownloadCustomHeaderContent")
        private String downloadCustomHeaderContent;

        @NameInMap("DownloadCustomHost")
        private Long downloadCustomHost;

        @NameInMap("DownloadCustomHostIp")
        private String downloadCustomHostIp;

        @NameInMap("DownloadIgnoreCertificateError")
        private String downloadIgnoreCertificateError;

        @NameInMap("DownloadKernel")
        private Long downloadKernel;

        @NameInMap("DownloadRedirection")
        private Long downloadRedirection;

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
            this.downloadIgnoreCertificateError = builder.downloadIgnoreCertificateError;
            this.downloadKernel = builder.downloadKernel;
            this.downloadRedirection = builder.downloadRedirection;
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
        public Double getConnectionTimeout() {
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
         * @return downloadIgnoreCertificateError
         */
        public String getDownloadIgnoreCertificateError() {
            return this.downloadIgnoreCertificateError;
        }

        /**
         * @return downloadKernel
         */
        public Long getDownloadKernel() {
            return this.downloadKernel;
        }

        /**
         * @return downloadRedirection
         */
        public Long getDownloadRedirection() {
            return this.downloadRedirection;
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
            private Double connectionTimeout; 
            private String downloadCustomHeaderContent; 
            private Long downloadCustomHost; 
            private String downloadCustomHostIp; 
            private String downloadIgnoreCertificateError; 
            private Long downloadKernel; 
            private Long downloadRedirection; 
            private Long downloadTransmissionSize; 
            private Long monitorTimeout; 
            private String quickProtocol; 
            private String validateKeywords; 
            private Long verifyWay; 
            private String whiteList; 

            /**
             * ConnectionTimeout.
             */
            public Builder connectionTimeout(Double connectionTimeout) {
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
             * DownloadIgnoreCertificateError.
             */
            public Builder downloadIgnoreCertificateError(String downloadIgnoreCertificateError) {
                this.downloadIgnoreCertificateError = downloadIgnoreCertificateError;
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
             * DownloadRedirection.
             */
            public Builder downloadRedirection(Long downloadRedirection) {
                this.downloadRedirection = downloadRedirection;
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

        @NameInMap("EndHour")
        private Long endHour;

        @NameInMap("EndMinute")
        private Long endMinute;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartHour")
        private Long startHour;

        @NameInMap("StartMinute")
        private Long startMinute;

        @NameInMap("StartTime")
        private String startTime;

        private ExtendInterval(Builder builder) {
            this.days = builder.days;
            this.endHour = builder.endHour;
            this.endMinute = builder.endMinute;
            this.endTime = builder.endTime;
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
         * @return endHour
         */
        public Long getEndHour() {
            return this.endHour;
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
            private Long endHour; 
            private Long endMinute; 
            private String endTime; 
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
             * EndHour.
             */
            public Builder endHour(Long endHour) {
                this.endHour = endHour;
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
        @Validation(required = true)
        private Long cityCode;

        @NameInMap("MonitorType")
        @Validation(required = true)
        private Long monitorType;

        @NameInMap("NetServiceId")
        @Validation(required = true)
        private Long netServiceId;

        private MonitorList(Builder builder) {
            this.cityCode = builder.cityCode;
            this.monitorType = builder.monitorType;
            this.netServiceId = builder.netServiceId;
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

        public static final class Builder {
            private Long cityCode; 
            private Long monitorType; 
            private Long netServiceId; 

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

            public MonitorList build() {
                return new MonitorList(this);
            } 

        } 

    }
    public static class Navigation extends TeaModel {
        @NameInMap("DNSHijackWhiteList")
        private String DNSHijackWhiteList;

        @NameInMap("ElementBlacklist")
        private String elementBlacklist;

        @NameInMap("ExecuteActiveX")
        private Long executeActiveX;

        @NameInMap("ExecuteApplication")
        private Long executeApplication;

        @NameInMap("ExecuteScript")
        private Long executeScript;

        @NameInMap("FilterInvalidIP")
        private Long filterInvalidIP;

        @NameInMap("FlowHijackJumpTimes")
        private Long flowHijackJumpTimes;

        @NameInMap("FlowHijackLogo")
        private String flowHijackLogo;

        @NameInMap("MonitorTimeout")
        private String monitorTimeout;

        @NameInMap("NavAutomaticScrolling")
        private String navAutomaticScrolling;

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
        private String navDisableCompression;

        @NameInMap("NavIgnoreCertificateError")
        private Long navIgnoreCertificateError;

        @NameInMap("NavRedirection")
        private Long navRedirection;

        @NameInMap("NavReturnElement")
        private Long navReturnElement;

        @NameInMap("PageTamper")
        private String pageTamper;

        @NameInMap("ProcessName")
        private String processName;

        @NameInMap("QUICDomain")
        private String QUICDomain;

        @NameInMap("QUICVersion")
        private Long QUICVersion;

        @NameInMap("RequestHeader")
        private Long requestHeader;

        @NameInMap("ResponseHeader")
        private Long responseHeader;

        @NameInMap("SlowElementThreshold")
        private Double slowElementThreshold;

        @NameInMap("VerifyStringBlacklist")
        private String verifyStringBlacklist;

        @NameInMap("VerifyStringWhiteList")
        private String verifyStringWhiteList;

        @NameInMap("WaitCompletionTime")
        private Double waitCompletionTime;

        private Navigation(Builder builder) {
            this.DNSHijackWhiteList = builder.DNSHijackWhiteList;
            this.elementBlacklist = builder.elementBlacklist;
            this.executeActiveX = builder.executeActiveX;
            this.executeApplication = builder.executeApplication;
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
            this.navRedirection = builder.navRedirection;
            this.navReturnElement = builder.navReturnElement;
            this.pageTamper = builder.pageTamper;
            this.processName = builder.processName;
            this.QUICDomain = builder.QUICDomain;
            this.QUICVersion = builder.QUICVersion;
            this.requestHeader = builder.requestHeader;
            this.responseHeader = builder.responseHeader;
            this.slowElementThreshold = builder.slowElementThreshold;
            this.verifyStringBlacklist = builder.verifyStringBlacklist;
            this.verifyStringWhiteList = builder.verifyStringWhiteList;
            this.waitCompletionTime = builder.waitCompletionTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Navigation create() {
            return builder().build();
        }

        /**
         * @return DNSHijackWhiteList
         */
        public String getDNSHijackWhiteList() {
            return this.DNSHijackWhiteList;
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
         * @return executeApplication
         */
        public Long getExecuteApplication() {
            return this.executeApplication;
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
        public String getMonitorTimeout() {
            return this.monitorTimeout;
        }

        /**
         * @return navAutomaticScrolling
         */
        public String getNavAutomaticScrolling() {
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
        public String getNavDisableCompression() {
            return this.navDisableCompression;
        }

        /**
         * @return navIgnoreCertificateError
         */
        public Long getNavIgnoreCertificateError() {
            return this.navIgnoreCertificateError;
        }

        /**
         * @return navRedirection
         */
        public Long getNavRedirection() {
            return this.navRedirection;
        }

        /**
         * @return navReturnElement
         */
        public Long getNavReturnElement() {
            return this.navReturnElement;
        }

        /**
         * @return pageTamper
         */
        public String getPageTamper() {
            return this.pageTamper;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return QUICDomain
         */
        public String getQUICDomain() {
            return this.QUICDomain;
        }

        /**
         * @return QUICVersion
         */
        public Long getQUICVersion() {
            return this.QUICVersion;
        }

        /**
         * @return requestHeader
         */
        public Long getRequestHeader() {
            return this.requestHeader;
        }

        /**
         * @return responseHeader
         */
        public Long getResponseHeader() {
            return this.responseHeader;
        }

        /**
         * @return slowElementThreshold
         */
        public Double getSlowElementThreshold() {
            return this.slowElementThreshold;
        }

        /**
         * @return verifyStringBlacklist
         */
        public String getVerifyStringBlacklist() {
            return this.verifyStringBlacklist;
        }

        /**
         * @return verifyStringWhiteList
         */
        public String getVerifyStringWhiteList() {
            return this.verifyStringWhiteList;
        }

        /**
         * @return waitCompletionTime
         */
        public Double getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

        public static final class Builder {
            private String DNSHijackWhiteList; 
            private String elementBlacklist; 
            private Long executeActiveX; 
            private Long executeApplication; 
            private Long executeScript; 
            private Long filterInvalidIP; 
            private Long flowHijackJumpTimes; 
            private String flowHijackLogo; 
            private String monitorTimeout; 
            private String navAutomaticScrolling; 
            private String navCustomHeader; 
            private String navCustomHeaderContent; 
            private Long navCustomHost; 
            private String navCustomHostIp; 
            private Long navDisableCache; 
            private String navDisableCompression; 
            private Long navIgnoreCertificateError; 
            private Long navRedirection; 
            private Long navReturnElement; 
            private String pageTamper; 
            private String processName; 
            private String QUICDomain; 
            private Long QUICVersion; 
            private Long requestHeader; 
            private Long responseHeader; 
            private Double slowElementThreshold; 
            private String verifyStringBlacklist; 
            private String verifyStringWhiteList; 
            private Double waitCompletionTime; 

            /**
             * DNSHijackWhiteList.
             */
            public Builder DNSHijackWhiteList(String DNSHijackWhiteList) {
                this.DNSHijackWhiteList = DNSHijackWhiteList;
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
             * ExecuteApplication.
             */
            public Builder executeApplication(Long executeApplication) {
                this.executeApplication = executeApplication;
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
            public Builder monitorTimeout(String monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * NavAutomaticScrolling.
             */
            public Builder navAutomaticScrolling(String navAutomaticScrolling) {
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
            public Builder navDisableCompression(String navDisableCompression) {
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
             * NavRedirection.
             */
            public Builder navRedirection(Long navRedirection) {
                this.navRedirection = navRedirection;
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
             * PageTamper.
             */
            public Builder pageTamper(String pageTamper) {
                this.pageTamper = pageTamper;
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
             * QUICDomain.
             */
            public Builder QUICDomain(String QUICDomain) {
                this.QUICDomain = QUICDomain;
                return this;
            }

            /**
             * QUICVersion.
             */
            public Builder QUICVersion(Long QUICVersion) {
                this.QUICVersion = QUICVersion;
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
             * ResponseHeader.
             */
            public Builder responseHeader(Long responseHeader) {
                this.responseHeader = responseHeader;
                return this;
            }

            /**
             * SlowElementThreshold.
             */
            public Builder slowElementThreshold(Double slowElementThreshold) {
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
             * VerifyStringWhiteList.
             */
            public Builder verifyStringWhiteList(String verifyStringWhiteList) {
                this.verifyStringWhiteList = verifyStringWhiteList;
                return this;
            }

            /**
             * WaitCompletionTime.
             */
            public Builder waitCompletionTime(Double waitCompletionTime) {
                this.waitCompletionTime = waitCompletionTime;
                return this;
            }

            public Navigation build() {
                return new Navigation(this);
            } 

        } 

    }
    public static class Net extends TeaModel {
        @NameInMap("NetDNSNs")
        private String netDNSNs;

        @NameInMap("NetDNSQueryMethod")
        private Long netDNSQueryMethod;

        @NameInMap("NetDNSServer")
        private Long netDNSServer;

        @NameInMap("NetDNSSwitch")
        private Long netDNSSwitch;

        @NameInMap("NetDNSTimeout")
        private Long netDNSTimeout;

        @NameInMap("NetDigSwitch")
        private Long netDigSwitch;

        @NameInMap("NetICMPActive")
        private Long netICMPActive;

        @NameInMap("NetICMPDataCut")
        private Long netICMPDataCut;

        @NameInMap("NetICMPInterval")
        private Long netICMPInterval;

        @NameInMap("NetICMPNum")
        private Long netICMPNum;

        @NameInMap("NetICMPSize")
        private Long netICMPSize;

        @NameInMap("NetICMPSwitch")
        private Long netICMPSwitch;

        @NameInMap("NetICMPTimeout")
        private Long netICMPTimeout;

        @NameInMap("NetTraceRouteNum")
        private Long netTraceRouteNum;

        @NameInMap("NetTraceRouteSwitch")
        private Long netTraceRouteSwitch;

        @NameInMap("NetTraceRouteTimeout")
        private Long netTraceRouteTimeout;

        @NameInMap("WhiteList")
        private String whiteList;

        private Net(Builder builder) {
            this.netDNSNs = builder.netDNSNs;
            this.netDNSQueryMethod = builder.netDNSQueryMethod;
            this.netDNSServer = builder.netDNSServer;
            this.netDNSSwitch = builder.netDNSSwitch;
            this.netDNSTimeout = builder.netDNSTimeout;
            this.netDigSwitch = builder.netDigSwitch;
            this.netICMPActive = builder.netICMPActive;
            this.netICMPDataCut = builder.netICMPDataCut;
            this.netICMPInterval = builder.netICMPInterval;
            this.netICMPNum = builder.netICMPNum;
            this.netICMPSize = builder.netICMPSize;
            this.netICMPSwitch = builder.netICMPSwitch;
            this.netICMPTimeout = builder.netICMPTimeout;
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
         * @return netDNSNs
         */
        public String getNetDNSNs() {
            return this.netDNSNs;
        }

        /**
         * @return netDNSQueryMethod
         */
        public Long getNetDNSQueryMethod() {
            return this.netDNSQueryMethod;
        }

        /**
         * @return netDNSServer
         */
        public Long getNetDNSServer() {
            return this.netDNSServer;
        }

        /**
         * @return netDNSSwitch
         */
        public Long getNetDNSSwitch() {
            return this.netDNSSwitch;
        }

        /**
         * @return netDNSTimeout
         */
        public Long getNetDNSTimeout() {
            return this.netDNSTimeout;
        }

        /**
         * @return netDigSwitch
         */
        public Long getNetDigSwitch() {
            return this.netDigSwitch;
        }

        /**
         * @return netICMPActive
         */
        public Long getNetICMPActive() {
            return this.netICMPActive;
        }

        /**
         * @return netICMPDataCut
         */
        public Long getNetICMPDataCut() {
            return this.netICMPDataCut;
        }

        /**
         * @return netICMPInterval
         */
        public Long getNetICMPInterval() {
            return this.netICMPInterval;
        }

        /**
         * @return netICMPNum
         */
        public Long getNetICMPNum() {
            return this.netICMPNum;
        }

        /**
         * @return netICMPSize
         */
        public Long getNetICMPSize() {
            return this.netICMPSize;
        }

        /**
         * @return netICMPSwitch
         */
        public Long getNetICMPSwitch() {
            return this.netICMPSwitch;
        }

        /**
         * @return netICMPTimeout
         */
        public Long getNetICMPTimeout() {
            return this.netICMPTimeout;
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
            private String netDNSNs; 
            private Long netDNSQueryMethod; 
            private Long netDNSServer; 
            private Long netDNSSwitch; 
            private Long netDNSTimeout; 
            private Long netDigSwitch; 
            private Long netICMPActive; 
            private Long netICMPDataCut; 
            private Long netICMPInterval; 
            private Long netICMPNum; 
            private Long netICMPSize; 
            private Long netICMPSwitch; 
            private Long netICMPTimeout; 
            private Long netTraceRouteNum; 
            private Long netTraceRouteSwitch; 
            private Long netTraceRouteTimeout; 
            private String whiteList; 

            /**
             * NetDNSNs.
             */
            public Builder netDNSNs(String netDNSNs) {
                this.netDNSNs = netDNSNs;
                return this;
            }

            /**
             * NetDNSQueryMethod.
             */
            public Builder netDNSQueryMethod(Long netDNSQueryMethod) {
                this.netDNSQueryMethod = netDNSQueryMethod;
                return this;
            }

            /**
             * NetDNSServer.
             */
            public Builder netDNSServer(Long netDNSServer) {
                this.netDNSServer = netDNSServer;
                return this;
            }

            /**
             * NetDNSSwitch.
             */
            public Builder netDNSSwitch(Long netDNSSwitch) {
                this.netDNSSwitch = netDNSSwitch;
                return this;
            }

            /**
             * NetDNSTimeout.
             */
            public Builder netDNSTimeout(Long netDNSTimeout) {
                this.netDNSTimeout = netDNSTimeout;
                return this;
            }

            /**
             * NetDigSwitch.
             */
            public Builder netDigSwitch(Long netDigSwitch) {
                this.netDigSwitch = netDigSwitch;
                return this;
            }

            /**
             * NetICMPActive.
             */
            public Builder netICMPActive(Long netICMPActive) {
                this.netICMPActive = netICMPActive;
                return this;
            }

            /**
             * NetICMPDataCut.
             */
            public Builder netICMPDataCut(Long netICMPDataCut) {
                this.netICMPDataCut = netICMPDataCut;
                return this;
            }

            /**
             * NetICMPInterval.
             */
            public Builder netICMPInterval(Long netICMPInterval) {
                this.netICMPInterval = netICMPInterval;
                return this;
            }

            /**
             * NetICMPNum.
             */
            public Builder netICMPNum(Long netICMPNum) {
                this.netICMPNum = netICMPNum;
                return this;
            }

            /**
             * NetICMPSize.
             */
            public Builder netICMPSize(Long netICMPSize) {
                this.netICMPSize = netICMPSize;
                return this;
            }

            /**
             * NetICMPSwitch.
             */
            public Builder netICMPSwitch(Long netICMPSwitch) {
                this.netICMPSwitch = netICMPSwitch;
                return this;
            }

            /**
             * NetICMPTimeout.
             */
            public Builder netICMPTimeout(Long netICMPTimeout) {
                this.netICMPTimeout = netICMPTimeout;
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
    public static class FormData extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private FormData(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FormData create() {
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

            public FormData build() {
                return new FormData(this);
            } 

        } 

    }
    public static class UrlEncoding extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private UrlEncoding(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlEncoding create() {
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

            public UrlEncoding build() {
                return new UrlEncoding(this);
            } 

        } 

    }
    public static class RequestContentBody extends TeaModel {
        @NameInMap("FormData")
        private java.util.List < FormData> formData;

        @NameInMap("Language")
        private String language;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Raw")
        private String raw;

        @NameInMap("UrlEncoding")
        private java.util.List < UrlEncoding> urlEncoding;

        private RequestContentBody(Builder builder) {
            this.formData = builder.formData;
            this.language = builder.language;
            this.mode = builder.mode;
            this.raw = builder.raw;
            this.urlEncoding = builder.urlEncoding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestContentBody create() {
            return builder().build();
        }

        /**
         * @return formData
         */
        public java.util.List < FormData> getFormData() {
            return this.formData;
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
         * @return urlEncoding
         */
        public java.util.List < UrlEncoding> getUrlEncoding() {
            return this.urlEncoding;
        }

        public static final class Builder {
            private java.util.List < FormData> formData; 
            private String language; 
            private String mode; 
            private String raw; 
            private java.util.List < UrlEncoding> urlEncoding; 

            /**
             * FormData.
             */
            public Builder formData(java.util.List < FormData> formData) {
                this.formData = formData;
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
             * UrlEncoding.
             */
            public Builder urlEncoding(java.util.List < UrlEncoding> urlEncoding) {
                this.urlEncoding = urlEncoding;
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

        @NameInMap("ProtocolConnectionTime")
        private Long protocolConnectionTime;

        @NameInMap("ProtocolMonitorTimeout")
        private String protocolMonitorTimeout;

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
            this.protocolConnectionTime = builder.protocolConnectionTime;
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
         * @return protocolConnectionTime
         */
        public Long getProtocolConnectionTime() {
            return this.protocolConnectionTime;
        }

        /**
         * @return protocolMonitorTimeout
         */
        public String getProtocolMonitorTimeout() {
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
            private Long protocolConnectionTime; 
            private String protocolMonitorTimeout; 
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
             * ProtocolConnectionTime.
             */
            public Builder protocolConnectionTime(Long protocolConnectionTime) {
                this.protocolConnectionTime = protocolConnectionTime;
                return this;
            }

            /**
             * ProtocolMonitorTimeout.
             */
            public Builder protocolMonitorTimeout(String protocolMonitorTimeout) {
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
}
