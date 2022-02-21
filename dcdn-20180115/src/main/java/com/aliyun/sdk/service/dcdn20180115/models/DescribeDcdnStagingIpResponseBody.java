// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnStagingIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnStagingIpResponseBody</p>
 */
public class DescribeDcdnStagingIpResponseBody extends TeaModel {
    @NameInMap("IPV4s")
    private IPV4s IPV4s;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnStagingIpResponseBody(Builder builder) {
        this.IPV4s = builder.IPV4s;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnStagingIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return IPV4s
     */
    public IPV4s getIPV4s() {
        return this.IPV4s;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IPV4s IPV4s; 
        private String requestId; 

        /**
         * IPV4s.
         */
        public Builder IPV4s(IPV4s IPV4s) {
            this.IPV4s = IPV4s;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnStagingIpResponseBody build() {
            return new DescribeDcdnStagingIpResponseBody(this);
        } 

    } 

    public static class IPV4s extends TeaModel {
        @NameInMap("IPV4")
        private java.util.List < String > IPV4;

        private IPV4s(Builder builder) {
            this.IPV4 = builder.IPV4;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPV4s create() {
            return builder().build();
        }

        /**
         * @return IPV4
         */
        public java.util.List < String > getIPV4() {
            return this.IPV4;
        }

        public static final class Builder {
            private java.util.List < String > IPV4; 

            /**
             * IPV4.
             */
            public Builder IPV4(java.util.List < String > IPV4) {
                this.IPV4 = IPV4;
                return this;
            }

            public IPV4s build() {
                return new IPV4s(this);
            } 

        } 

    }
}
