// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMyBaseHostOverViewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMyBaseHostOverViewResponseBody</p>
 */
public class DescribeMyBaseHostOverViewResponseBody extends TeaModel {
    @NameInMap("Regions")
    private Regions regions;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMyBaseHostOverViewResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMyBaseHostOverViewResponseBody create() {
        return builder().build();
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

        public DescribeMyBaseHostOverViewResponseBody build() {
            return new DescribeMyBaseHostOverViewResponseBody(this);
        } 

    } 

    public static class TypeModel extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("HostDateType")
        private String hostDateType;

        @NameInMap("HostEngineCount")
        private String hostEngineCount;

        private TypeModel(Builder builder) {
            this.count = builder.count;
            this.hostDateType = builder.hostDateType;
            this.hostEngineCount = builder.hostEngineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeModel create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return hostDateType
         */
        public String getHostDateType() {
            return this.hostDateType;
        }

        /**
         * @return hostEngineCount
         */
        public String getHostEngineCount() {
            return this.hostEngineCount;
        }

        public static final class Builder {
            private Integer count; 
            private String hostDateType; 
            private String hostEngineCount; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * HostDateType.
             */
            public Builder hostDateType(String hostDateType) {
                this.hostDateType = hostDateType;
                return this;
            }

            /**
             * HostEngineCount.
             */
            public Builder hostEngineCount(String hostEngineCount) {
                this.hostEngineCount = hostEngineCount;
                return this;
            }

            public TypeModel build() {
                return new TypeModel(this);
            } 

        } 

    }
    public static class TypeModels extends TeaModel {
        @NameInMap("TypeModel")
        private java.util.List < TypeModel> typeModel;

        private TypeModels(Builder builder) {
            this.typeModel = builder.typeModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TypeModels create() {
            return builder().build();
        }

        /**
         * @return typeModel
         */
        public java.util.List < TypeModel> getTypeModel() {
            return this.typeModel;
        }

        public static final class Builder {
            private java.util.List < TypeModel> typeModel; 

            /**
             * TypeModel.
             */
            public Builder typeModel(java.util.List < TypeModel> typeModel) {
                this.typeModel = typeModel;
                return this;
            }

            public TypeModels build() {
                return new TypeModels(this);
            } 

        } 

    }
    public static class RegionModel extends TeaModel {
        @NameInMap("EngineCount")
        private String engineCount;

        @NameInMap("HostGroupCount")
        private Integer hostGroupCount;

        @NameInMap("Region")
        private String region;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TypeModels")
        private TypeModels typeModels;

        private RegionModel(Builder builder) {
            this.engineCount = builder.engineCount;
            this.hostGroupCount = builder.hostGroupCount;
            this.region = builder.region;
            this.totalCount = builder.totalCount;
            this.typeModels = builder.typeModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionModel create() {
            return builder().build();
        }

        /**
         * @return engineCount
         */
        public String getEngineCount() {
            return this.engineCount;
        }

        /**
         * @return hostGroupCount
         */
        public Integer getHostGroupCount() {
            return this.hostGroupCount;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return typeModels
         */
        public TypeModels getTypeModels() {
            return this.typeModels;
        }

        public static final class Builder {
            private String engineCount; 
            private Integer hostGroupCount; 
            private String region; 
            private Integer totalCount; 
            private TypeModels typeModels; 

            /**
             * EngineCount.
             */
            public Builder engineCount(String engineCount) {
                this.engineCount = engineCount;
                return this;
            }

            /**
             * HostGroupCount.
             */
            public Builder hostGroupCount(Integer hostGroupCount) {
                this.hostGroupCount = hostGroupCount;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TypeModels.
             */
            public Builder typeModels(TypeModels typeModels) {
                this.typeModels = typeModels;
                return this;
            }

            public RegionModel build() {
                return new RegionModel(this);
            } 

        } 

    }
    public static class Regions extends TeaModel {
        @NameInMap("RegionModel")
        private java.util.List < RegionModel> regionModel;

        private Regions(Builder builder) {
            this.regionModel = builder.regionModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return regionModel
         */
        public java.util.List < RegionModel> getRegionModel() {
            return this.regionModel;
        }

        public static final class Builder {
            private java.util.List < RegionModel> regionModel; 

            /**
             * RegionModel.
             */
            public Builder regionModel(java.util.List < RegionModel> regionModel) {
                this.regionModel = regionModel;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
