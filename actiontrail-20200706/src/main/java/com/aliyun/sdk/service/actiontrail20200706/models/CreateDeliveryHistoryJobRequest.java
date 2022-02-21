// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeliveryHistoryJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDeliveryHistoryJobRequest</p>
 */
public class CreateDeliveryHistoryJobRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("TrailName")
    @Validation(required = true)
    private String trailName;

    private CreateDeliveryHistoryJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.trailName = builder.trailName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeliveryHistoryJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return trailName
     */
    public String getTrailName() {
        return this.trailName;
    }

    public static final class Builder extends Request.Builder<CreateDeliveryHistoryJobRequest, Builder> {
        private String clientToken; 
        private String trailName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeliveryHistoryJobRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.trailName = response.trailName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * TrailName.
         */
        public Builder trailName(String trailName) {
            this.putQueryParameter("TrailName", trailName);
            this.trailName = trailName;
            return this;
        }

        @Override
        public CreateDeliveryHistoryJobRequest build() {
            return new CreateDeliveryHistoryJobRequest(this);
        } 

    } 

}
