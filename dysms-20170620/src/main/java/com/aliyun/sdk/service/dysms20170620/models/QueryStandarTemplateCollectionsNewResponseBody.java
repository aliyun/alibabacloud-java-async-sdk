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
 * {@link QueryStandarTemplateCollectionsNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStandarTemplateCollectionsNewResponseBody</p>
 */
public class QueryStandarTemplateCollectionsNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryStandarTemplateCollectionsNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStandarTemplateCollectionsNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private List list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryStandarTemplateCollectionsNewResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryStandarTemplateCollectionsNewResponseBody build() {
            return new QueryStandarTemplateCollectionsNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryStandarTemplateCollectionsNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStandarTemplateCollectionsNewResponseBody</p>
     */
    public static class FcPartnerTemplateDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private Integer businessType;

        @com.aliyun.core.annotation.NameInMap("FcTag")
        private Long fcTag;

        @com.aliyun.core.annotation.NameInMap("I18n")
        private String i18n;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Integer isDeleted;

        @com.aliyun.core.annotation.NameInMap("McBusinessType")
        private Integer mcBusinessType;

        @com.aliyun.core.annotation.NameInMap("McCategory")
        private Integer mcCategory;

        @com.aliyun.core.annotation.NameInMap("McSignature")
        private String mcSignature;

        @com.aliyun.core.annotation.NameInMap("MessageTypeId")
        private Long messageTypeId;

        @com.aliyun.core.annotation.NameInMap("OpNick")
        private String opNick;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private Long partnerId;

        @com.aliyun.core.annotation.NameInMap("QualificationId")
        private Long qualificationId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SignTemplateId")
        private Long signTemplateId;

        @com.aliyun.core.annotation.NameInMap("SignType")
        private Integer signType;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("SpeedLevel")
        private Integer speedLevel;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateContent")
        private String templateContent;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateParamRule")
        private String templateParamRule;

        @com.aliyun.core.annotation.NameInMap("TemplateSenderType")
        private Integer templateSenderType;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Integer templateType;

        @com.aliyun.core.annotation.NameInMap("TotalCountLimit")
        private Long totalCountLimit;

        @com.aliyun.core.annotation.NameInMap("VoiceType")
        private Integer voiceType;

        private FcPartnerTemplateDTO(Builder builder) {
            this.businessType = builder.businessType;
            this.fcTag = builder.fcTag;
            this.i18n = builder.i18n;
            this.id = builder.id;
            this.isDeleted = builder.isDeleted;
            this.mcBusinessType = builder.mcBusinessType;
            this.mcCategory = builder.mcCategory;
            this.mcSignature = builder.mcSignature;
            this.messageTypeId = builder.messageTypeId;
            this.opNick = builder.opNick;
            this.partnerId = builder.partnerId;
            this.qualificationId = builder.qualificationId;
            this.remark = builder.remark;
            this.signTemplateId = builder.signTemplateId;
            this.signType = builder.signType;
            this.sourceId = builder.sourceId;
            this.speedLevel = builder.speedLevel;
            this.state = builder.state;
            this.templateCode = builder.templateCode;
            this.templateContent = builder.templateContent;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateParamRule = builder.templateParamRule;
            this.templateSenderType = builder.templateSenderType;
            this.templateType = builder.templateType;
            this.totalCountLimit = builder.totalCountLimit;
            this.voiceType = builder.voiceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcPartnerTemplateDTO create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public Integer getBusinessType() {
            return this.businessType;
        }

        /**
         * @return fcTag
         */
        public Long getFcTag() {
            return this.fcTag;
        }

        /**
         * @return i18n
         */
        public String getI18n() {
            return this.i18n;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isDeleted
         */
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return mcBusinessType
         */
        public Integer getMcBusinessType() {
            return this.mcBusinessType;
        }

        /**
         * @return mcCategory
         */
        public Integer getMcCategory() {
            return this.mcCategory;
        }

        /**
         * @return mcSignature
         */
        public String getMcSignature() {
            return this.mcSignature;
        }

        /**
         * @return messageTypeId
         */
        public Long getMessageTypeId() {
            return this.messageTypeId;
        }

        /**
         * @return opNick
         */
        public String getOpNick() {
            return this.opNick;
        }

        /**
         * @return partnerId
         */
        public Long getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return qualificationId
         */
        public Long getQualificationId() {
            return this.qualificationId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return signTemplateId
         */
        public Long getSignTemplateId() {
            return this.signTemplateId;
        }

        /**
         * @return signType
         */
        public Integer getSignType() {
            return this.signType;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return speedLevel
         */
        public Integer getSpeedLevel() {
            return this.speedLevel;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateContent
         */
        public String getTemplateContent() {
            return this.templateContent;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateParamRule
         */
        public String getTemplateParamRule() {
            return this.templateParamRule;
        }

        /**
         * @return templateSenderType
         */
        public Integer getTemplateSenderType() {
            return this.templateSenderType;
        }

        /**
         * @return templateType
         */
        public Integer getTemplateType() {
            return this.templateType;
        }

        /**
         * @return totalCountLimit
         */
        public Long getTotalCountLimit() {
            return this.totalCountLimit;
        }

        /**
         * @return voiceType
         */
        public Integer getVoiceType() {
            return this.voiceType;
        }

        public static final class Builder {
            private Integer businessType; 
            private Long fcTag; 
            private String i18n; 
            private Long id; 
            private Integer isDeleted; 
            private Integer mcBusinessType; 
            private Integer mcCategory; 
            private String mcSignature; 
            private Long messageTypeId; 
            private String opNick; 
            private Long partnerId; 
            private Long qualificationId; 
            private String remark; 
            private Long signTemplateId; 
            private Integer signType; 
            private String sourceId; 
            private Integer speedLevel; 
            private Integer state; 
            private String templateCode; 
            private String templateContent; 
            private Long templateId; 
            private String templateName; 
            private String templateParamRule; 
            private Integer templateSenderType; 
            private Integer templateType; 
            private Long totalCountLimit; 
            private Integer voiceType; 

            private Builder() {
            } 

            private Builder(FcPartnerTemplateDTO model) {
                this.businessType = model.businessType;
                this.fcTag = model.fcTag;
                this.i18n = model.i18n;
                this.id = model.id;
                this.isDeleted = model.isDeleted;
                this.mcBusinessType = model.mcBusinessType;
                this.mcCategory = model.mcCategory;
                this.mcSignature = model.mcSignature;
                this.messageTypeId = model.messageTypeId;
                this.opNick = model.opNick;
                this.partnerId = model.partnerId;
                this.qualificationId = model.qualificationId;
                this.remark = model.remark;
                this.signTemplateId = model.signTemplateId;
                this.signType = model.signType;
                this.sourceId = model.sourceId;
                this.speedLevel = model.speedLevel;
                this.state = model.state;
                this.templateCode = model.templateCode;
                this.templateContent = model.templateContent;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateParamRule = model.templateParamRule;
                this.templateSenderType = model.templateSenderType;
                this.templateType = model.templateType;
                this.totalCountLimit = model.totalCountLimit;
                this.voiceType = model.voiceType;
            } 

            /**
             * BusinessType.
             */
            public Builder businessType(Integer businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * FcTag.
             */
            public Builder fcTag(Long fcTag) {
                this.fcTag = fcTag;
                return this;
            }

            /**
             * I18n.
             */
            public Builder i18n(String i18n) {
                this.i18n = i18n;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsDeleted.
             */
            public Builder isDeleted(Integer isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * McBusinessType.
             */
            public Builder mcBusinessType(Integer mcBusinessType) {
                this.mcBusinessType = mcBusinessType;
                return this;
            }

            /**
             * McCategory.
             */
            public Builder mcCategory(Integer mcCategory) {
                this.mcCategory = mcCategory;
                return this;
            }

            /**
             * McSignature.
             */
            public Builder mcSignature(String mcSignature) {
                this.mcSignature = mcSignature;
                return this;
            }

            /**
             * MessageTypeId.
             */
            public Builder messageTypeId(Long messageTypeId) {
                this.messageTypeId = messageTypeId;
                return this;
            }

            /**
             * OpNick.
             */
            public Builder opNick(String opNick) {
                this.opNick = opNick;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(Long partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * QualificationId.
             */
            public Builder qualificationId(Long qualificationId) {
                this.qualificationId = qualificationId;
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
             * SignTemplateId.
             */
            public Builder signTemplateId(Long signTemplateId) {
                this.signTemplateId = signTemplateId;
                return this;
            }

            /**
             * SignType.
             */
            public Builder signType(Integer signType) {
                this.signType = signType;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * SpeedLevel.
             */
            public Builder speedLevel(Integer speedLevel) {
                this.speedLevel = speedLevel;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * TemplateContent.
             */
            public Builder templateContent(String templateContent) {
                this.templateContent = templateContent;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
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
             * TemplateParamRule.
             */
            public Builder templateParamRule(String templateParamRule) {
                this.templateParamRule = templateParamRule;
                return this;
            }

            /**
             * TemplateSenderType.
             */
            public Builder templateSenderType(Integer templateSenderType) {
                this.templateSenderType = templateSenderType;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(Integer templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * TotalCountLimit.
             */
            public Builder totalCountLimit(Long totalCountLimit) {
                this.totalCountLimit = totalCountLimit;
                return this;
            }

            /**
             * VoiceType.
             */
            public Builder voiceType(Integer voiceType) {
                this.voiceType = voiceType;
                return this;
            }

            public FcPartnerTemplateDTO build() {
                return new FcPartnerTemplateDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryStandarTemplateCollectionsNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStandarTemplateCollectionsNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FcPartnerTemplateDTO")
        private java.util.List<FcPartnerTemplateDTO> fcPartnerTemplateDTO;

        private List(Builder builder) {
            this.fcPartnerTemplateDTO = builder.fcPartnerTemplateDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return fcPartnerTemplateDTO
         */
        public java.util.List<FcPartnerTemplateDTO> getFcPartnerTemplateDTO() {
            return this.fcPartnerTemplateDTO;
        }

        public static final class Builder {
            private java.util.List<FcPartnerTemplateDTO> fcPartnerTemplateDTO; 

            private Builder() {
            } 

            private Builder(List model) {
                this.fcPartnerTemplateDTO = model.fcPartnerTemplateDTO;
            } 

            /**
             * FcPartnerTemplateDTO.
             */
            public Builder fcPartnerTemplateDTO(java.util.List<FcPartnerTemplateDTO> fcPartnerTemplateDTO) {
                this.fcPartnerTemplateDTO = fcPartnerTemplateDTO;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
