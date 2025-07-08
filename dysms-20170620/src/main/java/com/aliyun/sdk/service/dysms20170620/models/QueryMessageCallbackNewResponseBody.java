// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryMessageCallbackNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessageCallbackNewResponseBody</p>
 */
public class QueryMessageCallbackNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiccsCallMidRecordCallbackUrl")
    private String aiccsCallMidRecordCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("AiccsCallRecordCallbackUrl")
    private String aiccsCallRecordCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("AiccsSentRecordCallbackUrl")
    private String aiccsSentRecordCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("ArtcCdrReportCallBackUrl")
    private String artcCdrReportCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("ArtcTempStatusReportCallBackUrl")
    private String artcTempStatusReportCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("CardDyncResCallbackUrl")
    private String cardDyncResCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("CardTemplateCallBackUrl")
    private String cardTemplateCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("CardVerderCallBackUrl")
    private String cardVerderCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("DcdpCallbackUrl")
    private String dcdpCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("DigitSmsTemplateCallBackUrl")
    private String digitSmsTemplateCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("GlobeSmsReportCallback")
    private Boolean globeSmsReportCallback;

    @com.aliyun.core.annotation.NameInMap("GlobeSmsReportCallbackUrl")
    private String globeSmsReportCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("IsAiccsCallMidRecord")
    private Boolean isAiccsCallMidRecord;

    @com.aliyun.core.annotation.NameInMap("IsAiccsCallRecord")
    private Boolean isAiccsCallRecord;

    @com.aliyun.core.annotation.NameInMap("IsAiccsSentRecord")
    private Boolean isAiccsSentRecord;

    @com.aliyun.core.annotation.NameInMap("IsArtcCdrReportCallBack")
    private Boolean isArtcCdrReportCallBack;

    @com.aliyun.core.annotation.NameInMap("IsArtcTempStatusReportCallBack")
    private Boolean isArtcTempStatusReportCallBack;

    @com.aliyun.core.annotation.NameInMap("IsDcdpCallback")
    private Boolean isDcdpCallback;

    @com.aliyun.core.annotation.NameInMap("IsDigitSmsTemplateCallBack")
    private Boolean isDigitSmsTemplateCallBack;

    @com.aliyun.core.annotation.NameInMap("IsGlobeSmsReportCallback")
    private Boolean isGlobeSmsReportCallback;

    @com.aliyun.core.annotation.NameInMap("IsOpened")
    private Boolean isOpened;

    @com.aliyun.core.annotation.NameInMap("IsSecretReportMessageCallback")
    private Boolean isSecretReportMessageCallback;

    @com.aliyun.core.annotation.NameInMap("IsSecretSmsMessageCallback")
    private Boolean isSecretSmsMessageCallback;

    @com.aliyun.core.annotation.NameInMap("IsSignReportCallback")
    private Boolean isSignReportCallback;

    @com.aliyun.core.annotation.NameInMap("IsSmartCallAsrCallBack")
    private Boolean isSmartCallAsrCallBack;

    @com.aliyun.core.annotation.NameInMap("IsSmsReportMessageCallback")
    private Boolean isSmsReportMessageCallback;

    @com.aliyun.core.annotation.NameInMap("IsSmsUpMessageCallback")
    private Boolean isSmsUpMessageCallback;

    @com.aliyun.core.annotation.NameInMap("IsTemplateReportCallback")
    private Boolean isTemplateReportCallback;

    @com.aliyun.core.annotation.NameInMap("IsVoiceAsrCallBack")
    private Boolean isVoiceAsrCallBack;

    @com.aliyun.core.annotation.NameInMap("IsVoiceCallMidStateCallBack")
    private Boolean isVoiceCallMidStateCallBack;

    @com.aliyun.core.annotation.NameInMap("IsVoiceCallRecordCallBack")
    private Boolean isVoiceCallRecordCallBack;

    @com.aliyun.core.annotation.NameInMap("IsVoiceRecordingCallBack")
    private Boolean isVoiceRecordingCallBack;

    @com.aliyun.core.annotation.NameInMap("ReportCallbackUrl")
    private String reportCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretCallbackUrl")
    private String secretCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("SecretSmsCallbackUrl")
    private String secretSmsCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("ShortLinkCallBackUrl")
    private String shortLinkCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("SignReportCallbackUrl")
    private String signReportCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("SmartCallAsrCallBackUrl")
    private String smartCallAsrCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("TemplateReportCallbackUrl")
    private String templateReportCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("UpCallbackUrl")
    private String upCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("VoiceAsrCallBackUrl")
    private String voiceAsrCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("VoiceCallMidStateCallBackUrl")
    private String voiceCallMidStateCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("VoiceCallRecordCallBackUrl")
    private String voiceCallRecordCallBackUrl;

    @com.aliyun.core.annotation.NameInMap("VoiceRecordingCallBackUrl")
    private String voiceRecordingCallBackUrl;

    private QueryMessageCallbackNewResponseBody(Builder builder) {
        this.aiccsCallMidRecordCallbackUrl = builder.aiccsCallMidRecordCallbackUrl;
        this.aiccsCallRecordCallbackUrl = builder.aiccsCallRecordCallbackUrl;
        this.aiccsSentRecordCallbackUrl = builder.aiccsSentRecordCallbackUrl;
        this.artcCdrReportCallBackUrl = builder.artcCdrReportCallBackUrl;
        this.artcTempStatusReportCallBackUrl = builder.artcTempStatusReportCallBackUrl;
        this.cardDyncResCallbackUrl = builder.cardDyncResCallbackUrl;
        this.cardTemplateCallBackUrl = builder.cardTemplateCallBackUrl;
        this.cardVerderCallBackUrl = builder.cardVerderCallBackUrl;
        this.dcdpCallbackUrl = builder.dcdpCallbackUrl;
        this.digitSmsTemplateCallBackUrl = builder.digitSmsTemplateCallBackUrl;
        this.globeSmsReportCallback = builder.globeSmsReportCallback;
        this.globeSmsReportCallbackUrl = builder.globeSmsReportCallbackUrl;
        this.isAiccsCallMidRecord = builder.isAiccsCallMidRecord;
        this.isAiccsCallRecord = builder.isAiccsCallRecord;
        this.isAiccsSentRecord = builder.isAiccsSentRecord;
        this.isArtcCdrReportCallBack = builder.isArtcCdrReportCallBack;
        this.isArtcTempStatusReportCallBack = builder.isArtcTempStatusReportCallBack;
        this.isDcdpCallback = builder.isDcdpCallback;
        this.isDigitSmsTemplateCallBack = builder.isDigitSmsTemplateCallBack;
        this.isGlobeSmsReportCallback = builder.isGlobeSmsReportCallback;
        this.isOpened = builder.isOpened;
        this.isSecretReportMessageCallback = builder.isSecretReportMessageCallback;
        this.isSecretSmsMessageCallback = builder.isSecretSmsMessageCallback;
        this.isSignReportCallback = builder.isSignReportCallback;
        this.isSmartCallAsrCallBack = builder.isSmartCallAsrCallBack;
        this.isSmsReportMessageCallback = builder.isSmsReportMessageCallback;
        this.isSmsUpMessageCallback = builder.isSmsUpMessageCallback;
        this.isTemplateReportCallback = builder.isTemplateReportCallback;
        this.isVoiceAsrCallBack = builder.isVoiceAsrCallBack;
        this.isVoiceCallMidStateCallBack = builder.isVoiceCallMidStateCallBack;
        this.isVoiceCallRecordCallBack = builder.isVoiceCallRecordCallBack;
        this.isVoiceRecordingCallBack = builder.isVoiceRecordingCallBack;
        this.reportCallbackUrl = builder.reportCallbackUrl;
        this.requestId = builder.requestId;
        this.secretCallbackUrl = builder.secretCallbackUrl;
        this.secretSmsCallbackUrl = builder.secretSmsCallbackUrl;
        this.shortLinkCallBackUrl = builder.shortLinkCallBackUrl;
        this.signReportCallbackUrl = builder.signReportCallbackUrl;
        this.smartCallAsrCallBackUrl = builder.smartCallAsrCallBackUrl;
        this.templateReportCallbackUrl = builder.templateReportCallbackUrl;
        this.upCallbackUrl = builder.upCallbackUrl;
        this.voiceAsrCallBackUrl = builder.voiceAsrCallBackUrl;
        this.voiceCallMidStateCallBackUrl = builder.voiceCallMidStateCallBackUrl;
        this.voiceCallRecordCallBackUrl = builder.voiceCallRecordCallBackUrl;
        this.voiceRecordingCallBackUrl = builder.voiceRecordingCallBackUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageCallbackNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiccsCallMidRecordCallbackUrl
     */
    public String getAiccsCallMidRecordCallbackUrl() {
        return this.aiccsCallMidRecordCallbackUrl;
    }

    /**
     * @return aiccsCallRecordCallbackUrl
     */
    public String getAiccsCallRecordCallbackUrl() {
        return this.aiccsCallRecordCallbackUrl;
    }

    /**
     * @return aiccsSentRecordCallbackUrl
     */
    public String getAiccsSentRecordCallbackUrl() {
        return this.aiccsSentRecordCallbackUrl;
    }

    /**
     * @return artcCdrReportCallBackUrl
     */
    public String getArtcCdrReportCallBackUrl() {
        return this.artcCdrReportCallBackUrl;
    }

    /**
     * @return artcTempStatusReportCallBackUrl
     */
    public String getArtcTempStatusReportCallBackUrl() {
        return this.artcTempStatusReportCallBackUrl;
    }

    /**
     * @return cardDyncResCallbackUrl
     */
    public String getCardDyncResCallbackUrl() {
        return this.cardDyncResCallbackUrl;
    }

    /**
     * @return cardTemplateCallBackUrl
     */
    public String getCardTemplateCallBackUrl() {
        return this.cardTemplateCallBackUrl;
    }

    /**
     * @return cardVerderCallBackUrl
     */
    public String getCardVerderCallBackUrl() {
        return this.cardVerderCallBackUrl;
    }

    /**
     * @return dcdpCallbackUrl
     */
    public String getDcdpCallbackUrl() {
        return this.dcdpCallbackUrl;
    }

    /**
     * @return digitSmsTemplateCallBackUrl
     */
    public String getDigitSmsTemplateCallBackUrl() {
        return this.digitSmsTemplateCallBackUrl;
    }

    /**
     * @return globeSmsReportCallback
     */
    public Boolean getGlobeSmsReportCallback() {
        return this.globeSmsReportCallback;
    }

    /**
     * @return globeSmsReportCallbackUrl
     */
    public String getGlobeSmsReportCallbackUrl() {
        return this.globeSmsReportCallbackUrl;
    }

    /**
     * @return isAiccsCallMidRecord
     */
    public Boolean getIsAiccsCallMidRecord() {
        return this.isAiccsCallMidRecord;
    }

    /**
     * @return isAiccsCallRecord
     */
    public Boolean getIsAiccsCallRecord() {
        return this.isAiccsCallRecord;
    }

    /**
     * @return isAiccsSentRecord
     */
    public Boolean getIsAiccsSentRecord() {
        return this.isAiccsSentRecord;
    }

    /**
     * @return isArtcCdrReportCallBack
     */
    public Boolean getIsArtcCdrReportCallBack() {
        return this.isArtcCdrReportCallBack;
    }

    /**
     * @return isArtcTempStatusReportCallBack
     */
    public Boolean getIsArtcTempStatusReportCallBack() {
        return this.isArtcTempStatusReportCallBack;
    }

    /**
     * @return isDcdpCallback
     */
    public Boolean getIsDcdpCallback() {
        return this.isDcdpCallback;
    }

    /**
     * @return isDigitSmsTemplateCallBack
     */
    public Boolean getIsDigitSmsTemplateCallBack() {
        return this.isDigitSmsTemplateCallBack;
    }

    /**
     * @return isGlobeSmsReportCallback
     */
    public Boolean getIsGlobeSmsReportCallback() {
        return this.isGlobeSmsReportCallback;
    }

    /**
     * @return isOpened
     */
    public Boolean getIsOpened() {
        return this.isOpened;
    }

    /**
     * @return isSecretReportMessageCallback
     */
    public Boolean getIsSecretReportMessageCallback() {
        return this.isSecretReportMessageCallback;
    }

    /**
     * @return isSecretSmsMessageCallback
     */
    public Boolean getIsSecretSmsMessageCallback() {
        return this.isSecretSmsMessageCallback;
    }

    /**
     * @return isSignReportCallback
     */
    public Boolean getIsSignReportCallback() {
        return this.isSignReportCallback;
    }

    /**
     * @return isSmartCallAsrCallBack
     */
    public Boolean getIsSmartCallAsrCallBack() {
        return this.isSmartCallAsrCallBack;
    }

    /**
     * @return isSmsReportMessageCallback
     */
    public Boolean getIsSmsReportMessageCallback() {
        return this.isSmsReportMessageCallback;
    }

    /**
     * @return isSmsUpMessageCallback
     */
    public Boolean getIsSmsUpMessageCallback() {
        return this.isSmsUpMessageCallback;
    }

    /**
     * @return isTemplateReportCallback
     */
    public Boolean getIsTemplateReportCallback() {
        return this.isTemplateReportCallback;
    }

    /**
     * @return isVoiceAsrCallBack
     */
    public Boolean getIsVoiceAsrCallBack() {
        return this.isVoiceAsrCallBack;
    }

    /**
     * @return isVoiceCallMidStateCallBack
     */
    public Boolean getIsVoiceCallMidStateCallBack() {
        return this.isVoiceCallMidStateCallBack;
    }

    /**
     * @return isVoiceCallRecordCallBack
     */
    public Boolean getIsVoiceCallRecordCallBack() {
        return this.isVoiceCallRecordCallBack;
    }

    /**
     * @return isVoiceRecordingCallBack
     */
    public Boolean getIsVoiceRecordingCallBack() {
        return this.isVoiceRecordingCallBack;
    }

    /**
     * @return reportCallbackUrl
     */
    public String getReportCallbackUrl() {
        return this.reportCallbackUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretCallbackUrl
     */
    public String getSecretCallbackUrl() {
        return this.secretCallbackUrl;
    }

    /**
     * @return secretSmsCallbackUrl
     */
    public String getSecretSmsCallbackUrl() {
        return this.secretSmsCallbackUrl;
    }

    /**
     * @return shortLinkCallBackUrl
     */
    public String getShortLinkCallBackUrl() {
        return this.shortLinkCallBackUrl;
    }

    /**
     * @return signReportCallbackUrl
     */
    public String getSignReportCallbackUrl() {
        return this.signReportCallbackUrl;
    }

    /**
     * @return smartCallAsrCallBackUrl
     */
    public String getSmartCallAsrCallBackUrl() {
        return this.smartCallAsrCallBackUrl;
    }

    /**
     * @return templateReportCallbackUrl
     */
    public String getTemplateReportCallbackUrl() {
        return this.templateReportCallbackUrl;
    }

    /**
     * @return upCallbackUrl
     */
    public String getUpCallbackUrl() {
        return this.upCallbackUrl;
    }

    /**
     * @return voiceAsrCallBackUrl
     */
    public String getVoiceAsrCallBackUrl() {
        return this.voiceAsrCallBackUrl;
    }

    /**
     * @return voiceCallMidStateCallBackUrl
     */
    public String getVoiceCallMidStateCallBackUrl() {
        return this.voiceCallMidStateCallBackUrl;
    }

    /**
     * @return voiceCallRecordCallBackUrl
     */
    public String getVoiceCallRecordCallBackUrl() {
        return this.voiceCallRecordCallBackUrl;
    }

    /**
     * @return voiceRecordingCallBackUrl
     */
    public String getVoiceRecordingCallBackUrl() {
        return this.voiceRecordingCallBackUrl;
    }

    public static final class Builder {
        private String aiccsCallMidRecordCallbackUrl; 
        private String aiccsCallRecordCallbackUrl; 
        private String aiccsSentRecordCallbackUrl; 
        private String artcCdrReportCallBackUrl; 
        private String artcTempStatusReportCallBackUrl; 
        private String cardDyncResCallbackUrl; 
        private String cardTemplateCallBackUrl; 
        private String cardVerderCallBackUrl; 
        private String dcdpCallbackUrl; 
        private String digitSmsTemplateCallBackUrl; 
        private Boolean globeSmsReportCallback; 
        private String globeSmsReportCallbackUrl; 
        private Boolean isAiccsCallMidRecord; 
        private Boolean isAiccsCallRecord; 
        private Boolean isAiccsSentRecord; 
        private Boolean isArtcCdrReportCallBack; 
        private Boolean isArtcTempStatusReportCallBack; 
        private Boolean isDcdpCallback; 
        private Boolean isDigitSmsTemplateCallBack; 
        private Boolean isGlobeSmsReportCallback; 
        private Boolean isOpened; 
        private Boolean isSecretReportMessageCallback; 
        private Boolean isSecretSmsMessageCallback; 
        private Boolean isSignReportCallback; 
        private Boolean isSmartCallAsrCallBack; 
        private Boolean isSmsReportMessageCallback; 
        private Boolean isSmsUpMessageCallback; 
        private Boolean isTemplateReportCallback; 
        private Boolean isVoiceAsrCallBack; 
        private Boolean isVoiceCallMidStateCallBack; 
        private Boolean isVoiceCallRecordCallBack; 
        private Boolean isVoiceRecordingCallBack; 
        private String reportCallbackUrl; 
        private String requestId; 
        private String secretCallbackUrl; 
        private String secretSmsCallbackUrl; 
        private String shortLinkCallBackUrl; 
        private String signReportCallbackUrl; 
        private String smartCallAsrCallBackUrl; 
        private String templateReportCallbackUrl; 
        private String upCallbackUrl; 
        private String voiceAsrCallBackUrl; 
        private String voiceCallMidStateCallBackUrl; 
        private String voiceCallRecordCallBackUrl; 
        private String voiceRecordingCallBackUrl; 

        private Builder() {
        } 

        private Builder(QueryMessageCallbackNewResponseBody model) {
            this.aiccsCallMidRecordCallbackUrl = model.aiccsCallMidRecordCallbackUrl;
            this.aiccsCallRecordCallbackUrl = model.aiccsCallRecordCallbackUrl;
            this.aiccsSentRecordCallbackUrl = model.aiccsSentRecordCallbackUrl;
            this.artcCdrReportCallBackUrl = model.artcCdrReportCallBackUrl;
            this.artcTempStatusReportCallBackUrl = model.artcTempStatusReportCallBackUrl;
            this.cardDyncResCallbackUrl = model.cardDyncResCallbackUrl;
            this.cardTemplateCallBackUrl = model.cardTemplateCallBackUrl;
            this.cardVerderCallBackUrl = model.cardVerderCallBackUrl;
            this.dcdpCallbackUrl = model.dcdpCallbackUrl;
            this.digitSmsTemplateCallBackUrl = model.digitSmsTemplateCallBackUrl;
            this.globeSmsReportCallback = model.globeSmsReportCallback;
            this.globeSmsReportCallbackUrl = model.globeSmsReportCallbackUrl;
            this.isAiccsCallMidRecord = model.isAiccsCallMidRecord;
            this.isAiccsCallRecord = model.isAiccsCallRecord;
            this.isAiccsSentRecord = model.isAiccsSentRecord;
            this.isArtcCdrReportCallBack = model.isArtcCdrReportCallBack;
            this.isArtcTempStatusReportCallBack = model.isArtcTempStatusReportCallBack;
            this.isDcdpCallback = model.isDcdpCallback;
            this.isDigitSmsTemplateCallBack = model.isDigitSmsTemplateCallBack;
            this.isGlobeSmsReportCallback = model.isGlobeSmsReportCallback;
            this.isOpened = model.isOpened;
            this.isSecretReportMessageCallback = model.isSecretReportMessageCallback;
            this.isSecretSmsMessageCallback = model.isSecretSmsMessageCallback;
            this.isSignReportCallback = model.isSignReportCallback;
            this.isSmartCallAsrCallBack = model.isSmartCallAsrCallBack;
            this.isSmsReportMessageCallback = model.isSmsReportMessageCallback;
            this.isSmsUpMessageCallback = model.isSmsUpMessageCallback;
            this.isTemplateReportCallback = model.isTemplateReportCallback;
            this.isVoiceAsrCallBack = model.isVoiceAsrCallBack;
            this.isVoiceCallMidStateCallBack = model.isVoiceCallMidStateCallBack;
            this.isVoiceCallRecordCallBack = model.isVoiceCallRecordCallBack;
            this.isVoiceRecordingCallBack = model.isVoiceRecordingCallBack;
            this.reportCallbackUrl = model.reportCallbackUrl;
            this.requestId = model.requestId;
            this.secretCallbackUrl = model.secretCallbackUrl;
            this.secretSmsCallbackUrl = model.secretSmsCallbackUrl;
            this.shortLinkCallBackUrl = model.shortLinkCallBackUrl;
            this.signReportCallbackUrl = model.signReportCallbackUrl;
            this.smartCallAsrCallBackUrl = model.smartCallAsrCallBackUrl;
            this.templateReportCallbackUrl = model.templateReportCallbackUrl;
            this.upCallbackUrl = model.upCallbackUrl;
            this.voiceAsrCallBackUrl = model.voiceAsrCallBackUrl;
            this.voiceCallMidStateCallBackUrl = model.voiceCallMidStateCallBackUrl;
            this.voiceCallRecordCallBackUrl = model.voiceCallRecordCallBackUrl;
            this.voiceRecordingCallBackUrl = model.voiceRecordingCallBackUrl;
        } 

        /**
         * AiccsCallMidRecordCallbackUrl.
         */
        public Builder aiccsCallMidRecordCallbackUrl(String aiccsCallMidRecordCallbackUrl) {
            this.aiccsCallMidRecordCallbackUrl = aiccsCallMidRecordCallbackUrl;
            return this;
        }

        /**
         * AiccsCallRecordCallbackUrl.
         */
        public Builder aiccsCallRecordCallbackUrl(String aiccsCallRecordCallbackUrl) {
            this.aiccsCallRecordCallbackUrl = aiccsCallRecordCallbackUrl;
            return this;
        }

        /**
         * AiccsSentRecordCallbackUrl.
         */
        public Builder aiccsSentRecordCallbackUrl(String aiccsSentRecordCallbackUrl) {
            this.aiccsSentRecordCallbackUrl = aiccsSentRecordCallbackUrl;
            return this;
        }

        /**
         * ArtcCdrReportCallBackUrl.
         */
        public Builder artcCdrReportCallBackUrl(String artcCdrReportCallBackUrl) {
            this.artcCdrReportCallBackUrl = artcCdrReportCallBackUrl;
            return this;
        }

        /**
         * ArtcTempStatusReportCallBackUrl.
         */
        public Builder artcTempStatusReportCallBackUrl(String artcTempStatusReportCallBackUrl) {
            this.artcTempStatusReportCallBackUrl = artcTempStatusReportCallBackUrl;
            return this;
        }

        /**
         * CardDyncResCallbackUrl.
         */
        public Builder cardDyncResCallbackUrl(String cardDyncResCallbackUrl) {
            this.cardDyncResCallbackUrl = cardDyncResCallbackUrl;
            return this;
        }

        /**
         * CardTemplateCallBackUrl.
         */
        public Builder cardTemplateCallBackUrl(String cardTemplateCallBackUrl) {
            this.cardTemplateCallBackUrl = cardTemplateCallBackUrl;
            return this;
        }

        /**
         * CardVerderCallBackUrl.
         */
        public Builder cardVerderCallBackUrl(String cardVerderCallBackUrl) {
            this.cardVerderCallBackUrl = cardVerderCallBackUrl;
            return this;
        }

        /**
         * DcdpCallbackUrl.
         */
        public Builder dcdpCallbackUrl(String dcdpCallbackUrl) {
            this.dcdpCallbackUrl = dcdpCallbackUrl;
            return this;
        }

        /**
         * DigitSmsTemplateCallBackUrl.
         */
        public Builder digitSmsTemplateCallBackUrl(String digitSmsTemplateCallBackUrl) {
            this.digitSmsTemplateCallBackUrl = digitSmsTemplateCallBackUrl;
            return this;
        }

        /**
         * GlobeSmsReportCallback.
         */
        public Builder globeSmsReportCallback(Boolean globeSmsReportCallback) {
            this.globeSmsReportCallback = globeSmsReportCallback;
            return this;
        }

        /**
         * GlobeSmsReportCallbackUrl.
         */
        public Builder globeSmsReportCallbackUrl(String globeSmsReportCallbackUrl) {
            this.globeSmsReportCallbackUrl = globeSmsReportCallbackUrl;
            return this;
        }

        /**
         * IsAiccsCallMidRecord.
         */
        public Builder isAiccsCallMidRecord(Boolean isAiccsCallMidRecord) {
            this.isAiccsCallMidRecord = isAiccsCallMidRecord;
            return this;
        }

        /**
         * IsAiccsCallRecord.
         */
        public Builder isAiccsCallRecord(Boolean isAiccsCallRecord) {
            this.isAiccsCallRecord = isAiccsCallRecord;
            return this;
        }

        /**
         * IsAiccsSentRecord.
         */
        public Builder isAiccsSentRecord(Boolean isAiccsSentRecord) {
            this.isAiccsSentRecord = isAiccsSentRecord;
            return this;
        }

        /**
         * IsArtcCdrReportCallBack.
         */
        public Builder isArtcCdrReportCallBack(Boolean isArtcCdrReportCallBack) {
            this.isArtcCdrReportCallBack = isArtcCdrReportCallBack;
            return this;
        }

        /**
         * IsArtcTempStatusReportCallBack.
         */
        public Builder isArtcTempStatusReportCallBack(Boolean isArtcTempStatusReportCallBack) {
            this.isArtcTempStatusReportCallBack = isArtcTempStatusReportCallBack;
            return this;
        }

        /**
         * IsDcdpCallback.
         */
        public Builder isDcdpCallback(Boolean isDcdpCallback) {
            this.isDcdpCallback = isDcdpCallback;
            return this;
        }

        /**
         * IsDigitSmsTemplateCallBack.
         */
        public Builder isDigitSmsTemplateCallBack(Boolean isDigitSmsTemplateCallBack) {
            this.isDigitSmsTemplateCallBack = isDigitSmsTemplateCallBack;
            return this;
        }

        /**
         * IsGlobeSmsReportCallback.
         */
        public Builder isGlobeSmsReportCallback(Boolean isGlobeSmsReportCallback) {
            this.isGlobeSmsReportCallback = isGlobeSmsReportCallback;
            return this;
        }

        /**
         * IsOpened.
         */
        public Builder isOpened(Boolean isOpened) {
            this.isOpened = isOpened;
            return this;
        }

        /**
         * IsSecretReportMessageCallback.
         */
        public Builder isSecretReportMessageCallback(Boolean isSecretReportMessageCallback) {
            this.isSecretReportMessageCallback = isSecretReportMessageCallback;
            return this;
        }

        /**
         * IsSecretSmsMessageCallback.
         */
        public Builder isSecretSmsMessageCallback(Boolean isSecretSmsMessageCallback) {
            this.isSecretSmsMessageCallback = isSecretSmsMessageCallback;
            return this;
        }

        /**
         * IsSignReportCallback.
         */
        public Builder isSignReportCallback(Boolean isSignReportCallback) {
            this.isSignReportCallback = isSignReportCallback;
            return this;
        }

        /**
         * IsSmartCallAsrCallBack.
         */
        public Builder isSmartCallAsrCallBack(Boolean isSmartCallAsrCallBack) {
            this.isSmartCallAsrCallBack = isSmartCallAsrCallBack;
            return this;
        }

        /**
         * IsSmsReportMessageCallback.
         */
        public Builder isSmsReportMessageCallback(Boolean isSmsReportMessageCallback) {
            this.isSmsReportMessageCallback = isSmsReportMessageCallback;
            return this;
        }

        /**
         * IsSmsUpMessageCallback.
         */
        public Builder isSmsUpMessageCallback(Boolean isSmsUpMessageCallback) {
            this.isSmsUpMessageCallback = isSmsUpMessageCallback;
            return this;
        }

        /**
         * IsTemplateReportCallback.
         */
        public Builder isTemplateReportCallback(Boolean isTemplateReportCallback) {
            this.isTemplateReportCallback = isTemplateReportCallback;
            return this;
        }

        /**
         * IsVoiceAsrCallBack.
         */
        public Builder isVoiceAsrCallBack(Boolean isVoiceAsrCallBack) {
            this.isVoiceAsrCallBack = isVoiceAsrCallBack;
            return this;
        }

        /**
         * IsVoiceCallMidStateCallBack.
         */
        public Builder isVoiceCallMidStateCallBack(Boolean isVoiceCallMidStateCallBack) {
            this.isVoiceCallMidStateCallBack = isVoiceCallMidStateCallBack;
            return this;
        }

        /**
         * IsVoiceCallRecordCallBack.
         */
        public Builder isVoiceCallRecordCallBack(Boolean isVoiceCallRecordCallBack) {
            this.isVoiceCallRecordCallBack = isVoiceCallRecordCallBack;
            return this;
        }

        /**
         * IsVoiceRecordingCallBack.
         */
        public Builder isVoiceRecordingCallBack(Boolean isVoiceRecordingCallBack) {
            this.isVoiceRecordingCallBack = isVoiceRecordingCallBack;
            return this;
        }

        /**
         * ReportCallbackUrl.
         */
        public Builder reportCallbackUrl(String reportCallbackUrl) {
            this.reportCallbackUrl = reportCallbackUrl;
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
         * SecretCallbackUrl.
         */
        public Builder secretCallbackUrl(String secretCallbackUrl) {
            this.secretCallbackUrl = secretCallbackUrl;
            return this;
        }

        /**
         * SecretSmsCallbackUrl.
         */
        public Builder secretSmsCallbackUrl(String secretSmsCallbackUrl) {
            this.secretSmsCallbackUrl = secretSmsCallbackUrl;
            return this;
        }

        /**
         * ShortLinkCallBackUrl.
         */
        public Builder shortLinkCallBackUrl(String shortLinkCallBackUrl) {
            this.shortLinkCallBackUrl = shortLinkCallBackUrl;
            return this;
        }

        /**
         * SignReportCallbackUrl.
         */
        public Builder signReportCallbackUrl(String signReportCallbackUrl) {
            this.signReportCallbackUrl = signReportCallbackUrl;
            return this;
        }

        /**
         * SmartCallAsrCallBackUrl.
         */
        public Builder smartCallAsrCallBackUrl(String smartCallAsrCallBackUrl) {
            this.smartCallAsrCallBackUrl = smartCallAsrCallBackUrl;
            return this;
        }

        /**
         * TemplateReportCallbackUrl.
         */
        public Builder templateReportCallbackUrl(String templateReportCallbackUrl) {
            this.templateReportCallbackUrl = templateReportCallbackUrl;
            return this;
        }

        /**
         * UpCallbackUrl.
         */
        public Builder upCallbackUrl(String upCallbackUrl) {
            this.upCallbackUrl = upCallbackUrl;
            return this;
        }

        /**
         * VoiceAsrCallBackUrl.
         */
        public Builder voiceAsrCallBackUrl(String voiceAsrCallBackUrl) {
            this.voiceAsrCallBackUrl = voiceAsrCallBackUrl;
            return this;
        }

        /**
         * VoiceCallMidStateCallBackUrl.
         */
        public Builder voiceCallMidStateCallBackUrl(String voiceCallMidStateCallBackUrl) {
            this.voiceCallMidStateCallBackUrl = voiceCallMidStateCallBackUrl;
            return this;
        }

        /**
         * VoiceCallRecordCallBackUrl.
         */
        public Builder voiceCallRecordCallBackUrl(String voiceCallRecordCallBackUrl) {
            this.voiceCallRecordCallBackUrl = voiceCallRecordCallBackUrl;
            return this;
        }

        /**
         * VoiceRecordingCallBackUrl.
         */
        public Builder voiceRecordingCallBackUrl(String voiceRecordingCallBackUrl) {
            this.voiceRecordingCallBackUrl = voiceRecordingCallBackUrl;
            return this;
        }

        public QueryMessageCallbackNewResponseBody build() {
            return new QueryMessageCallbackNewResponseBody(this);
        } 

    } 

}
