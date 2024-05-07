// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityGroupRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityGroupRuleRequest</p>
 */
public class DeleteSecurityGroupRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CascadingDelete")
    private Boolean cascadingDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private DeleteSecurityGroupRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.cascadingDelete = builder.cascadingDelete;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityGroupRuleRequest create() {
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
     * @return cascadingDelete
     */
    public Boolean getCascadingDelete() {
        return this.cascadingDelete;
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
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityGroupRuleRequest, Builder> {
        private String acceptLanguage; 
        private Boolean cascadingDelete; 
        private String gatewayUniqueId; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityGroupRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.cascadingDelete = request.cascadingDelete;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
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
         * CascadingDelete.
         */
        public Builder cascadingDelete(Boolean cascadingDelete) {
            this.putQueryParameter("CascadingDelete", cascadingDelete);
            this.cascadingDelete = cascadingDelete;
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
         * The destination ID.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteSecurityGroupRuleRequest build() {
            return new DeleteSecurityGroupRuleRequest(this);
        } 

    } 

}
