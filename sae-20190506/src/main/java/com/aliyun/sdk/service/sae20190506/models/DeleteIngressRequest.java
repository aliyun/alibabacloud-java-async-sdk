// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIngressRequest} extends {@link RequestModel}
 *
 * <p>DeleteIngressRequest</p>
 */
public class DeleteIngressRequest extends Request {
    @Query
    @NameInMap("IngressId")
    @Validation(required = true)
    private Long ingressId;

    private DeleteIngressRequest(Builder builder) {
        super(builder);
        this.ingressId = builder.ingressId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIngressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ingressId
     */
    public Long getIngressId() {
        return this.ingressId;
    }

    public static final class Builder extends Request.Builder<DeleteIngressRequest, Builder> {
        private Long ingressId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIngressRequest response) {
            super(response);
            this.ingressId = response.ingressId;
        } 

        /**
         * IngressId.
         */
        public Builder ingressId(Long ingressId) {
            this.putQueryParameter("IngressId", ingressId);
            this.ingressId = ingressId;
            return this;
        }

        @Override
        public DeleteIngressRequest build() {
            return new DeleteIngressRequest(this);
        } 

    } 

}
