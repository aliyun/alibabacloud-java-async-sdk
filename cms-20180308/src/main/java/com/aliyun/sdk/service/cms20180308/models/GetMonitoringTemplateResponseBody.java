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
 * {@link GetMonitoringTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetMonitoringTemplateResponseBody</p>
 */
public class GetMonitoringTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMonitoringTemplateResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitoringTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Resource resource; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMonitoringTemplateResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.resource = model.resource;
            this.success = model.success;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Resource.
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMonitoringTemplateResponseBody build() {
            return new GetMonitoringTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMonitoringTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetMonitoringTemplateResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertTemplatesJson")
        private String alertTemplatesJson;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HostAvailabilityTemplate")
        private String hostAvailabilityTemplate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ProcessMonitorTemplates")
        private String processMonitorTemplates;

        @com.aliyun.core.annotation.NameInMap("RestVersion")
        private String restVersion;

        @com.aliyun.core.annotation.NameInMap("SystemEventTemplates")
        private String systemEventTemplates;

        private Resource(Builder builder) {
            this.alertTemplatesJson = builder.alertTemplatesJson;
            this.description = builder.description;
            this.hostAvailabilityTemplate = builder.hostAvailabilityTemplate;
            this.id = builder.id;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.processMonitorTemplates = builder.processMonitorTemplates;
            this.restVersion = builder.restVersion;
            this.systemEventTemplates = builder.systemEventTemplates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
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
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return restVersion
         */
        public String getRestVersion() {
            return this.restVersion;
        }

        /**
         * @return systemEventTemplates
         */
        public String getSystemEventTemplates() {
            return this.systemEventTemplates;
        }

        public static final class Builder {
            private String alertTemplatesJson; 
            private String description; 
            private String hostAvailabilityTemplate; 
            private String id; 
            private String name; 
            private String namespace; 
            private String processMonitorTemplates; 
            private String restVersion; 
            private String systemEventTemplates; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.alertTemplatesJson = model.alertTemplatesJson;
                this.description = model.description;
                this.hostAvailabilityTemplate = model.hostAvailabilityTemplate;
                this.id = model.id;
                this.name = model.name;
                this.namespace = model.namespace;
                this.processMonitorTemplates = model.processMonitorTemplates;
                this.restVersion = model.restVersion;
                this.systemEventTemplates = model.systemEventTemplates;
            } 

            /**
             * AlertTemplatesJson.
             */
            public Builder alertTemplatesJson(String alertTemplatesJson) {
                this.alertTemplatesJson = alertTemplatesJson;
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
             * HostAvailabilityTemplate.
             */
            public Builder hostAvailabilityTemplate(String hostAvailabilityTemplate) {
                this.hostAvailabilityTemplate = hostAvailabilityTemplate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ProcessMonitorTemplates.
             */
            public Builder processMonitorTemplates(String processMonitorTemplates) {
                this.processMonitorTemplates = processMonitorTemplates;
                return this;
            }

            /**
             * RestVersion.
             */
            public Builder restVersion(String restVersion) {
                this.restVersion = restVersion;
                return this;
            }

            /**
             * SystemEventTemplates.
             */
            public Builder systemEventTemplates(String systemEventTemplates) {
                this.systemEventTemplates = systemEventTemplates;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
