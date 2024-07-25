// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>GetEnvironmentRequest</p>
 */
public class GetEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("environmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    private GetEnvironmentRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public static final class Builder extends Request.Builder<GetEnvironmentRequest, Builder> {
        private String environmentId; 

        private Builder() {
            super();
        } 

        private Builder(GetEnvironmentRequest request) {
            super(request);
            this.environmentId = request.environmentId;
        } 

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putPathParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        @Override
        public GetEnvironmentRequest build() {
            return new GetEnvironmentRequest(this);
        } 

    } 

}
