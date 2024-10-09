// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySessionByActivityIdPopRequest} extends {@link RequestModel}
 *
 * <p>QuerySessionByActivityIdPopRequest</p>
 */
public class QuerySessionByActivityIdPopRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long activityId;

    private QuerySessionByActivityIdPopRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.activityId = builder.activityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySessionByActivityIdPopRequest create() {
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
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
    }

    public static final class Builder extends Request.Builder<QuerySessionByActivityIdPopRequest, Builder> {
        private String regionId; 
        private Long activityId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySessionByActivityIdPopRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.activityId = request.activityId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4546</p>
         */
        public Builder activityId(Long activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        @Override
        public QuerySessionByActivityIdPopRequest build() {
            return new QuerySessionByActivityIdPopRequest(this);
        } 

    } 

}
