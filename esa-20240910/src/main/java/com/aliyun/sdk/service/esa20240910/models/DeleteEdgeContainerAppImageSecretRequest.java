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
 * {@link DeleteEdgeContainerAppImageSecretRequest} extends {@link RequestModel}
 *
 * <p>DeleteEdgeContainerAppImageSecretRequest</p>
 */
public class DeleteEdgeContainerAppImageSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DeleteEdgeContainerAppImageSecretRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeContainerAppImageSecretRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteEdgeContainerAppImageSecretRequest, Builder> {
        private String appId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEdgeContainerAppImageSecretRequest request) {
            super(request);
            this.appId = request.appId;
            this.name = request.name;
        } 

        /**
         * <p>Application ID, which can be obtained using the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> API.</p>
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
         * <p>Name of the image secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-123*****</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteEdgeContainerAppImageSecretRequest build() {
            return new DeleteEdgeContainerAppImageSecretRequest(this);
        } 

    } 

}
