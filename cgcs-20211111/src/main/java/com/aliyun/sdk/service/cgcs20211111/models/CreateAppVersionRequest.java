// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateAppVersionRequest</p>
 */
public class CreateAppVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionName;

    private CreateAppVersionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appVersionName = builder.appVersionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppVersionRequest create() {
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
     * @return appVersionName
     */
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public static final class Builder extends Request.Builder<CreateAppVersionRequest, Builder> {
        private String appId; 
        private String appVersionName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppVersionRequest request) {
            super(request);
            this.appId = request.appId;
            this.appVersionName = request.appVersionName;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppVersionName.
         */
        public Builder appVersionName(String appVersionName) {
            this.putBodyParameter("AppVersionName", appVersionName);
            this.appVersionName = appVersionName;
            return this;
        }

        @Override
        public CreateAppVersionRequest build() {
            return new CreateAppVersionRequest(this);
        } 

    } 

}
