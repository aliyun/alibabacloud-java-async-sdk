// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSystemTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSystemTemplatesResponseBody</p>
 */
public class ListSystemTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemTemplateList")
    private java.util.List < SystemTemplateList> systemTemplateList;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListSystemTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemTemplateList = builder.systemTemplateList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemTemplateList
     */
    public java.util.List < SystemTemplateList> getSystemTemplateList() {
        return this.systemTemplateList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SystemTemplateList> systemTemplateList; 
        private Integer total; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried templates.</p>
         */
        public Builder systemTemplateList(java.util.List < SystemTemplateList> systemTemplateList) {
            this.systemTemplateList = systemTemplateList;
            return this;
        }

        /**
         * <p>The total number of templates.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListSystemTemplatesResponseBody build() {
            return new ListSystemTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSystemTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSystemTemplatesResponseBody</p>
     */
    public static class SystemTemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Subtype")
        private Integer subtype;

        @com.aliyun.core.annotation.NameInMap("SubtypeName")
        private String subtypeName;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private String templateConfig;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private SystemTemplateList(Builder builder) {
            this.status = builder.status;
            this.subtype = builder.subtype;
            this.subtypeName = builder.subtypeName;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.type = builder.type;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemTemplateList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subtype
         */
        public Integer getSubtype() {
            return this.subtype;
        }

        /**
         * @return subtypeName
         */
        public String getSubtypeName() {
            return this.subtypeName;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String status; 
            private Integer subtype; 
            private String subtypeName; 
            private String templateConfig; 
            private String templateId; 
            private String templateName; 
            private Integer type; 
            private String typeName; 

            /**
             * <p>The template state.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subtype ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subtype(Integer subtype) {
                this.subtype = subtype;
                return this;
            }

            /**
             * <p>The subtype name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Remux</p>
             */
            public Builder subtypeName(String subtypeName) {
                this.subtypeName = subtypeName;
                return this;
            }

            /**
             * <p>The template parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;flv&quot;},&quot;Video&quot;:{},&quot;Audio&quot;:{}}</p>
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S00000001-000000</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>FLV-COPY</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The type name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>TranscodeTemplate</p>
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public SystemTemplateList build() {
                return new SystemTemplateList(this);
            } 

        } 

    }
}
