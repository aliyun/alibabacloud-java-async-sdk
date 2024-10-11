// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteGatewaySlbRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewaySlbRequest</p>
 */
public class DeleteGatewaySlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteSlb")
    private Boolean deleteSlb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbId")
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to delete the SLB instance purchased for the gateway when you delete the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteSlb(Boolean deleteSlb) {
            this.putQueryParameter("DeleteSlb", deleteSlb);
            this.deleteSlb = deleteSlb;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-c9bc5afd61014165bd58f621b491****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The ID of the association record.</p>
         * 
         * <strong>example:</strong>
         * <p>395</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the SLB instance that needs to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6duug6s13x4abc8****</p>
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
