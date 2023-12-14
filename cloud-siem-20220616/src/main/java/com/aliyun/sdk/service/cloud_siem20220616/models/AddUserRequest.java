// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserRequest} extends {@link RequestModel}
 *
 * <p>AddUserRequest</p>
 */
public class AddUserRequest extends Request {
    @Body
    @NameInMap("AddedUserId")
    @Validation(required = true)
    private Long addedUserId;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private AddUserRequest(Builder builder) {
        super(builder);
        this.addedUserId = builder.addedUserId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addedUserId
     */
    public Long getAddedUserId() {
        return this.addedUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddUserRequest, Builder> {
        private Long addedUserId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserRequest request) {
            super(request);
            this.addedUserId = request.addedUserId;
            this.regionId = request.regionId;
        } 

        /**
         * AddedUserId.
         */
        public Builder addedUserId(Long addedUserId) {
            this.putBodyParameter("AddedUserId", addedUserId);
            this.addedUserId = addedUserId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddUserRequest build() {
            return new AddUserRequest(this);
        } 

    } 

}
