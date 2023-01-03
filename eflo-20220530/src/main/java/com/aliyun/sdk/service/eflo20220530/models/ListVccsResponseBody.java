// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVccsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVccsResponseBody</p>
 */
public class ListVccsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Content")
    private Content content;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListVccsResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVccsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVccsResponseBody build() {
            return new ListVccsResponseBody(this);
        } 

    } 

    public static class VpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("Name")
        private String name;

        @NameInMap("VpdId")
        private String vpdId;

        private VpdBaseInfo(Builder builder) {
            this.cidr = builder.cidr;
            this.gmtCreate = builder.gmtCreate;
            this.name = builder.name;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdBaseInfo create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String cidr; 
            private String gmtCreate; 
            private String name; 
            private String vpdId; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public VpdBaseInfo build() {
                return new VpdBaseInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("BandwidthStr")
        private String bandwidthStr;

        @NameInMap("BgpCidr")
        private String bgpCidr;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("LineOperator")
        private String lineOperator;

        @NameInMap("Message")
        private String message;

        @NameInMap("PortType")
        private String portType;

        @NameInMap("Rate")
        private Double rate;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("VccId")
        private String vccId;

        @NameInMap("VccName")
        private String vccName;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpdBaseInfo")
        private VpdBaseInfo vpdBaseInfo;

        @NameInMap("VpdId")
        private String vpdId;

        private Data(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.bandwidthStr = builder.bandwidthStr;
            this.bgpCidr = builder.bgpCidr;
            this.cenId = builder.cenId;
            this.createTime = builder.createTime;
            this.gmtModified = builder.gmtModified;
            this.lineOperator = builder.lineOperator;
            this.message = builder.message;
            this.portType = builder.portType;
            this.rate = builder.rate;
            this.regionId = builder.regionId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.vccId = builder.vccId;
            this.vccName = builder.vccName;
            this.vpcId = builder.vpcId;
            this.vpdBaseInfo = builder.vpdBaseInfo;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return bandwidthStr
         */
        public String getBandwidthStr() {
            return this.bandwidthStr;
        }

        /**
         * @return bgpCidr
         */
        public String getBgpCidr() {
            return this.bgpCidr;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lineOperator
         */
        public String getLineOperator() {
            return this.lineOperator;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return portType
         */
        public String getPortType() {
            return this.portType;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return vccId
         */
        public String getVccId() {
            return this.vccId;
        }

        /**
         * @return vccName
         */
        public String getVccName() {
            return this.vccName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpdBaseInfo
         */
        public VpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String accessPointId; 
            private String bandwidthStr; 
            private String bgpCidr; 
            private String cenId; 
            private String createTime; 
            private String gmtModified; 
            private String lineOperator; 
            private String message; 
            private String portType; 
            private Double rate; 
            private String regionId; 
            private String spec; 
            private String status; 
            private String tenantId; 
            private String vccId; 
            private String vccName; 
            private String vpcId; 
            private VpdBaseInfo vpdBaseInfo; 
            private String vpdId; 

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * BandwidthStr.
             */
            public Builder bandwidthStr(String bandwidthStr) {
                this.bandwidthStr = bandwidthStr;
                return this;
            }

            /**
             * BgpCidr.
             */
            public Builder bgpCidr(String bgpCidr) {
                this.bgpCidr = bgpCidr;
                return this;
            }

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * LineOperator.
             */
            public Builder lineOperator(String lineOperator) {
                this.lineOperator = lineOperator;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * PortType.
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Double rate) {
                this.rate = rate;
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
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
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
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * VccId.
             */
            public Builder vccId(String vccId) {
                this.vccId = vccId;
                return this;
            }

            /**
             * VccName.
             */
            public Builder vccName(String vccName) {
                this.vccName = vccName;
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
             * VpdBaseInfo.
             */
            public Builder vpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
                this.vpdBaseInfo = vpdBaseInfo;
                return this;
            }

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("Data")
        private java.util.List < Data> data;

        @NameInMap("Total")
        private Long total;

        private Content(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private Long total; 

            /**
             * Data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
