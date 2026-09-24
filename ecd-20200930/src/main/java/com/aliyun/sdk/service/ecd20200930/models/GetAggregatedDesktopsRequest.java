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
 * {@link GetAggregatedDesktopsRequest} extends {@link RequestModel}
 *
 * <p>GetAggregatedDesktopsRequest</p>
 */
public class GetAggregatedDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregationFactor")
    private String aggregationFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    private GetAggregatedDesktopsRequest(Builder builder) {
        super(builder);
        this.aggregationFactor = builder.aggregationFactor;
        this.regionId = builder.regionId;
        this.searchRegionId = builder.searchRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregatedDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregationFactor
     */
    public String getAggregationFactor() {
        return this.aggregationFactor;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchRegionId
     */
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public static final class Builder extends Request.Builder<GetAggregatedDesktopsRequest, Builder> {
        private String aggregationFactor; 
        private String regionId; 
        private String searchRegionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregatedDesktopsRequest request) {
            super(request);
            this.aggregationFactor = request.aggregationFactor;
            this.regionId = request.regionId;
            this.searchRegionId = request.searchRegionId;
        } 

        /**
         * <p>The aggregation factor.</p>
         * 
         * <strong>example:</strong>
         * <p>STATUS</p>
         */
        public Builder aggregationFactor(String aggregationFactor) {
            this.putQueryParameter("AggregationFactor", aggregationFactor);
            this.aggregationFactor = aggregationFactor;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the list of regions supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The search region ID. Used to filter desktop information for a specified region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder searchRegionId(String searchRegionId) {
            this.putQueryParameter("SearchRegionId", searchRegionId);
            this.searchRegionId = searchRegionId;
            return this;
        }

        @Override
        public GetAggregatedDesktopsRequest build() {
            return new GetAggregatedDesktopsRequest(this);
        } 

    } 

}
