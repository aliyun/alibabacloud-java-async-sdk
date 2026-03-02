// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link DeleteMonitorContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorContactRequest</p>
 */
public class DeleteMonitorContactRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactId;

    private DeleteMonitorContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorContactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    public static final class Builder extends Request.Builder<DeleteMonitorContactRequest, Builder> {
        private Long contactId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorContactRequest request) {
            super(request);
            this.contactId = request.contactId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactId(Long contactId) {
            this.putPathParameter("contactId", contactId);
            this.contactId = contactId;
            return this;
        }

        @Override
        public DeleteMonitorContactRequest build() {
            return new DeleteMonitorContactRequest(this);
        } 

    } 

}
