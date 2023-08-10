// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptResourceShareInvitationRequest} extends {@link RequestModel}
 *
 * <p>AcceptResourceShareInvitationRequest</p>
 */
public class AcceptResourceShareInvitationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceShareInvitationId")
    @Validation(required = true)
    private String resourceShareInvitationId;

    private AcceptResourceShareInvitationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceShareInvitationId = builder.resourceShareInvitationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptResourceShareInvitationRequest create() {
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
     * @return resourceShareInvitationId
     */
    public String getResourceShareInvitationId() {
        return this.resourceShareInvitationId;
    }

    public static final class Builder extends Request.Builder<AcceptResourceShareInvitationRequest, Builder> {
        private String regionId; 
        private String resourceShareInvitationId; 

        private Builder() {
            super();
        } 

        private Builder(AcceptResourceShareInvitationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceShareInvitationId = request.resourceShareInvitationId;
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
         * The ID of the resource sharing invitation.
         * <p>
         * 
         * You can call the [ListResourceShareInvitations](~~450564~~) operation to obtain the ID of a resource sharing invitation.
         */
        public Builder resourceShareInvitationId(String resourceShareInvitationId) {
            this.putQueryParameter("ResourceShareInvitationId", resourceShareInvitationId);
            this.resourceShareInvitationId = resourceShareInvitationId;
            return this;
        }

        @Override
        public AcceptResourceShareInvitationRequest build() {
            return new AcceptResourceShareInvitationRequest(this);
        } 

    } 

}
