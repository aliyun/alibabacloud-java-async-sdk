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
         * <p>The list of notification templates.</p>
         */
        public Builder alertNotifyTemplates(java.util.List<AlertNotifyTemplates> alertNotifyTemplates) {
            this.alertNotifyTemplates = alertNotifyTemplates;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD8BA7D6-995D-578D-9941-**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
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
             * <p>The notification template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>template-abc123</p>
             */
            public Builder alertNotifyTemplateId(String alertNotifyTemplateId) {
                this.alertNotifyTemplateId = alertNotifyTemplateId;
                return this;
            }

            /**
             * <p>The notification template name.</p>
             * 
             * <strong>example:</strong>
             * <p>High-availability alert template</p>
             */
            public Builder alertNotifyTemplateName(String alertNotifyTemplateName) {
                this.alertNotifyTemplateName = alertNotifyTemplateName;
                return this;
            }

            /**
             * <p>The template syntax type. The current template syntax is fixed to GO and uses the Go template syntax.</p>
             * 
             * <strong>example:</strong>
             * <p>GO</p>
             */
            public Builder programLang(String programLang) {
                this.programLang = programLang;
                return this;
            }

            /**
             * <p>The multilingual notification templates. The key is the language code: zh (Chinese) or en (English). The value is the template configuration object for the language. When a notification is sent, the corresponding template is selected based on the recipient\&quot;s language. The content format varies by type: Markdown for DING, WEIXIN, and FEISHU; HTML for EMAIL; plain text for SMS, CALL, and SLACK; and JSON for CUSTOM.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;zh&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}\n<strong>Events:</strong> {{len .events}}&quot;,&quot;incidentLifeCycleNotifyTemplates&quot;:{&quot;IncidentCreationNotify&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}&quot;,&quot;enable&quot;:true},&quot;IncidentResolutionNotify&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert Resolved: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}&quot;,&quot;enable&quot;:true}}},&quot;en&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}\n<strong>Events:</strong> {{len .events}}&quot;,&quot;incidentLifeCycleNotifyTemplates&quot;:{&quot;IncidentCreationNotify&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}&quot;,&quot;enable&quot;:true},&quot;IncidentResolutionNotify&quot;:{&quot;title&quot;:&quot;CloudMonitor Alert Resolved: {{.incident.title}}&quot;,&quot;content&quot;:&quot;<strong>Alert Title:</strong> {{.incident.title}}\n<strong>Severity:</strong> {{.incident.severity}}&quot;,&quot;enable&quot;:true}}}}</p>
             */
            public Builder templates(java.util.Map<String, java.util.Map<String, ?>> templates) {
                this.templates = templates;
                return this;
            }

            /**
             * <p>The notification channel type. Valid values:</p>
             * <ul>
             * <li>DING</li>
             * <li>WEIXIN</li>
             * <li>FEISHU</li>
             * <li>SLACK</li>
             * <li>CUSTOM</li>
             * <li>TEAMS</li>
             * <li>SMS</li>
             * <li>EMAIL</li>
             * <li>CALL</li>
             * <li>PAGER_DUTY</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DING</p>
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
