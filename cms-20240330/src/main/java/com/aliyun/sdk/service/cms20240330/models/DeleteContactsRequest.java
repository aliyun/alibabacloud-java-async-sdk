// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteContactsRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactsRequest</p>
 */
public class DeleteContactsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contactIds")
    private java.util.List<String> contactIds;

    private DeleteContactsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contactIds = builder.contactIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContactsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contactIds
     */
    public java.util.List<String> getContactIds() {
        return this.contactIds;
    }

    public static final class Builder extends Request.Builder<DeleteContactsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> contactIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContactsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contactIds = request.contactIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IDs of the contacts.</p>
         */
        public Builder contactIds(java.util.List<String> contactIds) {
            String contactIdsShrink = shrink(contactIds, "contactIds", "json");
            this.putQueryParameter("contactIds", contactIdsShrink);
            this.contactIds = contactIds;
            return this;
        }

        @Override
        public DeleteContactsRequest build() {
            return new DeleteContactsRequest(this);
        } 

    } 

}
