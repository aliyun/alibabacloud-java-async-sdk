// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommonBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCommonBandwidthPackageResponseBody</p>
 */
public class CreateCommonBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateCommonBandwidthPackageResponseBody(Builder builder) {
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommonBandwidthPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private String bandwidthPackageId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * The ID of the EIP bandwidth plan.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public CreateCommonBandwidthPackageResponseBody build() {
            return new CreateCommonBandwidthPackageResponseBody(this);
        } 

    } 

}
