// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertContactRequest</p>
 */
public class DeleteAlertContactRequest extends Request {
    @Query
    @NameInMap("ContactId")
    @Validation(required = true)
    private Long contactId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteAlertContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.regionId = builder.regionId;
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
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAlertContactRequest, Builder> {
        private Long contactId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.regionId = request.regionId;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
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
        public DeleteAlertContactRequest build() {
            return new DeleteAlertContactRequest(this);
        } 

    } 

}
