// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai20240521.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserAliUidByInstanceIdRequest} extends {@link RequestModel}
 *
 * <p>GetUserAliUidByInstanceIdRequest</p>
 */
public class GetUserAliUidByInstanceIdRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
    private String resourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerUid")
    private String resourceOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private GetUserAliUidByInstanceIdRequest(Builder builder) {
        super(builder);
        this.resourceInstanceId = builder.resourceInstanceId;
        this.regionId = builder.regionId;
        this.resourceOwnerUid = builder.resourceOwnerUid;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserAliUidByInstanceIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceInstanceId
     */
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerUid
     */
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetUserAliUidByInstanceIdRequest, Builder> {
        private String resourceInstanceId; 
        private String regionId; 
        private String resourceOwnerUid; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetUserAliUidByInstanceIdRequest request) {
            super(request);
            this.resourceInstanceId = request.resourceInstanceId;
            this.regionId = request.regionId;
            this.resourceOwnerUid = request.resourceOwnerUid;
            this.resourceType = request.resourceType;
        } 

        /**
         * ResourceInstanceId.
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.putPathParameter("ResourceInstanceId", resourceInstanceId);
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerUid.
         */
        public Builder resourceOwnerUid(String resourceOwnerUid) {
            this.putQueryParameter("ResourceOwnerUid", resourceOwnerUid);
            this.resourceOwnerUid = resourceOwnerUid;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetUserAliUidByInstanceIdRequest build() {
            return new GetUserAliUidByInstanceIdRequest(this);
        } 

    } 

}
