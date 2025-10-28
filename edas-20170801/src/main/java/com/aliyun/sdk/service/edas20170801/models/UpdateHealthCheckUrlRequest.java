// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateHealthCheckUrlRequest} extends {@link RequestModel}
 *
 * <p>UpdateHealthCheckUrlRequest</p>
 */
public class UpdateHealthCheckUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("hcURL")
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
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c627c157-560d-43ff-***************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The health check URL of the application. The URL must start with <code>http://</code>, and can be up to 255 characters in length. Example: <code>http://127.0.0.1:8080/_ehc.html</code>. If this parameter is not specified, the health check URL of the application is not changed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8080/_ehc.html">http://127.0.0.1:8080/_ehc.html</a></p>
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
