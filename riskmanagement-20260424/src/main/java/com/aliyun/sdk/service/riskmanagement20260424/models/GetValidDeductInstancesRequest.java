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
 * {@link GetValidDeductInstancesRequest} extends {@link RequestModel}
 *
 * <p>GetValidDeductInstancesRequest</p>
 */
public class GetValidDeductInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private GetValidDeductInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetValidDeductInstancesRequest create() {
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

    public static final class Builder extends Request.Builder<GetValidDeductInstancesRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(GetValidDeductInstancesRequest request) {
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
        public GetValidDeductInstancesRequest build() {
            return new GetValidDeductInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetValidDeductInstancesRequest} extends {@link TeaModel}
     *
     * <p>GetValidDeductInstancesRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Modules")
        private String modules;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private SdkRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.modules = builder.modules;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkRequest create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modules
         */
        public String getModules() {
            return this.modules;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceId; 
            private String modules; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.instanceId = model.instanceId;
                this.modules = model.modules;
                this.status = model.status;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Modules.
             */
            public Builder modules(String modules) {
                this.modules = modules;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
