// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateCommonBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCommonBandwidthPackageResponseBody</p>
 */
public class CreateCommonBandwidthPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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
         * <p>The ID of the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1vevu8h3ieh****</p>
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FF39F653-033E-4CD9-9EDF-3CCA5A71FBC3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazdjdhd****</p>
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
