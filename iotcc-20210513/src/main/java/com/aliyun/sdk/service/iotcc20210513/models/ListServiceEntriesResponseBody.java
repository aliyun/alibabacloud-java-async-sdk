// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceEntriesResponseBody</p>
 */
public class ListServiceEntriesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceEntries")
    private java.util.List < ServiceEntries> serviceEntries;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListServiceEntriesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceEntries = builder.serviceEntries;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceEntriesResponseBody create() {
        return builder().build();
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
     * @return serviceEntries
     */
    public java.util.List < ServiceEntries> getServiceEntries() {
        return this.serviceEntries;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ServiceEntries> serviceEntries; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * ServiceEntries.
         */
        public Builder serviceEntries(java.util.List < ServiceEntries> serviceEntries) {
            this.serviceEntries = serviceEntries;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceEntriesResponseBody build() {
            return new ListServiceEntriesResponseBody(this);
        } 

    } 

    public static class ServiceEntries extends TeaModel {
        @NameInMap("ServiceEntryDescription")
        private String serviceEntryDescription;

        @NameInMap("ServiceEntryId")
        private String serviceEntryId;

        @NameInMap("ServiceEntryName")
        private String serviceEntryName;

        @NameInMap("ServiceEntryStatus")
        private String serviceEntryStatus;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        private ServiceEntries(Builder builder) {
            this.serviceEntryDescription = builder.serviceEntryDescription;
            this.serviceEntryId = builder.serviceEntryId;
            this.serviceEntryName = builder.serviceEntryName;
            this.serviceEntryStatus = builder.serviceEntryStatus;
            this.serviceId = builder.serviceId;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceEntries create() {
            return builder().build();
        }

        /**
         * @return serviceEntryDescription
         */
        public String getServiceEntryDescription() {
            return this.serviceEntryDescription;
        }

        /**
         * @return serviceEntryId
         */
        public String getServiceEntryId() {
            return this.serviceEntryId;
        }

        /**
         * @return serviceEntryName
         */
        public String getServiceEntryName() {
            return this.serviceEntryName;
        }

        /**
         * @return serviceEntryStatus
         */
        public String getServiceEntryStatus() {
            return this.serviceEntryStatus;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String serviceEntryDescription; 
            private String serviceEntryId; 
            private String serviceEntryName; 
            private String serviceEntryStatus; 
            private String serviceId; 
            private String target; 
            private String targetType; 

            /**
             * ServiceEntryDescription.
             */
            public Builder serviceEntryDescription(String serviceEntryDescription) {
                this.serviceEntryDescription = serviceEntryDescription;
                return this;
            }

            /**
             * ServiceEntryId.
             */
            public Builder serviceEntryId(String serviceEntryId) {
                this.serviceEntryId = serviceEntryId;
                return this;
            }

            /**
             * ServiceEntryName.
             */
            public Builder serviceEntryName(String serviceEntryName) {
                this.serviceEntryName = serviceEntryName;
                return this;
            }

            /**
             * ServiceEntryStatus.
             */
            public Builder serviceEntryStatus(String serviceEntryStatus) {
                this.serviceEntryStatus = serviceEntryStatus;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public ServiceEntries build() {
                return new ServiceEntries(this);
            } 

        } 

    }
}
