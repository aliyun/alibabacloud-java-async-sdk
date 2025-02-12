// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribePortViewSourceIspsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortViewSourceIspsResponseBody</p>
 */
public class DescribePortViewSourceIspsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Isps")
    private java.util.List<Isps> isps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<Isps> getIsps() {
        return this.isps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Isps> isps; 
        private String requestId; 

        /**
         * <p>An array that consists of the details of the ISP.</p>
         */
        public Builder isps(java.util.List<Isps> isps) {
            this.isps = isps;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortViewSourceIspsResponseBody build() {
            return new DescribePortViewSourceIspsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortViewSourceIspsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortViewSourceIspsResponseBody</p>
     */
    public static class Isps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("IspId")
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
             * <p>The total number of requests that are sent from the ISP.</p>
             * <blockquote>
             * <p>This parameter does not indicate the accurate number of requests. You can use this parameter to calculate the proportion of requests from different ISPs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3390671</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The ID of the ISP. For more information, see the ISP codes table.</p>
             * 
             * <strong>example:</strong>
             * <p>100017</p>
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
