// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptFabricInvitationRequest} extends {@link RequestModel}
 *
 * <p>AcceptFabricInvitationRequest</p>
 */
public class AcceptFabricInvitationRequest extends Request {
    @Body
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Body
    @NameInMap("IsAccepted")
    private Boolean isAccepted;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private AcceptFabricInvitationRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.isAccepted = builder.isAccepted;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptFabricInvitationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isAccepted
     */
    public Boolean getIsAccepted() {
        return this.isAccepted;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AcceptFabricInvitationRequest, Builder> {
        private String code; 
        private Boolean isAccepted; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AcceptFabricInvitationRequest response) {
            super(response);
            this.code = response.code;
            this.isAccepted = response.isAccepted;
            this.regionId = response.regionId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * IsAccepted.
         */
        public Builder isAccepted(Boolean isAccepted) {
            this.putBodyParameter("IsAccepted", isAccepted);
            this.isAccepted = isAccepted;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AcceptFabricInvitationRequest build() {
            return new AcceptFabricInvitationRequest(this);
        } 

    } 

}
