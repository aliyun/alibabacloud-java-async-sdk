// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteOncallSchedulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteOncallSchedulesRequest</p>
 */
public class DeleteOncallSchedulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("oncallScheduleIds")
    private java.util.List<String> oncallScheduleIds;

    private DeleteOncallSchedulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.oncallScheduleIds = builder.oncallScheduleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOncallSchedulesRequest create() {
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
     * @return oncallScheduleIds
     */
    public java.util.List<String> getOncallScheduleIds() {
        return this.oncallScheduleIds;
    }

    public static final class Builder extends Request.Builder<DeleteOncallSchedulesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> oncallScheduleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOncallSchedulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.oncallScheduleIds = request.oncallScheduleIds;
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
         * <p>The IDs of the on-call schedules.</p>
         */
        public Builder oncallScheduleIds(java.util.List<String> oncallScheduleIds) {
            String oncallScheduleIdsShrink = shrink(oncallScheduleIds, "oncallScheduleIds", "json");
            this.putQueryParameter("oncallScheduleIds", oncallScheduleIdsShrink);
            this.oncallScheduleIds = oncallScheduleIds;
            return this;
        }

        @Override
        public DeleteOncallSchedulesRequest build() {
            return new DeleteOncallSchedulesRequest(this);
        } 

    } 

}
