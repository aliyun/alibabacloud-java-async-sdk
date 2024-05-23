// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLindormInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormInstanceListResponseBody</p>
 */
public class GetLindormInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

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

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
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
        private java.util.List < InstanceList> instanceList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * InstanceList.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetLindormInstanceListResponseBody build() {
            return new GetLindormInstanceListResponseBody(this);
        } 

    } 

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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        private java.util.List < Tags> tags;

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
        public java.util.List < Tags> getTags() {
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
            private java.util.List < Tags> tags; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * CreateMilliseconds.
             */
            public Builder createMilliseconds(Long createMilliseconds) {
                this.createMilliseconds = createMilliseconds;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnableColumn.
             */
            public Builder enableColumn(Boolean enableColumn) {
                this.enableColumn = enableColumn;
                return this;
            }

            /**
             * EnableCompute.
             */
            public Builder enableCompute(Boolean enableCompute) {
                this.enableCompute = enableCompute;
                return this;
            }

            /**
             * EnableLts.
             */
            public Builder enableLts(Boolean enableLts) {
                this.enableLts = enableLts;
                return this;
            }

            /**
             * EnableMessage.
             */
            public Builder enableMessage(Boolean enableMessage) {
                this.enableMessage = enableMessage;
                return this;
            }

            /**
             * EnableStream.
             */
            public Builder enableStream(Boolean enableStream) {
                this.enableStream = enableStream;
                return this;
            }

            /**
             * EnableVector.
             */
            public Builder enableVector(Boolean enableVector) {
                this.enableVector = enableVector;
                return this;
            }

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ExpiredMilliseconds.
             */
            public Builder expiredMilliseconds(Long expiredMilliseconds) {
                this.expiredMilliseconds = expiredMilliseconds;
                return this;
            }

            /**
             * InstanceAlias.
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * InstanceStorage.
             */
            public Builder instanceStorage(String instanceStorage) {
                this.instanceStorage = instanceStorage;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
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
