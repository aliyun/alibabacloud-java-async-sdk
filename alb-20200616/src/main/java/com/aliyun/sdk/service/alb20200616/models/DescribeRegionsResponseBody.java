// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public java.util.List<Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Regions> regions; 
        private String requestId; 

        /**
         * <p>The regions.</p>
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionsResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("RegionEndpoint")
        private String regionEndpoint;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Regions(Builder builder) {
            this.localName = builder.localName;
            this.regionEndpoint = builder.regionEndpoint;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return regionEndpoint
         */
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String localName; 
            private String regionEndpoint; 
            private String regionId; 

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * <p>The endpoint of region service.</p>
             * 
             * <strong>example:</strong>
             * <p>alb.cn-hangzhou.aliyuncs.com</p>
             */
            public Builder regionEndpoint(String regionEndpoint) {
                this.regionEndpoint = regionEndpoint;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
