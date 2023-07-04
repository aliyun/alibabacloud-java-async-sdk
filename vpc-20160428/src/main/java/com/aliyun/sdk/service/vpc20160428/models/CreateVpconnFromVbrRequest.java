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

        private Builder(CreateVpconnFromVbrRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.orderMode = request.orderMode;
            this.regionId = request.regionId;
            this.token = request.token;
            this.vbrId = request.vbrId;
        } 

        /**
         * The ID of the request.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder orderMode(String orderMode) {
            this.putQueryParameter("OrderMode", orderMode);
            this.orderMode = orderMode;
            return this;
        }

        /**
         * The ID of the shared Express Connect circuit.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The region ID of the shared Express Connect circuit.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * Specifies whether to only precheck the request. Valid values:
         * <p>
         * 
         * *   **true**: checks the API request. If the request passes the precheck, the operation is not performed. Check items include the request format, instance status, and whether the required parameters are specified. If the request fails the precheck, the system returns an error. If the request passes the precheck, the system returns the ID of the request.
         * *   **false** (default): sends the API request. If the request passes the precheck, the operation is performed.
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
