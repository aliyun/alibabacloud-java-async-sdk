// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_yaochi_portal20230206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserAuthRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserAuthRequest</p>
 */
public class UpdateUserAuthRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("GrantState")
    private Long grantState;

    private UpdateUserAuthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.grantState = builder.grantState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserAuthRequest create() {
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
     * @return grantState
     */
    public Long getGrantState() {
        return this.grantState;
    }

    public static final class Builder extends Request.Builder<UpdateUserAuthRequest, Builder> {
        private String regionId; 
        private Long grantState; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserAuthRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.grantState = request.grantState;
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
         * GrantState.
         */
        public Builder grantState(Long grantState) {
            this.putQueryParameter("GrantState", grantState);
            this.grantState = grantState;
            return this;
        }

        @Override
        public UpdateUserAuthRequest build() {
            return new UpdateUserAuthRequest(this);
        } 

    } 

}
