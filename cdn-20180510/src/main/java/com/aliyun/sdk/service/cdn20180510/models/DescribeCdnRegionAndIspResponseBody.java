// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnRegionAndIspResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnRegionAndIspResponseBody</p>
 */
public class DescribeCdnRegionAndIspResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Isps")
    private Isps isps;

    @com.aliyun.core.annotation.NameInMap("Regions")
    private Regions regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnRegionAndIspResponseBody(Builder builder) {
        this.isps = builder.isps;
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnRegionAndIspResponseBody create() {
        return builder().build();
    }

    /**
     * @return isps
     */
    public Isps getIsps() {
        return this.isps;
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
        private Isps isps; 
        private Regions regions; 
        private String requestId; 

        /**
         * <p>The list of ISPs.</p>
         */
        public Builder isps(Isps isps) {
            this.isps = isps;
            return this;
        }

        /**
         * <p>The list of regions.</p>
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2387C335-932C-4E1E-862C-1C4363B6DE72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnRegionAndIspResponseBody build() {
            return new DescribeCdnRegionAndIspResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnRegionAndIspResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnRegionAndIspResponseBody</p>
     */
    public static class Isp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameEn")
        private String nameEn;

        @com.aliyun.core.annotation.NameInMap("NameZh")
        private String nameZh;

        private Isp(Builder builder) {
            this.nameEn = builder.nameEn;
            this.nameZh = builder.nameZh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Isp create() {
            return builder().build();
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return nameZh
         */
        public String getNameZh() {
            return this.nameZh;
        }

        public static final class Builder {
            private String nameEn; 
            private String nameZh; 

            /**
             * <p>The English name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>unicom</p>
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * <p>The Chinese name of the ISP.</p>
             */
            public Builder nameZh(String nameZh) {
                this.nameZh = nameZh;
                return this;
            }

            public Isp build() {
                return new Isp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnRegionAndIspResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnRegionAndIspResponseBody</p>
     */
    public static class Isps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Isp")
        private java.util.List < Isp> isp;

        private Isps(Builder builder) {
            this.isp = builder.isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Isps create() {
            return builder().build();
        }

        /**
         * @return isp
         */
        public java.util.List < Isp> getIsp() {
            return this.isp;
        }

        public static final class Builder {
            private java.util.List < Isp> isp; 

            /**
             * Isp.
             */
            public Builder isp(java.util.List < Isp> isp) {
                this.isp = isp;
                return this;
            }

            public Isps build() {
                return new Isps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnRegionAndIspResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnRegionAndIspResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NameEn")
        private String nameEn;

        @com.aliyun.core.annotation.NameInMap("NameZh")
        private String nameZh;

        private Region(Builder builder) {
            this.nameEn = builder.nameEn;
            this.nameZh = builder.nameZh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return nameZh
         */
        public String getNameZh() {
            return this.nameZh;
        }

        public static final class Builder {
            private String nameEn; 
            private String nameZh; 

            /**
             * <p>The English name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>liaoning</p>
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * <p>The Chinese name of the region.</p>
             */
            public Builder nameZh(String nameZh) {
                this.nameZh = nameZh;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnRegionAndIspResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnRegionAndIspResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private java.util.List < Region> region;

        private Regions(Builder builder) {
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public java.util.List < Region> getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List < Region> region; 

            /**
             * Region.
             */
            public Builder region(java.util.List < Region> region) {
                this.region = region;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
