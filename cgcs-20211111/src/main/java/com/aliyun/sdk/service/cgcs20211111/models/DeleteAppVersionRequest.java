// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppVersionRequest</p>
 */
public class DeleteAppVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    private DeleteAppVersionRequest(Builder builder) {
        super(builder);
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppVersionRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAppVersionRequest, Builder> {
        private String appVersionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppVersionRequest request) {
            super(request);
            this.appVersionId = request.appVersionId;
        } 

        /**
         * AppVersionId.
         */
        public Builder appVersionId(String appVersionId) {
            this.putBodyParameter("AppVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        @Override
        public DeleteAppVersionRequest build() {
            return new DeleteAppVersionRequest(this);
        } 

    } 

}
