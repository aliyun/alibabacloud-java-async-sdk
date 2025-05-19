// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponseBody</p>
 */
public class ListWorkspacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("workspaces")
    private java.util.List<Workspaces> workspaces;

    private ListWorkspacesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return workspaces
     */
    public java.util.List<Workspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Workspaces> workspaces; 

        private Builder() {
        } 

        private Builder(ListWorkspacesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.workspaces = model.workspaces;
        } 

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The queried workspaces.</p>
         */
        public Builder workspaces(java.util.List<Workspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public ListWorkspacesResponseBody build() {
            return new ListWorkspacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class PrePaidQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allocatedResource")
        private String allocatedResource;

        @com.aliyun.core.annotation.NameInMap("autoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("maxResource")
        private String maxResource;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("paymentStatus")
        private String paymentStatus;

        @com.aliyun.core.annotation.NameInMap("usedResource")
        private String usedResource;

        private PrePaidQuota(Builder builder) {
            this.allocatedResource = builder.allocatedResource;
            this.autoRenewal = builder.autoRenewal;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.maxResource = builder.maxResource;
            this.orderId = builder.orderId;
            this.paymentStatus = builder.paymentStatus;
            this.usedResource = builder.usedResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrePaidQuota create() {
            return builder().build();
        }

        /**
         * @return allocatedResource
         */
        public String getAllocatedResource() {
            return this.allocatedResource;
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxResource
         */
        public String getMaxResource() {
            return this.maxResource;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return paymentStatus
         */
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        /**
         * @return usedResource
         */
        public String getUsedResource() {
            return this.usedResource;
        }

        public static final class Builder {
            private String allocatedResource; 
            private Boolean autoRenewal; 
            private Long createTime; 
            private Long expireTime; 
            private String instanceId; 
            private String maxResource; 
            private String orderId; 
            private String paymentStatus; 
            private String usedResource; 

            private Builder() {
            } 

            private Builder(PrePaidQuota model) {
                this.allocatedResource = model.allocatedResource;
                this.autoRenewal = model.autoRenewal;
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.maxResource = model.maxResource;
                this.orderId = model.orderId;
                this.paymentStatus = model.paymentStatus;
                this.usedResource = model.usedResource;
            } 

            /**
             * <p>The amount of resources that are allocated by a subscription quota.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;:&quot;1&quot;,&quot;memory&quot;:&quot;4Gi&quot;,&quot;cu&quot;:&quot;1&quot;}</p>
             */
            public Builder allocatedResource(String allocatedResource) {
                this.allocatedResource = allocatedResource;
                return this;
            }

            /**
             * <p>Indicates whether auto-renewal is enabled for the subscription quota.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * <p>The creation time of the subscription quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1745683200000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The expiration time of the subscription quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1740537153000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the instance that is generated when you purchase the subscription quota.</p>
             * 
             * <strong>example:</strong>
             * <p>i-abc12345</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum amount of resources that can be used in a subscription quota.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;:&quot;1&quot;,&quot;memory&quot;:&quot;4Gi&quot;,&quot;cu&quot;:&quot;1&quot;}</p>
             */
            public Builder maxResource(String maxResource) {
                this.maxResource = maxResource;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The status of the subscription quota. Valid values:</p>
             * <ul>
             * <li>NORMAL</li>
             * <li>WAIT_FOR_EXPIRE</li>
             * <li>EXPIRED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder paymentStatus(String paymentStatus) {
                this.paymentStatus = paymentStatus;
                return this;
            }

            /**
             * <p>The amount of resources that are used.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cpu&quot;:&quot;0&quot;,&quot;memory&quot;:&quot;0Gi&quot;,&quot;cu&quot;:&quot;0&quot;}</p>
             */
            public Builder usedResource(String usedResource) {
                this.usedResource = usedResource;
                return this;
            }

            public PrePaidQuota build() {
                return new PrePaidQuota(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class StateChangeReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private StateChangeReason(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateChangeReason create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(StateChangeReason model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public StateChangeReason build() {
                return new StateChangeReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkspacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkspacesResponseBody</p>
     */
    public static class Workspaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("autoRenewPeriod")
        private Integer autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("autoRenewPeriodUnit")
        private String autoRenewPeriodUnit;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("dlfCatalogId")
        private String dlfCatalogId;

        @com.aliyun.core.annotation.NameInMap("dlfType")
        private String dlfType;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("failReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("paymentDurationUnit")
        private String paymentDurationUnit;

        @com.aliyun.core.annotation.NameInMap("paymentStatus")
        private String paymentStatus;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("prePaidQuota")
        private PrePaidQuota prePaidQuota;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("releaseType")
        private String releaseType;

        @com.aliyun.core.annotation.NameInMap("resourceSpec")
        private String resourceSpec;

        @com.aliyun.core.annotation.NameInMap("stateChangeReason")
        private StateChangeReason stateChangeReason;

        @com.aliyun.core.annotation.NameInMap("storage")
        private String storage;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("workspaceName")
        private String workspaceName;

        @com.aliyun.core.annotation.NameInMap("workspaceStatus")
        private String workspaceStatus;

        private Workspaces(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.autoRenewPeriodUnit = builder.autoRenewPeriodUnit;
            this.createTime = builder.createTime;
            this.dlfCatalogId = builder.dlfCatalogId;
            this.dlfType = builder.dlfType;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.failReason = builder.failReason;
            this.paymentDurationUnit = builder.paymentDurationUnit;
            this.paymentStatus = builder.paymentStatus;
            this.paymentType = builder.paymentType;
            this.prePaidQuota = builder.prePaidQuota;
            this.regionId = builder.regionId;
            this.releaseType = builder.releaseType;
            this.resourceSpec = builder.resourceSpec;
            this.stateChangeReason = builder.stateChangeReason;
            this.storage = builder.storage;
            this.tags = builder.tags;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
            this.workspaceStatus = builder.workspaceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workspaces create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return autoRenewPeriodUnit
         */
        public String getAutoRenewPeriodUnit() {
            return this.autoRenewPeriodUnit;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dlfCatalogId
         */
        public String getDlfCatalogId() {
            return this.dlfCatalogId;
        }

        /**
         * @return dlfType
         */
        public String getDlfType() {
            return this.dlfType;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return paymentDurationUnit
         */
        public String getPaymentDurationUnit() {
            return this.paymentDurationUnit;
        }

        /**
         * @return paymentStatus
         */
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return prePaidQuota
         */
        public PrePaidQuota getPrePaidQuota() {
            return this.prePaidQuota;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseType
         */
        public String getReleaseType() {
            return this.releaseType;
        }

        /**
         * @return resourceSpec
         */
        public String getResourceSpec() {
            return this.resourceSpec;
        }

        /**
         * @return stateChangeReason
         */
        public StateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        /**
         * @return storage
         */
        public String getStorage() {
            return this.storage;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        /**
         * @return workspaceStatus
         */
        public String getWorkspaceStatus() {
            return this.workspaceStatus;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Integer autoRenewPeriod; 
            private String autoRenewPeriodUnit; 
            private Long createTime; 
            private String dlfCatalogId; 
            private String dlfType; 
            private Integer duration; 
            private Long endTime; 
            private String failReason; 
            private String paymentDurationUnit; 
            private String paymentStatus; 
            private String paymentType; 
            private PrePaidQuota prePaidQuota; 
            private String regionId; 
            private String releaseType; 
            private String resourceSpec; 
            private StateChangeReason stateChangeReason; 
            private String storage; 
            private java.util.List<Tags> tags; 
            private String workspaceId; 
            private String workspaceName; 
            private String workspaceStatus; 

            private Builder() {
            } 

            private Builder(Workspaces model) {
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.autoRenewPeriodUnit = model.autoRenewPeriodUnit;
                this.createTime = model.createTime;
                this.dlfCatalogId = model.dlfCatalogId;
                this.dlfType = model.dlfType;
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.failReason = model.failReason;
                this.paymentDurationUnit = model.paymentDurationUnit;
                this.paymentStatus = model.paymentStatus;
                this.paymentType = model.paymentType;
                this.prePaidQuota = model.prePaidQuota;
                this.regionId = model.regionId;
                this.releaseType = model.releaseType;
                this.resourceSpec = model.resourceSpec;
                this.stateChangeReason = model.stateChangeReason;
                this.storage = model.storage;
                this.tags = model.tags;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
                this.workspaceStatus = model.workspaceStatus;
            } 

            /**
             * <p>Specifies whether to enable auto-renewal. This parameter is required only if the paymentType parameter is set to Pre.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The auto-renewal duration. This parameter is required only if the paymentType parameter is set to Pre.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>The unit of the auto-renewal duration. This parameter is required only if the paymentType parameter is set to Pre.</p>
             * 
             * <strong>example:</strong>
             * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
             */
            public Builder autoRenewPeriodUnit(String autoRenewPeriodUnit) {
                this.autoRenewPeriodUnit = autoRenewPeriodUnit;
                return this;
            }

            /**
             * <p>The time when the workflow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1684115879955</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The information of the Data Lake Formation (DLF) catalog.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder dlfCatalogId(String dlfCatalogId) {
                this.dlfCatalogId = dlfCatalogId;
                return this;
            }

            /**
             * <p>The version of DLF.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder dlfType(String dlfType) {
                this.dlfType = dlfType;
                return this;
            }

            /**
             * <p>The subscription period. This parameter is required only if the paymentType parameter is set to Pre.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The end of the end time range.</p>
             * 
             * <strong>example:</strong>
             * <p>1687103999999</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The failure reason.</p>
             * 
             * <strong>example:</strong>
             * <p>out of stock</p>
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * <p>The unit of the subscription duration.</p>
             * 
             * <strong>example:</strong>
             * <p>YEAR, MONTH, WEEK, DAY, HOUR, MINUTE</p>
             */
            public Builder paymentDurationUnit(String paymentDurationUnit) {
                this.paymentDurationUnit = paymentDurationUnit;
                return this;
            }

            /**
             * <p>The status of the payment.</p>
             * 
             * <strong>example:</strong>
             * <p>PAID/UNPAID</p>
             */
            public Builder paymentStatus(String paymentStatus) {
                this.paymentStatus = paymentStatus;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>PayAsYouGo</li>
             * <li>Pre</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The information about the subscription quota.</p>
             */
            public Builder prePaidQuota(PrePaidQuota prePaidQuota) {
                this.prePaidQuota = prePaidQuota;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The reason why the workspace is released.</p>
             * 
             * <strong>example:</strong>
             * <p>SERVICE_RELEASE</p>
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * <p>The resource specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>100cu</p>
             */
            public Builder resourceSpec(String resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * <p>The reason of the job status change.</p>
             */
            public Builder stateChangeReason(StateChangeReason stateChangeReason) {
                this.stateChangeReason = stateChangeReason;
                return this;
            }

            /**
             * <p>The OSS path.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-result</p>
             */
            public Builder storage(String storage) {
                this.storage = storage;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>w-******</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>spark-1</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            /**
             * <p>The workspace status.</p>
             * 
             * <strong>example:</strong>
             * <p>STARTING,RUNNING,TERMINATED</p>
             */
            public Builder workspaceStatus(String workspaceStatus) {
                this.workspaceStatus = workspaceStatus;
                return this;
            }

            public Workspaces build() {
                return new Workspaces(this);
            } 

        } 

    }
}
