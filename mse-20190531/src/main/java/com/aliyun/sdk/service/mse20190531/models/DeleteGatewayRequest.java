// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayRequest</p>
 */
public class DeleteGatewayRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("DeleteSlb")
    private Boolean deleteSlb;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    private DeleteGatewayRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.deleteSlb = builder.deleteSlb;
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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

    public static final class Builder extends Request.Builder<DeleteGatewayRequest, Builder> {
        private String acceptLanguage; 
        private Boolean deleteSlb; 
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.deleteSlb = request.deleteSlb;
            this.gatewayUniqueId = request.gatewayUniqueId;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Specifies whether to delete the SLB instance purchased for the gateway when you delete the gateway.
         */
        public Builder deleteSlb(Boolean deleteSlb) {
            this.putQueryParameter("DeleteSlb", deleteSlb);
            this.deleteSlb = deleteSlb;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        @Override
        public DeleteGatewayRequest build() {
            return new DeleteGatewayRequest(this);
        } 

    } 

}
