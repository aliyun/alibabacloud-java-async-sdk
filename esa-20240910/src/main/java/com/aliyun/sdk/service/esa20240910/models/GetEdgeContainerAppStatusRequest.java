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
 * {@link GetEdgeContainerAppStatusRequest} extends {@link RequestModel}
 *
 * <p>GetEdgeContainerAppStatusRequest</p>
 */
public class GetEdgeContainerAppStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 20)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishEnv")
    private String publishEnv;

    private GetEdgeContainerAppStatusRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.publishEnv = builder.publishEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerAppStatusRequest create() {
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

    /**
     * @return publishEnv
     */
    public String getPublishEnv() {
        return this.publishEnv;
    }

    public static final class Builder extends Request.Builder<GetEdgeContainerAppStatusRequest, Builder> {
        private String appId; 
        private String publishEnv; 

        private Builder() {
            super();
        } 

        private Builder(GetEdgeContainerAppStatusRequest request) {
            super(request);
            this.appId = request.appId;
            this.publishEnv = request.publishEnv;
        } 

        /**
         * <p>The application ID. You can call <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> to obtain the application ID. Before calling this operation, you must first activate the edge container service by calling OpenEdgeContainer, and then confirm that an available application exists by calling ListEdgeContainerApps or create an application by calling CreateEdgeContainerApp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The publishing environment. Valid values: prod and staging.</p>
         * 
         * <strong>example:</strong>
         * <p>staging</p>
         */
        public Builder publishEnv(String publishEnv) {
            this.putQueryParameter("PublishEnv", publishEnv);
            this.publishEnv = publishEnv;
            return this;
        }

        @Override
        public GetEdgeContainerAppStatusRequest build() {
            return new GetEdgeContainerAppStatusRequest(this);
        } 

    } 

}
