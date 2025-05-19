// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link CreateMonitoringTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitoringTemplateRequest</p>
 */
public class CreateMonitoringTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertTemplatesJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertTemplatesJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostAvailabilityTemplate")
    private String hostAvailabilityTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessMonitorTemplates")
    private String processMonitorTemplates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemEventTemplates")
    private String systemEventTemplates;

    private CreateMonitoringTemplateRequest(Builder builder) {
        super(builder);
        this.alertTemplatesJson = builder.alertTemplatesJson;
        this.description = builder.description;
        this.hostAvailabilityTemplate = builder.hostAvailabilityTemplate;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.processMonitorTemplates = builder.processMonitorTemplates;
        this.systemEventTemplates = builder.systemEventTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitoringTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertTemplatesJson
     */
    public String getAlertTemplatesJson() {
        return this.alertTemplatesJson;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hostAvailabilityTemplate
     */
    public String getHostAvailabilityTemplate() {
        return this.hostAvailabilityTemplate;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return processMonitorTemplates
     */
    public String getProcessMonitorTemplates() {
        return this.processMonitorTemplates;
    }

    /**
     * @return systemEventTemplates
     */
    public String getSystemEventTemplates() {
        return this.systemEventTemplates;
    }

    public static final class Builder extends Request.Builder<CreateMonitoringTemplateRequest, Builder> {
        private String alertTemplatesJson; 
        private String description; 
        private String hostAvailabilityTemplate; 
        private String name; 
        private String namespace; 
        private String processMonitorTemplates; 
        private String systemEventTemplates; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitoringTemplateRequest request) {
            super(request);
            this.alertTemplatesJson = request.alertTemplatesJson;
            this.description = request.description;
            this.hostAvailabilityTemplate = request.hostAvailabilityTemplate;
            this.name = request.name;
            this.namespace = request.namespace;
            this.processMonitorTemplates = request.processMonitorTemplates;
            this.systemEventTemplates = request.systemEventTemplates;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder alertTemplatesJson(String alertTemplatesJson) {
            this.putQueryParameter("AlertTemplatesJson", alertTemplatesJson);
            this.alertTemplatesJson = alertTemplatesJson;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * HostAvailabilityTemplate.
         */
        public Builder hostAvailabilityTemplate(String hostAvailabilityTemplate) {
            this.putQueryParameter("HostAvailabilityTemplate", hostAvailabilityTemplate);
            this.hostAvailabilityTemplate = hostAvailabilityTemplate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ProcessMonitorTemplates.
         */
        public Builder processMonitorTemplates(String processMonitorTemplates) {
            this.putQueryParameter("ProcessMonitorTemplates", processMonitorTemplates);
            this.processMonitorTemplates = processMonitorTemplates;
            return this;
        }

        /**
         * SystemEventTemplates.
         */
        public Builder systemEventTemplates(String systemEventTemplates) {
            this.putQueryParameter("SystemEventTemplates", systemEventTemplates);
            this.systemEventTemplates = systemEventTemplates;
            return this;
        }

        @Override
        public CreateMonitoringTemplateRequest build() {
            return new CreateMonitoringTemplateRequest(this);
        } 

    } 

}
