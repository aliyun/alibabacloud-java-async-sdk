// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppVersionRequest} extends {@link RequestModel}
 *
 * <p>GetAppVersionRequest</p>
 */
public class GetAppVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    private GetAppVersionRequest(Builder builder) {
        super(builder);
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetAppVersionRequest, Builder> {
        private String appVersionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppVersionRequest request) {
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
        public GetAppVersionRequest build() {
            return new GetAppVersionRequest(this);
        } 

    } 

}
