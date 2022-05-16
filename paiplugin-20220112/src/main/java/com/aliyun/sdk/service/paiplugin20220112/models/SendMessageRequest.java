// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageRequest} extends {@link RequestModel}
 *
 * <p>SendMessageRequest</p>
 */
public class SendMessageRequest extends Request {
    @Body
    @NameInMap("GroupId")
    private String groupId;

    @Body
    @NameInMap("OutIds")
    private java.util.List < String > outIds;

    @Body
    @NameInMap("PhoneNumbers")
    private java.util.List < String > phoneNumbers;

    @Body
    @NameInMap("ScheduleId")
    private String scheduleId;

    @Body
    @NameInMap("SignName")
    private String signName;

    @Body
    @NameInMap("SignatureId")
    private String signatureId;

    @Body
    @NameInMap("SmsUpExtendCodes")
    private java.util.List < String > smsUpExtendCodes;

    @Body
    @NameInMap("TemplateCode")
    private String templateCode;

    @Body
    @NameInMap("TemplateId")
    private String templateId;

    @Body
    @NameInMap("TemplateParams")
    private java.util.List < String > templateParams;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.outIds = builder.outIds;
        this.phoneNumbers = builder.phoneNumbers;
        this.scheduleId = builder.scheduleId;
        this.signName = builder.signName;
        this.signatureId = builder.signatureId;
        this.smsUpExtendCodes = builder.smsUpExtendCodes;
        this.templateCode = builder.templateCode;
        this.templateId = builder.templateId;
        this.templateParams = builder.templateParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return outIds
     */
    public java.util.List < String > getOutIds() {
        return this.outIds;
    }

    /**
     * @return phoneNumbers
     */
    public java.util.List < String > getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * @return scheduleId
     */
    public String getScheduleId() {
        return this.scheduleId;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signatureId
     */
    public String getSignatureId() {
        return this.signatureId;
    }

    /**
     * @return smsUpExtendCodes
     */
    public java.util.List < String > getSmsUpExtendCodes() {
        return this.smsUpExtendCodes;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateParams
     */
    public java.util.List < String > getTemplateParams() {
        return this.templateParams;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private String groupId; 
        private java.util.List < String > outIds; 
        private java.util.List < String > phoneNumbers; 
        private String scheduleId; 
        private String signName; 
        private String signatureId; 
        private java.util.List < String > smsUpExtendCodes; 
        private String templateCode; 
        private String templateId; 
        private java.util.List < String > templateParams; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.outIds = request.outIds;
            this.phoneNumbers = request.phoneNumbers;
            this.scheduleId = request.scheduleId;
            this.signName = request.signName;
            this.signatureId = request.signatureId;
            this.smsUpExtendCodes = request.smsUpExtendCodes;
            this.templateCode = request.templateCode;
            this.templateId = request.templateId;
            this.templateParams = request.templateParams;
        } 

        /**
         * 人群Id，用于关联人群。
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * 外部拓展字段，示例：["1234567890"]。
         */
        public Builder outIds(java.util.List < String > outIds) {
            this.putBodyParameter("OutIds", outIds);
            this.outIds = outIds;
            return this;
        }

        /**
         * 手机号，每个手机号对应一个模板变量、上行拓展码和外部拓展字段，示例：["1234567890"]。
         */
        public Builder phoneNumbers(java.util.List < String > phoneNumbers) {
            this.putBodyParameter("PhoneNumbers", phoneNumbers);
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * 触达计划Id，用于关联触达计划。
         */
        public Builder scheduleId(String scheduleId) {
            this.putBodyParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * 签名名称。
         */
        public Builder signName(String signName) {
            this.putBodyParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * 签名Id，同时只能指定签名名称或签名Id其中之一。
         */
        public Builder signatureId(String signatureId) {
            this.putBodyParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * 短信上行拓展码，示例：["1234567890"]。
         */
        public Builder smsUpExtendCodes(java.util.List < String > smsUpExtendCodes) {
            this.putBodyParameter("SmsUpExtendCodes", smsUpExtendCodes);
            this.smsUpExtendCodes = smsUpExtendCodes;
            return this;
        }

        /**
         * 模板Code。
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * 模板Id，同时只能指定模板Code或模板Id其中之一。
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * 短信模板变量对应的实际值，JSON格式。支持传入多个参数，示例：[{"name":"张三","number":"15038****76"}]。
         */
        public Builder templateParams(java.util.List < String > templateParams) {
            this.putBodyParameter("TemplateParams", templateParams);
            this.templateParams = templateParams;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

}
