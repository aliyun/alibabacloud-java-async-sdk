// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnL2IpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnL2IpsResponseBody</p>
 */
public class DescribeDcdnL2IpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Vips")
    private java.util.List < String > vips;

    private DescribeDcdnL2IpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vips = builder.vips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnL2IpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vips
     */
    public java.util.List < String > getVips() {
        return this.vips;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > vips; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The CIDR blocks of the POPs.
         */
        public Builder vips(java.util.List < String > vips) {
            this.vips = vips;
            return this;
        }

        public DescribeDcdnL2IpsResponseBody build() {
            return new DescribeDcdnL2IpsResponseBody(this);
        } 

    } 

}
