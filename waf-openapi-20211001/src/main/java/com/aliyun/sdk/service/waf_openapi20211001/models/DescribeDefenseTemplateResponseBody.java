// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseTemplateResponseBody</p>
 */
public class DescribeDefenseTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Template")
    private Template template;

    private DescribeDefenseTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String requestId; 
        private Template template; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the template.
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        public DescribeDefenseTemplateResponseBody build() {
            return new DescribeDefenseTemplateResponseBody(this);
        } 

    } 

    public static class Template extends TeaModel {
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

        private Template(Builder builder) {
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

        public static Template create() {
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
             * The scenario in which the template is used. For more information, see the description of the **DefenseScene** parameter in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
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
             * The description of the protection rule template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The most recent time when the protection rule template was modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the protection rule template.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The name of the protection rule template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The origin of the protection rule template. If the value of this parameter is custom, the protection rule template is created by the user.
             */
            public Builder templateOrigin(String templateOrigin) {
                this.templateOrigin = templateOrigin;
                return this;
            }

            /**
             * The status of the protection rule template. Valid values:
             * <p>
             * 
             * *   **0:** disabled.
             * *   **1:** enabled.
             */
            public Builder templateStatus(Integer templateStatus) {
                this.templateStatus = templateStatus;
                return this;
            }

            /**
             * The type of the protection rule template. Valid values:
             * <p>
             * 
             * *   **user_default:** default template.
             * *   **user_custom:** custom template.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
