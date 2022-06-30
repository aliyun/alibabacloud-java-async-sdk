// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStyleTopRequest} extends {@link RequestModel}
 *
 * <p>GetStyleTopRequest</p>
 */
public class GetStyleTopRequest extends Request {
    @Body
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    @Body
    @NameInMap("SortOrder")
    @Validation(required = true)
    private Long sortOrder;

    @Body
    @NameInMap("TimeDisplay")
    @Validation(required = true)
    private Long timeDisplay;

    private GetStyleTopRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
        this.sortOrder = builder.sortOrder;
        this.timeDisplay = builder.timeDisplay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStyleTopRequest create() {
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
     * @return sortOrder
     */
    public Long getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return timeDisplay
     */
    public Long getTimeDisplay() {
        return this.timeDisplay;
    }

    public static final class Builder extends Request.Builder<GetStyleTopRequest, Builder> {
        private String cateIds; 
        private Long sortOrder; 
        private Long timeDisplay; 

        private Builder() {
            super();
        } 

        private Builder(GetStyleTopRequest request) {
            super(request);
            this.cateIds = request.cateIds;
            this.sortOrder = request.sortOrder;
            this.timeDisplay = request.timeDisplay;
        } 

        /**
         * A short description of struct
         */
        public Builder cateIds(String cateIds) {
            this.putBodyParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(Long sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
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
        public GetStyleTopRequest build() {
            return new GetStyleTopRequest(this);
        } 

    } 

}
