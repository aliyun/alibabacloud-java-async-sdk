// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateGatewayRouteHeaderOpRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteHeaderOpRequest</p>
 */
public class UpdateGatewayRouteHeaderOpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HeaderOpJSON")
    private String headerOpJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private UpdateGatewayRouteHeaderOpRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.headerOpJSON = builder.headerOpJSON;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteHeaderOpRequest create() {
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
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return headerOpJSON
     */
    public String getHeaderOpJSON() {
        return this.headerOpJSON;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteHeaderOpRequest, Builder> {
        private String acceptLanguage; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private String headerOpJSON; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteHeaderOpRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.headerOpJSON = request.headerOpJSON;
            this.id = request.id;
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
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>324</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-6bdc977deda44bf589c49d063b4c2d1d</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The description of user header settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:&quot;on&quot;,&quot;headerOpItems&quot;:[{&quot;directionType&quot;:&quot;Request&quot;,&quot;opType&quot;:&quot;Update&quot;,&quot;key&quot;:&quot;hosts&quot;,&quot;value&quot;:&quot;test.com&quot;}]}</p>
         */
        public Builder headerOpJSON(String headerOpJSON) {
            this.putQueryParameter("HeaderOpJSON", headerOpJSON);
            this.headerOpJSON = headerOpJSON;
            return this;
        }

        /**
         * <p>The ID of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>411</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateGatewayRouteHeaderOpRequest build() {
            return new UpdateGatewayRouteHeaderOpRequest(this);
        } 

    } 

}
