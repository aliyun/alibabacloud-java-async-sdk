// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScoreInfoRequest} extends {@link RequestModel}
 *
 * <p>GetScoreInfoRequest</p>
 */
public class GetScoreInfoRequest extends Request {
    @Query
    @NameInMap("JsonStr")
    @Validation(required = true)
    private String jsonStr;

    private GetScoreInfoRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScoreInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonStr
     */
    public String getJsonStr() {
        return this.jsonStr;
    }

    public static final class Builder extends Request.Builder<GetScoreInfoRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(GetScoreInfoRequest request) {
            super(request);
            this.jsonStr = request.jsonStr;
        } 

        /**
         * JsonStr.
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("JsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public GetScoreInfoRequest build() {
            return new GetScoreInfoRequest(this);
        } 

    } 

}
