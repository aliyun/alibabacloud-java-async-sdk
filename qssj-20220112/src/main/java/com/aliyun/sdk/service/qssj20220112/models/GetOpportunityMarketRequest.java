// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpportunityMarketRequest} extends {@link RequestModel}
 *
 * <p>GetOpportunityMarketRequest</p>
 */
public class GetOpportunityMarketRequest extends Request {
    @Body
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    @Body
    @NameInMap("TimeDisplay")
    @Validation(required = true)
    private Long timeDisplay;

    private GetOpportunityMarketRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
        this.timeDisplay = builder.timeDisplay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpportunityMarketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateIds
     */
    public String getCateIds() {
        return this.cateIds;
    }

    /**
     * @return timeDisplay
     */
    public Long getTimeDisplay() {
        return this.timeDisplay;
    }

    public static final class Builder extends Request.Builder<GetOpportunityMarketRequest, Builder> {
        private String cateIds; 
        private Long timeDisplay; 

        private Builder() {
            super();
        } 

        private Builder(GetOpportunityMarketRequest request) {
            super(request);
            this.cateIds = request.cateIds;
            this.timeDisplay = request.timeDisplay;
        } 

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putBodyParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * TimeDisplay.
         */
        public Builder timeDisplay(Long timeDisplay) {
            this.putBodyParameter("TimeDisplay", timeDisplay);
            this.timeDisplay = timeDisplay;
            return this;
        }

        @Override
        public GetOpportunityMarketRequest build() {
            return new GetOpportunityMarketRequest(this);
        } 

    } 

}
