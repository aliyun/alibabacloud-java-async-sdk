// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserRequest} extends {@link RequestModel}
 *
 * <p>AddUserRequest</p>
 */
public class AddUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddedUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long addedUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * The ID of the cloud account.
         */
        public Builder addedUserId(Long addedUserId) {
            this.putBodyParameter("AddedUserId", addedUserId);
            this.addedUserId = addedUserId;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
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
