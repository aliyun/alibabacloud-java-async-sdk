// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionIspsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionIspsResponseBody</p>
 */
public class DescribeRegionIspsResponseBody extends TeaModel {
    @NameInMap("Isps")
    private java.util.List < Isps> isps;

    @NameInMap("RequestId")
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
         * Isps.
         */
        public Builder isps(java.util.List < Isps> isps) {
            this.isps = isps;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
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
