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
    private java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizeSecurityPolicyRule")
    private java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

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
    @com.aliyun.core.annotation.NameInMap("DeviceRedirects")
    private java.util.List<DeviceRedirects> deviceRedirects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceRules")
    private java.util.List<DeviceRules> deviceRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainList")
    private String domainList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainResolveRule")
    private java.util.List<DomainResolveRule> domainResolveRule;

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
    private java.util.List<String> preemptLoginUser;

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
    @com.aliyun.core.annotation.NameInMap("UsbRedirect")
    private String usbRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsbSupplyRedirectRule")
    private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule;

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
     * @return domainList
     */
    public String getDomainList() {
        return this.domainList;
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
    public java.util.List<String> getPreemptLoginUser() {
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
        private java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule; 
        private java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule; 
        private String cameraRedirect; 
        private java.util.List<ClientType> clientType; 
        private String clipboard; 
        private java.util.List<DeviceRedirects> deviceRedirects; 
        private java.util.List<DeviceRules> deviceRules; 
        private String domainList; 
        private java.util.List<DomainResolveRule> domainResolveRule; 
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
        private java.util.List<String> preemptLoginUser; 
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
        private java.util.List<RevokeAccessPolicyRule> revokeAccessPolicyRule; 
        private java.util.List<RevokeSecurityPolicyRule> revokeSecurityPolicyRule; 
        private String scope; 
        private java.util.List<String> scopeValue; 
        private String usbRedirect; 
        private java.util.List<UsbSupplyRedirectRule> usbSupplyRedirectRule; 
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
         * <p>Specifies whether end users have the administrator permissions.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
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
         * <p>Specifies whether to enable the anti-screenshot feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default)</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder appContentProtection(String appContentProtection) {
            this.putQueryParameter("AppContentProtection", appContentProtection);
            this.appContentProtection = appContentProtection;
            return this;
        }

        /**
         * <p>The client IP address whitelists.</p>
         */
        public Builder authorizeAccessPolicyRule(java.util.List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
            this.putQueryParameter("AuthorizeAccessPolicyRule", authorizeAccessPolicyRule);
            this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
            return this;
        }

        /**
         * <p>The security group rules.</p>
         */
        public Builder authorizeSecurityPolicyRule(java.util.List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
            this.putQueryParameter("AuthorizeSecurityPolicyRule", authorizeSecurityPolicyRule);
            this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
            return this;
        }

        /**
         * <p>Specifies whether to enable the webcam redirection feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder cameraRedirect(String cameraRedirect) {
            this.putQueryParameter("CameraRedirect", cameraRedirect);
            this.cameraRedirect = cameraRedirect;
            return this;
        }

        /**
         * <p>The logon method control rules to limit the type of the Alibaba Cloud Workspace client used by end users to connect to cloud computers.</p>
         */
        public Builder clientType(java.util.List<ClientType> clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The permissions on the clipboard.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: specifies one-way transfer. You can copy files only from local devices to cloud computers.</li>
         * <li>readwrite: specifies two-way transfer You can copy files between local devices and cloud computers.</li>
         * <li>write: specifies one-way transfer. You can only copy files from cloud computers to local devices.</li>
         * <li>off: disables both one-way and two-way transfer. Files cannot be copied between local devices and cloud computers.</li>
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
         * <p>Specifies whether the access control for domain names is enabled. Domain names support wildcards (*). Separate multiple domain names with commas (,).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[black:],example1.com,example2.com</p>
         */
        public Builder domainList(String domainList) {
            this.putQueryParameter("DomainList", domainList);
            this.domainList = domainList;
            return this;
        }

        /**
         * <p>The domain resolution rules.</p>
         */
        public Builder domainResolveRule(java.util.List<DomainResolveRule> domainResolveRule) {
            this.putQueryParameter("DomainResolveRule", domainResolveRule);
            this.domainResolveRule = domainResolveRule;
            return this;
        }

        /**
         * <p>The type of the domain name resolution rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>OFF</li>
         * <li>ON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder domainResolveRuleType(String domainResolveRuleType) {
            this.putQueryParameter("DomainResolveRuleType", domainResolveRuleType);
            this.domainResolveRuleType = domainResolveRuleType;
            return this;
        }

        /**
         * <p>Specifies whether to turn on the Contact Administrator for Help switch.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder endUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
            this.putQueryParameter("EndUserApplyAdminCoordinate", endUserApplyAdminCoordinate);
            this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
            return this;
        }

        /**
         * <p>Specifies whether to turn on the User Stream Collaboration switch.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder endUserGroupCoordinate(String endUserGroupCoordinate) {
            this.putQueryParameter("EndUserGroupCoordinate", endUserGroupCoordinate);
            this.endUserGroupCoordinate = endUserGroupCoordinate;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Image Quality Control feature for Graphic-based cloud computers. If you have high requirements on the performance and user experience in scenarios such as professional design, we recommend that you enable this feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
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
         * <p>Specifies whether to allow web client access.</p>
         * <blockquote>
         * <p> We recommend that you specify the ClientType-related parameters to control the Alibaba Cloud Workspace client type for cloud computer connection.``</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder html5Access(String html5Access) {
            this.putQueryParameter("Html5Access", html5Access);
            this.html5Access = html5Access;
            return this;
        }

        /**
         * <p>The file transfer feature on the web client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>all: Files can be uploaded and downloaded between local computers and the web client.</li>
         * <li>download: Files on the web client can be downloaded to local computers.</li>
         * <li>upload: Files on local computers can be uploaded to the web client.</li>
         * <li>off (default): Files cannot be transferred between the web client and local computers.</li>
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
         * <li>TCP (default): TCP</li>
         * <li>BOTH: TCP and UDP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BOTH</p>
         */
        public Builder internetCommunicationProtocol(String internetCommunicationProtocol) {
            this.putQueryParameter("InternetCommunicationProtocol", internetCommunicationProtocol);
            this.internetCommunicationProtocol = internetCommunicationProtocol;
            return this;
        }

        /**
         * <p>The permissions on local disk mapping.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: read-only. Local disk mapping is available on cloud computers. However, you can only read (copy) local files but cannot modify the files.</li>
         * <li>readwrite: read and write. Local disk mapping is available on cloud computers. You can read (copy) and write (modify) local files.</li>
         * <li>off (default): no permissions. Local disk mapping is unavailable on cloud computers.</li>
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
         * <p>The maximum retry period for reconnecting to cloud computers when the cloud computers are disconnected due to none-human reasons. Valid values: 30 to 7200. Unit: seconds.</p>
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
         * <p>The name of the cloud computer policy.</p>
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
         * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default)</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder netRedirect(String netRedirect) {
            this.putQueryParameter("NetRedirect", netRedirect);
            this.netRedirect = netRedirect;
            return this;
        }

        /**
         * <p>The ID of the cloud computer policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-gx2x1dhsmthe9****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The cloud computer preemption feature.</p>
         * <blockquote>
         * <p> To ensure user experience and data security, when a cloud computer is used by an end user, other end users cannot connect to the cloud computer. By default, this parameter is set to <code>off</code>, which cannot be modified.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default): Multiple end users cannot connect to the same cloud computer at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder preemptLogin(String preemptLogin) {
            this.putQueryParameter("PreemptLogin", preemptLogin);
            this.preemptLogin = preemptLogin;
            return this;
        }

        /**
         * <p>The usernames that are allowed to connect to the cloud computer in use. You can specify up to five usernames.</p>
         * <blockquote>
         * <p> To ensure user experience and data security, other end users cannot connect to the cloud computer that is used by an end user.</p>
         * </blockquote>
         */
        public Builder preemptLoginUser(java.util.List<String> preemptLoginUser) {
            this.putQueryParameter("PreemptLoginUser", preemptLoginUser);
            this.preemptLoginUser = preemptLoginUser;
            return this;
        }

        /**
         * <p>The printer redirection feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder printerRedirection(String printerRedirection) {
            this.putQueryParameter("PrinterRedirection", printerRedirection);
            this.printerRedirection = printerRedirection;
            return this;
        }

        /**
         * <p>Specifies whether to enable the custom screen recording feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default)</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder recordContent(String recordContent) {
            this.putQueryParameter("RecordContent", recordContent);
            this.recordContent = recordContent;
            return this;
        }

        /**
         * <p>The duration in which the custom screen recording is valid. Default value: 30. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder recordContentExpires(Long recordContentExpires) {
            this.putQueryParameter("RecordContentExpires", recordContentExpires);
            this.recordContentExpires = recordContentExpires;
            return this;
        }

        /**
         * <p>Specifies whether to enable the screen recording feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>byaction_cmd_ft: enables the operation-triggered screen recording upon command execution and file transfer.</li>
         * <li>ALLTIME: enables the whole-process screen recording. That is, the recording starts when cloud computers are connected and ends when the cloud computers are disconnected.</li>
         * <li>session: enables the screen recording for session lifecycle listening.</li>
         * <li>PERIOD: enables the interval-based screen recording. You must specify an interval between the start time and end time of this type of recording.</li>
         * <li>byaction_commands: enables the operation-triggered screen recording upon command execution.</li>
         * <li>OFF: disables the screen recording feature.</li>
         * <li>byaction_file_transfer: enables the operation-triggered screen recording upon file transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder recording(String recording) {
            this.putQueryParameter("Recording", recording);
            this.recording = recording;
            return this;
        }

        /**
         * <p>Specifies whether to record the audio files generated from cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: records only video files.</li>
         * <li>on: records video and audio files.</li>
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
         * <p>The file length of the screen recording. Unit: minutes. Screen recording files are split based on the specified file length and uploaded to Object Storage Service (OSS) buckets. When a screen recording file reaches 300 MB in size, the system preferentially performs rolling update for the file.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>10</li>
         * <li>20</li>
         * <li>30</li>
         * <li>60</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder recordingDuration(Integer recordingDuration) {
            this.putQueryParameter("RecordingDuration", recordingDuration);
            this.recordingDuration = recordingDuration;
            return this;
        }

        /**
         * <p>The time when the screen recording stops. Specify the value in the HH:MM:SS format. The value is meaningful only when you set <code>Recording</code> to <code>PERIOD</code>.</p>
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
         * <p>30</p>
         */
        public Builder recordingExpires(Long recordingExpires) {
            this.putQueryParameter("RecordingExpires", recordingExpires);
            this.recordingExpires = recordingExpires;
            return this;
        }

        /**
         * <p>The frame rate of screen recording. Unit: fps.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>2</li>
         * <li>5</li>
         * <li>10</li>
         * <li>15</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder recordingFps(Long recordingFps) {
            this.putQueryParameter("RecordingFps", recordingFps);
            this.recordingFps = recordingFps;
            return this;
        }

        /**
         * <p>The time when the screen recording starts. Specify the value in the HH:MM:SS format. The value is meaningful only when you set the <code>Recording</code> parameter to <code>PERIOD</code>.</p>
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
         * <p>Specifies whether to enable the screen recording notification feature after end users log on to the Alibaba Cloud Workspace client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
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
         * <p>The notification content of screen recording. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Your desktop is being recorded.</p>
         */
        public Builder recordingUserNotifyMessage(String recordingUserNotifyMessage) {
            this.putQueryParameter("RecordingUserNotifyMessage", recordingUserNotifyMessage);
            this.recordingUserNotifyMessage = recordingUserNotifyMessage;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The permissions on keyboard and mouse control during remote assistance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>optionalControl: By default, you are not granted the permissions. You can apply for the permissions.</li>
         * <li>fullControl: You are granted the full permissions.</li>
         * <li>disableControl: You are not granted the permissions.</li>
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
         * <p>The client IP address whitelists that you want to delete.</p>
         */
        public Builder revokeAccessPolicyRule(java.util.List<RevokeAccessPolicyRule> revokeAccessPolicyRule) {
            this.putQueryParameter("RevokeAccessPolicyRule", revokeAccessPolicyRule);
            this.revokeAccessPolicyRule = revokeAccessPolicyRule;
            return this;
        }

        /**
         * <p>The security group rules that you want to delete.</p>
         */
        public Builder revokeSecurityPolicyRule(java.util.List<RevokeSecurityPolicyRule> revokeSecurityPolicyRule) {
            this.putQueryParameter("RevokeSecurityPolicyRule", revokeSecurityPolicyRule);
            this.revokeSecurityPolicyRule = revokeSecurityPolicyRule;
            return this;
        }

        /**
         * <p>The effective scope of the policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>IP: The policy takes effect based on the IP address.</li>
         * <li>GLOBAL: The policy takes effect globally.</li>
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
         * <p>This parameter is required when the <code>Scope</code> parameter is set to <code>IP</code>.````</p>
         */
        public Builder scopeValue(java.util.List<String> scopeValue) {
            this.putQueryParameter("ScopeValue", scopeValue);
            this.scopeValue = scopeValue;
            return this;
        }

        /**
         * <p>Specifies whether to enable the USB redirection feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
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
         * <p>The multimedia redirection feature.</p>
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
         * <li>high: high-definition (HD)</li>
         * <li>low: smoothness</li>
         * <li>lossless: no quality loss</li>
         * <li>medium (default): scenario-specific adaptation</li>
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
         * <p>The watermarking feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>blind: Invisible watermarks are applied.</li>
         * <li>off: The watermarking feature is disabled.</li>
         * <li>on: Visible watermarks are applied.</li>
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
         * <p>Specifies whether to enable the anti-screen photo feature for invisible watermarks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
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
         * <p>The font color in red, green, and blue (RGB) of the watermark. Valid values: 0 to 16777215.</p>
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
         * <p>The watermark enhancement feature.</p>
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
         * <p>The number of watermark rows.</p>
         * <blockquote>
         * <p> This parameter is not available for public use.</p>
         * </blockquote>
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
         * <p>Specifies whether to enable the security priority feature for invisible watermarks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder watermarkSecurity(String watermarkSecurity) {
            this.putQueryParameter("WatermarkSecurity", watermarkSecurity);
            this.watermarkSecurity = watermarkSecurity;
            return this;
        }

        /**
         * <p>The watermark transparency.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>LIGHT (default)</li>
         * <li>DARK</li>
         * <li>MIDDLE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LIGHT</p>
         */
        public Builder watermarkTransparency(String watermarkTransparency) {
            this.putQueryParameter("WatermarkTransparency", watermarkTransparency);
            this.watermarkTransparency = watermarkTransparency;
            return this;
        }

        /**
         * <p>The watermark opacity. A larger value indicates more opaque watermarks. Valid values: 10 to 100.</p>
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
         * <p>The watermark content. You can select up to three items as the watermark content. Separate multiple items with commas (,).</p>
         * <blockquote>
         * <p> If you set this parameter to <code>Custom</code>, you must specify <code>WatermarkCustomText</code>.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>EndUserId: the username</li>
         * <li>Custom: the custom text</li>
         * <li>DesktopIp: the IP address of the cloud computer</li>
         * <li>ClientIp: the IP address of the Alibaba Cloud Workspace client</li>
         * <li>HostName: the rightmost 15 digits of the cloud computer ID</li>
         * <li>ClientTime: the current time displayed on the cloud computer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EndUserId</p>
         */
        public Builder watermarkType(String watermarkType) {
            this.putQueryParameter("WatermarkType", watermarkType);
            this.watermarkType = watermarkType;
            return this;
        }

        /**
         * <p>Specifies whether to display the Xiaoying AI Assistant entry in the DesktopAssistant menu.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: does not display the Xiaoying AI Assistant entry in the DesktopAssistant menu.</li>
         * <li>on: displays the Xiaoying AI Assistant entry in the DesktopAssistant menu.</li>
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
        public ModifyPolicyGroupRequest build() {
            return new ModifyPolicyGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(AuthorizeAccessPolicyRule model) {
                this.cidrIp = model.cidrIp;
                this.description = model.description;
            } 

            /**
             * <p>The client CIDR block. Specify an IPv4 CIDR block.</p>
             * <p>This parameter is required.</p>
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
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
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
             * <p>The object to which the security group rule applies. The value is an IPv4 CIDR block.</p>
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
             * <li>UDP: the User Datagram Protocol (UDP) protocol.</li>
             * <li>TCP: the Transmission Control Protocol (TCP) protocol.</li>
             * <li>ALL: all protocols.</li>
             * <li>GRE: the Generic Routing Encapsulation (GRE) protocol.</li>
             * <li>ICMP: the Internet Control Message Protocol (ICMP) for (IPv4)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The authorization of the security group rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>drop: denies all access requests. If no messages of access denied are returned, the requests timed out or failed.</li>
             * <li>accept: accepts all requests.</li>
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
             * <p>The port range of the security group rule. The value range of this parameter varies based on the value of the IpProtocol parameter.</p>
             * <ul>
             * <li>If the IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</li>
             * <li>If the IpProtocol parameter is set to ICMP, set the value to -1/-1.</li>
             * <li>If the IpProtocol parameter is set to GRE, set the value to -1/-1.</li>
             * <li>If the IpProtocol parameter is set to ALL, set the value to -1/-1.</li>
             * </ul>
             * <p>For more information about the common ports applied in EDS, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>22/22</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the security group rule. A smaller value indicates a higher priority. Valid values: 1 to 60. Default value: 1</p>
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
             * <li>outflow: outbound</li>
             * <li>inflow: inbound</li>
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
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
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
             * <p>The type of the Alibaba Cloud Workspace client.</p>
             * <blockquote>
             * <p> If you do not specify the <code>ClientType</code> parameter, all types of the client are allowed by default.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>html5: web client</li>
             * <li>android: Android client</li>
             * <li>windows: Windows client</li>
             * <li>ios: iOS client</li>
             * <li>macos: macOS client</li>
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
             * <p>Specifies whether to allow end users to use a specific type of the client to connect to cloud computers.</p>
             * <blockquote>
             * <p> If you do not specify the <code>ClientType</code> parameter, all types of the client are allowed by default.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>off</li>
             * <li>on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
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
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
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
             * <li>camera</li>
             * <li>adb: the Android Debug Bridge (ADB) device</li>
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
             * <li>deviceRedirect: device redirection</li>
             * <li>usbRedirect: USB redirection</li>
             * <li>off: redirection disabled</li>
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
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
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
             * <p>0x0781</p>
             */
            public Builder devicePid(String devicePid) {
                this.devicePid = devicePid;
                return this;
            }

            /**
             * <p>The peripheral type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>usbKey: UKeys</li>
             * <li>other: other peripheral devices.</li>
             * <li>graphicsTablet: graphics tablets.</li>
             * <li>printer: printers.</li>
             * <li>cardReader: card readers.</li>
             * <li>scanner: scanners.</li>
             * <li>storage: storage devices.</li>
             * <li>camera: web cameras.</li>
             * <li>adb: Android Debug Bridge (ADB) device</li>
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
             * <p>0x55b1</p>
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
             * <li>deviceRedirect: device redirection</li>
             * <li>usbRedirect: USB redirection.</li>
             * <li>off: redirection disabled</li>
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
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
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
             * <p>description policy</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.igetget.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The resolution policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>allow</li>
             * <li>block</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
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
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
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
             * <p>The client CIDR block that you want to delete. Specify an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/16</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the client IP address whitelist that you want to delete.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
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
             * <p>The object of the security group rule that you want to delete. The value is an IPv4 CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/16</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            /**
             * <p>The description of the security group rule that you want to delete.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The protocol type of the security group rule that you want to delete.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * <li>ALL</li>
             * <li>GRE</li>
             * <li>ICMP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The authorization of the security group rule that you want to delete.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>drop: denies all access requests. If no messages of access denied are returned, the requests timed out or failed.</li>
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
             * <p>The port range of the security group rule that you want to delete. The value range of this parameter varies based on the value of the IpProtocol parameter.</p>
             * <ul>
             * <li>If the IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</li>
             * <li>If the IpProtocol parameter is set to ICMP, set the value to -1/-1.</li>
             * <li>If the IpProtocol parameter is set to GRE, set the value to -1/-1.</li>
             * <li>If the IpProtocol parameter is set to ALL, set the value to -1/-1.</li>
             * </ul>
             * <p>For more information about the common ports applied in EDS, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>22/22</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the security group rule that you want to delete. A smaller value indicates a higher priority. Valid values: 1 to 60. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The direction of the security group rule that you want to delete.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>outflow: outbound</li>
             * <li>inflow: inbound</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>outflow</p>
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
     * {@link ModifyPolicyGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyPolicyGroupRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(UsbSupplyRedirectRule model) {
                this.description = model.description;
                this.deviceClass = model.deviceClass;
                this.deviceSubclass = model.deviceSubclass;
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
             * <p>The device class. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0Eh</p>
             */
            public Builder deviceClass(String deviceClass) {
                this.deviceClass = deviceClass;
                return this;
            }

            /**
             * <p>The device subclass. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>xxh</p>
             */
            public Builder deviceSubclass(String deviceSubclass) {
                this.deviceSubclass = deviceSubclass;
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
            public Builder usbRedirectType(Long usbRedirectType) {
                this.usbRedirectType = usbRedirectType;
                return this;
            }

            /**
             * <p>The type of the USB redirection rule.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>1: by device class</li>
             * <li>2: by device vendor</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usbRuleType(Long usbRuleType) {
                this.usbRuleType = usbRuleType;
                return this;
            }

            /**
             * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB VIDs</a>.</p>
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
