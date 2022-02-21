// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApiGatewayAppStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateApiGatewayAppStatusRequest</p>
 */
public class UpdateApiGatewayAppStatusRequest extends Request {
    @Query
    @NameInMap("GatewayAppId")
    @Validation(required = true)
    private String gatewayAppId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Integer status;

    private UpdateApiGatewayAppStatusRequest(Builder builder) {
        super(builder);
        this.gatewayAppId = builder.gatewayAppId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiGatewayAppStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayAppId
     */
    public String getGatewayAppId() {
        return this.gatewayAppId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateApiGatewayAppStatusRequest, Builder> {
        private String gatewayAppId; 
        private String projectId; 
        private String regionId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApiGatewayAppStatusRequest response) {
            super(response);
            this.gatewayAppId = response.gatewayAppId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.status = response.status;
        } 

        /**
         * GatewayAppId.
         */
        public Builder gatewayAppId(String gatewayAppId) {
            this.putQueryParameter("GatewayAppId", gatewayAppId);
            this.gatewayAppId = gatewayAppId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateApiGatewayAppStatusRequest build() {
            return new UpdateApiGatewayAppStatusRequest(this);
        } 

    } 

}
