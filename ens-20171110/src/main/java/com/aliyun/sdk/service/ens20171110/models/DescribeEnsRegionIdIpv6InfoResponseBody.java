// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionIdIpv6InfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionIdIpv6InfoResponseBody</p>
 */
public class DescribeEnsRegionIdIpv6InfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportIpv6Info")
    private SupportIpv6Info supportIpv6Info;

    private DescribeEnsRegionIdIpv6InfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportIpv6Info = builder.supportIpv6Info;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRegionIdIpv6InfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportIpv6Info
     */
    public SupportIpv6Info getSupportIpv6Info() {
        return this.supportIpv6Info;
    }

    public static final class Builder {
        private String requestId; 
        private SupportIpv6Info supportIpv6Info; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * IPv6 support information.
         */
        public Builder supportIpv6Info(SupportIpv6Info supportIpv6Info) {
            this.supportIpv6Info = supportIpv6Info;
            return this;
        }

        public DescribeEnsRegionIdIpv6InfoResponseBody build() {
            return new DescribeEnsRegionIdIpv6InfoResponseBody(this);
        } 

    } 

    public static class SupportIpv6Info extends TeaModel {
        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("SupportIpv6")
        private Boolean supportIpv6;

        private SupportIpv6Info(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.supportIpv6 = builder.supportIpv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportIpv6Info create() {
            return builder().build();
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return supportIpv6
         */
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

        public static final class Builder {
            private String ensRegionId; 
            private Boolean supportIpv6; 

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * Specifies whether IPv6 is supported. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder supportIpv6(Boolean supportIpv6) {
                this.supportIpv6 = supportIpv6;
                return this;
            }

            public SupportIpv6Info build() {
                return new SupportIpv6Info(this);
            } 

        } 

    }
}
