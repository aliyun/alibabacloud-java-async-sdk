// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeInstanceSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecsResponseBody</p>
 */
public class DescribeInstanceSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSpecs")
    private java.util.List<InstanceSpecs> instanceSpecs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceSpecsResponseBody(Builder builder) {
        this.instanceSpecs = builder.instanceSpecs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceSpecs
     */
    public java.util.List<InstanceSpecs> getInstanceSpecs() {
        return this.instanceSpecs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceSpecs> instanceSpecs; 
        private String requestId; 

        /**
         * <p>The details of the specifications of the instance.</p>
         */
        public Builder instanceSpecs(java.util.List<InstanceSpecs> instanceSpecs) {
            this.instanceSpecs = instanceSpecs;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4E3A9B5F-5DDB-593D-A1E6-F1F451DB5E0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSpecsResponseBody build() {
            return new DescribeInstanceSpecsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSpecsResponseBody</p>
     */
    public static class InstanceSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthMbps")
        private Integer bandwidthMbps;

        @com.aliyun.core.annotation.NameInMap("BaseBandwidth")
        private Integer baseBandwidth;

        @com.aliyun.core.annotation.NameInMap("ConnLimit")
        private Long connLimit;

        @com.aliyun.core.annotation.NameInMap("CpsLimit")
        private Long cpsLimit;

        @com.aliyun.core.annotation.NameInMap("DefenseCount")
        private Integer defenseCount;

        @com.aliyun.core.annotation.NameInMap("DomainLimit")
        private Integer domainLimit;

        @com.aliyun.core.annotation.NameInMap("ElasticBandwidth")
        private Integer elasticBandwidth;

        @com.aliyun.core.annotation.NameInMap("ElasticBw")
        private Integer elasticBw;

        @com.aliyun.core.annotation.NameInMap("ElasticBwModel")
        private String elasticBwModel;

        @com.aliyun.core.annotation.NameInMap("ElasticQps")
        private Long elasticQps;

        @com.aliyun.core.annotation.NameInMap("ElasticQpsMode")
        private String elasticQpsMode;

        @com.aliyun.core.annotation.NameInMap("FunctionVersion")
        private String functionVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PortLimit")
        private Integer portLimit;

        @com.aliyun.core.annotation.NameInMap("QpsLimit")
        private Integer qpsLimit;

        @com.aliyun.core.annotation.NameInMap("RealLimitBw")
        private Long realLimitBw;

        @com.aliyun.core.annotation.NameInMap("SiteLimit")
        private Integer siteLimit;

        private InstanceSpecs(Builder builder) {
            this.bandwidthMbps = builder.bandwidthMbps;
            this.baseBandwidth = builder.baseBandwidth;
            this.connLimit = builder.connLimit;
            this.cpsLimit = builder.cpsLimit;
            this.defenseCount = builder.defenseCount;
            this.domainLimit = builder.domainLimit;
            this.elasticBandwidth = builder.elasticBandwidth;
            this.elasticBw = builder.elasticBw;
            this.elasticBwModel = builder.elasticBwModel;
            this.elasticQps = builder.elasticQps;
            this.elasticQpsMode = builder.elasticQpsMode;
            this.functionVersion = builder.functionVersion;
            this.instanceId = builder.instanceId;
            this.portLimit = builder.portLimit;
            this.qpsLimit = builder.qpsLimit;
            this.realLimitBw = builder.realLimitBw;
            this.siteLimit = builder.siteLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpecs create() {
            return builder().build();
        }

        /**
         * @return bandwidthMbps
         */
        public Integer getBandwidthMbps() {
            return this.bandwidthMbps;
        }

        /**
         * @return baseBandwidth
         */
        public Integer getBaseBandwidth() {
            return this.baseBandwidth;
        }

        /**
         * @return connLimit
         */
        public Long getConnLimit() {
            return this.connLimit;
        }

        /**
         * @return cpsLimit
         */
        public Long getCpsLimit() {
            return this.cpsLimit;
        }

        /**
         * @return defenseCount
         */
        public Integer getDefenseCount() {
            return this.defenseCount;
        }

        /**
         * @return domainLimit
         */
        public Integer getDomainLimit() {
            return this.domainLimit;
        }

        /**
         * @return elasticBandwidth
         */
        public Integer getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        /**
         * @return elasticBw
         */
        public Integer getElasticBw() {
            return this.elasticBw;
        }

        /**
         * @return elasticBwModel
         */
        public String getElasticBwModel() {
            return this.elasticBwModel;
        }

        /**
         * @return elasticQps
         */
        public Long getElasticQps() {
            return this.elasticQps;
        }

        /**
         * @return elasticQpsMode
         */
        public String getElasticQpsMode() {
            return this.elasticQpsMode;
        }

        /**
         * @return functionVersion
         */
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return portLimit
         */
        public Integer getPortLimit() {
            return this.portLimit;
        }

        /**
         * @return qpsLimit
         */
        public Integer getQpsLimit() {
            return this.qpsLimit;
        }

        /**
         * @return realLimitBw
         */
        public Long getRealLimitBw() {
            return this.realLimitBw;
        }

        /**
         * @return siteLimit
         */
        public Integer getSiteLimit() {
            return this.siteLimit;
        }

        public static final class Builder {
            private Integer bandwidthMbps; 
            private Integer baseBandwidth; 
            private Long connLimit; 
            private Long cpsLimit; 
            private Integer defenseCount; 
            private Integer domainLimit; 
            private Integer elasticBandwidth; 
            private Integer elasticBw; 
            private String elasticBwModel; 
            private Long elasticQps; 
            private String elasticQpsMode; 
            private String functionVersion; 
            private String instanceId; 
            private Integer portLimit; 
            private Integer qpsLimit; 
            private Long realLimitBw; 
            private Integer siteLimit; 

            /**
             * <p>The clean bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bandwidthMbps(Integer bandwidthMbps) {
                this.bandwidthMbps = bandwidthMbps;
                return this;
            }

            /**
             * <p>The basic protection bandwidth. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder baseBandwidth(Integer baseBandwidth) {
                this.baseBandwidth = baseBandwidth;
                return this;
            }

            /**
             * <p>The specification of concurrent connections of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder connLimit(Long connLimit) {
                this.connLimit = connLimit;
                return this;
            }

            /**
             * <p>The specification of new connections of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder cpsLimit(Long cpsLimit) {
                this.cpsLimit = cpsLimit;
                return this;
            }

            /**
             * <p>The number of available advanced mitigation sessions for this month. <strong>-1</strong>: unlimited</p>
             * <blockquote>
             * <p> This parameter is returned only when the request parameter <strong>RegionId</strong> is set to <strong>ap-southeast-1</strong>. If RegionId is set to ap-southeast-1, the specifications of Anti-DDoS Proxy (Outside Chinese Mainland) instances are queried.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder defenseCount(Integer defenseCount) {
                this.defenseCount = defenseCount;
                return this;
            }

            /**
             * <p>The number of domain names that can be protected by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder domainLimit(Integer domainLimit) {
                this.domainLimit = domainLimit;
                return this;
            }

            /**
             * <p>The burstable protection bandwidth. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder elasticBandwidth(Integer elasticBandwidth) {
                this.elasticBandwidth = elasticBandwidth;
                return this;
            }

            /**
             * <p>The burstable clean bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder elasticBw(Integer elasticBw) {
                this.elasticBw = elasticBw;
                return this;
            }

            /**
             * <p>The metering method of the burstable clean bandwidth. Valid values:</p>
             * <ul>
             * <li><strong>day</strong>: the metering method of daily 95th percentile</li>
             * <li><strong>month</strong>: the metering method of monthly 95th percentile</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder elasticBwModel(String elasticBwModel) {
                this.elasticBwModel = elasticBwModel;
                return this;
            }

            /**
             * <p>The burstable QPS. Unit: QPS</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder elasticQps(Long elasticQps) {
                this.elasticQps = elasticQps;
                return this;
            }

            /**
             * <p>The metering method of the burstable QPS. Valid values:</p>
             * <ul>
             * <li><strong>day</strong>: the metering method of daily 95th percentile</li>
             * <li><strong>month</strong>: the metering method of monthly 95th percentile</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder elasticQpsMode(String elasticQpsMode) {
                this.elasticQpsMode = elasticQpsMode;
                return this;
            }

            /**
             * <p>The function plan of the instance. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: Standard</li>
             * <li><strong>enhance</strong>: Enhanced</li>
             * <li><strong>cnhk</strong>: Chinese Mainland Acceleration (CMA)</li>
             * <li><strong>cnhk_default</strong>: Secure Chinese Mainland Acceleration (Sec-CMA) standard</li>
             * <li><strong>cnhk_enhance</strong>: Sec-CMA enhanced</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder functionVersion(String functionVersion) {
                this.functionVersion = functionVersion;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-zvp2eibz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of ports that can be protected by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder portLimit(Integer portLimit) {
                this.portLimit = portLimit;
                return this;
            }

            /**
             * <p>The clean QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder qpsLimit(Integer qpsLimit) {
                this.qpsLimit = qpsLimit;
                return this;
            }

            /**
             * <p>The threshold of the clean bandwidth. Valid values: 0 to 15360. The value 0 indicates that rate limiting is never triggered. Unit: Mbit/s</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder realLimitBw(Long realLimitBw) {
                this.realLimitBw = realLimitBw;
                return this;
            }

            /**
             * <p>The number of sites that can be protected by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder siteLimit(Integer siteLimit) {
                this.siteLimit = siteLimit;
                return this;
            }

            public InstanceSpecs build() {
                return new InstanceSpecs(this);
            } 

        } 

    }
}
