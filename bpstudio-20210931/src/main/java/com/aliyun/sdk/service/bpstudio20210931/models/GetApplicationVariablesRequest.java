// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationVariablesRequest} extends {@link RequestModel}
 *
 * <p>GetApplicationVariablesRequest</p>
 */
public class GetApplicationVariablesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private GetApplicationVariablesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationVariablesRequest create() {
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

    public static final class Builder extends Request.Builder<GetApplicationVariablesRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(GetApplicationVariablesRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public GetApplicationVariablesRequest build() {
            return new GetApplicationVariablesRequest(this);
        } 

    } 

}
