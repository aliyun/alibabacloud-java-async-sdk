// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitAppFailOverRequest} extends {@link RequestModel}
 *
 * <p>InitAppFailOverRequest</p>
 */
public class InitAppFailOverRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    private InitAppFailOverRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitAppFailOverRequest create() {
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

    public static final class Builder extends Request.Builder<InitAppFailOverRequest, Builder> {
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(InitAppFailOverRequest request) {
            super(request);
            this.applicationId = request.applicationId;
        } 

        /**
         * The application ID.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public InitAppFailOverRequest build() {
            return new InitAppFailOverRequest(this);
        } 

    } 

}
