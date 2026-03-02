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
 * {@link SendTTSVerifyLinkRequest} extends {@link RequestModel}
 *
 * <p>SendTTSVerifyLinkRequest</p>
 */
public class SendTTSVerifyLinkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contactId")
    private Long contactId;

    private SendTTSVerifyLinkRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendTTSVerifyLinkRequest create() {
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

    public static final class Builder extends Request.Builder<SendTTSVerifyLinkRequest, Builder> {
        private Long contactId; 

        private Builder() {
            super();
        } 

        private Builder(SendTTSVerifyLinkRequest request) {
            super(request);
            this.contactId = request.contactId;
        } 

        /**
         * contactId.
         */
        public Builder contactId(Long contactId) {
            this.putPathParameter("contactId", contactId);
            this.contactId = contactId;
            return this;
        }

        @Override
        public SendTTSVerifyLinkRequest build() {
            return new SendTTSVerifyLinkRequest(this);
        } 

    } 

}
