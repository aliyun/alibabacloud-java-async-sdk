// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeletePrivateAccessApplicationRequest</p>
 */
public class DeletePrivateAccessApplicationRequest extends Request {
    @Body
    @NameInMap("ApplicationId")
    @Validation(required = true)
    private String applicationId;

    private DeletePrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrivateAccessApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePrivateAccessApplicationRequest, Builder> {
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrivateAccessApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public DeletePrivateAccessApplicationRequest build() {
            return new DeletePrivateAccessApplicationRequest(this);
        } 

    } 

}
