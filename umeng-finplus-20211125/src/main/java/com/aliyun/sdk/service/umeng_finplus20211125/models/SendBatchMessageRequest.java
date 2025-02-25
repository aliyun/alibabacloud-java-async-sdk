// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendBatchMessageRequest} extends {@link RequestModel}
 *
 * <p>SendBatchMessageRequest</p>
 */
public class SendBatchMessageRequest extends Request {
    @Body
    @NameInMap("BatchFlag")
    private String batchFlag;

    @Body
    @NameInMap("ExtendInfo")
    private String extendInfo;

    @Body
    @NameInMap("IdType")
    @Validation(required = true)
    private String idType;

    @Body
    @NameInMap("PhoneNumberJson")
    @Validation(required = true)
    private String phoneNumberJson;

    @Body
    @NameInMap("SignNameJson")
    @Validation(required = true)
    private String signNameJson;

    @Body
    @NameInMap("SpecificChannel")
    private String specificChannel;

    @Body
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Body
    @NameInMap("TemplateParamJson")
    @Validation(required = true)
    private String templateParamJson;

    private SendBatchMessageRequest(Builder builder) {
        super(builder);
        this.batchFlag = builder.batchFlag;
        this.extendInfo = builder.extendInfo;
        this.idType = builder.idType;
        this.phoneNumberJson = builder.phoneNumberJson;
        this.signNameJson = builder.signNameJson;
        this.specificChannel = builder.specificChannel;
        this.templateCode = builder.templateCode;
        this.templateParamJson = builder.templateParamJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendBatchMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchFlag
     */
    public String getBatchFlag() {
        return this.batchFlag;
    }

    /**
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return idType
     */
    public String getIdType() {
        return this.idType;
    }

    /**
     * @return phoneNumberJson
     */
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    /**
     * @return signNameJson
     */
    public String getSignNameJson() {
        return this.signNameJson;
    }

    /**
     * @return specificChannel
     */
    public String getSpecificChannel() {
        return this.specificChannel;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParamJson
     */
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

    public static final class Builder extends Request.Builder<SendBatchMessageRequest, Builder> {
        private String batchFlag; 
        private String extendInfo; 
        private String idType; 
        private String phoneNumberJson; 
        private String signNameJson; 
        private String specificChannel; 
        private String templateCode; 
        private String templateParamJson; 

        private Builder() {
            super();
        } 

        private Builder(SendBatchMessageRequest request) {
            super(request);
            this.batchFlag = request.batchFlag;
            this.extendInfo = request.extendInfo;
            this.idType = request.idType;
            this.phoneNumberJson = request.phoneNumberJson;
            this.signNameJson = request.signNameJson;
            this.specificChannel = request.specificChannel;
            this.templateCode = request.templateCode;
            this.templateParamJson = request.templateParamJson;
        } 

        /**
         * BatchFlag.
         */
        public Builder batchFlag(String batchFlag) {
            this.putBodyParameter("BatchFlag", batchFlag);
            this.batchFlag = batchFlag;
            return this;
        }

        /**
         * ExtendInfo.
         */
        public Builder extendInfo(String extendInfo) {
            this.putBodyParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * IdType.
         */
        public Builder idType(String idType) {
            this.putBodyParameter("IdType", idType);
            this.idType = idType;
            return this;
        }

        /**
         * PhoneNumberJson.
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putBodyParameter("PhoneNumberJson", phoneNumberJson);
            this.phoneNumberJson = phoneNumberJson;
            return this;
        }

        /**
         * SignNameJson.
         */
        public Builder signNameJson(String signNameJson) {
            this.putBodyParameter("SignNameJson", signNameJson);
            this.signNameJson = signNameJson;
            return this;
        }

        /**
         * SpecificChannel.
         */
        public Builder specificChannel(String specificChannel) {
            this.putBodyParameter("SpecificChannel", specificChannel);
            this.specificChannel = specificChannel;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateParamJson.
         */
        public Builder templateParamJson(String templateParamJson) {
            this.putBodyParameter("TemplateParamJson", templateParamJson);
            this.templateParamJson = templateParamJson;
            return this;
        }

        @Override
        public SendBatchMessageRequest build() {
            return new SendBatchMessageRequest(this);
        } 

    } 

}
