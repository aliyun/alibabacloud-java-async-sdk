// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmMonitorConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmMonitorConfigResponseBody</p>
 */
public class DescribeDnsGtmMonitorConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("IspCityNodes")
    private IspCityNodes ispCityNodes;

    @com.aliyun.core.annotation.NameInMap("MonitorConfigId")
    private String monitorConfigId;

    @com.aliyun.core.annotation.NameInMap("MonitorExtendInfo")
    private String monitorExtendInfo;

    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    private DescribeDnsGtmMonitorConfigResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.evaluationCount = builder.evaluationCount;
        this.interval = builder.interval;
        this.ispCityNodes = builder.ispCityNodes;
        this.monitorConfigId = builder.monitorConfigId;
        this.monitorExtendInfo = builder.monitorExtendInfo;
        this.protocolType = builder.protocolType;
        this.requestId = builder.requestId;
        this.timeout = builder.timeout;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmMonitorConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return evaluationCount
     */
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return ispCityNodes
     */
    public IspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    /**
     * @return monitorConfigId
     */
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    /**
     * @return monitorExtendInfo
     */
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private String createTime; 
        private Long createTimestamp; 
        private Integer evaluationCount; 
        private Integer interval; 
        private IspCityNodes ispCityNodes; 
        private String monitorConfigId; 
        private String monitorExtendInfo; 
        private String protocolType; 
        private String requestId; 
        private Integer timeout; 
        private String updateTime; 
        private Long updateTimestamp; 

        /**
         * The time when the health check task was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The timestamp that indicates when the health check task was created.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * The number of consecutive times of failed health check attempts.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * The interval at which the health check task is executed. Unit: seconds.
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * The monitored node.
         */
        public Builder ispCityNodes(IspCityNodes ispCityNodes) {
            this.ispCityNodes = ispCityNodes;
            return this;
        }

        /**
         * The ID of the health check task.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * The extended information. The following parameters are required for different health check protocols:
         * <p>
         * 
         * *   HTTP or HTTPS:
         * 
         *     *   port: the check port.
         * 
         *     *   host: the host settings.
         * 
         *     *   path: the URL path.
         * 
         *     *   code: the return code greater than the specified value.
         * 
         *     *   failureRate: the failure rate.
         * 
         *     *   sni: specifies whether to enable server name indication (SNI). This parameter is used only for the HTTPS protocol. Valid values:
         * 
         *         *   true: enable SNI.
         *         *   false: disable SNI.
         * 
         *     *   nodeType: the type of the node to monitor when the address pool type is DOMAIN. Valid values:
         * 
         *         *   IPV4
         *         *   IPV6
         * 
         * *   PING:
         * 
         *     *   failureRate: the failure rate.
         * 
         *     *   packetNum: the number of ping packets.
         * 
         *     *   packetLossRate: the loss rate of ping packets.
         * 
         *     *   nodeType: the type of the node to monitor when the address pool type is DOMAIN. Valid values:
         * 
         *         *   IPV4
         *         *   IPV6
         * 
         * *   TCP:
         * 
         *     *   port: the check port.
         * 
         *     *   failureRate: the failure rate.
         * 
         *     *   nodeType: the type of the node to monitor when the address pool type is DOMAIN. Valid values:
         * 
         *         *   IPV4
         *         *   IPV6
         */
        public Builder monitorExtendInfo(String monitorExtendInfo) {
            this.monitorExtendInfo = monitorExtendInfo;
            return this;
        }

        /**
         * The health check protocol. Valid values:
         * <p>
         * 
         * *   HTTP
         * *   HTTPS
         * *   PING
         * *   TCP
         */
        public Builder protocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The timeout period. Unit: milliseconds.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * The time when the information about the health check task was updated.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * The timestamp that indicates when the information about the health check task was updated.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeDnsGtmMonitorConfigResponseBody build() {
            return new DescribeDnsGtmMonitorConfigResponseBody(this);
        } 

    } 

    public static class IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("CountryName")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        private IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.countryCode = builder.countryCode;
            this.countryName = builder.countryName;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityNode create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return ispCode
         */
        public String getIspCode() {
            return this.ispCode;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private String countryCode; 
            private String countryName; 
            private String ispCode; 
            private String ispName; 

            /**
             * The code of the monitored city node.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * The display name of the monitored city node.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * The code of the country or region.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * The display name of the country or region.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * The code of the monitored Internet service provider (ISP) node.
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * The name of the ISP.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            public IspCityNode build() {
                return new IspCityNode(this);
            } 

        } 

    }
    public static class IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IspCityNode")
        private java.util.List < IspCityNode> ispCityNode;

        private IspCityNodes(Builder builder) {
            this.ispCityNode = builder.ispCityNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityNodes create() {
            return builder().build();
        }

        /**
         * @return ispCityNode
         */
        public java.util.List < IspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

        public static final class Builder {
            private java.util.List < IspCityNode> ispCityNode; 

            /**
             * IspCityNode.
             */
            public Builder ispCityNode(java.util.List < IspCityNode> ispCityNode) {
                this.ispCityNode = ispCityNode;
                return this;
            }

            public IspCityNodes build() {
                return new IspCityNodes(this);
            } 

        } 

    }
}
