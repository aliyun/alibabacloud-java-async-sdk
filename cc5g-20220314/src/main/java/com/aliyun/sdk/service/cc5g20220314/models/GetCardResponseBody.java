// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardResponseBody</p>
 */
public class GetCardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("APN")
    private String APN;

    @com.aliyun.core.annotation.NameInMap("ActivatedTime")
    private String activatedTime;

    @com.aliyun.core.annotation.NameInMap("AlarmThreshold")
    private Long alarmThreshold;

    @com.aliyun.core.annotation.NameInMap("CloudConnectorId")
    private String cloudConnectorId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ISP")
    private String ISP;

    @com.aliyun.core.annotation.NameInMap("Iccid")
    private String iccid;

    @com.aliyun.core.annotation.NameInMap("Imei")
    private String imei;

    @com.aliyun.core.annotation.NameInMap("Imsi")
    private String imsi;

    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.NameInMap("LimitThreshold")
    private Long limitThreshold;

    @com.aliyun.core.annotation.NameInMap("Lock")
    private String lock;

    @com.aliyun.core.annotation.NameInMap("Msisdn")
    private String msisdn;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NetType")
    private String netType;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SimStatus")
    private String simStatus;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StopThreshold")
    private Long stopThreshold;

    @com.aliyun.core.annotation.NameInMap("UsageDataMonth")
    private Integer usageDataMonth;

    @com.aliyun.core.annotation.NameInMap("UsageDataTotal")
    private Long usageDataTotal;

    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    private String wirelessCloudConnectorId;

    private GetCardResponseBody(Builder builder) {
        this.APN = builder.APN;
        this.activatedTime = builder.activatedTime;
        this.alarmThreshold = builder.alarmThreshold;
        this.cloudConnectorId = builder.cloudConnectorId;
        this.description = builder.description;
        this.ISP = builder.ISP;
        this.iccid = builder.iccid;
        this.imei = builder.imei;
        this.imsi = builder.imsi;
        this.ipAddress = builder.ipAddress;
        this.limitThreshold = builder.limitThreshold;
        this.lock = builder.lock;
        this.msisdn = builder.msisdn;
        this.name = builder.name;
        this.netType = builder.netType;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.simStatus = builder.simStatus;
        this.spec = builder.spec;
        this.status = builder.status;
        this.stopThreshold = builder.stopThreshold;
        this.usageDataMonth = builder.usageDataMonth;
        this.usageDataTotal = builder.usageDataTotal;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardResponseBody create() {
        return builder().build();
    }

    /**
     * @return APN
     */
    public String getAPN() {
        return this.APN;
    }

    /**
     * @return activatedTime
     */
    public String getActivatedTime() {
        return this.activatedTime;
    }

    /**
     * @return alarmThreshold
     */
    public Long getAlarmThreshold() {
        return this.alarmThreshold;
    }

    /**
     * @return cloudConnectorId
     */
    public String getCloudConnectorId() {
        return this.cloudConnectorId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    /**
     * @return imei
     */
    public String getImei() {
        return this.imei;
    }

    /**
     * @return imsi
     */
    public String getImsi() {
        return this.imsi;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return limitThreshold
     */
    public Long getLimitThreshold() {
        return this.limitThreshold;
    }

    /**
     * @return lock
     */
    public String getLock() {
        return this.lock;
    }

    /**
     * @return msisdn
     */
    public String getMsisdn() {
        return this.msisdn;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return simStatus
     */
    public String getSimStatus() {
        return this.simStatus;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stopThreshold
     */
    public Long getStopThreshold() {
        return this.stopThreshold;
    }

    /**
     * @return usageDataMonth
     */
    public Integer getUsageDataMonth() {
        return this.usageDataMonth;
    }

    /**
     * @return usageDataTotal
     */
    public Long getUsageDataTotal() {
        return this.usageDataTotal;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder {
        private String APN; 
        private String activatedTime; 
        private Long alarmThreshold; 
        private String cloudConnectorId; 
        private String description; 
        private String ISP; 
        private String iccid; 
        private String imei; 
        private String imsi; 
        private String ipAddress; 
        private Long limitThreshold; 
        private String lock; 
        private String msisdn; 
        private String name; 
        private String netType; 
        private String orderId; 
        private String requestId; 
        private String simStatus; 
        private String spec; 
        private String status; 
        private Long stopThreshold; 
        private Integer usageDataMonth; 
        private Long usageDataTotal; 
        private String wirelessCloudConnectorId; 

        /**
         * APN.
         */
        public Builder APN(String APN) {
            this.APN = APN;
            return this;
        }

        /**
         * ActivatedTime.
         */
        public Builder activatedTime(String activatedTime) {
            this.activatedTime = activatedTime;
            return this;
        }

        /**
         * AlarmThreshold.
         */
        public Builder alarmThreshold(Long alarmThreshold) {
            this.alarmThreshold = alarmThreshold;
            return this;
        }

        /**
         * CloudConnectorId.
         */
        public Builder cloudConnectorId(String cloudConnectorId) {
            this.cloudConnectorId = cloudConnectorId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ISP.
         */
        public Builder ISP(String ISP) {
            this.ISP = ISP;
            return this;
        }

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.iccid = iccid;
            return this;
        }

        /**
         * Imei.
         */
        public Builder imei(String imei) {
            this.imei = imei;
            return this;
        }

        /**
         * Imsi.
         */
        public Builder imsi(String imsi) {
            this.imsi = imsi;
            return this;
        }

        /**
         * IpAddress.
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * LimitThreshold.
         */
        public Builder limitThreshold(Long limitThreshold) {
            this.limitThreshold = limitThreshold;
            return this;
        }

        /**
         * Lock.
         */
        public Builder lock(String lock) {
            this.lock = lock;
            return this;
        }

        /**
         * Msisdn.
         */
        public Builder msisdn(String msisdn) {
            this.msisdn = msisdn;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.netType = netType;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SimStatus.
         */
        public Builder simStatus(String simStatus) {
            this.simStatus = simStatus;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StopThreshold.
         */
        public Builder stopThreshold(Long stopThreshold) {
            this.stopThreshold = stopThreshold;
            return this;
        }

        /**
         * UsageDataMonth.
         */
        public Builder usageDataMonth(Integer usageDataMonth) {
            this.usageDataMonth = usageDataMonth;
            return this;
        }

        /**
         * UsageDataTotal.
         */
        public Builder usageDataTotal(Long usageDataTotal) {
            this.usageDataTotal = usageDataTotal;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        public GetCardResponseBody build() {
            return new GetCardResponseBody(this);
        } 

    } 

}
