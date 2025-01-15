// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link GetMessageContactDeletionStatusRequest} extends {@link RequestModel}
 *
 * <p>GetMessageContactDeletionStatusRequest</p>
 */
public class GetMessageContactDeletionStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    private GetMessageContactDeletionStatusRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageContactDeletionStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetMessageContactDeletionStatusRequest, Builder> {
        private String contactId; 

        private Builder() {
            super();
        } 

        private Builder(GetMessageContactDeletionStatusRequest request) {
            super(request);
            this.contactId = request.contactId;
        } 

        /**
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>c-qL4HqKONzOM7****</p>
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        @Override
        public GetMessageContactDeletionStatusRequest build() {
            return new GetMessageContactDeletionStatusRequest(this);
        } 

    } 

}
