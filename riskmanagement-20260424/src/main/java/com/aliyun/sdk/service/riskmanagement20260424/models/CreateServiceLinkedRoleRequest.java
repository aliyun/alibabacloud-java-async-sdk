// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceLinkedRoleRequest</p>
 */
public class CreateServiceLinkedRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private CreateServiceLinkedRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleRequest create() {
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
     * @return sdkRequest
     */
    public SdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static final class Builder extends Request.Builder<CreateServiceLinkedRoleRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceLinkedRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
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
         * SdkRequest.
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public CreateServiceLinkedRoleRequest build() {
            return new CreateServiceLinkedRoleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceLinkedRoleRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceLinkedRoleRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceLinkedRole")
        private String serviceLinkedRole;

        private SdkRequest(Builder builder) {
            this.serviceLinkedRole = builder.serviceLinkedRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkRequest create() {
            return builder().build();
        }

        /**
         * @return serviceLinkedRole
         */
        public String getServiceLinkedRole() {
            return this.serviceLinkedRole;
        }

        public static final class Builder {
            private String serviceLinkedRole; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.serviceLinkedRole = model.serviceLinkedRole;
            } 

            /**
             * ServiceLinkedRole.
             */
            public Builder serviceLinkedRole(String serviceLinkedRole) {
                this.serviceLinkedRole = serviceLinkedRole;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
