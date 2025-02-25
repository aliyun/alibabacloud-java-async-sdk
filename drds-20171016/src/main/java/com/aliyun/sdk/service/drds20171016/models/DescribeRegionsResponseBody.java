// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DrdsRegions")
    private DrdsRegions drdsRegions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeRegionsResponseBody(Builder builder) {
        this.drdsRegions = builder.drdsRegions;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return drdsRegions
     */
    public DrdsRegions getDrdsRegions() {
        return this.drdsRegions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DrdsRegions drdsRegions; 
        private String requestId; 
        private Boolean success; 

        /**
         * DrdsRegions.
         */
        public Builder drdsRegions(DrdsRegions drdsRegions) {
            this.drdsRegions = drdsRegions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

    public static class Spec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecId")
        private String specId;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        private Spec(Builder builder) {
            this.specId = builder.specId;
            this.specName = builder.specName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return specId
         */
        public String getSpecId() {
            return this.specId;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        public static final class Builder {
            private String specId; 
            private String specName; 

            /**
             * SpecId.
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    public static class SpecList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Spec")
        private java.util.List < Spec> spec;

        private SpecList(Builder builder) {
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecList create() {
            return builder().build();
        }

        /**
         * @return spec
         */
        public java.util.List < Spec> getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private java.util.List < Spec> spec; 

            /**
             * Spec.
             */
            public Builder spec(java.util.List < Spec> spec) {
                this.spec = spec;
                return this;
            }

            public SpecList build() {
                return new SpecList(this);
            } 

        } 

    }
    public static class InstanceSeries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SeriesId")
        private String seriesId;

        @com.aliyun.core.annotation.NameInMap("SeriesName")
        private String seriesName;

        @com.aliyun.core.annotation.NameInMap("SpecList")
        private SpecList specList;

        private InstanceSeries(Builder builder) {
            this.seriesId = builder.seriesId;
            this.seriesName = builder.seriesName;
            this.specList = builder.specList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSeries create() {
            return builder().build();
        }

        /**
         * @return seriesId
         */
        public String getSeriesId() {
            return this.seriesId;
        }

        /**
         * @return seriesName
         */
        public String getSeriesName() {
            return this.seriesName;
        }

        /**
         * @return specList
         */
        public SpecList getSpecList() {
            return this.specList;
        }

        public static final class Builder {
            private String seriesId; 
            private String seriesName; 
            private SpecList specList; 

            /**
             * SeriesId.
             */
            public Builder seriesId(String seriesId) {
                this.seriesId = seriesId;
                return this;
            }

            /**
             * SeriesName.
             */
            public Builder seriesName(String seriesName) {
                this.seriesName = seriesName;
                return this;
            }

            /**
             * SpecList.
             */
            public Builder specList(SpecList specList) {
                this.specList = specList;
                return this;
            }

            public InstanceSeries build() {
                return new InstanceSeries(this);
            } 

        } 

    }
    public static class InstanceSeriesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceSeries")
        private java.util.List < InstanceSeries> instanceSeries;

        private InstanceSeriesList(Builder builder) {
            this.instanceSeries = builder.instanceSeries;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSeriesList create() {
            return builder().build();
        }

        /**
         * @return instanceSeries
         */
        public java.util.List < InstanceSeries> getInstanceSeries() {
            return this.instanceSeries;
        }

        public static final class Builder {
            private java.util.List < InstanceSeries> instanceSeries; 

            /**
             * InstanceSeries.
             */
            public Builder instanceSeries(java.util.List < InstanceSeries> instanceSeries) {
                this.instanceSeries = instanceSeries;
                return this;
            }

            public InstanceSeriesList build() {
                return new InstanceSeriesList(this);
            } 

        } 

    }
    public static class DrdsRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceSeriesList")
        private InstanceSeriesList instanceSeriesList;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private DrdsRegion(Builder builder) {
            this.instanceSeriesList = builder.instanceSeriesList;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrdsRegion create() {
            return builder().build();
        }

        /**
         * @return instanceSeriesList
         */
        public InstanceSeriesList getInstanceSeriesList() {
            return this.instanceSeriesList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private InstanceSeriesList instanceSeriesList; 
            private String regionId; 
            private String regionName; 
            private String zoneId; 
            private String zoneName; 

            /**
             * InstanceSeriesList.
             */
            public Builder instanceSeriesList(InstanceSeriesList instanceSeriesList) {
                this.instanceSeriesList = instanceSeriesList;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneName.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public DrdsRegion build() {
                return new DrdsRegion(this);
            } 

        } 

    }
    public static class DrdsRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrdsRegion")
        private java.util.List < DrdsRegion> drdsRegion;

        private DrdsRegions(Builder builder) {
            this.drdsRegion = builder.drdsRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrdsRegions create() {
            return builder().build();
        }

        /**
         * @return drdsRegion
         */
        public java.util.List < DrdsRegion> getDrdsRegion() {
            return this.drdsRegion;
        }

        public static final class Builder {
            private java.util.List < DrdsRegion> drdsRegion; 

            /**
             * DrdsRegion.
             */
            public Builder drdsRegion(java.util.List < DrdsRegion> drdsRegion) {
                this.drdsRegion = drdsRegion;
                return this;
            }

            public DrdsRegions build() {
                return new DrdsRegions(this);
            } 

        } 

    }
}
