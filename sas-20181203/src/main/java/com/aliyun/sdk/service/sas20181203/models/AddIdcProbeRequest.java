// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIdcProbeRequest} extends {@link RequestModel}
 *
 * <p>AddIdcProbeRequest</p>
 */
public class AddIdcProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idcName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdcRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idcRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer intervalPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSegments")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipSegments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinuxPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String linuxPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WinPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String winPort;

    private AddIdcProbeRequest(Builder builder) {
        super(builder);
        this.idcName = builder.idcName;
        this.idcRegion = builder.idcRegion;
        this.intervalPeriod = builder.intervalPeriod;
        this.ipSegments = builder.ipSegments;
        this.linuxPort = builder.linuxPort;
        this.periodUnit = builder.periodUnit;
        this.uuids = builder.uuids;
        this.winPort = builder.winPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIdcProbeRequest create() {
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

    public static final class Builder extends Request.Builder<AddIdcProbeRequest, Builder> {
        private String idcName; 
        private String idcRegion; 
        private Integer intervalPeriod; 
        private String ipSegments; 
        private String linuxPort; 
        private String periodUnit; 
        private String uuids; 
        private String winPort; 

        private Builder() {
            super();
        } 

        private Builder(AddIdcProbeRequest request) {
            super(request);
            this.idcName = request.idcName;
            this.idcRegion = request.idcRegion;
            this.intervalPeriod = request.intervalPeriod;
            this.ipSegments = request.ipSegments;
            this.linuxPort = request.linuxPort;
            this.periodUnit = request.periodUnit;
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
         * The region ID.
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
         * The UUID of the server. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUID.
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
        public AddIdcProbeRequest build() {
            return new AddIdcProbeRequest(this);
        } 

    } 

}
