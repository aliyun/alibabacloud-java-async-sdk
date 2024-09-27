// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddDnsGtmAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>AddDnsGtmAddressPoolRequest</p>
 */
public class AddDnsGtmAddressPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addr")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Addr> addr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    @com.aliyun.core.annotation.Validation(maximum = 9999999, minimum = 1)
    private Integer evaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(maximum = 9999999, minimum = 1)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspCityNode")
    private java.util.List < IspCityNode> ispCityNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LbaStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lbaStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorExtendInfo")
    private String monitorExtendInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorStatus")
    private String monitorStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(maximum = 9999999, minimum = 1)
    private Integer timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AddDnsGtmAddressPoolRequest(Builder builder) {
        super(builder);
        this.addr = builder.addr;
        this.evaluationCount = builder.evaluationCount;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.ispCityNode = builder.ispCityNode;
        this.lang = builder.lang;
        this.lbaStrategy = builder.lbaStrategy;
        this.monitorExtendInfo = builder.monitorExtendInfo;
        this.monitorStatus = builder.monitorStatus;
        this.name = builder.name;
        this.protocolType = builder.protocolType;
        this.timeout = builder.timeout;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDnsGtmAddressPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addr
     */
    public java.util.List < Addr> getAddr() {
        return this.addr;
    }

    /**
     * @return evaluationCount
     */
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return ispCityNode
     */
    public java.util.List < IspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lbaStrategy
     */
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    /**
     * @return monitorExtendInfo
     */
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    /**
     * @return monitorStatus
     */
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddDnsGtmAddressPoolRequest, Builder> {
        private java.util.List < Addr> addr; 
        private Integer evaluationCount; 
        private String instanceId; 
        private Integer interval; 
        private java.util.List < IspCityNode> ispCityNode; 
        private String lang; 
        private String lbaStrategy; 
        private String monitorExtendInfo; 
        private String monitorStatus; 
        private String name; 
        private String protocolType; 
        private Integer timeout; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddDnsGtmAddressPoolRequest request) {
            super(request);
            this.addr = request.addr;
            this.evaluationCount = request.evaluationCount;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.ispCityNode = request.ispCityNode;
            this.lang = request.lang;
            this.lbaStrategy = request.lbaStrategy;
            this.monitorExtendInfo = request.monitorExtendInfo;
            this.monitorStatus = request.monitorStatus;
            this.name = request.name;
            this.protocolType = request.protocolType;
            this.timeout = request.timeout;
            this.type = request.type;
        } 

        /**
         * <p>The address pools.</p>
         */
        public Builder addr(java.util.List < Addr> addr) {
            this.putQueryParameter("Addr", addr);
            this.addr = addr;
            return this;
        }

        /**
         * <p>The number of consecutive failures.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>instance1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The health check interval. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The nodes for monitoring.</p>
         */
        public Builder ispCityNode(java.util.List < IspCityNode> ispCityNode) {
            this.putQueryParameter("IspCityNode", ispCityNode);
            this.ispCityNode = ispCityNode;
            return this;
        }

        /**
         * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The load balancing policy of the address pool. Valid values:</p>
         * <ul>
         * <li>ALL_RR: returns all addresses.</li>
         * <li>RATIO: returns addresses by weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all_rr</p>
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.putQueryParameter("LbaStrategy", lbaStrategy);
            this.lbaStrategy = lbaStrategy;
            return this;
        }

        /**
         * <p>The extended information. The required parameters vary based on the health check protocol.</p>
         * <ul>
         * <li><p>HTTP or HTTPS:</p>
         * <ul>
         * <li><p>port: the port that you want to check</p>
         * </li>
         * <li><p>host: the host settings</p>
         * </li>
         * <li><p>path: the URL</p>
         * </li>
         * <li><p>code: the return code. The health check result is deemed abnormal if the returned value is greater than the specified value. Valid values: 400 and 500.</p>
         * </li>
         * <li><p>failureRate: the failure rate</p>
         * </li>
         * <li><p>sni: specifies whether to enable Server Name Indication (SNI). This parameter is available only when ProtocolType is set to HTTPS. Valid values:</p>
         * <ul>
         * <li>true: enables SNI.</li>
         * <li>other: disables SNI.</li>
         * </ul>
         * </li>
         * <li><p>nodeType: the type of the node for monitoring when Type is set to DOMAIN. Valid values:</p>
         * <ul>
         * <li>IPV4</li>
         * <li>IPV6</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>ping:</p>
         * <ul>
         * <li><p>failureRate: the failure rate</p>
         * </li>
         * <li><p>packetNum: the number of ping packets</p>
         * </li>
         * <li><p>packetLossRate: the loss rate of ping packets</p>
         * </li>
         * <li><p>nodeType: the type of the node for monitoring when Type is set to DOMAIN. Valid values:</p>
         * <ul>
         * <li>IPV4</li>
         * <li>IPV6</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>TCP:</p>
         * <ul>
         * <li><p>port: the port that you want to check</p>
         * </li>
         * <li><p>failureRate: the failure rate</p>
         * </li>
         * <li><p>nodeType: the type of the node for monitoring when Type is set to DOMAIN. Valid values:</p>
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
            this.putQueryParameter("MonitorExtendInfo", monitorExtendInfo);
            this.monitorExtendInfo = monitorExtendInfo;
            return this;
        }

        /**
         * <p>Specifies whether to enable the health check feature. If you set this parameter to OPEN, the system verifies the health check configurations. If you set this parameter to CLOSE, the system discards the health check configurations. Default value: CLOSE. Valid values:</p>
         * <ul>
         * <li>OPEN: enables the health check feature.</li>
         * <li>CLOSE: disables the health check feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder monitorStatus(String monitorStatus) {
            this.putQueryParameter("MonitorStatus", monitorStatus);
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * <p>The name of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The timeout period. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The type of the address pool. Valid values:</p>
         * <ul>
         * <li>IPV4: IPv4 address</li>
         * <li>IPV6: IPv6 address</li>
         * <li>DOMAIN: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddDnsGtmAddressPoolRequest build() {
            return new AddDnsGtmAddressPoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDnsGtmAddressPoolRequest} extends {@link TeaModel}
     *
     * <p>AddDnsGtmAddressPoolRequest</p>
     */
    public static class Addr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addr")
        @com.aliyun.core.annotation.Validation(required = true)
        private String addr;

        @com.aliyun.core.annotation.NameInMap("AttributeInfo")
        @com.aliyun.core.annotation.Validation(required = true)
        private String attributeInfo;

        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        @com.aliyun.core.annotation.NameInMap("Mode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private Addr(Builder builder) {
            this.addr = builder.addr;
            this.attributeInfo = builder.attributeInfo;
            this.lbaWeight = builder.lbaWeight;
            this.mode = builder.mode;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public String getAddr() {
            return this.addr;
        }

        /**
         * @return attributeInfo
         */
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        /**
         * @return lbaWeight
         */
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String addr; 
            private String attributeInfo; 
            private Integer lbaWeight; 
            private String mode; 
            private String remark; 

            /**
             * <p>The address in the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * <p>The information about the source region of the address. The value of this parameter is a JSON string. Valid values:</p>
             * <ul>
             * <li><p>lineCode: the line code of the source region for the address</p>
             * </li>
             * <li><p>lineCodeRectifyType: the rectification type of the line code. Default value: AUTO. Valid values:</p>
             * <ul>
             * <li>NO_NEED: no need for rectification</li>
             * <li>RECTIFIED: rectified</li>
             * <li>AUTO: automatic rectification</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder attributeInfo(String attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * <p>The weight of the address.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * <p>The return mode of the addresses: Valid values:</p>
             * <ul>
             * <li>SMART: smart return</li>
             * <li>ONLINE: always online</li>
             * <li>OFFLINE: always offline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The description of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Addr build() {
                return new Addr(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDnsGtmAddressPoolRequest} extends {@link TeaModel}
     *
     * <p>AddDnsGtmAddressPoolRequest</p>
     */
    public static class IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        private IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.ispCode = builder.ispCode;
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
         * @return ispCode
         */
        public String getIspCode() {
            return this.ispCode;
        }

        public static final class Builder {
            private String cityCode; 
            private String ispCode; 

            /**
             * <p>The city code.</p>
             * <p>Specify the parameter according to the value of CityCode returned by the DescribeGtmMonitorAvailableConfig operation.</p>
             * 
             * <strong>example:</strong>
             * <p>503</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <ul>
             * <li>The Internet service provider (ISP) node. Specify the parameter according to the value of IspCode returned by the DescribeGtmMonitorAvailableConfig operation.</li>
             * <li>If the returned value of GroupType for the DescribeGtmMonitorAvailableConfig operation is BGP or Overseas, IspCode is not required and is set to 465 by default.</li>
             * <li>If the returned value of GroupType for the DescribeGtmMonitorAvailableConfig operation is not BGP or Overseas, IspCode is required. When IspCode is specified, CityCode is required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            public IspCityNode build() {
                return new IspCityNode(this);
            } 

        } 

    }
}
