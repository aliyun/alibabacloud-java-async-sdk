// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackResponseBody</p>
 */
public class DescribePackResponseBody extends TeaModel {
    @NameInMap("PackInfo")
    private PackInfo packInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePackResponseBody(Builder builder) {
        this.packInfo = builder.packInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackResponseBody create() {
        return builder().build();
    }

    /**
     * @return packInfo
     */
    public PackInfo getPackInfo() {
        return this.packInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PackInfo packInfo; 
        private String requestId; 

        /**
         * PackInfo.
         */
        public Builder packInfo(PackInfo packInfo) {
            this.packInfo = packInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePackResponseBody build() {
            return new DescribePackResponseBody(this);
        } 

    } 

    public static class IpList extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        private IpList(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String ip; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

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
    public static class PackInfo extends TeaModel {
        @NameInMap("AvailableDeleteBlackholeCount")
        private Integer availableDeleteBlackholeCount;

        @NameInMap("IpList")
        private java.util.List < IpList> ipList;

        @NameInMap("PackConfig")
        private PackConfig packConfig;

        @NameInMap("Region")
        private String region;

        private PackInfo(Builder builder) {
            this.availableDeleteBlackholeCount = builder.availableDeleteBlackholeCount;
            this.ipList = builder.ipList;
            this.packConfig = builder.packConfig;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackInfo create() {
            return builder().build();
        }

        /**
         * @return availableDeleteBlackholeCount
         */
        public Integer getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        /**
         * @return ipList
         */
        public java.util.List < IpList> getIpList() {
            return this.ipList;
        }

        /**
         * @return packConfig
         */
        public PackConfig getPackConfig() {
            return this.packConfig;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer availableDeleteBlackholeCount; 
            private java.util.List < IpList> ipList; 
            private PackConfig packConfig; 
            private String region; 

            /**
             * AvailableDeleteBlackholeCount.
             */
            public Builder availableDeleteBlackholeCount(Integer availableDeleteBlackholeCount) {
                this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
                return this;
            }

            /**
             * IpList.
             */
            public Builder ipList(java.util.List < IpList> ipList) {
                this.ipList = ipList;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public PackInfo build() {
                return new PackInfo(this);
            } 

        } 

    }
}
