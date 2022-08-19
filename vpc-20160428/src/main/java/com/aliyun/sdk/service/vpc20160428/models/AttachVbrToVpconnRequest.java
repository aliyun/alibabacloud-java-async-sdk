// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachVbrToVpconnRequest} extends {@link RequestModel}
 *
 * <p>AttachVbrToVpconnRequest</p>
 */
public class AttachVbrToVpconnRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

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

    @Query
    @NameInMap("VpconnId")
    @Validation(required = true)
    private String vpconnId;

    private AttachVbrToVpconnRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.token = builder.token;
        this.vbrId = builder.vbrId;
        this.vpconnId = builder.vpconnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachVbrToVpconnRequest create() {
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

    /**
     * @return vpconnId
     */
    public String getVpconnId() {
        return this.vpconnId;
    }

    public static final class Builder extends Request.Builder<AttachVbrToVpconnRequest, Builder> {
        private Boolean dryRun; 
        private String regionId; 
        private String token; 
        private String vbrId; 
        private String vpconnId; 

        private Builder() {
            super();
        } 

        private Builder(AttachVbrToVpconnRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.token = request.token;
            this.vbrId = request.vbrId;
            this.vpconnId = request.vpconnId;
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
         * 待迁移的vbr
         */
        public Builder vbrId(String vbrId) {
            this.putQueryParameter("VbrId", vbrId);
            this.vbrId = vbrId;
            return this;
        }

        /**
         * 迁移到目标vpconn
         */
        public Builder vpconnId(String vpconnId) {
            this.putQueryParameter("VpconnId", vpconnId);
            this.vpconnId = vpconnId;
            return this;
        }

        @Override
        public AttachVbrToVpconnRequest build() {
            return new AttachVbrToVpconnRequest(this);
        } 

    } 

}
