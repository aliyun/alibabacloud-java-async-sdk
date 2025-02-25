// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AcceptResourceShareInvitationRequest} extends {@link RequestModel}
 *
 * <p>AcceptResourceShareInvitationRequest</p>
 */
public class AcceptResourceShareInvitationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareInvitationId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource sharing invitation.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/450564.html">ListResourceShareInvitations</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-pMnItMX19fBJ****</p>
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
