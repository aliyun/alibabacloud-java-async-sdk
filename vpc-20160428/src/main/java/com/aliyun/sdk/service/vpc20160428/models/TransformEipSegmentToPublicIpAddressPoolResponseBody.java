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
 * {@link TransformEipSegmentToPublicIpAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>TransformEipSegmentToPublicIpAddressPoolResponseBody</p>
 */
public class TransformEipSegmentToPublicIpAddressPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolId")
    private String publicIpAddressPoolId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private TransformEipSegmentToPublicIpAddressPoolResponseBody(Builder builder) {
        this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformEipSegmentToPublicIpAddressPoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return publicIpAddressPoolId
     */
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
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
        private String publicIpAddressPoolId; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * PublicIpAddressPoolId.
         */
        public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public TransformEipSegmentToPublicIpAddressPoolResponseBody build() {
            return new TransformEipSegmentToPublicIpAddressPoolResponseBody(this);
        } 

    } 

}
