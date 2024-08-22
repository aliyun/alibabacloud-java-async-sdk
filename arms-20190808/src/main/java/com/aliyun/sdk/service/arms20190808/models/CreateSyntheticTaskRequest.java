// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSyntheticTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSyntheticTaskRequest</p>
 */
public class CreateSyntheticTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonParam")
    private CommonParam commonParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Download")
    private Download download;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendInterval")
    private ExtendInterval extendInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intervalTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intervalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < MonitorList> monitorList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Navigation")
    private Navigation navigation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Net")
    private Net net;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private Protocol protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateTask")
    private Boolean updateTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The common parameters.
         */
        public Builder commonParam(CommonParam commonParam) {
            String commonParamShrink = shrink(commonParam, "CommonParam", "json");
            this.putQueryParameter("CommonParam", commonParamShrink);
            this.commonParam = commonParam;
            return this;
        }

        /**
         * The file download task.
         */
        public Builder download(Download download) {
            String downloadShrink = shrink(download, "Download", "json");
            this.putQueryParameter("Download", downloadShrink);
            this.download = download;
            return this;
        }

        /**
         * The frequency.
         */
        public Builder extendInterval(ExtendInterval extendInterval) {
            String extendIntervalShrink = shrink(extendInterval, "ExtendInterval", "json");
            this.putQueryParameter("ExtendInterval", extendIntervalShrink);
            this.extendInterval = extendInterval;
            return this;
        }

        /**
         * The interval at which synthetic monitoring is performed. Unit: minutes. Valid values:
         * <p>
         * 
         * *   1
         * *   5
         * *   10
         * *   15
         * *   20
         * *   30
         * *   60
         * *   120
         * *   180
         * *   240
         * *   360
         * *   480
         * *   720
         * *   1440
         */
        public Builder intervalTime(String intervalTime) {
            this.putQueryParameter("IntervalTime", intervalTime);
            this.intervalTime = intervalTime;
            return this;
        }

        /**
         * The interval type.
         * <p>
         * 
         * *   0: daily
         * *   1: custom frequency
         */
        public Builder intervalType(String intervalType) {
            this.putQueryParameter("IntervalType", intervalType);
            this.intervalType = intervalType;
            return this;
        }

        /**
         * The IP address type:
         * <p>
         * 
         * *   0: an automatic IP address
         * *   1: IPv4
         * *   2: IPv6
         */
        public Builder ipType(Long ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * The list of monitoring points.
         */
        public Builder monitorList(java.util.List < MonitorList> monitorList) {
            String monitorListShrink = shrink(monitorList, "MonitorList", "json");
            this.putQueryParameter("MonitorList", monitorListShrink);
            this.monitorList = monitorList;
            return this;
        }

        /**
         * The monitoring items that are associated with the browse tasks.
         */
        public Builder navigation(Navigation navigation) {
            String navigationShrink = shrink(navigation, "Navigation", "json");
            this.putQueryParameter("Navigation", navigationShrink);
            this.navigation = navigation;
            return this;
        }

        /**
         * The network synthetic monitoring task.
         */
        public Builder net(Net net) {
            String netShrink = shrink(net, "Net", "json");
            this.putQueryParameter("Net", netShrink);
            this.net = net;
            return this;
        }

        /**
         * The API performance synthetic monitoring task.
         */
        public Builder protocol(Protocol protocol) {
            String protocolShrink = shrink(protocol, "Protocol", "json");
            this.putQueryParameter("Protocol", protocolShrink);
            this.protocol = protocol;
            return this;
        }

        /**
         * The ID of the region in which the application is located.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the task. To update a synthetic monitoring task, enter the task name and set the **UpdateTask** parameter to **true**.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The type of the monitoring task. Valid values:
         * <p>
         * 
         * 1.  3: web page performance - IE
         * 2.  34: web Page Performance - Chrome
         * 3.  0: network quality
         * 4.  40: file download
         * 5.  7:API performance
         */
        public Builder taskType(Long taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * Specifies whether to update existing synthetic monitoring tasks.
         * <p>
         * 
         * *   true: updates existing synthetic monitoring tasks.
         * *   false: creates new synthetic monitoring tasks.
         */
        public Builder updateTask(Boolean updateTask) {
            this.putQueryParameter("UpdateTask", updateTask);
            this.updateTask = updateTask;
            return this;
        }

        /**
         * The URL for synthetic monitoring.
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
        @com.aliyun.core.annotation.NameInMap("IsCritical")
        private Long isCritical;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Symbols")
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
             * Specifies whether the condition must be met.
             */
            public Builder isCritical(Long isCritical) {
                this.isCritical = isCritical;
                return this;
            }

            /**
             * The name of the alert rule.
             * <p>
             * 
             * For network synthetic monitoring, use the following names:
             * 
             * *   Latency: PING_SET
             * *   Packet loss rate: PING_LOST_RATE
             * *   Hijacking: HIJACKPER
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies how the condition is evaluated. Valid values:
             * <p>
             * 
             * *   1: greater than
             * *   0: less than
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
        @com.aliyun.core.annotation.NameInMap("AlarmFlag")
        private String alarmFlag;

        @com.aliyun.core.annotation.NameInMap("AlertList")
        private java.util.List < AlertList> alertList;

        @com.aliyun.core.annotation.NameInMap("AlertNotifierId")
        private String alertNotifierId;

        @com.aliyun.core.annotation.NameInMap("AlertPolicyId")
        private String alertPolicyId;

        @com.aliyun.core.annotation.NameInMap("MonitorSamples")
        private Long monitorSamples;

        @com.aliyun.core.annotation.NameInMap("StartExecutionTime")
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
             * Specifies whether to create an alert rule.
             * <p>
             * 
             * *   1: creates an alert.
             * *   0: does not create an alert.
             */
            public Builder alarmFlag(String alarmFlag) {
                this.alarmFlag = alarmFlag;
                return this;
            }

            /**
             * The alert parameters.
             */
            public Builder alertList(java.util.List < AlertList> alertList) {
                this.alertList = alertList;
                return this;
            }

            /**
             * The ID of the alert recipient. Separate multiple recipients with commas (,).
             */
            public Builder alertNotifierId(String alertNotifierId) {
                this.alertNotifierId = alertNotifierId;
                return this;
            }

            /**
             * The ID of the notification policy.
             */
            public Builder alertPolicyId(String alertPolicyId) {
                this.alertPolicyId = alertPolicyId;
                return this;
            }

            /**
             * Specifies whether to evenly distribute monitoring samples. Valid values:
             * <p>
             * 
             * *   0: no
             * *   1: yes
             */
            public Builder monitorSamples(Long monitorSamples) {
                this.monitorSamples = monitorSamples;
                return this;
            }

            /**
             * The time when execution starts.
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
        @com.aliyun.core.annotation.NameInMap("ConnectionTimeout")
        private Double connectionTimeout;

        @com.aliyun.core.annotation.NameInMap("DownloadCustomHeaderContent")
        private String downloadCustomHeaderContent;

        @com.aliyun.core.annotation.NameInMap("DownloadCustomHost")
        private Long downloadCustomHost;

        @com.aliyun.core.annotation.NameInMap("DownloadCustomHostIp")
        private String downloadCustomHostIp;

        @com.aliyun.core.annotation.NameInMap("DownloadIgnoreCertificateError")
        private String downloadIgnoreCertificateError;

        @com.aliyun.core.annotation.NameInMap("DownloadKernel")
        private Long downloadKernel;

        @com.aliyun.core.annotation.NameInMap("DownloadRedirection")
        private Long downloadRedirection;

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
             * The connection timeout period.
             */
            public Builder connectionTimeout(Double connectionTimeout) {
                this.connectionTimeout = connectionTimeout;
                return this;
            }

            /**
             * The items to be ignored in a certificate error. Pass the values of the check boxes that are separated with vertical bars (|).
             */
            public Builder downloadCustomHeaderContent(String downloadCustomHeaderContent) {
                this.downloadCustomHeaderContent = downloadCustomHeaderContent;
                return this;
            }

            /**
             * The custom host mode.
             * <p>
             * 
             * *   1: round robin
             * *   0: random
             */
            public Builder downloadCustomHost(Long downloadCustomHost) {
                this.downloadCustomHost = downloadCustomHost;
                return this;
            }

            /**
             * The custom host IP address. You can enter multiple IP addresses. Separate the IP addresses with commas (,).
             */
            public Builder downloadCustomHostIp(String downloadCustomHostIp) {
                this.downloadCustomHostIp = downloadCustomHostIp;
                return this;
            }

            /**
             * The items to be ignored in a certificate error. Pass the values of the check boxes that are separated with vertical bars (|).
             */
            public Builder downloadIgnoreCertificateError(String downloadIgnoreCertificateError) {
                this.downloadIgnoreCertificateError = downloadIgnoreCertificateError;
                return this;
            }

            /**
             * The kernel type.
             * <p>
             * 
             * *   1: curl
             * *   0: WinInet
             */
            public Builder downloadKernel(Long downloadKernel) {
                this.downloadKernel = downloadKernel;
                return this;
            }

            /**
             * Specifies whether to support redirection.
             */
            public Builder downloadRedirection(Long downloadRedirection) {
                this.downloadRedirection = downloadRedirection;
                return this;
            }

            /**
             * The size of the download file. Unit: KB.
             */
            public Builder downloadTransmissionSize(Long downloadTransmissionSize) {
                this.downloadTransmissionSize = downloadTransmissionSize;
                return this;
            }

            /**
             * The monitoring duration.
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * The QUIC protocol type.
             * <p>
             * 
             * *   1: http1
             * *   2: http2
             * *   3: http3
             */
            public Builder quickProtocol(String quickProtocol) {
                this.quickProtocol = quickProtocol;
                return this;
            }

            /**
             * The keyword that is used in verification.
             */
            public Builder validateKeywords(String validateKeywords) {
                this.validateKeywords = validateKeywords;
                return this;
            }

            /**
             * The verification method.
             * <p>
             * 
             * *   0: no verification
             * *   1: string verification
             * *   2: MD5 verification
             */
            public Builder verifyWay(Long verifyWay) {
                this.verifyWay = verifyWay;
                return this;
            }

            /**
             * The whitelist for DNS hijacking.
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
        @com.aliyun.core.annotation.NameInMap("Days")
        private java.util.List < Long > days;

        @com.aliyun.core.annotation.NameInMap("EndHour")
        private Long endHour;

        @com.aliyun.core.annotation.NameInMap("EndMinute")
        private Long endMinute;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartHour")
        private Long startHour;

        @com.aliyun.core.annotation.NameInMap("StartMinute")
        private Long startMinute;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * The day on which synthetic monitoring is performed.
             */
            public Builder days(java.util.List < Long > days) {
                this.days = days;
                return this;
            }

            /**
             * The hour at which synthetic monitoring ends.
             */
            public Builder endHour(Long endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * The minute at which synthetic monitoring ends.
             */
            public Builder endMinute(Long endMinute) {
                this.endMinute = endMinute;
                return this;
            }

            /**
             * The time when synthetic monitoring ends. The format is `yyyy-MM-dd HH`.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The hour at which synthetic monitoring starts.
             */
            public Builder startHour(Long startHour) {
                this.startHour = startHour;
                return this;
            }

            /**
             * The minute at which synthetic monitoring starts.
             */
            public Builder startMinute(Long startMinute) {
                this.startMinute = startMinute;
                return this;
            }

            /**
             * The time when synthetic monitoring starts. The format is `yyyy-MM-dd HH`.
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
        @com.aliyun.core.annotation.NameInMap("CityCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long cityCode;

        @com.aliyun.core.annotation.NameInMap("MonitorType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long monitorType;

        @com.aliyun.core.annotation.NameInMap("NetServiceId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * The ID of the city to which the monitoring point belongs.
             */
            public Builder cityCode(Long cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * The carrier type:
             * <p>
             * 
             * *   IDC
             * *   LastMilie
             */
            public Builder monitorType(Long monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * The ID of the carrier.
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
        @com.aliyun.core.annotation.NameInMap("DNSHijackWhiteList")
        private String DNSHijackWhiteList;

        @com.aliyun.core.annotation.NameInMap("ElementBlacklist")
        private String elementBlacklist;

        @com.aliyun.core.annotation.NameInMap("ExecuteActiveX")
        private Long executeActiveX;

        @com.aliyun.core.annotation.NameInMap("ExecuteApplication")
        private Long executeApplication;

        @com.aliyun.core.annotation.NameInMap("ExecuteScript")
        private Long executeScript;

        @com.aliyun.core.annotation.NameInMap("FilterInvalidIP")
        private Long filterInvalidIP;

        @com.aliyun.core.annotation.NameInMap("FlowHijackJumpTimes")
        private Long flowHijackJumpTimes;

        @com.aliyun.core.annotation.NameInMap("FlowHijackLogo")
        private String flowHijackLogo;

        @com.aliyun.core.annotation.NameInMap("MonitorTimeout")
        private String monitorTimeout;

        @com.aliyun.core.annotation.NameInMap("NavAutomaticScrolling")
        private String navAutomaticScrolling;

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
        private String navDisableCompression;

        @com.aliyun.core.annotation.NameInMap("NavIgnoreCertificateError")
        private Long navIgnoreCertificateError;

        @com.aliyun.core.annotation.NameInMap("NavRedirection")
        private Long navRedirection;

        @com.aliyun.core.annotation.NameInMap("NavReturnElement")
        private Long navReturnElement;

        @com.aliyun.core.annotation.NameInMap("PageTamper")
        private String pageTamper;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("QUICDomain")
        private String QUICDomain;

        @com.aliyun.core.annotation.NameInMap("QUICVersion")
        private Long QUICVersion;

        @com.aliyun.core.annotation.NameInMap("RequestHeader")
        private Long requestHeader;

        @com.aliyun.core.annotation.NameInMap("ResponseHeader")
        private Long responseHeader;

        @com.aliyun.core.annotation.NameInMap("SlowElementThreshold")
        private Double slowElementThreshold;

        @com.aliyun.core.annotation.NameInMap("VerifyStringBlacklist")
        private String verifyStringBlacklist;

        @com.aliyun.core.annotation.NameInMap("VerifyStringWhiteList")
        private String verifyStringWhiteList;

        @com.aliyun.core.annotation.NameInMap("WaitCompletionTime")
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
             * The whitelist for DNS hijacking.
             */
            public Builder DNSHijackWhiteList(String DNSHijackWhiteList) {
                this.DNSHijackWhiteList = DNSHijackWhiteList;
                return this;
            }

            /**
             * The element blacklist.
             */
            public Builder elementBlacklist(String elementBlacklist) {
                this.elementBlacklist = elementBlacklist;
                return this;
            }

            /**
             * Specifies whether to execute ActiveX.
             * <p>
             * 
             * *   3: yes
             * *   0: no
             * 
             * >  This parameter is supported only by IE Full Elements.
             */
            public Builder executeActiveX(Long executeActiveX) {
                this.executeActiveX = executeActiveX;
                return this;
            }

            /**
             * Specifies whether to run applets.
             * <p>
             * 
             * *   1: yes
             * *   0: no
             * 
             * >  This parameter is supported only by IE Full Elements.
             */
            public Builder executeApplication(Long executeApplication) {
                this.executeApplication = executeApplication;
                return this;
            }

            /**
             * Specifies whether to execute scripts.
             * <p>
             * 
             * *   1: yes
             * *   0: no
             * 
             * >  This parameter is supported only by IE Full Elements.
             */
            public Builder executeScript(Long executeScript) {
                this.executeScript = executeScript;
                return this;
            }

            /**
             * Specifies whether to filter invalid IP addresses.
             * <p>
             * 
             * *   1: no
             * *   0: yes
             */
            public Builder filterInvalidIP(Long filterInvalidIP) {
                this.filterInvalidIP = filterInvalidIP;
                return this;
            }

            /**
             * The element that is used in DNS hijacking.
             */
            public Builder flowHijackJumpTimes(Long flowHijackJumpTimes) {
                this.flowHijackJumpTimes = flowHijackJumpTimes;
                return this;
            }

            /**
             * The tag that is used in DNS hijacking.
             */
            public Builder flowHijackLogo(String flowHijackLogo) {
                this.flowHijackLogo = flowHijackLogo;
                return this;
            }

            /**
             * The timeout period of monitoring. Unit: seconds.
             */
            public Builder monitorTimeout(String monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * Specifies whether to automatically scroll up and down the screen to load a page.
             * <p>
             * 
             * *   1: yes
             * *   0: no
             */
            public Builder navAutomaticScrolling(String navAutomaticScrolling) {
                this.navAutomaticScrolling = navAutomaticScrolling;
                return this;
            }

            /**
             * The method that is used to customize the header. Valid values:
             * <p>
             * 
             * *   0: disables the customer header.
             * *   1: modifies the first package.
             * *   2: modifies all packages.
             */
            public Builder navCustomHeader(String navCustomHeader) {
                this.navCustomHeader = navCustomHeader;
                return this;
            }

            /**
             * The format of the custom header. You can specify multiple fields. Separate the fields with vertical bars (|).
             */
            public Builder navCustomHeaderContent(String navCustomHeaderContent) {
                this.navCustomHeaderContent = navCustomHeaderContent;
                return this;
            }

            /**
             * The custom host mode.
             * <p>
             * 
             * *   1: round robin
             * *   0: random
             */
            public Builder navCustomHost(Long navCustomHost) {
                this.navCustomHost = navCustomHost;
                return this;
            }

            /**
             * The custom host IP address. You can enter multiple IP addresses. Separate the IP addresses with commas (,).
             */
            public Builder navCustomHostIp(String navCustomHostIp) {
                this.navCustomHostIp = navCustomHostIp;
                return this;
            }

            /**
             * Specifies whether to disable caching.
             * <p>
             * 
             * *   1: disable
             * *   0: enable
             */
            public Builder navDisableCache(Long navDisableCache) {
                this.navDisableCache = navDisableCache;
                return this;
            }

            /**
             * Specifies whether to enable the feature of using the Accept-Encoding field to determine whether to accept compressed files.
             * <p>
             * 
             * *   1: disable
             * *   0: enable
             */
            public Builder navDisableCompression(String navDisableCompression) {
                this.navDisableCompression = navDisableCompression;
                return this;
            }

            /**
             * Specifies whether to ignore certificate errors during certificate verification in the SSL handshake and continue browsing.
             * <p>
             * 
             * *   1: ignore
             * *   0: does not ignore
             */
            public Builder navIgnoreCertificateError(Long navIgnoreCertificateError) {
                this.navIgnoreCertificateError = navIgnoreCertificateError;
                return this;
            }

            /**
             * Specifies whether to continue browsing after a redirection occurs.
             * <p>
             * 
             * *   1: yes
             * *   0: no
             */
            public Builder navRedirection(Long navRedirection) {
                this.navRedirection = navRedirection;
                return this;
            }

            /**
             * Specifies whether to return the elements on the page.
             * <p>
             * 
             * *   1: no. Returns the basic document data.
             * *   2: yes. Returns all document data.
             */
            public Builder navReturnElement(Long navReturnElement) {
                this.navReturnElement = navReturnElement;
                return this;
            }

            /**
             * The web page defacement.
             */
            public Builder pageTamper(String pageTamper) {
                this.pageTamper = pageTamper;
                return this;
            }

            /**
             * The process ID.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * The domain name of the QUIC request element.
             * <p>
             * 
             * >  This parameter is supported by all elements of only Chrome
             */
            public Builder QUICDomain(String QUICDomain) {
                this.QUICDomain = QUICDomain;
                return this;
            }

            /**
             * The Quick UDP Internet Connections (QUIC) protocol version. Default value: 0. Valid values:
             * <p>
             * 
             * *
             * *   35
             * *   39
             * *   43
             * *   44
             * 
             * >  This parameter is supported by all elements of only Chrome
             */
            public Builder QUICVersion(Long QUICVersion) {
                this.QUICVersion = QUICVersion;
                return this;
            }

            /**
             * Specifies whether to return the request header.
             * <p>
             * 
             * *   0: does not return the response header.
             * *   1: returns the basic document header.
             * *   2: returns all headers.
             */
            public Builder requestHeader(Long requestHeader) {
                this.requestHeader = requestHeader;
                return this;
            }

            /**
             * The method that is used to return the response header. Valid values:
             * <p>
             * 
             * *   0: does not return the response header.
             * *   1: returns the basic document header.
             * *   2: returns all headers.
             */
            public Builder responseHeader(Long responseHeader) {
                this.responseHeader = responseHeader;
                return this;
            }

            /**
             * The time threshold that is used to define a slow element. Unit: seconds.
             */
            public Builder slowElementThreshold(Double slowElementThreshold) {
                this.slowElementThreshold = slowElementThreshold;
                return this;
            }

            /**
             * The blacklist for string verification.
             */
            public Builder verifyStringBlacklist(String verifyStringBlacklist) {
                this.verifyStringBlacklist = verifyStringBlacklist;
                return this;
            }

            /**
             * The whitelist for string verification.
             */
            public Builder verifyStringWhiteList(String verifyStringWhiteList) {
                this.verifyStringWhiteList = verifyStringWhiteList;
                return this;
            }

            /**
             * The timeout period of waiting for the monitoring to complete.
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
        @com.aliyun.core.annotation.NameInMap("NetDNSNs")
        private String netDNSNs;

        @com.aliyun.core.annotation.NameInMap("NetDNSQueryMethod")
        private Long netDNSQueryMethod;

        @com.aliyun.core.annotation.NameInMap("NetDNSServer")
        private Long netDNSServer;

        @com.aliyun.core.annotation.NameInMap("NetDNSSwitch")
        private Long netDNSSwitch;

        @com.aliyun.core.annotation.NameInMap("NetDNSTimeout")
        private Long netDNSTimeout;

        @com.aliyun.core.annotation.NameInMap("NetDigSwitch")
        private Long netDigSwitch;

        @com.aliyun.core.annotation.NameInMap("NetICMPActive")
        private Long netICMPActive;

        @com.aliyun.core.annotation.NameInMap("NetICMPDataCut")
        private Long netICMPDataCut;

        @com.aliyun.core.annotation.NameInMap("NetICMPInterval")
        private Long netICMPInterval;

        @com.aliyun.core.annotation.NameInMap("NetICMPNum")
        private Long netICMPNum;

        @com.aliyun.core.annotation.NameInMap("NetICMPSize")
        private Long netICMPSize;

        @com.aliyun.core.annotation.NameInMap("NetICMPSwitch")
        private Long netICMPSwitch;

        @com.aliyun.core.annotation.NameInMap("NetICMPTimeout")
        private Long netICMPTimeout;

        @com.aliyun.core.annotation.NameInMap("NetTraceRouteNum")
        private Long netTraceRouteNum;

        @com.aliyun.core.annotation.NameInMap("NetTraceRouteSwitch")
        private Long netTraceRouteSwitch;

        @com.aliyun.core.annotation.NameInMap("NetTraceRouteTimeout")
        private Long netTraceRouteTimeout;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
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
             * The DNS server.
             */
            public Builder netDNSNs(String netDNSNs) {
                this.netDNSNs = netDNSNs;
                return this;
            }

            /**
             * The DNS query method. Valid values:
             * <p>
             * 
             * *   1: recursion
             * *   2: iteration
             */
            public Builder netDNSQueryMethod(Long netDNSQueryMethod) {
                this.netDNSQueryMethod = netDNSQueryMethod;
                return this;
            }

            /**
             * The IP address type of the DNS server.
             * <p>
             * 
             * *   0: IPv4
             * *   1: IPv6
             * *   2: an automatic IP address
             */
            public Builder netDNSServer(Long netDNSServer) {
                this.netDNSServer = netDNSServer;
                return this;
            }

            /**
             * Specifies whether to enable domain name system (DNS) monitoring.
             * <p>
             * 
             * *   0: Off.
             * *   1: On. You must set DNS parameters if you want to enable DNS monitoring.
             */
            public Builder netDNSSwitch(Long netDNSSwitch) {
                this.netDNSSwitch = netDNSSwitch;
                return this;
            }

            /**
             * The timeout period of DNS monitoring. Default value: 5 seconds. Valid values: 0 to 45 seconds.
             */
            public Builder netDNSTimeout(Long netDNSTimeout) {
                this.netDNSTimeout = netDNSTimeout;
                return this;
            }

            /**
             * Specifies whether to display the data in the DIG format. Valid values:
             * <p>
             * 
             * *   0: no
             * *   1: yes
             */
            public Builder netDigSwitch(Long netDigSwitch) {
                this.netDigSwitch = netDigSwitch;
                return this;
            }

            /**
             * The protocol type. Valid values:
             * <p>
             * 
             * *   0: ICMP
             * *   1: TCP
             */
            public Builder netICMPActive(Long netICMPActive) {
                this.netICMPActive = netICMPActive;
                return this;
            }

            /**
             * Specifies whether to split packages.
             * <p>
             * 
             * *   0: no
             * *   1: yes
             */
            public Builder netICMPDataCut(Long netICMPDataCut) {
                this.netICMPDataCut = netICMPDataCut;
                return this;
            }

            /**
             * The interval at which the network synthetic monitoring task is executed. Unit: seconds.
             */
            public Builder netICMPInterval(Long netICMPInterval) {
                this.netICMPInterval = netICMPInterval;
                return this;
            }

            /**
             * The number of packages.
             */
            public Builder netICMPNum(Long netICMPNum) {
                this.netICMPNum = netICMPNum;
                return this;
            }

            /**
             * The package size.
             */
            public Builder netICMPSize(Long netICMPSize) {
                this.netICMPSize = netICMPSize;
                return this;
            }

            /**
             * Specifies whether to enable ping monitoring.
             * <p>
             * 
             * *   0: Off.
             * *   1: On. You must set Internet control message protocol (ICMP) parameters if you want to enable ping monitoring.
             */
            public Builder netICMPSwitch(Long netICMPSwitch) {
                this.netICMPSwitch = netICMPSwitch;
                return this;
            }

            /**
             * The timeout period of Ping monitoring.
             */
            public Builder netICMPTimeout(Long netICMPTimeout) {
                this.netICMPTimeout = netICMPTimeout;
                return this;
            }

            /**
             * The maximum number of active monitoring points.
             */
            public Builder netTraceRouteNum(Long netTraceRouteNum) {
                this.netTraceRouteNum = netTraceRouteNum;
                return this;
            }

            /**
             * Specifies whether to enable tracert monitoring.
             * <p>
             * 
             * *   0: Off.
             * *   1: On. You must set the tracert parameters if you want to enable tracert monitoring.
             */
            public Builder netTraceRouteSwitch(Long netTraceRouteSwitch) {
                this.netTraceRouteSwitch = netTraceRouteSwitch;
                return this;
            }

            /**
             * The timeout period of tracert monitoring. Valid values: 0 to 300 seconds.
             */
            public Builder netTraceRouteTimeout(Long netTraceRouteTimeout) {
                this.netTraceRouteTimeout = netTraceRouteTimeout;
                return this;
            }

            /**
             * The whitelist for DNS hijacking. The format is `Domain name: Matching rule`.
             * <p>
             * 
             * >  Wireless application protocol (WAP) networks do not support DNS hijacking.
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The key of **form-data**.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of **form-data**.
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The key of **x-www-form-urlencoded**.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of **x-www-form-urlencoded**.
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
        @com.aliyun.core.annotation.NameInMap("FormData")
        private java.util.List < FormData> formData;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("UrlEncoding")
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
             * The data that is passed when the **Mode** parameter is set to **form-data**.
             */
            public Builder formData(java.util.List < FormData> formData) {
                this.formData = formData;
                return this;
            }

            /**
             * The language that is selected when the Mode parameter is set to raw.
             * <p>
             * 
             * *   json
             * *   xml
             * *   javascript
             * *   html
             * *   text
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The data type of the content.
             * <p>
             * 
             * *   form-data
             * *   x-www-form-urlencoded
             * *   raw
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The data that is passed when the **Mode** parameter is set to **raw**.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * The data that is passed when the **Mode** parameter is set to **x-www-form-urlencoded**.
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
             * The key of the request header.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the request header.
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
             * The custom body of a request to initiate an API performance synthetic monitoring task.
             */
            public Builder body(RequestContentBody body) {
                this.body = body;
                return this;
            }

            /**
             * The custom header of a request to initiate an API performance synthetic monitoring task.
             */
            public Builder header(java.util.List < RequestContentHeader> header) {
                this.header = header;
                return this;
            }

            /**
             * The request method.
             * <p>
             * 
             * *   POST
             * *   GET
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
        @com.aliyun.core.annotation.NameInMap("CharacterEncoding")
        private Long characterEncoding;

        @com.aliyun.core.annotation.NameInMap("CustomHost")
        private Long customHost;

        @com.aliyun.core.annotation.NameInMap("CustomHostIp")
        private String customHostIp;

        @com.aliyun.core.annotation.NameInMap("ProtocolConnectionTime")
        private Long protocolConnectionTime;

        @com.aliyun.core.annotation.NameInMap("ProtocolMonitorTimeout")
        private String protocolMonitorTimeout;

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
             * The encoding format.
             * <p>
             * 
             * *   0: UTF-8
             * *   1: GBK
             * *   2: GB2312
             * *   3: Unicode
             */
            public Builder characterEncoding(Long characterEncoding) {
                this.characterEncoding = characterEncoding;
                return this;
            }

            /**
             * The custom host mode.
             * <p>
             * 
             * *   1: round robin
             * *   0: random
             */
            public Builder customHost(Long customHost) {
                this.customHost = customHost;
                return this;
            }

            /**
             * The custom host IP address. You can enter multiple IP addresses. Separate the IP addresses with commas (,).
             */
            public Builder customHostIp(String customHostIp) {
                this.customHostIp = customHostIp;
                return this;
            }

            /**
             * The connection timeout period of the protocol. Unit: seconds.
             */
            public Builder protocolConnectionTime(Long protocolConnectionTime) {
                this.protocolConnectionTime = protocolConnectionTime;
                return this;
            }

            /**
             * The timeout period of API performance synthetic monitoring. Unit: seconds.
             */
            public Builder protocolMonitorTimeout(String protocolMonitorTimeout) {
                this.protocolMonitorTimeout = protocolMonitorTimeout;
                return this;
            }

            /**
             * The size of the received data. This parameter is required when you set the value of the VerifyWay parameter to 2.
             */
            public Builder receivedDataSize(Long receivedDataSize) {
                this.receivedDataSize = receivedDataSize;
                return this;
            }

            /**
             * The request content, including the request header and request body.
             */
            public Builder requestContent(RequestContent requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            /**
             * The verification string.
             */
            public Builder verifyContent(String verifyContent) {
                this.verifyContent = verifyContent;
                return this;
            }

            /**
             * The method that is used to verify the response content.
             * <p>
             * 
             * *   0: no verification.
             * *   1: exact match with the verification string.
             * *   2: partial match with the verification string.
             * *   3: MD5 verification.
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
