// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link GetAlipayUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAlipayUrlRequest</p>
 */
public class GetAlipayUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app_id")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace_id")
    private String workspaceId;

    private GetAlipayUrlRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlipayUrlRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetAlipayUrlRequest, Builder> {
        private String appId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAlipayUrlRequest request) {
            super(request);
            this.appId = request.appId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * app_id.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("app_id", appId);
            this.appId = appId;
            return this;
        }

        /**
         * workspace_id.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspace_id", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetAlipayUrlRequest build() {
            return new GetAlipayUrlRequest(this);
        } 

    } 

}
