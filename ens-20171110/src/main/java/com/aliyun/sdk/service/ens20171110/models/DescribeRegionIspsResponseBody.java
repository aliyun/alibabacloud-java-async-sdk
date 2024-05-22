// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionIspsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionIspsResponseBody</p>
 */
public class DescribeRegionIspsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Isps")
    private java.util.List < Isps> isps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionIspsResponseBody(Builder builder) {
        this.isps = builder.isps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionIspsResponseBody create() {
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
         * The list of ISPs.
         */
        public Builder isps(java.util.List < Isps> isps) {
            this.isps = isps;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionIspsResponseBody build() {
            return new DescribeRegionIspsResponseBody(this);
        } 

    } 

    public static class Isps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Isps(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Isps create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            /**
             * The code of the ISP.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the ISP.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Isps build() {
                return new Isps(this);
            } 

        } 

    }
}
