// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKVCacheInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKVCacheInstanceAttributeResponseBody</p>
 */
public class DescribeKVCacheInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private String expired;

    @com.aliyun.core.annotation.NameInMap("KVCacheInstanceId")
    private String KVCacheInstanceId;

    @com.aliyun.core.annotation.NameInMap("KVCacheInstanceStatus")
    private String KVCacheInstanceStatus;

    @com.aliyun.core.annotation.NameInMap("KVCacheSpace")
    private String KVCacheSpace;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeKVCacheInstanceAttributeResponseBody(Builder builder) {
        this.connectionString = builder.connectionString;
        this.creationTime = builder.creationTime;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.KVCacheInstanceId = builder.KVCacheInstanceId;
        this.KVCacheInstanceStatus = builder.KVCacheInstanceStatus;
        this.KVCacheSpace = builder.KVCacheSpace;
        this.payType = builder.payType;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKVCacheInstanceAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expired
     */
    public String getExpired() {
        return this.expired;
    }

    /**
     * @return KVCacheInstanceId
     */
    public String getKVCacheInstanceId() {
        return this.KVCacheInstanceId;
    }

    /**
     * @return KVCacheInstanceStatus
     */
    public String getKVCacheInstanceStatus() {
        return this.KVCacheInstanceStatus;
    }

    /**
     * @return KVCacheSpace
     */
    public String getKVCacheSpace() {
        return this.KVCacheSpace;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String connectionString; 
        private String creationTime; 
        private String expireTime; 
        private String expired; 
        private String KVCacheInstanceId; 
        private String KVCacheInstanceStatus; 
        private String KVCacheSpace; 
        private String payType; 
        private String port; 
        private String regionId; 
        private String requestId; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribeKVCacheInstanceAttributeResponseBody model) {
            this.connectionString = model.connectionString;
            this.creationTime = model.creationTime;
            this.expireTime = model.expireTime;
            this.expired = model.expired;
            this.KVCacheInstanceId = model.KVCacheInstanceId;
            this.KVCacheInstanceStatus = model.KVCacheInstanceStatus;
            this.KVCacheSpace = model.KVCacheSpace;
            this.payType = model.payType;
            this.port = model.port;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.0.1</p>
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The time when the instance was created, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The time when the instance expires, in ISO 8601 format. An empty character string is returned for pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T00:00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Indicates whether the instance has expired.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder expired(String expired) {
            this.expired = expired;
            return this;
        }

        /**
         * <p>The KVCache instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pkv-123456</p>
         */
        public Builder KVCacheInstanceId(String KVCacheInstanceId) {
            this.KVCacheInstanceId = KVCacheInstanceId;
            return this;
        }

        /**
         * <p>The KVCache instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder KVCacheInstanceStatus(String KVCacheInstanceStatus) {
            this.KVCacheInstanceStatus = KVCacheInstanceStatus;
            return this;
        }

        /**
         * <p>The storage capacity of the KVCache instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder KVCacheSpace(String KVCacheSpace) {
            this.KVCacheSpace = KVCacheSpace;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAID</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-123</p>
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-123</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeKVCacheInstanceAttributeResponseBody build() {
            return new DescribeKVCacheInstanceAttributeResponseBody(this);
        } 

    } 

}
