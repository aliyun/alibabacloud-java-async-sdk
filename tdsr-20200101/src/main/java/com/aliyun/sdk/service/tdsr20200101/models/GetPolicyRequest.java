// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetPolicyRequest</p>
 */
public class GetPolicyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubSceneUuid")
    private String subSceneUuid;

    @Query
    @NameInMap("Type")
    private String type;

    private GetPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.subSceneUuid = builder.subSceneUuid;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyRequest create() {
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
     * @return subSceneUuid
     */
    public String getSubSceneUuid() {
        return this.subSceneUuid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetPolicyRequest, Builder> {
        private String regionId; 
        private String subSceneUuid; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetPolicyRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.subSceneUuid = response.subSceneUuid;
            this.type = response.type;
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
         * SubSceneUuid.
         */
        public Builder subSceneUuid(String subSceneUuid) {
            this.putQueryParameter("SubSceneUuid", subSceneUuid);
            this.subSceneUuid = subSceneUuid;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetPolicyRequest build() {
            return new GetPolicyRequest(this);
        } 

    } 

}
