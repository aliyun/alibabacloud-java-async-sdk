// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActivationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActivationsResponseBody</p>
 */
public class DescribeActivationsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("ActivationList")
    private java.util.List < ActivationList> activationList;

    private DescribeActivationsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.activationList = builder.activationList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActivationsResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return activationList
     */
    public java.util.List < ActivationList> getActivationList() {
        return this.activationList;
    }

    public static final class Builder {
        private Long pageSize; 
        private String requestId; 
        private Long pageNumber; 
        private Long totalCount; 
        private java.util.List < ActivationList> activationList; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The current page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of records that meet the query criteria.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of activation codes and usage information.
         */
        public Builder activationList(java.util.List < ActivationList> activationList) {
            this.activationList = activationList;
            return this;
        }

        public DescribeActivationsResponseBody build() {
            return new DescribeActivationsResponseBody(this);
        } 

    } 

    public static class ActivationList extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeregisteredCount")
        private Integer deregisteredCount;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("Description")
        private String description;

        @NameInMap("RegisteredCount")
        private Integer registeredCount;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("IpAddressRange")
        private String ipAddressRange;

        @NameInMap("TimeToLiveInHours")
        private Long timeToLiveInHours;

        @NameInMap("ActivationId")
        private String activationId;

        private ActivationList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.deregisteredCount = builder.deregisteredCount;
            this.instanceCount = builder.instanceCount;
            this.description = builder.description;
            this.registeredCount = builder.registeredCount;
            this.instanceName = builder.instanceName;
            this.disabled = builder.disabled;
            this.ipAddressRange = builder.ipAddressRange;
            this.timeToLiveInHours = builder.timeToLiveInHours;
            this.activationId = builder.activationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivationList create() {
            return builder().build();
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
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return registeredCount
         */
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return ipAddressRange
         */
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        /**
         * @return timeToLiveInHours
         */
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        /**
         * @return activationId
         */
        public String getActivationId() {
            return this.activationId;
        }

        public static final class Builder {
            private String creationTime; 
            private Integer deregisteredCount; 
            private Integer instanceCount; 
            private String description; 
            private Integer registeredCount; 
            private String instanceName; 
            private Boolean disabled; 
            private String ipAddressRange; 
            private Long timeToLiveInHours; 
            private String activationId; 

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The number of canceled instances.
             */
            public Builder deregisteredCount(Integer deregisteredCount) {
                this.deregisteredCount = deregisteredCount;
                return this;
            }

            /**
             * The maximum number of times an activation code is used to register a managed instance.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The description of the activation code.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The number of registered instances.
             */
            public Builder registeredCount(Integer registeredCount) {
                this.registeredCount = registeredCount;
                return this;
            }

            /**
             * The default instance name prefix.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Indicates whether the activation code is disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * The IP address of the host that allows the activation code.
             */
            public Builder ipAddressRange(String ipAddressRange) {
                this.ipAddressRange = ipAddressRange;
                return this;
            }

            /**
             * The validity period of the activation code. Unit: Hour.
             */
            public Builder timeToLiveInHours(Long timeToLiveInHours) {
                this.timeToLiveInHours = timeToLiveInHours;
                return this;
            }

            /**
             * The ID of the activation code.
             */
            public Builder activationId(String activationId) {
                this.activationId = activationId;
                return this;
            }

            public ActivationList build() {
                return new ActivationList(this);
            } 

        } 

    }
}
