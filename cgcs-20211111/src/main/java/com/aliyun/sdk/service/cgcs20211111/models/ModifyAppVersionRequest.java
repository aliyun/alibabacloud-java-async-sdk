// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppVersionRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppVersionRequest</p>
 */
public class ModifyAppVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionName;

    private ModifyAppVersionRequest(Builder builder) {
        super(builder);
        this.appVersionId = builder.appVersionId;
        this.appVersionName = builder.appVersionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return appVersionName
     */
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public static final class Builder extends Request.Builder<ModifyAppVersionRequest, Builder> {
        private String appVersionId; 
        private String appVersionName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppVersionRequest request) {
            super(request);
            this.appVersionId = request.appVersionId;
            this.appVersionName = request.appVersionName;
        } 

        /**
         * AppVersionId.
         */
        public Builder appVersionId(String appVersionId) {
            this.putBodyParameter("AppVersionId", appVersionId);
            this.appVersionId = appVersionId;
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
        public ModifyAppVersionRequest build() {
            return new ModifyAppVersionRequest(this);
        } 

    } 

}
