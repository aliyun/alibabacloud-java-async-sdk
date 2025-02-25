// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDefenseTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseTemplateResponseBody</p>
 */
public class DescribeDefenseTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Template")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the template.</p>
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        public DescribeDefenseTemplateResponseBody build() {
            return new DescribeDefenseTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseTemplateResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("DefenseSubScene")
        private String defenseSubScene;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateOrigin")
        private String templateOrigin;

        @com.aliyun.core.annotation.NameInMap("TemplateStatus")
        private Integer templateStatus;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
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
             * <p>The scenario in which the template is used. For more information, see the description of the <strong>DefenseScene</strong> parameter in the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_group</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The sub-scenario in which the template is used. Valid values:</p>
             * <ul>
             * <li><strong>web</strong>: The template is a bot management template that is used for website protection.</li>
             * <li><strong>app</strong>: The template is a bot management template that is used for app protection.</li>
             * <li><strong>basic</strong>: The template is a bot management template that is used for basic protection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder defenseSubScene(String defenseSubScene) {
                this.defenseSubScene = defenseSubScene;
                return this;
            }

            /**
             * <p>The description of the protection rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The most recent time when the protection rule template was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1665283642000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the protection rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>10097</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the protection rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>test0621</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The origin of the protection rule template. If the value of this parameter is custom, the protection rule template is created by the user.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder templateOrigin(String templateOrigin) {
                this.templateOrigin = templateOrigin;
                return this;
            }

            /**
             * <p>The status of the protection rule template. Valid values:</p>
             * <ul>
             * <li><strong>0:</strong> disabled.</li>
             * <li><strong>1:</strong> enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder templateStatus(Integer templateStatus) {
                this.templateStatus = templateStatus;
                return this;
            }

            /**
             * <p>The type of the protection rule template. Valid values:</p>
             * <ul>
             * <li><strong>user_default:</strong> default template.</li>
             * <li><strong>user_custom:</strong> custom template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user_default</p>
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
