// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RebuildEdgeContainerAppStagingEnvRequest} extends {@link RequestModel}
 *
 * <p>RebuildEdgeContainerAppStagingEnvRequest</p>
 */
public class RebuildEdgeContainerAppStagingEnvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private RebuildEdgeContainerAppStagingEnvRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildEdgeContainerAppStagingEnvRequest create() {
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

    public static final class Builder extends Request.Builder<RebuildEdgeContainerAppStagingEnvRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(RebuildEdgeContainerAppStagingEnvRequest request) {
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
        public RebuildEdgeContainerAppStagingEnvRequest build() {
            return new RebuildEdgeContainerAppStagingEnvRequest(this);
        } 

    } 

}
