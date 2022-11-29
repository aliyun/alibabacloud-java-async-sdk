// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReleaseRequest} extends {@link RequestModel}
 *
 * <p>CreateReleaseRequest</p>
 */
public class CreateReleaseRequest extends Request {
    @Path
    @NameInMap("appName")
    private String appName;

    @Query
    @NameInMap("description")
    private String description;

    private CreateReleaseRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReleaseRequest create() {
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

    public static final class Builder extends Request.Builder<CreateReleaseRequest, Builder> {
        private String appName; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateReleaseRequest request) {
            super(request);
            this.appName = request.appName;
            this.description = request.description;
        } 

        /**
         * 应用名称
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateReleaseRequest build() {
            return new CreateReleaseRequest(this);
        } 

    } 

}
