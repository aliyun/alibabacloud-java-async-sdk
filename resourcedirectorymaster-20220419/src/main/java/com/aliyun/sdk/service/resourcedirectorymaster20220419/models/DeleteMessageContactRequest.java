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
 * {@link DeleteMessageContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteMessageContactRequest</p>
 */
public class DeleteMessageContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainContactInMembers")
    private Boolean retainContactInMembers;

    private DeleteMessageContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.retainContactInMembers = builder.retainContactInMembers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMessageContactRequest create() {
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
     * @return retainContactInMembers
     */
    public Boolean getRetainContactInMembers() {
        return this.retainContactInMembers;
    }

    public static final class Builder extends Request.Builder<DeleteMessageContactRequest, Builder> {
        private String contactId; 
        private Boolean retainContactInMembers; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMessageContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.retainContactInMembers = request.retainContactInMembers;
        } 

        /**
         * <p>The ID of the contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-qL4HqKONzOM7****</p>
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>Specifies whether to retain the contact for members. Valid values:</p>
         * <ul>
         * <li>true (default): retains the contact for members. In this case, the contact can still receive messages for the members.</li>
         * <li>false: does not retain the contact for members. In this case, the contact can no longer receive messages for the members. If you set this parameter to false, the response is asynchronously returned. You can call <a href="~~GetMessageContactDeletionStatus~~">GetMessageContactDeletionStatus</a> to obtain the deletion result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder retainContactInMembers(Boolean retainContactInMembers) {
            this.putQueryParameter("RetainContactInMembers", retainContactInMembers);
            this.retainContactInMembers = retainContactInMembers;
            return this;
        }

        @Override
        public DeleteMessageContactRequest build() {
            return new DeleteMessageContactRequest(this);
        } 

    } 

}
