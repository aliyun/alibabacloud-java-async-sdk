// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewaySlbRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewaySlbRequest</p>
 */
public class DeleteGatewaySlbRequest extends Request {
    @Query
    @NameInMap("DeleteSlb")
    private Boolean deleteSlb;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("Id")
    private String id;

    private DeleteGatewaySlbRequest(Builder builder) {
        super(builder);
        this.deleteSlb = builder.deleteSlb;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewaySlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteSlb
     */
    public Boolean getDeleteSlb() {
        return this.deleteSlb;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteGatewaySlbRequest, Builder> {
        private Boolean deleteSlb; 
        private String gatewayUniqueId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewaySlbRequest response) {
            super(response);
            this.deleteSlb = response.deleteSlb;
            this.gatewayUniqueId = response.gatewayUniqueId;
            this.id = response.id;
        } 

        /**
         * DeleteSlb.
         */
        public Builder deleteSlb(Boolean deleteSlb) {
            this.putQueryParameter("DeleteSlb", deleteSlb);
            this.deleteSlb = deleteSlb;
            return this;
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
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteGatewaySlbRequest build() {
            return new DeleteGatewaySlbRequest(this);
        } 

    } 

}
