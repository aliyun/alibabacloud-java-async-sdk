// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceSourceRequest</p>
 */
public class DeleteServiceSourceRequest extends Request {
    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("SourceId")
    private Long sourceId;

    private DeleteServiceSourceRequest(Builder builder) {
        super(builder);
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceSourceRequest, Builder> {
        private String gatewayUniqueId; 
        private Long sourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceSourceRequest response) {
            super(response);
            this.gatewayUniqueId = response.gatewayUniqueId;
            this.sourceId = response.sourceId;
        } 

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(Long sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        @Override
        public DeleteServiceSourceRequest build() {
            return new DeleteServiceSourceRequest(this);
        } 

    } 

}
