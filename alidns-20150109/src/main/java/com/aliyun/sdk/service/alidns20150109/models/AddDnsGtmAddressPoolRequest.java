// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsGtmAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>AddDnsGtmAddressPoolRequest</p>
 */
public class AddDnsGtmAddressPoolRequest extends Request {
    @Query
    @NameInMap("Addr")
    @Validation(required = true)
    private java.util.List < Addr> addr;

    @Query
    @NameInMap("EvaluationCount")
    @Validation(maximum = 9999999, minimum = 1)
    private Integer evaluationCount;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Interval")
    @Validation(maximum = 9999999, minimum = 1)
    private Integer interval;

    @Query
    @NameInMap("IspCityNode")
    private java.util.List < IspCityNode> ispCityNode;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LbaStrategy")
    @Validation(required = true)
    private String lbaStrategy;

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
    @Validation(maximum = 9999999, minimum = 1)
    private Integer timeout;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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

        private Builder(AddDnsGtmAddressPoolRequest response) {
            super(response);
            this.addr = response.addr;
            this.evaluationCount = response.evaluationCount;
            this.instanceId = response.instanceId;
            this.interval = response.interval;
            this.ispCityNode = response.ispCityNode;
            this.lang = response.lang;
            this.lbaStrategy = response.lbaStrategy;
            this.monitorExtendInfo = response.monitorExtendInfo;
            this.monitorStatus = response.monitorStatus;
            this.name = response.name;
            this.protocolType = response.protocolType;
            this.timeout = response.timeout;
            this.type = response.type;
        } 

        /**
         * Addr.
         */
        public Builder addr(java.util.List < Addr> addr) {
            this.putQueryParameter("Addr", addr);
            this.addr = addr;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * LbaStrategy.
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.putQueryParameter("LbaStrategy", lbaStrategy);
            this.lbaStrategy = lbaStrategy;
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
         * MonitorStatus.
         */
        public Builder monitorStatus(String monitorStatus) {
            this.putQueryParameter("MonitorStatus", monitorStatus);
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        /**
         * Type.
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

    public static class Addr extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        private String addr;

        @NameInMap("AttributeInfo")
        @Validation(required = true)
        private String attributeInfo;

        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Mode")
        @Validation(required = true)
        private String mode;

        @NameInMap("Remark")
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
             * Addr.
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * AttributeInfo.
             */
            public Builder attributeInfo(String attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * LbaWeight.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Remark.
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
