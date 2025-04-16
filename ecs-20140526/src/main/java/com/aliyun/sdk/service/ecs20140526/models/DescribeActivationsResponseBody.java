// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeActivationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActivationsResponseBody</p>
 */
public class DescribeActivationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivationList")
    private java.util.List<ActivationList> activationList;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeActivationsResponseBody(Builder builder) {
        this.activationList = builder.activationList;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActivationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activationList
     */
    public java.util.List<ActivationList> getActivationList() {
        return this.activationList;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ActivationList> activationList; 
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeActivationsResponseBody model) {
            this.activationList = model.activationList;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The activation codes and their usage information.</p>
         */
        public Builder activationList(java.util.List<ActivationList> activationList) {
            this.activationList = activationList;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4ECEEE12-56F1-4FBC-9AB1-890F74625134</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeActivationsResponseBody build() {
            return new DescribeActivationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeActivationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeActivationsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>The tag key of the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
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
     * {@link DescribeActivationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeActivationsResponseBody</p>
     */
    public static class ActivationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivationId")
        private String activationId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeregisteredCount")
        private Integer deregisteredCount;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IpAddressRange")
        private String ipAddressRange;

        @com.aliyun.core.annotation.NameInMap("RegisteredCount")
        private Integer registeredCount;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TimeToLiveInHours")
        private Long timeToLiveInHours;

        private ActivationList(Builder builder) {
            this.activationId = builder.activationId;
            this.creationTime = builder.creationTime;
            this.deregisteredCount = builder.deregisteredCount;
            this.description = builder.description;
            this.disabled = builder.disabled;
            this.instanceCount = builder.instanceCount;
            this.instanceName = builder.instanceName;
            this.ipAddressRange = builder.ipAddressRange;
            this.registeredCount = builder.registeredCount;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.timeToLiveInHours = builder.timeToLiveInHours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivationList create() {
            return builder().build();
        }

        /**
         * @return activationId
         */
        public String getActivationId() {
            return this.activationId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deregisteredCount
         */
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return ipAddressRange
         */
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        /**
         * @return registeredCount
         */
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return timeToLiveInHours
         */
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        public static final class Builder {
            private String activationId; 
            private String creationTime; 
            private Integer deregisteredCount; 
            private String description; 
            private Boolean disabled; 
            private Integer instanceCount; 
            private String instanceName; 
            private String ipAddressRange; 
            private Integer registeredCount; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 
            private Long timeToLiveInHours; 

            private Builder() {
            } 

            private Builder(ActivationList model) {
                this.activationId = model.activationId;
                this.creationTime = model.creationTime;
                this.deregisteredCount = model.deregisteredCount;
                this.description = model.description;
                this.disabled = model.disabled;
                this.instanceCount = model.instanceCount;
                this.instanceName = model.instanceName;
                this.ipAddressRange = model.ipAddressRange;
                this.registeredCount = model.registeredCount;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
                this.timeToLiveInHours = model.timeToLiveInHours;
            } 

            /**
             * <p>The ID of the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>4ECEEE12-56F1-4FBC-9AB1-890F1234****</p>
             */
            public Builder activationId(String activationId) {
                this.activationId = activationId;
                return this;
            }

            /**
             * <p>The time when the activation code was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-20T06:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The number of instances that were deregistered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deregisteredCount(Integer deregisteredCount) {
                this.deregisteredCount = deregisteredCount;
                return this;
            }

            /**
             * <p>The description of the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the activation code is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The maximum number of times that the activation code can be used to register managed instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The default instance name prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>test-InstanceName</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The IP addresses of hosts that are allowed to use the activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder ipAddressRange(String ipAddressRange) {
                this.ipAddressRange = ipAddressRange;
                return this;
            }

            /**
             * <p>The number of instances that were registered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder registeredCount(Integer registeredCount) {
                this.registeredCount = registeredCount;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the activation code belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-123******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags of the activation code.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The validity period of the activation code. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder timeToLiveInHours(Long timeToLiveInHours) {
                this.timeToLiveInHours = timeToLiveInHours;
                return this;
            }

            public ActivationList build() {
                return new ActivationList(this);
            } 

        } 

    }
}
