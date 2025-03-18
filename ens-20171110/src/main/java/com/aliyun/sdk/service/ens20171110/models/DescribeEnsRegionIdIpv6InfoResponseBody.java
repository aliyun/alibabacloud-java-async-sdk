// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsRegionIdIpv6InfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionIdIpv6InfoResponseBody</p>
 */
public class DescribeEnsRegionIdIpv6InfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportIpv6Info")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEnsRegionIdIpv6InfoResponseBody model) {
            this.requestId = model.requestId;
            this.supportIpv6Info = model.supportIpv6Info;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3703C4AC-9396-458C-8F25-1D701334D309</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>IPv6 support information.</p>
         */
        public Builder supportIpv6Info(SupportIpv6Info supportIpv6Info) {
            this.supportIpv6Info = supportIpv6Info;
            return this;
        }

        public DescribeEnsRegionIdIpv6InfoResponseBody build() {
            return new DescribeEnsRegionIdIpv6InfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsRegionIdIpv6InfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsRegionIdIpv6InfoResponseBody</p>
     */
    public static class SupportIpv6Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("SupportIpv6")
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

            private Builder() {
            } 

            private Builder(SupportIpv6Info model) {
                this.ensRegionId = model.ensRegionId;
                this.supportIpv6 = model.supportIpv6;
            } 

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-xxxx-4</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>Specifies whether IPv6 is supported. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
