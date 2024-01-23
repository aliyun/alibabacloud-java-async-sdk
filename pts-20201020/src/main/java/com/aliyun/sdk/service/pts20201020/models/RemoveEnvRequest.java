// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEnvRequest} extends {@link RequestModel}
 *
 * <p>RemoveEnvRequest</p>
 */
public class RemoveEnvRequest extends Request {
    @Query
    @NameInMap("EnvId")
    @Validation(required = true, maxLength = 20)
    private String envId;

    private RemoveEnvRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveEnvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    public static final class Builder extends Request.Builder<RemoveEnvRequest, Builder> {
        private String envId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveEnvRequest request) {
            super(request);
            this.envId = request.envId;
        } 

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        @Override
        public RemoveEnvRequest build() {
            return new RemoveEnvRequest(this);
        } 

    } 

}
