// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The name of the data center.</p>
         * <p>This parameter is required.</p>
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
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>076a446d-df7d-424c-bdc5-bb5dc7f1****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>The Windows port.</p>
         * <p>This parameter is required.</p>
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
        public AddIdcProbeRequest build() {
            return new AddIdcProbeRequest(this);
        } 

    } 

}
