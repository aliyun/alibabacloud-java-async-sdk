// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeAvailableResourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableResourceRequest</p>
 */
public class DescribeAvailableResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeAvailableResourceRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.coreInstanceType = builder.coreInstanceType;
        this.diskType = builder.diskType;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.regionId = builder.regionId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableResourceRequest, Builder> {
        private String chargeType; 
        private String coreInstanceType; 
        private String diskType; 
        private String engine; 
        private String engineVersion; 
        private String regionId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableResourceRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.coreInstanceType = request.coreInstanceType;
            this.diskType = request.diskType;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.regionId = request.regionId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The specifications of the core node. For more information about valid values, see <a href="https://help.aliyun.com/document_detail/194870.html">Instance node specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase.sn1.large</p>
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * <p>The disk type of the core node. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: ultra cloud disk</li>
         * <li><strong>cloud_ssd</strong>: standard SSD</li>
         * <li><strong>cloud_essd_pl1</strong>: ESSD</li>
         * <li><strong>local_hdd_pro</strong>: local HDD</li>
         * <li><strong>local_ssd_pro</strong>: local SSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The service type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>hbase</strong>: ApsaraDB for HBase Standard Edition standard instance.</li>
         * <li><strong>hbaseue</strong>: ApsaraDB for HBase Performance-enhanced Edition standard instance.</li>
         * <li><strong>singlehbase</strong>: ApsaraDB for HBase single-node standard instance.</li>
         * <li><strong>bds</strong>: Data Synchronization (BDS) service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hbaseue</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The version number of the service type. Valid values:</p>
         * <ul>
         * <li><strong>1.0</strong>: The Data Synchronization (BDS) service supports version 1.0.</li>
         * <li><strong>1.1</strong>: ApsaraDB for HBase Standard Edition standard instances and ApsaraDB for HBase single-node standard instances support version 1.1.</li>
         * <li><strong>2.0</strong>: ApsaraDB for HBase Standard Edition standard instances, ApsaraDB for HBase Performance-enhanced Edition standard instances, and ApsaraDB for HBase single-node standard instances support version 2.0.</li>
         * </ul>
         * <blockquote>
         * <p>Specify the version number based on the service type of the ApsaraDB for HBase instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The zone. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query available zones.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeAvailableResourceRequest build() {
            return new DescribeAvailableResourceRequest(this);
        } 

    } 

}
