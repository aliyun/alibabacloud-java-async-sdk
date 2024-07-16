// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescTemplateResponseBody</p>
 */
public class DescTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsContent")
    private String smsContent;

    @com.aliyun.core.annotation.NameInMap("SmsType")
    private String smsType;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TemplateNickName")
    private String templateNickName;

    @com.aliyun.core.annotation.NameInMap("TemplateStatus")
    private String templateStatus;

    @com.aliyun.core.annotation.NameInMap("TemplateSubject")
    private String templateSubject;

    @com.aliyun.core.annotation.NameInMap("TemplateText")
    private String templateText;

    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private DescTemplateResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.smsContent = builder.smsContent;
        this.smsType = builder.smsType;
        this.templateName = builder.templateName;
        this.templateNickName = builder.templateNickName;
        this.templateStatus = builder.templateStatus;
        this.templateSubject = builder.templateSubject;
        this.templateText = builder.templateText;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smsContent
     */
    public String getSmsContent() {
        return this.smsContent;
    }

    /**
     * @return smsType
     */
    public String getSmsType() {
        return this.smsType;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateNickName
     */
    public String getTemplateNickName() {
        return this.templateNickName;
    }

    /**
     * @return templateStatus
     */
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    /**
     * @return templateSubject
     */
    public String getTemplateSubject() {
        return this.templateSubject;
    }

    /**
     * @return templateText
     */
    public String getTemplateText() {
        return this.templateText;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder {
        private String createTime; 
        private String remark; 
        private String requestId; 
        private String smsContent; 
        private String smsType; 
        private String templateName; 
        private String templateNickName; 
        private String templateStatus; 
        private String templateSubject; 
        private String templateText; 
        private String templateType; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * SmsContent.
         */
        public Builder smsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }

        /**
         * SmsType.
         */
        public Builder smsType(String smsType) {
            this.smsType = smsType;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateNickName.
         */
        public Builder templateNickName(String templateNickName) {
            this.templateNickName = templateNickName;
            return this;
        }

        /**
         * TemplateStatus.
         */
        public Builder templateStatus(String templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * TemplateSubject.
         */
        public Builder templateSubject(String templateSubject) {
            this.templateSubject = templateSubject;
            return this;
        }

        /**
         * TemplateText.
         */
        public Builder templateText(String templateText) {
            this.templateText = templateText;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        public DescTemplateResponseBody build() {
            return new DescTemplateResponseBody(this);
        } 

    } 

}
