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
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("DeleteSlb")
    private Boolean deleteSlb;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("SlbId")
    private String slbId;

    private DeleteGatewaySlbRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.deleteSlb = builder.deleteSlb;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.slbId = builder.slbId;
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

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    public static final class Builder extends Request.Builder<DeleteGatewaySlbRequest, Builder> {
        private String acceptLanguage; 
        private Boolean deleteSlb; 
        private String gatewayUniqueId; 
        private String id; 
        private String slbId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewaySlbRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.deleteSlb = request.deleteSlb;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.slbId = request.slbId;
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

        /**
         * The ID of the associated record.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * SlbId.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        @Override
        public DeleteGatewaySlbRequest build() {
            return new DeleteGatewaySlbRequest(this);
        } 

    } 

}
