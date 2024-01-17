// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDnsGtmMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateDnsGtmMonitorRequest</p>
 */
public class UpdateDnsGtmMonitorRequest extends Request {
    @Query
    @NameInMap("EvaluationCount")
    @Validation(maximum = 3, minimum = 1)
    private Integer evaluationCount;

    @Query
    @NameInMap("Interval")
    @Validation(maximum = 60, minimum = 15)
    private Integer interval;

    @Query
    @NameInMap("IspCityNode")
    @Validation(required = true)
    private java.util.List < IspCityNode> ispCityNode;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    private String monitorConfigId;

    @Query
    @NameInMap("MonitorExtendInfo")
    @Validation(required = true)
    private String monitorExtendInfo;

    @Query
    @NameInMap("ProtocolType")
    @Validation(required = true)
    private String protocolType;

    @Query
    @NameInMap("Timeout")
    @Validation(maximum = 10000, minimum = 1000)
    private Integer timeout;

    private UpdateDnsGtmMonitorRequest(Builder builder) {
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

    public static UpdateDnsGtmMonitorRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDnsGtmMonitorRequest, Builder> {
        private Integer evaluationCount; 
        private Integer interval; 
        private java.util.List < IspCityNode> ispCityNode; 
        private String lang; 
        private String monitorConfigId; 
        private String monitorExtendInfo; 
        private String protocolType; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDnsGtmMonitorRequest request) {
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
         * The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * The health check interval. Unit: seconds.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The monitored nodes.
         */
        public Builder ispCityNode(java.util.List < IspCityNode> ispCityNode) {
            this.putQueryParameter("IspCityNode", ispCityNode);
            this.ispCityNode = ispCityNode;
            return this;
        }

        /**
         * The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the health check configuration.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.putQueryParameter("MonitorConfigId", monitorConfigId);
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * The extended information. The required parameters vary based on the health check protocol.
         * <p>
         * 
         * *   HTTP or HTTPS
         * 
         *     *   port: the port that you want to check
         * 
         *     *   host: the host settings
         * 
         *     *   path: the URL path
         * 
         *     *   code: the return code. If the return value of code is greater than the specified value, the health check result is deemed abnormal. For example, if code is set to 400 and the code 404 is returned, the health check result is deemed abnormal.
         * 
         *     *   failureRate: the failure rate
         * 
         *     *   sni: specifies whether to enable server name indication (SNI). This parameter is available only when ProtocolType is set to HTTPS. Valid values:
         * 
         *         *   true: enables SNI.
         *         *   false: disables SNI.
         * 
         *     *   nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:
         * 
         *         *   IPV4
         *         *   IPV6
         * 
         * *   PING
         * 
         *     *   failureRate: the failure rate
         * 
         *     *   packetNum: the number of ping packets
         * 
         *     *   packetLossRate: the loss rate of ping packets
         * 
         *     *   nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:
         * 
         *         *   IPV4
         *         *   IPV6
         * 
         * *   TCP
         * 
         *     *   port: the port that you want to check
         * 
         *     *   failureRate: the failure rate
         * 
         *     *   nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:
         * 
         *         *   IPV4
         *         *   IPV6
         */
        public Builder monitorExtendInfo(String monitorExtendInfo) {
            this.putQueryParameter("MonitorExtendInfo", monitorExtendInfo);
            this.monitorExtendInfo = monitorExtendInfo;
            return this;
        }

        /**
         * The protocol used for the health check. Valid values:
         * <p>
         * 
         * *   HTTP
         * *   HTTPS
         * *   PING
         * *   TCP
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * The health check timeout period. Unit: milliseconds.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public UpdateDnsGtmMonitorRequest build() {
            return new UpdateDnsGtmMonitorRequest(this);
        } 

    } 

    public static class IspCityNode extends TeaModel {
        @NameInMap("CityCode")
        private String cityCode;

        @NameInMap("IspCode")
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
             * The code of the city where the monitored node is deployed.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * The code of the Internet service provider (ISP) to which the monitored node belongs.
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
