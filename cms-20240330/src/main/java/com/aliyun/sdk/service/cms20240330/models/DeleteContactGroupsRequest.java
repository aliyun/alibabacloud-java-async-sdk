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
 * {@link DeleteContactGroupsRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactGroupsRequest</p>
 */
public class DeleteContactGroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contactGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> contactGroupIds;

    private DeleteContactGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contactGroupIds = builder.contactGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContactGroupsRequest create() {
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
     * @return contactGroupIds
     */
    public java.util.List<String> getContactGroupIds() {
        return this.contactGroupIds;
    }

    public static final class Builder extends Request.Builder<DeleteContactGroupsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> contactGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContactGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contactGroupIds = request.contactGroupIds;
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
         * <p>This parameter is required.</p>
         */
        public Builder contactGroupIds(java.util.List<String> contactGroupIds) {
            String contactGroupIdsShrink = shrink(contactGroupIds, "contactGroupIds", "json");
            this.putQueryParameter("contactGroupIds", contactGroupIdsShrink);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        @Override
        public DeleteContactGroupsRequest build() {
            return new DeleteContactGroupsRequest(this);
        } 

    } 

}
