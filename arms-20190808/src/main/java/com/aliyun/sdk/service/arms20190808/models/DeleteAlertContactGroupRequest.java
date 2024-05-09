// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
    @com.aliyun.core.annotation.NameInMap("ContactGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupId = builder.contactGroupId;
        this.regionId = builder.regionId;
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
     * @return contactGroupId
     */
    public Long getContactGroupId() {
        return this.contactGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAlertContactGroupRequest, Builder> {
        private Long contactGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertContactGroupRequest request) {
            super(request);
            this.contactGroupId = request.contactGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the alert contact group.
         */
        public Builder contactGroupId(Long contactGroupId) {
            this.putQueryParameter("ContactGroupId", contactGroupId);
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteAlertContactGroupRequest build() {
            return new DeleteAlertContactGroupRequest(this);
        } 

    } 

}
