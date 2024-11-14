// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDefenseResourceTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceTemplatesResponseBody</p>
 */
public class DescribeDefenseResourceTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2305CEB0-BA5A-5543-A1D3-3F1D0891****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The protection templates.</p>
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        public DescribeDefenseResourceTemplatesResponseBody build() {
            return new DescribeDefenseResourceTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseResourceTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseResourceTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
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
             * <p>The scenario in which the protection template is used.</p>
             * <ul>
             * <li><strong>waf_group</strong>: basic protection.</li>
             * <li><strong>antiscan</strong>: scan protection.</li>
             * <li><strong>ip_blacklist</strong>: IP address blacklist.</li>
             * <li><strong>custom_acl</strong>: custom rule.</li>
             * <li><strong>whitelist</strong>: whitelist.</li>
             * <li><strong>region_block</strong>: region blacklist.</li>
             * <li><strong>custom_response</strong>: custom response.</li>
             * <li><strong>cc</strong>: HTTP flood protection.</li>
             * <li><strong>tamperproof</strong>: website tamper-proofing.</li>
             * <li><strong>dlp</strong>: data leakage prevention.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>whitelist</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The sub-scenario in which the template is used. Valid values:</p>
             * <ul>
             * <li><strong>web</strong>: bot management for website protection.</li>
             * <li><strong>app</strong>: bot management for app protection.</li>
             * <li><strong>basic</strong>: bot management for basic protection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder defenseSubScene(String defenseSubScene) {
                this.defenseSubScene = defenseSubScene;
                return this;
            }

            /**
             * <p>The description of the protection template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the protection template was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1692930539000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the protection template.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the protection template.</p>
             * 
             * <strong>example:</strong>
             * <p>TestTemplateName</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The origin of the protection template. The value custom indicates that the template is a custom template created by the user.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder templateOrigin(String templateOrigin) {
                this.templateOrigin = templateOrigin;
                return this;
            }

            /**
             * <p>The status of the protection template. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled.</li>
             * <li><strong>1</strong>: enabled.</li>
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
             * <p>The type of the protection template. Valid values:</p>
             * <ul>
             * <li><strong>user_default</strong>: default template.</li>
             * <li><strong>user_custom</strong>: custom template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
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
