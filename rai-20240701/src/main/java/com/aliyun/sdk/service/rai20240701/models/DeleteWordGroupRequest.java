// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link DeleteWordGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteWordGroupRequest</p>
 */
public class DeleteWordGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIdList")
    private java.util.List<Long> groupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteWordGroupRequest(Builder builder) {
        super(builder);
        this.groupIdList = builder.groupIdList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWordGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupIdList
     */
    public java.util.List<Long> getGroupIdList() {
        return this.groupIdList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteWordGroupRequest, Builder> {
        private java.util.List<Long> groupIdList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWordGroupRequest request) {
            super(request);
            this.groupIdList = request.groupIdList;
            this.regionId = request.regionId;
        } 

        /**
         * <p>List of keyword strategy IDs.</p>
         */
        public Builder groupIdList(java.util.List<Long> groupIdList) {
            String groupIdListShrink = shrink(groupIdList, "GroupIdList", "json");
            this.putQueryParameter("GroupIdList", groupIdListShrink);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteWordGroupRequest build() {
            return new DeleteWordGroupRequest(this);
        } 

    } 

}
