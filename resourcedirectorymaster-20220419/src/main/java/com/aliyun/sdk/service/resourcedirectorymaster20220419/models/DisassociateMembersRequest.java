// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociateMembersRequest} extends {@link RequestModel}
 *
 * <p>DisassociateMembersRequest</p>
 */
public class DisassociateMembersRequest extends Request {
    @Query
    @NameInMap("ContactId")
    private String contactId;

    @Query
    @NameInMap("Members")
    private java.util.List < String > members;

    private DisassociateMembersRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.members = builder.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateMembersRequest create() {
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
    public java.util.List < String > getMembers() {
        return this.members;
    }

    public static final class Builder extends Request.Builder<DisassociateMembersRequest, Builder> {
        private String contactId; 
        private java.util.List < String > members; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateMembersRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.members = request.members;
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
         * Members.
         */
        public Builder members(java.util.List < String > members) {
            this.putQueryParameter("Members", members);
            this.members = members;
            return this;
        }

        @Override
        public DisassociateMembersRequest build() {
            return new DisassociateMembersRequest(this);
        } 

    } 

}
