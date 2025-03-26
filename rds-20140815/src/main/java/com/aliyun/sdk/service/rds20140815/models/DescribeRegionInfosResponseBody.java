// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRegionInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionInfosResponseBody</p>
 */
public class DescribeRegionInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionInfosResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regions
     */
    public Regions getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Regions regions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRegionInfosResponseBody model) {
            this.regions = model.regions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of regions.</p>
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5414A4E5-4C36-4461-95FC-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionInfosResponseBody build() {
            return new DescribeRegionInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRegionInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionInfosResponseBody</p>
     */
    public static class RDSRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private RDSRegion(Builder builder) {
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RDSRegion create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String regionId; 

            private Builder() {
            } 

            private Builder(RDSRegion model) {
                this.regionId = model.regionId;
            } 

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public RDSRegion build() {
                return new RDSRegion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRegionInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRegionInfosResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RDSRegion")
        private java.util.List<RDSRegion> RDSRegion;

        private Regions(Builder builder) {
            this.RDSRegion = builder.RDSRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return RDSRegion
         */
        public java.util.List<RDSRegion> getRDSRegion() {
            return this.RDSRegion;
        }

        public static final class Builder {
            private java.util.List<RDSRegion> RDSRegion; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.RDSRegion = model.RDSRegion;
            } 

            /**
             * RDSRegion.
             */
            public Builder RDSRegion(java.util.List<RDSRegion> RDSRegion) {
                this.RDSRegion = RDSRegion;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
