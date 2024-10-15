// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAlertContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertContactRequest</p>
 */
public class DeleteAlertContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contact_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > contactIds;

    private DeleteAlertContactRequest(Builder builder) {
        super(builder);
        this.contactIds = builder.contactIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactIds
     */
    public java.util.List < Long > getContactIds() {
        return this.contactIds;
    }

    public static final class Builder extends Request.Builder<DeleteAlertContactRequest, Builder> {
        private java.util.List < Long > contactIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertContactRequest request) {
            super(request);
            this.contactIds = request.contactIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactIds(java.util.List < Long > contactIds) {
            String contactIdsShrink = shrink(contactIds, "contact_ids", "json");
            this.putQueryParameter("contact_ids", contactIdsShrink);
            this.contactIds = contactIds;
            return this;
        }

        @Override
        public DeleteAlertContactRequest build() {
            return new DeleteAlertContactRequest(this);
        } 

    } 

}
