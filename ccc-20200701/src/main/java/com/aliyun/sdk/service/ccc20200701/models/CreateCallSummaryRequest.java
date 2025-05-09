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
 * {@link CreateCallSummaryRequest} extends {@link RequestModel}
 *
 * <p>CreateCallSummaryRequest</p>
 */
public class CreateCallSummaryRequest extends Request {
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

    private CreateCallSummaryRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.context = builder.context;
        this.customerId = builder.customerId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCallSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCallSummaryRequest, Builder> {
        private String contactId; 
        private String context; 
        private String customerId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCallSummaryRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.context = request.context;
            this.customerId = request.customerId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * Context.
         */
        public Builder context(String context) {
            this.putQueryParameter("Context", context);
            this.context = context;
            return this;
        }

        /**
         * CustomerId.
         */
        public Builder customerId(String customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
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

        @Override
        public CreateCallSummaryRequest build() {
            return new CreateCallSummaryRequest(this);
        } 

    } 

}
