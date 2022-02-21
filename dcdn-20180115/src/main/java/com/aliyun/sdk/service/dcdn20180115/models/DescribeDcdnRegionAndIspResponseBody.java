// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnRegionAndIspResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnRegionAndIspResponseBody</p>
 */
public class DescribeDcdnRegionAndIspResponseBody extends TeaModel {
    @NameInMap("Isps")
    private Isps isps;

    @NameInMap("Regions")
    private Regions regions;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnRegionAndIspResponseBody(Builder builder) {
        this.isps = builder.isps;
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnRegionAndIspResponseBody create() {
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
         * Isps.
         */
        public Builder isps(Isps isps) {
            this.isps = isps;
            return this;
        }

        /**
         * Regions.
         */
        public Builder regions(Regions regions) {
            this.regions = regions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnRegionAndIspResponseBody build() {
            return new DescribeDcdnRegionAndIspResponseBody(this);
        } 

    } 

    public static class Isp extends TeaModel {
        @NameInMap("NameEn")
        private String nameEn;

        @NameInMap("NameZh")
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
             * NameEn.
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * NameZh.
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
    public static class Isps extends TeaModel {
        @NameInMap("Isp")
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
    public static class Region extends TeaModel {
        @NameInMap("NameEn")
        private String nameEn;

        @NameInMap("NameZh")
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
             * NameEn.
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * NameZh.
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
    public static class Regions extends TeaModel {
        @NameInMap("Region")
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
