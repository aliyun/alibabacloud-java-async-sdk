// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("regions")
    private java.util.List<Regions> regions;

    private DescribeRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
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

    public static final class Builder {
        private java.util.List<Regions> regions; 

        /**
         * regions.
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
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
        @com.aliyun.core.annotation.NameInMap("internetEndpoint")
        private String internetEndpoint;

        @com.aliyun.core.annotation.NameInMap("intranetEndpoint")
        private String intranetEndpoint;

        @com.aliyun.core.annotation.NameInMap("localName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        private Regions(Builder builder) {
            this.internetEndpoint = builder.internetEndpoint;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.localName = builder.localName;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return internetEndpoint
         */
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        /**
         * @return intranetEndpoint
         */
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String internetEndpoint; 
            private String intranetEndpoint; 
            private String localName; 
            private String region; 

            /**
             * internetEndpoint.
             */
            public Builder internetEndpoint(String internetEndpoint) {
                this.internetEndpoint = internetEndpoint;
                return this;
            }

            /**
             * intranetEndpoint.
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * localName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
