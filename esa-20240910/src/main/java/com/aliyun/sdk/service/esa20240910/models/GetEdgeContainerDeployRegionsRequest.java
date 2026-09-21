// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEdgeContainerDeployRegionsRequest} extends {@link RequestModel}
 *
 * <p>GetEdgeContainerDeployRegionsRequest</p>
 */
public class GetEdgeContainerDeployRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private GetEdgeContainerDeployRegionsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerDeployRegionsRequest create() {
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

    public static final class Builder extends Request.Builder<GetEdgeContainerDeployRegionsRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(GetEdgeContainerDeployRegionsRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.&gt;Notice: This parameter is required. If this parameter is not specified, the service returns InvalidParameter.appid (400). You can call ListEdgeContainerApps to obtain a valid AppId. If you have not activated the Edge Container service, activate it first, and then call CreateEdgeContainerApp to create an application and obtain the AppId.
         * </notice></p>
         * 
         * <strong>example:</strong>
         * <p>GetEdgeContainerDeployRegions</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public GetEdgeContainerDeployRegionsRequest build() {
            return new GetEdgeContainerDeployRegionsRequest(this);
        } 

    } 

}
