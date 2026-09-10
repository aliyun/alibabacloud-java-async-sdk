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
 * {@link DescribeServiceLinkedRoleStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceLinkedRoleStatusRequest</p>
 */
public class DescribeServiceLinkedRoleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private DescribeServiceLinkedRoleStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLinkedRoleStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeServiceLinkedRoleStatusRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceLinkedRoleStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
        } 

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Security Center SDK request.</p>
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public DescribeServiceLinkedRoleStatusRequest build() {
            return new DescribeServiceLinkedRoleStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceLinkedRoleStatusRequest} extends {@link TeaModel}
     *
     * <p>DescribeServiceLinkedRoleStatusRequest</p>
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
             * <p>The service-linked role. Default value: <strong>AliyunServiceRoleForSas</strong>. Valid values:</p>
             * <ul>
             * <li><strong>AliyunServiceRoleForSas</strong>: the service-linked role for Security Center (sas). Security Center uses this role to access your resources in other Alibaba Cloud services.</li>
             * <li><strong>AliyunServiceRoleForSasCspm</strong>: the service-linked role for Security Center - CSPM (sas-cspm). sas-cspm uses this role to access your resources in other Alibaba Cloud services.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AliyunServiceRoleForSas</p>
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
