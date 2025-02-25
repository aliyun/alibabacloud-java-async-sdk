// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DeleteConfigGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigGroupRequest</p>
 */
public class DeleteConfigGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<String> groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteConfigGroupRequest(Builder builder) {
        super(builder);
        this.groupIds = builder.groupIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupIds
     */
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteConfigGroupRequest, Builder> {
        private java.util.List<String> groupIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigGroupRequest request) {
            super(request);
            this.groupIds = request.groupIds;
            this.regionId = request.regionId;
        } 

        /**
         * GroupIds.
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
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

        @Override
        public DeleteConfigGroupRequest build() {
            return new DeleteConfigGroupRequest(this);
        } 

    } 

}
