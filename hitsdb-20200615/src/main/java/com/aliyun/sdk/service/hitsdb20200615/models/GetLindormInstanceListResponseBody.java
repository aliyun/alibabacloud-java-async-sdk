// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLindormInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormInstanceListResponseBody</p>
 */
public class GetLindormInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetLindormInstanceListResponseBody(Builder builder) {
        this.instanceList = builder.instanceList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormInstanceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceList
     */
    public java.util.List<InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<InstanceList> instanceList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(GetLindormInstanceListResponseBody model) {
            this.instanceList = model.instanceList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The instances.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of instances that are returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CA1FAFD-E8DC-51C2-AA7E-CA6E2D049BA0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetLindormInstanceListResponseBody build() {
            return new GetLindormInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormInstanceListResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.18</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLindormInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormInstanceListResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CreateMilliseconds")
        private Long createMilliseconds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnableColumn")
        private Boolean enableColumn;

        @com.aliyun.core.annotation.NameInMap("EnableCompute")
        private Boolean enableCompute;

        @com.aliyun.core.annotation.NameInMap("EnableLts")
        private Boolean enableLts;

        @com.aliyun.core.annotation.NameInMap("EnableMessage")
        private Boolean enableMessage;

        @com.aliyun.core.annotation.NameInMap("EnableRow")
        private Boolean enableRow;

        @com.aliyun.core.annotation.NameInMap("EnableStream")
        private Boolean enableStream;

        @com.aliyun.core.annotation.NameInMap("EnableVector")
        private Boolean enableVector;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ExpiredMilliseconds")
        private Long expiredMilliseconds;

        @com.aliyun.core.annotation.NameInMap("InstanceAlias")
        private String instanceAlias;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceStorage")
        private String instanceStorage;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private InstanceList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.createMilliseconds = builder.createMilliseconds;
            this.createTime = builder.createTime;
            this.enableColumn = builder.enableColumn;
            this.enableCompute = builder.enableCompute;
            this.enableLts = builder.enableLts;
            this.enableMessage = builder.enableMessage;
            this.enableRow = builder.enableRow;
            this.enableStream = builder.enableStream;
            this.enableVector = builder.enableVector;
            this.engineType = builder.engineType;
            this.expireTime = builder.expireTime;
            this.expiredMilliseconds = builder.expiredMilliseconds;
            this.instanceAlias = builder.instanceAlias;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.instanceStorage = builder.instanceStorage;
            this.networkType = builder.networkType;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceType = builder.serviceType;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return createMilliseconds
         */
        public Long getCreateMilliseconds() {
            return this.createMilliseconds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableColumn
         */
        public Boolean getEnableColumn() {
            return this.enableColumn;
        }

        /**
         * @return enableCompute
         */
        public Boolean getEnableCompute() {
            return this.enableCompute;
        }

        /**
         * @return enableLts
         */
        public Boolean getEnableLts() {
            return this.enableLts;
        }

        /**
         * @return enableMessage
         */
        public Boolean getEnableMessage() {
            return this.enableMessage;
        }

        /**
         * @return enableRow
         */
        public Boolean getEnableRow() {
            return this.enableRow;
        }

        /**
         * @return enableStream
         */
        public Boolean getEnableStream() {
            return this.enableStream;
        }

        /**
         * @return enableVector
         */
        public Boolean getEnableVector() {
            return this.enableVector;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expiredMilliseconds
         */
        public Long getExpiredMilliseconds() {
            return this.expiredMilliseconds;
        }

        /**
         * @return instanceAlias
         */
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceStorage
         */
        public String getInstanceStorage() {
            return this.instanceStorage;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long createMilliseconds; 
            private String createTime; 
            private Boolean enableColumn; 
            private Boolean enableCompute; 
            private Boolean enableLts; 
            private Boolean enableMessage; 
            private Boolean enableRow; 
            private Boolean enableStream; 
            private Boolean enableVector; 
            private String engineType; 
            private String expireTime; 
            private Long expiredMilliseconds; 
            private String instanceAlias; 
            private String instanceId; 
            private String instanceStatus; 
            private String instanceStorage; 
            private String networkType; 
            private String payType; 
            private String regionId; 
            private String resourceGroupId; 
            private String serviceType; 
            private java.util.List<Tags> tags; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.aliUid = model.aliUid;
                this.createMilliseconds = model.createMilliseconds;
                this.createTime = model.createTime;
                this.enableColumn = model.enableColumn;
                this.enableCompute = model.enableCompute;
                this.enableLts = model.enableLts;
                this.enableMessage = model.enableMessage;
                this.enableRow = model.enableRow;
                this.enableStream = model.enableStream;
                this.enableVector = model.enableVector;
                this.engineType = model.engineType;
                this.expireTime = model.expireTime;
                this.expiredMilliseconds = model.expiredMilliseconds;
                this.instanceAlias = model.instanceAlias;
                this.instanceId = model.instanceId;
                this.instanceStatus = model.instanceStatus;
                this.instanceStorage = model.instanceStorage;
                this.networkType = model.networkType;
                this.payType = model.payType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceType = model.serviceType;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The 16-digit AliUid of the Alibaba Cloud account that owns the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>164901546557****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The time when the instance is created. This value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1631772842000</p>
             */
            public Builder createMilliseconds(Long createMilliseconds) {
                this.createMilliseconds = createMilliseconds;
                return this;
            }

            /**
             * <p>The time when the instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-16 14:13:13</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the column storage engine is enabled, returning:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled. - <strong>false</strong>: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableColumn(Boolean enableColumn) {
                this.enableColumn = enableColumn;
                return this;
            }

            /**
             * <p>Indicates whether LDPS is activated for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: LDPS is activated for the instance.</li>
             * <li><strong>false</strong>: LDPS is not activated for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableCompute(Boolean enableCompute) {
                this.enableCompute = enableCompute;
                return this;
            }

            /**
             * <p>Indicates whether the LTS engine is enabled, returning:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled. - <strong>false</strong>: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableLts(Boolean enableLts) {
                this.enableLts = enableLts;
                return this;
            }

            /**
             * <p>Indicates whether the message engine is enabled, returning:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled. - <strong>false</strong>: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableMessage(Boolean enableMessage) {
                this.enableMessage = enableMessage;
                return this;
            }

            /**
             * <p>Indicates whether the table 3.0 storage engine is enabled, returning:</p>
             * <p>true: Enabled. - false: Not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableRow(Boolean enableRow) {
                this.enableRow = enableRow;
                return this;
            }

            /**
             * <p>Indicates whether the Lindorm streaming engine is activated for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The Lindorm streaming engine is activated for the instance.</li>
             * <li><strong>false</strong>: The Lindorm streaming engine is not activated for the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableStream(Boolean enableStream) {
                this.enableStream = enableStream;
                return this;
            }

            /**
             * <p>Whether the vector engine is enabled, returns:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled. - <strong>false</strong>: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableVector(Boolean enableVector) {
                this.enableVector = enableVector;
                return this;
            }

            /**
             * <p>The engine supported by the instance. The engines are indicated by different numbers:</p>
             * <ul>
             * <li><strong>1</strong>: LindormSearch.</li>
             * <li><strong>2</strong>: LindormTSDB.</li>
             * <li><strong>4</strong>: LindormTable.</li>
             * <li><strong>8</strong>: LindormDFS.</li>
             * </ul>
             * <blockquote>
             * <p>The value of this parameter is the sum of all numbers that indicate the engines supported by the instance. For example, if the value of this parameter is 15, which is the sum of 1, 2, 4, and 8, the instance supports all four engines. If the value of this parameter is 6, which is the sum of 2 and 4, the instance supports LindormTSDB and LindormTable.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>The time when the instance expires.</p>
             * <blockquote>
             * <p>This parameter is returned only if the billing method of the instance is subscription.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-04-26 00:00:00</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the instance expires. This value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1650902400000</p>
             */
            public Builder expiredMilliseconds(Long expiredMilliseconds) {
                this.expiredMilliseconds = expiredMilliseconds;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>ld-bp17pwu1541ia****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>CREATING</strong>: The instance is being created.</li>
             * <li><strong>ACTIVATION</strong>: The instance is running.</li>
             * <li><strong>COLD_EXPANDING</strong>: The Capacity storage of the instance is being scaled up.</li>
             * <li><strong>MINOR_VERSION_TRANSING</strong>: The minor version of the instance is being updated.</li>
             * <li><strong>RESIZING</strong>: The nodes in the instance are being scaled up.</li>
             * <li><strong>SHRINKING</strong>: The nodes in the instance are being scaled down.</li>
             * <li><strong>CLASS_CHANGING</strong>: The specification of the instance is being changed.</li>
             * <li><strong>SSL_SWITCHING: SSL</strong>: The SSL configurations of the instance are being changed.</li>
             * <li><strong>CDC_OPENING</strong>: Data subscription is being enabled for the instance.</li>
             * <li><strong>TRANSFER</strong>: The data of the instance is being transferred.</li>
             * <li><strong>DATABASE_TRANSFER</strong>: The data of the instance is being transferred to databases.</li>
             * <li><strong>GUARD_CREATING</strong>: A disaster recovery instance is being created.</li>
             * <li><strong>BACKUP_RECOVERING</strong>: The data of the instance is being restored from a backup.</li>
             * <li><strong>DATABASE_IMPORTING</strong>: Data is being imported to the instance.</li>
             * <li><strong>NET_MODIFYING</strong>: The network configurations of the instance are being changed.</li>
             * <li><strong>NET_SWITCHING</strong>: The network of the instance is being switched between a virtual private cloud (VPC) and the Internet.</li>
             * <li><strong>NET_CREATING</strong>: The connection to the instance is being created.</li>
             * <li><strong>NET_DELETING</strong>: The connection to the instance is being deleted.</li>
             * <li><strong>DELETING</strong>: The instance is being deleted.</li>
             * <li><strong>RESTARTING</strong>: The instance is restarting.</li>
             * <li><strong>LOCKED</strong>: The instance is locked because it expires.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATION</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The storage capacity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>960</p>
             */
            public Builder instanceStorage(String instanceStorage) {
                this.instanceStorage = instanceStorage;
                return this;
            }

            /**
             * <p>The network type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PREPAY</strong>: subscription.</li>
             * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzledqeat****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The series of the instance. Valid values:</p>
             * <ul>
             * <li><strong>lindorm</strong>: The instance is a Lindorm instance.</li>
             * <li><strong>serverless_lindorm</strong>: The instance is a Lindorm Serverless instance.</li>
             * <li><strong>lindorm_standalone</strong>: The instance is a single-node Lindorm instance.</li>
             * <li><strong>lts</strong>: The instance is an LTS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lindorm</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The list of tags associated with the specified instances.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC in which the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1n3i15v90el48nx****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
