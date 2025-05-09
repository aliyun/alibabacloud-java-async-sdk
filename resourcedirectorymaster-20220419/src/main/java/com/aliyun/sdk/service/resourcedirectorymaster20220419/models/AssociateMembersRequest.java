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
 * {@link AssociateMembersRequest} extends {@link RequestModel}
 *
 * <p>AssociateMembersRequest</p>
 */
public class AssociateMembersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Members")
    private java.util.List<String> members;

    private AssociateMembersRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.members = builder.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateMembersRequest create() {
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
     * @return members
     */
    public java.util.List<String> getMembers() {
        return this.members;
    }

    public static final class Builder extends Request.Builder<AssociateMembersRequest, Builder> {
        private String contactId; 
        private java.util.List<String> members; 

        private Builder() {
            super();
        } 

        private Builder(AssociateMembersRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.members = request.members;
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

        /**
         * <p>The IDs of objects to which you want to bind the contact.</p>
         */
        public Builder members(java.util.List<String> members) {
            this.putQueryParameter("Members", members);
            this.members = members;
            return this;
        }

        @Override
        public AssociateMembersRequest build() {
            return new AssociateMembersRequest(this);
        } 

    } 

}
