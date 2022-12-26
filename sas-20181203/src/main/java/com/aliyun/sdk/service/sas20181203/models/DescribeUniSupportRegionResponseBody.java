// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniSupportRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniSupportRegionResponseBody</p>
 */
public class DescribeUniSupportRegionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UniSupportRegion")
    private java.util.List < String > uniSupportRegion;

    private DescribeUniSupportRegionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uniSupportRegion = builder.uniSupportRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniSupportRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uniSupportRegion
     */
    public java.util.List < String > getUniSupportRegion() {
        return this.uniSupportRegion;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > uniSupportRegion; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UniSupportRegion.
         */
        public Builder uniSupportRegion(java.util.List < String > uniSupportRegion) {
            this.uniSupportRegion = uniSupportRegion;
            return this;
        }

        public DescribeUniSupportRegionResponseBody build() {
            return new DescribeUniSupportRegionResponseBody(this);
        } 

    } 

}
