// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateAppInfoRequest</p>
 */
public class CreateAppInfoRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Description")
    private String description;

    private CreateAppInfoRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.description = builder.description;
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

    public static final class Builder extends Request.Builder<CreateAppInfoRequest, Builder> {
        private String appName; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppInfoRequest request) {
            super(request);
            this.appName = request.appName;
            this.description = request.description;
        } 

        /**
         * Creates an application.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ## Common errors
         * <p>
         * 
         * The following table describes the common errors that this operation can return. 
         * 
         * | Error code | Error message | HTTP status code | Description |
         * | ---------- | ------------- | ---------------- | ----------- |
         * | OperationDenied.NotOpenAppService | The app service is not open. | 403 | The error message returned because the multi-application service has not been activated. |
         * | Forbidden.OperateApp | User not authorized to operate app. | 403 | The error message returned because you are not authorized to manage the application. |
         * | AlreadyExist.AppName | The specified AppName has already exist. | 409 | The error message returned because the name of the application already exists. |
         * | LimitExceeded.AppCount | App Count has exceeded 10. | 400 | The error message returned because the number of applications that can be created exceeds the upper limit. |
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateAppInfoRequest build() {
            return new CreateAppInfoRequest(this);
        } 

    } 

}
