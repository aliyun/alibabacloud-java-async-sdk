// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEdgeContainerTerminalRequest} extends {@link RequestModel}
 *
 * <p>GetEdgeContainerTerminalRequest</p>
 */
public class GetEdgeContainerTerminalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private GetEdgeContainerTerminalRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerTerminalRequest create() {
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

    public static final class Builder extends Request.Builder<GetEdgeContainerTerminalRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(GetEdgeContainerTerminalRequest request) {
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
        public GetEdgeContainerTerminalRequest build() {
            return new GetEdgeContainerTerminalRequest(this);
        } 

    } 

}
