// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsGtmMonitorRequest} extends {@link RequestModel}
 *
 * <p>AddDnsGtmMonitorRequest</p>
 */
public class AddDnsGtmMonitorRequest extends Request {
    @Query
    @NameInMap("AddrPoolId")
    @Validation(required = true)
    private String addrPoolId;

    @Query
    @NameInMap("EvaluationCount")
    @Validation(required = true, maximum = 3, minimum = 1)
    private Integer evaluationCount;

    @Query
    @NameInMap("Interval")
    @Validation(required = true, maximum = 60, minimum = 15)
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
    @Validation(required = true, maximum = 10000, minimum = 1000)
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

    public static final class Builder extends Request.Builder<AddDnsGtmMonitorRequest, Builder> {
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

        private Builder(AddDnsGtmMonitorRequest response) {
            super(response);
            this.addrPoolId = response.addrPoolId;
            this.evaluationCount = response.evaluationCount;
            this.interval = response.interval;
            this.ispCityNode = response.ispCityNode;
            this.lang = response.lang;
            this.monitorExtendInfo = response.monitorExtendInfo;
            this.protocolType = response.protocolType;
            this.timeout = response.timeout;
        } 

        /**
         * AddrPoolId.
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * EvaluationCount.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * IspCityNode.
         */
        public Builder ispCityNode(java.util.List < IspCityNode> ispCityNode) {
            this.putQueryParameter("IspCityNode", ispCityNode);
            this.ispCityNode = ispCityNode;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MonitorExtendInfo.
         */
        public Builder monitorExtendInfo(String monitorExtendInfo) {
            this.putQueryParameter("MonitorExtendInfo", monitorExtendInfo);
            this.monitorExtendInfo = monitorExtendInfo;
            return this;
        }

        /**
         * ProtocolType.
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * Timeout.
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
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * IspCode.
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
