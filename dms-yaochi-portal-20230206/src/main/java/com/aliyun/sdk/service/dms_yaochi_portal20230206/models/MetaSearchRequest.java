// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_yaochi_portal20230206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetaSearchRequest} extends {@link RequestModel}
 *
 * <p>MetaSearchRequest</p>
 */
public class MetaSearchRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Limit")
    private Long limit;

    @Query
    @NameInMap("SearchKey")
    @Validation(required = true)
    private String searchKey;

    @Query
    @NameInMap("Start")
    private Long start;

    private MetaSearchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.limit = builder.limit;
        this.searchKey = builder.searchKey;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaSearchRequest create() {
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
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<MetaSearchRequest, Builder> {
        private String regionId; 
        private Long limit; 
        private String searchKey; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(MetaSearchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.limit = request.limit;
            this.searchKey = request.searchKey;
            this.start = request.start;
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
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public MetaSearchRequest build() {
            return new MetaSearchRequest(this);
        } 

    } 

}
