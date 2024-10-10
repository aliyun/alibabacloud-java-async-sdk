// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The name of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder idcName(String idcName) {
            this.putQueryParameter("IdcName", idcName);
            this.idcName = idcName;
            return this;
        }

        /**
         * <p>The region ID of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        public Builder idcRegion(String idcRegion) {
            this.putQueryParameter("IdcRegion", idcRegion);
            this.idcRegion = idcRegion;
            return this;
        }

        /**
         * <p>The scan interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder intervalPeriod(Integer intervalPeriod) {
            this.putQueryParameter("IntervalPeriod", intervalPeriod);
            this.intervalPeriod = intervalPeriod;
            return this;
        }

        /**
         * <p>The settings of the CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        public Builder ipSegments(String ipSegments) {
            this.putQueryParameter("IpSegments", ipSegments);
            this.ipSegments = ipSegments;
            return this;
        }

        /**
         * <p>The Linux port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder linuxPort(String linuxPort) {
            this.putQueryParameter("LinuxPort", linuxPort);
            this.linuxPort = linuxPort;
            return this;
        }

        /**
         * <p>The unit of the scan interval. Valid values:</p>
         * <ul>
         * <li><strong>day</strong></li>
         * <li><strong>hour</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The usage status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: enabled.</li>
         * <li><strong>1</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b6d4072118f487094199cedf90c****,f6310b7976144639867beea2f346****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>The Windows port.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
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
