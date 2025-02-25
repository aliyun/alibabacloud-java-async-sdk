// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.status20200117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventInProgressRequest} extends {@link RequestModel}
 *
 * <p>ListEventInProgressRequest</p>
 */
public class ListEventInProgressRequest extends Request {
    @Body
    @NameInMap("RegionIds")
    @Validation(required = true)
    private java.util.List < String > regionIds;

    private ListEventInProgressRequest(Builder builder) {
        super(builder);
        this.regionIds = builder.regionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventInProgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionIds
     */
    public java.util.List < String > getRegionIds() {
        return this.regionIds;
    }

    public static final class Builder extends Request.Builder<ListEventInProgressRequest, Builder> {
        private java.util.List < String > regionIds; 

        private Builder() {
            super();
        } 

        private Builder(ListEventInProgressRequest request) {
            super(request);
            this.regionIds = request.regionIds;
        } 

        /**
         * RegionIds.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putBodyParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        @Override
        public ListEventInProgressRequest build() {
            return new ListEventInProgressRequest(this);
        } 

    } 

}
