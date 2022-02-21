// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    private Clusters clusters;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusters
     */
    public Clusters getClusters() {
        return this.clusters;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Clusters clusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Clusters.
         */
        public Builder clusters(Clusters clusters) {
            this.clusters = clusters;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    public static class FailReason extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("RequestId")
        private String requestId;

        private FailReason(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailReason create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private String requestId; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public FailReason build() {
                return new FailReason(this);
            } 

        } 

    }
    public static class OrderTaskInfo extends TeaModel {
        @NameInMap("CurrentCount")
        private Integer currentCount;

        @NameInMap("OrderIdList")
        private String orderIdList;

        @NameInMap("TargetCount")
        private Integer targetCount;

        private OrderTaskInfo(Builder builder) {
            this.currentCount = builder.currentCount;
            this.orderIdList = builder.orderIdList;
            this.targetCount = builder.targetCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderTaskInfo create() {
            return builder().build();
        }

        /**
         * @return currentCount
         */
        public Integer getCurrentCount() {
            return this.currentCount;
        }

        /**
         * @return orderIdList
         */
        public String getOrderIdList() {
            return this.orderIdList;
        }

        /**
         * @return targetCount
         */
        public Integer getTargetCount() {
            return this.targetCount;
        }

        public static final class Builder {
            private Integer currentCount; 
            private String orderIdList; 
            private Integer targetCount; 

            /**
             * CurrentCount.
             */
            public Builder currentCount(Integer currentCount) {
                this.currentCount = currentCount;
                return this;
            }

            /**
             * OrderIdList.
             */
            public Builder orderIdList(String orderIdList) {
                this.orderIdList = orderIdList;
                return this;
            }

            /**
             * TargetCount.
             */
            public Builder targetCount(Integer targetCount) {
                this.targetCount = targetCount;
                return this;
            }

            public OrderTaskInfo build() {
                return new OrderTaskInfo(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ClusterInfo extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateResource")
        private String createResource;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DepositType")
        private String depositType;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("FailReason")
        private FailReason failReason;

        @NameInMap("HasUncompletedOrder")
        private Boolean hasUncompletedOrder;

        @NameInMap("Id")
        private String id;

        @NameInMap("K8sClusterId")
        private String k8sClusterId;

        @NameInMap("MachineType")
        private String machineType;

        @NameInMap("MetaStoreType")
        private String metaStoreType;

        @NameInMap("Name")
        private String name;

        @NameInMap("OperationId")
        private Long operationId;

        @NameInMap("OrderList")
        private String orderList;

        @NameInMap("OrderTaskInfo")
        private OrderTaskInfo orderTaskInfo;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("RunningTime")
        private Integer runningTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Type")
        private String type;

        private ClusterInfo(Builder builder) {
            this.chargeType = builder.chargeType;
            this.createResource = builder.createResource;
            this.createTime = builder.createTime;
            this.depositType = builder.depositType;
            this.expiredTime = builder.expiredTime;
            this.failReason = builder.failReason;
            this.hasUncompletedOrder = builder.hasUncompletedOrder;
            this.id = builder.id;
            this.k8sClusterId = builder.k8sClusterId;
            this.machineType = builder.machineType;
            this.metaStoreType = builder.metaStoreType;
            this.name = builder.name;
            this.operationId = builder.operationId;
            this.orderList = builder.orderList;
            this.orderTaskInfo = builder.orderTaskInfo;
            this.period = builder.period;
            this.runningTime = builder.runningTime;
            this.status = builder.status;
            this.tags = builder.tags;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createResource
         */
        public String getCreateResource() {
            return this.createResource;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return depositType
         */
        public String getDepositType() {
            return this.depositType;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return failReason
         */
        public FailReason getFailReason() {
            return this.failReason;
        }

        /**
         * @return hasUncompletedOrder
         */
        public Boolean getHasUncompletedOrder() {
            return this.hasUncompletedOrder;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return k8sClusterId
         */
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return metaStoreType
         */
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operationId
         */
        public Long getOperationId() {
            return this.operationId;
        }

        /**
         * @return orderList
         */
        public String getOrderList() {
            return this.orderList;
        }

        /**
         * @return orderTaskInfo
         */
        public OrderTaskInfo getOrderTaskInfo() {
            return this.orderTaskInfo;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return runningTime
         */
        public Integer getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String chargeType; 
            private String createResource; 
            private Long createTime; 
            private String depositType; 
            private Long expiredTime; 
            private FailReason failReason; 
            private Boolean hasUncompletedOrder; 
            private String id; 
            private String k8sClusterId; 
            private String machineType; 
            private String metaStoreType; 
            private String name; 
            private Long operationId; 
            private String orderList; 
            private OrderTaskInfo orderTaskInfo; 
            private Integer period; 
            private Integer runningTime; 
            private String status; 
            private Tags tags; 
            private String type; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CreateResource.
             */
            public Builder createResource(String createResource) {
                this.createResource = createResource;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DepositType.
             */
            public Builder depositType(String depositType) {
                this.depositType = depositType;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(FailReason failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * HasUncompletedOrder.
             */
            public Builder hasUncompletedOrder(Boolean hasUncompletedOrder) {
                this.hasUncompletedOrder = hasUncompletedOrder;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * K8sClusterId.
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * MetaStoreType.
             */
            public Builder metaStoreType(String metaStoreType) {
                this.metaStoreType = metaStoreType;
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
             * OperationId.
             */
            public Builder operationId(Long operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * OrderList.
             */
            public Builder orderList(String orderList) {
                this.orderList = orderList;
                return this;
            }

            /**
             * OrderTaskInfo.
             */
            public Builder orderTaskInfo(OrderTaskInfo orderTaskInfo) {
                this.orderTaskInfo = orderTaskInfo;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * RunningTime.
             */
            public Builder runningTime(Integer runningTime) {
                this.runningTime = runningTime;
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
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
    public static class Clusters extends TeaModel {
        @NameInMap("ClusterInfo")
        private java.util.List < ClusterInfo> clusterInfo;

        private Clusters(Builder builder) {
            this.clusterInfo = builder.clusterInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterInfo
         */
        public java.util.List < ClusterInfo> getClusterInfo() {
            return this.clusterInfo;
        }

        public static final class Builder {
            private java.util.List < ClusterInfo> clusterInfo; 

            /**
             * ClusterInfo.
             */
            public Builder clusterInfo(java.util.List < ClusterInfo> clusterInfo) {
                this.clusterInfo = clusterInfo;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
