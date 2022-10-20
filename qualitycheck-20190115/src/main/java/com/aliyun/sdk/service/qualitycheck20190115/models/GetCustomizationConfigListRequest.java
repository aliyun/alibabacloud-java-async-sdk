// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomizationConfigListRequest} extends {@link RequestModel}
 *
 * <p>GetCustomizationConfigListRequest</p>
 */
public class GetCustomizationConfigListRequest extends Request {
    @Query
    @NameInMap("JsonStr")
    @Validation(required = true)
    private String jsonStr;

    private GetCustomizationConfigListRequest(Builder builder) {
        super(builder);
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomizationConfigListRequest create() {
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

    public static final class Builder extends Request.Builder<GetCustomizationConfigListRequest, Builder> {
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomizationConfigListRequest request) {
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
        public GetCustomizationConfigListRequest build() {
            return new GetCustomizationConfigListRequest(this);
        } 

    } 

}
