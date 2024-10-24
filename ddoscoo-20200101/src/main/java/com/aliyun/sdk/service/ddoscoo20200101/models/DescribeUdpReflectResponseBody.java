// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUdpReflectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUdpReflectResponseBody</p>
 */
public class DescribeUdpReflectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UdpSports")
    private java.util.List < String > udpSports;

    private DescribeUdpReflectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.udpSports = builder.udpSports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUdpReflectResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return udpSports
     */
    public java.util.List < String > getUdpSports() {
        return this.udpSports;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > udpSports; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F97A8766-FB4D-411A-9CD5-2CFF701B592F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array consisting of the source ports of the UDP traffic that are filtered out by the filtering policies for UDP reflection attacks.</p>
         */
        public Builder udpSports(java.util.List < String > udpSports) {
            this.udpSports = udpSports;
            return this;
        }

        public DescribeUdpReflectResponseBody build() {
            return new DescribeUdpReflectResponseBody(this);
        } 

    } 

}
