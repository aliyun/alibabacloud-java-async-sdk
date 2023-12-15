// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrganizationUserCertsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOrganizationUserCertsRequest</p>
 */
public class DescribeOrganizationUserCertsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private DescribeOrganizationUserCertsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.organizationId = builder.organizationId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrganizationUserCertsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<DescribeOrganizationUserCertsRequest, Builder> {
        private String regionId; 
        private String organizationId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOrganizationUserCertsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.organizationId = request.organizationId;
            this.username = request.username;
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
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public DescribeOrganizationUserCertsRequest build() {
            return new DescribeOrganizationUserCertsRequest(this);
        } 

    } 

}
