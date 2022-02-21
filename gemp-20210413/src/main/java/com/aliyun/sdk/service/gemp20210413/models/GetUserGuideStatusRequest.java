// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserGuideStatusRequest} extends {@link RequestModel}
 *
 * <p>GetUserGuideStatusRequest</p>
 */
public class GetUserGuideStatusRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    private GetUserGuideStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGuideStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<GetUserGuideStatusRequest, Builder> {
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(GetUserGuideStatusRequest response) {
            super(response);
            this.clientToken = response.clientToken;
        } 

        /**
         * 幂等校验
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public GetUserGuideStatusRequest build() {
            return new GetUserGuideStatusRequest(this);
        } 

    } 

}
