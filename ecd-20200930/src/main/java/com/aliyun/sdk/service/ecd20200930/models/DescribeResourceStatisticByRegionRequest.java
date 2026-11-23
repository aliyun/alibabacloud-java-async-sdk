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
 * {@link DescribeResourceStatisticByRegionRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceStatisticByRegionRequest</p>
 */
public class DescribeResourceStatisticByRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeGroupDesktops")
    private Boolean includeGroupDesktops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRegionId")
    private String searchRegionId;

    private DescribeResourceStatisticByRegionRequest(Builder builder) {
        super(builder);
        this.includeGroupDesktops = builder.includeGroupDesktops;
        this.regionId = builder.regionId;
        this.searchRegionId = builder.searchRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceStatisticByRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeGroupDesktops
     */
    public Boolean getIncludeGroupDesktops() {
        return this.includeGroupDesktops;
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

    public static final class Builder extends Request.Builder<DescribeResourceStatisticByRegionRequest, Builder> {
        private Boolean includeGroupDesktops; 
        private String regionId; 
        private String searchRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceStatisticByRegionRequest request) {
            super(request);
            this.includeGroupDesktops = request.includeGroupDesktops;
            this.regionId = request.regionId;
            this.searchRegionId = request.searchRegionId;
        } 

        /**
         * <p>Specifies whether the statistics include the number of shared cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeGroupDesktops(Boolean includeGroupDesktops) {
            this.putQueryParameter("IncludeGroupDesktops", includeGroupDesktops);
            this.includeGroupDesktops = includeGroupDesktops;
            return this;
        }

        /**
         * <p>The ID of the service region. Valid values: China (Shanghai) and Singapore.</p>
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
         * <p>The ID of the region to search. This parameter is used to filter cloud desktops in the specified region.</p>
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
        public DescribeResourceStatisticByRegionRequest build() {
            return new DescribeResourceStatisticByRegionRequest(this);
        } 

    } 

}
