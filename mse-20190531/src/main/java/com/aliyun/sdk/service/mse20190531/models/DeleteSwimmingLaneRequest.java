// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>DeleteSwimmingLaneRequest</p>
 */
public class DeleteSwimmingLaneRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("LaneId")
    @Validation(required = true)
    private Long laneId;

    private DeleteSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.laneId = builder.laneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSwimmingLaneRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSwimmingLaneRequest, Builder> {
        private String acceptLanguage; 
        private Long laneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSwimmingLaneRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.laneId = request.laneId;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the lane.
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        @Override
        public DeleteSwimmingLaneRequest build() {
            return new DeleteSwimmingLaneRequest(this);
        } 

    } 

}
