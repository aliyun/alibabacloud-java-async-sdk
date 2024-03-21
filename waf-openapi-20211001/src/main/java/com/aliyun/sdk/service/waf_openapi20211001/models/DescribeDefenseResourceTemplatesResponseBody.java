// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseResourceTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceTemplatesResponseBody</p>
 */
public class DescribeDefenseResourceTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Templates")
    private java.util.List < Templates> templates;

    private DescribeDefenseResourceTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Templates> templates; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        public DescribeDefenseResourceTemplatesResponseBody build() {
            return new DescribeDefenseResourceTemplatesResponseBody(this);
        } 

    } 

    public static class Templates extends TeaModel {
        @NameInMap("DefenseScene")
        private String defenseScene;

        @NameInMap("DefenseSubScene")
        private String defenseSubScene;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("TemplateId")
        private Long templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateOrigin")
        private String templateOrigin;

        @NameInMap("TemplateStatus")
        private Integer templateStatus;

        @NameInMap("TemplateType")
        private String templateType;

        private Templates(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.defenseSubScene = builder.defenseSubScene;
            this.description = builder.description;
            this.gmtModified = builder.gmtModified;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateOrigin = builder.templateOrigin;
            this.templateStatus = builder.templateStatus;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        /**
         * @return defenseSubScene
         */
        public String getDefenseSubScene() {
            return this.defenseSubScene;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
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
         * @return templateOrigin
         */
        public String getTemplateOrigin() {
            return this.templateOrigin;
        }

        /**
         * @return templateStatus
         */
        public Integer getTemplateStatus() {
            return this.templateStatus;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String defenseScene; 
            private String defenseSubScene; 
            private String description; 
            private Long gmtModified; 
            private Long templateId; 
            private String templateName; 
            private String templateOrigin; 
            private Integer templateStatus; 
            private String templateType; 

            /**
             * DefenseScene.
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * DefenseSubScene.
             */
            public Builder defenseSubScene(String defenseSubScene) {
                this.defenseSubScene = defenseSubScene;
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
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * TemplateOrigin.
             */
            public Builder templateOrigin(String templateOrigin) {
                this.templateOrigin = templateOrigin;
                return this;
            }

            /**
             * TemplateStatus.
             */
            public Builder templateStatus(Integer templateStatus) {
                this.templateStatus = templateStatus;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
