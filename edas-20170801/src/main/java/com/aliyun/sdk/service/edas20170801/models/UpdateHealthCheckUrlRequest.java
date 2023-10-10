// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHealthCheckUrlRequest} extends {@link RequestModel}
 *
 * <p>UpdateHealthCheckUrlRequest</p>
 */
public class UpdateHealthCheckUrlRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("hcURL")
    private String hcURL;

    private UpdateHealthCheckUrlRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.hcURL = builder.hcURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHealthCheckUrlRequest create() {
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
     * @return hcURL
     */
    public String getHcURL() {
        return this.hcURL;
    }

    public static final class Builder extends Request.Builder<UpdateHealthCheckUrlRequest, Builder> {
        private String appId; 
        private String hcURL; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHealthCheckUrlRequest request) {
            super(request);
            this.appId = request.appId;
            this.hcURL = request.hcURL;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The health check URL of the application. The URL must start with `http://`, and can be up to 255 characters in length. Example: `http://127.0.0.1:8080/_ehc.html`. If this parameter is not specified, the health check URL of the application is not changed.
         */
        public Builder hcURL(String hcURL) {
            this.putQueryParameter("hcURL", hcURL);
            this.hcURL = hcURL;
            return this;
        }

        @Override
        public UpdateHealthCheckUrlRequest build() {
            return new UpdateHealthCheckUrlRequest(this);
        } 

    } 

}
