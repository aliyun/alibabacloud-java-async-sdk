// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConfigMapRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigMapRequest</p>
 */
public class DeleteConfigMapRequest extends Request {
    @Query
    @NameInMap("ConfigMapId")
    @Validation(required = true)
    private Long configMapId;

    private DeleteConfigMapRequest(Builder builder) {
        super(builder);
        this.configMapId = builder.configMapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigMapRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configMapId
     */
    public Long getConfigMapId() {
        return this.configMapId;
    }

    public static final class Builder extends Request.Builder<DeleteConfigMapRequest, Builder> {
        private Long configMapId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigMapRequest request) {
            super(request);
            this.configMapId = request.configMapId;
        } 

        /**
         * 1
         */
        public Builder configMapId(Long configMapId) {
            this.putQueryParameter("ConfigMapId", configMapId);
            this.configMapId = configMapId;
            return this;
        }

        @Override
        public DeleteConfigMapRequest build() {
            return new DeleteConfigMapRequest(this);
        } 

    } 

}
