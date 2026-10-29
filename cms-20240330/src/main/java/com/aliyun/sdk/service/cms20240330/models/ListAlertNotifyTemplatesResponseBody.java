// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAlertNotifyTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertNotifyTemplatesResponseBody</p>
 */
public class ListAlertNotifyTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplates")
    private java.util.List<AlertNotifyTemplates> alertNotifyTemplates;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAlertNotifyTemplatesResponseBody(Builder builder) {
        this.alertNotifyTemplates = builder.alertNotifyTemplates;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertNotifyTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertNotifyTemplates
     */
    public java.util.List<AlertNotifyTemplates> getAlertNotifyTemplates() {
        return this.alertNotifyTemplates;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<AlertNotifyTemplates> alertNotifyTemplates; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAlertNotifyTemplatesResponseBody model) {
            this.alertNotifyTemplates = model.alertNotifyTemplates;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * alertNotifyTemplates.
         */
        public Builder alertNotifyTemplates(java.util.List<AlertNotifyTemplates> alertNotifyTemplates) {
            this.alertNotifyTemplates = alertNotifyTemplates;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAlertNotifyTemplatesResponseBody build() {
            return new ListAlertNotifyTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertNotifyTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertNotifyTemplatesResponseBody</p>
     */
    public static class AlertNotifyTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateId")
        private String alertNotifyTemplateId;

        @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateName")
        private String alertNotifyTemplateName;

        @com.aliyun.core.annotation.NameInMap("programLang")
        private String programLang;

        @com.aliyun.core.annotation.NameInMap("templates")
        private java.util.Map<String, java.util.Map<String, ?>> templates;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AlertNotifyTemplates(Builder builder) {
            this.alertNotifyTemplateId = builder.alertNotifyTemplateId;
            this.alertNotifyTemplateName = builder.alertNotifyTemplateName;
            this.programLang = builder.programLang;
            this.templates = builder.templates;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertNotifyTemplates create() {
            return builder().build();
        }

        /**
         * @return alertNotifyTemplateId
         */
        public String getAlertNotifyTemplateId() {
            return this.alertNotifyTemplateId;
        }

        /**
         * @return alertNotifyTemplateName
         */
        public String getAlertNotifyTemplateName() {
            return this.alertNotifyTemplateName;
        }

        /**
         * @return programLang
         */
        public String getProgramLang() {
            return this.programLang;
        }

        /**
         * @return templates
         */
        public java.util.Map<String, java.util.Map<String, ?>> getTemplates() {
            return this.templates;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String alertNotifyTemplateId; 
            private String alertNotifyTemplateName; 
            private String programLang; 
            private java.util.Map<String, java.util.Map<String, ?>> templates; 
            private String type; 

            private Builder() {
            } 

            private Builder(AlertNotifyTemplates model) {
                this.alertNotifyTemplateId = model.alertNotifyTemplateId;
                this.alertNotifyTemplateName = model.alertNotifyTemplateName;
                this.programLang = model.programLang;
                this.templates = model.templates;
                this.type = model.type;
            } 

            /**
             * alertNotifyTemplateId.
             */
            public Builder alertNotifyTemplateId(String alertNotifyTemplateId) {
                this.alertNotifyTemplateId = alertNotifyTemplateId;
                return this;
            }

            /**
             * alertNotifyTemplateName.
             */
            public Builder alertNotifyTemplateName(String alertNotifyTemplateName) {
                this.alertNotifyTemplateName = alertNotifyTemplateName;
                return this;
            }

            /**
             * programLang.
             */
            public Builder programLang(String programLang) {
                this.programLang = programLang;
                return this;
            }

            /**
             * templates.
             */
            public Builder templates(java.util.Map<String, java.util.Map<String, ?>> templates) {
                this.templates = templates;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AlertNotifyTemplates build() {
                return new AlertNotifyTemplates(this);
            } 

        } 

    }
}
