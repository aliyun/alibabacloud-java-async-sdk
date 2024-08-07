// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppInfoRequest</p>
 */
public class UpdateAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateAppInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.description = builder.description;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppInfoRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateAppInfoRequest, Builder> {
        private String appId; 
        private String appName; 
        private String description; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppInfoRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.description = request.description;
            this.status = request.status;
        } 

        /**
         * The ID of the application.
         * <p>
         * 
         * *   Default value: **app-1000000**.
         * *   For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the application.
         * <p>
         * 
         * *   The name can contain up to 128 characters in length, including Chinese letters, digits, and periods (.), dash (-), and at character (@).
         * *   The name can contain only UTF-8 characters.
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
         * *   The description can contain only UTF-8 characters.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The status of the application. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **Disable**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateAppInfoRequest build() {
            return new UpdateAppInfoRequest(this);
        } 

    } 

}
