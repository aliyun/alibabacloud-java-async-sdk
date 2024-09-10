// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserActiveRunsRequest} extends {@link RequestModel}
 *
 * <p>ListUserActiveRunsRequest</p>
 */
public class ListUserActiveRunsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer maxResults;

    private ListUserActiveRunsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserActiveRunsRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static final class Builder extends Request.Builder<ListUserActiveRunsRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 

        private Builder() {
            super();
        } 

        private Builder(ListUserActiveRunsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        @Override
        public ListUserActiveRunsRequest build() {
            return new ListUserActiveRunsRequest(this);
        } 

    } 

}
