// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCommonBandwidthPackageAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCommonBandwidthPackageAttributeResponseBody</p>
 */
public class ModifyCommonBandwidthPackageAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyCommonBandwidthPackageAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCommonBandwidthPackageAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B450CAD8-50BC-4506-ADA7-35C6CE63E96B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCommonBandwidthPackageAttributeResponseBody build() {
            return new ModifyCommonBandwidthPackageAttributeResponseBody(this);
        } 

    } 

}
