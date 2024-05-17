// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetPrivateAccessApplicationRequest</p>
 */
public class GetPrivateAccessApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    private GetPrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrivateAccessApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    public static final class Builder extends Request.Builder<GetPrivateAccessApplicationRequest, Builder> {
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(GetPrivateAccessApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public GetPrivateAccessApplicationRequest build() {
            return new GetPrivateAccessApplicationRequest(this);
        } 

    } 

}
