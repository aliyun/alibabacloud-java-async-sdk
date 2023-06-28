// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackListResponseBody</p>
 */
public class DescribePackListResponseBody extends TeaModel {
    @NameInMap("PackList")
    private java.util.List < PackList> packList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePackListResponseBody(Builder builder) {
        this.packList = builder.packList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackListResponseBody create() {
        return builder().build();
    }

    /**
     * @return packList
     */
    public java.util.List < PackList> getPackList() {
        return this.packList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PackList> packList; 
        private String requestId; 

        /**
         * PackList.
         */
        public Builder packList(java.util.List < PackList> packList) {
            this.packList = packList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePackListResponseBody build() {
            return new DescribePackListResponseBody(this);
        } 

    } 

    public static class PackConfig extends TeaModel {
        @NameInMap("IpAdvanceThre")
        private Integer ipAdvanceThre;

        @NameInMap("IpBasicThre")
        private Integer ipBasicThre;

        @NameInMap("IpSpec")
        private Integer ipSpec;

        @NameInMap("PackAdvThre")
        private Integer packAdvThre;

        @NameInMap("PackBasicThre")
        private Integer packBasicThre;

        private PackConfig(Builder builder) {
            this.ipAdvanceThre = builder.ipAdvanceThre;
            this.ipBasicThre = builder.ipBasicThre;
            this.ipSpec = builder.ipSpec;
            this.packAdvThre = builder.packAdvThre;
            this.packBasicThre = builder.packBasicThre;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackConfig create() {
            return builder().build();
        }

        /**
         * @return ipAdvanceThre
         */
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        /**
         * @return ipBasicThre
         */
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        /**
         * @return ipSpec
         */
        public Integer getIpSpec() {
            return this.ipSpec;
        }

        /**
         * @return packAdvThre
         */
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        /**
         * @return packBasicThre
         */
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

        public static final class Builder {
            private Integer ipAdvanceThre; 
            private Integer ipBasicThre; 
            private Integer ipSpec; 
            private Integer packAdvThre; 
            private Integer packBasicThre; 

            /**
             * IpAdvanceThre.
             */
            public Builder ipAdvanceThre(Integer ipAdvanceThre) {
                this.ipAdvanceThre = ipAdvanceThre;
                return this;
            }

            /**
             * IpBasicThre.
             */
            public Builder ipBasicThre(Integer ipBasicThre) {
                this.ipBasicThre = ipBasicThre;
                return this;
            }

            /**
             * IpSpec.
             */
            public Builder ipSpec(Integer ipSpec) {
                this.ipSpec = ipSpec;
                return this;
            }

            /**
             * PackAdvThre.
             */
            public Builder packAdvThre(Integer packAdvThre) {
                this.packAdvThre = packAdvThre;
                return this;
            }

            /**
             * PackBasicThre.
             */
            public Builder packBasicThre(Integer packBasicThre) {
                this.packBasicThre = packBasicThre;
                return this;
            }

            public PackConfig build() {
                return new PackConfig(this);
            } 

        } 

    }
    public static class PackList extends TeaModel {
        @NameInMap("AvailableDeleteBlackholeCount")
        private Integer availableDeleteBlackholeCount;

        @NameInMap("PackConfig")
        private PackConfig packConfig;

        @NameInMap("PackId")
        private String packId;

        @NameInMap("Region")
        private String region;

        private PackList(Builder builder) {
            this.availableDeleteBlackholeCount = builder.availableDeleteBlackholeCount;
            this.packConfig = builder.packConfig;
            this.packId = builder.packId;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackList create() {
            return builder().build();
        }

        /**
         * @return availableDeleteBlackholeCount
         */
        public Integer getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        /**
         * @return packConfig
         */
        public PackConfig getPackConfig() {
            return this.packConfig;
        }

        /**
         * @return packId
         */
        public String getPackId() {
            return this.packId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer availableDeleteBlackholeCount; 
            private PackConfig packConfig; 
            private String packId; 
            private String region; 

            /**
             * AvailableDeleteBlackholeCount.
             */
            public Builder availableDeleteBlackholeCount(Integer availableDeleteBlackholeCount) {
                this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
                return this;
            }

            /**
             * PackConfig.
             */
            public Builder packConfig(PackConfig packConfig) {
                this.packConfig = packConfig;
                return this;
            }

            /**
             * PackId.
             */
            public Builder packId(String packId) {
                this.packId = packId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public PackList build() {
                return new PackList(this);
            } 

        } 

    }
}
