// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageUserInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMessageUserInfoRequest</p>
 */
public class GetMessageUserInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CloudUid")
    private String cloudUid;

    private GetMessageUserInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cloudUid = builder.cloudUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageUserInfoRequest create() {
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
     * @return cloudUid
     */
    public String getCloudUid() {
        return this.cloudUid;
    }

    public static final class Builder extends Request.Builder<GetMessageUserInfoRequest, Builder> {
        private String regionId; 
        private String cloudUid; 

        private Builder() {
            super();
        } 

        private Builder(GetMessageUserInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cloudUid = request.cloudUid;
        } 

        /**
         * cn-shanghai
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CloudUid.
         */
        public Builder cloudUid(String cloudUid) {
            this.putBodyParameter("CloudUid", cloudUid);
            this.cloudUid = cloudUid;
            return this;
        }

        @Override
        public GetMessageUserInfoRequest build() {
            return new GetMessageUserInfoRequest(this);
        } 

    } 

}
