// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ActivateTemplateMCPRequest} extends {@link RequestModel}
 *
 * <p>ActivateTemplateMCPRequest</p>
 */
public class ActivateTemplateMCPRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabledTools")
    private java.util.List<String> enabledTools;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("transport")
    private String transport;

    private ActivateTemplateMCPRequest(Builder builder) {
        super(builder);
        this.templateName = builder.templateName;
        this.enabledTools = builder.enabledTools;
        this.transport = builder.transport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateTemplateMCPRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return enabledTools
     */
    public java.util.List<String> getEnabledTools() {
        return this.enabledTools;
    }

    /**
     * @return transport
     */
    public String getTransport() {
        return this.transport;
    }

    public static final class Builder extends Request.Builder<ActivateTemplateMCPRequest, Builder> {
        private String templateName; 
        private java.util.List<String> enabledTools; 
        private String transport; 

        private Builder() {
            super();
        } 

        private Builder(ActivateTemplateMCPRequest request) {
            super(request);
            this.templateName = request.templateName;
            this.enabledTools = request.enabledTools;
            this.transport = request.transport;
        } 

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.putPathParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * enabledTools.
         */
        public Builder enabledTools(java.util.List<String> enabledTools) {
            this.putBodyParameter("enabledTools", enabledTools);
            this.enabledTools = enabledTools;
            return this;
        }

        /**
         * transport.
         */
        public Builder transport(String transport) {
            this.putBodyParameter("transport", transport);
            this.transport = transport;
            return this;
        }

        @Override
        public ActivateTemplateMCPRequest build() {
            return new ActivateTemplateMCPRequest(this);
        } 

    } 

}
