// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSingleConnDataRequest} extends {@link RequestModel}
 *
 * <p>GetSingleConnDataRequest</p>
 */
public class GetSingleConnDataRequest extends Request {
    @Query
    @NameInMap("SubSceneId")
    @Validation(required = true, minimum = 1)
    private String subSceneId;

    private GetSingleConnDataRequest(Builder builder) {
        super(builder);
        this.subSceneId = builder.subSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSingleConnDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subSceneId
     */
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public static final class Builder extends Request.Builder<GetSingleConnDataRequest, Builder> {
        private String subSceneId; 

        private Builder() {
            super();
        } 

        private Builder(GetSingleConnDataRequest request) {
            super(request);
            this.subSceneId = request.subSceneId;
        } 

        /**
         * 子场景ID
         */
        public Builder subSceneId(String subSceneId) {
            this.putQueryParameter("SubSceneId", subSceneId);
            this.subSceneId = subSceneId;
            return this;
        }

        @Override
        public GetSingleConnDataRequest build() {
            return new GetSingleConnDataRequest(this);
        } 

    } 

}
