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

        private Builder(CreateAppInfoRequest response) {
            super(response);
            this.appName = response.appName;
            this.description = response.description;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Description.
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
