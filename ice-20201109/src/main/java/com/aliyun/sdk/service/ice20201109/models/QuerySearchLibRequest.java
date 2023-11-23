// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySearchLibRequest} extends {@link RequestModel}
 *
 * <p>QuerySearchLibRequest</p>
 */
public class QuerySearchLibRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SearchLibName")
    @Validation(required = true)
    private String searchLibName;

    private QuerySearchLibRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySearchLibRequest create() {
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
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<QuerySearchLibRequest, Builder> {
        private String regionId; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(QuerySearchLibRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.searchLibName = request.searchLibName;
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
         * SearchLibName.
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        @Override
        public QuerySearchLibRequest build() {
            return new QuerySearchLibRequest(this);
        } 

    } 

}
