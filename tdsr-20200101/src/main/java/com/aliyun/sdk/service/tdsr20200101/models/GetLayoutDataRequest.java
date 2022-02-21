// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLayoutDataRequest} extends {@link RequestModel}
 *
 * <p>GetLayoutDataRequest</p>
 */
public class GetLayoutDataRequest extends Request {
    @Query
    @NameInMap("SubSceneId")
    @Validation(required = true)
    private String subSceneId;

    private GetLayoutDataRequest(Builder builder) {
        super(builder);
        this.subSceneId = builder.subSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLayoutDataRequest create() {
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

    public static final class Builder extends Request.Builder<GetLayoutDataRequest, Builder> {
        private String subSceneId; 

        private Builder() {
            super();
        } 

        private Builder(GetLayoutDataRequest response) {
            super(response);
            this.subSceneId = response.subSceneId;
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
        public GetLayoutDataRequest build() {
            return new GetLayoutDataRequest(this);
        } 

    } 

}
