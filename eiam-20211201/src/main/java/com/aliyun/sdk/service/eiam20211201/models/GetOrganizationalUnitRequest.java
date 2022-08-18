// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrganizationalUnitRequest} extends {@link RequestModel}
 *
 * <p>GetOrganizationalUnitRequest</p>
 */
public class GetOrganizationalUnitRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("OrganizationalUnitId")
    @Validation(required = true, maxLength = 64)
    private String organizationalUnitId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetOrganizationalUnitRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.organizationalUnitId = builder.organizationalUnitId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationalUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetOrganizationalUnitRequest, Builder> {
        private String instanceId; 
        private String organizationalUnitId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOrganizationalUnitRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.organizationalUnitId = request.organizationalUnitId;
            this.regionId = request.regionId;
        } 

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 机构Id
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.putQueryParameter("OrganizationalUnitId", organizationalUnitId);
            this.organizationalUnitId = organizationalUnitId;
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
        public GetOrganizationalUnitRequest build() {
            return new GetOrganizationalUnitRequest(this);
        } 

    } 

}
