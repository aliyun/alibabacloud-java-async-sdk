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
         * ??????Id????????????????????????
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * ??????????????????????????????["1234567890"]???
         */
        public Builder outIds(java.util.List < String > outIds) {
            this.putBodyParameter("OutIds", outIds);
            this.outIds = outIds;
            return this;
        }

        /**
         * ??????????????????????????????????????????????????????????????????????????????????????????????????????["1234567890"]???
         */
        public Builder phoneNumbers(java.util.List < String > phoneNumbers) {
            this.putBodyParameter("PhoneNumbers", phoneNumbers);
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * ????????????Id??????????????????????????????
         */
        public Builder scheduleId(String scheduleId) {
            this.putBodyParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder signName(String signName) {
            this.putBodyParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * ??????Id??????????????????????????????????????????Id???????????????
         */
        public Builder signatureId(String signatureId) {
            this.putBodyParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * ?????????????????????????????????["1234567890"]???
         */
        public Builder smsUpExtendCodes(java.util.List < String > smsUpExtendCodes) {
            this.putBodyParameter("SmsUpExtendCodes", smsUpExtendCodes);
            this.smsUpExtendCodes = smsUpExtendCodes;
            return this;
        }

        /**
         * ??????Code???
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * ??????Id???????????????????????????Code?????????Id???????????????
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * ???????????????????????????????????????JSON?????????????????????????????????????????????[{"name":"??????","number":"15038****76"}]???
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
