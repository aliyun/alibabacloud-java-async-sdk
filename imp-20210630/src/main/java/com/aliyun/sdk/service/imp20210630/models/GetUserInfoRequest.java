// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserInfoRequest</p>
 */
public class GetUserInfoRequest extends Request {
    @Query
    @NameInMap("CloudUid")
    private String cloudUid;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetUserInfoRequest(Builder builder) {
        super(builder);
        this.cloudUid = builder.cloudUid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudUid
     */
    public String getCloudUid() {
        return this.cloudUid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetUserInfoRequest, Builder> {
        private String cloudUid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserInfoRequest response) {
            super(response);
            this.cloudUid = response.cloudUid;
            this.regionId = response.regionId;
        } 

        /**
         * 云账号id
         */
        public Builder cloudUid(String cloudUid) {
            this.putQueryParameter("CloudUid", cloudUid);
            this.cloudUid = cloudUid;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetUserInfoRequest build() {
            return new GetUserInfoRequest(this);
        } 

    } 

}
