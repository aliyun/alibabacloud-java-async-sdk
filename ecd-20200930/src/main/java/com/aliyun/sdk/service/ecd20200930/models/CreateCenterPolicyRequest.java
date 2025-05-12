// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateCenterPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateCenterPolicyRequest</p>
 */
public class CreateCenterPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminAccess")
    private String adminAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppContentProtection")
    private String appContentProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizeAccessPolicyRule")
    private java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizeSecurityPolicyRule")
    private java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CameraRedirect")
    private String cameraRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private java.util.List<ClientType> clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clipboard")
    private String clipboard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColorEnhancement")
    private String colorEnhancement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuDownGradeDuration")
    private Integer cpuDownGradeDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuProcessors")
    private java.util.List<String> cpuProcessors;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuProtectedMode")
    private String cpuProtectedMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuRateLimit")
    private Integer cpuRateLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuSampleDuration")
    private Integer cpuSampleDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuSingleRateLimit")
    private Integer cpuSingleRateLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceConnectHint")
    private String deviceConnectHint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceRedirects")
    private java.util.List<DeviceRedirects> deviceRedirects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceRules")
    private java.util.List<DeviceRules> deviceRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisconnectKeepSession")
    private String disconnectKeepSession;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisconnectKeepSessionTime")
    private Integer disconnectKeepSessionTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayMode")
    private String displayMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainResolveRule")
    private java.util.List<DomainResolveRule> domainResolveRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainResolveRuleType")
    private String domainResolveRuleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSessionRateLimiting")
    private String enableSessionRateLimiting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserApplyAdminCoordinate")
    private String endUserApplyAdminCoordinate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserGroupCoordinate")
    private String endUserGroupCoordinate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileMigrate")
    private String fileMigrate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuAcceleration")
    private String gpuAcceleration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Html5FileTransfer")
    private String html5FileTransfer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetCommunicationProtocol")
    private String internetCommunicationProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetPrinter")
    private String internetPrinter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalDrive")
    private String localDrive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxReconnectTime")
    private Integer maxReconnectTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryDownGradeDuration")
    private Integer memoryDownGradeDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryProcessors")
    private java.util.List<String> memoryProcessors;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryProtectedMode")
    private String memoryProtectedMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryRateLimit")
    private Integer memoryRateLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemorySampleDuration")
    private Integer memorySampleDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemorySingleRateLimit")
    private Integer memorySingleRateLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileRestart")
    private String mobileRestart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileShutdown")
    private String mobileShutdown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetRedirect")
    private String netRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetRedirectRule")
    private java.util.List<NetRedirectRule> netRedirectRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoOperationDisconnect")
    private String noOperationDisconnect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoOperationDisconnectTime")
    private Integer noOperationDisconnectTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrinterRedirect")
    private String printerRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualityEnhancement")
    private String qualityEnhancement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordEventDuration")
    private Integer recordEventDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordEventFilePaths")
    private java.util.List<String> recordEventFilePaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordEventRegisters")
    private java.util.List<String> recordEventRegisters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordEvents")
    private java.util.List<String> recordEvents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Recording")
    private String recording;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingAudio")
    private String recordingAudio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingDuration")
    private Integer recordingDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingEndTime")
    private String recordingEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingExpires")
    private Integer recordingExpires;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingFps")
    private String recordingFps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingStartTime")
    private String recordingStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingUserNotify")
    private String recordingUserNotify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingUserNotifyMessage")
    private String recordingUserNotifyMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteCoordinate")
    private String remoteCoordinate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetDesktop")
    private String resetDesktop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
    private Integer resolutionHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResolutionModel")
    private String resolutionModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
    private Integer resolutionWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SafeMenu")
    private String safeMenu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeValue")
    private java.util.List<String> scopeValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionMaxRateKbps")
    private Integer sessionMaxRateKbps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmoothEnhancement")
    private String smoothEnhancement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusMonitor")
    private String statusMonitor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamingMode")
    private String streamingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFps")
    private Integer targetFps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Taskbar")
    private String taskbar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsbRedirect")
    private String usbRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsbSupplyRedirectRule")
    private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoEncAvgKbps")
    private Integer videoEncAvgKbps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoEncMaxQP")
    private Integer videoEncMaxQP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoEncMinQP")
    private Integer videoEncMinQP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoEncPeakKbps")
    private Integer videoEncPeakKbps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoEncPolicy")
    private String videoEncPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoRedirect")
    private String videoRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VisualQuality")
    private String visualQuality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Watermark")
    private String watermark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkAntiCam")
    private String watermarkAntiCam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkColor")
    private Integer watermarkColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkColumnAmount")
    private Integer watermarkColumnAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkCustomText")
    private String watermarkCustomText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkDegree")
    private Double watermarkDegree;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkFontSize")
    private Integer watermarkFontSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkFontStyle")
    private String watermarkFontStyle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkPower")
    private String watermarkPower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkRowAmount")
    private Integer watermarkRowAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkSecurity")
    private String watermarkSecurity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkTransparencyValue")
    private Integer watermarkTransparencyValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkType")
    private String watermarkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WuyingKeeper")
    private String wuyingKeeper;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WyAssistant")
    private String wyAssistant;

    private CreateCenterPolicyRequest(Builder builder) {
        super(builder);
        this.adminAccess = builder.adminAccess;
        this.appContentProtection = builder.appContentProtection;
        this.authorizeAccessPolicyRule = builder.authorizeAccessPolicyRule;
        this.authorizeSecurityPolicyRule = builder.authorizeSecurityPolicyRule;
        this.businessType = builder.businessType;
        this.cameraRedirect = builder.cameraRedirect;
        this.clientType = builder.clientType;
        this.clipboard = builder.clipboard;
        this.colorEnhancement = builder.colorEnhancement;
        this.cpuDownGradeDuration = builder.cpuDownGradeDuration;
        this.cpuProcessors = builder.cpuProcessors;
        this.cpuProtectedMode = builder.cpuProtectedMode;
        this.cpuRateLimit = builder.cpuRateLimit;
        this.cpuSampleDuration = builder.cpuSampleDuration;
        this.cpuSingleRateLimit = builder.cpuSingleRateLimit;
        this.deviceConnectHint = builder.deviceConnectHint;
        this.deviceRedirects = builder.deviceRedirects;
        this.deviceRules = builder.deviceRules;
        this.disconnectKeepSession = builder.disconnectKeepSession;
        this.disconnectKeepSessionTime = builder.disconnectKeepSessionTime;
        this.displayMode = builder.displayMode;
        this.domainResolveRule = builder.domainResolveRule;
        this.domainResolveRuleType = builder.domainResolveRuleType;
        this.enableSessionRateLimiting = builder.enableSessionRateLimiting;
        this.endUserApplyAdminCoordinate = builder.endUserApplyAdminCoordinate;
        this.endUserGroupCoordinate = builder.endUserGroupCoordinate;
        this.fileMigrate = builder.fileMigrate;
        this.gpuAcceleration = builder.gpuAcceleration;
        this.html5FileTransfer = builder.html5FileTransfer;
        this.internetCommunicationProtocol = builder.internetCommunicationProtocol;
        this.internetPrinter = builder.internetPrinter;
        this.localDrive = builder.localDrive;
        this.maxReconnectTime = builder.maxReconnectTime;
        this.memoryDownGradeDuration = builder.memoryDownGradeDuration;
        this.memoryProcessors = builder.memoryProcessors;
        this.memoryProtectedMode = builder.memoryProtectedMode;
        this.memoryRateLimit = builder.memoryRateLimit;
        this.memorySampleDuration = builder.memorySampleDuration;
        this.memorySingleRateLimit = builder.memorySingleRateLimit;
        this.mobileRestart = builder.mobileRestart;
        this.mobileShutdown = builder.mobileShutdown;
        this.name = builder.name;
        this.netRedirect = builder.netRedirect;
        this.netRedirectRule = builder.netRedirectRule;
        this.noOperationDisconnect = builder.noOperationDisconnect;
        this.noOperationDisconnectTime = builder.noOperationDisconnectTime;
        this.printerRedirect = builder.printerRedirect;
        this.qualityEnhancement = builder.qualityEnhancement;
        this.recordEventDuration = builder.recordEventDuration;
        this.recordEventFilePaths = builder.recordEventFilePaths;
        this.recordEventRegisters = builder.recordEventRegisters;
        this.recordEvents = builder.recordEvents;
        this.recording = builder.recording;
        this.recordingAudio = builder.recordingAudio;
        this.recordingDuration = builder.recordingDuration;
        this.recordingEndTime = builder.recordingEndTime;
        this.recordingExpires = builder.recordingExpires;
        this.recordingFps = builder.recordingFps;
        this.recordingStartTime = builder.recordingStartTime;
        this.recordingUserNotify = builder.recordingUserNotify;
        this.recordingUserNotifyMessage = builder.recordingUserNotifyMessage;
        this.regionId = builder.regionId;
        this.remoteCoordinate = builder.remoteCoordinate;
        this.resetDesktop = builder.resetDesktop;
        this.resolutionHeight = builder.resolutionHeight;
        this.resolutionModel = builder.resolutionModel;
        this.resolutionWidth = builder.resolutionWidth;
        this.resourceType = builder.resourceType;
        this.safeMenu = builder.safeMenu;
        this.scope = builder.scope;
        this.scopeValue = builder.scopeValue;
        this.sessionMaxRateKbps = builder.sessionMaxRateKbps;
        this.smoothEnhancement = builder.smoothEnhancement;
        this.statusMonitor = builder.statusMonitor;
        this.streamingMode = builder.streamingMode;
        this.targetFps = builder.targetFps;
        this.taskbar = builder.taskbar;
        this.usbRedirect = builder.usbRedirect;
        this.usbSupplyRedirectRule = builder.usbSupplyRedirectRule;
        this.videoEncAvgKbps = builder.videoEncAvgKbps;
        this.videoEncMaxQP = builder.videoEncMaxQP;
        this.videoEncMinQP = builder.videoEncMinQP;
        this.videoEncPeakKbps = builder.videoEncPeakKbps;
        this.videoEncPolicy = builder.videoEncPolicy;
        this.videoRedirect = builder.videoRedirect;
        this.visualQuality = builder.visualQuality;
        this.watermark = builder.watermark;
        this.watermarkAntiCam = builder.watermarkAntiCam;
        this.watermarkColor = builder.watermarkColor;
        this.watermarkColumnAmount = builder.watermarkColumnAmount;
        this.watermarkCustomText = builder.watermarkCustomText;
        this.watermarkDegree = builder.watermarkDegree;
        this.watermarkFontSize = builder.watermarkFontSize;
        this.watermarkFontStyle = builder.watermarkFontStyle;
        this.watermarkPower = builder.watermarkPower;
        this.watermarkRowAmount = builder.watermarkRowAmount;
        this.watermarkSecurity = builder.watermarkSecurity;
        this.watermarkTransparencyValue = builder.watermarkTransparencyValue;
        this.watermarkType = builder.watermarkType;
        this.wuyingKeeper = builder.wuyingKeeper;
        this.wyAssistant = builder.wyAssistant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenterPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminAccess
     */
    public String getAdminAccess() {
        return this.adminAccess;
    }

    /**
     * @return appContentProtection
     */
    public String getAppContentProtection() {
        return this.appContentProtection;
    }

    /**
     * @return authorizeAccessPolicyRule
     */
    public java.util.List<AuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRule() {
        return this.authorizeAccessPolicyRule;
    }

    /**
     * @return authorizeSecurityPolicyRule
     */
    public java.util.List<AuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRule() {
        return this.authorizeSecurityPolicyRule;
    }

    /**
     * @return businessType
     */
    public Integer getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cameraRedirect
     */
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    /**
     * @return clientType
     */
    public java.util.List<ClientType> getClientType() {
        return this.clientType;
    }

    /**
     * @return clipboard
     */
    public String getClipboard() {
        return this.clipboard;
    }

    /**
     * @return colorEnhancement
     */
    public String getColorEnhancement() {
        return this.colorEnhancement;
    }

    /**
     * @return cpuDownGradeDuration
     */
    public Integer getCpuDownGradeDuration() {
        return this.cpuDownGradeDuration;
    }

    /**
     * @return cpuProcessors
     */
    public java.util.List<String> getCpuProcessors() {
        return this.cpuProcessors;
    }

    /**
     * @return cpuProtectedMode
     */
    public String getCpuProtectedMode() {
        return this.cpuProtectedMode;
    }

    /**
     * @return cpuRateLimit
     */
    public Integer getCpuRateLimit() {
        return this.cpuRateLimit;
    }

    /**
     * @return cpuSampleDuration
     */
    public Integer getCpuSampleDuration() {
        return this.cpuSampleDuration;
    }

    /**
     * @return cpuSingleRateLimit
     */
    public Integer getCpuSingleRateLimit() {
        return this.cpuSingleRateLimit;
    }

    /**
     * @return deviceConnectHint
     */
    public String getDeviceConnectHint() {
        return this.deviceConnectHint;
    }

    /**
     * @return deviceRedirects
     */
    public java.util.List<DeviceRedirects> getDeviceRedirects() {
        return this.deviceRedirects;
    }

    /**
     * @return deviceRules
     */
    public java.util.List<DeviceRules> getDeviceRules() {
        return this.deviceRules;
    }

    /**
     * @return disconnectKeepSession
     */
    public String getDisconnectKeepSession() {
        return this.disconnectKeepSession;
    }

    /**
     * @return disconnectKeepSessionTime
     */
    public Integer getDisconnectKeepSessionTime() {
        return this.disconnectKeepSessionTime;
    }

    /**
     * @return displayMode
     */
    public String getDisplayMode() {
        return this.displayMode;
    }

    /**
     * @return domainResolveRule
     */
    public java.util.List<DomainResolveRule> getDomainResolveRule() {
        return this.domainResolveRule;
    }

    /**
     * @return domainResolveRuleType
     */
    public String getDomainResolveRuleType() {
        return this.domainResolveRuleType;
    }

    /**
     * @return enableSessionRateLimiting
     */
    public String getEnableSessionRateLimiting() {
        return this.enableSessionRateLimiting;
    }

    /**
     * @return endUserApplyAdminCoordinate
     */
    public String getEndUserApplyAdminCoordinate() {
        return this.endUserApplyAdminCoordinate;
    }

    /**
     * @return endUserGroupCoordinate
     */
    public String getEndUserGroupCoordinate() {
        return this.endUserGroupCoordinate;
    }

    /**
     * @return fileMigrate
     */
    public String getFileMigrate() {
        return this.fileMigrate;
    }

    /**
     * @return gpuAcceleration
     */
    public String getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    /**
     * @return html5FileTransfer
     */
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    /**
     * @return internetCommunicationProtocol
     */
    public String getInternetCommunicationProtocol() {
        return this.internetCommunicationProtocol;
    }

    /**
     * @return internetPrinter
     */
    public String getInternetPrinter() {
        return this.internetPrinter;
    }

    /**
     * @return localDrive
     */
    public String getLocalDrive() {
        return this.localDrive;
    }

    /**
     * @return maxReconnectTime
     */
    public Integer getMaxReconnectTime() {
        return this.maxReconnectTime;
    }

    /**
     * @return memoryDownGradeDuration
     */
    public Integer getMemoryDownGradeDuration() {
        return this.memoryDownGradeDuration;
    }

    /**
     * @return memoryProcessors
     */
    public java.util.List<String> getMemoryProcessors() {
        return this.memoryProcessors;
    }

    /**
     * @return memoryProtectedMode
     */
    public String getMemoryProtectedMode() {
        return this.memoryProtectedMode;
    }

    /**
     * @return memoryRateLimit
     */
    public Integer getMemoryRateLimit() {
        return this.memoryRateLimit;
    }

    /**
     * @return memorySampleDuration
     */
    public Integer getMemorySampleDuration() {
        return this.memorySampleDuration;
    }

    /**
     * @return memorySingleRateLimit
     */
    public Integer getMemorySingleRateLimit() {
        return this.memorySingleRateLimit;
    }

    /**
     * @return mobileRestart
     */
    public String getMobileRestart() {
        return this.mobileRestart;
    }

    /**
     * @return mobileShutdown
     */
    public String getMobileShutdown() {
        return this.mobileShutdown;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return netRedirect
     */
    public String getNetRedirect() {
        return this.netRedirect;
    }

    /**
     * @return netRedirectRule
     */
    public java.util.List<NetRedirectRule> getNetRedirectRule() {
        return this.netRedirectRule;
    }

    /**
     * @return noOperationDisconnect
     */
    public String getNoOperationDisconnect() {
        return this.noOperationDisconnect;
    }

    /**
     * @return noOperationDisconnectTime
     */
    public Integer getNoOperationDisconnectTime() {
        return this.noOperationDisconnectTime;
    }

    /**
     * @return printerRedirect
     */
    public String getPrinterRedirect() {
        return this.printerRedirect;
    }

    /**
     * @return qualityEnhancement
     */
    public String getQualityEnhancement() {
        return this.qualityEnhancement;
    }

    /**
     * @return recordEventDuration
     */
    public Integer getRecordEventDuration() {
        return this.recordEventDuration;
    }

    /**
     * @return recordEventFilePaths
     */
    public java.util.List<String> getRecordEventFilePaths() {
        return this.recordEventFilePaths;
    }

    /**
     * @return recordEventRegisters
     */
    public java.util.List<String> getRecordEventRegisters() {
        return this.recordEventRegisters;
    }

    /**
     * @return recordEvents
     */
    public java.util.List<String> getRecordEvents() {
        return this.recordEvents;
    }

    /**
     * @return recording
     */
    public String getRecording() {
        return this.recording;
    }

    /**
     * @return recordingAudio
     */
    public String getRecordingAudio() {
        return this.recordingAudio;
    }

    /**
     * @return recordingDuration
     */
    public Integer getRecordingDuration() {
        return this.recordingDuration;
    }

    /**
     * @return recordingEndTime
     */
    public String getRecordingEndTime() {
        return this.recordingEndTime;
    }

    /**
     * @return recordingExpires
     */
    public Integer getRecordingExpires() {
        return this.recordingExpires;
    }

    /**
     * @return recordingFps
     */
    public String getRecordingFps() {
        return this.recordingFps;
    }

    /**
     * @return recordingStartTime
     */
    public String getRecordingStartTime() {
        return this.recordingStartTime;
    }

    /**
     * @return recordingUserNotify
     */
    public String getRecordingUserNotify() {
        return this.recordingUserNotify;
    }

    /**
     * @return recordingUserNotifyMessage
     */
    public String getRecordingUserNotifyMessage() {
        return this.recordingUserNotifyMessage;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remoteCoordinate
     */
    public String getRemoteCoordinate() {
        return this.remoteCoordinate;
    }

    /**
     * @return resetDesktop
     */
    public String getResetDesktop() {
        return this.resetDesktop;
    }

    /**
     * @return resolutionHeight
     */
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    /**
     * @return resolutionModel
     */
    public String getResolutionModel() {
        return this.resolutionModel;
    }

    /**
     * @return resolutionWidth
     */
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return safeMenu
     */
    public String getSafeMenu() {
        return this.safeMenu;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return scopeValue
     */
    public java.util.List<String> getScopeValue() {
        return this.scopeValue;
    }

    /**
     * @return sessionMaxRateKbps
     */
    public Integer getSessionMaxRateKbps() {
        return this.sessionMaxRateKbps;
    }

    /**
     * @return smoothEnhancement
     */
    public String getSmoothEnhancement() {
        return this.smoothEnhancement;
    }

    /**
     * @return statusMonitor
     */
    public String getStatusMonitor() {
        return this.statusMonitor;
    }

    /**
     * @return streamingMode
     */
    public String getStreamingMode() {
        return this.streamingMode;
    }

    /**
     * @return targetFps
     */
    public Integer getTargetFps() {
        return this.targetFps;
    }

    /**
     * @return taskbar
     */
    public String getTaskbar() {
        return this.taskbar;
    }

    /**
     * @return usbRedirect
     */
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    /**
     * @return usbSupplyRedirectRule
     */
    public java.util.List<UsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
        return this.usbSupplyRedirectRule;
    }

    /**
     * @return videoEncAvgKbps
     */
    public Integer getVideoEncAvgKbps() {
        return this.videoEncAvgKbps;
    }

    /**
     * @return videoEncMaxQP
     */
    public Integer getVideoEncMaxQP() {
        return this.videoEncMaxQP;
    }

    /**
     * @return videoEncMinQP
     */
    public Integer getVideoEncMinQP() {
        return this.videoEncMinQP;
    }

    /**
     * @return videoEncPeakKbps
     */
    public Integer getVideoEncPeakKbps() {
        return this.videoEncPeakKbps;
    }

    /**
     * @return videoEncPolicy
     */
    public String getVideoEncPolicy() {
        return this.videoEncPolicy;
    }

    /**
     * @return videoRedirect
     */
    public String getVideoRedirect() {
        return this.videoRedirect;
    }

    /**
     * @return visualQuality
     */
    public String getVisualQuality() {
        return this.visualQuality;
    }

    /**
     * @return watermark
     */
    public String getWatermark() {
        return this.watermark;
    }

    /**
     * @return watermarkAntiCam
     */
    public String getWatermarkAntiCam() {
        return this.watermarkAntiCam;
    }

    /**
     * @return watermarkColor
     */
    public Integer getWatermarkColor() {
        return this.watermarkColor;
    }

    /**
     * @return watermarkColumnAmount
     */
    public Integer getWatermarkColumnAmount() {
        return this.watermarkColumnAmount;
    }

    /**
     * @return watermarkCustomText
     */
    public String getWatermarkCustomText() {
        return this.watermarkCustomText;
    }

    /**
     * @return watermarkDegree
     */
    public Double getWatermarkDegree() {
        return this.watermarkDegree;
    }

    /**
     * @return watermarkFontSize
     */
    public Integer getWatermarkFontSize() {
        return this.watermarkFontSize;
    }

    /**
     * @return watermarkFontStyle
     */
    public String getWatermarkFontStyle() {
        return this.watermarkFontStyle;
    }

    /**
     * @return watermarkPower
     */
    public String getWatermarkPower() {
        return this.watermarkPower;
    }

    /**
     * @return watermarkRowAmount
     */
    public Integer getWatermarkRowAmount() {
        return this.watermarkRowAmount;
    }

    /**
     * @return watermarkSecurity
     */
    public String getWatermarkSecurity() {
        return this.watermarkSecurity;
    }

    /**
     * @return watermarkTransparencyValue
     */
    public Integer getWatermarkTransparencyValue() {
        return this.watermarkTransparencyValue;
    }

    /**
     * @return watermarkType
     */
    public String getWatermarkType() {
        return this.watermarkType;
    }

    /**
     * @return wuyingKeeper
     */
    public String getWuyingKeeper() {
        return this.wuyingKeeper;
    }

    /**
     * @return wyAssistant
     */
    public String getWyAssistant() {
        return this.wyAssistant;
    }

    public static final class Builder extends Request.Builder<CreateCenterPolicyRequest, Builder> {
        private String adminAccess; 
        private String appContentProtection; 
        private java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule; 
        private java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule; 
        private Integer businessType; 
        private String cameraRedirect; 
        private java.util.List<ClientType> clientType; 
        private String clipboard; 
        private String colorEnhancement; 
        private Integer cpuDownGradeDuration; 
        private java.util.List<String> cpuProcessors; 
        private String cpuProtectedMode; 
        private Integer cpuRateLimit; 
        private Integer cpuSampleDuration; 
        private Integer cpuSingleRateLimit; 
        private String deviceConnectHint; 
        private java.util.List<DeviceRedirects> deviceRedirects; 
        private java.util.List<DeviceRules> deviceRules; 
        private String disconnectKeepSession; 
        private Integer disconnectKeepSessionTime; 
        private String displayMode; 
        private java.util.List<DomainResolveRule> domainResolveRule; 
        private String domainResolveRuleType; 
        private String enableSessionRateLimiting; 
        private String endUserApplyAdminCoordinate; 
        private String endUserGroupCoordinate; 
        private String fileMigrate; 
        private String gpuAcceleration; 
        private String html5FileTransfer; 
        private String internetCommunicationProtocol; 
        private String internetPrinter; 
        private String localDrive; 
        private Integer maxReconnectTime; 
        private Integer memoryDownGradeDuration; 
        private java.util.List<String> memoryProcessors; 
        private String memoryProtectedMode; 
        private Integer memoryRateLimit; 
        private Integer memorySampleDuration; 
        private Integer memorySingleRateLimit; 
        private String mobileRestart; 
        private String mobileShutdown; 
        private String name; 
        private String netRedirect; 
        private java.util.List<NetRedirectRule> netRedirectRule; 
        private String noOperationDisconnect; 
        private Integer noOperationDisconnectTime; 
        private String printerRedirect; 
        private String qualityEnhancement; 
        private Integer recordEventDuration; 
        private java.util.List<String> recordEventFilePaths; 
        private java.util.List<String> recordEventRegisters; 
        private java.util.List<String> recordEvents; 
        private String recording; 
        private String recordingAudio; 
        private Integer recordingDuration; 
        private String recordingEndTime; 
        private Integer recordingExpires; 
        private String recordingFps; 
        private String recordingStartTime; 
        private String recordingUserNotify; 
        private String recordingUserNotifyMessage; 
        private String regionId; 
        private String remoteCoordinate; 
        private String resetDesktop; 
        private Integer resolutionHeight; 
        private String resolutionModel; 
        private Integer resolutionWidth; 
        private String resourceType; 
        private String safeMenu; 
        private String scope; 
        private java.util.List<String> scopeValue; 
        private Integer sessionMaxRateKbps; 
        private String smoothEnhancement; 
        private String statusMonitor; 
        private String streamingMode; 
        private Integer targetFps; 
        private String taskbar; 
        private String usbRedirect; 
        private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule; 
        private Integer videoEncAvgKbps; 
        private Integer videoEncMaxQP; 
        private Integer videoEncMinQP; 
        private Integer videoEncPeakKbps; 
        private String videoEncPolicy; 
        private String videoRedirect; 
        private String visualQuality; 
        private String watermark; 
        private String watermarkAntiCam; 
        private Integer watermarkColor; 
        private Integer watermarkColumnAmount; 
        private String watermarkCustomText; 
        private Double watermarkDegree; 
        private Integer watermarkFontSize; 
        private String watermarkFontStyle; 
        private String watermarkPower; 
        private Integer watermarkRowAmount; 
        private String watermarkSecurity; 
        private Integer watermarkTransparencyValue; 
        private String watermarkType; 
        private String wuyingKeeper; 
        private String wyAssistant; 

        private Builder() {
            super();
        } 

        private Builder(CreateCenterPolicyRequest request) {
            super(request);
            this.adminAccess = request.adminAccess;
            this.appContentProtection = request.appContentProtection;
            this.authorizeAccessPolicyRule = request.authorizeAccessPolicyRule;
            this.authorizeSecurityPolicyRule = request.authorizeSecurityPolicyRule;
            this.businessType = request.businessType;
            this.cameraRedirect = request.cameraRedirect;
            this.clientType = request.clientType;
            this.clipboard = request.clipboard;
            this.colorEnhancement = request.colorEnhancement;
            this.cpuDownGradeDuration = request.cpuDownGradeDuration;
            this.cpuProcessors = request.cpuProcessors;
            this.cpuProtectedMode = request.cpuProtectedMode;
            this.cpuRateLimit = request.cpuRateLimit;
            this.cpuSampleDuration = request.cpuSampleDuration;
            this.cpuSingleRateLimit = request.cpuSingleRateLimit;
            this.deviceConnectHint = request.deviceConnectHint;
            this.deviceRedirects = request.deviceRedirects;
            this.deviceRules = request.deviceRules;
            this.disconnectKeepSession = request.disconnectKeepSession;
            this.disconnectKeepSessionTime = request.disconnectKeepSessionTime;
            this.displayMode = request.displayMode;
            this.domainResolveRule = request.domainResolveRule;
            this.domainResolveRuleType = request.domainResolveRuleType;
            this.enableSessionRateLimiting = request.enableSessionRateLimiting;
            this.endUserApplyAdminCoordinate = request.endUserApplyAdminCoordinate;
            this.endUserGroupCoordinate = request.endUserGroupCoordinate;
            this.fileMigrate = request.fileMigrate;
            this.gpuAcceleration = request.gpuAcceleration;
            this.html5FileTransfer = request.html5FileTransfer;
            this.internetCommunicationProtocol = request.internetCommunicationProtocol;
            this.internetPrinter = request.internetPrinter;
            this.localDrive = request.localDrive;
            this.maxReconnectTime = request.maxReconnectTime;
            this.memoryDownGradeDuration = request.memoryDownGradeDuration;
            this.memoryProcessors = request.memoryProcessors;
            this.memoryProtectedMode = request.memoryProtectedMode;
            this.memoryRateLimit = request.memoryRateLimit;
            this.memorySampleDuration = request.memorySampleDuration;
            this.memorySingleRateLimit = request.memorySingleRateLimit;
            this.mobileRestart = request.mobileRestart;
            this.mobileShutdown = request.mobileShutdown;
            this.name = request.name;
            this.netRedirect = request.netRedirect;
            this.netRedirectRule = request.netRedirectRule;
            this.noOperationDisconnect = request.noOperationDisconnect;
            this.noOperationDisconnectTime = request.noOperationDisconnectTime;
            this.printerRedirect = request.printerRedirect;
            this.qualityEnhancement = request.qualityEnhancement;
            this.recordEventDuration = request.recordEventDuration;
            this.recordEventFilePaths = request.recordEventFilePaths;
            this.recordEventRegisters = request.recordEventRegisters;
            this.recordEvents = request.recordEvents;
            this.recording = request.recording;
            this.recordingAudio = request.recordingAudio;
            this.recordingDuration = request.recordingDuration;
            this.recordingEndTime = request.recordingEndTime;
            this.recordingExpires = request.recordingExpires;
            this.recordingFps = request.recordingFps;
            this.recordingStartTime = request.recordingStartTime;
            this.recordingUserNotify = request.recordingUserNotify;
            this.recordingUserNotifyMessage = request.recordingUserNotifyMessage;
            this.regionId = request.regionId;
            this.remoteCoordinate = request.remoteCoordinate;
            this.resetDesktop = request.resetDesktop;
            this.resolutionHeight = request.resolutionHeight;
            this.resolutionModel = request.resolutionModel;
            this.resolutionWidth = request.resolutionWidth;
            this.resourceType = request.resourceType;
            this.safeMenu = request.safeMenu;
            this.scope = request.scope;
            this.scopeValue = request.scopeValue;
            this.sessionMaxRateKbps = request.sessionMaxRateKbps;
            this.smoothEnhancement = request.smoothEnhancement;
            this.statusMonitor = request.statusMonitor;
            this.streamingMode = request.streamingMode;
            this.targetFps = request.targetFps;
            this.taskbar = request.taskbar;
            this.usbRedirect = request.usbRedirect;
            this.usbSupplyRedirectRule = request.usbSupplyRedirectRule;
            this.videoEncAvgKbps = request.videoEncAvgKbps;
            this.videoEncMaxQP = request.videoEncMaxQP;
            this.videoEncMinQP = request.videoEncMinQP;
            this.videoEncPeakKbps = request.videoEncPeakKbps;
            this.videoEncPolicy = request.videoEncPolicy;
            this.videoRedirect = request.videoRedirect;
            this.visualQuality = request.visualQuality;
            this.watermark = request.watermark;
            this.watermarkAntiCam = request.watermarkAntiCam;
            this.watermarkColor = request.watermarkColor;
            this.watermarkColumnAmount = request.watermarkColumnAmount;
            this.watermarkCustomText = request.watermarkCustomText;
            this.watermarkDegree = request.watermarkDegree;
            this.watermarkFontSize = request.watermarkFontSize;
            this.watermarkFontStyle = request.watermarkFontStyle;
            this.watermarkPower = request.watermarkPower;
            this.watermarkRowAmount = request.watermarkRowAmount;
            this.watermarkSecurity = request.watermarkSecurity;
            this.watermarkTransparencyValue = request.watermarkTransparencyValue;
            this.watermarkType = request.watermarkType;
            this.wuyingKeeper = request.wuyingKeeper;
            this.wyAssistant = request.wyAssistant;
        } 

        /**
         * <p>Specifies whether to grant the admin permissions to end users.</p>
         * <blockquote>
         * <p> This parameter is in private preview and only available to specific users.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>allow: forcibly grants admin permissions.</li>
         * <li>deny: forcibly rejects granting admin permissions.</li>
         * <li>inherited: inherits the admin permissions from the user dimension.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        public Builder adminAccess(String adminAccess) {
            this.putQueryParameter("AdminAccess", adminAccess);
            this.adminAccess = adminAccess;
            return this;
        }

        /**
         * <p>The anti-screenshot policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default): disables anti-screenshot.</li>
         * <li>on: enables anti-screenshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder appContentProtection(String appContentProtection) {
            this.putQueryParameter("AppContentProtection", appContentProtection);
            this.appContentProtection = appContentProtection;
            return this;
        }

        /**
         * <p>The client IP address whitelists that you want to add. Once an IP address whitelist is configured, end users can only access cloud computers from the IP addresses listed in it.</p>
         */
        public Builder authorizeAccessPolicyRule(java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
            this.putQueryParameter("AuthorizeAccessPolicyRule", authorizeAccessPolicyRule);
            this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
            return this;
        }

        /**
         * <p>The security group rule.</p>
         */
        public Builder authorizeSecurityPolicyRule(java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
            this.putQueryParameter("AuthorizeSecurityPolicyRule", authorizeSecurityPolicyRule);
            this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
            return this;
        }

        /**
         * <p>The business type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: public cloud</li>
         * <li>8: commercial edition.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder businessType(Integer businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The on-premises camera redirection policy. This parameter only applies if DeviceRedirects does not include an on-premises camera redirection policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>deviceRedirect: enables device redirection.</li>
         * <li>off: disables device redirection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder cameraRedirect(String cameraRedirect) {
            this.putQueryParameter("CameraRedirect", cameraRedirect);
            this.cameraRedirect = cameraRedirect;
            return this;
        }

        /**
         * <p>The types of Alibaba Cloud Workspace clients that end users can use to connect to cloud computers.</p>
         */
        public Builder clientType(java.util.List<ClientType> clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The read/write permissions on the clipboard.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: specifies one-way transfer You can copy files only from on-premises devices to cloud computers.</li>
         * <li>readwrite: specifies two-way transfer. You can copy files between on-premises devices and cloud computers.</li>
         * <li>write: specifies one-way transfer. You can only copy files from cloud computers to on-premises devices.</li>
         * <li>off (default): disables all transfers, both one-way and two-way. Files cannot be copied directly between on-premises devices and cloud computers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder clipboard(String clipboard) {
            this.putQueryParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * <p>Specifies whether to enable color enhancement for design and 3D applications.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t enable color enhancement for design and 3D applications.</li>
         * <li>on: enables color enhancement for design and 3D applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder colorEnhancement(String colorEnhancement) {
            this.putQueryParameter("ColorEnhancement", colorEnhancement);
            this.colorEnhancement = colorEnhancement;
            return this;
        }

        /**
         * <p>The CPU underclocking duration. Valid values: 30 to 120. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder cpuDownGradeDuration(Integer cpuDownGradeDuration) {
            this.putQueryParameter("CpuDownGradeDuration", cpuDownGradeDuration);
            this.cpuDownGradeDuration = cpuDownGradeDuration;
            return this;
        }

        /**
         * <p>The CPU processors.</p>
         */
        public Builder cpuProcessors(java.util.List<String> cpuProcessors) {
            this.putQueryParameter("CpuProcessors", cpuProcessors);
            this.cpuProcessors = cpuProcessors;
            return this;
        }

        /**
         * <p>The CPU spike protection policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: disables CPU spike protection.</li>
         * <li>on: enables CPU spike protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder cpuProtectedMode(String cpuProtectedMode) {
            this.putQueryParameter("CpuProtectedMode", cpuProtectedMode);
            this.cpuProtectedMode = cpuProtectedMode;
            return this;
        }

        /**
         * <p>The overall CPU usage. Valid values: 70 to 90. Unit: percentage (%).</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder cpuRateLimit(Integer cpuRateLimit) {
            this.putQueryParameter("CpuRateLimit", cpuRateLimit);
            this.cpuRateLimit = cpuRateLimit;
            return this;
        }

        /**
         * <p>The overall CPU sampling duration. Valid values: 10 to 60. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder cpuSampleDuration(Integer cpuSampleDuration) {
            this.putQueryParameter("CpuSampleDuration", cpuSampleDuration);
            this.cpuSampleDuration = cpuSampleDuration;
            return this;
        }

        /**
         * <p>The single-CPU usage. Valid values: 70 to 100. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder cpuSingleRateLimit(Integer cpuSingleRateLimit) {
            this.putQueryParameter("CpuSingleRateLimit", cpuSingleRateLimit);
            this.cpuSingleRateLimit = cpuSingleRateLimit;
            return this;
        }

        /**
         * <p>Specifies whether to display the peripheral connection prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder deviceConnectHint(String deviceConnectHint) {
            this.putQueryParameter("DeviceConnectHint", deviceConnectHint);
            this.deviceConnectHint = deviceConnectHint;
            return this;
        }

        /**
         * <p>The device redirection rules.</p>
         */
        public Builder deviceRedirects(java.util.List<DeviceRedirects> deviceRedirects) {
            this.putQueryParameter("DeviceRedirects", deviceRedirects);
            this.deviceRedirects = deviceRedirects;
            return this;
        }

        /**
         * <p>The custom peripheral rules.</p>
         */
        public Builder deviceRules(java.util.List<DeviceRules> deviceRules) {
            this.putQueryParameter("DeviceRules", deviceRules);
            this.deviceRules = deviceRules;
            return this;
        }

        /**
         * <p>Specifies whether to retain the session upon disconnection.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>customTime: retains the session for a specified time period.</li>
         * <li>persistent: retains the session permanently.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customTime</p>
         */
        public Builder disconnectKeepSession(String disconnectKeepSession) {
            this.putQueryParameter("DisconnectKeepSession", disconnectKeepSession);
            this.disconnectKeepSession = disconnectKeepSession;
            return this;
        }

        /**
         * <p>The retention period of the session after disconnection. Valid values: 30 to 7200. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder disconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
            this.putQueryParameter("DisconnectKeepSessionTime", disconnectKeepSessionTime);
            this.disconnectKeepSessionTime = disconnectKeepSessionTime;
            return this;
        }

        /**
         * <p>The display mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>clientCustom: suitable for user-defined scenarios.</li>
         * <li>adminOffice: suitable for daily office scenarios.</li>
         * <li>adminDesign: suitable for design and 3D application scenarios.</li>
         * <li>adminCustom: suitable for admin-customized scenarios.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clientCustom</p>
         */
        public Builder displayMode(String displayMode) {
            this.putQueryParameter("DisplayMode", displayMode);
            this.displayMode = displayMode;
            return this;
        }

        /**
         * <p>The domain resolution policies.</p>
         */
        public Builder domainResolveRule(java.util.List<DomainResolveRule> domainResolveRule) {
            this.putQueryParameter("DomainResolveRule", domainResolveRule);
            this.domainResolveRule = domainResolveRule;
            return this;
        }

        /**
         * <p>Specifies whether to enforce the domain resolution policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: disables the domain resolution policy.</li>
         * <li>on: enables the domain resolution policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder domainResolveRuleType(String domainResolveRuleType) {
            this.putQueryParameter("DomainResolveRuleType", domainResolveRuleType);
            this.domainResolveRuleType = domainResolveRuleType;
            return this;
        }

        /**
         * <p>Specifies whether to enforce the peak bandwidth limit for sessions.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t enforce the peak bandwidth limit for sessions.</li>
         * <li>on: enforces the peak bandwidth limit for sessions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder enableSessionRateLimiting(String enableSessionRateLimiting) {
            this.putQueryParameter("EnableSessionRateLimiting", enableSessionRateLimiting);
            this.enableSessionRateLimiting = enableSessionRateLimiting;
            return this;
        }

        /**
         * <p>Specifies whether to enable end users to request administrator help.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: disables end users to request administrator help.</li>
         * <li>on: enables end users to request administrator help.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
            this.putQueryParameter("EndUserApplyAdminCoordinate", endUserApplyAdminCoordinate);
            this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
            return this;
        }

        /**
         * <p>Specifies whether to allow end users in the same office network to share cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t allow end users in the same office network to share cloud computers.</li>
         * <li>on: allows end users in the same office network to share cloud computers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
            this.putQueryParameter("EndUserGroupCoordinate", endUserGroupCoordinate);
            this.endUserGroupCoordinate = endUserGroupCoordinate;
            return this;
        }

        /**
         * <p>Specifies whether to enable file transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder fileMigrate(String fileMigrate) {
            this.putQueryParameter("FileMigrate", fileMigrate);
            this.fileMigrate = fileMigrate;
            return this;
        }

        /**
         * <p>Specifies whether to enable image quality control. This feature is highly recommended for professional design scenarios where computer performance and user experience are critical.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t enable image quality control.</li>
         * <li>on: enables image quality control.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder gpuAcceleration(String gpuAcceleration) {
            this.putQueryParameter("GpuAcceleration", gpuAcceleration);
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }

        /**
         * <p>The file transfer feature on the web client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>all: File upload and download are supported.</li>
         * <li>download: Only file download is supported.</li>
         * <li>upload: Only file upload is supported.</li>
         * <li>off (default): File upload and download are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder html5FileTransfer(String html5FileTransfer) {
            this.putQueryParameter("Html5FileTransfer", html5FileTransfer);
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }

        /**
         * <p>The protocol for network communication.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>tcp: TCP is used when UDP/AST is restricted.</li>
         * <li>rtc: AST is used for high-frequency audio and video streaming.</li>
         * <li>auto: UTO is used to enable automatic switch between AST and UDP modes based on desktop content.</li>
         * <li>both: UDP is used for office and HD graphic design use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>both</p>
         */
        public Builder internetCommunicationProtocol(String internetCommunicationProtocol) {
            this.putQueryParameter("InternetCommunicationProtocol", internetCommunicationProtocol);
            this.internetCommunicationProtocol = internetCommunicationProtocol;
            return this;
        }

        /**
         * InternetPrinter.
         */
        public Builder internetPrinter(String internetPrinter) {
            this.putQueryParameter("InternetPrinter", internetPrinter);
            this.internetPrinter = internetPrinter;
            return this;
        }

        /**
         * <p>The read/write permissions on the on-premises drive.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: read-only. Cloud computers support on-premises disk mapping, but only for reading (copying) files—not modifying them.</li>
         * <li>readwrite: read and write. Cloud computers support on-premises disk mapping, allowing you to read (copy) and write (modify) on-premises files.</li>
         * <li>off (default): none. Cloud computers don&quot;t support on-premises disk mapping.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder localDrive(String localDrive) {
            this.putQueryParameter("LocalDrive", localDrive);
            this.localDrive = localDrive;
            return this;
        }

        /**
         * <p>The maximum duration to retry reconnecting to cloud computers after an unexpected disconnection (non-human causes). Valid values: 30 to 7200. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder maxReconnectTime(Integer maxReconnectTime) {
            this.putQueryParameter("MaxReconnectTime", maxReconnectTime);
            this.maxReconnectTime = maxReconnectTime;
            return this;
        }

        /**
         * <p>The memory underclocking duration per process. Valid values: 30 to 120. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder memoryDownGradeDuration(Integer memoryDownGradeDuration) {
            this.putQueryParameter("MemoryDownGradeDuration", memoryDownGradeDuration);
            this.memoryDownGradeDuration = memoryDownGradeDuration;
            return this;
        }

        /**
         * <p>The memory processors.</p>
         */
        public Builder memoryProcessors(java.util.List<String> memoryProcessors) {
            this.putQueryParameter("MemoryProcessors", memoryProcessors);
            this.memoryProcessors = memoryProcessors;
            return this;
        }

        /**
         * <p>The memory spike protection policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: disables memory spike protection.</li>
         * <li>on: enables memory spike protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder memoryProtectedMode(String memoryProtectedMode) {
            this.putQueryParameter("MemoryProtectedMode", memoryProtectedMode);
            this.memoryProtectedMode = memoryProtectedMode;
            return this;
        }

        /**
         * <p>The overall memory usage. Valid values: 70 to 90. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder memoryRateLimit(Integer memoryRateLimit) {
            this.putQueryParameter("MemoryRateLimit", memoryRateLimit);
            this.memoryRateLimit = memoryRateLimit;
            return this;
        }

        /**
         * <p>The overall memory sampling duration. Valid values: 30 to 60. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder memorySampleDuration(Integer memorySampleDuration) {
            this.putQueryParameter("MemorySampleDuration", memorySampleDuration);
            this.memorySampleDuration = memorySampleDuration;
            return this;
        }

        /**
         * <p>The memory usage per process. Valid values: 30 to 60. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder memorySingleRateLimit(Integer memorySingleRateLimit) {
            this.putQueryParameter("MemorySingleRateLimit", memorySingleRateLimit);
            this.memorySingleRateLimit = memorySingleRateLimit;
            return this;
        }

        /**
         * <p>Specifies whether to display the Restart button in the DesktopAssistant menu when end users connect to cloud computers from Android clients.</p>
         * <blockquote>
         * <p> This feature applies to only mobile clients of version 7.4.0 or later.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t display the Restart button in the DesktopAssistant menu.</li>
         * <li>on: displays the Restart button in the DesktopAssistant menu.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder mobileRestart(String mobileRestart) {
            this.putQueryParameter("MobileRestart", mobileRestart);
            this.mobileRestart = mobileRestart;
            return this;
        }

        /**
         * <p>Specifies whether to display the Stop button in the DesktopAssistant menu when end users connect to cloud computers from Android clients.</p>
         * <blockquote>
         * <p> This feature applies to only mobile clients of version 7.4.0 or later.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t display the Stop button in the DesktopAssistant menu.</li>
         * <li>on: displays the Stop button in the DesktopAssistant menu.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder mobileShutdown(String mobileShutdown) {
            this.putQueryParameter("MobileShutdown", mobileShutdown);
            this.mobileShutdown = mobileShutdown;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicyGroupName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The network redirection policy.</p>
         * <blockquote>
         * <p> This parameter is in private preview and only available to specific users.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>all: enables network redirection globally.</li>
         * <li>off (default): disables network redirection.</li>
         * <li>on: enables the whitelist mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder netRedirect(String netRedirect) {
            this.putQueryParameter("NetRedirect", netRedirect);
            this.netRedirect = netRedirect;
            return this;
        }

        /**
         * <p>The network redirection policy.</p>
         * <blockquote>
         * <p> This parameter is in private preview and only available to specific users.</p>
         * </blockquote>
         */
        public Builder netRedirectRule(java.util.List<NetRedirectRule> netRedirectRule) {
            this.putQueryParameter("NetRedirectRule", netRedirectRule);
            this.netRedirectRule = netRedirectRule;
            return this;
        }

        /**
         * <p>Specifies whether to enforce a disconnection upon inactivity.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t enforce a disconnection upon inactivity.</li>
         * <li>on: enforces a disconnection upon inactivity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder noOperationDisconnect(String noOperationDisconnect) {
            this.putQueryParameter("NoOperationDisconnect", noOperationDisconnect);
            this.noOperationDisconnect = noOperationDisconnect;
            return this;
        }

        /**
         * <p>The duration of disconnection after inactivity. Valid values: 120 to 7200. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder noOperationDisconnectTime(Integer noOperationDisconnectTime) {
            this.putQueryParameter("NoOperationDisconnectTime", noOperationDisconnectTime);
            this.noOperationDisconnectTime = noOperationDisconnectTime;
            return this;
        }

        /**
         * <p>The printer redirection policy. This parameter only applies if DeviceRedirects does not include a printer redirection policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>deviceRedirect (default):enables device redirection.</li>
         * <li>usbRedirect: enables USB redirection.</li>
         * <li>off: disables any type of redirection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder printerRedirect(String printerRedirect) {
            this.putQueryParameter("PrinterRedirect", printerRedirect);
            this.printerRedirect = printerRedirect;
            return this;
        }

        /**
         * <p>Specifies whether to enable image quality enhancement for design and 3D applications.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t enable image quality enhancement for design and 3D applications.</li>
         * <li>on: enables image quality enhancement for design and 3D applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder qualityEnhancement(String qualityEnhancement) {
            this.putQueryParameter("QualityEnhancement", qualityEnhancement);
            this.qualityEnhancement = qualityEnhancement;
            return this;
        }

        /**
         * <p>The duration of screen recording after the specified event is detected. Unit: minutes. Valid values: 10 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder recordEventDuration(Integer recordEventDuration) {
            this.putQueryParameter("RecordEventDuration", recordEventDuration);
            this.recordEventDuration = recordEventDuration;
            return this;
        }

        /**
         * <p>The absolute paths to screen recording files.</p>
         */
        public Builder recordEventFilePaths(java.util.List<String> recordEventFilePaths) {
            this.putQueryParameter("RecordEventFilePaths", recordEventFilePaths);
            this.recordEventFilePaths = recordEventFilePaths;
            return this;
        }

        /**
         * <p>The absolute paths to screen recording registries.</p>
         */
        public Builder recordEventRegisters(java.util.List<String> recordEventRegisters) {
            this.putQueryParameter("RecordEventRegisters", recordEventRegisters);
            this.recordEventRegisters = recordEventRegisters;
            return this;
        }

        /**
         * <p>The events that trigger screen recording.</p>
         */
        public Builder recordEvents(java.util.List<String> recordEvents) {
            this.putQueryParameter("RecordEvents", recordEvents);
            this.recordEvents = recordEvents;
            return this;
        }

        /**
         * <p>The screen recording policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>period: Screen recording occurs at set intervals.</li>
         * <li>session: Screen recording is limited to sessions only.</li>
         * <li>off: Screen recording is disabled.</li>
         * <li>alltime: Screen recording is always enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder recording(String recording) {
            this.putQueryParameter("Recording", recording);
            this.recording = recording;
            return this;
        }

        /**
         * <p>Specifies whether to record audio files generated on cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t record audio files generated on cloud computers.</li>
         * <li>on: records audio files generated on cloud computers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder recordingAudio(String recordingAudio) {
            this.putQueryParameter("RecordingAudio", recordingAudio);
            this.recordingAudio = recordingAudio;
            return this;
        }

        /**
         * <p>The frame rate of screen recording. Screen recordings are split based on the specified duration and uploaded to Object Storage Service (OSS) buckets. If a file reaches 300 MB, the system prioritizes rolling updates for that file. Valid values: 10 to 60</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder recordingDuration(Integer recordingDuration) {
            this.putQueryParameter("RecordingDuration", recordingDuration);
            this.recordingDuration = recordingDuration;
            return this;
        }

        /**
         * <p>The screen recording&quot;s end time in HH:MM:SS format. The value is meaningful only if <code>Recording</code> is set to <code>PERIOD</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>08:59:00</p>
         */
        public Builder recordingEndTime(String recordingEndTime) {
            this.putQueryParameter("RecordingEndTime", recordingEndTime);
            this.recordingEndTime = recordingEndTime;
            return this;
        }

        /**
         * <p>The retention period of the screen recording file. Valid values: 1 to 180. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder recordingExpires(Integer recordingExpires) {
            this.putQueryParameter("RecordingExpires", recordingExpires);
            this.recordingExpires = recordingExpires;
            return this;
        }

        /**
         * <p>The frame rate of screen recording. Unit: fps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder recordingFps(String recordingFps) {
            this.putQueryParameter("RecordingFps", recordingFps);
            this.recordingFps = recordingFps;
            return this;
        }

        /**
         * <p>The screen recording&quot;s start time in HH:MM:SS format. The value is meaningful only if <code>Recording</code> is set to <code>PERIOD</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        public Builder recordingStartTime(String recordingStartTime) {
            this.putQueryParameter("RecordingStartTime", recordingStartTime);
            this.recordingStartTime = recordingStartTime;
            return this;
        }

        /**
         * <p>Specifies whether to notify end users when screen recording is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t notify end users when screen recording is enabled.</li>
         * <li>on: notifies end users when screen recording is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder recordingUserNotify(String recordingUserNotify) {
            this.putQueryParameter("RecordingUserNotify", recordingUserNotify);
            this.recordingUserNotify = recordingUserNotify;
            return this;
        }

        /**
         * <p>The notification sent to end users when screen recording is enabled.</p>
         */
        public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
            this.putQueryParameter("RecordingUserNotifyMessage", recordingUserNotifyMessage);
            this.recordingUserNotifyMessage = recordingUserNotifyMessage;
            return this;
        }

        /**
         * <p>The region ID. Set the value to cn-shanghai.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The keyboard and mouse control permissions during remote assistance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>optionalControl: By default, keyboard and mouse control is disabled during remote assistance. You can request permissions as needed.</li>
         * <li>fullControl: Keyboard and mouse control is enabled during remote assistance.</li>
         * <li>disableControl: Keyboard and mouse control is disabled during remote assistance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fullControl</p>
         */
        public Builder remoteCoordinate(String remoteCoordinate) {
            this.putQueryParameter("RemoteCoordinate", remoteCoordinate);
            this.remoteCoordinate = remoteCoordinate;
            return this;
        }

        /**
         * <p>The computer reset setting.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder resetDesktop(String resetDesktop) {
            this.putQueryParameter("ResetDesktop", resetDesktop);
            this.resetDesktop = resetDesktop;
            return this;
        }

        /**
         * <p>The resolution height. Unit: pixel. Valid values for cloud applications: 500 to 50000. Valid values for cloud computers: 480 to 4096.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        public Builder resolutionHeight(Integer resolutionHeight) {
            this.putQueryParameter("ResolutionHeight", resolutionHeight);
            this.resolutionHeight = resolutionHeight;
            return this;
        }

        /**
         * <p>The resolution type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>adaptive: adaptive resolution.</li>
         * <li>customer: fixed resolution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>adaptive</p>
         */
        public Builder resolutionModel(String resolutionModel) {
            this.putQueryParameter("ResolutionModel", resolutionModel);
            this.resolutionModel = resolutionModel;
            return this;
        }

        /**
         * <p>The resolution width. Unit: pixel. Valid values for cloud applications: 500 to 50000. Valid values for cloud computers: 480 to 4096.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder resolutionWidth(Integer resolutionWidth) {
            this.putQueryParameter("ResolutionWidth", resolutionWidth);
            this.resolutionWidth = resolutionWidth;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>app: cloud applications.</li>
         * <li>desktop: cloud computers.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SafeMenu.
         */
        public Builder safeMenu(String safeMenu) {
            this.putQueryParameter("SafeMenu", safeMenu);
            this.safeMenu = safeMenu;
            return this;
        }

        /**
         * <p>The effective scope of the policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>IP: The policy applies to specific IP addresses.</li>
         * <li>GLOBAL: The policy applies globally.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The effective scopes. This parameter is required when <code>Scope</code> is set to <code>IP</code>. If <code>Scope</code> is set to <code>IP</code>, this parameter doesn&quot;t take effect.</p>
         */
        public Builder scopeValue(java.util.List<String> scopeValue) {
            this.putQueryParameter("ScopeValue", scopeValue);
            this.scopeValue = scopeValue;
            return this;
        }

        /**
         * <p>The bandwidth peak allowed for sessions. Unit: Kbit/s. Valid values: 2000 to 100000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder sessionMaxRateKbps(Integer sessionMaxRateKbps) {
            this.putQueryParameter("SessionMaxRateKbps", sessionMaxRateKbps);
            this.sessionMaxRateKbps = sessionMaxRateKbps;
            return this;
        }

        /**
         * <p>Specifies whether to enable smoothness enhancement for daily office use.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t enable smoothness enhancement for daily office use.</li>
         * <li>on: enables smoothness enhancement for daily office use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder smoothEnhancement(String smoothEnhancement) {
            this.putQueryParameter("SmoothEnhancement", smoothEnhancement);
            this.smoothEnhancement = smoothEnhancement;
            return this;
        }

        /**
         * <p>Specifies whether to display the metric status entry in the DesktopAssistant menu.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t display the metric status entry in the DesktopAssistant menu.</li>
         * <li>on: displays the metric status entry in the DesktopAssistant menu.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder statusMonitor(String statusMonitor) {
            this.putQueryParameter("StatusMonitor", statusMonitor);
            this.statusMonitor = statusMonitor;
            return this;
        }

        /**
         * <p>The streaming mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>intelligent</li>
         * <li>smooth</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>smooth</p>
         */
        public Builder streamingMode(String streamingMode) {
            this.putQueryParameter("StreamingMode", streamingMode);
            this.streamingMode = streamingMode;
            return this;
        }

        /**
         * <p>The target frame rate. Valid values: 10 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder targetFps(Integer targetFps) {
            this.putQueryParameter("TargetFps", targetFps);
            this.targetFps = targetFps;
            return this;
        }

        /**
         * <p>Specifies whether to display the application taskbar.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t display the application taskbar.</li>
         * <li>on: displays the application taskbar.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder taskbar(String taskbar) {
            this.putQueryParameter("Taskbar", taskbar);
            this.taskbar = taskbar;
            return this;
        }

        /**
         * <p>Specifies whether to enable USB redirection.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default): doesn&quot;t enable USB redirection.</li>
         * <li>on: enables USB redirection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder usbRedirect(String usbRedirect) {
            this.putQueryParameter("UsbRedirect", usbRedirect);
            this.usbRedirect = usbRedirect;
            return this;
        }

        /**
         * <p>The USB redirection rules.</p>
         */
        public Builder usbSupplyRedirectRule(java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule) {
            this.putQueryParameter("UsbSupplyRedirectRule", usbSupplyRedirectRule);
            this.usbSupplyRedirectRule = usbSupplyRedirectRule;
            return this;
        }

        /**
         * <p>The average bitrate for video encoding. Unit: Kbit/s. Valid values: 1000 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder videoEncAvgKbps(Integer videoEncAvgKbps) {
            this.putQueryParameter("VideoEncAvgKbps", videoEncAvgKbps);
            this.videoEncAvgKbps = videoEncAvgKbps;
            return this;
        }

        /**
         * <p>The maximum QP for video files. Higher QP values result in lower video quality. Valid values: 0 to 51.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder videoEncMaxQP(Integer videoEncMaxQP) {
            this.putQueryParameter("VideoEncMaxQP", videoEncMaxQP);
            this.videoEncMaxQP = videoEncMaxQP;
            return this;
        }

        /**
         * <p>The minimum quantizer parameter (QP) for video files. A lower QP means better video quality. Valid values: 0 to 51.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder videoEncMinQP(Integer videoEncMinQP) {
            this.putQueryParameter("VideoEncMinQP", videoEncMinQP);
            this.videoEncMinQP = videoEncMinQP;
            return this;
        }

        /**
         * <p>The peak bitrate for video encoding. Unit: Kbit/s. Valid values: 1000 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder videoEncPeakKbps(Integer videoEncPeakKbps) {
            this.putQueryParameter("VideoEncPeakKbps", videoEncPeakKbps);
            this.videoEncPeakKbps = videoEncPeakKbps;
            return this;
        }

        /**
         * <p>The video encoding policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>qualityFirst: prioritizes image quality.</li>
         * <li>bandwidthFirst: prioritizes bandwidth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qualityFirst</p>
         */
        public Builder videoEncPolicy(String videoEncPolicy) {
            this.putQueryParameter("VideoEncPolicy", videoEncPolicy);
            this.videoEncPolicy = videoEncPolicy;
            return this;
        }

        /**
         * <p>The multimedia redirection policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: disables multimedia redirection.</li>
         * <li>on: enables multimedia redirection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder videoRedirect(String videoRedirect) {
            this.putQueryParameter("VideoRedirect", videoRedirect);
            this.videoRedirect = videoRedirect;
            return this;
        }

        /**
         * <p>The image display quality.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>high: high-definition (HD).</li>
         * <li>low: smoothness.</li>
         * <li>lossless: no quality loss.</li>
         * <li>medium (default): scenario-specific adaptation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        public Builder visualQuality(String visualQuality) {
            this.putQueryParameter("VisualQuality", visualQuality);
            this.visualQuality = visualQuality;
            return this;
        }

        /**
         * <p>The watermark policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>blind: displays invisible watermarks.</li>
         * <li>off (default): displays no watermark.</li>
         * <li>on: displays visible watermarks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder watermark(String watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        /**
         * <p>Specifies whether to enable anti-screen capture for invisible watermarks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: disables anti-screen capture for invisible watermarks.</li>
         * <li>on: enables anti-screen capture for invisible watermarks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder watermarkAntiCam(String watermarkAntiCam) {
            this.putQueryParameter("WatermarkAntiCam", watermarkAntiCam);
            this.watermarkAntiCam = watermarkAntiCam;
            return this;
        }

        /**
         * <p>The font color of the watermark. Valid values: 0 to 16777215.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder watermarkColor(Integer watermarkColor) {
            this.putQueryParameter("WatermarkColor", watermarkColor);
            this.watermarkColor = watermarkColor;
            return this;
        }

        /**
         * <p>The number of watermark columns. Valid values: 3 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder watermarkColumnAmount(Integer watermarkColumnAmount) {
            this.putQueryParameter("WatermarkColumnAmount", watermarkColumnAmount);
            this.watermarkColumnAmount = watermarkColumnAmount;
            return this;
        }

        /**
         * <p>If you set <code>WatermarkType</code> to <code>custom</code>, you must also specify <code>WatermarkCustomText</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder watermarkCustomText(String watermarkCustomText) {
            this.putQueryParameter("WatermarkCustomText", watermarkCustomText);
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }

        /**
         * <p>The watermark rotation. Valid values: -10 to -30.</p>
         * 
         * <strong>example:</strong>
         * <p>-10</p>
         */
        public Builder watermarkDegree(Double watermarkDegree) {
            this.putQueryParameter("WatermarkDegree", watermarkDegree);
            this.watermarkDegree = watermarkDegree;
            return this;
        }

        /**
         * <p>The font size of the watermark. Valid values: 10 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder watermarkFontSize(Integer watermarkFontSize) {
            this.putQueryParameter("WatermarkFontSize", watermarkFontSize);
            this.watermarkFontSize = watermarkFontSize;
            return this;
        }

        /**
         * <p>The font style of the watermark.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>plain</li>
         * <li>bold</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>plain</p>
         */
        public Builder watermarkFontStyle(String watermarkFontStyle) {
            this.putQueryParameter("WatermarkFontStyle", watermarkFontStyle);
            this.watermarkFontStyle = watermarkFontStyle;
            return this;
        }

        /**
         * <p>The enhancement level for invisible watermarks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>high</li>
         * <li>low</li>
         * <li>medium</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        public Builder watermarkPower(String watermarkPower) {
            this.putQueryParameter("WatermarkPower", watermarkPower);
            this.watermarkPower = watermarkPower;
            return this;
        }

        /**
         * <p>The number of watermark rows. Valid values: 3 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder watermarkRowAmount(Integer watermarkRowAmount) {
            this.putQueryParameter("WatermarkRowAmount", watermarkRowAmount);
            this.watermarkRowAmount = watermarkRowAmount;
            return this;
        }

        /**
         * <p>Specifies whether to enable security priority for invisible watermarks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: disables security priority for invisible watermarks.</li>
         * <li>on: enables security priority for invisible watermarks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder watermarkSecurity(String watermarkSecurity) {
            this.putQueryParameter("WatermarkSecurity", watermarkSecurity);
            this.watermarkSecurity = watermarkSecurity;
            return this;
        }

        /**
         * <p>The watermark opacity. A higher value makes the watermark more opaque. Valid values: 10 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder watermarkTransparencyValue(Integer watermarkTransparencyValue) {
            this.putQueryParameter("WatermarkTransparencyValue", watermarkTransparencyValue);
            this.watermarkTransparencyValue = watermarkTransparencyValue;
            return this;
        }

        /**
         * <p>The watermark type. You can specify up to three types. Separate multiple values with commas (,).</p>
         * <blockquote>
         * <p> If you provide <code>custom</code> as the value for this parameter, you must configure <code>WatermarkCustomText</code> to specify custom text.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>EndUserId: the username.</li>
         * <li>Custom: the custom text.</li>
         * <li>DesktopIp: the IP address of the cloud computer.</li>
         * <li>ClientIp: the IP address of the client.</li>
         * <li>HostName: the rightmost 15 digits of the cloud computer ID.</li>
         * <li>ClientTime: the current time displayed on the cloud computer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EndUserId,HostName,ClientTime</p>
         */
        public Builder watermarkType(String watermarkType) {
            this.putQueryParameter("WatermarkType", watermarkType);
            this.watermarkType = watermarkType;
            return this;
        }

        /**
         * <p>Specifies whether to enable Cloud Computer Manager.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder wuyingKeeper(String wuyingKeeper) {
            this.putQueryParameter("WuyingKeeper", wuyingKeeper);
            this.wuyingKeeper = wuyingKeeper;
            return this;
        }

        /**
         * <p>Specifies whether to display the Xiaoying AI Assistant option in the DesktopAssistant menu when end users connect to cloud computers via desktop clients (Windows and macOS).</p>
         * <blockquote>
         * <p> This feature applies to only desktop clients of version 7.7.0 or later.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: doesn&quot;t display the Xiaoying AI Assistant option in the DesktopAssistant menu.</li>
         * <li>on: displays the Xiaoying AI Assistant option in the DesktopAssistant menu.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder wyAssistant(String wyAssistant) {
            this.putQueryParameter("WyAssistant", wyAssistant);
            this.wyAssistant = wyAssistant;
            return this;
        }

        @Override
        public CreateCenterPolicyRequest build() {
            return new CreateCenterPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenterPolicyRequest</p>
     */
    public static class AuthorizeAccessPolicyRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private AuthorizeAccessPolicyRule(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeAccessPolicyRule create() {
            return builder().build();
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String cidrIp; 
            private String description; 

            private Builder() {
            } 

            private Builder(AuthorizeAccessPolicyRule model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
            } 

            /**
             * <p>The client CIDR block from which end users can connect to cloud computers. Specify an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/16</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the client IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AuthorizeAccessPolicyRule build() {
                return new AuthorizeAccessPolicyRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenterPolicyRequest</p>
     */
    public static class AuthorizeSecurityPolicyRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AuthorizeSecurityPolicyRule(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
            this.ipProtocol = builder.ipProtocol;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeSecurityPolicyRule create() {
            return builder().build();
        }

        /**
         * @return cidrIp
         */
        public String getCidrIp() {
            return this.cidrIp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cidrIp; 
            private String description; 
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String type; 

            private Builder() {
            } 

            private Builder(AuthorizeSecurityPolicyRule model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
                this.ipProtocol = model.ipProtocol;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.priority = model.priority;
                this.type = model.type;
            } 

            /**
             * <p>The object of the security group rule. Specify an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX/8</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the security group rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The protocol type of the security group rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>TCP: the Transmission Control Protocol (TCP) protocol.</li>
             * <li>UDP: the User Datagram Protocol (UDP) protocol.</li>
             * <li>ALL: any type of protocol.</li>
             * <li>GRE: the Generic Routing Encapsulation (GRE) protocol.</li>
             * <li>ICMP: the Internet Control Message Protocol (ICMP) for (IPv4).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The authorization policy of the security group rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>drop: denies all access requests. If no &quot;&quot;access denied&quot;&quot; messages are returned, the requests either timed out or failed.</li>
             * <li>accept (default): accepts all requests.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The port range of the security group rule. The value range of this parameter varies based on the value of IpProtocol.</p>
             * <ul>
             * <li>If IpProtocol is set to TCP or UDP, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</li>
             * <li>If IpProtocol is set to ICMP, set the value to -1/-1.</li>
             * <li>If IpProtocol is set to GRE, set the value to -1/-1.</li>
             * <li>If IpProtocol is set to ALL, set the value to -1/-1.</li>
             * </ul>
             * <p>For more information about the common ports, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>22/22</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the security group rule. A smaller value specifies a higher priority.<br>Valid values: 1 to 60.<br>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The direction of the security group rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>outflow: outbound.</li>
             * <li>inflow: inbound.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>inflow</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AuthorizeSecurityPolicyRule build() {
                return new AuthorizeSecurityPolicyRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenterPolicyRequest</p>
     */
    public static class ClientType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ClientType(Builder builder) {
            this.clientType = builder.clientType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientType create() {
            return builder().build();
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clientType; 
            private String status; 

            private Builder() {
            } 

            private Builder(ClientType model) {
                this.clientType = model.clientType;
                this.status = model.status;
            } 

            /**
             * <p>The type of the Alibaba Cloud Workspace client that end users can use to connect to cloud computers.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>html5: the web client.</li>
             * <li>android: the Android client.</li>
             * <li>ios: the iOS client.</li>
             * <li>windows: the Windows client.</li>
             * <li>macos: the macOS client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>Specifies whether end users can use the specified type of Alibaba Cloud Workspace client to connect to cloud computers.</p>
             * <blockquote>
             * <p> If you don&quot;t specify <code>ClientType</code>, any client can be used to connect to cloud computers.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>off: End users cannot use the specified type of Alibaba Cloud Workspace client to connect to cloud computers.</li>
             * <li>on: End users can use the specified type of Alibaba Cloud Workspace client to connect to cloud computers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClientType build() {
                return new ClientType(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenterPolicyRequest</p>
     */
    public static class DeviceRedirects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("RedirectType")
        private String redirectType;

        private DeviceRedirects(Builder builder) {
            this.deviceType = builder.deviceType;
            this.redirectType = builder.redirectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceRedirects create() {
            return builder().build();
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return redirectType
         */
        public String getRedirectType() {
            return this.redirectType;
        }

        public static final class Builder {
            private String deviceType; 
            private String redirectType; 

            private Builder() {
            } 

            private Builder(DeviceRedirects model) {
                this.deviceType = model.deviceType;
                this.redirectType = model.redirectType;
            } 

            /**
             * <p>The peripheral type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>printer</li>
             * <li>scanner</li>
             * <li>serialport</li>
             * <li>camera</li>
             * <li>adb</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>camera</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The redirection type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>deviceRedirect: enables device redirection.</li>
             * <li>usbRedirect: enables USB redirection.</li>
             * <li>off: disables any type of redirection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>usbRedirect</p>
             */
            public Builder redirectType(String redirectType) {
                this.redirectType = redirectType;
                return this;
            }

            public DeviceRedirects build() {
                return new DeviceRedirects(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenterPolicyRequest</p>
     */
    public static class DeviceRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DevicePid")
        private String devicePid;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("DeviceVid")
        private String deviceVid;

        @com.aliyun.core.annotation.NameInMap("OptCommand")
        private String optCommand;

        @com.aliyun.core.annotation.NameInMap("Platforms")
        private String platforms;

        @com.aliyun.core.annotation.NameInMap("RedirectType")
        private String redirectType;

        private DeviceRules(Builder builder) {
            this.deviceName = builder.deviceName;
            this.devicePid = builder.devicePid;
            this.deviceType = builder.deviceType;
            this.deviceVid = builder.deviceVid;
            this.optCommand = builder.optCommand;
            this.platforms = builder.platforms;
            this.redirectType = builder.redirectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceRules create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return devicePid
         */
        public String getDevicePid() {
            return this.devicePid;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return deviceVid
         */
        public String getDeviceVid() {
            return this.deviceVid;
        }

        /**
         * @return optCommand
         */
        public String getOptCommand() {
            return this.optCommand;
        }

        /**
         * @return platforms
         */
        public String getPlatforms() {
            return this.platforms;
        }

        /**
         * @return redirectType
         */
        public String getRedirectType() {
            return this.redirectType;
        }

        public static final class Builder {
            private String deviceName; 
            private String devicePid; 
            private String deviceType; 
            private String deviceVid; 
            private String optCommand; 
            private String platforms; 
            private String redirectType; 

            private Builder() {
            } 

            private Builder(DeviceRules model) {
                this.deviceName = model.deviceName;
                this.devicePid = model.devicePid;
                this.deviceType = model.deviceType;
                this.deviceVid = model.deviceVid;
                this.optCommand = model.optCommand;
                this.platforms = model.platforms;
                this.redirectType = model.redirectType;
            } 

            /**
             * <p>The device name.</p>
             * 
             * <strong>example:</strong>
             * <p>sandisk</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The product ID (PID).</p>
             * 
             * <strong>example:</strong>
             * <p>0x55b1</p>
             */
            public Builder devicePid(String devicePid) {
                this.devicePid = devicePid;
                return this;
            }

            /**
             * <p>The peripheral type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>usbKey: UKeys.</li>
             * <li>other: other peripheral devices.</li>
             * <li>graphicsTablet: graphics tablets.</li>
             * <li>cardReader: card readers.</li>
             * <li>printer: printers.</li>
             * <li>scanner: scanners.</li>
             * <li>storage: storage devices.</li>
             * <li>camera: cameras.</li>
             * <li>networkInterfaceCard: NIC devices.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>storage</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB VIDs</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0x0781</p>
             */
            public Builder deviceVid(String deviceVid) {
                this.deviceVid = deviceVid;
                return this;
            }

            /**
             * <p>The link optimization command.</p>
             * 
             * <strong>example:</strong>
             * <p>2:0</p>
             */
            public Builder optCommand(String optCommand) {
                this.optCommand = optCommand;
                return this;
            }

            /**
             * Platforms.
             */
            public Builder platforms(String platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * <p>The redirection type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>deviceRedirect: device redirection.</li>
             * <li>usbRedirect: USB redirection.</li>
             * <li>off: redirection disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>usbRedirect</p>
             */
            public Builder redirectType(String redirectType) {
                this.redirectType = redirectType;
                return this;
            }

            public DeviceRules build() {
                return new DeviceRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenterPolicyRequest</p>
     */
    public static class DomainResolveRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        private DomainResolveRule(Builder builder) {
            this.description = builder.description;
            this.domain = builder.domain;
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainResolveRule create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private String description; 
            private String domain; 
            private String policy; 

            private Builder() {
            } 

            private Builder(DomainResolveRule model) {
                this.description = model.description;
                this.domain = model.domain;
                this.policy = model.policy;
            } 

            /**
             * <p>The policy description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Specifies whether to allow the domain resolution policy to take effect.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>allow</li>
             * <li>block</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            public DomainResolveRule build() {
                return new DomainResolveRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenterPolicyRequest</p>
     */
    public static class NetRedirectRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        private NetRedirectRule(Builder builder) {
            this.domain = builder.domain;
            this.policy = builder.policy;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetRedirectRule create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private String domain; 
            private String policy; 
            private String ruleType; 

            private Builder() {
            } 

            private Builder(NetRedirectRule model) {
                this.domain = model.domain;
                this.policy = model.policy;
                this.ruleType = model.ruleType;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.taobao.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The redirection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The rule type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>prc: process.</li>
             * <li>domain: domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public NetRedirectRule build() {
                return new NetRedirectRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenterPolicyRequest</p>
     */
    public static class UsbSupplyRedirectRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("UsbRedirectType")
        private String usbRedirectType;

        @com.aliyun.core.annotation.NameInMap("UsbRuleType")
        private String usbRuleType;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private UsbSupplyRedirectRule(Builder builder) {
            this.description = builder.description;
            this.productId = builder.productId;
            this.usbRedirectType = builder.usbRedirectType;
            this.usbRuleType = builder.usbRuleType;
            this.vendorId = builder.vendorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsbSupplyRedirectRule create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return usbRedirectType
         */
        public String getUsbRedirectType() {
            return this.usbRedirectType;
        }

        /**
         * @return usbRuleType
         */
        public String getUsbRuleType() {
            return this.usbRuleType;
        }

        /**
         * @return vendorId
         */
        public String getVendorId() {
            return this.vendorId;
        }

        public static final class Builder {
            private String description; 
            private String productId; 
            private String usbRedirectType; 
            private String usbRuleType; 
            private String vendorId; 

            private Builder() {
            } 

            private Builder(UsbSupplyRedirectRule model) {
                this.description = model.description;
                this.productId = model.productId;
                this.usbRedirectType = model.usbRedirectType;
                this.usbRuleType = model.usbRuleType;
                this.vendorId = model.vendorId;
            } 

            /**
             * <p>The rule description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The product ID (PID).</p>
             * 
             * <strong>example:</strong>
             * <p>08**</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>Specifies whether to allow USB redirection.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>1: allows USB redirection.</li>
             * <li>2: forbids USB redirection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usbRedirectType(String usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * <p>The type of the USB redirection rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>2: enables USB redirection based on products.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder usbRuleType(String usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>04**</p>
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            public UsbSupplyRedirectRule build() {
                return new UsbSupplyRedirectRule(this);
            } 

        } 

    }
}
