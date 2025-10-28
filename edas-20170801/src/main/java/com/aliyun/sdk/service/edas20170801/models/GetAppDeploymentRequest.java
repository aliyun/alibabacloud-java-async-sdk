// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetAppDeploymentRequest} extends {@link RequestModel}
 *
 * <p>GetAppDeploymentRequest</p>
 */
public class GetAppDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private GetAppDeploymentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppDeploymentRequest create() {
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

    public static final class Builder extends Request.Builder<GetAppDeploymentRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppDeploymentRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>93fdd228-*****-ed2ae98de18d</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public GetAppDeploymentRequest build() {
            return new GetAppDeploymentRequest(this);
        } 

    } 

}
