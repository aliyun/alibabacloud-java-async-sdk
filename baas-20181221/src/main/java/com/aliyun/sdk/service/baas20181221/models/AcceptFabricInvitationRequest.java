// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptFabricInvitationRequest} extends {@link RequestModel}
 *
 * <p>AcceptFabricInvitationRequest</p>
 */
public class AcceptFabricInvitationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsAccepted")
    private Boolean isAccepted;

    private AcceptFabricInvitationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
        this.isAccepted = builder.isAccepted;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<AcceptFabricInvitationRequest, Builder> {
        private String regionId; 
        private String code; 
        private Boolean isAccepted; 

        private Builder() {
            super();
        } 

        private Builder(AcceptFabricInvitationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
            this.isAccepted = request.isAccepted;
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

        @Override
        public AcceptFabricInvitationRequest build() {
            return new AcceptFabricInvitationRequest(this);
        } 

    } 

}
