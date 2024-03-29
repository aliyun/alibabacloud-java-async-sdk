// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertContactGroupRequest</p>
 */
public class DeleteAlertContactGroupRequest extends Request {
    @Query
    @NameInMap("ContactGroupId")
    @Validation(required = true)
    private Long contactGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * ContactGroupId.
         */
        public Builder contactGroupId(Long contactGroupId) {
            this.putQueryParameter("ContactGroupId", contactGroupId);
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * RegionId.
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
