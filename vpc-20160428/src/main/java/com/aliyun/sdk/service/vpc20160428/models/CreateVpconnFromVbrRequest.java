// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpconnFromVbrRequest} extends {@link RequestModel}
 *
 * <p>CreateVpconnFromVbrRequest</p>
 */
public class CreateVpconnFromVbrRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OrderMode")
    private String orderMode;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Token")
    private String token;

    @Query
    @NameInMap("VbrId")
    @Validation(required = true)
    private String vbrId;

    private CreateVpconnFromVbrRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.orderMode = builder.orderMode;
        this.regionId = builder.regionId;
        this.token = builder.token;
        this.vbrId = builder.vbrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpconnFromVbrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return orderMode
     */
    public String getOrderMode() {
        return this.orderMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vbrId
     */
    public String getVbrId() {
        return this.vbrId;
    }

    public static final class Builder extends Request.Builder<CreateVpconnFromVbrRequest, Builder> {
        private Boolean dryRun; 
        private String orderMode; 
        private String regionId; 
        private String token; 
        private String vbrId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpconnFromVbrRequest response) {
            super(response);
            this.dryRun = response.dryRun;
            this.orderMode = response.orderMode;
            this.regionId = response.regionId;
            this.token = response.token;
            this.vbrId = response.vbrId;
        } 

        /**
         * DryRun
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * vpconn的支付方
         */
        public Builder orderMode(String orderMode) {
            this.putQueryParameter("OrderMode", orderMode);
            this.orderMode = orderMode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 幂等Token
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * 跨帐号的VBR
         */
        public Builder vbrId(String vbrId) {
            this.putQueryParameter("VbrId", vbrId);
            this.vbrId = vbrId;
            return this;
        }

        @Override
        public CreateVpconnFromVbrRequest build() {
            return new CreateVpconnFromVbrRequest(this);
        } 

    } 

}
