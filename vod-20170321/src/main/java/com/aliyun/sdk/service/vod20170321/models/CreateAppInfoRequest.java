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
         * The name of the application, which must be unique. 
         * <p>
         * 
         * - The name can contain up to 128 characters in length, including Chinese letters, digits, and periods (.), dash (-), and at character (@).
         * - The name can contain only UTF-8 characters.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The description of the application. 
         * <p>
         * - The description can contain up to 512 characters in length.
         * - The description can contain only UTF-8 characters.
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
