// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFinanceUserInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryFinanceUserInfoRequest</p>
 */
public class QueryFinanceUserInfoRequest extends Request {
    @Body
    @NameInMap("ActivityId")
    private Long activityId;

    @Body
    @NameInMap("UserId")
    private Long userId;

    private QueryFinanceUserInfoRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFinanceUserInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryFinanceUserInfoRequest, Builder> {
        private Long activityId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryFinanceUserInfoRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.userId = request.userId;
        } 

        /**
         * ActivityId.
         */
        public Builder activityId(Long activityId) {
            this.putBodyParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryFinanceUserInfoRequest build() {
            return new QueryFinanceUserInfoRequest(this);
        } 

    } 

}
