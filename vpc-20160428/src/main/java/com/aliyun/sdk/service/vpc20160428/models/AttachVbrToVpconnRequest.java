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
         * Specifies whether to precheck the request only. Valid values:
         * <p>
         * 
         * *   **true**: only prechecks the request but does not associate the VBR with the hosted connection. The system prechecks the request syntax, instance status, and whether the required parameters are specified. An error message is returned if the request fails to pass the precheck. If the request passes the precheck, the system returns the ID of the request.
         * *   **false** (default): sends the request. If the request passes the precheck, the VBR is associated with the hosted connection.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The region ID of the hosted connection.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * The client token must be unique among different requests. It can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * The ID of the VBR.
         */
        public Builder vbrId(String vbrId) {
            this.putQueryParameter("VbrId", vbrId);
            this.vbrId = vbrId;
            return this;
        }

        /**
         * The ID of the hosted connection.
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
