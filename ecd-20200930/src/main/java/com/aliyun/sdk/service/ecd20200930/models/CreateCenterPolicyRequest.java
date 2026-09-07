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
    @com.aliyun.core.annotation.NameInMap("AcademicProxy")
    private String academicProxy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminAccess")
    private String adminAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminKeyboardOnFullScreen")
    private String adminKeyboardOnFullScreen;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminKeyboardOnWindows")
    private String adminKeyboardOnWindows;

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
    @com.aliyun.core.annotation.NameInMap("AutoReconnect")
    private String autoReconnect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CameraRedirect")
    private String cameraRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientControlMenu")
    private String clientControlMenu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientCreateSnapshot")
    private String clientCreateSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private java.util.List<ClientType> clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clipboard")
    private String clipboard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClipboardGraineds")
    private java.util.List<ClipboardGraineds> clipboardGraineds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClipboardScope")
    private String clipboardScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColorEnhancement")
    private String colorEnhancement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpdDriveClipboard")
    private String cpdDriveClipboard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuDownGradeDuration")
    private Integer cpuDownGradeDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOverload")
    private String cpuOverload;

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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
    @com.aliyun.core.annotation.NameInMap("DiskOverload")
    private String diskOverload;

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
    @com.aliyun.core.annotation.NameInMap("ExternalDrive")
    private String externalDrive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileMigrate")
    private String fileMigrate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransferAddress")
    private String fileTransferAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransferInSize")
    private Integer fileTransferInSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransferInUnit")
    private String fileTransferInUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransferOutSize")
    private Integer fileTransferOutSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransferOutUnit")
    private String fileTransferOutUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransferSizeLimit")
    private String fileTransferSizeLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransferSpeed")
    private String fileTransferSpeed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileTransferSpeedLocation")
    private String fileTransferSpeedLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuAcceleration")
    private String gpuAcceleration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoverConfigMsg")
    private String hoverConfigMsg;

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
    @com.aliyun.core.annotation.NameInMap("KeyboardControl")
    private String keyboardControl;

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
    @com.aliyun.core.annotation.NameInMap("MemoryOverload")
    private String memoryOverload;

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
    @com.aliyun.core.annotation.NameInMap("MobileSafeMenu")
    private String mobileSafeMenu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileShutdown")
    private String mobileShutdown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileWuyingKeeper")
    private String mobileWuyingKeeper;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileWyAssistant")
    private String mobileWyAssistant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelLibrary")
    private String modelLibrary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiScreen")
    private String multiScreen;

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
    @com.aliyun.core.annotation.NameInMap("PortProxy")
    private String portProxy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrinterAlert")
    private String printerAlert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrinterAlertContent")
    private String printerAlertContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrinterAlertTitle")
    private String printerAlertTitle;

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
    @com.aliyun.core.annotation.NameInMap("RecordEventFileExts")
    private java.util.List<String> recordEventFileExts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordEventFilePaths")
    private java.util.List<String> recordEventFilePaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordEventLevels")
    private java.util.List<RecordEventLevels> recordEventLevels;

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
    @com.aliyun.core.annotation.NameInMap("ResolutionDpi")
    @com.aliyun.core.annotation.Validation(maximum = 400, minimum = 25)
    private Integer resolutionDpi;

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
    @com.aliyun.core.annotation.NameInMap("ScreenDisplayMode")
    private String screenDisplayMode;

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
    @com.aliyun.core.annotation.NameInMap("ThreeScreen")
    private String threeScreen;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsbRedirect")
    private String usbRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsbSupplyRedirectRule")
    private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseTime")
    private String useTime;

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
    @com.aliyun.core.annotation.NameInMap("WatermarkShadow")
    private String watermarkShadow;

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
        this.academicProxy = builder.academicProxy;
        this.adminAccess = builder.adminAccess;
        this.adminKeyboardOnFullScreen = builder.adminKeyboardOnFullScreen;
        this.adminKeyboardOnWindows = builder.adminKeyboardOnWindows;
        this.appContentProtection = builder.appContentProtection;
        this.authorizeAccessPolicyRule = builder.authorizeAccessPolicyRule;
        this.authorizeSecurityPolicyRule = builder.authorizeSecurityPolicyRule;
        this.autoReconnect = builder.autoReconnect;
        this.businessChannel = builder.businessChannel;
        this.businessType = builder.businessType;
        this.cameraRedirect = builder.cameraRedirect;
        this.clientControlMenu = builder.clientControlMenu;
        this.clientCreateSnapshot = builder.clientCreateSnapshot;
        this.clientType = builder.clientType;
        this.clipboard = builder.clipboard;
        this.clipboardGraineds = builder.clipboardGraineds;
        this.clipboardScope = builder.clipboardScope;
        this.colorEnhancement = builder.colorEnhancement;
        this.cpdDriveClipboard = builder.cpdDriveClipboard;
        this.cpuDownGradeDuration = builder.cpuDownGradeDuration;
        this.cpuOverload = builder.cpuOverload;
        this.cpuProcessors = builder.cpuProcessors;
        this.cpuProtectedMode = builder.cpuProtectedMode;
        this.cpuRateLimit = builder.cpuRateLimit;
        this.cpuSampleDuration = builder.cpuSampleDuration;
        this.cpuSingleRateLimit = builder.cpuSingleRateLimit;
        this.description = builder.description;
        this.deviceConnectHint = builder.deviceConnectHint;
        this.deviceRedirects = builder.deviceRedirects;
        this.deviceRules = builder.deviceRules;
        this.disconnectKeepSession = builder.disconnectKeepSession;
        this.disconnectKeepSessionTime = builder.disconnectKeepSessionTime;
        this.diskOverload = builder.diskOverload;
        this.displayMode = builder.displayMode;
        this.domainResolveRule = builder.domainResolveRule;
        this.domainResolveRuleType = builder.domainResolveRuleType;
        this.enableSessionRateLimiting = builder.enableSessionRateLimiting;
        this.endUserApplyAdminCoordinate = builder.endUserApplyAdminCoordinate;
        this.endUserGroupCoordinate = builder.endUserGroupCoordinate;
        this.externalDrive = builder.externalDrive;
        this.fileMigrate = builder.fileMigrate;
        this.fileTransferAddress = builder.fileTransferAddress;
        this.fileTransferInSize = builder.fileTransferInSize;
        this.fileTransferInUnit = builder.fileTransferInUnit;
        this.fileTransferOutSize = builder.fileTransferOutSize;
        this.fileTransferOutUnit = builder.fileTransferOutUnit;
        this.fileTransferSizeLimit = builder.fileTransferSizeLimit;
        this.fileTransferSpeed = builder.fileTransferSpeed;
        this.fileTransferSpeedLocation = builder.fileTransferSpeedLocation;
        this.gpuAcceleration = builder.gpuAcceleration;
        this.hoverConfigMsg = builder.hoverConfigMsg;
        this.html5FileTransfer = builder.html5FileTransfer;
        this.internetCommunicationProtocol = builder.internetCommunicationProtocol;
        this.internetPrinter = builder.internetPrinter;
        this.keyboardControl = builder.keyboardControl;
        this.localDrive = builder.localDrive;
        this.maxReconnectTime = builder.maxReconnectTime;
        this.memoryDownGradeDuration = builder.memoryDownGradeDuration;
        this.memoryOverload = builder.memoryOverload;
        this.memoryProcessors = builder.memoryProcessors;
        this.memoryProtectedMode = builder.memoryProtectedMode;
        this.memoryRateLimit = builder.memoryRateLimit;
        this.memorySampleDuration = builder.memorySampleDuration;
        this.memorySingleRateLimit = builder.memorySingleRateLimit;
        this.mobileRestart = builder.mobileRestart;
        this.mobileSafeMenu = builder.mobileSafeMenu;
        this.mobileShutdown = builder.mobileShutdown;
        this.mobileWuyingKeeper = builder.mobileWuyingKeeper;
        this.mobileWyAssistant = builder.mobileWyAssistant;
        this.modelLibrary = builder.modelLibrary;
        this.multiScreen = builder.multiScreen;
        this.name = builder.name;
        this.netRedirect = builder.netRedirect;
        this.netRedirectRule = builder.netRedirectRule;
        this.noOperationDisconnect = builder.noOperationDisconnect;
        this.noOperationDisconnectTime = builder.noOperationDisconnectTime;
        this.portProxy = builder.portProxy;
        this.printerAlert = builder.printerAlert;
        this.printerAlertContent = builder.printerAlertContent;
        this.printerAlertTitle = builder.printerAlertTitle;
        this.printerRedirect = builder.printerRedirect;
        this.qualityEnhancement = builder.qualityEnhancement;
        this.recordEventDuration = builder.recordEventDuration;
        this.recordEventFileExts = builder.recordEventFileExts;
        this.recordEventFilePaths = builder.recordEventFilePaths;
        this.recordEventLevels = builder.recordEventLevels;
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
        this.resolutionDpi = builder.resolutionDpi;
        this.resolutionHeight = builder.resolutionHeight;
        this.resolutionModel = builder.resolutionModel;
        this.resolutionWidth = builder.resolutionWidth;
        this.resourceType = builder.resourceType;
        this.safeMenu = builder.safeMenu;
        this.scope = builder.scope;
        this.scopeValue = builder.scopeValue;
        this.screenDisplayMode = builder.screenDisplayMode;
        this.sessionMaxRateKbps = builder.sessionMaxRateKbps;
        this.smoothEnhancement = builder.smoothEnhancement;
        this.statusMonitor = builder.statusMonitor;
        this.streamingMode = builder.streamingMode;
        this.targetFps = builder.targetFps;
        this.taskbar = builder.taskbar;
        this.threeScreen = builder.threeScreen;
        this.usbRedirect = builder.usbRedirect;
        this.usbSupplyRedirectRule = builder.usbSupplyRedirectRule;
        this.useTime = builder.useTime;
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
        this.watermarkShadow = builder.watermarkShadow;
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
     * @return academicProxy
     */
    public String getAcademicProxy() {
        return this.academicProxy;
    }

    /**
     * @return adminAccess
     */
    public String getAdminAccess() {
        return this.adminAccess;
    }

    /**
     * @return adminKeyboardOnFullScreen
     */
    public String getAdminKeyboardOnFullScreen() {
        return this.adminKeyboardOnFullScreen;
    }

    /**
     * @return adminKeyboardOnWindows
     */
    public String getAdminKeyboardOnWindows() {
        return this.adminKeyboardOnWindows;
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
     * @return autoReconnect
     */
    public String getAutoReconnect() {
        return this.autoReconnect;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
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
     * @return clientControlMenu
     */
    public String getClientControlMenu() {
        return this.clientControlMenu;
    }

    /**
     * @return clientCreateSnapshot
     */
    public String getClientCreateSnapshot() {
        return this.clientCreateSnapshot;
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
     * @return clipboardGraineds
     */
    public java.util.List<ClipboardGraineds> getClipboardGraineds() {
        return this.clipboardGraineds;
    }

    /**
     * @return clipboardScope
     */
    public String getClipboardScope() {
        return this.clipboardScope;
    }

    /**
     * @return colorEnhancement
     */
    public String getColorEnhancement() {
        return this.colorEnhancement;
    }

    /**
     * @return cpdDriveClipboard
     */
    public String getCpdDriveClipboard() {
        return this.cpdDriveClipboard;
    }

    /**
     * @return cpuDownGradeDuration
     */
    public Integer getCpuDownGradeDuration() {
        return this.cpuDownGradeDuration;
    }

    /**
     * @return cpuOverload
     */
    public String getCpuOverload() {
        return this.cpuOverload;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return diskOverload
     */
    public String getDiskOverload() {
        return this.diskOverload;
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
     * @return externalDrive
     */
    public String getExternalDrive() {
        return this.externalDrive;
    }

    /**
     * @return fileMigrate
     */
    public String getFileMigrate() {
        return this.fileMigrate;
    }

    /**
     * @return fileTransferAddress
     */
    public String getFileTransferAddress() {
        return this.fileTransferAddress;
    }

    /**
     * @return fileTransferInSize
     */
    public Integer getFileTransferInSize() {
        return this.fileTransferInSize;
    }

    /**
     * @return fileTransferInUnit
     */
    public String getFileTransferInUnit() {
        return this.fileTransferInUnit;
    }

    /**
     * @return fileTransferOutSize
     */
    public Integer getFileTransferOutSize() {
        return this.fileTransferOutSize;
    }

    /**
     * @return fileTransferOutUnit
     */
    public String getFileTransferOutUnit() {
        return this.fileTransferOutUnit;
    }

    /**
     * @return fileTransferSizeLimit
     */
    public String getFileTransferSizeLimit() {
        return this.fileTransferSizeLimit;
    }

    /**
     * @return fileTransferSpeed
     */
    public String getFileTransferSpeed() {
        return this.fileTransferSpeed;
    }

    /**
     * @return fileTransferSpeedLocation
     */
    public String getFileTransferSpeedLocation() {
        return this.fileTransferSpeedLocation;
    }

    /**
     * @return gpuAcceleration
     */
    public String getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    /**
     * @return hoverConfigMsg
     */
    public String getHoverConfigMsg() {
        return this.hoverConfigMsg;
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
     * @return keyboardControl
     */
    public String getKeyboardControl() {
        return this.keyboardControl;
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
     * @return memoryOverload
     */
    public String getMemoryOverload() {
        return this.memoryOverload;
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
     * @return mobileSafeMenu
     */
    public String getMobileSafeMenu() {
        return this.mobileSafeMenu;
    }

    /**
     * @return mobileShutdown
     */
    public String getMobileShutdown() {
        return this.mobileShutdown;
    }

    /**
     * @return mobileWuyingKeeper
     */
    public String getMobileWuyingKeeper() {
        return this.mobileWuyingKeeper;
    }

    /**
     * @return mobileWyAssistant
     */
    public String getMobileWyAssistant() {
        return this.mobileWyAssistant;
    }

    /**
     * @return modelLibrary
     */
    public String getModelLibrary() {
        return this.modelLibrary;
    }

    /**
     * @return multiScreen
     */
    public String getMultiScreen() {
        return this.multiScreen;
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
     * @return portProxy
     */
    public String getPortProxy() {
        return this.portProxy;
    }

    /**
     * @return printerAlert
     */
    public String getPrinterAlert() {
        return this.printerAlert;
    }

    /**
     * @return printerAlertContent
     */
    public String getPrinterAlertContent() {
        return this.printerAlertContent;
    }

    /**
     * @return printerAlertTitle
     */
    public String getPrinterAlertTitle() {
        return this.printerAlertTitle;
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
     * @return recordEventFileExts
     */
    public java.util.List<String> getRecordEventFileExts() {
        return this.recordEventFileExts;
    }

    /**
     * @return recordEventFilePaths
     */
    public java.util.List<String> getRecordEventFilePaths() {
        return this.recordEventFilePaths;
    }

    /**
     * @return recordEventLevels
     */
    public java.util.List<RecordEventLevels> getRecordEventLevels() {
        return this.recordEventLevels;
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
     * @return resolutionDpi
     */
    public Integer getResolutionDpi() {
        return this.resolutionDpi;
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
     * @return screenDisplayMode
     */
    public String getScreenDisplayMode() {
        return this.screenDisplayMode;
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
     * @return threeScreen
     */
    public String getThreeScreen() {
        return this.threeScreen;
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
     * @return useTime
     */
    public String getUseTime() {
        return this.useTime;
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
     * @return watermarkShadow
     */
    public String getWatermarkShadow() {
        return this.watermarkShadow;
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
        private String academicProxy; 
        private String adminAccess; 
        private String adminKeyboardOnFullScreen; 
        private String adminKeyboardOnWindows; 
        private String appContentProtection; 
        private java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule; 
        private java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule; 
        private String autoReconnect; 
        private String businessChannel; 
        private Integer businessType; 
        private String cameraRedirect; 
        private String clientControlMenu; 
        private String clientCreateSnapshot; 
        private java.util.List<ClientType> clientType; 
        private String clipboard; 
        private java.util.List<ClipboardGraineds> clipboardGraineds; 
        private String clipboardScope; 
        private String colorEnhancement; 
        private String cpdDriveClipboard; 
        private Integer cpuDownGradeDuration; 
        private String cpuOverload; 
        private java.util.List<String> cpuProcessors; 
        private String cpuProtectedMode; 
        private Integer cpuRateLimit; 
        private Integer cpuSampleDuration; 
        private Integer cpuSingleRateLimit; 
        private String description; 
        private String deviceConnectHint; 
        private java.util.List<DeviceRedirects> deviceRedirects; 
        private java.util.List<DeviceRules> deviceRules; 
        private String disconnectKeepSession; 
        private Integer disconnectKeepSessionTime; 
        private String diskOverload; 
        private String displayMode; 
        private java.util.List<DomainResolveRule> domainResolveRule; 
        private String domainResolveRuleType; 
        private String enableSessionRateLimiting; 
        private String endUserApplyAdminCoordinate; 
        private String endUserGroupCoordinate; 
        private String externalDrive; 
        private String fileMigrate; 
        private String fileTransferAddress; 
        private Integer fileTransferInSize; 
        private String fileTransferInUnit; 
        private Integer fileTransferOutSize; 
        private String fileTransferOutUnit; 
        private String fileTransferSizeLimit; 
        private String fileTransferSpeed; 
        private String fileTransferSpeedLocation; 
        private String gpuAcceleration; 
        private String hoverConfigMsg; 
        private String html5FileTransfer; 
        private String internetCommunicationProtocol; 
        private String internetPrinter; 
        private String keyboardControl; 
        private String localDrive; 
        private Integer maxReconnectTime; 
        private Integer memoryDownGradeDuration; 
        private String memoryOverload; 
        private java.util.List<String> memoryProcessors; 
        private String memoryProtectedMode; 
        private Integer memoryRateLimit; 
        private Integer memorySampleDuration; 
        private Integer memorySingleRateLimit; 
        private String mobileRestart; 
        private String mobileSafeMenu; 
        private String mobileShutdown; 
        private String mobileWuyingKeeper; 
        private String mobileWyAssistant; 
        private String modelLibrary; 
        private String multiScreen; 
        private String name; 
        private String netRedirect; 
        private java.util.List<NetRedirectRule> netRedirectRule; 
        private String noOperationDisconnect; 
        private Integer noOperationDisconnectTime; 
        private String portProxy; 
        private String printerAlert; 
        private String printerAlertContent; 
        private String printerAlertTitle; 
        private String printerRedirect; 
        private String qualityEnhancement; 
        private Integer recordEventDuration; 
        private java.util.List<String> recordEventFileExts; 
        private java.util.List<String> recordEventFilePaths; 
        private java.util.List<RecordEventLevels> recordEventLevels; 
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
        private Integer resolutionDpi; 
        private Integer resolutionHeight; 
        private String resolutionModel; 
        private Integer resolutionWidth; 
        private String resourceType; 
        private String safeMenu; 
        private String scope; 
        private java.util.List<String> scopeValue; 
        private String screenDisplayMode; 
        private Integer sessionMaxRateKbps; 
        private String smoothEnhancement; 
        private String statusMonitor; 
        private String streamingMode; 
        private Integer targetFps; 
        private String taskbar; 
        private String threeScreen; 
        private String usbRedirect; 
        private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule; 
        private String useTime; 
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
        private String watermarkShadow; 
        private Integer watermarkTransparencyValue; 
        private String watermarkType; 
        private String wuyingKeeper; 
        private String wyAssistant; 

        private Builder() {
            super();
        } 

        private Builder(CreateCenterPolicyRequest request) {
            super(request);
            this.academicProxy = request.academicProxy;
            this.adminAccess = request.adminAccess;
            this.adminKeyboardOnFullScreen = request.adminKeyboardOnFullScreen;
            this.adminKeyboardOnWindows = request.adminKeyboardOnWindows;
            this.appContentProtection = request.appContentProtection;
            this.authorizeAccessPolicyRule = request.authorizeAccessPolicyRule;
            this.authorizeSecurityPolicyRule = request.authorizeSecurityPolicyRule;
            this.autoReconnect = request.autoReconnect;
            this.businessChannel = request.businessChannel;
            this.businessType = request.businessType;
            this.cameraRedirect = request.cameraRedirect;
            this.clientControlMenu = request.clientControlMenu;
            this.clientCreateSnapshot = request.clientCreateSnapshot;
            this.clientType = request.clientType;
            this.clipboard = request.clipboard;
            this.clipboardGraineds = request.clipboardGraineds;
            this.clipboardScope = request.clipboardScope;
            this.colorEnhancement = request.colorEnhancement;
            this.cpdDriveClipboard = request.cpdDriveClipboard;
            this.cpuDownGradeDuration = request.cpuDownGradeDuration;
            this.cpuOverload = request.cpuOverload;
            this.cpuProcessors = request.cpuProcessors;
            this.cpuProtectedMode = request.cpuProtectedMode;
            this.cpuRateLimit = request.cpuRateLimit;
            this.cpuSampleDuration = request.cpuSampleDuration;
            this.cpuSingleRateLimit = request.cpuSingleRateLimit;
            this.description = request.description;
            this.deviceConnectHint = request.deviceConnectHint;
            this.deviceRedirects = request.deviceRedirects;
            this.deviceRules = request.deviceRules;
            this.disconnectKeepSession = request.disconnectKeepSession;
            this.disconnectKeepSessionTime = request.disconnectKeepSessionTime;
            this.diskOverload = request.diskOverload;
            this.displayMode = request.displayMode;
            this.domainResolveRule = request.domainResolveRule;
            this.domainResolveRuleType = request.domainResolveRuleType;
            this.enableSessionRateLimiting = request.enableSessionRateLimiting;
            this.endUserApplyAdminCoordinate = request.endUserApplyAdminCoordinate;
            this.endUserGroupCoordinate = request.endUserGroupCoordinate;
            this.externalDrive = request.externalDrive;
            this.fileMigrate = request.fileMigrate;
            this.fileTransferAddress = request.fileTransferAddress;
            this.fileTransferInSize = request.fileTransferInSize;
            this.fileTransferInUnit = request.fileTransferInUnit;
            this.fileTransferOutSize = request.fileTransferOutSize;
            this.fileTransferOutUnit = request.fileTransferOutUnit;
            this.fileTransferSizeLimit = request.fileTransferSizeLimit;
            this.fileTransferSpeed = request.fileTransferSpeed;
            this.fileTransferSpeedLocation = request.fileTransferSpeedLocation;
            this.gpuAcceleration = request.gpuAcceleration;
            this.hoverConfigMsg = request.hoverConfigMsg;
            this.html5FileTransfer = request.html5FileTransfer;
            this.internetCommunicationProtocol = request.internetCommunicationProtocol;
            this.internetPrinter = request.internetPrinter;
            this.keyboardControl = request.keyboardControl;
            this.localDrive = request.localDrive;
            this.maxReconnectTime = request.maxReconnectTime;
            this.memoryDownGradeDuration = request.memoryDownGradeDuration;
            this.memoryOverload = request.memoryOverload;
            this.memoryProcessors = request.memoryProcessors;
            this.memoryProtectedMode = request.memoryProtectedMode;
            this.memoryRateLimit = request.memoryRateLimit;
            this.memorySampleDuration = request.memorySampleDuration;
            this.memorySingleRateLimit = request.memorySingleRateLimit;
            this.mobileRestart = request.mobileRestart;
            this.mobileSafeMenu = request.mobileSafeMenu;
            this.mobileShutdown = request.mobileShutdown;
            this.mobileWuyingKeeper = request.mobileWuyingKeeper;
            this.mobileWyAssistant = request.mobileWyAssistant;
            this.modelLibrary = request.modelLibrary;
            this.multiScreen = request.multiScreen;
            this.name = request.name;
            this.netRedirect = request.netRedirect;
            this.netRedirectRule = request.netRedirectRule;
            this.noOperationDisconnect = request.noOperationDisconnect;
            this.noOperationDisconnectTime = request.noOperationDisconnectTime;
            this.portProxy = request.portProxy;
            this.printerAlert = request.printerAlert;
            this.printerAlertContent = request.printerAlertContent;
            this.printerAlertTitle = request.printerAlertTitle;
            this.printerRedirect = request.printerRedirect;
            this.qualityEnhancement = request.qualityEnhancement;
            this.recordEventDuration = request.recordEventDuration;
            this.recordEventFileExts = request.recordEventFileExts;
            this.recordEventFilePaths = request.recordEventFilePaths;
            this.recordEventLevels = request.recordEventLevels;
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
            this.resolutionDpi = request.resolutionDpi;
            this.resolutionHeight = request.resolutionHeight;
            this.resolutionModel = request.resolutionModel;
            this.resolutionWidth = request.resolutionWidth;
            this.resourceType = request.resourceType;
            this.safeMenu = request.safeMenu;
            this.scope = request.scope;
            this.scopeValue = request.scopeValue;
            this.screenDisplayMode = request.screenDisplayMode;
            this.sessionMaxRateKbps = request.sessionMaxRateKbps;
            this.smoothEnhancement = request.smoothEnhancement;
            this.statusMonitor = request.statusMonitor;
            this.streamingMode = request.streamingMode;
            this.targetFps = request.targetFps;
            this.taskbar = request.taskbar;
            this.threeScreen = request.threeScreen;
            this.usbRedirect = request.usbRedirect;
            this.usbSupplyRedirectRule = request.usbSupplyRedirectRule;
            this.useTime = request.useTime;
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
            this.watermarkShadow = request.watermarkShadow;
            this.watermarkTransparencyValue = request.watermarkTransparencyValue;
            this.watermarkType = request.watermarkType;
            this.wuyingKeeper = request.wuyingKeeper;
            this.wyAssistant = request.wyAssistant;
        } 

        /**
         * <p>Specifies whether to enable the academic proxy feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder academicProxy(String academicProxy) {
            this.putQueryParameter("AcademicProxy", academicProxy);
            this.academicProxy = academicProxy;
            return this;
        }

        /**
         * <p>Specifies whether the user has administrator permissions after logging on to the cloud desktop.</p>
         * <blockquote>
         * <p>This feature is in invitational preview and is not publicly available.</p>
         * </blockquote>
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
         * <p>Specifies whether to enable administrator keyboard control in full-screen mode. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder adminKeyboardOnFullScreen(String adminKeyboardOnFullScreen) {
            this.putQueryParameter("AdminKeyboardOnFullScreen", adminKeyboardOnFullScreen);
            this.adminKeyboardOnFullScreen = adminKeyboardOnFullScreen;
            return this;
        }

        /**
         * <p>Specifies whether to enable administrator keyboard control within the Windows system. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder adminKeyboardOnWindows(String adminKeyboardOnWindows) {
            this.putQueryParameter("AdminKeyboardOnWindows", adminKeyboardOnWindows);
            this.adminKeyboardOnWindows = adminKeyboardOnWindows;
            return this;
        }

        /**
         * <p>Specifies whether to enable the screenshot prevention feature.</p>
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
         * <p>The client IP whitelist. After configuration, only IP addresses within the whitelisted CIDR blocks can access cloud computers.</p>
         */
        public Builder authorizeAccessPolicyRule(java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
            this.putQueryParameter("AuthorizeAccessPolicyRule", authorizeAccessPolicyRule);
            this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
            return this;
        }

        /**
         * <p>The list of security group control rules.</p>
         */
        public Builder authorizeSecurityPolicyRule(java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
            this.putQueryParameter("AuthorizeSecurityPolicyRule", authorizeSecurityPolicyRule);
            this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic reconnection on the client.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder autoReconnect(String autoReconnect) {
            this.putQueryParameter("AutoReconnect", autoReconnect);
            this.autoReconnect = autoReconnect;
            return this;
        }

        /**
         * <p>The business channel. Valid values:
         * Enterprise: Enterprise Edition.
         * Business: Business Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The business type.</p>
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
         * <p>The local camera redirection policy. This parameter takes effect only when no local camera redirection policy is specified in DeviceRedirects.</p>
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
         * <p>Specifies whether to display the client control menu. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder clientControlMenu(String clientControlMenu) {
            this.putQueryParameter("ClientControlMenu", clientControlMenu);
            this.clientControlMenu = clientControlMenu;
            return this;
        }

        /**
         * <p>Specifies whether to enable the custom snapshot creation feature on the client. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder clientCreateSnapshot(String clientCreateSnapshot) {
            this.putQueryParameter("ClientCreateSnapshot", clientCreateSnapshot);
            this.clientCreateSnapshot = clientCreateSnapshot;
            return this;
        }

        /**
         * <p>The list of logon method control rules. Specifies which client types can access cloud computers.</p>
         */
        public Builder clientType(java.util.List<ClientType> clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The clipboard permission.</p>
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
         * <p>The clipboard fine-grained control configuration.</p>
         */
        public Builder clipboardGraineds(java.util.List<ClipboardGraineds> clipboardGraineds) {
            this.putQueryParameter("ClipboardGraineds", clipboardGraineds);
            this.clipboardGraineds = clipboardGraineds;
            return this;
        }

        /**
         * <p>The clipboard scope.</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        public Builder clipboardScope(String clipboardScope) {
            this.putQueryParameter("ClipboardScope", clipboardScope);
            this.clipboardScope = clipboardScope;
            return this;
        }

        /**
         * <p>Specifies whether color enhancement is enabled for the design and 3D common scenarios.</p>
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
         * <p>Specifies whether to enable the local drive clipboard feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder cpdDriveClipboard(String cpdDriveClipboard) {
            this.putQueryParameter("CpdDriveClipboard", cpdDriveClipboard);
            this.cpdDriveClipboard = cpdDriveClipboard;
            return this;
        }

        /**
         * <p>The CPU throttling duration. Valid values: 30 to 120. Unit: seconds.</p>
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
         * <p>Specifies whether to enable CPU overload protection. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder cpuOverload(String cpuOverload) {
            this.putQueryParameter("CpuOverload", cpuOverload);
            this.cpuOverload = cpuOverload;
            return this;
        }

        /**
         * <p>The process name.</p>
         */
        public Builder cpuProcessors(java.util.List<String> cpuProcessors) {
            this.putQueryParameter("CpuProcessors", cpuProcessors);
            this.cpuProcessors = cpuProcessors;
            return this;
        }

        /**
         * <p>Specifies whether to enable CPU spike protection.</p>
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
         * <p>The overall CPU usage percentage. Valid values: 70 to 90.</p>
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
         * <p>The single-core CPU usage percentage. Valid values: 70 to 100.</p>
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
         * <p>The description of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>newDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The peripheral connection prompt control.</p>
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
         * <p>The list of device redirection rules.</p>
         */
        public Builder deviceRedirects(java.util.List<DeviceRedirects> deviceRedirects) {
            this.putQueryParameter("DeviceRedirects", deviceRedirects);
            this.deviceRedirects = deviceRedirects;
            return this;
        }

        /**
         * <p>The list of custom peripheral rules.</p>
         */
        public Builder deviceRules(java.util.List<DeviceRules> deviceRules) {
            this.putQueryParameter("DeviceRules", deviceRules);
            this.deviceRules = deviceRules;
            return this;
        }

        /**
         * <p>Session retention after disconnection.</p>
         * <blockquote>
         * <p>Applicable only to cloud application policies.</p>
         * </blockquote>
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
         * <p>The duration of session retention after disconnection. Valid values: 30 to 7200. Unit: seconds.</p>
         * <blockquote>
         * <p>Applicable only to cloud application policies.</p>
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
         * <p>Specifies whether to enable disk overload protection. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder diskOverload(String diskOverload) {
            this.putQueryParameter("DiskOverload", diskOverload);
            this.diskOverload = diskOverload;
            return this;
        }

        /**
         * <p>The display mode.</p>
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
         * <p>The domain name resolution policies.</p>
         */
        public Builder domainResolveRule(java.util.List<DomainResolveRule> domainResolveRule) {
            this.putQueryParameter("DomainResolveRule", domainResolveRule);
            this.domainResolveRule = domainResolveRule;
            return this;
        }

        /**
         * <p>The domain name resolution policy type.</p>
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
         * <p>Specifies whether to enable session bandwidth throttling.</p>
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
         * <p>Specifies whether users can request administrator assistance.</p>
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
         * <p>Specifies whether users in the same office network can share cloud desktops.</p>
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
         * <p>Specifies whether to enable external storage device access. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder externalDrive(String externalDrive) {
            this.putQueryParameter("ExternalDrive", externalDrive);
            this.externalDrive = externalDrive;
            return this;
        }

        /**
         * <p>The file migration setting.</p>
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
         * <p>The service address for the file transfer feature.</p>
         * 
         * <strong>example:</strong>
         * <p>filetransfer.example.com</p>
         */
        public Builder fileTransferAddress(String fileTransferAddress) {
            this.putQueryParameter("FileTransferAddress", fileTransferAddress);
            this.fileTransferAddress = fileTransferAddress;
            return this;
        }

        /**
         * <p>The file size limit for a single transfer to the cloud desktop. Use this parameter together with the transfer-in unit parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder fileTransferInSize(Integer fileTransferInSize) {
            this.putQueryParameter("FileTransferInSize", fileTransferInSize);
            this.fileTransferInSize = fileTransferInSize;
            return this;
        }

        /**
         * <p>The unit for the file size limit of a single transfer to the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        public Builder fileTransferInUnit(String fileTransferInUnit) {
            this.putQueryParameter("FileTransferInUnit", fileTransferInUnit);
            this.fileTransferInUnit = fileTransferInUnit;
            return this;
        }

        /**
         * <p>The file size limit for a single transfer from the cloud desktop. Use this parameter together with the transfer-out unit parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder fileTransferOutSize(Integer fileTransferOutSize) {
            this.putQueryParameter("FileTransferOutSize", fileTransferOutSize);
            this.fileTransferOutSize = fileTransferOutSize;
            return this;
        }

        /**
         * <p>The unit for the file size limit of a single transfer from the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        public Builder fileTransferOutUnit(String fileTransferOutUnit) {
            this.putQueryParameter("FileTransferOutUnit", fileTransferOutUnit);
            this.fileTransferOutUnit = fileTransferOutUnit;
            return this;
        }

        /**
         * <p>Specifies whether to enable the file transfer size limit. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder fileTransferSizeLimit(String fileTransferSizeLimit) {
            this.putQueryParameter("FileTransferSizeLimit", fileTransferSizeLimit);
            this.fileTransferSizeLimit = fileTransferSizeLimit;
            return this;
        }

        /**
         * <p>The file transfer speed level.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder fileTransferSpeed(String fileTransferSpeed) {
            this.putQueryParameter("FileTransferSpeed", fileTransferSpeed);
            this.fileTransferSpeed = fileTransferSpeed;
            return this;
        }

        /**
         * <p>The location where the file transfer speed configured on the client takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>client</p>
         */
        public Builder fileTransferSpeedLocation(String fileTransferSpeedLocation) {
            this.putQueryParameter("FileTransferSpeedLocation", fileTransferSpeedLocation);
            this.fileTransferSpeedLocation = fileTransferSpeedLocation;
            return this;
        }

        /**
         * <p>Specifies whether to enable the image quality policy for GPU-accelerated Cloud Desktops. Enable this policy when high performance and user experience are required, such as in professional design scenarios.</p>
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
         * <p>Specifies whether to enable the floating ball configuration message prompt. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder hoverConfigMsg(String hoverConfigMsg) {
            this.putQueryParameter("HoverConfigMsg", hoverConfigMsg);
            this.hoverConfigMsg = hoverConfigMsg;
            return this;
        }

        /**
         * <p>The file transfer policy for the web client.</p>
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
         * <p>The network communication protocol.</p>
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
         * <p>Specifies whether to enable the network printer feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder internetPrinter(String internetPrinter) {
            this.putQueryParameter("InternetPrinter", internetPrinter);
            this.internetPrinter = internetPrinter;
            return this;
        }

        /**
         * <p>Specifies whether to enable the floating ball keyboard control. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder keyboardControl(String keyboardControl) {
            this.putQueryParameter("KeyboardControl", keyboardControl);
            this.keyboardControl = keyboardControl;
            return this;
        }

        /**
         * <p>The local disk mapping permission.</p>
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
         * <p>The maximum reconnection retry time when a cloud computer is disconnected due to external reasons. Valid values: 30 to 7200. Unit: seconds.</p>
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
         * <p>The memory throttling duration of a single process. Valid values: 30 to 120. Unit: seconds.</p>
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
         * <p>Specifies whether to enable memory overload protection. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder memoryOverload(String memoryOverload) {
            this.putQueryParameter("MemoryOverload", memoryOverload);
            this.memoryOverload = memoryOverload;
            return this;
        }

        /**
         * <p>The process name.</p>
         */
        public Builder memoryProcessors(java.util.List<String> memoryProcessors) {
            this.putQueryParameter("MemoryProcessors", memoryProcessors);
            this.memoryProcessors = memoryProcessors;
            return this;
        }

        /**
         * <p>Specifies whether to enable memory protection.</p>
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
         * <p>The overall memory usage percentage. Valid values: 70 to 90.</p>
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
         * <p>The memory usage percentage of a single process. Valid values: 30 to 60.</p>
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
         * <p>Specifies whether to provide a restart button in the cloud desktop floating ball when connecting to the cloud desktop from a mobile client (Android client&lt;props=&quot;china&quot;&gt; and iOS client).</p>
         * <blockquote>
         * <p>This parameter applies only to mobile clients V7.4 or later.</p>
         * </blockquote>
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
         * <p>Specifies whether to enable Windows security control on mobile devices.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder mobileSafeMenu(String mobileSafeMenu) {
            this.putQueryParameter("MobileSafeMenu", mobileSafeMenu);
            this.mobileSafeMenu = mobileSafeMenu;
            return this;
        }

        /**
         * <p>Specifies whether to provide a shutdown button in the cloud desktop floating ball from a mobile client (Android client&lt;props=&quot;china&quot;&gt; and iOS client).</p>
         * <blockquote>
         * <p>This parameter applies only to mobile clients V7.4 or later.</p>
         * </blockquote>
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
         * <p>Specifies whether to enable WUYING Keeper on mobile devices.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder mobileWuyingKeeper(String mobileWuyingKeeper) {
            this.putQueryParameter("MobileWuyingKeeper", mobileWuyingKeeper);
            this.mobileWuyingKeeper = mobileWuyingKeeper;
            return this;
        }

        /**
         * <p>Specifies whether to enable WY Assistant on mobile devices.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder mobileWyAssistant(String mobileWyAssistant) {
            this.putQueryParameter("MobileWyAssistant", mobileWyAssistant);
            this.mobileWyAssistant = mobileWyAssistant;
            return this;
        }

        /**
         * <p>Specifies whether to enable the model library feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder modelLibrary(String modelLibrary) {
            this.putQueryParameter("ModelLibrary", modelLibrary);
            this.modelLibrary = modelLibrary;
            return this;
        }

        /**
         * <p>Specifies whether to enable the multi-screen display feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder multiScreen(String multiScreen) {
            this.putQueryParameter("MultiScreen", multiScreen);
            this.multiScreen = multiScreen;
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
         * <p>Specifies whether to enable network redirection.</p>
         * <blockquote>
         * <p>This feature is in invitational preview and is not publicly available.</p>
         * </blockquote>
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
         * <p>The details of the network redirect policy.</p>
         * <blockquote>
         * <p>This feature is in invitational preview and is not publicly available.</p>
         * </blockquote>
         */
        public Builder netRedirectRule(java.util.List<NetRedirectRule> netRedirectRule) {
            this.putQueryParameter("NetRedirectRule", netRedirectRule);
            this.netRedirectRule = netRedirectRule;
            return this;
        }

        /**
         * <p>Disconnect on no operation.</p>
         * <blockquote>
         * <p>Applicable only to cloud application policies.</p>
         * </blockquote>
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
         * <p>The duration of inactivity before disconnection. Valid values: 120 to 7200. Unit: seconds.</p>
         * <blockquote>
         * <p>Applicable only to cloud application policies.</p>
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
         * <p>Specifies whether to enable the port proxy feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder portProxy(String portProxy) {
            this.putQueryParameter("PortProxy", portProxy);
            this.portProxy = portProxy;
            return this;
        }

        /**
         * <p>The printer pop-up prompt setting. Valid values:</p>
         * <ul>
         * <li>default: Default value.</li>
         * <li>off: Disabled.</li>
         * <li>custom: Custom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder printerAlert(String printerAlert) {
            this.putQueryParameter("PrinterAlert", printerAlert);
            this.printerAlert = printerAlert;
            return this;
        }

        /**
         * <p>The content of the printer pop-up prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Print Content</p>
         */
        public Builder printerAlertContent(String printerAlertContent) {
            this.putQueryParameter("PrinterAlertContent", printerAlertContent);
            this.printerAlertContent = printerAlertContent;
            return this;
        }

        /**
         * <p>The title of the printer pop-up prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Print Title</p>
         */
        public Builder printerAlertTitle(String printerAlertTitle) {
            this.putQueryParameter("PrinterAlertTitle", printerAlertTitle);
            this.printerAlertTitle = printerAlertTitle;
            return this;
        }

        /**
         * <p>The printer redirection policy. This parameter takes effect only when no printer redirection policy is specified in DeviceRedirects.</p>
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
         * <p>Specifies whether image quality enhancement is enabled for the design and 3D common scenarios.</p>
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
         * <p>The duration of screen recording after an event is detected in screen recording audits. Unit: minutes. Valid values: 10 to 60.</p>
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
         * <p>The file name extensions for screen recording events.</p>
         */
        public Builder recordEventFileExts(java.util.List<String> recordEventFileExts) {
            this.putQueryParameter("RecordEventFileExts", recordEventFileExts);
            this.recordEventFileExts = recordEventFileExts;
            return this;
        }

        /**
         * <p>The absolute paths for file monitoring in screen recording audits.</p>
         */
        public Builder recordEventFilePaths(java.util.List<String> recordEventFilePaths) {
            this.putQueryParameter("RecordEventFilePaths", recordEventFilePaths);
            this.recordEventFilePaths = recordEventFilePaths;
            return this;
        }

        /**
         * <p>The levels of screen recording events.</p>
         */
        public Builder recordEventLevels(java.util.List<RecordEventLevels> recordEventLevels) {
            this.putQueryParameter("RecordEventLevels", recordEventLevels);
            this.recordEventLevels = recordEventLevels;
            return this;
        }

        /**
         * <p>The absolute paths for registry monitoring in screen recording audits.</p>
         */
        public Builder recordEventRegisters(java.util.List<String> recordEventRegisters) {
            this.putQueryParameter("RecordEventRegisters", recordEventRegisters);
            this.recordEventRegisters = recordEventRegisters;
            return this;
        }

        /**
         * <p>The list of screen recording events.</p>
         */
        public Builder recordEvents(java.util.List<String> recordEvents) {
            this.putQueryParameter("RecordEvents", recordEvents);
            this.recordEvents = recordEvents;
            return this;
        }

        /**
         * <p>Specifies whether to enable screen recording.</p>
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
         * <p>The option for recording cloud desktop audio.</p>
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
         * <p>The duration of each screen recording file, in minutes. Recording files are automatically split and uploaded to the storage space based on the specified duration. Files are rolled over when they reach 300 MB. Valid values: 10 to 60.</p>
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
         * <p>The end time of screen recording. Format: HH:MM:SS. This parameter is meaningful only when <code>Recording</code> is set to <code>PERIOD</code>.</p>
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
         * <p>The retention period of screen recording files. Valid values: 1 to 180. Unit: days.</p>
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
         * <p>The screen recording frame rate. Unit: FPS (frames per second).</p>
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
         * <p>The start time of screen recording. Format: HH:MM:SS. This parameter is meaningful only when <code>Recording</code> is set to <code>PERIOD</code>.</p>
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
         * <p>Specifies whether to notify end users that screen recording is enabled.</p>
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
         * <p>The notification message displayed to end users when screen recording is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Screen recording is enabled</p>
         */
        public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
            this.putQueryParameter("RecordingUserNotifyMessage", recordingUserNotifyMessage);
            this.recordingUserNotifyMessage = recordingUserNotifyMessage;
            return this;
        }

        /**
         * <p>The region ID. This feature is region-independent. Set this parameter to cn-shanghai.</p>
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
         * <p>The keyboard and mouse control permission during remote assistance.</p>
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
         * <p>Resets the cloud desktop.</p>
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
         * <p>The DPI value of the screen resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder resolutionDpi(Integer resolutionDpi) {
            this.putQueryParameter("ResolutionDpi", resolutionDpi);
            this.resolutionDpi = resolutionDpi;
            return this;
        }

        /**
         * <p>The height of the resolution. Unit: pixels. Valid values for cloud applications: 500 to 50000. Valid values for cloud desktops: 480 to 4096.</p>
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
         * <p>The width of the resolution. Unit: pixels. Valid values for cloud applications: 500 to 50000. Valid values for cloud desktops: 640 to 4096.</p>
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
         * <p>Specifies whether to enable the security center shortcut key. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder safeMenu(String safeMenu) {
            this.putQueryParameter("SafeMenu", safeMenu);
            this.safeMenu = safeMenu;
            return this;
        }

        /**
         * <p>The scope of the policy.</p>
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
         * <p>The value to specify when <code>Scope</code> is set to <code>IP</code>. This parameter takes effect only when <code>Scope</code> is set to <code>IP</code>.</p>
         */
        public Builder scopeValue(java.util.List<String> scopeValue) {
            this.putQueryParameter("ScopeValue", scopeValue);
            this.scopeValue = scopeValue;
            return this;
        }

        /**
         * <p>The screen display mode.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder screenDisplayMode(String screenDisplayMode) {
            this.putQueryParameter("ScreenDisplayMode", screenDisplayMode);
            this.screenDisplayMode = screenDisplayMode;
            return this;
        }

        /**
         * <p>The maximum value of session bandwidth throttling. Unit: Kbps. Valid values: 2000 to 100000.</p>
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
         * <p>Specifies whether to enable smoothness enhancement for the daily office scenario.</p>
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
         * <p>Specifies whether to provide a status monitoring entry in the cloud desktop floating ball.</p>
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
         * <p>The streaming mode scenario.</p>
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
         * <p>The application taskbar.</p>
         * <blockquote>
         * <p>This parameter applies only to cloud application policies.</p>
         * </blockquote>
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
         * <p>Specifies whether to enable the three-screen feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder threeScreen(String threeScreen) {
            this.putQueryParameter("ThreeScreen", threeScreen);
            this.threeScreen = threeScreen;
            return this;
        }

        /**
         * <p>The USB redirection policy.</p>
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
         * <p>Specifies whether to display the usage duration on the floating ball. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder useTime(String useTime) {
            this.putQueryParameter("UseTime", useTime);
            this.useTime = useTime;
            return this;
        }

        /**
         * <p>The average bitrate for video encoding. Unit: Kbps. Valid values: 1000 to 50000.</p>
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
         * <p>The maximum QP for video encoding, which represents the lowest quality. Valid values: 0 to 51.</p>
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
         * <p>The minimum QP for video encoding, which represents the highest quality. Valid values: 0 to 51.</p>
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
         * <p>The peak video encoding bitrate. Unit: Kbps. Valid values: 1000 to 50000.</p>
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
         * <p>The image display quality policy.</p>
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
         * <p>The invisible watermark anti-camera capture feature.</p>
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
         * <p>The watermark font color. Valid values: 0 to 16777215.</p>
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
         * <p>If the <code>WatermarkType</code> parameter is set to <code>custom</code>, you must also specify the custom text content by using the <code>WatermarkCustomText</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal Document</p>
         */
        public Builder watermarkCustomText(String watermarkCustomText) {
            this.putQueryParameter("WatermarkCustomText", watermarkCustomText);
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }

        /**
         * <p>The watermark tilt angle. Valid values: -10 to -30.</p>
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
         * <p>The watermark font size. Valid values: 10 to 20.</p>
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
         * <p>The watermark font style.</p>
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
         * <p>The invisible watermark enhancement feature.</p>
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
         * <p>The invisible watermark security priority rule.</p>
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
         * <p>Specifies whether to enable the watermark shadow effect. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder watermarkShadow(String watermarkShadow) {
            this.putQueryParameter("WatermarkShadow", watermarkShadow);
            this.watermarkShadow = watermarkShadow;
            return this;
        }

        /**
         * <p>The watermark opacity. A larger value indicates lower transparency. Valid values: 10 to 100.</p>
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
         * <p>The watermark type. You can specify up to three types, separated by commas (,).</p>
         * <blockquote>
         * <p>If you set this parameter to <code>custom</code>, you must also specify the custom text content by using the <code>WatermarkCustomText</code> parameter.</p>
         * </blockquote>
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
         * <p>The WUYING Keeper switch.</p>
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
         * <p>Specifies whether to provide the WUYING AI Assistant entry in the floating ball when connecting to a cloud computer through a desktop client (including Windows client and macOS client).</p>
         * <blockquote>
         * <p>This feature applies only to desktop clients of V7.7 or later.</p>
         * </blockquote>
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
             * <p>The client access IP address range. The value is an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/16</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the client IP whitelist entry.</p>
             * 
             * <strong>example:</strong>
             * <p>Company office network segment</p>
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
             * <p>The object of the security group control rule. The value is an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX/8</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the security group control rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow access to the internal R&amp;D environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The protocol type of the security group control rule.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The authorization policy of the security group control rule.</p>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The port range of the security group control rule. The port range is determined by the value of the protocol (IpProtocol):</p>
             * <ul>
             * <li>TCP or UDP: Valid values: 1 to 65535. Separate the start port and end port with a forward slash (/). Example: 1/200.</li>
             * <li>ICMP: -1/-1.</li>
             * <li>GRE: -1/-1.</li>
             * <li>If IpProtocol is set to all: -1/-1.</li>
             * </ul>
             * <p>For common ports of typical applications, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>22/22</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the security group control rule. A smaller value indicates a higher priority.<br>Valid values: 1 to 60.<br>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The direction of the security group control rule.</p>
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
             * <p>The client type for logon method control.</p>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>Specifies whether to allow a specific type of client to log on to cloud computers.</p>
             * <blockquote>
             * <p>If you do not set the <code>ClientType</code> parameters, all client types are allowed to log on to cloud computers by default.</p>
             * </blockquote>
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
    public static class ClipboardGraineds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipboardSize")
        private Integer clipboardSize;

        @com.aliyun.core.annotation.NameInMap("ClipboardSizeUnit")
        private String clipboardSizeUnit;

        @com.aliyun.core.annotation.NameInMap("ClipboardType")
        private String clipboardType;

        @com.aliyun.core.annotation.NameInMap("GrainedType")
        private String grainedType;

        @com.aliyun.core.annotation.NameInMap("InClipboardSize")
        private Integer inClipboardSize;

        @com.aliyun.core.annotation.NameInMap("InClipboardSizeUnit")
        private String inClipboardSizeUnit;

        @com.aliyun.core.annotation.NameInMap("OutClipboardSize")
        private Integer outClipboardSize;

        @com.aliyun.core.annotation.NameInMap("OutClipboardSizeUnit")
        private String outClipboardSizeUnit;

        private ClipboardGraineds(Builder builder) {
            this.clipboardSize = builder.clipboardSize;
            this.clipboardSizeUnit = builder.clipboardSizeUnit;
            this.clipboardType = builder.clipboardType;
            this.grainedType = builder.grainedType;
            this.inClipboardSize = builder.inClipboardSize;
            this.inClipboardSizeUnit = builder.inClipboardSizeUnit;
            this.outClipboardSize = builder.outClipboardSize;
            this.outClipboardSizeUnit = builder.outClipboardSizeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipboardGraineds create() {
            return builder().build();
        }

        /**
         * @return clipboardSize
         */
        public Integer getClipboardSize() {
            return this.clipboardSize;
        }

        /**
         * @return clipboardSizeUnit
         */
        public String getClipboardSizeUnit() {
            return this.clipboardSizeUnit;
        }

        /**
         * @return clipboardType
         */
        public String getClipboardType() {
            return this.clipboardType;
        }

        /**
         * @return grainedType
         */
        public String getGrainedType() {
            return this.grainedType;
        }

        /**
         * @return inClipboardSize
         */
        public Integer getInClipboardSize() {
            return this.inClipboardSize;
        }

        /**
         * @return inClipboardSizeUnit
         */
        public String getInClipboardSizeUnit() {
            return this.inClipboardSizeUnit;
        }

        /**
         * @return outClipboardSize
         */
        public Integer getOutClipboardSize() {
            return this.outClipboardSize;
        }

        /**
         * @return outClipboardSizeUnit
         */
        public String getOutClipboardSizeUnit() {
            return this.outClipboardSizeUnit;
        }

        public static final class Builder {
            private Integer clipboardSize; 
            private String clipboardSizeUnit; 
            private String clipboardType; 
            private String grainedType; 
            private Integer inClipboardSize; 
            private String inClipboardSizeUnit; 
            private Integer outClipboardSize; 
            private String outClipboardSizeUnit; 

            private Builder() {
            } 

            private Builder(ClipboardGraineds model) {
                this.clipboardSize = model.clipboardSize;
                this.clipboardSizeUnit = model.clipboardSizeUnit;
                this.clipboardType = model.clipboardType;
                this.grainedType = model.grainedType;
                this.inClipboardSize = model.inClipboardSize;
                this.inClipboardSizeUnit = model.inClipboardSizeUnit;
                this.outClipboardSize = model.outClipboardSize;
                this.outClipboardSizeUnit = model.outClipboardSizeUnit;
            } 

            /**
             * <p>The size limit for a single clipboard transfer. Use this parameter together with the size unit parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder clipboardSize(Integer clipboardSize) {
                this.clipboardSize = clipboardSize;
                return this;
            }

            /**
             * <p>The unit for the single clipboard transfer size limit.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder clipboardSizeUnit(String clipboardSizeUnit) {
                this.clipboardSizeUnit = clipboardSizeUnit;
                return this;
            }

            /**
             * <p>The fine-grained clipboard control type. Valid values:</p>
             * <ul>
             * <li>off: Clipboard usage is disabled.</li>
             * <li>read: Read-only.</li>
             * <li>write: Write-only.</li>
             * <li>readwrite: Read and write.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>readwrite</p>
             */
            public Builder clipboardType(String clipboardType) {
                this.clipboardType = clipboardType;
                return this;
            }

            /**
             * <p>The content type for fine-grained clipboard control. Valid values:</p>
             * <ul>
             * <li>text: Text.</li>
             * <li>richtext: Rich text.</li>
             * <li>file: File.</li>
             * <li>picture: Image.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder grainedType(String grainedType) {
                this.grainedType = grainedType;
                return this;
            }

            /**
             * <p>The size limit for a single clipboard transfer to the cloud desktop. Use this parameter together with the inbound unit parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder inClipboardSize(Integer inClipboardSize) {
                this.inClipboardSize = inClipboardSize;
                return this;
            }

            /**
             * <p>The unit for the single clipboard transfer size limit to the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder inClipboardSizeUnit(String inClipboardSizeUnit) {
                this.inClipboardSizeUnit = inClipboardSizeUnit;
                return this;
            }

            /**
             * <p>The size limit for a single clipboard transfer from the cloud desktop. Use this parameter together with the outbound unit parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder outClipboardSize(Integer outClipboardSize) {
                this.outClipboardSize = outClipboardSize;
                return this;
            }

            /**
             * <p>The unit for the single clipboard transfer size limit from the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder outClipboardSizeUnit(String outClipboardSizeUnit) {
                this.outClipboardSizeUnit = outClipboardSizeUnit;
                return this;
            }

            public ClipboardGraineds build() {
                return new ClipboardGraineds(this);
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
             * <p>The device type.</p>
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
             * <p>The product ID.</p>
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
             * 
             * <strong>example:</strong>
             * <p>storage</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The vendor ID. For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0x0781</p>
             */
            public Builder deviceVid(String deviceVid) {
                this.deviceVid = deviceVid;
                return this;
            }

            /**
             * <p>The link optimization instruction.</p>
             * 
             * <strong>example:</strong>
             * <p>2:0</p>
             */
            public Builder optCommand(String optCommand) {
                this.optCommand = optCommand;
                return this;
            }

            /**
             * <p>The platform types to which the device rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder platforms(String platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * <p>The redirection type.</p>
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
             * 
             * <strong>example:</strong>
             * <p>Test rule</p>
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
             * <p>The resolution policy.</p>
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
             * <p>*.example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The redirect policy.</p>
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
    public static class RecordEventLevels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        private RecordEventLevels(Builder builder) {
            this.eventLevel = builder.eventLevel;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordEventLevels create() {
            return builder().build();
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventLevel; 
            private String eventType; 

            private Builder() {
            } 

            private Builder(RecordEventLevels model) {
                this.eventLevel = model.eventLevel;
                this.eventType = model.eventType;
            } 

            /**
             * <p>The event level.</p>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>StartApplication</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public RecordEventLevels build() {
                return new RecordEventLevels(this);
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
             * 
             * <strong>example:</strong>
             * <p>Test rule</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The product ID.</p>
             * 
             * <strong>example:</strong>
             * <p>08**</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The USB redirection type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usbRedirectType(String usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * <p>The USB redirection rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder usbRuleType(String usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * <p>The vendor ID. For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
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
