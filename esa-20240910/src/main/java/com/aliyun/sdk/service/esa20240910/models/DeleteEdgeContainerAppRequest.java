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
 * {@link DeleteEdgeContainerAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteEdgeContainerAppRequest</p>
 */
public class DeleteEdgeContainerAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private DeleteEdgeContainerAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeContainerAppRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEdgeContainerAppRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEdgeContainerAppRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>The application ID, which can be obtained by calling the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1232321454***</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DeleteEdgeContainerAppRequest build() {
            return new DeleteEdgeContainerAppRequest(this);
        } 

    } 

}
