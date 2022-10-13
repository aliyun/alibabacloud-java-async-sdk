// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardResponseBody</p>
 */
public class GetCardResponseBody extends TeaModel {
    @NameInMap("APN")
    private String APN;

    @NameInMap("ActivatedTime")
    private String activatedTime;

    @NameInMap("AlarmThreshold")
    private Long alarmThreshold;

    @NameInMap("CloudConnectorId")
    private String cloudConnectorId;

    @NameInMap("Description")
    private String description;

    @NameInMap("ISP")
    private String ISP;

    @NameInMap("Iccid")
    private String iccid;

    @NameInMap("Imei")
    private String imei;

    @NameInMap("Imsi")
    private String imsi;

    @NameInMap("IpAddress")
    private String ipAddress;

    @NameInMap("LimitThreshold")
    private Long limitThreshold;

    @NameInMap("Lock")
    private String lock;

    @NameInMap("Msisdn")
    private String msisdn;

    @NameInMap("Name")
    private String name;

    @NameInMap("NetType")
    private String netType;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SimStatus")
    private String simStatus;

    @NameInMap("Spec")
    private String spec;

    @NameInMap("Status")
    private String status;

    @NameInMap("StopThreshold")
    private Long stopThreshold;

    @NameInMap("UsageDataMonth")
    private Integer usageDataMonth;

    @NameInMap("UsageDataTotal")
    private Long usageDataTotal;

    @NameInMap("WirelessCloudConnectorId")
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
         * Id of the request
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
