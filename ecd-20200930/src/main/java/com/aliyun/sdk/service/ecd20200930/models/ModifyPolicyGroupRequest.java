// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolicyGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolicyGroupRequest</p>
 */
public class ModifyPolicyGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminAccess")
    private String adminAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppContentProtection")
    private String appContentProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizeAccessPolicyRule")
    private java.util.List < AuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizeSecurityPolicyRule")
    private java.util.List < AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CameraRedirect")
    private String cameraRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private java.util.List < ClientType> clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clipboard")
    private String clipboard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceRedirects")
    private java.util.List < DeviceRedirects> deviceRedirects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceRules")
    private java.util.List < DeviceRules> deviceRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainList")
    private String domainList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainResolveRule")
    private java.util.List < DomainResolveRule> domainResolveRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainResolveRuleType")
    private String domainResolveRuleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserApplyAdminCoordinate")
    private String endUserApplyAdminCoordinate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserGroupCoordinate")
    private String endUserGroupCoordinate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuAcceleration")
    private String gpuAcceleration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Html5Access")
    private String html5Access;

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
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetRedirect")
    private String netRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreemptLogin")
    private String preemptLogin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreemptLoginUser")
    private java.util.List < String > preemptLoginUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrinterRedirection")
    private String printerRedirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordContent")
    private String recordContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordContentExpires")
    private Long recordContentExpires;

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
    private Long recordingExpires;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordingFps")
    private Long recordingFps;

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
    @com.aliyun.core.annotation.NameInMap("RevokeAccessPolicyRule")
    private java.util.List < RevokeAccessPolicyRule> revokeAccessPolicyRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevokeSecurityPolicyRule")
    private java.util.List < RevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeValue")
    private java.util.List < String > scopeValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsbRedirect")
    private String usbRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsbSupplyRedirectRule")
    private java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule;

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
    @com.aliyun.core.annotation.NameInMap("WatermarkTransparency")
    private String watermarkTransparency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkTransparencyValue")
    private Integer watermarkTransparencyValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkType")
    private String watermarkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WyAssistant")
    private String wyAssistant;

    private ModifyPolicyGroupRequest(Builder builder) {
        super(builder);
        this.adminAccess = builder.adminAccess;
        this.appContentProtection = builder.appContentProtection;
        this.authorizeAccessPolicyRule = builder.authorizeAccessPolicyRule;
        this.authorizeSecurityPolicyRule = builder.authorizeSecurityPolicyRule;
        this.cameraRedirect = builder.cameraRedirect;
        this.clientType = builder.clientType;
        this.clipboard = builder.clipboard;
        this.deviceRedirects = builder.deviceRedirects;
        this.deviceRules = builder.deviceRules;
        this.domainList = builder.domainList;
        this.domainResolveRule = builder.domainResolveRule;
        this.domainResolveRuleType = builder.domainResolveRuleType;
        this.endUserApplyAdminCoordinate = builder.endUserApplyAdminCoordinate;
        this.endUserGroupCoordinate = builder.endUserGroupCoordinate;
        this.gpuAcceleration = builder.gpuAcceleration;
        this.html5Access = builder.html5Access;
        this.html5FileTransfer = builder.html5FileTransfer;
        this.internetCommunicationProtocol = builder.internetCommunicationProtocol;
        this.localDrive = builder.localDrive;
        this.maxReconnectTime = builder.maxReconnectTime;
        this.name = builder.name;
        this.netRedirect = builder.netRedirect;
        this.policyGroupId = builder.policyGroupId;
        this.preemptLogin = builder.preemptLogin;
        this.preemptLoginUser = builder.preemptLoginUser;
        this.printerRedirection = builder.printerRedirection;
        this.recordContent = builder.recordContent;
        this.recordContentExpires = builder.recordContentExpires;
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
        this.revokeAccessPolicyRule = builder.revokeAccessPolicyRule;
        this.revokeSecurityPolicyRule = builder.revokeSecurityPolicyRule;
        this.scope = builder.scope;
        this.scopeValue = builder.scopeValue;
        this.usbRedirect = builder.usbRedirect;
        this.usbSupplyRedirectRule = builder.usbSupplyRedirectRule;
        this.videoRedirect = builder.videoRedirect;
        this.visualQuality = builder.visualQuality;
        this.watermark = builder.watermark;
        this.watermarkAntiCam = builder.watermarkAntiCam;
        this.watermarkColor = builder.watermarkColor;
        this.watermarkDegree = builder.watermarkDegree;
        this.watermarkFontSize = builder.watermarkFontSize;
        this.watermarkFontStyle = builder.watermarkFontStyle;
        this.watermarkPower = builder.watermarkPower;
        this.watermarkRowAmount = builder.watermarkRowAmount;
        this.watermarkSecurity = builder.watermarkSecurity;
        this.watermarkTransparency = builder.watermarkTransparency;
        this.watermarkTransparencyValue = builder.watermarkTransparencyValue;
        this.watermarkType = builder.watermarkType;
        this.wyAssistant = builder.wyAssistant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolicyGroupRequest create() {
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
    public java.util.List < AuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRule() {
        return this.authorizeAccessPolicyRule;
    }

    /**
     * @return authorizeSecurityPolicyRule
     */
    public java.util.List < AuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRule() {
        return this.authorizeSecurityPolicyRule;
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
    public java.util.List < ClientType> getClientType() {
        return this.clientType;
    }

    /**
     * @return clipboard
     */
    public String getClipboard() {
        return this.clipboard;
    }

    /**
     * @return deviceRedirects
     */
    public java.util.List < DeviceRedirects> getDeviceRedirects() {
        return this.deviceRedirects;
    }

    /**
     * @return deviceRules
     */
    public java.util.List < DeviceRules> getDeviceRules() {
        return this.deviceRules;
    }

    /**
     * @return domainList
     */
    public String getDomainList() {
        return this.domainList;
    }

    /**
     * @return domainResolveRule
     */
    public java.util.List < DomainResolveRule> getDomainResolveRule() {
        return this.domainResolveRule;
    }

    /**
     * @return domainResolveRuleType
     */
    public String getDomainResolveRuleType() {
        return this.domainResolveRuleType;
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
     * @return gpuAcceleration
     */
    public String getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    /**
     * @return html5Access
     */
    public String getHtml5Access() {
        return this.html5Access;
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
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return preemptLogin
     */
    public String getPreemptLogin() {
        return this.preemptLogin;
    }

    /**
     * @return preemptLoginUser
     */
    public java.util.List < String > getPreemptLoginUser() {
        return this.preemptLoginUser;
    }

    /**
     * @return printerRedirection
     */
    public String getPrinterRedirection() {
        return this.printerRedirection;
    }

    /**
     * @return recordContent
     */
    public String getRecordContent() {
        return this.recordContent;
    }

    /**
     * @return recordContentExpires
     */
    public Long getRecordContentExpires() {
        return this.recordContentExpires;
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
    public Long getRecordingExpires() {
        return this.recordingExpires;
    }

    /**
     * @return recordingFps
     */
    public Long getRecordingFps() {
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
     * @return revokeAccessPolicyRule
     */
    public java.util.List < RevokeAccessPolicyRule> getRevokeAccessPolicyRule() {
        return this.revokeAccessPolicyRule;
    }

    /**
     * @return revokeSecurityPolicyRule
     */
    public java.util.List < RevokeSecurityPolicyRule> getRevokeSecurityPolicyRule() {
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
    public java.util.List < String > getScopeValue() {
        return this.scopeValue;
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
    public java.util.List < UsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
        return this.usbSupplyRedirectRule;
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
     * @return watermarkTransparency
     */
    public String getWatermarkTransparency() {
        return this.watermarkTransparency;
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
     * @return wyAssistant
     */
    public String getWyAssistant() {
        return this.wyAssistant;
    }

    public static final class Builder extends Request.Builder<ModifyPolicyGroupRequest, Builder> {
        private String adminAccess; 
        private String appContentProtection; 
        private java.util.List < AuthorizeAccessPolicyRule> authorizeAccessPolicyRule; 
        private java.util.List < AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule; 
        private String cameraRedirect; 
        private java.util.List < ClientType> clientType; 
        private String clipboard; 
        private java.util.List < DeviceRedirects> deviceRedirects; 
        private java.util.List < DeviceRules> deviceRules; 
        private String domainList; 
        private java.util.List < DomainResolveRule> domainResolveRule; 
        private String domainResolveRuleType; 
        private String endUserApplyAdminCoordinate; 
        private String endUserGroupCoordinate; 
        private String gpuAcceleration; 
        private String html5Access; 
        private String html5FileTransfer; 
        private String internetCommunicationProtocol; 
        private String localDrive; 
        private Integer maxReconnectTime; 
        private String name; 
        private String netRedirect; 
        private String policyGroupId; 
        private String preemptLogin; 
        private java.util.List < String > preemptLoginUser; 
        private String printerRedirection; 
        private String recordContent; 
        private Long recordContentExpires; 
        private String recording; 
        private String recordingAudio; 
        private Integer recordingDuration; 
        private String recordingEndTime; 
        private Long recordingExpires; 
        private Long recordingFps; 
        private String recordingStartTime; 
        private String recordingUserNotify; 
        private String recordingUserNotifyMessage; 
        private String regionId; 
        private String remoteCoordinate; 
        private java.util.List < RevokeAccessPolicyRule> revokeAccessPolicyRule; 
        private java.util.List < RevokeSecurityPolicyRule> revokeSecurityPolicyRule; 
        private String scope; 
        private java.util.List < String > scopeValue; 
        private String usbRedirect; 
        private java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule; 
        private String videoRedirect; 
        private String visualQuality; 
        private String watermark; 
        private String watermarkAntiCam; 
        private Integer watermarkColor; 
        private Double watermarkDegree; 
        private Integer watermarkFontSize; 
        private String watermarkFontStyle; 
        private String watermarkPower; 
        private Integer watermarkRowAmount; 
        private String watermarkSecurity; 
        private String watermarkTransparency; 
        private Integer watermarkTransparencyValue; 
        private String watermarkType; 
        private String wyAssistant; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolicyGroupRequest request) {
            super(request);
            this.adminAccess = request.adminAccess;
            this.appContentProtection = request.appContentProtection;
            this.authorizeAccessPolicyRule = request.authorizeAccessPolicyRule;
            this.authorizeSecurityPolicyRule = request.authorizeSecurityPolicyRule;
            this.cameraRedirect = request.cameraRedirect;
            this.clientType = request.clientType;
            this.clipboard = request.clipboard;
            this.deviceRedirects = request.deviceRedirects;
            this.deviceRules = request.deviceRules;
            this.domainList = request.domainList;
            this.domainResolveRule = request.domainResolveRule;
            this.domainResolveRuleType = request.domainResolveRuleType;
            this.endUserApplyAdminCoordinate = request.endUserApplyAdminCoordinate;
            this.endUserGroupCoordinate = request.endUserGroupCoordinate;
            this.gpuAcceleration = request.gpuAcceleration;
            this.html5Access = request.html5Access;
            this.html5FileTransfer = request.html5FileTransfer;
            this.internetCommunicationProtocol = request.internetCommunicationProtocol;
            this.localDrive = request.localDrive;
            this.maxReconnectTime = request.maxReconnectTime;
            this.name = request.name;
            this.netRedirect = request.netRedirect;
            this.policyGroupId = request.policyGroupId;
            this.preemptLogin = request.preemptLogin;
            this.preemptLoginUser = request.preemptLoginUser;
            this.printerRedirection = request.printerRedirection;
            this.recordContent = request.recordContent;
            this.recordContentExpires = request.recordContentExpires;
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
            this.revokeAccessPolicyRule = request.revokeAccessPolicyRule;
            this.revokeSecurityPolicyRule = request.revokeSecurityPolicyRule;
            this.scope = request.scope;
            this.scopeValue = request.scopeValue;
            this.usbRedirect = request.usbRedirect;
            this.usbSupplyRedirectRule = request.usbSupplyRedirectRule;
            this.videoRedirect = request.videoRedirect;
            this.visualQuality = request.visualQuality;
            this.watermark = request.watermark;
            this.watermarkAntiCam = request.watermarkAntiCam;
            this.watermarkColor = request.watermarkColor;
            this.watermarkDegree = request.watermarkDegree;
            this.watermarkFontSize = request.watermarkFontSize;
            this.watermarkFontStyle = request.watermarkFontStyle;
            this.watermarkPower = request.watermarkPower;
            this.watermarkRowAmount = request.watermarkRowAmount;
            this.watermarkSecurity = request.watermarkSecurity;
            this.watermarkTransparency = request.watermarkTransparency;
            this.watermarkTransparencyValue = request.watermarkTransparencyValue;
            this.watermarkType = request.watermarkType;
            this.wyAssistant = request.wyAssistant;
        } 

        /**
         * Specifies whether the end user has administrator permissions after the end user connects to the cloud desktop.
         * <p>
         * 
         * >  This parameter is in invitational preview and not available to the public.
         */
        public Builder adminAccess(String adminAccess) {
            this.putQueryParameter("AdminAccess", adminAccess);
            this.adminAccess = adminAccess;
            return this;
        }

        /**
         * Specifies whether to enable the anti-screenshot feature. Valid values:
         * <p>
         * 
         * * on
         * * off
         * 
         * Default value: off.
         */
        public Builder appContentProtection(String appContentProtection) {
            this.putQueryParameter("AppContentProtection", appContentProtection);
            this.appContentProtection = appContentProtection;
            return this;
        }

        /**
         * The client CIDR blocks in the whitelist.
         */
        public Builder authorizeAccessPolicyRule(java.util.List < AuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
            this.putQueryParameter("AuthorizeAccessPolicyRule", authorizeAccessPolicyRule);
            this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
            return this;
        }

        /**
         * The security group rules.
         */
        public Builder authorizeSecurityPolicyRule(java.util.List < AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
            this.putQueryParameter("AuthorizeSecurityPolicyRule", authorizeSecurityPolicyRule);
            this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
            return this;
        }

        /**
         * Specifies whether to enable the webcam redirection feature. Valid values:
         * <p>
         * 
         * * on
         * * off
         * 
         * Default value: on.
         */
        public Builder cameraRedirect(String cameraRedirect) {
            this.putQueryParameter("CameraRedirect", cameraRedirect);
            this.cameraRedirect = cameraRedirect;
            return this;
        }

        /**
         * The logon methods.
         */
        public Builder clientType(java.util.List < ClientType> clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * The permissions on clipboards. Valid values:
         * <p>
         * 
         * *   read: specifies one-way transfer. You can copy data from your computer to cloud desktops, but cannot copy data from cloud desktops to your computer.
         * *   readwrite: specifies two-way transfer. You can copy data between your computer and cloud desktops.
         * *   off: specifies that the two-way transfer is disabled. You cannot copy data between your computer and cloud desktops.
         */
        public Builder clipboard(String clipboard) {
            this.putQueryParameter("Clipboard", clipboard);
            this.clipboard = clipboard;
            return this;
        }

        /**
         * DeviceRedirects.
         */
        public Builder deviceRedirects(java.util.List < DeviceRedirects> deviceRedirects) {
            this.putQueryParameter("DeviceRedirects", deviceRedirects);
            this.deviceRedirects = deviceRedirects;
            return this;
        }

        /**
         * DeviceRules.
         */
        public Builder deviceRules(java.util.List < DeviceRules> deviceRules) {
            this.putQueryParameter("DeviceRules", deviceRules);
            this.deviceRules = deviceRules;
            return this;
        }

        /**
         * The domain blacklist or whitelist. Wildcard domains are supported. Separate domain names with commas (,). Valid values:
         * <p>
         * 
         * *   \[black:],example1.com,example2.com: the domain name blacklist.
         * *   \[white:],example1.com,example2.com: the domain name whitelist.
         */
        public Builder domainList(String domainList) {
            this.putQueryParameter("DomainList", domainList);
            this.domainList = domainList;
            return this;
        }

        /**
         * The details of the DNS rule.
         */
        public Builder domainResolveRule(java.util.List < DomainResolveRule> domainResolveRule) {
            this.putQueryParameter("DomainResolveRule", domainResolveRule);
            this.domainResolveRule = domainResolveRule;
            return this;
        }

        /**
         * The DNS rule type.
         */
        public Builder domainResolveRuleType(String domainResolveRuleType) {
            this.putQueryParameter("DomainResolveRuleType", domainResolveRuleType);
            this.domainResolveRuleType = domainResolveRuleType;
            return this;
        }

        /**
         * The user applies for the administrator assistance switch. Value range: 
         * <p>
         * * on 
         * * off
         */
        public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
            this.putQueryParameter("EndUserApplyAdminCoordinate", endUserApplyAdminCoordinate);
            this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
            return this;
        }

        /**
         * The flow collaboration switch between users. Value range: 
         * <p>
         * * on 
         * * off
         */
        public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
            this.putQueryParameter("EndUserGroupCoordinate", endUserGroupCoordinate);
            this.endUserGroupCoordinate = endUserGroupCoordinate;
            return this;
        }

        /**
         * Specifies whether to enable the image display quality feature for the Graphics cloud desktop. If your business requires high desktop performance and optimal user experience, we recommend that you enable this feature. For example, you can enable this policy in professional design scenarios. Valid values:
         * <p>
         * 
         * * on
         * * off
         */
        public Builder gpuAcceleration(String gpuAcceleration) {
            this.putQueryParameter("GpuAcceleration", gpuAcceleration);
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }

        /**
         * Specifies whether to allow the access from HTM5 clients to a cloud desktop. Valid values:
         * <p>
         * 
         * *   on: allows the access.
         * *   off: denies the access.
         * 
         * Default value: off.
         * 
         * >  We recommend that you use the ClientType-related parameters to control the EDS client type for cloud desktop logon.
         */
        public Builder html5Access(String html5Access) {
            this.putQueryParameter("Html5Access", html5Access);
            this.html5Access = html5Access;
            return this;
        }

        /**
         * The file transfer policy for HTML5 clients. Valid values:
         * <p>
         * 
         * *   off: Files cannot be uploaded from or downloaded to HTML5 clients.
         * *   upload: Files can be uploaded from HTML5 clients.
         * *   download: Files can be downloaded to HTML5 clients.
         * *   all: Files can be uploaded from and downloaded to HTML5 clients.
         * 
         * Default value: off.
         */
        public Builder html5FileTransfer(String html5FileTransfer) {
            this.putQueryParameter("Html5FileTransfer", html5FileTransfer);
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }

        /**
         * The protocol that you want to use for network communication. Valid values:
         * <p>
         * 
         * * TCP: Only the TCP protocol is used.
         * * BOTH: allows automatic switchover between the TCP protocol and the UDP protocol.
         * 
         * Default value: TCP.
         */
        public Builder internetCommunicationProtocol(String internetCommunicationProtocol) {
            this.putQueryParameter("InternetCommunicationProtocol", internetCommunicationProtocol);
            this.internetCommunicationProtocol = internetCommunicationProtocol;
            return this;
        }

        /**
         * The permissions on local disk mapping. Valid values:
         * <p>
         * 
         * *   read: read-only permissions. Local disks are mapped to cloud desktops. You can only read (copy) local files but cannot modify them.
         * *   readwrite: read and write permissions. Local disks are mapped to cloud desktops. You can read (copy) and modify local files.
         * *   off: no permissions. Local disks are not mapped to cloud desktops.
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
         * The name of the policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The network redirection feature. Valid values:
         * <p>
         * 
         * * on
         * * off
         * 
         * Default value: off.
         */
        public Builder netRedirect(String netRedirect) {
            this.putQueryParameter("NetRedirect", netRedirect);
            this.netRedirect = netRedirect;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * Specifies whether to allow user preemption. Default value: off. You cannot change the value.
         */
        public Builder preemptLogin(String preemptLogin) {
            this.putQueryParameter("PreemptLogin", preemptLogin);
            this.preemptLogin = preemptLogin;
            return this;
        }

        /**
         * The names of the users that are allowed to connect to the same cloud desktop at the same time. You can specify up to five usernames.
         * <p>
         * 
         * > To improve user experience and ensure data security, multiple end users cannot connect to the same cloud desktop at the same time.
         */
        public Builder preemptLoginUser(java.util.List < String > preemptLoginUser) {
            this.putQueryParameter("PreemptLoginUser", preemptLoginUser);
            this.preemptLoginUser = preemptLoginUser;
            return this;
        }

        /**
         * Specifies whether to enable printer redirection. Valid values:
         * <p>
         * 
         * *   off: disables printer redirection.
         * *   on: enables printer redirection.
         */
        public Builder printerRedirection(String printerRedirection) {
            this.putQueryParameter("PrinterRedirection", printerRedirection);
            this.printerRedirection = printerRedirection;
            return this;
        }

        /**
         * Specifies whether to enable the custom screen recording feature. Valid values:
         * <p>
         * 
         * * on
         * * off
         * 
         * Default value: off.
         */
        public Builder recordContent(String recordContent) {
            this.putQueryParameter("RecordContent", recordContent);
            this.recordContent = recordContent;
            return this;
        }

        /**
         * The duration in which the custom screen recording is valid. Default value: 30. Unit: days.
         */
        public Builder recordContentExpires(Long recordContentExpires) {
            this.putQueryParameter("RecordContentExpires", recordContentExpires);
            this.recordContentExpires = recordContentExpires;
            return this;
        }

        /**
         * Specifies whether to enable screen recording. Valid values:
         * <p>
         * 
         * * OFF: disabled.
         * * ALLTIME: All operations that are performed by an end user on the cloud desktop are recorded. The recording immediately starts when the end user connects to the cloud desktop and ends after the end user disconnects from the cloud desktop.
         * * PERIOD: The operations that are performed by an end user on the cloud desktop during a specific period of time are recorded. You must specify the start time and the end time of the recording.
         */
        public Builder recording(String recording) {
            this.putQueryParameter("Recording", recording);
            this.recording = recording;
            return this;
        }

        /**
         * Specifies whether to record the sound that is generated on the cloud desktop during screen recording. Valid values:
         * <p>
         * 
         * * on
         * * off
         */
        public Builder recordingAudio(String recordingAudio) {
            this.putQueryParameter("RecordingAudio", recordingAudio);
            this.recordingAudio = recordingAudio;
            return this;
        }

        /**
         * This parameter takes effect based on the Recording-related parameters. You can specify a time range for screen recording, and recording files are generated after the specified end time is reached.
         */
        public Builder recordingDuration(Integer recordingDuration) {
            this.putQueryParameter("RecordingDuration", recordingDuration);
            this.recordingDuration = recordingDuration;
            return this;
        }

        /**
         * The time when the screen recording ends. Specify the value in the HH:MM:SS format. The value is valid only when you set the Recording parameter to PERIOD.
         */
        public Builder recordingEndTime(String recordingEndTime) {
            this.putQueryParameter("RecordingEndTime", recordingEndTime);
            this.recordingEndTime = recordingEndTime;
            return this;
        }

        /**
         * The period in which the screen recording audit is valid. Valid values: 15 to 180. Unit: days.
         */
        public Builder recordingExpires(Long recordingExpires) {
            this.putQueryParameter("RecordingExpires", recordingExpires);
            this.recordingExpires = recordingExpires;
            return this;
        }

        /**
         * The frame rate of screen recording. Unit: fps. Valid values:
         * <p>
         * 
         * * 2
         * * 5
         * * 10
         * * 15
         */
        public Builder recordingFps(Long recordingFps) {
            this.putQueryParameter("RecordingFps", recordingFps);
            this.recordingFps = recordingFps;
            return this;
        }

        /**
         * The time when the screen recording starts. Specify the value in the HH:MM:SS format. The value is valid only when you set the Recording parameter to PERIOD.
         */
        public Builder recordingStartTime(String recordingStartTime) {
            this.putQueryParameter("RecordingStartTime", recordingStartTime);
            this.recordingStartTime = recordingStartTime;
            return this;
        }

        /**
         * Specifies whether to enable the screen recording notification feature. Valid values: on and off. on and off (default).
         */
        public Builder recordingUserNotify(String recordingUserNotify) {
            this.putQueryParameter("RecordingUserNotify", recordingUserNotify);
            this.recordingUserNotify = recordingUserNotify;
            return this;
        }

        /**
         * The content of the screen recording notification sent to the client. By default, you do not need to specify this parameter.
         */
        public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
            this.putQueryParameter("RecordingUserNotifyMessage", recordingUserNotifyMessage);
            this.recordingUserNotifyMessage = recordingUserNotifyMessage;
            return this;
        }

        /**
         * The ID of the region where the cloud desktop resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The permissions on the keyboard and mouse to control the cloud desktop during remote assistance. Valid values:
         * <p>
         * 
         * * fullControl: The keyboard and mouse can be fully controlled.
         * * optionalControl: By default, this feature is disabled. You can apply for permissions to enable the feature.
         * * disableControl: The keyboard and mouse cannot be controlled.
         */
        public Builder remoteCoordinate(String remoteCoordinate) {
            this.putQueryParameter("RemoteCoordinate", remoteCoordinate);
            this.remoteCoordinate = remoteCoordinate;
            return this;
        }

        /**
         * The security group rules that you want to delete.
         */
        public Builder revokeAccessPolicyRule(java.util.List < RevokeAccessPolicyRule> revokeAccessPolicyRule) {
            this.putQueryParameter("RevokeAccessPolicyRule", revokeAccessPolicyRule);
            this.revokeAccessPolicyRule = revokeAccessPolicyRule;
            return this;
        }

        /**
         * The security group rules that you want to delete.
         */
        public Builder revokeSecurityPolicyRule(java.util.List < RevokeSecurityPolicyRule> revokeSecurityPolicyRule) {
            this.putQueryParameter("RevokeSecurityPolicyRule", revokeSecurityPolicyRule);
            this.revokeSecurityPolicyRule = revokeSecurityPolicyRule;
            return this;
        }

        /**
         * The effective scope of the policy. Valid values:
         * <p>
         * 
         * * GLOBAL: takes effect globally.
         * * IP: takes effect based on the IP address.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * This parameter is required when the Scope parameter is set to IP.
         */
        public Builder scopeValue(java.util.List < String > scopeValue) {
            this.putQueryParameter("ScopeValue", scopeValue);
            this.scopeValue = scopeValue;
            return this;
        }

        /**
         * Specifies whether to enable USB redirection. Valid values:
         * <p>
         * 
         * *   on: enables USB redirection.
         * *   off: disables USB redirection.
         */
        public Builder usbRedirect(String usbRedirect) {
            this.putQueryParameter("UsbRedirect", usbRedirect);
            this.usbRedirect = usbRedirect;
            return this;
        }

        /**
         * The USB redirection rules.
         */
        public Builder usbSupplyRedirectRule(java.util.List < UsbSupplyRedirectRule> usbSupplyRedirectRule) {
            this.putQueryParameter("UsbSupplyRedirectRule", usbSupplyRedirectRule);
            this.usbSupplyRedirectRule = usbSupplyRedirectRule;
            return this;
        }

        /**
         * The multimedia redirection feature.
         */
        public Builder videoRedirect(String videoRedirect) {
            this.putQueryParameter("VideoRedirect", videoRedirect);
            this.videoRedirect = videoRedirect;
            return this;
        }

        /**
         * Specify whether to enable the policy of image display quality. Valid values:
         * <p>
         * 
         * *   on: enables the policy of image display quality.
         * *   off: disables the policy of image display quality.
         * 
         * Default value: off.
         */
        public Builder visualQuality(String visualQuality) {
            this.putQueryParameter("VisualQuality", visualQuality);
            this.visualQuality = visualQuality;
            return this;
        }

        /**
         * Specifies whether to enable watermarking. Valid values:
         * <p>
         * 
         * *   on: enables watermarking.
         * *   off: disables watermarking.
         */
        public Builder watermark(String watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        /**
         * Specifies whether to enable the anti-screen photo feature for invisible watermarks. on and off (default).
         */
        public Builder watermarkAntiCam(String watermarkAntiCam) {
            this.putQueryParameter("WatermarkAntiCam", watermarkAntiCam);
            this.watermarkAntiCam = watermarkAntiCam;
            return this;
        }

        /**
         * The font color of the watermark. Valid values: 0 to 16777215.
         */
        public Builder watermarkColor(Integer watermarkColor) {
            this.putQueryParameter("WatermarkColor", watermarkColor);
            this.watermarkColor = watermarkColor;
            return this;
        }

        /**
         * The inclination angle of the watermark. Value values: -10 to -30.
         */
        public Builder watermarkDegree(Double watermarkDegree) {
            this.putQueryParameter("WatermarkDegree", watermarkDegree);
            this.watermarkDegree = watermarkDegree;
            return this;
        }

        /**
         * The font size of the watermark. Valid values: 10 to 50
         */
        public Builder watermarkFontSize(Integer watermarkFontSize) {
            this.putQueryParameter("WatermarkFontSize", watermarkFontSize);
            this.watermarkFontSize = watermarkFontSize;
            return this;
        }

        /**
         * The font style of the watermark. Valid values:
         * <p>
         * 
         * * plain
         * * bold
         */
        public Builder watermarkFontStyle(String watermarkFontStyle) {
            this.putQueryParameter("WatermarkFontStyle", watermarkFontStyle);
            this.watermarkFontStyle = watermarkFontStyle;
            return this;
        }

        /**
         * The watermark enhancement feature. Valid values: low, medium, and high.
         */
        public Builder watermarkPower(String watermarkPower) {
            this.putQueryParameter("WatermarkPower", watermarkPower);
            this.watermarkPower = watermarkPower;
            return this;
        }

        /**
         * The number of watermark rows. This parameter is not in use.
         */
        public Builder watermarkRowAmount(Integer watermarkRowAmount) {
            this.putQueryParameter("WatermarkRowAmount", watermarkRowAmount);
            this.watermarkRowAmount = watermarkRowAmount;
            return this;
        }

        /**
         * The security priority rule for invisible watermarks. Valid values: on and off.
         */
        public Builder watermarkSecurity(String watermarkSecurity) {
            this.putQueryParameter("WatermarkSecurity", watermarkSecurity);
            this.watermarkSecurity = watermarkSecurity;
            return this;
        }

        /**
         * The transparency of the watermark. The valid values include:
         * <p>
         * 
         * *   LIGHT
         * *   MIDDLE
         * *   DARK
         */
        public Builder watermarkTransparency(String watermarkTransparency) {
            this.putQueryParameter("WatermarkTransparency", watermarkTransparency);
            this.watermarkTransparency = watermarkTransparency;
            return this;
        }

        /**
         * The transparency of the watermark. A larger value indicates a less transparent watermark. Valid values: 10 to 100.
         */
        public Builder watermarkTransparencyValue(Integer watermarkTransparencyValue) {
            this.putQueryParameter("WatermarkTransparencyValue", watermarkTransparencyValue);
            this.watermarkTransparencyValue = watermarkTransparencyValue;
            return this;
        }

        /**
         * The type of the watermark. You can specify multiple watermark types at a time. Separate watermark types with commas (,). Valid values:
         * <p>
         * 
         * *   EndUserId: the username
         * *   HostName: the last 15 characters of the cloud desktop ID
         */
        public Builder watermarkType(String watermarkType) {
            this.putQueryParameter("WatermarkType", watermarkType);
            this.watermarkType = watermarkType;
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
        public ModifyPolicyGroupRequest build() {
            return new ModifyPolicyGroupRequest(this);
        } 

    } 

    public static class AuthorizeAccessPolicyRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrIp")
        @com.aliyun.core.annotation.Validation(required = true)
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

            /**
             * The CIDR block that the client can access.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * The description of the client IP address whitelist.
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

            /**
             * The object to which the security group rule applies. The value is an IPv4 CIDR block.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * The description of security group rule N.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The protocol type of security group rule N. Valid values:
             * <p>
             * 
             * *   tcp: TCP
             * *   udp: UDP
             * *   icmp: ICMP (IPv4)
             * *   gre: GRE
             * *   all: all protocols
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The authorization policy of security group rule N. Valid values:
             * <p>
             * 
             * *   accept: specifies the Allow policy that allows all access requests.
             * *   drop: specifies the Deny policy that denies all access requests. If no messages of access denied are returned, the requests time out or failed.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The port range of security group rule N. The value of the port range is determined by the protocol type specified by the AuthorizeSecurityPolicyRule.N.IpProtocol parameter.
             * <p>
             * 
             * *   When the AuthorizeSecurityPolicyRule.N.IpProtocol parameter is set to tcp or udp, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.
             * *   When AuthorizeSecurityPolicyRule.N.IpProtocol is set to icmp, set the value to -1/-1.
             * *   When AuthorizeSecurityPolicyRule.N.IpProtocol is set to gre, set the value to -1/-1.
             * *   When AuthorizeSecurityPolicyRule.N.IpProtocol is set to all, set the value to -1/-1.
             * 
             * For more information about the common ports of typical applications, see [Common ports](~~40724~~).
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The priority of security group rule N. A smaller value indicates a higher priority.
             * <p>
             * 
             * Valid values: 1 to 60.
             * 
             * Default value: 1.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The direction of security group rule N. Valid values:
             * <p>
             * 
             * *   inflow: inbound
             * *   outflow: outbound
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

            /**
             * The type of client that you want to use to connect to the cloud desktop. Valid values:
             * <p>
             * 
             * * windows: the Windows client
             * * linux: C-Key Series Cloud Computer TC and A Series Cloud Computer TC
             * * macos: the macOS client
             * * ios: the iOS client
             * * android: the Android client
             * * html5: the web client
             * 
             * > By default, if you do not configure the ClientType-related parameters, all types of clients are allowed to connect to the cloud desktop.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * The logon method. This parameter specifies whether a specific type of the client is allowed to connect to the cloud desktop. Valid values:
             * <p>
             * 
             * * on: allowed.
             * * off: disallowed.
             * 
             * > By default, if you do not configure the ClientType-related parameters, all types of clients are allowed to log on to cloud desktops.
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

            /**
             * The description of the DNS rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Specifies whether to allow the DNS rule.
             * <p>
             * 
             * Valid values:
             * 
             * *   allow
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   block
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
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

            /**
             * The IPv4 CIDR block that can be accessed from the client.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * The description of the client IP address whitelist that you want to delete.
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

            /**
             * The IPv4 CIDR block of the security group rule.
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * The description of the security group rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The protocol type of the security group rule. Valid values:
             * <p>
             * 
             * * TCP
             * * UDP
             * * ICMP: ICMP (IPv4)
             * * GRE
             * * ALL
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The authorization policy of the security group rule that you want to delete. Valid values:
             * <p>
             * 
             * * accept: allows all access requests.
             * * drop: disallows all access requests. If no denied messages are returned, the requests timed out or failed.
             * 
             * Default value: accept.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The port range of the security group rule that you want to delete. The value of the port range is determined by the protocol type specified by the IpProtocol parameter.
             * <p>
             * 
             * * If the IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. The start port number and the end port number are separated by a forward slash (/). Example: 1/200.
             * * If the IpProtocol parameter is set to ICMP, the port range is -1/-1.
             * * If the IpProtocol parameter is set to GRE, the port range is -1/-1.
             * * If the IpProtocol parameter is set to ALL, the port range is -1/-1.
             * 
             * For more information about the common ports of typical applications, see [Common ports](https://www.alibabacloud.com/help/en/ecs/user-guide/common-ports?spm=a2c63.p38356.0.0.56b87f2c2SJTAw).
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The priority of the security group rule. A smaller value indicates a higher priority.
             * <p>
             * 
             * Valid values: 1 to 60.
             * 
             * Default value: 1.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The direction of the security group rule that you want to delete. Valid values:
             * <p>
             * 
             * * inflow: inbound
             * * outflow: outbound
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
    public static class UsbSupplyRedirectRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceClass")
        private String deviceClass;

        @com.aliyun.core.annotation.NameInMap("DeviceSubclass")
        private String deviceSubclass;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("UsbRedirectType")
        private Long usbRedirectType;

        @com.aliyun.core.annotation.NameInMap("UsbRuleType")
        private Long usbRuleType;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        private UsbSupplyRedirectRule(Builder builder) {
            this.description = builder.description;
            this.deviceClass = builder.deviceClass;
            this.deviceSubclass = builder.deviceSubclass;
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
         * @return deviceClass
         */
        public String getDeviceClass() {
            return this.deviceClass;
        }

        /**
         * @return deviceSubclass
         */
        public String getDeviceSubclass() {
            return this.deviceSubclass;
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
        public Long getUsbRedirectType() {
            return this.usbRedirectType;
        }

        /**
         * @return usbRuleType
         */
        public Long getUsbRuleType() {
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
            private String deviceClass; 
            private String deviceSubclass; 
            private String productId; 
            private Long usbRedirectType; 
            private Long usbRuleType; 
            private String vendorId; 

            /**
             * The description of the rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The class of the device. This parameter is required when you set the usbRuleType parameter to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes?spm=a2c63.p38356.0.0.56b84b03GUn4kJ).
             */
            public Builder deviceClass(String deviceClass) {
                this.deviceClass = deviceClass;
                return this;
            }

            /**
             * The subclass of the device. This parameter is required when you set the usbRuleType parameter to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes?spm=a2c63.p38356.0.0.56b84b03GUn4kJ).
             */
            public Builder deviceSubclass(String deviceSubclass) {
                this.deviceSubclass = deviceSubclass;
                return this;
            }

            /**
             * The ID of the service.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * Specifies whether to allow USB redirection. Valid values:
             * <p>
             * 
             * * 1: allowed.
             * * 2: disallowed.
             */
            public Builder usbRedirectType(Long usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * The type of the USB redirection rule. Valid values:
             * <p>
             * 
             * * 1: device class.
             * * 2: device vendor.
             */
            public Builder usbRuleType(Long usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * The ID of the vendor. For more information, see[ Valid USB Vendor IDs (VIDs)](https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf?spm=a2c63.p38356.0.0.56b84b03GUn4kJ&file=vendor_ids032322.pdf_1.pdf).
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
