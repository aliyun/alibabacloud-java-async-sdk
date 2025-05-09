// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeUniSupportRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniSupportRegionResponseBody</p>
 */
public class DescribeUniSupportRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UniSupportRegion")
    private java.util.List<String> uniSupportRegion;

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
    public java.util.List<String> getUniSupportRegion() {
        return this.uniSupportRegion;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> uniSupportRegion; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D0760****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array consisting of the region that is supported by anti-ransomware for databases.</p>
         */
        public Builder uniSupportRegion(java.util.List<String> uniSupportRegion) {
            this.uniSupportRegion = uniSupportRegion;
            return this;
        }

        public DescribeUniSupportRegionResponseBody build() {
            return new DescribeUniSupportRegionResponseBody(this);
        } 

    } 

}
