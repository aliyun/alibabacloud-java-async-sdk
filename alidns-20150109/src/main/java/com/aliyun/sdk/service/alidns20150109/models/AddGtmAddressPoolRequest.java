// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>AddGtmAddressPoolRequest</p>
 */
public class AddGtmAddressPoolRequest extends Request {
    @Query
    @NameInMap("Addr")
    @Validation(required = true)
    private java.util.List < Addr> addr;

    @Query
    @NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Interval")
    private Integer interval;

    @Query
    @NameInMap("IspCityNode")
    private java.util.List < IspCityNode> ispCityNode;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MinAvailableAddrNum")
    @Validation(required = true)
    private Integer minAvailableAddrNum;

    @Query
    @NameInMap("MonitorExtendInfo")
    private String monitorExtendInfo;

    @Query
    @NameInMap("MonitorStatus")
    private String monitorStatus;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private AddGtmAddressPoolRequest(Builder builder) {
        super(builder);
        this.addr = builder.addr;
        this.evaluationCount = builder.evaluationCount;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.ispCityNode = builder.ispCityNode;
        this.lang = builder.lang;
        this.minAvailableAddrNum = builder.minAvailableAddrNum;
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

    public static AddGtmAddressPoolRequest create() {
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
     * @return minAvailableAddrNum
     */
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
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

    public static final class Builder extends Request.Builder<AddGtmAddressPoolRequest, Builder> {
        private java.util.List < Addr> addr; 
        private Integer evaluationCount; 
        private String instanceId; 
        private Integer interval; 
        private java.util.List < IspCityNode> ispCityNode; 
        private String lang; 
        private Integer minAvailableAddrNum; 
        private String monitorExtendInfo; 
        private String monitorStatus; 
        private String name; 
        private String protocolType; 
        private Integer timeout; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddGtmAddressPoolRequest request) {
            super(request);
            this.addr = request.addr;
            this.evaluationCount = request.evaluationCount;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.ispCityNode = request.ispCityNode;
            this.lang = request.lang;
            this.minAvailableAddrNum = request.minAvailableAddrNum;
            this.monitorExtendInfo = request.monitorExtendInfo;
            this.monitorStatus = request.monitorStatus;
            this.name = request.name;
            this.protocolType = request.protocolType;
            this.timeout = request.timeout;
            this.type = request.type;
        } 

        /**
         * The address pools.
         */
        public Builder addr(java.util.List < Addr> addr) {
            this.putQueryParameter("Addr", addr);
            this.addr = addr;
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
         * The ID of the GTM instance for which you want to create an address pool.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * The monitored nodes.
         */
        public Builder ispCityNode(java.util.List < IspCityNode> ispCityNode) {
            this.putQueryParameter("IspCityNode", ispCityNode);
            this.ispCityNode = ispCityNode;
            return this;
        }

        /**
         * The language of the values of specific response parameters.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The minimum number of available addresses in the address pool.
         */
        public Builder minAvailableAddrNum(Integer minAvailableAddrNum) {
            this.putQueryParameter("MinAvailableAddrNum", minAvailableAddrNum);
            this.minAvailableAddrNum = minAvailableAddrNum;
            return this;
        }

        /**
         * The extended information. The required parameters vary based on the value of ProtocolType.
         * <p>
         * 
         * When ProtocolType is set to HTTP or HTTPS:
         * 
         * *   port: the port that you want to check
         * *   failureRate: the failure rate
         * *   code: the return code. The health check result is deemed abnormal if the returned value is greater than the specified value. Valid values: 400 and 500.
         * *   host: the host settings
         * *   path: the URL path
         * 
         * When ProtocolType is set to PING:
         * 
         * *   packetNum: the number of ping packets
         * *   packetLossRate: the packet loss rate
         * *   failureRate: the failure rate
         * 
         * When ProtocolType is set to TCP:
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
         * Specifies whether to enable the health check. Valid values:
         * <p>
         * 
         * *   **OPEN**: enables the health check.
         * *   **CLOSE**: disables the health check. This is the default value.
         */
        public Builder monitorStatus(String monitorStatus) {
            this.putQueryParameter("MonitorStatus", monitorStatus);
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * The name of the address pool.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The health check protocol. Valid values:
         * <p>
         * 
         * *   HTTP
         * *   HTTPS
         * *   Ping
         * *   TCP
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * The timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The type of the address pool. Valid values:
         * <p>
         * 
         * *   **IP**: IPv4 address
         * *   **DOMAIN**: domain name
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddGtmAddressPoolRequest build() {
            return new AddGtmAddressPoolRequest(this);
        } 

    } 

    public static class Addr extends TeaModel {
        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Value")
        private String value;

        private Addr(Builder builder) {
            this.lbaWeight = builder.lbaWeight;
            this.mode = builder.mode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer lbaWeight; 
            private String mode; 
            private String value; 

            /**
             * The weight of the address pool.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * The mode of the address pool. Valid values:
             * <p>
             * 
             * *   **SMART**: smart return
             * *   **ONLINE**: always online
             * *   **OFFLINE**: always offline
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The address in the address pool.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Addr build() {
                return new Addr(this);
            } 

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
             * The code of the city where the monitored node is deployed. For more information about specific values, see the response parameters of DescribeGtmMonitorAvailableConfig.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * *   The code of the Internet service provider (ISP) to which the monitored node belongs. For more information about specific values, see the response parameters of DescribeGtmMonitorAvailableConfig.
             * <p>
             * *   If the value of the GroupType parameter is BGP or OVERSEAS, IspCode is optional. The default value is 465.
             * *   If the value of the GroupType parameter is not BGP or OVERSEAS, IspCode is required and is used together with CityCode.
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
