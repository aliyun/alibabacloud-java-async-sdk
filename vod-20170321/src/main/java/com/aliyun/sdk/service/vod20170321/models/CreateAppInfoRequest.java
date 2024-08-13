// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateAppInfoRequest</p>
 */
public class CreateAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateAppInfoRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.description = builder.description;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateAppInfoRequest, Builder> {
        private String appName; 
        private String description; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppInfoRequest request) {
            super(request);
            this.appName = request.appName;
            this.description = request.description;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The name of the application. The application name must be unique.
         * <p>
         * 
         * *   The name can contain letters, digits, periods (.), hyphens (-), and at signs (@). The name can be up to 128 characters in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The description of the application.
         * <p>
         * 
         * *   The description can contain up to 512 characters in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateAppInfoRequest build() {
            return new CreateAppInfoRequest(this);
        } 

    } 

}
