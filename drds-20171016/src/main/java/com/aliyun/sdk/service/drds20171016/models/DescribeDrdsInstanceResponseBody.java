// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceResponseBody</p>
 */
public class DescribeDrdsInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDrdsInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public DescribeDrdsInstanceResponseBody build() {
            return new DescribeDrdsInstanceResponseBody(this);
        } 

    } 

    public static class Vip extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private Vip(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vip create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String ip; 
            private String port; 
            private String type; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Vip build() {
                return new Vip(this);
            } 

        } 

    }
    public static class Vips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vip")
        private java.util.List < Vip> vip;

        private Vips(Builder builder) {
            this.vip = builder.vip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vips create() {
            return builder().build();
        }

        /**
         * @return vip
         */
        public java.util.List < Vip> getVip() {
            return this.vip;
        }

        public static final class Builder {
            private java.util.List < Vip> vip; 

            /**
             * Vip.
             */
            public Builder vip(java.util.List < Vip> vip) {
                this.vip = vip;
                return this;
            }

            public Vips build() {
                return new Vips(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
        private String drdsInstanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        @com.aliyun.core.annotation.NameInMap("Vips")
        private Vips vips;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.drdsInstanceId = builder.drdsInstanceId;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.specification = builder.specification;
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
            this.vips = builder.vips;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return drdsInstanceId
         */
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return vips
         */
        public Vips getVips() {
            return this.vips;
        }

        /**
         * @return vpcCloudInstanceId
         */
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String drdsInstanceId; 
            private String networkType; 
            private String regionId; 
            private String specification; 
            private String status; 
            private String type; 
            private Long version; 
            private Vips vips; 
            private String vpcCloudInstanceId; 
            private String zoneId; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DrdsInstanceId.
             */
            public Builder drdsInstanceId(String drdsInstanceId) {
                this.drdsInstanceId = drdsInstanceId;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * Vips.
             */
            public Builder vips(Vips vips) {
                this.vips = vips;
                return this;
            }

            /**
             * VpcCloudInstanceId.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
