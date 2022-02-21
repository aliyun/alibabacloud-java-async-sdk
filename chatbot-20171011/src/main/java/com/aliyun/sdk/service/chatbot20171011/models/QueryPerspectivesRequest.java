// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPerspectivesRequest} extends {@link RequestModel}
 *
 * <p>QueryPerspectivesRequest</p>
 */
public class QueryPerspectivesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    private QueryPerspectivesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPerspectivesRequest create() {
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

    public static final class Builder extends Request.Builder<QueryPerspectivesRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPerspectivesRequest response) {
            super(response);
            this.regionId = response.regionId;
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
        public QueryPerspectivesRequest build() {
            return new QueryPerspectivesRequest(this);
        } 

    } 

}
