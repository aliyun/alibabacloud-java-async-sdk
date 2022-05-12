// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationDescriptionRequest</p>
 */
public class UpdateApplicationDescriptionRequest extends Request {
    @Query
    @NameInMap("AppDescription")
    @Validation(required = true)
    private String appDescription;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    private UpdateApplicationDescriptionRequest(Builder builder) {
        super(builder);
        this.appDescription = builder.appDescription;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appDescription
     */
    public String getAppDescription() {
        return this.appDescription;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationDescriptionRequest, Builder> {
        private String appDescription; 
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationDescriptionRequest request) {
            super(request);
            this.appDescription = request.appDescription;
            this.appId = request.appId;
        } 

        /**
         * AppDescription.
         */
        public Builder appDescription(String appDescription) {
            this.putQueryParameter("AppDescription", appDescription);
            this.appDescription = appDescription;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public UpdateApplicationDescriptionRequest build() {
            return new UpdateApplicationDescriptionRequest(this);
        } 

    } 

}
