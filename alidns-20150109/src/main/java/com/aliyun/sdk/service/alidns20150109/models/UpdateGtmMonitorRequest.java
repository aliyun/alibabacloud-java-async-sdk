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
 * {@link UpdateGtmMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateGtmMonitorRequest</p>
 */
public class UpdateGtmMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspCityNode")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<IspCityNode> ispCityNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monitorConfigId;

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
    private Integer timeout;

    private UpdateGtmMonitorRequest(Builder builder) {
        super(builder);
        this.evaluationCount = builder.evaluationCount;
        this.interval = builder.interval;
        this.ispCityNode = builder.ispCityNode;
        this.lang = builder.lang;
        this.monitorConfigId = builder.monitorConfigId;
        this.monitorExtendInfo = builder.monitorExtendInfo;
        this.protocolType = builder.protocolType;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGtmMonitorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<UpdateGtmMonitorRequest, Builder> {
        private Integer evaluationCount; 
        private Integer interval; 
        private java.util.List<IspCityNode> ispCityNode; 
        private String lang; 
        private String monitorConfigId; 
        private String monitorExtendInfo; 
        private String protocolType; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGtmMonitorRequest request) {
            super(request);
            this.evaluationCount = request.evaluationCount;
            this.interval = request.interval;
            this.ispCityNode = request.ispCityNode;
            this.lang = request.lang;
            this.monitorConfigId = request.monitorConfigId;
            this.monitorExtendInfo = request.monitorExtendInfo;
            this.protocolType = request.protocolType;
            this.timeout = request.timeout;
        } 

        /**
         * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * <p>The health check interval. Unit: seconds. Set the value to 60.</p>
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
         * <p>The language of the values of specific response parameters.</p>
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
         * <p>The ID of the health check configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abc</p>
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.putQueryParameter("MonitorConfigId", monitorConfigId);
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * <p>The extended information, that is, the parameters required for the protocol. Different protocols require different parameters:</p>
         * <p>HTTP or HTTPS:</p>
         * <ul>
         * <li>port: the port to check.</li>
         * <li>failureRate: the failure rate.</li>
         * <li>code: the status code threshold. If the returned status code is greater than the specified threshold, the application service is deemed abnormal. Valid values: 400 and 500.</li>
         * <li>host: the host configuration.</li>
         * <li>path: the health check URL.</li>
         * </ul>
         * <p>PING:</p>
         * <ul>
         * <li>packetNum: the number of ping packets.</li>
         * <li>packetLossRate: the loss rate of ping packets.</li>
         * <li>failureRate: the failure rate.</li>
         * </ul>
         * <p>TCP:</p>
         * <ul>
         * <li>port: the port to check.</li>
         * <li>failureRate: the failure rate.</li>
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
         * <p>The protocol used for the health check.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The health check timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public UpdateGtmMonitorRequest build() {
            return new UpdateGtmMonitorRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGtmMonitorRequest} extends {@link TeaModel}
     *
     * <p>UpdateGtmMonitorRequest</p>
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
             * <p>572</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <ul>
             * <li>The code of the Internet service provider (ISP) to which the monitored node belongs. For more information about specific values, see the response parameters of DescribeGtmMonitorAvailableConfig.</li>
             * <li>If the value of the GroupType parameter is BGP or OVERSEAS, IspCode is optional. The default value is 465.</li>
             * <li>If the value of the GroupType parameter is not BGP or OVERSEAS, IspCode is required and is used together with CityCode.</li>
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
