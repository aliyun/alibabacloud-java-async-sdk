// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendImageDetailRequest} extends {@link RequestModel}
 *
 * <p>GetTrendImageDetailRequest</p>
 */
public class GetTrendImageDetailRequest extends Request {
    @Query
    @NameInMap("AiImgId")
    @Validation(required = true)
    private String aiImgId;

    private GetTrendImageDetailRequest(Builder builder) {
        super(builder);
        this.aiImgId = builder.aiImgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendImageDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiImgId
     */
    public String getAiImgId() {
        return this.aiImgId;
    }

    public static final class Builder extends Request.Builder<GetTrendImageDetailRequest, Builder> {
        private String aiImgId; 

        private Builder() {
            super();
        } 

        private Builder(GetTrendImageDetailRequest request) {
            super(request);
            this.aiImgId = request.aiImgId;
        } 

        /**
         * AiImgId.
         */
        public Builder aiImgId(String aiImgId) {
            this.putQueryParameter("AiImgId", aiImgId);
            this.aiImgId = aiImgId;
            return this;
        }

        @Override
        public GetTrendImageDetailRequest build() {
            return new GetTrendImageDetailRequest(this);
        } 

    } 

}
