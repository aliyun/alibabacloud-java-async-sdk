// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdLabelRequest} extends {@link RequestModel}
 *
 * <p>GetCrowdLabelRequest</p>
 */
public class GetCrowdLabelRequest extends Request {
    @Body
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    private GetCrowdLabelRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdLabelRequest create() {
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

    public static final class Builder extends Request.Builder<GetCrowdLabelRequest, Builder> {
        private String cateIds; 

        private Builder() {
            super();
        } 

        private Builder(GetCrowdLabelRequest request) {
            super(request);
            this.cateIds = request.cateIds;
        } 

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putBodyParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        @Override
        public GetCrowdLabelRequest build() {
            return new GetCrowdLabelRequest(this);
        } 

    } 

}
