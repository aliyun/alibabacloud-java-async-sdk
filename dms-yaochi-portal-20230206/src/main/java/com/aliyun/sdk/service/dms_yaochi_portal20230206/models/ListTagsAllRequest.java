// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_yaochi_portal20230206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsAllRequest} extends {@link RequestModel}
 *
 * <p>ListTagsAllRequest</p>
 */
public class ListTagsAllRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListTagsAllRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsAllRequest create() {
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

    public static final class Builder extends Request.Builder<ListTagsAllRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListTagsAllRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListTagsAllRequest build() {
            return new ListTagsAllRequest(this);
        } 

    } 

}
