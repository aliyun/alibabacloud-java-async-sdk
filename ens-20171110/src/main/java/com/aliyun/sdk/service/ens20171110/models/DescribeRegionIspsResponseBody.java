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
 * {@link DescribeRegionIspsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionIspsResponseBody</p>
 */
public class DescribeRegionIspsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Isps")
    private java.util.List<Isps> isps;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRegionIspsResponseBody model) {
            this.isps = model.isps;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of ISPs.</p>
         */
        public Builder isps(java.util.List<Isps> isps) {
            this.isps = isps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DC90CC7E-23B6-5A90-9097-A17CE4A161C4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionIspsResponseBody build() {
            return new DescribeRegionIspsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionIspsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionIspsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Isps model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>The code of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>move</p>
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
