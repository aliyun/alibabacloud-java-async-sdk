// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppRequest</p>
 */
public class UpdateAppRequest extends Request {
    @Path
    @NameInMap("appName")
    @Validation(required = true)
    private String appName;

    @Body
    @NameInMap("description")
    private String description;

    private UpdateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateAppRequest, Builder> {
        private String appName; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.description = request.description;
        } 

        /**
         * 实例 ID。
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * 应用备注
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateAppRequest build() {
            return new UpdateAppRequest(this);
        } 

    } 

}
