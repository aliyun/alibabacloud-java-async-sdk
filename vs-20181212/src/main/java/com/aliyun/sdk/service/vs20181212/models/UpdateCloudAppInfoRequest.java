// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudAppInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudAppInfoRequest</p>
 */
public class UpdateCloudAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255)
    private String description;

    private UpdateCloudAppInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudAppInfoRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateCloudAppInfoRequest, Builder> {
        private String appId; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudAppInfoRequest request) {
            super(request);
            this.appId = request.appId;
            this.description = request.description;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
        public UpdateCloudAppInfoRequest build() {
            return new UpdateCloudAppInfoRequest(this);
        } 

    } 

}
