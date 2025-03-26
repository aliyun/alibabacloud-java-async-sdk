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
 * {@link ModifyCenterPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyCenterPolicyRequest</p>
 */
public class ModifyCenterPolicyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyGroupId;

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
    @com.aliyun.core.annotation.NameInMap("RevokeAccessPolicyRule")
    private java.util.List<RevokeAccessPolicyRule> revokeAccessPolicyRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevokeSecurityPolicyRule")
    private java.util.List<RevokeSecurityPolicyRule> revokeSecurityPolicyRule;

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

    private ModifyCenterPolicyRequest(Builder builder) {
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
        this.policyGroupId = builder.policyGroupId;
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
        this.revokeAccessPolicyRule = builder.revokeAccessPolicyRule;
        this.revokeSecurityPolicyRule = builder.revokeSecurityPolicyRule;
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

    public static ModifyCenterPolicyRequest create() {
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
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
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
     * @return revokeAccessPolicyRule
     */
    public java.util.List<RevokeAccessPolicyRule> getRevokeAccessPolicyRule() {
        return this.revokeAccessPolicyRule;
    }

    /**
     * @return revokeSecurityPolicyRule
     */
    public java.util.List<RevokeSecurityPolicyRule> getRevokeSecurityPolicyRule() {
        return this.revokeSecurityPolicyRule;
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

    public static final class Builder extends Request.Builder<ModifyCenterPolicyRequest, Builder> {
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
        private String policyGroupId; 
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
        private java.util.List<RevokeAccessPolicyRule> revokeAccessPolicyRule; 
        private java.util.List<RevokeSecurityPolicyRule> revokeSecurityPolicyRule; 
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

        private Builder(ModifyCenterPolicyRequest request) {
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
            this.policyGroupId = request.policyGroupId;
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
            this.revokeAccessPolicyRule = request.revokeAccessPolicyRule;
            this.revokeSecurityPolicyRule = request.revokeSecurityPolicyRule;
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
         * AdminAccess.
         */
        public Builder adminAccess(String adminAccess) {
            this.putQueryParameter("AdminAccess", adminAccess);
            this.adminAccess = adminAccess;
            return this;
        }

        /**
         * AppContentProtection.
         */
        public Builder appContentProtection(String appContentProtection) {
            this.putQueryParameter("AppContentProtection", appContentProtection);
            this.appContentProtection = appContentProtection;
            return this;
        }

        /**
         * AuthorizeAccessPolicyRule.
         */
        public Builder authorizeAccessPolicyRule(java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
            this.putQueryParameter("AuthorizeAccessPolicyRule", authorizeAccessPolicyRule);
            this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
            return this;
        }

        /**
         * AuthorizeSecurityPolicyRule.
         */
        public Builder authorizeSecurityPolicyRule(java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
            this.putQueryParameter("AuthorizeSecurityPolicyRule", authorizeSecurityPolicyRule);
            this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
            return this;
        }

        /**
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
         * CameraRedirect.
         */
        public Builder cameraRedirect(String cameraRedirect) {
            this.putQueryParameter("CameraRedirect", cameraRedirect);
            this.cameraRedirect = cameraRedirect;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(java.util.List<ClientType> clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Clipboard.
         */
        public Builder clipboard(String clipboard) {
            this.putQueryParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * ColorEnhancement.
         */
        public Builder colorEnhancement(String colorEnhancement) {
            this.putQueryParameter("ColorEnhancement", colorEnhancement);
            this.colorEnhancement = colorEnhancement;
            return this;
        }

        /**
         * CpuDownGradeDuration.
         */
        public Builder cpuDownGradeDuration(Integer cpuDownGradeDuration) {
            this.putQueryParameter("CpuDownGradeDuration", cpuDownGradeDuration);
            this.cpuDownGradeDuration = cpuDownGradeDuration;
            return this;
        }

        /**
         * CpuProcessors.
         */
        public Builder cpuProcessors(java.util.List<String> cpuProcessors) {
            this.putQueryParameter("CpuProcessors", cpuProcessors);
            this.cpuProcessors = cpuProcessors;
            return this;
        }

        /**
         * CpuProtectedMode.
         */
        public Builder cpuProtectedMode(String cpuProtectedMode) {
            this.putQueryParameter("CpuProtectedMode", cpuProtectedMode);
            this.cpuProtectedMode = cpuProtectedMode;
            return this;
        }

        /**
         * CpuRateLimit.
         */
        public Builder cpuRateLimit(Integer cpuRateLimit) {
            this.putQueryParameter("CpuRateLimit", cpuRateLimit);
            this.cpuRateLimit = cpuRateLimit;
            return this;
        }

        /**
         * CpuSampleDuration.
         */
        public Builder cpuSampleDuration(Integer cpuSampleDuration) {
            this.putQueryParameter("CpuSampleDuration", cpuSampleDuration);
            this.cpuSampleDuration = cpuSampleDuration;
            return this;
        }

        /**
         * CpuSingleRateLimit.
         */
        public Builder cpuSingleRateLimit(Integer cpuSingleRateLimit) {
            this.putQueryParameter("CpuSingleRateLimit", cpuSingleRateLimit);
            this.cpuSingleRateLimit = cpuSingleRateLimit;
            return this;
        }

        /**
         * DeviceConnectHint.
         */
        public Builder deviceConnectHint(String deviceConnectHint) {
            this.putQueryParameter("DeviceConnectHint", deviceConnectHint);
            this.deviceConnectHint = deviceConnectHint;
            return this;
        }

        /**
         * DeviceRedirects.
         */
        public Builder deviceRedirects(java.util.List<DeviceRedirects> deviceRedirects) {
            this.putQueryParameter("DeviceRedirects", deviceRedirects);
            this.deviceRedirects = deviceRedirects;
            return this;
        }

        /**
         * DeviceRules.
         */
        public Builder deviceRules(java.util.List<DeviceRules> deviceRules) {
            this.putQueryParameter("DeviceRules", deviceRules);
            this.deviceRules = deviceRules;
            return this;
        }

        /**
         * DisconnectKeepSession.
         */
        public Builder disconnectKeepSession(String disconnectKeepSession) {
            this.putQueryParameter("DisconnectKeepSession", disconnectKeepSession);
            this.disconnectKeepSession = disconnectKeepSession;
            return this;
        }

        /**
         * DisconnectKeepSessionTime.
         */
        public Builder disconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
            this.putQueryParameter("DisconnectKeepSessionTime", disconnectKeepSessionTime);
            this.disconnectKeepSessionTime = disconnectKeepSessionTime;
            return this;
        }

        /**
         * DisplayMode.
         */
        public Builder displayMode(String displayMode) {
            this.putQueryParameter("DisplayMode", displayMode);
            this.displayMode = displayMode;
            return this;
        }

        /**
         * DomainResolveRule.
         */
        public Builder domainResolveRule(java.util.List<DomainResolveRule> domainResolveRule) {
            this.putQueryParameter("DomainResolveRule", domainResolveRule);
            this.domainResolveRule = domainResolveRule;
            return this;
        }

        /**
         * DomainResolveRuleType.
         */
        public Builder domainResolveRuleType(String domainResolveRuleType) {
            this.putQueryParameter("DomainResolveRuleType", domainResolveRuleType);
            this.domainResolveRuleType = domainResolveRuleType;
            return this;
        }

        /**
         * EnableSessionRateLimiting.
         */
        public Builder enableSessionRateLimiting(String enableSessionRateLimiting) {
            this.putQueryParameter("EnableSessionRateLimiting", enableSessionRateLimiting);
            this.enableSessionRateLimiting = enableSessionRateLimiting;
            return this;
        }

        /**
         * EndUserApplyAdminCoordinate.
         */
        public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
            this.putQueryParameter("EndUserApplyAdminCoordinate", endUserApplyAdminCoordinate);
            this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
            return this;
        }

        /**
         * EndUserGroupCoordinate.
         */
        public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
            this.putQueryParameter("EndUserGroupCoordinate", endUserGroupCoordinate);
            this.endUserGroupCoordinate = endUserGroupCoordinate;
            return this;
        }

        /**
         * FileMigrate.
         */
        public Builder fileMigrate(String fileMigrate) {
            this.putQueryParameter("FileMigrate", fileMigrate);
            this.fileMigrate = fileMigrate;
            return this;
        }

        /**
         * GpuAcceleration.
         */
        public Builder gpuAcceleration(String gpuAcceleration) {
            this.putQueryParameter("GpuAcceleration", gpuAcceleration);
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }

        /**
         * Html5FileTransfer.
         */
        public Builder html5FileTransfer(String html5FileTransfer) {
            this.putQueryParameter("Html5FileTransfer", html5FileTransfer);
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }

        /**
         * InternetCommunicationProtocol.
         */
        public Builder internetCommunicationProtocol(String internetCommunicationProtocol) {
            this.putQueryParameter("InternetCommunicationProtocol", internetCommunicationProtocol);
            this.internetCommunicationProtocol = internetCommunicationProtocol;
            return this;
        }

        /**
         * LocalDrive.
         */
        public Builder localDrive(String localDrive) {
            this.putQueryParameter("LocalDrive", localDrive);
            this.localDrive = localDrive;
            return this;
        }

        /**
         * MaxReconnectTime.
         */
        public Builder maxReconnectTime(Integer maxReconnectTime) {
            this.putQueryParameter("MaxReconnectTime", maxReconnectTime);
            this.maxReconnectTime = maxReconnectTime;
            return this;
        }

        /**
         * MemoryDownGradeDuration.
         */
        public Builder memoryDownGradeDuration(Integer memoryDownGradeDuration) {
            this.putQueryParameter("MemoryDownGradeDuration", memoryDownGradeDuration);
            this.memoryDownGradeDuration = memoryDownGradeDuration;
            return this;
        }

        /**
         * MemoryProcessors.
         */
        public Builder memoryProcessors(java.util.List<String> memoryProcessors) {
            this.putQueryParameter("MemoryProcessors", memoryProcessors);
            this.memoryProcessors = memoryProcessors;
            return this;
        }

        /**
         * MemoryProtectedMode.
         */
        public Builder memoryProtectedMode(String memoryProtectedMode) {
            this.putQueryParameter("MemoryProtectedMode", memoryProtectedMode);
            this.memoryProtectedMode = memoryProtectedMode;
            return this;
        }

        /**
         * MemoryRateLimit.
         */
        public Builder memoryRateLimit(Integer memoryRateLimit) {
            this.putQueryParameter("MemoryRateLimit", memoryRateLimit);
            this.memoryRateLimit = memoryRateLimit;
            return this;
        }

        /**
         * MemorySampleDuration.
         */
        public Builder memorySampleDuration(Integer memorySampleDuration) {
            this.putQueryParameter("MemorySampleDuration", memorySampleDuration);
            this.memorySampleDuration = memorySampleDuration;
            return this;
        }

        /**
         * MemorySingleRateLimit.
         */
        public Builder memorySingleRateLimit(Integer memorySingleRateLimit) {
            this.putQueryParameter("MemorySingleRateLimit", memorySingleRateLimit);
            this.memorySingleRateLimit = memorySingleRateLimit;
            return this;
        }

        /**
         * MobileRestart.
         */
        public Builder mobileRestart(String mobileRestart) {
            this.putQueryParameter("MobileRestart", mobileRestart);
            this.mobileRestart = mobileRestart;
            return this;
        }

        /**
         * MobileShutdown.
         */
        public Builder mobileShutdown(String mobileShutdown) {
            this.putQueryParameter("MobileShutdown", mobileShutdown);
            this.mobileShutdown = mobileShutdown;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NetRedirect.
         */
        public Builder netRedirect(String netRedirect) {
            this.putQueryParameter("NetRedirect", netRedirect);
            this.netRedirect = netRedirect;
            return this;
        }

        /**
         * NetRedirectRule.
         */
        public Builder netRedirectRule(java.util.List<NetRedirectRule> netRedirectRule) {
            this.putQueryParameter("NetRedirectRule", netRedirectRule);
            this.netRedirectRule = netRedirectRule;
            return this;
        }

        /**
         * NoOperationDisconnect.
         */
        public Builder noOperationDisconnect(String noOperationDisconnect) {
            this.putQueryParameter("NoOperationDisconnect", noOperationDisconnect);
            this.noOperationDisconnect = noOperationDisconnect;
            return this;
        }

        /**
         * NoOperationDisconnectTime.
         */
        public Builder noOperationDisconnectTime(Integer noOperationDisconnectTime) {
            this.putQueryParameter("NoOperationDisconnectTime", noOperationDisconnectTime);
            this.noOperationDisconnectTime = noOperationDisconnectTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-53iyi2aar0nd6****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * PrinterRedirect.
         */
        public Builder printerRedirect(String printerRedirect) {
            this.putQueryParameter("PrinterRedirect", printerRedirect);
            this.printerRedirect = printerRedirect;
            return this;
        }

        /**
         * QualityEnhancement.
         */
        public Builder qualityEnhancement(String qualityEnhancement) {
            this.putQueryParameter("QualityEnhancement", qualityEnhancement);
            this.qualityEnhancement = qualityEnhancement;
            return this;
        }

        /**
         * RecordEventDuration.
         */
        public Builder recordEventDuration(Integer recordEventDuration) {
            this.putQueryParameter("RecordEventDuration", recordEventDuration);
            this.recordEventDuration = recordEventDuration;
            return this;
        }

        /**
         * RecordEventFilePaths.
         */
        public Builder recordEventFilePaths(java.util.List<String> recordEventFilePaths) {
            this.putQueryParameter("RecordEventFilePaths", recordEventFilePaths);
            this.recordEventFilePaths = recordEventFilePaths;
            return this;
        }

        /**
         * RecordEventRegisters.
         */
        public Builder recordEventRegisters(java.util.List<String> recordEventRegisters) {
            this.putQueryParameter("RecordEventRegisters", recordEventRegisters);
            this.recordEventRegisters = recordEventRegisters;
            return this;
        }

        /**
         * RecordEvents.
         */
        public Builder recordEvents(java.util.List<String> recordEvents) {
            this.putQueryParameter("RecordEvents", recordEvents);
            this.recordEvents = recordEvents;
            return this;
        }

        /**
         * Recording.
         */
        public Builder recording(String recording) {
            this.putQueryParameter("Recording", recording);
            this.recording = recording;
            return this;
        }

        /**
         * RecordingAudio.
         */
        public Builder recordingAudio(String recordingAudio) {
            this.putQueryParameter("RecordingAudio", recordingAudio);
            this.recordingAudio = recordingAudio;
            return this;
        }

        /**
         * RecordingDuration.
         */
        public Builder recordingDuration(Integer recordingDuration) {
            this.putQueryParameter("RecordingDuration", recordingDuration);
            this.recordingDuration = recordingDuration;
            return this;
        }

        /**
         * RecordingEndTime.
         */
        public Builder recordingEndTime(String recordingEndTime) {
            this.putQueryParameter("RecordingEndTime", recordingEndTime);
            this.recordingEndTime = recordingEndTime;
            return this;
        }

        /**
         * RecordingExpires.
         */
        public Builder recordingExpires(Integer recordingExpires) {
            this.putQueryParameter("RecordingExpires", recordingExpires);
            this.recordingExpires = recordingExpires;
            return this;
        }

        /**
         * RecordingFps.
         */
        public Builder recordingFps(String recordingFps) {
            this.putQueryParameter("RecordingFps", recordingFps);
            this.recordingFps = recordingFps;
            return this;
        }

        /**
         * RecordingStartTime.
         */
        public Builder recordingStartTime(String recordingStartTime) {
            this.putQueryParameter("RecordingStartTime", recordingStartTime);
            this.recordingStartTime = recordingStartTime;
            return this;
        }

        /**
         * RecordingUserNotify.
         */
        public Builder recordingUserNotify(String recordingUserNotify) {
            this.putQueryParameter("RecordingUserNotify", recordingUserNotify);
            this.recordingUserNotify = recordingUserNotify;
            return this;
        }

        /**
         * RecordingUserNotifyMessage.
         */
        public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
            this.putQueryParameter("RecordingUserNotifyMessage", recordingUserNotifyMessage);
            this.recordingUserNotifyMessage = recordingUserNotifyMessage;
            return this;
        }

        /**
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
         * RemoteCoordinate.
         */
        public Builder remoteCoordinate(String remoteCoordinate) {
            this.putQueryParameter("RemoteCoordinate", remoteCoordinate);
            this.remoteCoordinate = remoteCoordinate;
            return this;
        }

        /**
         * ResetDesktop.
         */
        public Builder resetDesktop(String resetDesktop) {
            this.putQueryParameter("ResetDesktop", resetDesktop);
            this.resetDesktop = resetDesktop;
            return this;
        }

        /**
         * ResolutionHeight.
         */
        public Builder resolutionHeight(Integer resolutionHeight) {
            this.putQueryParameter("ResolutionHeight", resolutionHeight);
            this.resolutionHeight = resolutionHeight;
            return this;
        }

        /**
         * ResolutionModel.
         */
        public Builder resolutionModel(String resolutionModel) {
            this.putQueryParameter("ResolutionModel", resolutionModel);
            this.resolutionModel = resolutionModel;
            return this;
        }

        /**
         * ResolutionWidth.
         */
        public Builder resolutionWidth(Integer resolutionWidth) {
            this.putQueryParameter("ResolutionWidth", resolutionWidth);
            this.resolutionWidth = resolutionWidth;
            return this;
        }

        /**
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
         * RevokeAccessPolicyRule.
         */
        public Builder revokeAccessPolicyRule(java.util.List<RevokeAccessPolicyRule> revokeAccessPolicyRule) {
            this.putQueryParameter("RevokeAccessPolicyRule", revokeAccessPolicyRule);
            this.revokeAccessPolicyRule = revokeAccessPolicyRule;
            return this;
        }

        /**
         * RevokeSecurityPolicyRule.
         */
        public Builder revokeSecurityPolicyRule(java.util.List<RevokeSecurityPolicyRule> revokeSecurityPolicyRule) {
            this.putQueryParameter("RevokeSecurityPolicyRule", revokeSecurityPolicyRule);
            this.revokeSecurityPolicyRule = revokeSecurityPolicyRule;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * ScopeValue.
         */
        public Builder scopeValue(java.util.List<String> scopeValue) {
            this.putQueryParameter("ScopeValue", scopeValue);
            this.scopeValue = scopeValue;
            return this;
        }

        /**
         * SessionMaxRateKbps.
         */
        public Builder sessionMaxRateKbps(Integer sessionMaxRateKbps) {
            this.putQueryParameter("SessionMaxRateKbps", sessionMaxRateKbps);
            this.sessionMaxRateKbps = sessionMaxRateKbps;
            return this;
        }

        /**
         * SmoothEnhancement.
         */
        public Builder smoothEnhancement(String smoothEnhancement) {
            this.putQueryParameter("SmoothEnhancement", smoothEnhancement);
            this.smoothEnhancement = smoothEnhancement;
            return this;
        }

        /**
         * StatusMonitor.
         */
        public Builder statusMonitor(String statusMonitor) {
            this.putQueryParameter("StatusMonitor", statusMonitor);
            this.statusMonitor = statusMonitor;
            return this;
        }

        /**
         * StreamingMode.
         */
        public Builder streamingMode(String streamingMode) {
            this.putQueryParameter("StreamingMode", streamingMode);
            this.streamingMode = streamingMode;
            return this;
        }

        /**
         * TargetFps.
         */
        public Builder targetFps(Integer targetFps) {
            this.putQueryParameter("TargetFps", targetFps);
            this.targetFps = targetFps;
            return this;
        }

        /**
         * Taskbar.
         */
        public Builder taskbar(String taskbar) {
            this.putQueryParameter("Taskbar", taskbar);
            this.taskbar = taskbar;
            return this;
        }

        /**
         * UsbRedirect.
         */
        public Builder usbRedirect(String usbRedirect) {
            this.putQueryParameter("UsbRedirect", usbRedirect);
            this.usbRedirect = usbRedirect;
            return this;
        }

        /**
         * UsbSupplyRedirectRule.
         */
        public Builder usbSupplyRedirectRule(java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule) {
            this.putQueryParameter("UsbSupplyRedirectRule", usbSupplyRedirectRule);
            this.usbSupplyRedirectRule = usbSupplyRedirectRule;
            return this;
        }

        /**
         * VideoEncAvgKbps.
         */
        public Builder videoEncAvgKbps(Integer videoEncAvgKbps) {
            this.putQueryParameter("VideoEncAvgKbps", videoEncAvgKbps);
            this.videoEncAvgKbps = videoEncAvgKbps;
            return this;
        }

        /**
         * VideoEncMaxQP.
         */
        public Builder videoEncMaxQP(Integer videoEncMaxQP) {
            this.putQueryParameter("VideoEncMaxQP", videoEncMaxQP);
            this.videoEncMaxQP = videoEncMaxQP;
            return this;
        }

        /**
         * VideoEncMinQP.
         */
        public Builder videoEncMinQP(Integer videoEncMinQP) {
            this.putQueryParameter("VideoEncMinQP", videoEncMinQP);
            this.videoEncMinQP = videoEncMinQP;
            return this;
        }

        /**
         * VideoEncPeakKbps.
         */
        public Builder videoEncPeakKbps(Integer videoEncPeakKbps) {
            this.putQueryParameter("VideoEncPeakKbps", videoEncPeakKbps);
            this.videoEncPeakKbps = videoEncPeakKbps;
            return this;
        }

        /**
         * VideoEncPolicy.
         */
        public Builder videoEncPolicy(String videoEncPolicy) {
            this.putQueryParameter("VideoEncPolicy", videoEncPolicy);
            this.videoEncPolicy = videoEncPolicy;
            return this;
        }

        /**
         * VideoRedirect.
         */
        public Builder videoRedirect(String videoRedirect) {
            this.putQueryParameter("VideoRedirect", videoRedirect);
            this.videoRedirect = videoRedirect;
            return this;
        }

        /**
         * VisualQuality.
         */
        public Builder visualQuality(String visualQuality) {
            this.putQueryParameter("VisualQuality", visualQuality);
            this.visualQuality = visualQuality;
            return this;
        }

        /**
         * Watermark.
         */
        public Builder watermark(String watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        /**
         * WatermarkAntiCam.
         */
        public Builder watermarkAntiCam(String watermarkAntiCam) {
            this.putQueryParameter("WatermarkAntiCam", watermarkAntiCam);
            this.watermarkAntiCam = watermarkAntiCam;
            return this;
        }

        /**
         * WatermarkColor.
         */
        public Builder watermarkColor(Integer watermarkColor) {
            this.putQueryParameter("WatermarkColor", watermarkColor);
            this.watermarkColor = watermarkColor;
            return this;
        }

        /**
         * WatermarkColumnAmount.
         */
        public Builder watermarkColumnAmount(Integer watermarkColumnAmount) {
            this.putQueryParameter("WatermarkColumnAmount", watermarkColumnAmount);
            this.watermarkColumnAmount = watermarkColumnAmount;
            return this;
        }

        /**
         * WatermarkCustomText.
         */
        public Builder watermarkCustomText(String watermarkCustomText) {
            this.putQueryParameter("WatermarkCustomText", watermarkCustomText);
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }

        /**
         * WatermarkDegree.
         */
        public Builder watermarkDegree(Double watermarkDegree) {
            this.putQueryParameter("WatermarkDegree", watermarkDegree);
            this.watermarkDegree = watermarkDegree;
            return this;
        }

        /**
         * WatermarkFontSize.
         */
        public Builder watermarkFontSize(Integer watermarkFontSize) {
            this.putQueryParameter("WatermarkFontSize", watermarkFontSize);
            this.watermarkFontSize = watermarkFontSize;
            return this;
        }

        /**
         * WatermarkFontStyle.
         */
        public Builder watermarkFontStyle(String watermarkFontStyle) {
            this.putQueryParameter("WatermarkFontStyle", watermarkFontStyle);
            this.watermarkFontStyle = watermarkFontStyle;
            return this;
        }

        /**
         * WatermarkPower.
         */
        public Builder watermarkPower(String watermarkPower) {
            this.putQueryParameter("WatermarkPower", watermarkPower);
            this.watermarkPower = watermarkPower;
            return this;
        }

        /**
         * WatermarkRowAmount.
         */
        public Builder watermarkRowAmount(Integer watermarkRowAmount) {
            this.putQueryParameter("WatermarkRowAmount", watermarkRowAmount);
            this.watermarkRowAmount = watermarkRowAmount;
            return this;
        }

        /**
         * WatermarkSecurity.
         */
        public Builder watermarkSecurity(String watermarkSecurity) {
            this.putQueryParameter("WatermarkSecurity", watermarkSecurity);
            this.watermarkSecurity = watermarkSecurity;
            return this;
        }

        /**
         * WatermarkTransparencyValue.
         */
        public Builder watermarkTransparencyValue(Integer watermarkTransparencyValue) {
            this.putQueryParameter("WatermarkTransparencyValue", watermarkTransparencyValue);
            this.watermarkTransparencyValue = watermarkTransparencyValue;
            return this;
        }

        /**
         * WatermarkType.
         */
        public Builder watermarkType(String watermarkType) {
            this.putQueryParameter("WatermarkType", watermarkType);
            this.watermarkType = watermarkType;
            return this;
        }

        /**
         * WuyingKeeper.
         */
        public Builder wuyingKeeper(String wuyingKeeper) {
            this.putQueryParameter("WuyingKeeper", wuyingKeeper);
            this.wuyingKeeper = wuyingKeeper;
            return this;
        }

        /**
         * WyAssistant.
         */
        public Builder wyAssistant(String wyAssistant) {
            this.putQueryParameter("WyAssistant", wyAssistant);
            this.wyAssistant = wyAssistant;
            return this;
        }

        @Override
        public ModifyCenterPolicyRequest build() {
            return new ModifyCenterPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
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
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * Description.
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
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
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
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PortRange.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Type.
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
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
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
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * Status.
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
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
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
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * RedirectType.
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
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("RedirectType")
        private String redirectType;

        private DeviceRules(Builder builder) {
            this.deviceName = builder.deviceName;
            this.devicePid = builder.devicePid;
            this.deviceType = builder.deviceType;
            this.deviceVid = builder.deviceVid;
            this.optCommand = builder.optCommand;
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
            private String redirectType; 

            private Builder() {
            } 

            private Builder(DeviceRules model) {
                this.deviceName = model.deviceName;
                this.devicePid = model.devicePid;
                this.deviceType = model.deviceType;
                this.deviceVid = model.deviceVid;
                this.optCommand = model.optCommand;
                this.redirectType = model.redirectType;
            } 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DevicePid.
             */
            public Builder devicePid(String devicePid) {
                this.devicePid = devicePid;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * DeviceVid.
             */
            public Builder deviceVid(String deviceVid) {
                this.deviceVid = deviceVid;
                return this;
            }

            /**
             * OptCommand.
             */
            public Builder optCommand(String optCommand) {
                this.optCommand = optCommand;
                return this;
            }

            /**
             * RedirectType.
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
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Policy.
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
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * RuleType.
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
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
     */
    public static class RevokeAccessPolicyRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private RevokeAccessPolicyRule(Builder builder) {
            this.cidrIp = builder.cidrIp;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RevokeAccessPolicyRule create() {
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

            private Builder(RevokeAccessPolicyRule model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
            } 

            /**
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public RevokeAccessPolicyRule build() {
                return new RevokeAccessPolicyRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
     */
    public static class RevokeSecurityPolicyRule extends TeaModel {
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

        private RevokeSecurityPolicyRule(Builder builder) {
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

        public static RevokeSecurityPolicyRule create() {
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

            private Builder(RevokeSecurityPolicyRule model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
                this.ipProtocol = model.ipProtocol;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.priority = model.priority;
                this.type = model.type;
            } 

            /**
             * CidrIp.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PortRange.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RevokeSecurityPolicyRule build() {
                return new RevokeSecurityPolicyRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCenterPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyCenterPolicyRequest</p>
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * UsbRedirectType.
             */
            public Builder usbRedirectType(String usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * UsbRuleType.
             */
            public Builder usbRuleType(String usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * VendorId.
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
