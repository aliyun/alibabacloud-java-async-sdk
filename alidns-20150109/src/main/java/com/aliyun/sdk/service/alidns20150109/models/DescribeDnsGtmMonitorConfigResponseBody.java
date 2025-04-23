// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDnsGtmMonitorConfigResponseBody model) {
            this.createTime = model.createTime;
            this.createTimestamp = model.createTimestamp;
            this.evaluationCount = model.evaluationCount;
            this.interval = model.interval;
            this.ispCityNodes = model.ispCityNodes;
            this.monitorConfigId = model.monitorConfigId;
            this.monitorExtendInfo = model.monitorExtendInfo;
            this.protocolType = model.protocolType;
            this.requestId = model.requestId;
            this.timeout = model.timeout;
            this.updateTime = model.updateTime;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>The time when the health check configuration was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the health check configuration was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The number of consecutive failures.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * <p>The health check interval. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The health check nodes.</p>
         */
        public Builder ispCityNodes(IspCityNodes ispCityNodes) {
            this.ispCityNodes = ispCityNodes;
            return this;
        }

        /**
         * <p>The ID of the health check configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>MonitorConfigId1</p>
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * <p>The extended information. The required parameters vary based on the value of ProtocolType.</p>
         * <ul>
         * <li><p>HTTP or HTTPS</p>
         * <ul>
         * <li><p>port: the port that you want to check</p>
         * </li>
         * <li><p>host: the host settings</p>
         * </li>
         * <li><p>path: the URL path</p>
         * </li>
         * <li><p>code: the response code. The health check result is deemed abnormal if the returned value is greater than the specified value.</p>
         * </li>
         * <li><p>failureRate: the failure rate</p>
         * </li>
         * <li><p>sni: specifies whether to enable server name indication (SNI). This parameter is available only when ProtocolType is set to HTTPS. Valid values:</p>
         * <ul>
         * <li>true: enables SNI.</li>
         * <li>false: disables SNI.</li>
         * </ul>
         * </li>
         * <li><p>nodeType: the type of the node for monitoring when the address pool type is domain name. Valid values:</p>
         * <ul>
         * <li>IPV4</li>
         * <li>IPV6</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>PING:</p>
         * <ul>
         * <li><p>failureRate: the failure rate</p>
         * </li>
         * <li><p>packetNum: the number of ping packets</p>
         * </li>
         * <li><p>packetLossRate: the loss rate of ping packets</p>
         * </li>
         * <li><p>nodeType: the type of the node for monitoring when the address pool type is domain name. Valid values:</p>
         * <ul>
         * <li>IPV4</li>
         * <li>IPV6</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>TCP</p>
         * <ul>
         * <li><p>port: the port that you want to check</p>
         * </li>
         * <li><p>failureRate: the failure rate</p>
         * </li>
         * <li><p>nodeType: the type of the node for monitoring when the address pool type is domain name. Valid values:</p>
         * <ul>
         * <li>IPV4</li>
         * <li>IPV6</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:200,&quot;path&quot;:&quot;\index.htm&quot;,&quot;host&quot;:&quot;aliyun.com&quot;}</p>
         */
        public Builder monitorExtendInfo(String monitorExtendInfo) {
            this.monitorExtendInfo = monitorExtendInfo;
            return this;
        }

        /**
         * <p>The health check protocol. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * <li>PING</li>
         * <li>TCP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        public Builder protocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timeout period. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The time when the health check configuration was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-03T08:57Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The time when the health check configuration was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeDnsGtmMonitorConfigResponseBody build() {
            return new DescribeDnsGtmMonitorConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsGtmMonitorConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorConfigResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IspCityNode model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.countryCode = model.countryCode;
                this.countryName = model.countryName;
                this.ispCode = model.ispCode;
                this.ispName = model.ispName;
            } 

            /**
             * <p>The city code.</p>
             * 
             * <strong>example:</strong>
             * <p>572</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The display name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>Qingdao</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The code of the country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>001</p>
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * <p>The display name of the country or region.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) code.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * <p>The display name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
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
    /**
     * 
     * {@link DescribeDnsGtmMonitorConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorConfigResponseBody</p>
     */
    public static class IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IspCityNode")
        private java.util.List<IspCityNode> ispCityNode;

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
        public java.util.List<IspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

        public static final class Builder {
            private java.util.List<IspCityNode> ispCityNode; 

            private Builder() {
            } 

            private Builder(IspCityNodes model) {
                this.ispCityNode = model.ispCityNode;
            } 

            /**
             * IspCityNode.
             */
            public Builder ispCityNode(java.util.List<IspCityNode> ispCityNode) {
                this.ispCityNode = ispCityNode;
                return this;
            }

            public IspCityNodes build() {
                return new IspCityNodes(this);
            } 

        } 

    }
}
