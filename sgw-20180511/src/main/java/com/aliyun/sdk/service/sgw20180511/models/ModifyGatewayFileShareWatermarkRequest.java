// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGatewayFileShareWatermarkRequest} extends {@link RequestModel}
 *
 * <p>ModifyGatewayFileShareWatermarkRequest</p>
 */
public class ModifyGatewayFileShareWatermarkRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    @Validation(required = true)
    private String indexId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Watermark")
    @Validation(required = true, maximum = 90, minimum = 40)
    private Integer watermark;

    private ModifyGatewayFileShareWatermarkRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
        this.securityToken = builder.securityToken;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGatewayFileShareWatermarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return watermark
     */
    public Integer getWatermark() {
        return this.watermark;
    }

    public static final class Builder extends Request.Builder<ModifyGatewayFileShareWatermarkRequest, Builder> {
        private String gatewayId; 
        private String indexId; 
        private String securityToken; 
        private Integer watermark; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGatewayFileShareWatermarkRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
            this.securityToken = request.securityToken;
            this.watermark = request.watermark;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Watermark.
         */
        public Builder watermark(Integer watermark) {
            this.putQueryParameter("Watermark", watermark);
            this.watermark = watermark;
            return this;
        }

        @Override
        public ModifyGatewayFileShareWatermarkRequest build() {
            return new ModifyGatewayFileShareWatermarkRequest(this);
        } 

    } 

}
