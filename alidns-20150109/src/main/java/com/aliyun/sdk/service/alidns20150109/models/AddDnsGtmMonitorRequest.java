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
 * {@link AddDnsGtmMonitorRequest} extends {@link RequestModel}
 *
 * <p>AddDnsGtmMonitorRequest</p>
 */
public class AddDnsGtmMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddrPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addrPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 3, minimum = 1)
    private Integer evaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 60, minimum = 15)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspCityNode")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<IspCityNode> ispCityNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorExtendInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monitorExtendInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1000)
    private Integer timeout;

    private AddDnsGtmMonitorRequest(Builder builder) {
        super(builder);
        this.addrPoolId = builder.addrPoolId;
        this.evaluationCount = builder.evaluationCount;
        this.interval = builder.interval;
        this.ispCityNode = builder.ispCityNode;
        this.lang = builder.lang;
        this.monitorExtendInfo = builder.monitorExtendInfo;
        this.protocolType = builder.protocolType;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDnsGtmMonitorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addrPoolId
     */
    public String getAddrPoolId() {
        return this.addrPoolId;
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
     * @return ispCityNode
     */
    public java.util.List<IspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<AddDnsGtmMonitorRequest, Builder> {
        private String addrPoolId; 
        private Integer evaluationCount; 
        private Integer interval; 
        private java.util.List<IspCityNode> ispCityNode; 
        private String lang; 
        private String monitorExtendInfo; 
        private String protocolType; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(AddDnsGtmMonitorRequest request) {
            super(request);
            this.addrPoolId = request.addrPoolId;
            this.evaluationCount = request.evaluationCount;
            this.interval = request.interval;
            this.ispCityNode = request.ispCityNode;
            this.lang = request.lang;
            this.monitorExtendInfo = request.monitorExtendInfo;
            this.protocolType = request.protocolType;
            this.timeout = request.timeout;
        } 

        /**
         * <p>The ID of the address pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pool1</p>
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
         * <p>This parameter is required.</p>
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
         * <p>The health check interval. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The monitored nodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ispCityNode(java.util.List<IspCityNode> ispCityNode) {
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
         * <li><p>nodeType: the type of the node for monitoring when Type is set to DOMAIN. Valid values:</p>
         * <ul>
         * <li>IPV4</li>
         * <li>IPV6</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>PING</p>
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
         * <li><p>TCP</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The health check protocol. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * <li>PING</li>
         * <li>TCP</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public AddDnsGtmMonitorRequest build() {
            return new AddDnsGtmMonitorRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDnsGtmMonitorRequest} extends {@link TeaModel}
     *
     * <p>AddDnsGtmMonitorRequest</p>
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

            private Builder() {
            } 

            private Builder(IspCityNode model) {
                this.cityCode = model.cityCode;
                this.ispCode = model.ispCode;
            } 

            /**
             * <p>The code of the city where the monitored node is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The code of the Internet service provider (ISP) to which the monitored node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
