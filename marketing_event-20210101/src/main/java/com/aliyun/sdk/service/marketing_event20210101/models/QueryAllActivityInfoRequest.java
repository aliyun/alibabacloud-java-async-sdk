// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryAllActivityInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryAllActivityInfoRequest</p>
 */
public class QueryAllActivityInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activityId;

    private QueryAllActivityInfoRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllActivityInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    public static final class Builder extends Request.Builder<QueryAllActivityInfoRequest, Builder> {
        private String activityId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAllActivityInfoRequest request) {
            super(request);
            this.activityId = request.activityId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        @Override
        public QueryAllActivityInfoRequest build() {
            return new QueryAllActivityInfoRequest(this);
        } 

    } 

}
