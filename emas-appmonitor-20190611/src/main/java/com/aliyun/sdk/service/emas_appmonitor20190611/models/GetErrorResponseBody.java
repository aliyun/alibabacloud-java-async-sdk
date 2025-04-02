// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetErrorResponseBody} extends {@link TeaModel}
 *
 * <p>GetErrorResponseBody</p>
 */
public class GetErrorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Args")
    private java.util.Map<String, ?> args;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetErrorResponseBody(Builder builder) {
        this.args = builder.args;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private java.util.Map<String, ?> args; 
        private Integer errorCode; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetErrorResponseBody model) {
            this.args = model.args;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Args.
         */
        public Builder args(java.util.Map<String, ?> args) {
            this.args = args;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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

        public GetErrorResponseBody build() {
            return new GetErrorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetErrorResponseBody} extends {@link TeaModel}
     *
     * <p>GetErrorResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Access")
        private String access;

        @com.aliyun.core.annotation.NameInMap("AccessSubType")
        private String accessSubType;

        @com.aliyun.core.annotation.NameInMap("AdditionalCallbackInfo")
        private String additionalCallbackInfo;

        @com.aliyun.core.annotation.NameInMap("AdditionalCrossPlatformCrashInfo")
        private String additionalCrossPlatformCrashInfo;

        @com.aliyun.core.annotation.NameInMap("AdditionalCustomInfo")
        private String additionalCustomInfo;

        @com.aliyun.core.annotation.NameInMap("AndroidVm")
        private String androidVm;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("ArgHash")
        private Long argHash;

        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Backtrace")
        private String backtrace;

        @com.aliyun.core.annotation.NameInMap("Banner")
        private String banner;

        @com.aliyun.core.annotation.NameInMap("BinaryUuids")
        private String binaryUuids;

        @com.aliyun.core.annotation.NameInMap("Brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("BrowserName")
        private String browserName;

        @com.aliyun.core.annotation.NameInMap("BrowserVersion")
        private String browserVersion;

        @com.aliyun.core.annotation.NameInMap("Build")
        private String build;

        @com.aliyun.core.annotation.NameInMap("BusinessCountry")
        private String businessCountry;

        @com.aliyun.core.annotation.NameInMap("BusinessErrorExtData")
        private String businessErrorExtData;

        @com.aliyun.core.annotation.NameInMap("BusinessLogType")
        private String businessLogType;

        @com.aliyun.core.annotation.NameInMap("Carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientTime")
        private Long clientTime;

        @com.aliyun.core.annotation.NameInMap("ColNo")
        private String colNo;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("CpuModel")
        private String cpuModel;

        @com.aliyun.core.annotation.NameInMap("CruxModule")
        private String cruxModule;

        @com.aliyun.core.annotation.NameInMap("CruxStack")
        private String cruxStack;

        @com.aliyun.core.annotation.NameInMap("CruxStackHash")
        private Long cruxStackHash;

        @com.aliyun.core.annotation.NameInMap("CruxStackTrace")
        private String cruxStackTrace;

        @com.aliyun.core.annotation.NameInMap("CruxStackTraceHash")
        private Long cruxStackTraceHash;

        @com.aliyun.core.annotation.NameInMap("CustomExceptionType")
        private String customExceptionType;

        @com.aliyun.core.annotation.NameInMap("CustomInfo")
        private String customInfo;

        @com.aliyun.core.annotation.NameInMap("DataDirectory")
        private String dataDirectory;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceModel")
        private String deviceModel;

        @com.aliyun.core.annotation.NameInMap("Did")
        private String did;

        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("DigestHash")
        private String digestHash;

        @com.aliyun.core.annotation.NameInMap("DomScore")
        private String domScore;

        @com.aliyun.core.annotation.NameInMap("DownloadCacheDirectory")
        private String downloadCacheDirectory;

        @com.aliyun.core.annotation.NameInMap("ErrorName")
        private String errorName;

        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private Integer eventId;

        @com.aliyun.core.annotation.NameInMap("EventLog")
        private String eventLog;

        @com.aliyun.core.annotation.NameInMap("ExceptionArg1")
        private String exceptionArg1;

        @com.aliyun.core.annotation.NameInMap("ExceptionArg2")
        private String exceptionArg2;

        @com.aliyun.core.annotation.NameInMap("ExceptionArg3")
        private String exceptionArg3;

        @com.aliyun.core.annotation.NameInMap("ExceptionCode")
        private String exceptionCode;

        @com.aliyun.core.annotation.NameInMap("ExceptionCodes")
        private String exceptionCodes;

        @com.aliyun.core.annotation.NameInMap("ExceptionDetail")
        private String exceptionDetail;

        @com.aliyun.core.annotation.NameInMap("ExceptionId")
        private String exceptionId;

        @com.aliyun.core.annotation.NameInMap("ExceptionMsg")
        private String exceptionMsg;

        @com.aliyun.core.annotation.NameInMap("ExceptionSubtype")
        private String exceptionSubtype;

        @com.aliyun.core.annotation.NameInMap("ExceptionType")
        private String exceptionType;

        @com.aliyun.core.annotation.NameInMap("ExceptionVersion")
        private String exceptionVersion;

        @com.aliyun.core.annotation.NameInMap("ExportStatus")
        private String exportStatus;

        @com.aliyun.core.annotation.NameInMap("ExternalStorageDirectory")
        private String externalStorageDirectory;

        @com.aliyun.core.annotation.NameInMap("FeatureScene")
        private String featureScene;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("Filename")
        private String filename;

        @com.aliyun.core.annotation.NameInMap("FlutterRoute")
        private String flutterRoute;

        @com.aliyun.core.annotation.NameInMap("ForceGround")
        private Integer forceGround;

        @com.aliyun.core.annotation.NameInMap("ForeGround")
        private Integer foreGround;

        @com.aliyun.core.annotation.NameInMap("H5FullUrl")
        private String h5FullUrl;

        @com.aliyun.core.annotation.NameInMap("H5ShortUrl")
        private String h5ShortUrl;

        @com.aliyun.core.annotation.NameInMap("HasOpenMultiProcessMode")
        private Integer hasOpenMultiProcessMode;

        @com.aliyun.core.annotation.NameInMap("HasSdCard")
        private Integer hasSdCard;

        @com.aliyun.core.annotation.NameInMap("HasSgSecurityConfigKey")
        private Integer hasSgSecurityConfigKey;

        @com.aliyun.core.annotation.NameInMap("Imei")
        private String imei;

        @com.aliyun.core.annotation.NameInMap("Imsi")
        private String imsi;

        @com.aliyun.core.annotation.NameInMap("InMainProcess")
        private Integer inMainProcess;

        @com.aliyun.core.annotation.NameInMap("InstallSdCard")
        private Integer installSdCard;

        @com.aliyun.core.annotation.NameInMap("IsBackTrace")
        private Integer isBackTrace;

        @com.aliyun.core.annotation.NameInMap("IsSpeedVersion")
        private Integer isSpeedVersion;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("JsBacktrace")
        private String jsBacktrace;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LaunchedTime")
        private String launchedTime;

        @com.aliyun.core.annotation.NameInMap("LineNo")
        private String lineNo;

        @com.aliyun.core.annotation.NameInMap("LogHash")
        private Long logHash;

        @com.aliyun.core.annotation.NameInMap("MainLog")
        private String mainLog;

        @com.aliyun.core.annotation.NameInMap("MemoryMap")
        private String memoryMap;

        @com.aliyun.core.annotation.NameInMap("MoreInfo1")
        private String moreInfo1;

        @com.aliyun.core.annotation.NameInMap("MoreInfo2")
        private String moreInfo2;

        @com.aliyun.core.annotation.NameInMap("MoreInfo3")
        private String moreInfo3;

        @com.aliyun.core.annotation.NameInMap("NativeAllThreadDump")
        private String nativeAllThreadDump;

        @com.aliyun.core.annotation.NameInMap("NativeMaps")
        private String nativeMaps;

        @com.aliyun.core.annotation.NameInMap("NeedReCluster")
        private Integer needReCluster;

        @com.aliyun.core.annotation.NameInMap("OpenedFileCount")
        private Integer openedFileCount;

        @com.aliyun.core.annotation.NameInMap("Operations")
        private String operations;

        @com.aliyun.core.annotation.NameInMap("OriginData")
        private String originData;

        @com.aliyun.core.annotation.NameInMap("OriginUri")
        private String originUri;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("Page")
        private String page;

        @com.aliyun.core.annotation.NameInMap("ParentProcessName")
        private String parentProcessName;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReportContent")
        private String reportContent;

        @com.aliyun.core.annotation.NameInMap("ReportType")
        private String reportType;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("RootDirectory")
        private String rootDirectory;

        @com.aliyun.core.annotation.NameInMap("RuntimeExtData")
        private String runtimeExtData;

        @com.aliyun.core.annotation.NameInMap("SceneValue")
        private String sceneValue;

        @com.aliyun.core.annotation.NameInMap("SdkType")
        private String sdkType;

        @com.aliyun.core.annotation.NameInMap("SdkVersion")
        private String sdkVersion;

        @com.aliyun.core.annotation.NameInMap("Seq")
        private String seq;

        @com.aliyun.core.annotation.NameInMap("ServerTime")
        private Long serverTime;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("SimpleReportContent")
        private String simpleReportContent;

        @com.aliyun.core.annotation.NameInMap("SoLibBuild")
        private String soLibBuild;

        @com.aliyun.core.annotation.NameInMap("SpeedFlags")
        private String speedFlags;

        @com.aliyun.core.annotation.NameInMap("Stack")
        private String stack;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("SymbolicFileType")
        private String symbolicFileType;

        @com.aliyun.core.annotation.NameInMap("SysLog")
        private String sysLog;

        @com.aliyun.core.annotation.NameInMap("ThreadName")
        private String threadName;

        @com.aliyun.core.annotation.NameInMap("Threads")
        private String threads;

        @com.aliyun.core.annotation.NameInMap("Tid")
        private Integer tid;

        @com.aliyun.core.annotation.NameInMap("Track")
        private String track;

        @com.aliyun.core.annotation.NameInMap("TriggeredTime")
        private String triggeredTime;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private Long uploadTime;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserNick")
        private String userNick;

        @com.aliyun.core.annotation.NameInMap("Utdid")
        private String utdid;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("View")
        private String view;

        @com.aliyun.core.annotation.NameInMap("WeexFullUrl")
        private String weexFullUrl;

        @com.aliyun.core.annotation.NameInMap("WeexShortUrl")
        private String weexShortUrl;

        @com.aliyun.core.annotation.NameInMap("WriteLimit")
        private Integer writeLimit;

        private Model(Builder builder) {
            this.access = builder.access;
            this.accessSubType = builder.accessSubType;
            this.additionalCallbackInfo = builder.additionalCallbackInfo;
            this.additionalCrossPlatformCrashInfo = builder.additionalCrossPlatformCrashInfo;
            this.additionalCustomInfo = builder.additionalCustomInfo;
            this.androidVm = builder.androidVm;
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appVersion = builder.appVersion;
            this.argHash = builder.argHash;
            this.args = builder.args;
            this.backtrace = builder.backtrace;
            this.banner = builder.banner;
            this.binaryUuids = builder.binaryUuids;
            this.brand = builder.brand;
            this.browserName = builder.browserName;
            this.browserVersion = builder.browserVersion;
            this.build = builder.build;
            this.businessCountry = builder.businessCountry;
            this.businessErrorExtData = builder.businessErrorExtData;
            this.businessLogType = builder.businessLogType;
            this.carrier = builder.carrier;
            this.channel = builder.channel;
            this.city = builder.city;
            this.clientIp = builder.clientIp;
            this.clientTime = builder.clientTime;
            this.colNo = builder.colNo;
            this.country = builder.country;
            this.cpuModel = builder.cpuModel;
            this.cruxModule = builder.cruxModule;
            this.cruxStack = builder.cruxStack;
            this.cruxStackHash = builder.cruxStackHash;
            this.cruxStackTrace = builder.cruxStackTrace;
            this.cruxStackTraceHash = builder.cruxStackTraceHash;
            this.customExceptionType = builder.customExceptionType;
            this.customInfo = builder.customInfo;
            this.dataDirectory = builder.dataDirectory;
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.did = builder.did;
            this.digest = builder.digest;
            this.digestHash = builder.digestHash;
            this.domScore = builder.domScore;
            this.downloadCacheDirectory = builder.downloadCacheDirectory;
            this.errorName = builder.errorName;
            this.errorType = builder.errorType;
            this.eventId = builder.eventId;
            this.eventLog = builder.eventLog;
            this.exceptionArg1 = builder.exceptionArg1;
            this.exceptionArg2 = builder.exceptionArg2;
            this.exceptionArg3 = builder.exceptionArg3;
            this.exceptionCode = builder.exceptionCode;
            this.exceptionCodes = builder.exceptionCodes;
            this.exceptionDetail = builder.exceptionDetail;
            this.exceptionId = builder.exceptionId;
            this.exceptionMsg = builder.exceptionMsg;
            this.exceptionSubtype = builder.exceptionSubtype;
            this.exceptionType = builder.exceptionType;
            this.exceptionVersion = builder.exceptionVersion;
            this.exportStatus = builder.exportStatus;
            this.externalStorageDirectory = builder.externalStorageDirectory;
            this.featureScene = builder.featureScene;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.filename = builder.filename;
            this.flutterRoute = builder.flutterRoute;
            this.forceGround = builder.forceGround;
            this.foreGround = builder.foreGround;
            this.h5FullUrl = builder.h5FullUrl;
            this.h5ShortUrl = builder.h5ShortUrl;
            this.hasOpenMultiProcessMode = builder.hasOpenMultiProcessMode;
            this.hasSdCard = builder.hasSdCard;
            this.hasSgSecurityConfigKey = builder.hasSgSecurityConfigKey;
            this.imei = builder.imei;
            this.imsi = builder.imsi;
            this.inMainProcess = builder.inMainProcess;
            this.installSdCard = builder.installSdCard;
            this.isBackTrace = builder.isBackTrace;
            this.isSpeedVersion = builder.isSpeedVersion;
            this.isp = builder.isp;
            this.jsBacktrace = builder.jsBacktrace;
            this.language = builder.language;
            this.launchedTime = builder.launchedTime;
            this.lineNo = builder.lineNo;
            this.logHash = builder.logHash;
            this.mainLog = builder.mainLog;
            this.memoryMap = builder.memoryMap;
            this.moreInfo1 = builder.moreInfo1;
            this.moreInfo2 = builder.moreInfo2;
            this.moreInfo3 = builder.moreInfo3;
            this.nativeAllThreadDump = builder.nativeAllThreadDump;
            this.nativeMaps = builder.nativeMaps;
            this.needReCluster = builder.needReCluster;
            this.openedFileCount = builder.openedFileCount;
            this.operations = builder.operations;
            this.originData = builder.originData;
            this.originUri = builder.originUri;
            this.os = builder.os;
            this.osVersion = builder.osVersion;
            this.page = builder.page;
            this.parentProcessName = builder.parentProcessName;
            this.pid = builder.pid;
            this.platform = builder.platform;
            this.processName = builder.processName;
            this.province = builder.province;
            this.reason = builder.reason;
            this.reportContent = builder.reportContent;
            this.reportType = builder.reportType;
            this.resolution = builder.resolution;
            this.rootDirectory = builder.rootDirectory;
            this.runtimeExtData = builder.runtimeExtData;
            this.sceneValue = builder.sceneValue;
            this.sdkType = builder.sdkType;
            this.sdkVersion = builder.sdkVersion;
            this.seq = builder.seq;
            this.serverTime = builder.serverTime;
            this.sessionId = builder.sessionId;
            this.simpleReportContent = builder.simpleReportContent;
            this.soLibBuild = builder.soLibBuild;
            this.speedFlags = builder.speedFlags;
            this.stack = builder.stack;
            this.status = builder.status;
            this.summary = builder.summary;
            this.symbolicFileType = builder.symbolicFileType;
            this.sysLog = builder.sysLog;
            this.threadName = builder.threadName;
            this.threads = builder.threads;
            this.tid = builder.tid;
            this.track = builder.track;
            this.triggeredTime = builder.triggeredTime;
            this.uploadTime = builder.uploadTime;
            this.uri = builder.uri;
            this.user = builder.user;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
            this.utdid = builder.utdid;
            this.uuid = builder.uuid;
            this.view = builder.view;
            this.weexFullUrl = builder.weexFullUrl;
            this.weexShortUrl = builder.weexShortUrl;
            this.writeLimit = builder.writeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return access
         */
        public String getAccess() {
            return this.access;
        }

        /**
         * @return accessSubType
         */
        public String getAccessSubType() {
            return this.accessSubType;
        }

        /**
         * @return additionalCallbackInfo
         */
        public String getAdditionalCallbackInfo() {
            return this.additionalCallbackInfo;
        }

        /**
         * @return additionalCrossPlatformCrashInfo
         */
        public String getAdditionalCrossPlatformCrashInfo() {
            return this.additionalCrossPlatformCrashInfo;
        }

        /**
         * @return additionalCustomInfo
         */
        public String getAdditionalCustomInfo() {
            return this.additionalCustomInfo;
        }

        /**
         * @return androidVm
         */
        public String getAndroidVm() {
            return this.androidVm;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return argHash
         */
        public Long getArgHash() {
            return this.argHash;
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return backtrace
         */
        public String getBacktrace() {
            return this.backtrace;
        }

        /**
         * @return banner
         */
        public String getBanner() {
            return this.banner;
        }

        /**
         * @return binaryUuids
         */
        public String getBinaryUuids() {
            return this.binaryUuids;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return browserName
         */
        public String getBrowserName() {
            return this.browserName;
        }

        /**
         * @return browserVersion
         */
        public String getBrowserVersion() {
            return this.browserVersion;
        }

        /**
         * @return build
         */
        public String getBuild() {
            return this.build;
        }

        /**
         * @return businessCountry
         */
        public String getBusinessCountry() {
            return this.businessCountry;
        }

        /**
         * @return businessErrorExtData
         */
        public String getBusinessErrorExtData() {
            return this.businessErrorExtData;
        }

        /**
         * @return businessLogType
         */
        public String getBusinessLogType() {
            return this.businessLogType;
        }

        /**
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientTime
         */
        public Long getClientTime() {
            return this.clientTime;
        }

        /**
         * @return colNo
         */
        public String getColNo() {
            return this.colNo;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return cpuModel
         */
        public String getCpuModel() {
            return this.cpuModel;
        }

        /**
         * @return cruxModule
         */
        public String getCruxModule() {
            return this.cruxModule;
        }

        /**
         * @return cruxStack
         */
        public String getCruxStack() {
            return this.cruxStack;
        }

        /**
         * @return cruxStackHash
         */
        public Long getCruxStackHash() {
            return this.cruxStackHash;
        }

        /**
         * @return cruxStackTrace
         */
        public String getCruxStackTrace() {
            return this.cruxStackTrace;
        }

        /**
         * @return cruxStackTraceHash
         */
        public Long getCruxStackTraceHash() {
            return this.cruxStackTraceHash;
        }

        /**
         * @return customExceptionType
         */
        public String getCustomExceptionType() {
            return this.customExceptionType;
        }

        /**
         * @return customInfo
         */
        public String getCustomInfo() {
            return this.customInfo;
        }

        /**
         * @return dataDirectory
         */
        public String getDataDirectory() {
            return this.dataDirectory;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return did
         */
        public String getDid() {
            return this.did;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return digestHash
         */
        public String getDigestHash() {
            return this.digestHash;
        }

        /**
         * @return domScore
         */
        public String getDomScore() {
            return this.domScore;
        }

        /**
         * @return downloadCacheDirectory
         */
        public String getDownloadCacheDirectory() {
            return this.downloadCacheDirectory;
        }

        /**
         * @return errorName
         */
        public String getErrorName() {
            return this.errorName;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return eventId
         */
        public Integer getEventId() {
            return this.eventId;
        }

        /**
         * @return eventLog
         */
        public String getEventLog() {
            return this.eventLog;
        }

        /**
         * @return exceptionArg1
         */
        public String getExceptionArg1() {
            return this.exceptionArg1;
        }

        /**
         * @return exceptionArg2
         */
        public String getExceptionArg2() {
            return this.exceptionArg2;
        }

        /**
         * @return exceptionArg3
         */
        public String getExceptionArg3() {
            return this.exceptionArg3;
        }

        /**
         * @return exceptionCode
         */
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        /**
         * @return exceptionCodes
         */
        public String getExceptionCodes() {
            return this.exceptionCodes;
        }

        /**
         * @return exceptionDetail
         */
        public String getExceptionDetail() {
            return this.exceptionDetail;
        }

        /**
         * @return exceptionId
         */
        public String getExceptionId() {
            return this.exceptionId;
        }

        /**
         * @return exceptionMsg
         */
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        /**
         * @return exceptionSubtype
         */
        public String getExceptionSubtype() {
            return this.exceptionSubtype;
        }

        /**
         * @return exceptionType
         */
        public String getExceptionType() {
            return this.exceptionType;
        }

        /**
         * @return exceptionVersion
         */
        public String getExceptionVersion() {
            return this.exceptionVersion;
        }

        /**
         * @return exportStatus
         */
        public String getExportStatus() {
            return this.exportStatus;
        }

        /**
         * @return externalStorageDirectory
         */
        public String getExternalStorageDirectory() {
            return this.externalStorageDirectory;
        }

        /**
         * @return featureScene
         */
        public String getFeatureScene() {
            return this.featureScene;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return filename
         */
        public String getFilename() {
            return this.filename;
        }

        /**
         * @return flutterRoute
         */
        public String getFlutterRoute() {
            return this.flutterRoute;
        }

        /**
         * @return forceGround
         */
        public Integer getForceGround() {
            return this.forceGround;
        }

        /**
         * @return foreGround
         */
        public Integer getForeGround() {
            return this.foreGround;
        }

        /**
         * @return h5FullUrl
         */
        public String getH5FullUrl() {
            return this.h5FullUrl;
        }

        /**
         * @return h5ShortUrl
         */
        public String getH5ShortUrl() {
            return this.h5ShortUrl;
        }

        /**
         * @return hasOpenMultiProcessMode
         */
        public Integer getHasOpenMultiProcessMode() {
            return this.hasOpenMultiProcessMode;
        }

        /**
         * @return hasSdCard
         */
        public Integer getHasSdCard() {
            return this.hasSdCard;
        }

        /**
         * @return hasSgSecurityConfigKey
         */
        public Integer getHasSgSecurityConfigKey() {
            return this.hasSgSecurityConfigKey;
        }

        /**
         * @return imei
         */
        public String getImei() {
            return this.imei;
        }

        /**
         * @return imsi
         */
        public String getImsi() {
            return this.imsi;
        }

        /**
         * @return inMainProcess
         */
        public Integer getInMainProcess() {
            return this.inMainProcess;
        }

        /**
         * @return installSdCard
         */
        public Integer getInstallSdCard() {
            return this.installSdCard;
        }

        /**
         * @return isBackTrace
         */
        public Integer getIsBackTrace() {
            return this.isBackTrace;
        }

        /**
         * @return isSpeedVersion
         */
        public Integer getIsSpeedVersion() {
            return this.isSpeedVersion;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return jsBacktrace
         */
        public String getJsBacktrace() {
            return this.jsBacktrace;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return launchedTime
         */
        public String getLaunchedTime() {
            return this.launchedTime;
        }

        /**
         * @return lineNo
         */
        public String getLineNo() {
            return this.lineNo;
        }

        /**
         * @return logHash
         */
        public Long getLogHash() {
            return this.logHash;
        }

        /**
         * @return mainLog
         */
        public String getMainLog() {
            return this.mainLog;
        }

        /**
         * @return memoryMap
         */
        public String getMemoryMap() {
            return this.memoryMap;
        }

        /**
         * @return moreInfo1
         */
        public String getMoreInfo1() {
            return this.moreInfo1;
        }

        /**
         * @return moreInfo2
         */
        public String getMoreInfo2() {
            return this.moreInfo2;
        }

        /**
         * @return moreInfo3
         */
        public String getMoreInfo3() {
            return this.moreInfo3;
        }

        /**
         * @return nativeAllThreadDump
         */
        public String getNativeAllThreadDump() {
            return this.nativeAllThreadDump;
        }

        /**
         * @return nativeMaps
         */
        public String getNativeMaps() {
            return this.nativeMaps;
        }

        /**
         * @return needReCluster
         */
        public Integer getNeedReCluster() {
            return this.needReCluster;
        }

        /**
         * @return openedFileCount
         */
        public Integer getOpenedFileCount() {
            return this.openedFileCount;
        }

        /**
         * @return operations
         */
        public String getOperations() {
            return this.operations;
        }

        /**
         * @return originData
         */
        public String getOriginData() {
            return this.originData;
        }

        /**
         * @return originUri
         */
        public String getOriginUri() {
            return this.originUri;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return page
         */
        public String getPage() {
            return this.page;
        }

        /**
         * @return parentProcessName
         */
        public String getParentProcessName() {
            return this.parentProcessName;
        }

        /**
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reportContent
         */
        public String getReportContent() {
            return this.reportContent;
        }

        /**
         * @return reportType
         */
        public String getReportType() {
            return this.reportType;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return rootDirectory
         */
        public String getRootDirectory() {
            return this.rootDirectory;
        }

        /**
         * @return runtimeExtData
         */
        public String getRuntimeExtData() {
            return this.runtimeExtData;
        }

        /**
         * @return sceneValue
         */
        public String getSceneValue() {
            return this.sceneValue;
        }

        /**
         * @return sdkType
         */
        public String getSdkType() {
            return this.sdkType;
        }

        /**
         * @return sdkVersion
         */
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        /**
         * @return seq
         */
        public String getSeq() {
            return this.seq;
        }

        /**
         * @return serverTime
         */
        public Long getServerTime() {
            return this.serverTime;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return simpleReportContent
         */
        public String getSimpleReportContent() {
            return this.simpleReportContent;
        }

        /**
         * @return soLibBuild
         */
        public String getSoLibBuild() {
            return this.soLibBuild;
        }

        /**
         * @return speedFlags
         */
        public String getSpeedFlags() {
            return this.speedFlags;
        }

        /**
         * @return stack
         */
        public String getStack() {
            return this.stack;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return symbolicFileType
         */
        public String getSymbolicFileType() {
            return this.symbolicFileType;
        }

        /**
         * @return sysLog
         */
        public String getSysLog() {
            return this.sysLog;
        }

        /**
         * @return threadName
         */
        public String getThreadName() {
            return this.threadName;
        }

        /**
         * @return threads
         */
        public String getThreads() {
            return this.threads;
        }

        /**
         * @return tid
         */
        public Integer getTid() {
            return this.tid;
        }

        /**
         * @return track
         */
        public String getTrack() {
            return this.track;
        }

        /**
         * @return triggeredTime
         */
        public String getTriggeredTime() {
            return this.triggeredTime;
        }

        /**
         * @return uploadTime
         */
        public Long getUploadTime() {
            return this.uploadTime;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        /**
         * @return utdid
         */
        public String getUtdid() {
            return this.utdid;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return view
         */
        public String getView() {
            return this.view;
        }

        /**
         * @return weexFullUrl
         */
        public String getWeexFullUrl() {
            return this.weexFullUrl;
        }

        /**
         * @return weexShortUrl
         */
        public String getWeexShortUrl() {
            return this.weexShortUrl;
        }

        /**
         * @return writeLimit
         */
        public Integer getWriteLimit() {
            return this.writeLimit;
        }

        public static final class Builder {
            private String access; 
            private String accessSubType; 
            private String additionalCallbackInfo; 
            private String additionalCrossPlatformCrashInfo; 
            private String additionalCustomInfo; 
            private String androidVm; 
            private String appId; 
            private Long appKey; 
            private String appVersion; 
            private Long argHash; 
            private String args; 
            private String backtrace; 
            private String banner; 
            private String binaryUuids; 
            private String brand; 
            private String browserName; 
            private String browserVersion; 
            private String build; 
            private String businessCountry; 
            private String businessErrorExtData; 
            private String businessLogType; 
            private String carrier; 
            private String channel; 
            private String city; 
            private String clientIp; 
            private Long clientTime; 
            private String colNo; 
            private String country; 
            private String cpuModel; 
            private String cruxModule; 
            private String cruxStack; 
            private Long cruxStackHash; 
            private String cruxStackTrace; 
            private Long cruxStackTraceHash; 
            private String customExceptionType; 
            private String customInfo; 
            private String dataDirectory; 
            private String deviceId; 
            private String deviceModel; 
            private String did; 
            private String digest; 
            private String digestHash; 
            private String domScore; 
            private String downloadCacheDirectory; 
            private String errorName; 
            private String errorType; 
            private Integer eventId; 
            private String eventLog; 
            private String exceptionArg1; 
            private String exceptionArg2; 
            private String exceptionArg3; 
            private String exceptionCode; 
            private String exceptionCodes; 
            private String exceptionDetail; 
            private String exceptionId; 
            private String exceptionMsg; 
            private String exceptionSubtype; 
            private String exceptionType; 
            private String exceptionVersion; 
            private String exportStatus; 
            private String externalStorageDirectory; 
            private String featureScene; 
            private String fileName; 
            private String filePath; 
            private String filename; 
            private String flutterRoute; 
            private Integer forceGround; 
            private Integer foreGround; 
            private String h5FullUrl; 
            private String h5ShortUrl; 
            private Integer hasOpenMultiProcessMode; 
            private Integer hasSdCard; 
            private Integer hasSgSecurityConfigKey; 
            private String imei; 
            private String imsi; 
            private Integer inMainProcess; 
            private Integer installSdCard; 
            private Integer isBackTrace; 
            private Integer isSpeedVersion; 
            private String isp; 
            private String jsBacktrace; 
            private String language; 
            private String launchedTime; 
            private String lineNo; 
            private Long logHash; 
            private String mainLog; 
            private String memoryMap; 
            private String moreInfo1; 
            private String moreInfo2; 
            private String moreInfo3; 
            private String nativeAllThreadDump; 
            private String nativeMaps; 
            private Integer needReCluster; 
            private Integer openedFileCount; 
            private String operations; 
            private String originData; 
            private String originUri; 
            private String os; 
            private String osVersion; 
            private String page; 
            private String parentProcessName; 
            private Integer pid; 
            private String platform; 
            private String processName; 
            private String province; 
            private String reason; 
            private String reportContent; 
            private String reportType; 
            private String resolution; 
            private String rootDirectory; 
            private String runtimeExtData; 
            private String sceneValue; 
            private String sdkType; 
            private String sdkVersion; 
            private String seq; 
            private Long serverTime; 
            private String sessionId; 
            private String simpleReportContent; 
            private String soLibBuild; 
            private String speedFlags; 
            private String stack; 
            private String status; 
            private String summary; 
            private String symbolicFileType; 
            private String sysLog; 
            private String threadName; 
            private String threads; 
            private Integer tid; 
            private String track; 
            private String triggeredTime; 
            private Long uploadTime; 
            private String uri; 
            private String user; 
            private String userId; 
            private String userNick; 
            private String utdid; 
            private String uuid; 
            private String view; 
            private String weexFullUrl; 
            private String weexShortUrl; 
            private Integer writeLimit; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.access = model.access;
                this.accessSubType = model.accessSubType;
                this.additionalCallbackInfo = model.additionalCallbackInfo;
                this.additionalCrossPlatformCrashInfo = model.additionalCrossPlatformCrashInfo;
                this.additionalCustomInfo = model.additionalCustomInfo;
                this.androidVm = model.androidVm;
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.appVersion = model.appVersion;
                this.argHash = model.argHash;
                this.args = model.args;
                this.backtrace = model.backtrace;
                this.banner = model.banner;
                this.binaryUuids = model.binaryUuids;
                this.brand = model.brand;
                this.browserName = model.browserName;
                this.browserVersion = model.browserVersion;
                this.build = model.build;
                this.businessCountry = model.businessCountry;
                this.businessErrorExtData = model.businessErrorExtData;
                this.businessLogType = model.businessLogType;
                this.carrier = model.carrier;
                this.channel = model.channel;
                this.city = model.city;
                this.clientIp = model.clientIp;
                this.clientTime = model.clientTime;
                this.colNo = model.colNo;
                this.country = model.country;
                this.cpuModel = model.cpuModel;
                this.cruxModule = model.cruxModule;
                this.cruxStack = model.cruxStack;
                this.cruxStackHash = model.cruxStackHash;
                this.cruxStackTrace = model.cruxStackTrace;
                this.cruxStackTraceHash = model.cruxStackTraceHash;
                this.customExceptionType = model.customExceptionType;
                this.customInfo = model.customInfo;
                this.dataDirectory = model.dataDirectory;
                this.deviceId = model.deviceId;
                this.deviceModel = model.deviceModel;
                this.did = model.did;
                this.digest = model.digest;
                this.digestHash = model.digestHash;
                this.domScore = model.domScore;
                this.downloadCacheDirectory = model.downloadCacheDirectory;
                this.errorName = model.errorName;
                this.errorType = model.errorType;
                this.eventId = model.eventId;
                this.eventLog = model.eventLog;
                this.exceptionArg1 = model.exceptionArg1;
                this.exceptionArg2 = model.exceptionArg2;
                this.exceptionArg3 = model.exceptionArg3;
                this.exceptionCode = model.exceptionCode;
                this.exceptionCodes = model.exceptionCodes;
                this.exceptionDetail = model.exceptionDetail;
                this.exceptionId = model.exceptionId;
                this.exceptionMsg = model.exceptionMsg;
                this.exceptionSubtype = model.exceptionSubtype;
                this.exceptionType = model.exceptionType;
                this.exceptionVersion = model.exceptionVersion;
                this.exportStatus = model.exportStatus;
                this.externalStorageDirectory = model.externalStorageDirectory;
                this.featureScene = model.featureScene;
                this.fileName = model.fileName;
                this.filePath = model.filePath;
                this.filename = model.filename;
                this.flutterRoute = model.flutterRoute;
                this.forceGround = model.forceGround;
                this.foreGround = model.foreGround;
                this.h5FullUrl = model.h5FullUrl;
                this.h5ShortUrl = model.h5ShortUrl;
                this.hasOpenMultiProcessMode = model.hasOpenMultiProcessMode;
                this.hasSdCard = model.hasSdCard;
                this.hasSgSecurityConfigKey = model.hasSgSecurityConfigKey;
                this.imei = model.imei;
                this.imsi = model.imsi;
                this.inMainProcess = model.inMainProcess;
                this.installSdCard = model.installSdCard;
                this.isBackTrace = model.isBackTrace;
                this.isSpeedVersion = model.isSpeedVersion;
                this.isp = model.isp;
                this.jsBacktrace = model.jsBacktrace;
                this.language = model.language;
                this.launchedTime = model.launchedTime;
                this.lineNo = model.lineNo;
                this.logHash = model.logHash;
                this.mainLog = model.mainLog;
                this.memoryMap = model.memoryMap;
                this.moreInfo1 = model.moreInfo1;
                this.moreInfo2 = model.moreInfo2;
                this.moreInfo3 = model.moreInfo3;
                this.nativeAllThreadDump = model.nativeAllThreadDump;
                this.nativeMaps = model.nativeMaps;
                this.needReCluster = model.needReCluster;
                this.openedFileCount = model.openedFileCount;
                this.operations = model.operations;
                this.originData = model.originData;
                this.originUri = model.originUri;
                this.os = model.os;
                this.osVersion = model.osVersion;
                this.page = model.page;
                this.parentProcessName = model.parentProcessName;
                this.pid = model.pid;
                this.platform = model.platform;
                this.processName = model.processName;
                this.province = model.province;
                this.reason = model.reason;
                this.reportContent = model.reportContent;
                this.reportType = model.reportType;
                this.resolution = model.resolution;
                this.rootDirectory = model.rootDirectory;
                this.runtimeExtData = model.runtimeExtData;
                this.sceneValue = model.sceneValue;
                this.sdkType = model.sdkType;
                this.sdkVersion = model.sdkVersion;
                this.seq = model.seq;
                this.serverTime = model.serverTime;
                this.sessionId = model.sessionId;
                this.simpleReportContent = model.simpleReportContent;
                this.soLibBuild = model.soLibBuild;
                this.speedFlags = model.speedFlags;
                this.stack = model.stack;
                this.status = model.status;
                this.summary = model.summary;
                this.symbolicFileType = model.symbolicFileType;
                this.sysLog = model.sysLog;
                this.threadName = model.threadName;
                this.threads = model.threads;
                this.tid = model.tid;
                this.track = model.track;
                this.triggeredTime = model.triggeredTime;
                this.uploadTime = model.uploadTime;
                this.uri = model.uri;
                this.user = model.user;
                this.userId = model.userId;
                this.userNick = model.userNick;
                this.utdid = model.utdid;
                this.uuid = model.uuid;
                this.view = model.view;
                this.weexFullUrl = model.weexFullUrl;
                this.weexShortUrl = model.weexShortUrl;
                this.writeLimit = model.writeLimit;
            } 

            /**
             * Access.
             */
            public Builder access(String access) {
                this.access = access;
                return this;
            }

            /**
             * AccessSubType.
             */
            public Builder accessSubType(String accessSubType) {
                this.accessSubType = accessSubType;
                return this;
            }

            /**
             * AdditionalCallbackInfo.
             */
            public Builder additionalCallbackInfo(String additionalCallbackInfo) {
                this.additionalCallbackInfo = additionalCallbackInfo;
                return this;
            }

            /**
             * AdditionalCrossPlatformCrashInfo.
             */
            public Builder additionalCrossPlatformCrashInfo(String additionalCrossPlatformCrashInfo) {
                this.additionalCrossPlatformCrashInfo = additionalCrossPlatformCrashInfo;
                return this;
            }

            /**
             * AdditionalCustomInfo.
             */
            public Builder additionalCustomInfo(String additionalCustomInfo) {
                this.additionalCustomInfo = additionalCustomInfo;
                return this;
            }

            /**
             * AndroidVm.
             */
            public Builder androidVm(String androidVm) {
                this.androidVm = androidVm;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>appKey</p>
             * 
             * <strong>example:</strong>
             * <p>233588686</p>
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * ArgHash.
             */
            public Builder argHash(Long argHash) {
                this.argHash = argHash;
                return this;
            }

            /**
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Backtrace.
             */
            public Builder backtrace(String backtrace) {
                this.backtrace = backtrace;
                return this;
            }

            /**
             * <p>banner</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder banner(String banner) {
                this.banner = banner;
                return this;
            }

            /**
             * BinaryUuids.
             */
            public Builder binaryUuids(String binaryUuids) {
                this.binaryUuids = binaryUuids;
                return this;
            }

            /**
             * Brand.
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * BrowserName.
             */
            public Builder browserName(String browserName) {
                this.browserName = browserName;
                return this;
            }

            /**
             * BrowserVersion.
             */
            public Builder browserVersion(String browserVersion) {
                this.browserVersion = browserVersion;
                return this;
            }

            /**
             * Build.
             */
            public Builder build(String build) {
                this.build = build;
                return this;
            }

            /**
             * BusinessCountry.
             */
            public Builder businessCountry(String businessCountry) {
                this.businessCountry = businessCountry;
                return this;
            }

            /**
             * BusinessErrorExtData.
             */
            public Builder businessErrorExtData(String businessErrorExtData) {
                this.businessErrorExtData = businessErrorExtData;
                return this;
            }

            /**
             * BusinessLogType.
             */
            public Builder businessLogType(String businessLogType) {
                this.businessLogType = businessLogType;
                return this;
            }

            /**
             * <p>carrier</p>
             * 
             * <strong>example:</strong>
             * <p>CT</p>
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * ClientTime.
             */
            public Builder clientTime(Long clientTime) {
                this.clientTime = clientTime;
                return this;
            }

            /**
             * ColNo.
             */
            public Builder colNo(String colNo) {
                this.colNo = colNo;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * CpuModel.
             */
            public Builder cpuModel(String cpuModel) {
                this.cpuModel = cpuModel;
                return this;
            }

            /**
             * CruxModule.
             */
            public Builder cruxModule(String cruxModule) {
                this.cruxModule = cruxModule;
                return this;
            }

            /**
             * CruxStack.
             */
            public Builder cruxStack(String cruxStack) {
                this.cruxStack = cruxStack;
                return this;
            }

            /**
             * CruxStackHash.
             */
            public Builder cruxStackHash(Long cruxStackHash) {
                this.cruxStackHash = cruxStackHash;
                return this;
            }

            /**
             * <p>CruxStackTrace</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder cruxStackTrace(String cruxStackTrace) {
                this.cruxStackTrace = cruxStackTrace;
                return this;
            }

            /**
             * CruxStackTraceHash.
             */
            public Builder cruxStackTraceHash(Long cruxStackTraceHash) {
                this.cruxStackTraceHash = cruxStackTraceHash;
                return this;
            }

            /**
             * CustomExceptionType.
             */
            public Builder customExceptionType(String customExceptionType) {
                this.customExceptionType = customExceptionType;
                return this;
            }

            /**
             * CustomInfo.
             */
            public Builder customInfo(String customInfo) {
                this.customInfo = customInfo;
                return this;
            }

            /**
             * DataDirectory.
             */
            public Builder dataDirectory(String dataDirectory) {
                this.dataDirectory = dataDirectory;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * Did.
             */
            public Builder did(String did) {
                this.did = did;
                return this;
            }

            /**
             * Digest.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * DigestHash.
             */
            public Builder digestHash(String digestHash) {
                this.digestHash = digestHash;
                return this;
            }

            /**
             * DomScore.
             */
            public Builder domScore(String domScore) {
                this.domScore = domScore;
                return this;
            }

            /**
             * DownloadCacheDirectory.
             */
            public Builder downloadCacheDirectory(String downloadCacheDirectory) {
                this.downloadCacheDirectory = downloadCacheDirectory;
                return this;
            }

            /**
             * ErrorName.
             */
            public Builder errorName(String errorName) {
                this.errorName = errorName;
                return this;
            }

            /**
             * ErrorType.
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(Integer eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventLog.
             */
            public Builder eventLog(String eventLog) {
                this.eventLog = eventLog;
                return this;
            }

            /**
             * ExceptionArg1.
             */
            public Builder exceptionArg1(String exceptionArg1) {
                this.exceptionArg1 = exceptionArg1;
                return this;
            }

            /**
             * ExceptionArg2.
             */
            public Builder exceptionArg2(String exceptionArg2) {
                this.exceptionArg2 = exceptionArg2;
                return this;
            }

            /**
             * ExceptionArg3.
             */
            public Builder exceptionArg3(String exceptionArg3) {
                this.exceptionArg3 = exceptionArg3;
                return this;
            }

            /**
             * ExceptionCode.
             */
            public Builder exceptionCode(String exceptionCode) {
                this.exceptionCode = exceptionCode;
                return this;
            }

            /**
             * ExceptionCodes.
             */
            public Builder exceptionCodes(String exceptionCodes) {
                this.exceptionCodes = exceptionCodes;
                return this;
            }

            /**
             * ExceptionDetail.
             */
            public Builder exceptionDetail(String exceptionDetail) {
                this.exceptionDetail = exceptionDetail;
                return this;
            }

            /**
             * ExceptionId.
             */
            public Builder exceptionId(String exceptionId) {
                this.exceptionId = exceptionId;
                return this;
            }

            /**
             * ExceptionMsg.
             */
            public Builder exceptionMsg(String exceptionMsg) {
                this.exceptionMsg = exceptionMsg;
                return this;
            }

            /**
             * ExceptionSubtype.
             */
            public Builder exceptionSubtype(String exceptionSubtype) {
                this.exceptionSubtype = exceptionSubtype;
                return this;
            }

            /**
             * ExceptionType.
             */
            public Builder exceptionType(String exceptionType) {
                this.exceptionType = exceptionType;
                return this;
            }

            /**
             * ExceptionVersion.
             */
            public Builder exceptionVersion(String exceptionVersion) {
                this.exceptionVersion = exceptionVersion;
                return this;
            }

            /**
             * ExportStatus.
             */
            public Builder exportStatus(String exportStatus) {
                this.exportStatus = exportStatus;
                return this;
            }

            /**
             * ExternalStorageDirectory.
             */
            public Builder externalStorageDirectory(String externalStorageDirectory) {
                this.externalStorageDirectory = externalStorageDirectory;
                return this;
            }

            /**
             * FeatureScene.
             */
            public Builder featureScene(String featureScene) {
                this.featureScene = featureScene;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * Filename.
             */
            public Builder filename(String filename) {
                this.filename = filename;
                return this;
            }

            /**
             * FlutterRoute.
             */
            public Builder flutterRoute(String flutterRoute) {
                this.flutterRoute = flutterRoute;
                return this;
            }

            /**
             * ForceGround.
             */
            public Builder forceGround(Integer forceGround) {
                this.forceGround = forceGround;
                return this;
            }

            /**
             * ForeGround.
             */
            public Builder foreGround(Integer foreGround) {
                this.foreGround = foreGround;
                return this;
            }

            /**
             * H5FullUrl.
             */
            public Builder h5FullUrl(String h5FullUrl) {
                this.h5FullUrl = h5FullUrl;
                return this;
            }

            /**
             * H5ShortUrl.
             */
            public Builder h5ShortUrl(String h5ShortUrl) {
                this.h5ShortUrl = h5ShortUrl;
                return this;
            }

            /**
             * HasOpenMultiProcessMode.
             */
            public Builder hasOpenMultiProcessMode(Integer hasOpenMultiProcessMode) {
                this.hasOpenMultiProcessMode = hasOpenMultiProcessMode;
                return this;
            }

            /**
             * HasSdCard.
             */
            public Builder hasSdCard(Integer hasSdCard) {
                this.hasSdCard = hasSdCard;
                return this;
            }

            /**
             * HasSgSecurityConfigKey.
             */
            public Builder hasSgSecurityConfigKey(Integer hasSgSecurityConfigKey) {
                this.hasSgSecurityConfigKey = hasSgSecurityConfigKey;
                return this;
            }

            /**
             * <p>IMEI</p>
             * 
             * <strong>example:</strong>
             * <p>2704b9b0d94b2f3897f82119a1900cd9c7a8108d</p>
             */
            public Builder imei(String imei) {
                this.imei = imei;
                return this;
            }

            /**
             * <p>IMSI</p>
             * 
             * <strong>example:</strong>
             * <p>460049842500442</p>
             */
            public Builder imsi(String imsi) {
                this.imsi = imsi;
                return this;
            }

            /**
             * InMainProcess.
             */
            public Builder inMainProcess(Integer inMainProcess) {
                this.inMainProcess = inMainProcess;
                return this;
            }

            /**
             * InstallSdCard.
             */
            public Builder installSdCard(Integer installSdCard) {
                this.installSdCard = installSdCard;
                return this;
            }

            /**
             * IsBackTrace.
             */
            public Builder isBackTrace(Integer isBackTrace) {
                this.isBackTrace = isBackTrace;
                return this;
            }

            /**
             * IsSpeedVersion.
             */
            public Builder isSpeedVersion(Integer isSpeedVersion) {
                this.isSpeedVersion = isSpeedVersion;
                return this;
            }

            /**
             * <p>ISP</p>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * JsBacktrace.
             */
            public Builder jsBacktrace(String jsBacktrace) {
                this.jsBacktrace = jsBacktrace;
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
             * LaunchedTime.
             */
            public Builder launchedTime(String launchedTime) {
                this.launchedTime = launchedTime;
                return this;
            }

            /**
             * LineNo.
             */
            public Builder lineNo(String lineNo) {
                this.lineNo = lineNo;
                return this;
            }

            /**
             * LogHash.
             */
            public Builder logHash(Long logHash) {
                this.logHash = logHash;
                return this;
            }

            /**
             * MainLog.
             */
            public Builder mainLog(String mainLog) {
                this.mainLog = mainLog;
                return this;
            }

            /**
             * MemoryMap.
             */
            public Builder memoryMap(String memoryMap) {
                this.memoryMap = memoryMap;
                return this;
            }

            /**
             * MoreInfo1.
             */
            public Builder moreInfo1(String moreInfo1) {
                this.moreInfo1 = moreInfo1;
                return this;
            }

            /**
             * MoreInfo2.
             */
            public Builder moreInfo2(String moreInfo2) {
                this.moreInfo2 = moreInfo2;
                return this;
            }

            /**
             * MoreInfo3.
             */
            public Builder moreInfo3(String moreInfo3) {
                this.moreInfo3 = moreInfo3;
                return this;
            }

            /**
             * NativeAllThreadDump.
             */
            public Builder nativeAllThreadDump(String nativeAllThreadDump) {
                this.nativeAllThreadDump = nativeAllThreadDump;
                return this;
            }

            /**
             * <p>Native map</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder nativeMaps(String nativeMaps) {
                this.nativeMaps = nativeMaps;
                return this;
            }

            /**
             * NeedReCluster.
             */
            public Builder needReCluster(Integer needReCluster) {
                this.needReCluster = needReCluster;
                return this;
            }

            /**
             * OpenedFileCount.
             */
            public Builder openedFileCount(Integer openedFileCount) {
                this.openedFileCount = openedFileCount;
                return this;
            }

            /**
             * Operations.
             */
            public Builder operations(String operations) {
                this.operations = operations;
                return this;
            }

            /**
             * OriginData.
             */
            public Builder originData(String originData) {
                this.originData = originData;
                return this;
            }

            /**
             * OriginUri.
             */
            public Builder originUri(String originUri) {
                this.originUri = originUri;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OsVersion.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(String page) {
                this.page = page;
                return this;
            }

            /**
             * ParentProcessName.
             */
            public Builder parentProcessName(String parentProcessName) {
                this.parentProcessName = parentProcessName;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
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
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReportContent.
             */
            public Builder reportContent(String reportContent) {
                this.reportContent = reportContent;
                return this;
            }

            /**
             * ReportType.
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * RootDirectory.
             */
            public Builder rootDirectory(String rootDirectory) {
                this.rootDirectory = rootDirectory;
                return this;
            }

            /**
             * RuntimeExtData.
             */
            public Builder runtimeExtData(String runtimeExtData) {
                this.runtimeExtData = runtimeExtData;
                return this;
            }

            /**
             * SceneValue.
             */
            public Builder sceneValue(String sceneValue) {
                this.sceneValue = sceneValue;
                return this;
            }

            /**
             * SdkType.
             */
            public Builder sdkType(String sdkType) {
                this.sdkType = sdkType;
                return this;
            }

            /**
             * SdkVersion.
             */
            public Builder sdkVersion(String sdkVersion) {
                this.sdkVersion = sdkVersion;
                return this;
            }

            /**
             * Seq.
             */
            public Builder seq(String seq) {
                this.seq = seq;
                return this;
            }

            /**
             * ServerTime.
             */
            public Builder serverTime(Long serverTime) {
                this.serverTime = serverTime;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * SimpleReportContent.
             */
            public Builder simpleReportContent(String simpleReportContent) {
                this.simpleReportContent = simpleReportContent;
                return this;
            }

            /**
             * SoLibBuild.
             */
            public Builder soLibBuild(String soLibBuild) {
                this.soLibBuild = soLibBuild;
                return this;
            }

            /**
             * <p>SpeedFlags</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder speedFlags(String speedFlags) {
                this.speedFlags = speedFlags;
                return this;
            }

            /**
             * Stack.
             */
            public Builder stack(String stack) {
                this.stack = stack;
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
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * SymbolicFileType.
             */
            public Builder symbolicFileType(String symbolicFileType) {
                this.symbolicFileType = symbolicFileType;
                return this;
            }

            /**
             * SysLog.
             */
            public Builder sysLog(String sysLog) {
                this.sysLog = sysLog;
                return this;
            }

            /**
             * ThreadName.
             */
            public Builder threadName(String threadName) {
                this.threadName = threadName;
                return this;
            }

            /**
             * Threads.
             */
            public Builder threads(String threads) {
                this.threads = threads;
                return this;
            }

            /**
             * Tid.
             */
            public Builder tid(Integer tid) {
                this.tid = tid;
                return this;
            }

            /**
             * Track.
             */
            public Builder track(String track) {
                this.track = track;
                return this;
            }

            /**
             * TriggeredTime.
             */
            public Builder triggeredTime(String triggeredTime) {
                this.triggeredTime = triggeredTime;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(Long uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            /**
             * <p>URI</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oss.aliyuncs.com/aliyun_id_photo_bucket/default_handsome.jpg">https://oss.aliyuncs.com/aliyun_id_photo_bucket/default_handsome.jpg</a></p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            /**
             * <p>utdid</p>
             * 
             * <strong>example:</strong>
             * <p>2704b9b0d94b2f3897f82119a</p>
             */
            public Builder utdid(String utdid) {
                this.utdid = utdid;
                return this;
            }

            /**
             * <p>uuid</p>
             * 
             * <strong>example:</strong>
             * <p>105a87c6-f299-42e5-8fc7-1066a47a96e5</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>view</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyun.view1</p>
             */
            public Builder view(String view) {
                this.view = view;
                return this;
            }

            /**
             * WeexFullUrl.
             */
            public Builder weexFullUrl(String weexFullUrl) {
                this.weexFullUrl = weexFullUrl;
                return this;
            }

            /**
             * WeexShortUrl.
             */
            public Builder weexShortUrl(String weexShortUrl) {
                this.weexShortUrl = weexShortUrl;
                return this;
            }

            /**
             * WriteLimit.
             */
            public Builder writeLimit(Integer writeLimit) {
                this.writeLimit = writeLimit;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
