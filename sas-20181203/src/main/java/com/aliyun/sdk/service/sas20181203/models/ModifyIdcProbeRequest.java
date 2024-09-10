// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIdcProbeRequest} extends {@link RequestModel}
 *
 * <p>ModifyIdcProbeRequest</p>
 */
public class ModifyIdcProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdcName")
    private String idcName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdcRegion")
    private String idcRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalPeriod")
    private Integer intervalPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSegments")
    private String ipSegments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinuxPort")
    private String linuxPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WinPort")
    private String winPort;

    private ModifyIdcProbeRequest(Builder builder) {
        super(builder);
        this.idcName = builder.idcName;
        this.idcRegion = builder.idcRegion;
        this.intervalPeriod = builder.intervalPeriod;
        this.ipSegments = builder.ipSegments;
        this.linuxPort = builder.linuxPort;
        this.periodUnit = builder.periodUnit;
        this.status = builder.status;
        this.uuids = builder.uuids;
        this.winPort = builder.winPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIdcProbeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idcName
     */
    public String getIdcName() {
        return this.idcName;
    }

    /**
     * @return idcRegion
     */
    public String getIdcRegion() {
        return this.idcRegion;
    }

    /**
     * @return intervalPeriod
     */
    public Integer getIntervalPeriod() {
        return this.intervalPeriod;
    }

    /**
     * @return ipSegments
     */
    public String getIpSegments() {
        return this.ipSegments;
    }

    /**
     * @return linuxPort
     */
    public String getLinuxPort() {
        return this.linuxPort;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    /**
     * @return winPort
     */
    public String getWinPort() {
        return this.winPort;
    }

    public static final class Builder extends Request.Builder<ModifyIdcProbeRequest, Builder> {
        private String idcName; 
        private String idcRegion; 
        private Integer intervalPeriod; 
        private String ipSegments; 
        private String linuxPort; 
        private String periodUnit; 
        private Integer status; 
        private String uuids; 
        private String winPort; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIdcProbeRequest request) {
            super(request);
            this.idcName = request.idcName;
            this.idcRegion = request.idcRegion;
            this.intervalPeriod = request.intervalPeriod;
            this.ipSegments = request.ipSegments;
            this.linuxPort = request.linuxPort;
            this.periodUnit = request.periodUnit;
            this.status = request.status;
            this.uuids = request.uuids;
            this.winPort = request.winPort;
        } 

        /**
         * The name of the data center.
         */
        public Builder idcName(String idcName) {
            this.putQueryParameter("IdcName", idcName);
            this.idcName = idcName;
            return this;
        }

        /**
         * The region ID of the data center.
         */
        public Builder idcRegion(String idcRegion) {
            this.putQueryParameter("IdcRegion", idcRegion);
            this.idcRegion = idcRegion;
            return this;
        }

        /**
         * The scan interval.
         */
        public Builder intervalPeriod(Integer intervalPeriod) {
            this.putQueryParameter("IntervalPeriod", intervalPeriod);
            this.intervalPeriod = intervalPeriod;
            return this;
        }

        /**
         * The settings of the CIDR block.
         */
        public Builder ipSegments(String ipSegments) {
            this.putQueryParameter("IpSegments", ipSegments);
            this.ipSegments = ipSegments;
            return this;
        }

        /**
         * The Linux port.
         */
        public Builder linuxPort(String linuxPort) {
            this.putQueryParameter("LinuxPort", linuxPort);
            this.linuxPort = linuxPort;
            return this;
        }

        /**
         * The unit of the scan interval. Valid values:
         * <p>
         * 
         * *   **day**
         * *   **hour**
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The usage status. Valid values:
         * <p>
         * 
         * *   **0**: enabled.
         * *   **1**: disabled.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The UUID of the server. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUID.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * The Windows port.
         */
        public Builder winPort(String winPort) {
            this.putQueryParameter("WinPort", winPort);
            this.winPort = winPort;
            return this;
        }

        @Override
        public ModifyIdcProbeRequest build() {
            return new ModifyIdcProbeRequest(this);
        } 

    } 

}
