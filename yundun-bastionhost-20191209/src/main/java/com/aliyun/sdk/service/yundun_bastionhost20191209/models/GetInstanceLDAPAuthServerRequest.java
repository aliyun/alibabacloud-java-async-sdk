// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceLDAPAuthServerRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceLDAPAuthServerRequest</p>
 */
public class GetInstanceLDAPAuthServerRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetInstanceLDAPAuthServerRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceLDAPAuthServerRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetInstanceLDAPAuthServerRequest, Builder> {
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceLDAPAuthServerRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * Indicates whether passwords are required. Valid values:
         * <p>
         * 
         * *   **true**: required
         * *   **false**: not required
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **GetInstanceLDAPAuthServer**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetInstanceLDAPAuthServerRequest build() {
            return new GetInstanceLDAPAuthServerRequest(this);
        } 

    } 

}
