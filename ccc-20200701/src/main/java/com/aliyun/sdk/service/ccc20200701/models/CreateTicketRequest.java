// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Context")
    private String context;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    private String customerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.context = builder.context;
        this.customerId = builder.customerId;
        this.instanceId = builder.instanceId;
        this.source = builder.source;
        this.templateId = builder.templateId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    /**
     * @return customerId
     */
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private String contactId; 
        private String context; 
        private String customerId; 
        private String instanceId; 
        private String source; 
        private String templateId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.context = request.context;
            this.customerId = request.customerId;
            this.instanceId = request.instanceId;
            this.source = request.source;
            this.templateId = request.templateId;
            this.title = request.title;
        } 

        /**
         * <p>The ID of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>job-38860977107324****</p>
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>Ticket field information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;productName&quot;:&quot;玩具1&quot;}</p>
         */
        public Builder context(String context) {
            this.putQueryParameter("Context", context);
            this.context = context;
            return this;
        }

        /**
         * <p>Customer ID, the customer ID in Cloud Contact Center customer profiles.</p>
         * 
         * <strong>example:</strong>
         * <p>51e155ce-3747-4f21-b402-13c69597b920</p>
         */
        public Builder customerId(String customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Ticket source.</p>
         * 
         * <strong>example:</strong>
         * <p>CHAT</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>Ticket template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e9e4c76c-948d-4a6e-9ce2-9da0f5967a73</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>Ticket title.</p>
         * 
         * <strong>example:</strong>
         * <p>售后工单。</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

}
