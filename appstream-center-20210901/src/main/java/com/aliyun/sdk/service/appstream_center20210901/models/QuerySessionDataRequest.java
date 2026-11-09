// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QuerySessionDataRequest} extends {@link RequestModel}
 *
 * <p>QuerySessionDataRequest</p>
 */
public class QuerySessionDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatDate")
    private String statDate;

    private QuerySessionDataRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.bizRegionId = builder.bizRegionId;
        this.regionId = builder.regionId;
        this.statDate = builder.statDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySessionDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return statDate
     */
    public String getStatDate() {
        return this.statDate;
    }

    public static final class Builder extends Request.Builder<QuerySessionDataRequest, Builder> {
        private String appInstanceGroupId; 
        private String bizRegionId; 
        private String regionId; 
        private String statDate; 

        private Builder() {
            super();
        } 

        private Builder(QuerySessionDataRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.bizRegionId = request.bizRegionId;
            this.regionId = request.regionId;
            this.statDate = request.statDate;
        } 

        /**
         * <p>The delivery group ID, used to filter session data for a specified delivery group. If not provided, the summary of session data for all delivery groups under the current account is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-89ibriac2wudyph38</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The business region ID, which specifies the region for which to query session data. The server uses this value as the region filter condition for session data. If not provided, no region filtering is applied, and the summary of session data for all regions is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The region ID, which is a common request parameter for the gateway. The actual region used to filter session data in this operation is specified by BizRegionId.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The statistical date in the yyyyMMdd format (without hyphens), such as 20261106. If not provided, the data for yesterday is queried by default. Only dates within the last 90 days are supported. If the date exceeds 90 days or the format is invalid, a parameter error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20261106</p>
         */
        public Builder statDate(String statDate) {
            this.putBodyParameter("StatDate", statDate);
            this.statDate = statDate;
            return this;
        }

        @Override
        public QuerySessionDataRequest build() {
            return new QuerySessionDataRequest(this);
        } 

    } 

}
