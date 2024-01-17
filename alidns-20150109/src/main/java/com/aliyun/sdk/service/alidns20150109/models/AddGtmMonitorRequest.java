// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmMonitorRequest} extends {@link RequestModel}
 *
 * <p>AddGtmMonitorRequest</p>
 */
public class AddGtmMonitorRequest extends Request {
    @Query
    @NameInMap("AddrPoolId")
    @Validation(required = true)
    private String addrPoolId;

    @Query
    @NameInMap("EvaluationCount")
    @Validation(required = true)
    private Integer evaluationCount;

    @Query
    @NameInMap("Interval")
    @Validation(required = true)
    private Integer interval;

    @Query
    @NameInMap("IspCityNode")
    @Validation(required = true)
    private java.util.List < IspCityNode> ispCityNode;

    @Query
    @NameInMap("Lang")
    private String lang;

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
    @Validation(required = true)
    private Integer timeout;

    private AddGtmMonitorRequest(Builder builder) {
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

    public static AddGtmMonitorRequest create() {
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

    public static final class Builder extends Request.Builder<AddGtmMonitorRequest, Builder> {
        private String addrPoolId; 
        private Integer evaluationCount; 
        private Integer interval; 
        private java.util.List < IspCityNode> ispCityNode; 
        private String lang; 
        private String monitorExtendInfo; 
        private String protocolType; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(AddGtmMonitorRequest request) {
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
         * The ID of the address pool.
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * The number of consecutive failures.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * The health check interval. Unit: seconds. Set the value to 60.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The nodes for monitoring.
         */
        public Builder ispCityNode(java.util.List < IspCityNode> ispCityNode) {
            this.putQueryParameter("IspCityNode", ispCityNode);
            this.ispCityNode = ispCityNode;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The extended information. The required parameters vary based on the health check protocol.
         * <p>
         * 
         * HTTP or HTTPS
         * 
         * *   port: the port that you want to check
         * *   failureRate: the failure rate
         * *   code: the return code. The health check result is deemed abnormal if the returned value is greater than the specified value. Valid values: 400 and 500.
         * *   host: the host settings
         * *   path: the URL path
         * 
         * PING
         * 
         * *   packetNum: the number of ping packets
         * *   packetLossRate: the packet loss rate
         * *   failureRate: the failure rate
         * 
         * TCP
         * 
         * *   port: the port that you want to check
         * *   failureRate: the failure rate
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
         * The health check timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public AddGtmMonitorRequest build() {
            return new AddGtmMonitorRequest(this);
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
             * The city code.
             * <p>
             * 
             * Specify the parameter according to the value of CityCode returned by the DescribeGtmMonitorAvailableConfig operation.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * The Internet service provider (ISP) node. Specify the parameter according to the value of IspCode returned by the DescribeGtmMonitorAvailableConfig operation.
             * <p>
             * 
             * *   If the return value of GroupType for the DescribeGtmMonitorAvailableConfig operation is BGP or Overseas, IspCode is not required and is set to 465 by default.
             * *   If the return value of GroupType for the DescribeGtmMonitorAvailableConfig operation is not BGP or Overseas, IspCode is required. When IspCode is specified, CityCode is required.
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
