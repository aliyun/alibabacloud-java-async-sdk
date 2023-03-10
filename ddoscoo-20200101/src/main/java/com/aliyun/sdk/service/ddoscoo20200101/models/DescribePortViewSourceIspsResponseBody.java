// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortViewSourceIspsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortViewSourceIspsResponseBody</p>
 */
public class DescribePortViewSourceIspsResponseBody extends TeaModel {
    @NameInMap("Isps")
    private java.util.List < Isps> isps;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePortViewSourceIspsResponseBody(Builder builder) {
        this.isps = builder.isps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortViewSourceIspsResponseBody create() {
        return builder().build();
    }

    /**
     * @return isps
     */
    public java.util.List < Isps> getIsps() {
        return this.isps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Isps> isps; 
        private String requestId; 

        /**
         * An array that consists of the details of the ISP.
         */
        public Builder isps(java.util.List < Isps> isps) {
            this.isps = isps;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortViewSourceIspsResponseBody build() {
            return new DescribePortViewSourceIspsResponseBody(this);
        } 

    } 

    public static class Isps extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("IspId")
        private String ispId;

        private Isps(Builder builder) {
            this.count = builder.count;
            this.ispId = builder.ispId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Isps create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return ispId
         */
        public String getIspId() {
            return this.ispId;
        }

        public static final class Builder {
            private Long count; 
            private String ispId; 

            /**
             * The total number of requests that are sent from the ISP.
             * <p>
             * 
             * > This parameter does not indicate the accurate number of requests. You can use this parameter to calculate the proportion of requests from different ISPs.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The ID of the ISP. For more information, see the ISP codes table.
             */
            public Builder ispId(String ispId) {
                this.ispId = ispId;
                return this;
            }

            public Isps build() {
                return new Isps(this);
            } 

        } 

    }
}
