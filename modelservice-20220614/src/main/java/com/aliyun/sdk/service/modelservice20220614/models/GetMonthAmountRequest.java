// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelservice20220614.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonthAmountRequest} extends {@link RequestModel}
 *
 * <p>GetMonthAmountRequest</p>
 */
public class GetMonthAmountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneType;

    private GetMonthAmountRequest(Builder builder) {
        super(builder);
        this.sceneType = builder.sceneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonthAmountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    public static final class Builder extends Request.Builder<GetMonthAmountRequest, Builder> {
        private String sceneType; 

        private Builder() {
            super();
        } 

        private Builder(GetMonthAmountRequest request) {
            super(request);
            this.sceneType = request.sceneType;
        } 

        /**
         * SceneType.
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        @Override
        public GetMonthAmountRequest build() {
            return new GetMonthAmountRequest(this);
        } 

    } 

}
