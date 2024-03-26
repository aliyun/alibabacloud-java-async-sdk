// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryActivityRequest} extends {@link RequestModel}
 *
 * <p>QueryActivityRequest</p>
 */
public class QueryActivityRequest extends Request {
    @Body
    @NameInMap("ActivityId")
    private Long activityId;

    @Body
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("SnapType")
    private String snapType;

    private QueryActivityRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.bizId = builder.bizId;
        this.snapType = builder.snapType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryActivityRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return snapType
     */
    public String getSnapType() {
        return this.snapType;
    }

    public static final class Builder extends Request.Builder<QueryActivityRequest, Builder> {
        private Long activityId; 
        private String bizId; 
        private String snapType; 

        private Builder() {
            super();
        } 

        private Builder(QueryActivityRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.bizId = request.bizId;
            this.snapType = request.snapType;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * SnapType.
         */
        public Builder snapType(String snapType) {
            this.putBodyParameter("SnapType", snapType);
            this.snapType = snapType;
            return this;
        }

        @Override
        public QueryActivityRequest build() {
            return new QueryActivityRequest(this);
        } 

    } 

}
