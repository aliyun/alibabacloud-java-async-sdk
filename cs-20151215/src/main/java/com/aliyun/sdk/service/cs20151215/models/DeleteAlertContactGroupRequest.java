// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertContactGroupRequest</p>
 */
public class DeleteAlertContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contact_group_ids")
    private java.util.List < Long > contactGroupIds;

    private DeleteAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupIds = builder.contactGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupIds
     */
    public java.util.List < Long > getContactGroupIds() {
        return this.contactGroupIds;
    }

    public static final class Builder extends Request.Builder<DeleteAlertContactGroupRequest, Builder> {
        private java.util.List < Long > contactGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertContactGroupRequest request) {
            super(request);
            this.contactGroupIds = request.contactGroupIds;
        } 

        /**
         * contact_group_ids.
         */
        public Builder contactGroupIds(java.util.List < Long > contactGroupIds) {
            String contactGroupIdsShrink = shrink(contactGroupIds, "contact_group_ids", "json");
            this.putQueryParameter("contact_group_ids", contactGroupIdsShrink);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        @Override
        public DeleteAlertContactGroupRequest build() {
            return new DeleteAlertContactGroupRequest(this);
        } 

    } 

}
