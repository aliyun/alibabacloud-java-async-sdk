// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetApplicationVariables4FailRequest} extends {@link RequestModel}
 *
 * <p>GetApplicationVariables4FailRequest</p>
 */
public class GetApplicationVariables4FailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private GetApplicationVariables4FailRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationVariables4FailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<GetApplicationVariables4FailRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(GetApplicationVariables4FailRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public GetApplicationVariables4FailRequest build() {
            return new GetApplicationVariables4FailRequest(this);
        } 

    } 

}
