// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagOptionRequest} extends {@link RequestModel}
 *
 * <p>GetTagOptionRequest</p>
 */
public class GetTagOptionRequest extends Request {
    @Query
    @NameInMap("TagOptionId")
    @Validation(required = true)
    private String tagOptionId;

    private GetTagOptionRequest(Builder builder) {
        super(builder);
        this.tagOptionId = builder.tagOptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagOptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagOptionId
     */
    public String getTagOptionId() {
        return this.tagOptionId;
    }

    public static final class Builder extends Request.Builder<GetTagOptionRequest, Builder> {
        private String tagOptionId; 

        private Builder() {
            super();
        } 

        private Builder(GetTagOptionRequest request) {
            super(request);
            this.tagOptionId = request.tagOptionId;
        } 

        /**
         * The ID of the tag option.
         */
        public Builder tagOptionId(String tagOptionId) {
            this.putQueryParameter("TagOptionId", tagOptionId);
            this.tagOptionId = tagOptionId;
            return this;
        }

        @Override
        public GetTagOptionRequest build() {
            return new GetTagOptionRequest(this);
        } 

    } 

}
