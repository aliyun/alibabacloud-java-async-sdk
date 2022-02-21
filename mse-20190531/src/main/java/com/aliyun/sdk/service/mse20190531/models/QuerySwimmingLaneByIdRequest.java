// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySwimmingLaneByIdRequest} extends {@link RequestModel}
 *
 * <p>QuerySwimmingLaneByIdRequest</p>
 */
public class QuerySwimmingLaneByIdRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("LaneId")
    @Validation(required = true)
    private Long laneId;

    private QuerySwimmingLaneByIdRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.laneId = builder.laneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySwimmingLaneByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    public static final class Builder extends Request.Builder<QuerySwimmingLaneByIdRequest, Builder> {
        private String acceptLanguage; 
        private Long laneId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySwimmingLaneByIdRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.laneId = response.laneId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * LaneId.
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        @Override
        public QuerySwimmingLaneByIdRequest build() {
            return new QuerySwimmingLaneByIdRequest(this);
        } 

    } 

}
