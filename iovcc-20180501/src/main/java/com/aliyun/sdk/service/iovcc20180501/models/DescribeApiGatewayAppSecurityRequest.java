// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGatewayAppSecurityRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiGatewayAppSecurityRequest</p>
 */
public class DescribeApiGatewayAppSecurityRequest extends Request {
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

    private DescribeApiGatewayAppSecurityRequest(Builder builder) {
        super(builder);
        this.gatewayAppId = builder.gatewayAppId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiGatewayAppSecurityRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeApiGatewayAppSecurityRequest, Builder> {
        private String gatewayAppId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiGatewayAppSecurityRequest response) {
            super(response);
            this.gatewayAppId = response.gatewayAppId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
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

        @Override
        public DescribeApiGatewayAppSecurityRequest build() {
            return new DescribeApiGatewayAppSecurityRequest(this);
        } 

    } 

}
